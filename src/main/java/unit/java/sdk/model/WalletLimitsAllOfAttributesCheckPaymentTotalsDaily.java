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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * WalletLimitsAllOfAttributesCheckPaymentTotalsDaily
 */
@JsonPropertyOrder({
  WalletLimitsAllOfAttributesCheckPaymentTotalsDaily.JSON_PROPERTY_SENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WalletLimitsAllOfAttributesCheckPaymentTotalsDaily {
  public static final String JSON_PROPERTY_SENT = "sent";
  private BigDecimal sent;

  public WalletLimitsAllOfAttributesCheckPaymentTotalsDaily() { 
  }

  public WalletLimitsAllOfAttributesCheckPaymentTotalsDaily sent(BigDecimal sent) {
    this.sent = sent;
    return this;
  }

  /**
   * Get sent
   * @return sent
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getSent() {
    return sent;
  }


  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSent(BigDecimal sent) {
    this.sent = sent;
  }


  /**
   * Return true if this WalletLimits_allOf_attributes_checkPayment_totalsDaily object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletLimitsAllOfAttributesCheckPaymentTotalsDaily walletLimitsAllOfAttributesCheckPaymentTotalsDaily = (WalletLimitsAllOfAttributesCheckPaymentTotalsDaily) o;
    return Objects.equals(this.sent, walletLimitsAllOfAttributesCheckPaymentTotalsDaily.sent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletLimitsAllOfAttributesCheckPaymentTotalsDaily {\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
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

    // add `sent` to the URL query string
    if (getSent() != null) {
      joiner.add(String.format("%ssent%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

