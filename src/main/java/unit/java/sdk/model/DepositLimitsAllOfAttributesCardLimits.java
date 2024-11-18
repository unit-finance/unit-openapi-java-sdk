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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * DepositLimitsAllOfAttributesCardLimits
 */
@JsonPropertyOrder({
  DepositLimitsAllOfAttributesCardLimits.JSON_PROPERTY_DAILY_WITHDRAWAL,
  DepositLimitsAllOfAttributesCardLimits.JSON_PROPERTY_DAILY_DEPOSIT,
  DepositLimitsAllOfAttributesCardLimits.JSON_PROPERTY_DAILY_PURCHASE,
  DepositLimitsAllOfAttributesCardLimits.JSON_PROPERTY_DAILY_CARD_TRANSACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DepositLimitsAllOfAttributesCardLimits {
  public static final String JSON_PROPERTY_DAILY_WITHDRAWAL = "dailyWithdrawal";
  private BigDecimal dailyWithdrawal;

  public static final String JSON_PROPERTY_DAILY_DEPOSIT = "dailyDeposit";
  private BigDecimal dailyDeposit;

  public static final String JSON_PROPERTY_DAILY_PURCHASE = "dailyPurchase";
  private BigDecimal dailyPurchase;

  public static final String JSON_PROPERTY_DAILY_CARD_TRANSACTION = "dailyCardTransaction";
  private BigDecimal dailyCardTransaction;

  public DepositLimitsAllOfAttributesCardLimits() { 
  }

  public DepositLimitsAllOfAttributesCardLimits dailyWithdrawal(BigDecimal dailyWithdrawal) {
    this.dailyWithdrawal = dailyWithdrawal;
    return this;
  }

  /**
   * Get dailyWithdrawal
   * @return dailyWithdrawal
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DAILY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDailyWithdrawal() {
    return dailyWithdrawal;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyWithdrawal(BigDecimal dailyWithdrawal) {
    this.dailyWithdrawal = dailyWithdrawal;
  }


  public DepositLimitsAllOfAttributesCardLimits dailyDeposit(BigDecimal dailyDeposit) {
    this.dailyDeposit = dailyDeposit;
    return this;
  }

  /**
   * Get dailyDeposit
   * @return dailyDeposit
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DAILY_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDailyDeposit() {
    return dailyDeposit;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyDeposit(BigDecimal dailyDeposit) {
    this.dailyDeposit = dailyDeposit;
  }


  public DepositLimitsAllOfAttributesCardLimits dailyPurchase(BigDecimal dailyPurchase) {
    this.dailyPurchase = dailyPurchase;
    return this;
  }

  /**
   * Get dailyPurchase
   * @return dailyPurchase
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DAILY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDailyPurchase() {
    return dailyPurchase;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyPurchase(BigDecimal dailyPurchase) {
    this.dailyPurchase = dailyPurchase;
  }


  public DepositLimitsAllOfAttributesCardLimits dailyCardTransaction(BigDecimal dailyCardTransaction) {
    this.dailyCardTransaction = dailyCardTransaction;
    return this;
  }

  /**
   * Get dailyCardTransaction
   * @return dailyCardTransaction
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DAILY_CARD_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDailyCardTransaction() {
    return dailyCardTransaction;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_CARD_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyCardTransaction(BigDecimal dailyCardTransaction) {
    this.dailyCardTransaction = dailyCardTransaction;
  }


  /**
   * Return true if this DepositLimits_allOf_attributes_card_limits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesCardLimits depositLimitsAllOfAttributesCardLimits = (DepositLimitsAllOfAttributesCardLimits) o;
    return Objects.equals(this.dailyWithdrawal, depositLimitsAllOfAttributesCardLimits.dailyWithdrawal) &&
        Objects.equals(this.dailyDeposit, depositLimitsAllOfAttributesCardLimits.dailyDeposit) &&
        Objects.equals(this.dailyPurchase, depositLimitsAllOfAttributesCardLimits.dailyPurchase) &&
        Objects.equals(this.dailyCardTransaction, depositLimitsAllOfAttributesCardLimits.dailyCardTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyWithdrawal, dailyDeposit, dailyPurchase, dailyCardTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesCardLimits {\n");
    sb.append("    dailyWithdrawal: ").append(toIndentedString(dailyWithdrawal)).append("\n");
    sb.append("    dailyDeposit: ").append(toIndentedString(dailyDeposit)).append("\n");
    sb.append("    dailyPurchase: ").append(toIndentedString(dailyPurchase)).append("\n");
    sb.append("    dailyCardTransaction: ").append(toIndentedString(dailyCardTransaction)).append("\n");
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

    // add `dailyWithdrawal` to the URL query string
    if (getDailyWithdrawal() != null) {
      joiner.add(String.format("%sdailyWithdrawal%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDailyWithdrawal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dailyDeposit` to the URL query string
    if (getDailyDeposit() != null) {
      joiner.add(String.format("%sdailyDeposit%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDailyDeposit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dailyPurchase` to the URL query string
    if (getDailyPurchase() != null) {
      joiner.add(String.format("%sdailyPurchase%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDailyPurchase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dailyCardTransaction` to the URL query string
    if (getDailyCardTransaction() != null) {
      joiner.add(String.format("%sdailyCardTransaction%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDailyCardTransaction()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
