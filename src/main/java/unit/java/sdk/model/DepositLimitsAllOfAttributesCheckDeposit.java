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
import unit.java.sdk.model.DepositLimitsAllOfAttributesCheckDepositLimits;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * DepositLimitsAllOfAttributesCheckDeposit
 */
@JsonPropertyOrder({
  DepositLimitsAllOfAttributesCheckDeposit.JSON_PROPERTY_LIMITS,
  DepositLimitsAllOfAttributesCheckDeposit.JSON_PROPERTY_TOTALS_DAILY,
  DepositLimitsAllOfAttributesCheckDeposit.JSON_PROPERTY_TOTALS_MONTHLY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DepositLimitsAllOfAttributesCheckDeposit {
  public static final String JSON_PROPERTY_LIMITS = "limits";
  private DepositLimitsAllOfAttributesCheckDepositLimits limits;

  public static final String JSON_PROPERTY_TOTALS_DAILY = "totalsDaily";
  private BigDecimal totalsDaily;

  public static final String JSON_PROPERTY_TOTALS_MONTHLY = "totalsMonthly";
  private BigDecimal totalsMonthly;

  public DepositLimitsAllOfAttributesCheckDeposit() { 
  }

  public DepositLimitsAllOfAttributesCheckDeposit limits(DepositLimitsAllOfAttributesCheckDepositLimits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   * @return limits
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DepositLimitsAllOfAttributesCheckDepositLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimits(DepositLimitsAllOfAttributesCheckDepositLimits limits) {
    this.limits = limits;
  }


  public DepositLimitsAllOfAttributesCheckDeposit totalsDaily(BigDecimal totalsDaily) {
    this.totalsDaily = totalsDaily;
    return this;
  }

  /**
   * Get totalsDaily
   * @return totalsDaily
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTALS_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getTotalsDaily() {
    return totalsDaily;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalsDaily(BigDecimal totalsDaily) {
    this.totalsDaily = totalsDaily;
  }


  public DepositLimitsAllOfAttributesCheckDeposit totalsMonthly(BigDecimal totalsMonthly) {
    this.totalsMonthly = totalsMonthly;
    return this;
  }

  /**
   * Get totalsMonthly
   * @return totalsMonthly
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTALS_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getTotalsMonthly() {
    return totalsMonthly;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalsMonthly(BigDecimal totalsMonthly) {
    this.totalsMonthly = totalsMonthly;
  }


  /**
   * Return true if this DepositLimits_allOf_attributes_checkDeposit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesCheckDeposit depositLimitsAllOfAttributesCheckDeposit = (DepositLimitsAllOfAttributesCheckDeposit) o;
    return Objects.equals(this.limits, depositLimitsAllOfAttributesCheckDeposit.limits) &&
        Objects.equals(this.totalsDaily, depositLimitsAllOfAttributesCheckDeposit.totalsDaily) &&
        Objects.equals(this.totalsMonthly, depositLimitsAllOfAttributesCheckDeposit.totalsMonthly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, totalsDaily, totalsMonthly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesCheckDeposit {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    totalsDaily: ").append(toIndentedString(totalsDaily)).append("\n");
    sb.append("    totalsMonthly: ").append(toIndentedString(totalsMonthly)).append("\n");
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

    // add `limits` to the URL query string
    if (getLimits() != null) {
      joiner.add(getLimits().toUrlQueryString(prefix + "limits" + suffix));
    }

    // add `totalsDaily` to the URL query string
    if (getTotalsDaily() != null) {
      joiner.add(String.format("%stotalsDaily%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTotalsDaily()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalsMonthly` to the URL query string
    if (getTotalsMonthly() != null) {
      joiner.add(String.format("%stotalsMonthly%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTotalsMonthly()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

