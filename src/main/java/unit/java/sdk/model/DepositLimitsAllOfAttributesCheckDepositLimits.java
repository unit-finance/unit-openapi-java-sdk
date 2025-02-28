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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * DepositLimitsAllOfAttributesCheckDepositLimits
 */
@JsonPropertyOrder({
  DepositLimitsAllOfAttributesCheckDepositLimits.JSON_PROPERTY_DAILY,
  DepositLimitsAllOfAttributesCheckDepositLimits.JSON_PROPERTY_MONTHLY,
  DepositLimitsAllOfAttributesCheckDepositLimits.JSON_PROPERTY_DAILY_SOFT,
  DepositLimitsAllOfAttributesCheckDepositLimits.JSON_PROPERTY_MONTHLY_SOFT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DepositLimitsAllOfAttributesCheckDepositLimits {
  public static final String JSON_PROPERTY_DAILY = "daily";
  private BigDecimal daily;

  public static final String JSON_PROPERTY_MONTHLY = "monthly";
  private BigDecimal monthly;

  public static final String JSON_PROPERTY_DAILY_SOFT = "dailySoft";
  private BigDecimal dailySoft;

  public static final String JSON_PROPERTY_MONTHLY_SOFT = "monthlySoft";
  private BigDecimal monthlySoft;

  public DepositLimitsAllOfAttributesCheckDepositLimits() { 
  }

  public DepositLimitsAllOfAttributesCheckDepositLimits daily(BigDecimal daily) {
    this.daily = daily;
    return this;
  }

  /**
   * Get daily
   * @return daily
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDaily() {
    return daily;
  }


  @JsonProperty(JSON_PROPERTY_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDaily(BigDecimal daily) {
    this.daily = daily;
  }


  public DepositLimitsAllOfAttributesCheckDepositLimits monthly(BigDecimal monthly) {
    this.monthly = monthly;
    return this;
  }

  /**
   * Get monthly
   * @return monthly
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getMonthly() {
    return monthly;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonthly(BigDecimal monthly) {
    this.monthly = monthly;
  }


  public DepositLimitsAllOfAttributesCheckDepositLimits dailySoft(BigDecimal dailySoft) {
    this.dailySoft = dailySoft;
    return this;
  }

  /**
   * Get dailySoft
   * @return dailySoft
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DAILY_SOFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDailySoft() {
    return dailySoft;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_SOFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailySoft(BigDecimal dailySoft) {
    this.dailySoft = dailySoft;
  }


  public DepositLimitsAllOfAttributesCheckDepositLimits monthlySoft(BigDecimal monthlySoft) {
    this.monthlySoft = monthlySoft;
    return this;
  }

  /**
   * Get monthlySoft
   * @return monthlySoft
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MONTHLY_SOFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getMonthlySoft() {
    return monthlySoft;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_SOFT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonthlySoft(BigDecimal monthlySoft) {
    this.monthlySoft = monthlySoft;
  }


  /**
   * Return true if this DepositLimits_allOf_attributes_checkDeposit_limits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesCheckDepositLimits depositLimitsAllOfAttributesCheckDepositLimits = (DepositLimitsAllOfAttributesCheckDepositLimits) o;
    return Objects.equals(this.daily, depositLimitsAllOfAttributesCheckDepositLimits.daily) &&
        Objects.equals(this.monthly, depositLimitsAllOfAttributesCheckDepositLimits.monthly) &&
        Objects.equals(this.dailySoft, depositLimitsAllOfAttributesCheckDepositLimits.dailySoft) &&
        Objects.equals(this.monthlySoft, depositLimitsAllOfAttributesCheckDepositLimits.monthlySoft);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daily, monthly, dailySoft, monthlySoft);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesCheckDepositLimits {\n");
    sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
    sb.append("    monthly: ").append(toIndentedString(monthly)).append("\n");
    sb.append("    dailySoft: ").append(toIndentedString(dailySoft)).append("\n");
    sb.append("    monthlySoft: ").append(toIndentedString(monthlySoft)).append("\n");
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

    // add `daily` to the URL query string
    if (getDaily() != null) {
      joiner.add(String.format("%sdaily%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDaily()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `monthly` to the URL query string
    if (getMonthly() != null) {
      joiner.add(String.format("%smonthly%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMonthly()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dailySoft` to the URL query string
    if (getDailySoft() != null) {
      joiner.add(String.format("%sdailySoft%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDailySoft()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `monthlySoft` to the URL query string
    if (getMonthlySoft() != null) {
      joiner.add(String.format("%smonthlySoft%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMonthlySoft()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

