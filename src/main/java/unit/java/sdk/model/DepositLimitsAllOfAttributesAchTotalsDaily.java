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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DepositLimitsAllOfAttributesAchTotalsDaily
 */
@JsonPropertyOrder({
  DepositLimitsAllOfAttributesAchTotalsDaily.JSON_PROPERTY_DEBITS,
  DepositLimitsAllOfAttributesAchTotalsDaily.JSON_PROPERTY_CREDITS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositLimitsAllOfAttributesAchTotalsDaily {
  public static final String JSON_PROPERTY_DEBITS = "debits";
  private BigDecimal debits;

  public static final String JSON_PROPERTY_CREDITS = "credits";
  private BigDecimal credits;

  public DepositLimitsAllOfAttributesAchTotalsDaily() { 
  }

  public DepositLimitsAllOfAttributesAchTotalsDaily debits(BigDecimal debits) {
    this.debits = debits;
    return this;
  }

   /**
   * Get debits
   * @return debits
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEBITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getDebits() {
    return debits;
  }


  @JsonProperty(JSON_PROPERTY_DEBITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDebits(BigDecimal debits) {
    this.debits = debits;
  }


  public DepositLimitsAllOfAttributesAchTotalsDaily credits(BigDecimal credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getCredits() {
    return credits;
  }


  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredits(BigDecimal credits) {
    this.credits = credits;
  }


  /**
   * Return true if this DepositLimits_allOf_attributes_ach_totalsDaily object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesAchTotalsDaily depositLimitsAllOfAttributesAchTotalsDaily = (DepositLimitsAllOfAttributesAchTotalsDaily) o;
    return Objects.equals(this.debits, depositLimitsAllOfAttributesAchTotalsDaily.debits) &&
        Objects.equals(this.credits, depositLimitsAllOfAttributesAchTotalsDaily.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debits, credits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesAchTotalsDaily {\n");
    sb.append("    debits: ").append(toIndentedString(debits)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
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

    // add `debits` to the URL query string
    if (getDebits() != null) {
      joiner.add(String.format("%sdebits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDebits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `credits` to the URL query string
    if (getCredits() != null) {
      joiner.add(String.format("%scredits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCredits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

