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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DepositAccountAllOfAttributesSecondaryAccountNumber
 */
@JsonPropertyOrder({
  DepositAccountAllOfAttributesSecondaryAccountNumber.JSON_PROPERTY_ROUTING_NUMBER,
  DepositAccountAllOfAttributesSecondaryAccountNumber.JSON_PROPERTY_ACCOUNT_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositAccountAllOfAttributesSecondaryAccountNumber {
  public static final String JSON_PROPERTY_ROUTING_NUMBER = "routingNumber";
  private String routingNumber;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public DepositAccountAllOfAttributesSecondaryAccountNumber() { 
  }

  public DepositAccountAllOfAttributesSecondaryAccountNumber routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoutingNumber() {
    return routingNumber;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public DepositAccountAllOfAttributesSecondaryAccountNumber accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  /**
   * Return true if this DepositAccount_allOf_attributes_secondaryAccountNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountAllOfAttributesSecondaryAccountNumber depositAccountAllOfAttributesSecondaryAccountNumber = (DepositAccountAllOfAttributesSecondaryAccountNumber) o;
    return Objects.equals(this.routingNumber, depositAccountAllOfAttributesSecondaryAccountNumber.routingNumber) &&
        Objects.equals(this.accountNumber, depositAccountAllOfAttributesSecondaryAccountNumber.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountAllOfAttributesSecondaryAccountNumber {\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

    // add `routingNumber` to the URL query string
    if (getRoutingNumber() != null) {
      joiner.add(String.format("%sroutingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountNumber` to the URL query string
    if (getAccountNumber() != null) {
      joiner.add(String.format("%saccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

