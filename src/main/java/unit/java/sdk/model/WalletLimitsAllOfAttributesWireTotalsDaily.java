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
 * WalletLimitsAllOfAttributesWireTotalsDaily
 */
@JsonPropertyOrder({
  WalletLimitsAllOfAttributesWireTotalsDaily.JSON_PROPERTY_TRANSFERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WalletLimitsAllOfAttributesWireTotalsDaily {
  public static final String JSON_PROPERTY_TRANSFERS = "transfers";
  private BigDecimal transfers;

  public WalletLimitsAllOfAttributesWireTotalsDaily() { 
  }

  public WalletLimitsAllOfAttributesWireTotalsDaily transfers(BigDecimal transfers) {
    this.transfers = transfers;
    return this;
  }

  /**
   * Get transfers
   * @return transfers
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSFERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getTransfers() {
    return transfers;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransfers(BigDecimal transfers) {
    this.transfers = transfers;
  }


  /**
   * Return true if this WalletLimits_allOf_attributes_wire_totalsDaily object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletLimitsAllOfAttributesWireTotalsDaily walletLimitsAllOfAttributesWireTotalsDaily = (WalletLimitsAllOfAttributesWireTotalsDaily) o;
    return Objects.equals(this.transfers, walletLimitsAllOfAttributesWireTotalsDaily.transfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletLimitsAllOfAttributesWireTotalsDaily {\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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

    // add `transfers` to the URL query string
    if (getTransfers() != null) {
      joiner.add(String.format("%stransfers%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTransfers()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
