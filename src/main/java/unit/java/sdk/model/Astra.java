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
 * Astra
 */
@JsonPropertyOrder({
  Astra.JSON_PROPERTY_AUTH_TOKEN,
  Astra.JSON_PROPERTY_DEBIT_FEE_PERCENT,
  Astra.JSON_PROPERTY_INSTITUTION_ID,
  Astra.JSON_PROPERTY_DESTINATION_CARD_ID,
  Astra.JSON_PROPERTY_ROUTING_NUMBER,
  Astra.JSON_PROPERTY_ACCOUNT_NUMBER,
  Astra.JSON_PROPERTY_ACCOUNT_NAME,
  Astra.JSON_PROPERTY_REFERENCE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class Astra {
  public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
  private String authToken;

  public static final String JSON_PROPERTY_DEBIT_FEE_PERCENT = "debitFeePercent";
  private BigDecimal debitFeePercent;

  public static final String JSON_PROPERTY_INSTITUTION_ID = "institutionId";
  private String institutionId;

  public static final String JSON_PROPERTY_DESTINATION_CARD_ID = "destinationCardId";
  private String destinationCardId;

  public static final String JSON_PROPERTY_ROUTING_NUMBER = "routingNumber";
  private String routingNumber;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_REFERENCE_ID = "referenceId";
  private String referenceId;

  public Astra() { 
  }

  public Astra authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

  /**
   * Get authToken
   * @return authToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthToken() {
    return authToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public Astra debitFeePercent(BigDecimal debitFeePercent) {
    this.debitFeePercent = debitFeePercent;
    return this;
  }

  /**
   * Get debitFeePercent
   * @return debitFeePercent
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEBIT_FEE_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public BigDecimal getDebitFeePercent() {
    return debitFeePercent;
  }


  @JsonProperty(JSON_PROPERTY_DEBIT_FEE_PERCENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDebitFeePercent(BigDecimal debitFeePercent) {
    this.debitFeePercent = debitFeePercent;
  }


  public Astra institutionId(String institutionId) {
    this.institutionId = institutionId;
    return this;
  }

  /**
   * Get institutionId
   * @return institutionId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInstitutionId() {
    return institutionId;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public Astra destinationCardId(String destinationCardId) {
    this.destinationCardId = destinationCardId;
    return this;
  }

  /**
   * Get destinationCardId
   * @return destinationCardId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESTINATION_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDestinationCardId() {
    return destinationCardId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestinationCardId(String destinationCardId) {
    this.destinationCardId = destinationCardId;
  }


  public Astra routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  /**
   * Get routingNumber
   * @return routingNumber
   */
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


  public Astra accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   */
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


  public Astra accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountName() {
    return accountName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public Astra referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReferenceId() {
    return referenceId;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  /**
   * Return true if this Astra object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Astra astra = (Astra) o;
    return Objects.equals(this.authToken, astra.authToken) &&
        Objects.equals(this.debitFeePercent, astra.debitFeePercent) &&
        Objects.equals(this.institutionId, astra.institutionId) &&
        Objects.equals(this.destinationCardId, astra.destinationCardId) &&
        Objects.equals(this.routingNumber, astra.routingNumber) &&
        Objects.equals(this.accountNumber, astra.accountNumber) &&
        Objects.equals(this.accountName, astra.accountName) &&
        Objects.equals(this.referenceId, astra.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authToken, debitFeePercent, institutionId, destinationCardId, routingNumber, accountNumber, accountName, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Astra {\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    debitFeePercent: ").append(toIndentedString(debitFeePercent)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    destinationCardId: ").append(toIndentedString(destinationCardId)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

    // add `authToken` to the URL query string
    if (getAuthToken() != null) {
      joiner.add(String.format("%sauthToken%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAuthToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `debitFeePercent` to the URL query string
    if (getDebitFeePercent() != null) {
      joiner.add(String.format("%sdebitFeePercent%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDebitFeePercent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `institutionId` to the URL query string
    if (getInstitutionId() != null) {
      joiner.add(String.format("%sinstitutionId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInstitutionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `destinationCardId` to the URL query string
    if (getDestinationCardId() != null) {
      joiner.add(String.format("%sdestinationCardId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDestinationCardId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routingNumber` to the URL query string
    if (getRoutingNumber() != null) {
      joiner.add(String.format("%sroutingNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountNumber` to the URL query string
    if (getAccountNumber() != null) {
      joiner.add(String.format("%saccountNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccountNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountName` to the URL query string
    if (getAccountName() != null) {
      joiner.add(String.format("%saccountName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccountName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `referenceId` to the URL query string
    if (getReferenceId() != null) {
      joiner.add(String.format("%sreferenceId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReferenceId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

