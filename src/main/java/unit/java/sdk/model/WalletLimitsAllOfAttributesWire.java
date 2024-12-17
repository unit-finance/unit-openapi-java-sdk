/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
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
import unit.java.sdk.model.WalletLimitsAllOfAttributesWireLimits;
import unit.java.sdk.model.WalletLimitsAllOfAttributesWireTotalsDaily;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * WalletLimitsAllOfAttributesWire
 */
@JsonPropertyOrder({
  WalletLimitsAllOfAttributesWire.JSON_PROPERTY_LIMITS,
  WalletLimitsAllOfAttributesWire.JSON_PROPERTY_TOTALS_DAILY,
  WalletLimitsAllOfAttributesWire.JSON_PROPERTY_TOTALS_MONTLY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WalletLimitsAllOfAttributesWire {
  public static final String JSON_PROPERTY_LIMITS = "limits";
  private WalletLimitsAllOfAttributesWireLimits limits;

  public static final String JSON_PROPERTY_TOTALS_DAILY = "totalsDaily";
  private WalletLimitsAllOfAttributesWireTotalsDaily totalsDaily;

  public static final String JSON_PROPERTY_TOTALS_MONTLY = "totalsMontly";
  private WalletLimitsAllOfAttributesWireTotalsDaily totalsMontly;

  public WalletLimitsAllOfAttributesWire() { 
  }

  public WalletLimitsAllOfAttributesWire limits(WalletLimitsAllOfAttributesWireLimits limits) {
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
  public WalletLimitsAllOfAttributesWireLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimits(WalletLimitsAllOfAttributesWireLimits limits) {
    this.limits = limits;
  }


  public WalletLimitsAllOfAttributesWire totalsDaily(WalletLimitsAllOfAttributesWireTotalsDaily totalsDaily) {
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
  public WalletLimitsAllOfAttributesWireTotalsDaily getTotalsDaily() {
    return totalsDaily;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS_DAILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalsDaily(WalletLimitsAllOfAttributesWireTotalsDaily totalsDaily) {
    this.totalsDaily = totalsDaily;
  }


  public WalletLimitsAllOfAttributesWire totalsMontly(WalletLimitsAllOfAttributesWireTotalsDaily totalsMontly) {
    this.totalsMontly = totalsMontly;
    return this;
  }

  /**
   * Get totalsMontly
   * @return totalsMontly
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTALS_MONTLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WalletLimitsAllOfAttributesWireTotalsDaily getTotalsMontly() {
    return totalsMontly;
  }


  @JsonProperty(JSON_PROPERTY_TOTALS_MONTLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalsMontly(WalletLimitsAllOfAttributesWireTotalsDaily totalsMontly) {
    this.totalsMontly = totalsMontly;
  }


  /**
   * Return true if this WalletLimits_allOf_attributes_wire object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletLimitsAllOfAttributesWire walletLimitsAllOfAttributesWire = (WalletLimitsAllOfAttributesWire) o;
    return Objects.equals(this.limits, walletLimitsAllOfAttributesWire.limits) &&
        Objects.equals(this.totalsDaily, walletLimitsAllOfAttributesWire.totalsDaily) &&
        Objects.equals(this.totalsMontly, walletLimitsAllOfAttributesWire.totalsMontly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, totalsDaily, totalsMontly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletLimitsAllOfAttributesWire {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    totalsDaily: ").append(toIndentedString(totalsDaily)).append("\n");
    sb.append("    totalsMontly: ").append(toIndentedString(totalsMontly)).append("\n");
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

    // add `totalsMontly` to the URL query string
    if (getTotalsMontly() != null) {
      joiner.add(getTotalsMontly().toUrlQueryString(prefix + "totalsMontly" + suffix));
    }

    return joiner.toString();
  }
}

