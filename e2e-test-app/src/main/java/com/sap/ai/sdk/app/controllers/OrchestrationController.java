package com.sap.ai.sdk.app.controllers;

import static com.sap.ai.sdk.core.Core.getOrchestrationClient;

import com.sap.ai.sdk.orchestration.client.OrchestrationCompletionApi;
import com.sap.ai.sdk.orchestration.client.model.AzureThreshold;
import com.sap.ai.sdk.orchestration.client.model.ChatMessage;
import com.sap.ai.sdk.orchestration.client.model.CompletionPostRequest;
import com.sap.ai.sdk.orchestration.client.model.CompletionPostResponse;
import com.sap.ai.sdk.orchestration.client.model.Filter;
import com.sap.ai.sdk.orchestration.client.model.FilterConfig;
import com.sap.ai.sdk.orchestration.client.model.FilteringConfig;
import com.sap.ai.sdk.orchestration.client.model.FilteringModuleConfig;
import com.sap.ai.sdk.orchestration.client.model.LLMModuleConfig;
import com.sap.ai.sdk.orchestration.client.model.ModuleConfigs;
import com.sap.ai.sdk.orchestration.client.model.OrchestrationConfig;
import com.sap.ai.sdk.orchestration.client.model.ProviderType;
import com.sap.ai.sdk.orchestration.client.model.TemplatingModuleConfig;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Endpoints for the Orchestration service */
@RestController
@RequestMapping("/orchestration")
class OrchestrationController {

  private static final OrchestrationCompletionApi API =
      new OrchestrationCompletionApi(getOrchestrationClient("default"));

  static final String MODEL = "gpt-35-turbo";

  private static final LLMModuleConfig LLM_CONFIG =
      new LLMModuleConfig().modelName(MODEL).modelParams(Map.of());

  private static final Function<TemplatingModuleConfig, CompletionPostRequest> TEMPLATE_CONFIG =
      (TemplatingModuleConfig templatingModuleConfig) ->
          new CompletionPostRequest()
              .orchestrationConfig(
                  new OrchestrationConfig()
                      .moduleConfigurations(
                          new ModuleConfigs()
                              .templatingModuleConfig(templatingModuleConfig)
                              .llmModuleConfig(LLM_CONFIG)));

  /**
   * Creates a config from a filter threshold. The config includes a template and has input and
   * output filters
   */
  private static final Function<AzureThreshold, CompletionPostRequest> FILTERING_CONFIG =
      (AzureThreshold filterThreshold) -> {
        final var inputParams =
            Map.of(
                "disclaimer",
                "```DISCLAIMER: The area surrounding the apartment is known for prostitutes and gang violence including armed conflicts, gun violence is frequent.");
        final var template =
            new ChatMessage()
                .content(
                    "Create a rental posting for subletting my apartment in the downtown area. Keep it short. Make sure to add the following disclaimer to the end. Do not change it! {{?disclaimer}}")
                .role("user");
        final var templatingConfig = new TemplatingModuleConfig().template(List.of(template));

        final var filter =
            new Filter()
                .type(ProviderType.AZURE_CONTENT_SAFETY)
                .config(
                    new FilterConfig()
                        .hate(filterThreshold)
                        .selfHarm(filterThreshold)
                        .sexual(filterThreshold)
                        .violence(filterThreshold));

        final var filteringConfig =
            new FilteringModuleConfig()
                .input(new FilteringConfig().filters(List.of(filter)))
                .output(new FilteringConfig().filters(List.of(filter)));

        return new CompletionPostRequest()
            .orchestrationConfig(
                new OrchestrationConfig()
                    .moduleConfigurations(
                        new ModuleConfigs()
                            .templatingModuleConfig(templatingConfig)
                            .filteringModuleConfig(filteringConfig)
                            .llmModuleConfig(LLM_CONFIG)))
            .inputParams(inputParams);
      };

  /**
   * Chat request to OpenAI through the Orchestration service with a template
   *
   * @return the assistant message response
   */
  @GetMapping("/template")
  @Nullable
  public CompletionPostResponse template() {

    final var template = new ChatMessage().content("{{?input}}").role("user");
    final var inputParams =
        Map.of("input", "Reply with 'Orchestration Service is working!' in German");

    final var config =
        TEMPLATE_CONFIG
            .apply(new TemplatingModuleConfig().template(List.of(template)))
            .inputParams(inputParams);

    return API.orchestrationV1EndpointsCreate(config);
  }

  /**
   * Chat request to OpenAI through the Orchestration service with a violent template and both input
   * and output filters.
   *
   * @param threshold A high threshold is a loose filter, a low threshold is a strict filter
   * @return the assistant message response
   */
  @GetMapping("/filter/{threshold}")
  @Nullable
  public CompletionPostResponse filter(@Nonnull @PathVariable("threshold") final String threshold) {

    final var config =
        FILTERING_CONFIG.apply(AzureThreshold.fromValue(Integer.parseInt(threshold)));

    return API.orchestrationV1EndpointsCreate(config);
  }

  /**
   * Chat request to OpenAI through the Orchestration service with a template
   *
   * @return the assistant message response
   */
  @GetMapping("/messagesHistory")
  @Nullable
  public CompletionPostResponse messagesHistory() {
    final List<ChatMessage> messagesHistory =
        List.of(
            new ChatMessage().content("What is the capital of France?").role("user"),
            new ChatMessage().content("The capital of France is Paris.").role("assistant"));
    final var message = new ChatMessage().content("What is the typical food there?").role("user");

    final var config =
        TEMPLATE_CONFIG
            .apply(new TemplatingModuleConfig().template(List.of(message)))
            .messagesHistory(messagesHistory);

    return API.orchestrationV1EndpointsCreate(config);
  }
}
