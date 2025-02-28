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
import java.time.LocalDate;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateACHReceivedPaymentTransactionRequestDataAttributes
 */
@JsonPropertyOrder({
  CreateACHReceivedPaymentTransactionRequestDataAttributes.JSON_PROPERTY_AMOUNT,
  CreateACHReceivedPaymentTransactionRequestDataAttributes.JSON_PROPERTY_COMPLETION_DATE,
  CreateACHReceivedPaymentTransactionRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateACHReceivedPaymentTransactionRequestDataAttributes.JSON_PROPERTY_COMPANY_NAME,
  CreateACHReceivedPaymentTransactionRequestDataAttributes.JSON_PROPERTY_SEC_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateACHReceivedPaymentTransactionRequestDataAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_COMPLETION_DATE = "completionDate";
  private LocalDate completionDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private String secCode;

  public CreateACHReceivedPaymentTransactionRequestDataAttributes() { 
  }

  public CreateACHReceivedPaymentTransactionRequestDataAttributes amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CreateACHReceivedPaymentTransactionRequestDataAttributes completionDate(LocalDate completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Get completionDate
   * @return completionDate
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLETION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getCompletionDate() {
    return completionDate;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompletionDate(LocalDate completionDate) {
    this.completionDate = completionDate;
  }


  public CreateACHReceivedPaymentTransactionRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateACHReceivedPaymentTransactionRequestDataAttributes companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public CreateACHReceivedPaymentTransactionRequestDataAttributes secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

  /**
   * Get secCode
   * @return secCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecCode() {
    return secCode;
  }


  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }


  /**
   * Return true if this CreateACHReceivedPaymentTransactionRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateACHReceivedPaymentTransactionRequestDataAttributes createACHReceivedPaymentTransactionRequestDataAttributes = (CreateACHReceivedPaymentTransactionRequestDataAttributes) o;
    return Objects.equals(this.amount, createACHReceivedPaymentTransactionRequestDataAttributes.amount) &&
        Objects.equals(this.completionDate, createACHReceivedPaymentTransactionRequestDataAttributes.completionDate) &&
        Objects.equals(this.description, createACHReceivedPaymentTransactionRequestDataAttributes.description) &&
        Objects.equals(this.companyName, createACHReceivedPaymentTransactionRequestDataAttributes.companyName) &&
        Objects.equals(this.secCode, createACHReceivedPaymentTransactionRequestDataAttributes.secCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, completionDate, description, companyName, secCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateACHReceivedPaymentTransactionRequestDataAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `completionDate` to the URL query string
    if (getCompletionDate() != null) {
      joiner.add(String.format("%scompletionDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCompletionDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCompanyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

