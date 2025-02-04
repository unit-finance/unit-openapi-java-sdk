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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetWebhooksListFilterParameter
 */
@JsonPropertyOrder({
  GetWebhooksListFilterParameter.JSON_PROPERTY_SINCE,
  GetWebhooksListFilterParameter.JSON_PROPERTY_UNTIL,
  GetWebhooksListFilterParameter.JSON_PROPERTY_FROM_ID,
  GetWebhooksListFilterParameter.JSON_PROPERTY_TO_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetWebhooksListFilterParameter {
  public static final String JSON_PROPERTY_SINCE = "since";
  private String since;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private String until;

  public static final String JSON_PROPERTY_FROM_ID = "fromId";
  private Integer fromId;

  public static final String JSON_PROPERTY_TO_ID = "toId";
  private Integer toId;

  public GetWebhooksListFilterParameter() { 
  }

  public GetWebhooksListFilterParameter since(String since) {
    this.since = since;
    return this;
  }

  /**
   * Get since
   * @return since
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSince() {
    return since;
  }


  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSince(String since) {
    this.since = since;
  }


  public GetWebhooksListFilterParameter until(String until) {
    this.until = until;
    return this;
  }

  /**
   * Get until
   * @return until
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUntil() {
    return until;
  }


  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUntil(String until) {
    this.until = until;
  }


  public GetWebhooksListFilterParameter fromId(Integer fromId) {
    this.fromId = fromId;
    return this;
  }

  /**
   * Get fromId
   * @return fromId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getFromId() {
    return fromId;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromId(Integer fromId) {
    this.fromId = fromId;
  }


  public GetWebhooksListFilterParameter toId(Integer toId) {
    this.toId = toId;
    return this;
  }

  /**
   * Get toId
   * @return toId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getToId() {
    return toId;
  }


  @JsonProperty(JSON_PROPERTY_TO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToId(Integer toId) {
    this.toId = toId;
  }


  /**
   * Return true if this getWebhooksList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWebhooksListFilterParameter getWebhooksListFilterParameter = (GetWebhooksListFilterParameter) o;
    return Objects.equals(this.since, getWebhooksListFilterParameter.since) &&
        Objects.equals(this.until, getWebhooksListFilterParameter.until) &&
        Objects.equals(this.fromId, getWebhooksListFilterParameter.fromId) &&
        Objects.equals(this.toId, getWebhooksListFilterParameter.toId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(since, until, fromId, toId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWebhooksListFilterParameter {\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
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

    // add `since` to the URL query string
    if (getSince() != null) {
      joiner.add(String.format("%ssince%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `until` to the URL query string
    if (getUntil() != null) {
      joiner.add(String.format("%suntil%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUntil()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fromId` to the URL query string
    if (getFromId() != null) {
      joiner.add(String.format("%sfromId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toId` to the URL query string
    if (getToId() != null) {
      joiner.add(String.format("%stoId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

