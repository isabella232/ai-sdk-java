/*
 * Internal Orchestration Service API
 * SAP AI Core - Orchestration Service API
 *
 * The version of the OpenAPI document: 0.0.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Output of LLM module. Follows the OpenAI spec. */
// CHECKSTYLE:OFF
public class LLMModuleResultStreaming
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("object")
  private String _object;

  @JsonProperty("created")
  private Integer created;

  @JsonProperty("model")
  private String model;

  @JsonProperty("system_fingerprint")
  private String systemFingerprint;

  @JsonProperty("choices")
  private List<LLMChoiceStreaming> choices = new ArrayList<>();

  @JsonProperty("usage")
  private TokenUsage usage;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  protected LLMModuleResultStreaming() {}

  /**
   * Set the id of this {@link LLMModuleResultStreaming} instance and return the same instance.
   *
   * @param id ID of the response
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the response
   *
   * @return id The id of this {@link LLMModuleResultStreaming} instance.
   */
  @Nonnull
  public String getId() {
    return id;
  }

  /**
   * Set the id of this {@link LLMModuleResultStreaming} instance.
   *
   * @param id ID of the response
   */
  public void setId(@Nonnull final String id) {
    this.id = id;
  }

  /**
   * Set the _object of this {@link LLMModuleResultStreaming} instance and return the same instance.
   *
   * @param _object Object type
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming _object(@Nonnull final String _object) {
    this._object = _object;
    return this;
  }

  /**
   * Object type
   *
   * @return _object The _object of this {@link LLMModuleResultStreaming} instance.
   */
  @Nonnull
  public String getObject() {
    return _object;
  }

  /**
   * Set the _object of this {@link LLMModuleResultStreaming} instance.
   *
   * @param _object Object type
   */
  public void setObject(@Nonnull final String _object) {
    this._object = _object;
  }

  /**
   * Set the created of this {@link LLMModuleResultStreaming} instance and return the same instance.
   *
   * @param created Unix timestamp
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming created(@Nonnull final Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Unix timestamp
   *
   * @return created The created of this {@link LLMModuleResultStreaming} instance.
   */
  @Nonnull
  public Integer getCreated() {
    return created;
  }

  /**
   * Set the created of this {@link LLMModuleResultStreaming} instance.
   *
   * @param created Unix timestamp
   */
  public void setCreated(@Nonnull final Integer created) {
    this.created = created;
  }

  /**
   * Set the model of this {@link LLMModuleResultStreaming} instance and return the same instance.
   *
   * @param model Model name
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming model(@Nonnull final String model) {
    this.model = model;
    return this;
  }

  /**
   * Model name
   *
   * @return model The model of this {@link LLMModuleResultStreaming} instance.
   */
  @Nonnull
  public String getModel() {
    return model;
  }

  /**
   * Set the model of this {@link LLMModuleResultStreaming} instance.
   *
   * @param model Model name
   */
  public void setModel(@Nonnull final String model) {
    this.model = model;
  }

  /**
   * Set the systemFingerprint of this {@link LLMModuleResultStreaming} instance and return the same
   * instance.
   *
   * @param systemFingerprint System fingerprint
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming systemFingerprint(@Nullable final String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  /**
   * System fingerprint
   *
   * @return systemFingerprint The systemFingerprint of this {@link LLMModuleResultStreaming}
   *     instance.
   */
  @Nonnull
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  /**
   * Set the systemFingerprint of this {@link LLMModuleResultStreaming} instance.
   *
   * @param systemFingerprint System fingerprint
   */
  public void setSystemFingerprint(@Nullable final String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  /**
   * Set the choices of this {@link LLMModuleResultStreaming} instance and return the same instance.
   *
   * @param choices Choices
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming choices(@Nonnull final List<LLMChoiceStreaming> choices) {
    this.choices = choices;
    return this;
  }

  /**
   * Add one choices instance to this {@link LLMModuleResultStreaming}.
   *
   * @param choicesItem The choices that should be added
   * @return The same instance of type {@link LLMModuleResultStreaming}
   */
  @Nonnull
  public LLMModuleResultStreaming addChoicesItem(@Nonnull final LLMChoiceStreaming choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * Choices
   *
   * @return choices The choices of this {@link LLMModuleResultStreaming} instance.
   */
  @Nonnull
  public List<LLMChoiceStreaming> getChoices() {
    return choices;
  }

  /**
   * Set the choices of this {@link LLMModuleResultStreaming} instance.
   *
   * @param choices Choices
   */
  public void setChoices(@Nonnull final List<LLMChoiceStreaming> choices) {
    this.choices = choices;
  }

  /**
   * Set the usage of this {@link LLMModuleResultStreaming} instance and return the same instance.
   *
   * @param usage The usage of this {@link LLMModuleResultStreaming}
   * @return The same instance of this {@link LLMModuleResultStreaming} class
   */
  @Nonnull
  public LLMModuleResultStreaming usage(@Nullable final TokenUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   *
   * @return usage The usage of this {@link LLMModuleResultStreaming} instance.
   */
  @Nonnull
  public TokenUsage getUsage() {
    return usage;
  }

  /**
   * Set the usage of this {@link LLMModuleResultStreaming} instance.
   *
   * @param usage The usage of this {@link LLMModuleResultStreaming}
   */
  public void setUsage(@Nullable final TokenUsage usage) {
    this.usage = usage;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link LLMModuleResultStreaming}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link LLMModuleResultStreaming} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "LLMModuleResultStreaming has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link LLMModuleResultStreaming} instance. If the map
   * previously contained a mapping for the key, the old value is replaced by the specified value.
   *
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField(@Nonnull String customFieldName, @Nullable Object customFieldValue) {
    cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final LLMModuleResultStreaming llMModuleResultStreaming = (LLMModuleResultStreaming) o;
    return Objects.equals(this.cloudSdkCustomFields, llMModuleResultStreaming.cloudSdkCustomFields)
        && Objects.equals(this.id, llMModuleResultStreaming.id)
        && Objects.equals(this._object, llMModuleResultStreaming._object)
        && Objects.equals(this.created, llMModuleResultStreaming.created)
        && Objects.equals(this.model, llMModuleResultStreaming.model)
        && Objects.equals(this.systemFingerprint, llMModuleResultStreaming.systemFingerprint)
        && Objects.equals(this.choices, llMModuleResultStreaming.choices)
        && Objects.equals(this.usage, llMModuleResultStreaming.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id, _object, created, model, systemFingerprint, choices, usage, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class LLMModuleResultStreaming {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    systemFingerprint: ").append(toIndentedString(systemFingerprint)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    cloudSdkCustomFields.forEach(
        (k, v) ->
            sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Create a type-safe, fluent-api builder object to construct a new {@link
   * LLMModuleResultStreaming} instance with all required arguments.
   */
  public static Builder create() {
    return (id) ->
        (_object) ->
            (created) ->
                (model) ->
                    (choices) ->
                        new LLMModuleResultStreaming()
                            .id(id)
                            ._object(_object)
                            .created(created)
                            .model(model)
                            .choices(choices);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the id of this {@link LLMModuleResultStreaming} instance.
     *
     * @param id ID of the response
     * @return The LLMModuleResultStreaming builder.
     */
    Builder1 id(@Nonnull final String id);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the _object of this {@link LLMModuleResultStreaming} instance.
     *
     * @param _object Object type
     * @return The LLMModuleResultStreaming builder.
     */
    Builder2 _object(@Nonnull final String _object);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the created of this {@link LLMModuleResultStreaming} instance.
     *
     * @param created Unix timestamp
     * @return The LLMModuleResultStreaming builder.
     */
    Builder3 created(@Nonnull final Integer created);
  }

  /** Builder helper class. */
  public interface Builder3 {
    /**
     * Set the model of this {@link LLMModuleResultStreaming} instance.
     *
     * @param model Model name
     * @return The LLMModuleResultStreaming builder.
     */
    Builder4 model(@Nonnull final String model);
  }

  /** Builder helper class. */
  public interface Builder4 {
    /**
     * Set the choices of this {@link LLMModuleResultStreaming} instance.
     *
     * @param choices Choices
     * @return The LLMModuleResultStreaming instance.
     */
    LLMModuleResultStreaming choices(@Nonnull final List<LLMChoiceStreaming> choices);

    /**
     * Set the choices of this {@link LLMModuleResultStreaming} instance.
     *
     * @param choices Choices
     * @return The LLMModuleResultStreaming instance.
     */
    default LLMModuleResultStreaming choices(@Nonnull final LLMChoiceStreaming... choices) {
      return choices(Arrays.asList(choices));
    }
  }
}
