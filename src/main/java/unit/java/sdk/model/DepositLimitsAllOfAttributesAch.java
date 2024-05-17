/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.4
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
import java.util.Arrays;
import unit.java.sdk.model.DepositLimitsAllOfAttributesAchLimits;
import unit.java.sdk.model.DepositLimitsAllOfAttributesAchTotalsDaily;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DepositLimitsAllOfAttributesAch
 */
@JsonPropertyOrder({
  DepositLimitsAllOfAttributesAch.JSON_PROPERTY_LIMITS,
  DepositLimitsAllOfAttributesAch.JSON_PROPERTY_TOTALS_DAILY,
  DepositLimitsAllOfAttributesAch.JSON_PROPERTY_TOTALS_MONTHLY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositLimitsAllOfAttributesAch {
  public static final String JSON_PROPERTY_LIMITS = "limits";
  private DepositLimitsAllOfAttributesAchLimits limits;

  public static final String JSON_PROPERTY_TOTALS_DAILY = "totalsDaily";
  private DepositLimitsAllOfAttributesAchTotalsDaily totalsDaily;

  public static final String JSON_PROPERTY_TOTALS_MONTHLY = "totalsMonthly";
  private DepositLimitsAllOfAttributesAchTotalsDaily totalsMonthly;

  public DepositLimitsAllOfAttributesAch() { 
  }

  public DepositLimitsAllOfAttributesAch limits(DepositLimitsAllOfAttributesAchLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DepositLimitsAllOfAttributesAchLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimits(DepositLimitsAllOfAttributesAchLimits limits) {
    this.limits = limits;
  }


  public DepositLimitsAllOfAttributesAch totalsDaily(DepositLimitsAllOfAttributesAchTotalsDaily totalsDaily) {
    this.totalsDaily = totalsDaily;
    return this;
  }

   /**
   * Get totalsDaily
   * @return totalsDaily
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTALS_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DepositLimitsAllOfAttributesAchTotalsDaily getTotalsDaily() {
    return totalsDaily;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalsDaily(DepositLimitsAllOfAttributesAchTotalsDaily totalsDaily) {
    this.totalsDaily = totalsDaily;
  }


  public DepositLimitsAllOfAttributesAch totalsMonthly(DepositLimitsAllOfAttributesAchTotalsDaily totalsMonthly) {
    this.totalsMonthly = totalsMonthly;
    return this;
  }

   /**
   * Get totalsMonthly
   * @return totalsMonthly
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTALS_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DepositLimitsAllOfAttributesAchTotalsDaily getTotalsMonthly() {
    return totalsMonthly;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalsMonthly(DepositLimitsAllOfAttributesAchTotalsDaily totalsMonthly) {
    this.totalsMonthly = totalsMonthly;
  }


  /**
   * Return true if this DepositLimits_allOf_attributes_ach object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesAch depositLimitsAllOfAttributesAch = (DepositLimitsAllOfAttributesAch) o;
    return Objects.equals(this.limits, depositLimitsAllOfAttributesAch.limits) &&
        Objects.equals(this.totalsDaily, depositLimitsAllOfAttributesAch.totalsDaily) &&
        Objects.equals(this.totalsMonthly, depositLimitsAllOfAttributesAch.totalsMonthly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, totalsDaily, totalsMonthly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesAch {\n");
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
      joiner.add(getTotalsDaily().toUrlQueryString(prefix + "totalsDaily" + suffix));
    }

    // add `totalsMonthly` to the URL query string
    if (getTotalsMonthly() != null) {
      joiner.add(getTotalsMonthly().toUrlQueryString(prefix + "totalsMonthly" + suffix));
    }

    return joiner.toString();
  }
}

