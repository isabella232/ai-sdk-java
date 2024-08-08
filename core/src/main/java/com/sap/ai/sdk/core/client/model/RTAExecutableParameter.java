

/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models. 
 *
 * The version of the OpenAPI document: 2.32.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.client.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Argument of an executable
 */

// CHECKSTYLE:OFF
public class RTAExecutableParameter 
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("default")
  private String _default;

  /**
   * Type of the signature argument
   */
  public enum TypeEnum {
    /**
    * The STRING option of this RTAExecutableParameter
    */
    STRING("string");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
    * Get the value of the enum
    * @return The enum value
    */
    @JsonValue
    @Nonnull public String getValue() {
      return value;
    }

    /**
    * Get the String value of the enum value.
    * @return The enum value as String
    */
    @Override
    @Nonnull public String toString() {
      return String.valueOf(value);
    }

    /**
    * Get the enum value from a String value
    * @param value The String value
    * @return The enum value of type RTAExecutableParameter
    */
    @JsonCreator
    @Nonnull public static TypeEnum fromValue(@Nonnull final String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the name of this {@link RTAExecutableParameter} instance and return the same instance.
   *
   * @param name  Name of the signature argument
   * @return The same instance of this {@link RTAExecutableParameter} class
   */
   @Nonnull public RTAExecutableParameter name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the signature argument
   * @return name  The name of this {@link RTAExecutableParameter} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link RTAExecutableParameter} instance.
  *
  * @param name  Name of the signature argument
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

   /**
   * Set the description of this {@link RTAExecutableParameter} instance and return the same instance.
   *
   * @param description  Description of the signature argument
   * @return The same instance of this {@link RTAExecutableParameter} class
   */
   @Nonnull public RTAExecutableParameter description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the signature argument
   * @return description  The description of this {@link RTAExecutableParameter} instance.
  **/
  @Nonnull public String getDescription() {
    return description;
  }

  /**
  * Set the description of this {@link RTAExecutableParameter} instance.
  *
  * @param description  Description of the signature argument
  */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
   * Set the _default of this {@link RTAExecutableParameter} instance and return the same instance.
   *
   * @param _default  Default value of the signature argument
   * @return The same instance of this {@link RTAExecutableParameter} class
   */
   @Nonnull public RTAExecutableParameter _default(@Nonnull final String _default) {
    this._default = _default;
    return this;
  }

   /**
   * Default value of the signature argument
   * @return _default  The _default of this {@link RTAExecutableParameter} instance.
  **/
  @Nonnull public String getDefault() {
    return _default;
  }

  /**
  * Set the _default of this {@link RTAExecutableParameter} instance.
  *
  * @param _default  Default value of the signature argument
  */
  public void setDefault( @Nonnull final String _default) {
    this._default = _default;
  }

   /**
   * Set the type of this {@link RTAExecutableParameter} instance and return the same instance.
   *
   * @param type  Type of the signature argument
   * @return The same instance of this {@link RTAExecutableParameter} class
   */
   @Nonnull public RTAExecutableParameter type(@Nonnull final TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the signature argument
   * @return type  The type of this {@link RTAExecutableParameter} instance.
  **/
  @Nonnull public TypeEnum getType() {
    return type;
  }

  /**
  * Set the type of this {@link RTAExecutableParameter} instance.
  *
  * @param type  Type of the signature argument
  */
  public void setType( @Nonnull final TypeEnum type) {
    this.type = type;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link RTAExecutableParameter}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link RTAExecutableParameter} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("RTAExecutableParameter has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link RTAExecutableParameter} instance. If the map previously contained a mapping
   * for the key, the old value is replaced by the specified value.
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField( @Nonnull String customFieldName, @Nullable Object customFieldValue )
  {
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
    final RTAExecutableParameter rtAExecutableParameter = (RTAExecutableParameter) o;
    return Objects.equals(this.cloudSdkCustomFields, rtAExecutableParameter.cloudSdkCustomFields) &&
        Objects.equals(this.name, rtAExecutableParameter.name) &&
        Objects.equals(this.description, rtAExecutableParameter.description) &&
        Objects.equals(this._default, rtAExecutableParameter._default) &&
        Objects.equals(this.type, rtAExecutableParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, _default, type, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class RTAExecutableParameter {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

