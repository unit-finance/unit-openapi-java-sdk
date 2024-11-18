/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.1.0
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
 * WebhookAttributes
 */
@JsonPropertyOrder({
  WebhookAttributes.JSON_PROPERTY_CREATED_AT,
  WebhookAttributes.JSON_PROPERTY_LABEL,
  WebhookAttributes.JSON_PROPERTY_URL,
  WebhookAttributes.JSON_PROPERTY_STATUS,
  WebhookAttributes.JSON_PROPERTY_CONTENT_TYPE,
  WebhookAttributes.JSON_PROPERTY_DELIVERY_MODE,
  WebhookAttributes.JSON_PROPERTY_TOKEN,
  WebhookAttributes.JSON_PROPERTY_SUBSCRIPTION_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WebhookAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  /**
   * Gets or Sets contentType
   */
  public enum ContentTypeEnum {
    JSON("Json"),
    
    JSON_API("JsonAPI");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private ContentTypeEnum contentType;

  /**
   * Gets or Sets deliveryMode
   */
  public enum DeliveryModeEnum {
    AT_MOST_ONCE("AtMostOnce"),
    
    AT_LEAST_ONCE("AtLeastOnce");

    private String value;

    DeliveryModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryModeEnum fromValue(String value) {
      for (DeliveryModeEnum b : DeliveryModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DELIVERY_MODE = "deliveryMode";
  private DeliveryModeEnum deliveryMode;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_SUBSCRIPTION_TYPE = "subscriptionType";
  private String subscriptionType;

  public WebhookAttributes() { 
  }

  public WebhookAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookAttributes label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public WebhookAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public WebhookAttributes contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ContentTypeEnum getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  public WebhookAttributes deliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * Get deliveryMode
   * @return deliveryMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeliveryModeEnum getDeliveryMode() {
    return deliveryMode;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public WebhookAttributes token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(String token) {
    this.token = token;
  }


  public WebhookAttributes subscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Get subscriptionType
   * @return subscriptionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubscriptionType() {
    return subscriptionType;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }


  /**
   * Return true if this Webhook_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookAttributes webhookAttributes = (WebhookAttributes) o;
    return Objects.equals(this.createdAt, webhookAttributes.createdAt) &&
        Objects.equals(this.label, webhookAttributes.label) &&
        Objects.equals(this.url, webhookAttributes.url) &&
        Objects.equals(this.status, webhookAttributes.status) &&
        Objects.equals(this.contentType, webhookAttributes.contentType) &&
        Objects.equals(this.deliveryMode, webhookAttributes.deliveryMode) &&
        Objects.equals(this.token, webhookAttributes.token) &&
        Objects.equals(this.subscriptionType, webhookAttributes.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, label, url, status, contentType, deliveryMode, token, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      joiner.add(String.format("%slabel%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLabel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contentType` to the URL query string
    if (getContentType() != null) {
      joiner.add(String.format("%scontentType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getContentType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deliveryMode` to the URL query string
    if (getDeliveryMode() != null) {
      joiner.add(String.format("%sdeliveryMode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDeliveryMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `subscriptionType` to the URL query string
    if (getSubscriptionType() != null) {
      joiner.add(String.format("%ssubscriptionType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSubscriptionType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

