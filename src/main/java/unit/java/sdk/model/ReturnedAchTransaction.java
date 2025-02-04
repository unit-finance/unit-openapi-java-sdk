/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package unit.java.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import unit.java.sdk.model.ReturnedAchTransactionAllOfAttributes;
import unit.java.sdk.model.ReturnedAchTransactionRelationships;
import unit.java.sdk.model.Transaction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.JSON;
import unit.java.sdk.ApiClient;
/**
 * ReturnedAchTransaction
 */
@JsonPropertyOrder({
  ReturnedAchTransaction.JSON_PROPERTY_ATTRIBUTES,
  ReturnedAchTransaction.JSON_PROPERTY_RELATIONSHIPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ReturnedAchTransaction extends Transaction {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ReturnedAchTransactionAllOfAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private ReturnedAchTransactionRelationships relationships;

  public ReturnedAchTransaction() { 
  }

  public ReturnedAchTransaction attributes(ReturnedAchTransactionAllOfAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReturnedAchTransactionAllOfAttributes getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttributes(ReturnedAchTransactionAllOfAttributes attributes) {
    this.attributes = attributes;
  }


  public ReturnedAchTransaction relationships(ReturnedAchTransactionRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReturnedAchTransactionRelationships getRelationships() {
    return relationships;
  }


  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelationships(ReturnedAchTransactionRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public ReturnedAchTransaction id(String id) {
    this.setId(id);
    return this;
  }

  @Override
  public ReturnedAchTransaction type(TypeEnum type) {
    this.setType(type);
    return this;
  }

  /**
   * Return true if this ReturnedAchTransaction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnedAchTransaction returnedAchTransaction = (ReturnedAchTransaction) o;
    return Objects.equals(this.attributes, returnedAchTransaction.attributes) &&
        Objects.equals(this.relationships, returnedAchTransaction.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnedAchTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `attributes` to the URL query string
    if (getAttributes() != null) {
      joiner.add(getAttributes().toUrlQueryString(prefix + "attributes" + suffix));
    }

    // add `relationships` to the URL query string
    if (getRelationships() != null) {
      joiner.add(getRelationships().toUrlQueryString(prefix + "relationships" + suffix));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("ReturnedAchTransaction", ReturnedAchTransaction.class);
  JSON.registerDiscriminator(ReturnedAchTransaction.class, "type", mappings);
}
}

