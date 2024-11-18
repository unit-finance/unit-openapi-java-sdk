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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetStopPaymentsListFilterParameter
 */
@JsonPropertyOrder({
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_ACCOUNT_ID,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_STATUS,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_TAGS,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_SINCE,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_UNTIL,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_FROM_AMOUNT,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_TO_AMOUNT,
  GetStopPaymentsListFilterParameter.JSON_PROPERTY_CHECK_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetStopPaymentsListFilterParameter {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    DISABLED("Disabled");

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

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_SINCE = "since";
  private String since;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private String until;

  public static final String JSON_PROPERTY_FROM_AMOUNT = "fromAmount";
  private Integer fromAmount;

  public static final String JSON_PROPERTY_TO_AMOUNT = "toAmount";
  private Integer toAmount;

  public static final String JSON_PROPERTY_CHECK_NUMBER = "checkNumber";
  private String checkNumber;

  public GetStopPaymentsListFilterParameter() { 
  }

  public GetStopPaymentsListFilterParameter accountId(String accountId) {
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


  public GetStopPaymentsListFilterParameter customerId(String customerId) {
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


  public GetStopPaymentsListFilterParameter status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public GetStopPaymentsListFilterParameter addStatusItem(StatusEnum statusItem) {
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


  public GetStopPaymentsListFilterParameter tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public GetStopPaymentsListFilterParameter putTagsItem(String key, String tagsItem) {
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


  public GetStopPaymentsListFilterParameter since(String since) {
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


  public GetStopPaymentsListFilterParameter until(String until) {
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


  public GetStopPaymentsListFilterParameter fromAmount(Integer fromAmount) {
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
  public Integer getFromAmount() {
    return fromAmount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAmount(Integer fromAmount) {
    this.fromAmount = fromAmount;
  }


  public GetStopPaymentsListFilterParameter toAmount(Integer toAmount) {
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
  public Integer getToAmount() {
    return toAmount;
  }


  @JsonProperty(JSON_PROPERTY_TO_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAmount(Integer toAmount) {
    this.toAmount = toAmount;
  }


  public GetStopPaymentsListFilterParameter checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

  /**
   * Get checkNumber
   * @return checkNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckNumber() {
    return checkNumber;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  /**
   * Return true if this getStopPaymentsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStopPaymentsListFilterParameter getStopPaymentsListFilterParameter = (GetStopPaymentsListFilterParameter) o;
    return Objects.equals(this.accountId, getStopPaymentsListFilterParameter.accountId) &&
        Objects.equals(this.customerId, getStopPaymentsListFilterParameter.customerId) &&
        Objects.equals(this.status, getStopPaymentsListFilterParameter.status) &&
        Objects.equals(this.tags, getStopPaymentsListFilterParameter.tags) &&
        Objects.equals(this.since, getStopPaymentsListFilterParameter.since) &&
        Objects.equals(this.until, getStopPaymentsListFilterParameter.until) &&
        Objects.equals(this.fromAmount, getStopPaymentsListFilterParameter.fromAmount) &&
        Objects.equals(this.toAmount, getStopPaymentsListFilterParameter.toAmount) &&
        Objects.equals(this.checkNumber, getStopPaymentsListFilterParameter.checkNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, status, tags, since, until, fromAmount, toAmount, checkNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStopPaymentsListFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
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

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `checkNumber` to the URL query string
    if (getCheckNumber() != null) {
      joiner.add(String.format("%scheckNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCheckNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

