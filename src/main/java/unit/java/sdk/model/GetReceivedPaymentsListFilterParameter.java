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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetReceivedPaymentsListFilterParameter
 */
@JsonPropertyOrder({
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_ACCOUNT_ID,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_STATUS,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_SINCE,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_UNTIL,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_FROM_AMOUNT,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_TO_AMOUNT,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_INCLUDE_COMPLETED,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_CAN_BE_REPROCESSED,
  GetReceivedPaymentsListFilterParameter.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetReceivedPaymentsListFilterParameter {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    ADVANCED("Advanced"),
    
    PENDING_REVIEW("PendingReview"),
    
    MARKED_FOR_RETURN("MarkedForReturn"),
    
    RETURNED("Returned"),
    
    COMPLETED("Completed");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<StatusEnum> status = new ArrayList<>();

  public static final String JSON_PROPERTY_SINCE = "since";
  private String since;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private String until;

  public static final String JSON_PROPERTY_FROM_AMOUNT = "fromAmount";
  private Long fromAmount;

  public static final String JSON_PROPERTY_TO_AMOUNT = "toAmount";
  private Long toAmount;

  public static final String JSON_PROPERTY_INCLUDE_COMPLETED = "includeCompleted";
  private Boolean includeCompleted;

  public static final String JSON_PROPERTY_CAN_BE_REPROCESSED = "canBeReprocessed";
  private Boolean canBeReprocessed;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public GetReceivedPaymentsListFilterParameter() { 
  }

  public GetReceivedPaymentsListFilterParameter accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public GetReceivedPaymentsListFilterParameter customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public GetReceivedPaymentsListFilterParameter status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public GetReceivedPaymentsListFilterParameter addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<StatusEnum> getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<StatusEnum> status) {
    this.status = status;
  }


  public GetReceivedPaymentsListFilterParameter since(String since) {
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


  public GetReceivedPaymentsListFilterParameter until(String until) {
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


  public GetReceivedPaymentsListFilterParameter fromAmount(Long fromAmount) {
    this.fromAmount = fromAmount;
    return this;
  }

  /**
   * Get fromAmount
   * @return fromAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFromAmount() {
    return fromAmount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAmount(Long fromAmount) {
    this.fromAmount = fromAmount;
  }


  public GetReceivedPaymentsListFilterParameter toAmount(Long toAmount) {
    this.toAmount = toAmount;
    return this;
  }

  /**
   * Get toAmount
   * @return toAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getToAmount() {
    return toAmount;
  }


  @JsonProperty(JSON_PROPERTY_TO_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAmount(Long toAmount) {
    this.toAmount = toAmount;
  }


  public GetReceivedPaymentsListFilterParameter includeCompleted(Boolean includeCompleted) {
    this.includeCompleted = includeCompleted;
    return this;
  }

  /**
   * Get includeCompleted
   * @return includeCompleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeCompleted() {
    return includeCompleted;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeCompleted(Boolean includeCompleted) {
    this.includeCompleted = includeCompleted;
  }


  public GetReceivedPaymentsListFilterParameter canBeReprocessed(Boolean canBeReprocessed) {
    this.canBeReprocessed = canBeReprocessed;
    return this;
  }

  /**
   * Get canBeReprocessed
   * @return canBeReprocessed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAN_BE_REPROCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCanBeReprocessed() {
    return canBeReprocessed;
  }


  @JsonProperty(JSON_PROPERTY_CAN_BE_REPROCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanBeReprocessed(Boolean canBeReprocessed) {
    this.canBeReprocessed = canBeReprocessed;
  }


  public GetReceivedPaymentsListFilterParameter tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public GetReceivedPaymentsListFilterParameter putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  /**
   * Return true if this getReceivedPaymentsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReceivedPaymentsListFilterParameter getReceivedPaymentsListFilterParameter = (GetReceivedPaymentsListFilterParameter) o;
    return Objects.equals(this.accountId, getReceivedPaymentsListFilterParameter.accountId) &&
        Objects.equals(this.customerId, getReceivedPaymentsListFilterParameter.customerId) &&
        Objects.equals(this.status, getReceivedPaymentsListFilterParameter.status) &&
        Objects.equals(this.since, getReceivedPaymentsListFilterParameter.since) &&
        Objects.equals(this.until, getReceivedPaymentsListFilterParameter.until) &&
        Objects.equals(this.fromAmount, getReceivedPaymentsListFilterParameter.fromAmount) &&
        Objects.equals(this.toAmount, getReceivedPaymentsListFilterParameter.toAmount) &&
        Objects.equals(this.includeCompleted, getReceivedPaymentsListFilterParameter.includeCompleted) &&
        Objects.equals(this.canBeReprocessed, getReceivedPaymentsListFilterParameter.canBeReprocessed) &&
        Objects.equals(this.tags, getReceivedPaymentsListFilterParameter.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, status, since, until, fromAmount, toAmount, includeCompleted, canBeReprocessed, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReceivedPaymentsListFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    includeCompleted: ").append(toIndentedString(includeCompleted)).append("\n");
    sb.append("    canBeReprocessed: ").append(toIndentedString(canBeReprocessed)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `accountId` to the URL query string
    if (getAccountId() != null) {
      joiner.add(String.format("%saccountId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCustomerId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      for (int i = 0; i < getStatus().size(); i++) {
        joiner.add(String.format("%sstatus%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getStatus().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `since` to the URL query string
    if (getSince() != null) {
      joiner.add(String.format("%ssince%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `until` to the URL query string
    if (getUntil() != null) {
      joiner.add(String.format("%suntil%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUntil()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fromAmount` to the URL query string
    if (getFromAmount() != null) {
      joiner.add(String.format("%sfromAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toAmount` to the URL query string
    if (getToAmount() != null) {
      joiner.add(String.format("%stoAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `includeCompleted` to the URL query string
    if (getIncludeCompleted() != null) {
      joiner.add(String.format("%sincludeCompleted%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIncludeCompleted()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `canBeReprocessed` to the URL query string
    if (getCanBeReprocessed() != null) {
      joiner.add(String.format("%scanBeReprocessed%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCanBeReprocessed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

