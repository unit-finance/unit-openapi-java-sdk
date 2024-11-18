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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetRecurringRepaymentsListFilterParameter
 */
@JsonPropertyOrder({
  GetRecurringRepaymentsListFilterParameter.JSON_PROPERTY_CREDIT_ACCOUNT_ID,
  GetRecurringRepaymentsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetRecurringRepaymentsListFilterParameter.JSON_PROPERTY_STATUS,
  GetRecurringRepaymentsListFilterParameter.JSON_PROPERTY_FROM_START_TIME,
  GetRecurringRepaymentsListFilterParameter.JSON_PROPERTY_TO_START_TIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetRecurringRepaymentsListFilterParameter {
  public static final String JSON_PROPERTY_CREDIT_ACCOUNT_ID = "creditAccountId";
  private String creditAccountId;

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

  public static final String JSON_PROPERTY_FROM_START_TIME = "fromStartTime";
  private LocalDate fromStartTime;

  public static final String JSON_PROPERTY_TO_START_TIME = "toStartTime";
  private LocalDate toStartTime;

  public GetRecurringRepaymentsListFilterParameter() { 
  }

  public GetRecurringRepaymentsListFilterParameter creditAccountId(String creditAccountId) {
    this.creditAccountId = creditAccountId;
    return this;
  }

  /**
   * Get creditAccountId
   * @return creditAccountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreditAccountId() {
    return creditAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditAccountId(String creditAccountId) {
    this.creditAccountId = creditAccountId;
  }


  public GetRecurringRepaymentsListFilterParameter customerId(String customerId) {
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


  public GetRecurringRepaymentsListFilterParameter status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public GetRecurringRepaymentsListFilterParameter addStatusItem(StatusEnum statusItem) {
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


  public GetRecurringRepaymentsListFilterParameter fromStartTime(LocalDate fromStartTime) {
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
  public LocalDate getFromStartTime() {
    return fromStartTime;
  }


  @JsonProperty(JSON_PROPERTY_FROM_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromStartTime(LocalDate fromStartTime) {
    this.fromStartTime = fromStartTime;
  }


  public GetRecurringRepaymentsListFilterParameter toStartTime(LocalDate toStartTime) {
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
  public LocalDate getToStartTime() {
    return toStartTime;
  }


  @JsonProperty(JSON_PROPERTY_TO_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToStartTime(LocalDate toStartTime) {
    this.toStartTime = toStartTime;
  }


  /**
   * Return true if this getRecurringRepaymentsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringRepaymentsListFilterParameter getRecurringRepaymentsListFilterParameter = (GetRecurringRepaymentsListFilterParameter) o;
    return Objects.equals(this.creditAccountId, getRecurringRepaymentsListFilterParameter.creditAccountId) &&
        Objects.equals(this.customerId, getRecurringRepaymentsListFilterParameter.customerId) &&
        Objects.equals(this.status, getRecurringRepaymentsListFilterParameter.status) &&
        Objects.equals(this.fromStartTime, getRecurringRepaymentsListFilterParameter.fromStartTime) &&
        Objects.equals(this.toStartTime, getRecurringRepaymentsListFilterParameter.toStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAccountId, customerId, status, fromStartTime, toStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringRepaymentsListFilterParameter {\n");
    sb.append("    creditAccountId: ").append(toIndentedString(creditAccountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fromStartTime: ").append(toIndentedString(fromStartTime)).append("\n");
    sb.append("    toStartTime: ").append(toIndentedString(toStartTime)).append("\n");
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

    // add `creditAccountId` to the URL query string
    if (getCreditAccountId() != null) {
      joiner.add(String.format("%screditAccountId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreditAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `fromStartTime` to the URL query string
    if (getFromStartTime() != null) {
      joiner.add(String.format("%sfromStartTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toStartTime` to the URL query string
    if (getToStartTime() != null) {
      joiner.add(String.format("%stoStartTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

