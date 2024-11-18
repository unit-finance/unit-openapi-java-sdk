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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetRecurringPaymentsListFilterParameter
 */
@JsonPropertyOrder({
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_ACCOUNT_ID,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_STATUS,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_TYPE,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_FROM_START_TIME,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_TO_START_TIME,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_FROM_END_TIME,
  GetRecurringPaymentsListFilterParameter.JSON_PROPERTY_TO_END_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetRecurringPaymentsListFilterParameter {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<String> status = new ArrayList<>();

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    RECURRING_CREDIT_ACH_PAYMENT("recurringCreditAchPayment"),
    
    RECURRING_DEBIT_ACH_PAYMENT("recurringDebitAchPayment"),
    
    RECURRING_CREDIT_BOOK_PAYMENT("recurringCreditBookPayment");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<TypeEnum> type = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_START_TIME = "fromStartTime";
  private String fromStartTime;

  public static final String JSON_PROPERTY_TO_START_TIME = "toStartTime";
  private String toStartTime;

  public static final String JSON_PROPERTY_FROM_END_TIME = "fromEndTime";
  private String fromEndTime;

  public static final String JSON_PROPERTY_TO_END_TIME = "toEndTime";
  private String toEndTime;

  public GetRecurringPaymentsListFilterParameter() { 
  }

  public GetRecurringPaymentsListFilterParameter accountId(String accountId) {
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


  public GetRecurringPaymentsListFilterParameter customerId(String customerId) {
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


  public GetRecurringPaymentsListFilterParameter status(List<String> status) {
    this.status = status;
    return this;
  }

  public GetRecurringPaymentsListFilterParameter addStatusItem(String statusItem) {
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
  public List<String> getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<String> status) {
    this.status = status;
  }


  public GetRecurringPaymentsListFilterParameter type(List<TypeEnum> type) {
    this.type = type;
    return this;
  }

  public GetRecurringPaymentsListFilterParameter addTypeItem(TypeEnum typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TypeEnum> getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(List<TypeEnum> type) {
    this.type = type;
  }


  public GetRecurringPaymentsListFilterParameter fromStartTime(String fromStartTime) {
    this.fromStartTime = fromStartTime;
    return this;
  }

  /**
   * Get fromStartTime
   * @return fromStartTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFromStartTime() {
    return fromStartTime;
  }


  @JsonProperty(JSON_PROPERTY_FROM_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromStartTime(String fromStartTime) {
    this.fromStartTime = fromStartTime;
  }


  public GetRecurringPaymentsListFilterParameter toStartTime(String toStartTime) {
    this.toStartTime = toStartTime;
    return this;
  }

  /**
   * Get toStartTime
   * @return toStartTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToStartTime() {
    return toStartTime;
  }


  @JsonProperty(JSON_PROPERTY_TO_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToStartTime(String toStartTime) {
    this.toStartTime = toStartTime;
  }


  public GetRecurringPaymentsListFilterParameter fromEndTime(String fromEndTime) {
    this.fromEndTime = fromEndTime;
    return this;
  }

  /**
   * Get fromEndTime
   * @return fromEndTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFromEndTime() {
    return fromEndTime;
  }


  @JsonProperty(JSON_PROPERTY_FROM_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromEndTime(String fromEndTime) {
    this.fromEndTime = fromEndTime;
  }


  public GetRecurringPaymentsListFilterParameter toEndTime(String toEndTime) {
    this.toEndTime = toEndTime;
    return this;
  }

  /**
   * Get toEndTime
   * @return toEndTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToEndTime() {
    return toEndTime;
  }


  @JsonProperty(JSON_PROPERTY_TO_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToEndTime(String toEndTime) {
    this.toEndTime = toEndTime;
  }


  /**
   * Return true if this getRecurringPaymentsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringPaymentsListFilterParameter getRecurringPaymentsListFilterParameter = (GetRecurringPaymentsListFilterParameter) o;
    return Objects.equals(this.accountId, getRecurringPaymentsListFilterParameter.accountId) &&
        Objects.equals(this.customerId, getRecurringPaymentsListFilterParameter.customerId) &&
        Objects.equals(this.status, getRecurringPaymentsListFilterParameter.status) &&
        Objects.equals(this.type, getRecurringPaymentsListFilterParameter.type) &&
        Objects.equals(this.fromStartTime, getRecurringPaymentsListFilterParameter.fromStartTime) &&
        Objects.equals(this.toStartTime, getRecurringPaymentsListFilterParameter.toStartTime) &&
        Objects.equals(this.fromEndTime, getRecurringPaymentsListFilterParameter.fromEndTime) &&
        Objects.equals(this.toEndTime, getRecurringPaymentsListFilterParameter.toEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, status, type, fromStartTime, toStartTime, fromEndTime, toEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringPaymentsListFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fromStartTime: ").append(toIndentedString(fromStartTime)).append("\n");
    sb.append("    toStartTime: ").append(toIndentedString(toStartTime)).append("\n");
    sb.append("    fromEndTime: ").append(toIndentedString(fromEndTime)).append("\n");
    sb.append("    toEndTime: ").append(toIndentedString(toEndTime)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      for (int i = 0; i < getType().size(); i++) {
        joiner.add(String.format("%stype%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getType().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `fromStartTime` to the URL query string
    if (getFromStartTime() != null) {
      joiner.add(String.format("%sfromStartTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toStartTime` to the URL query string
    if (getToStartTime() != null) {
      joiner.add(String.format("%stoStartTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fromEndTime` to the URL query string
    if (getFromEndTime() != null) {
      joiner.add(String.format("%sfromEndTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toEndTime` to the URL query string
    if (getToEndTime() != null) {
      joiner.add(String.format("%stoEndTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

