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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * DisputeAttributesStatusHistoryInner
 */
@JsonPropertyOrder({
  DisputeAttributesStatusHistoryInner.JSON_PROPERTY_TYPE,
  DisputeAttributesStatusHistoryInner.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DisputeAttributesStatusHistoryInner {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public DisputeAttributesStatusHistoryInner() { 
  }

  public DisputeAttributesStatusHistoryInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public DisputeAttributesStatusHistoryInner updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this Dispute_attributes_statusHistory_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAttributesStatusHistoryInner disputeAttributesStatusHistoryInner = (DisputeAttributesStatusHistoryInner) o;
    return Objects.equals(this.type, disputeAttributesStatusHistoryInner.type) &&
        Objects.equals(this.updatedAt, disputeAttributesStatusHistoryInner.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAttributesStatusHistoryInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

