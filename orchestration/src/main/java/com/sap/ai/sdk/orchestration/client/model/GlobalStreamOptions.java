/*
 * Orchestration
 * Orchestration is an inference service which provides common additional capabilities for business AI scenarios, such as content filtering and data masking. At the core of the service is the LLM module which allows for an easy, harmonized access to the language models of gen AI hub. The service is designed to be modular and extensible, allowing for the addition of new modules in the future. Each module can be configured independently and at runtime, allowing for a high degree of flexibility in the orchestration of AI services.
 *
 * The version of the OpenAPI document: 0.29.3
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Options for streaming. Will be ignored if stream is false. */
@JsonPropertyOrder({GlobalStreamOptions.JSON_PROPERTY_CHUNK_SIZE})
@com.google.common.annotations.Beta
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0")
public class GlobalStreamOptions {
  public static final String JSON_PROPERTY_CHUNK_SIZE = "chunk_size";
  private Integer chunkSize = 100;

  public GlobalStreamOptions() {}

  public GlobalStreamOptions chunkSize(Integer chunkSize) {

    this.chunkSize = chunkSize;
    return this;
  }

  /**
   * Number of characters per chunk that post-LLM modules operate on. minimum: 1 maximum: 10000
   *
   * @return chunkSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHUNK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getChunkSize() {
    return chunkSize;
  }

  @JsonProperty(JSON_PROPERTY_CHUNK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChunkSize(Integer chunkSize) {
    this.chunkSize = chunkSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalStreamOptions globalStreamOptions = (GlobalStreamOptions) o;
    return Objects.equals(this.chunkSize, globalStreamOptions.chunkSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalStreamOptions {\n");
    sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {

    private GlobalStreamOptions instance;

    public Builder() {
      this(new GlobalStreamOptions());
    }

    protected Builder(GlobalStreamOptions instance) {
      this.instance = instance;
    }

    public GlobalStreamOptions.Builder chunkSize(Integer chunkSize) {
      this.instance.chunkSize = chunkSize;
      return this;
    }

    /**
     * returns a built GlobalStreamOptions instance.
     *
     * <p>The builder is not reusable.
     */
    public GlobalStreamOptions build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /** Create a builder with no initialized field. */
  public static GlobalStreamOptions.Builder builder() {
    return new GlobalStreamOptions.Builder();
  }

  /** Create a builder with a shallow copy of this instance. */
  public GlobalStreamOptions.Builder toBuilder() {
    return new GlobalStreamOptions.Builder().chunkSize(getChunkSize());
  }
}
