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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetRepaymentsListFilterParameter
 */
@JsonPropertyOrder({
  GetRepaymentsListFilterParameter.JSON_PROPERTY_ACCOUNT_ID,
  GetRepaymentsListFilterParameter.JSON_PROPERTY_CREDIT_ACCOUNT_ID,
  GetRepaymentsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetRepaymentsListFilterParameter.JSON_PROPERTY_STATUS,
  GetRepaymentsListFilterParameter.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetRepaymentsListFilterParameter {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CREDIT_ACCOUNT_ID = "creditAccountId";
  private String creditAccountId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    PENDING_REVIEW("PendingReview"),
    
    RETURNED("Returned"),
    
    SENT("Sent"),
    
    REJECTED("Rejected");

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ACH_REPAYMENT("AchRepayment"),
    
    BOOK_REPAYMENT("BookRepayment");

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

  public GetRepaymentsListFilterParameter() { 
  }

  public GetRepaymentsListFilterParameter accountId(String accountId) {
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


  public GetRepaymentsListFilterParameter creditAccountId(String creditAccountId) {
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


  public GetRepaymentsListFilterParameter customerId(String customerId) {
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


  public GetRepaymentsListFilterParameter status(List<StatusEnum> status) {
    this.status = status;
    return this;
  }

  public GetRepaymentsListFilterParameter addStatusItem(StatusEnum statusItem) {
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


  public GetRepaymentsListFilterParameter type(List<TypeEnum> type) {
    this.type = type;
    return this;
  }

  public GetRepaymentsListFilterParameter addTypeItem(TypeEnum typeItem) {
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


  /**
   * Return true if this getRepaymentsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRepaymentsListFilterParameter getRepaymentsListFilterParameter = (GetRepaymentsListFilterParameter) o;
    return Objects.equals(this.accountId, getRepaymentsListFilterParameter.accountId) &&
        Objects.equals(this.creditAccountId, getRepaymentsListFilterParameter.creditAccountId) &&
        Objects.equals(this.customerId, getRepaymentsListFilterParameter.customerId) &&
        Objects.equals(this.status, getRepaymentsListFilterParameter.status) &&
        Objects.equals(this.type, getRepaymentsListFilterParameter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditAccountId, customerId, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRepaymentsListFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditAccountId: ").append(toIndentedString(creditAccountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      for (int i = 0; i < getType().size(); i++) {
        joiner.add(String.format("%stype%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getType().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

