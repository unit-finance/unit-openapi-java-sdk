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
 * GetAuthorizationRequestsListFilterParameter
 */
@JsonPropertyOrder({
  GetAuthorizationRequestsListFilterParameter.JSON_PROPERTY_ACCOUNT_ID,
  GetAuthorizationRequestsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetAuthorizationRequestsListFilterParameter.JSON_PROPERTY_MERCHANT_CATEGORY_CODE,
  GetAuthorizationRequestsListFilterParameter.JSON_PROPERTY_FROM_AMOUNT,
  GetAuthorizationRequestsListFilterParameter.JSON_PROPERTY_TO_AMOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetAuthorizationRequestsListFilterParameter {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_MERCHANT_CATEGORY_CODE = "merchantCategoryCode";
  private List<String> merchantCategoryCode = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_AMOUNT = "fromAmount";
  private Integer fromAmount;

  public static final String JSON_PROPERTY_TO_AMOUNT = "toAmount";
  private Integer toAmount;

  public GetAuthorizationRequestsListFilterParameter() { 
  }

  public GetAuthorizationRequestsListFilterParameter accountId(String accountId) {
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


  public GetAuthorizationRequestsListFilterParameter customerId(String customerId) {
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


  public GetAuthorizationRequestsListFilterParameter merchantCategoryCode(List<String> merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  public GetAuthorizationRequestsListFilterParameter addMerchantCategoryCodeItem(String merchantCategoryCodeItem) {
    if (this.merchantCategoryCode == null) {
      this.merchantCategoryCode = new ArrayList<>();
    }
    this.merchantCategoryCode.add(merchantCategoryCodeItem);
    return this;
  }

  /**
   * Get merchantCategoryCode
   * @return merchantCategoryCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_CATEGORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMerchantCategoryCode() {
    return merchantCategoryCode;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CATEGORY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCategoryCode(List<String> merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public GetAuthorizationRequestsListFilterParameter fromAmount(Integer fromAmount) {
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


  public GetAuthorizationRequestsListFilterParameter toAmount(Integer toAmount) {
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


  /**
   * Return true if this getAuthorizationRequestsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuthorizationRequestsListFilterParameter getAuthorizationRequestsListFilterParameter = (GetAuthorizationRequestsListFilterParameter) o;
    return Objects.equals(this.accountId, getAuthorizationRequestsListFilterParameter.accountId) &&
        Objects.equals(this.customerId, getAuthorizationRequestsListFilterParameter.customerId) &&
        Objects.equals(this.merchantCategoryCode, getAuthorizationRequestsListFilterParameter.merchantCategoryCode) &&
        Objects.equals(this.fromAmount, getAuthorizationRequestsListFilterParameter.fromAmount) &&
        Objects.equals(this.toAmount, getAuthorizationRequestsListFilterParameter.toAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, merchantCategoryCode, fromAmount, toAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuthorizationRequestsListFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
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

    // add `merchantCategoryCode` to the URL query string
    if (getMerchantCategoryCode() != null) {
      for (int i = 0; i < getMerchantCategoryCode().size(); i++) {
        joiner.add(String.format("%smerchantCategoryCode%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getMerchantCategoryCode().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `fromAmount` to the URL query string
    if (getFromAmount() != null) {
      joiner.add(String.format("%sfromAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toAmount` to the URL query string
    if (getToAmount() != null) {
      joiner.add(String.format("%stoAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

