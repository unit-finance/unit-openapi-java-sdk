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
 * CreateAchRepaymentAttributes
 */
@JsonPropertyOrder({
  CreateAchRepaymentAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateAchRepaymentAttributes.JSON_PROPERTY_AMOUNT,
  CreateAchRepaymentAttributes.JSON_PROPERTY_ADDENDA,
  CreateAchRepaymentAttributes.JSON_PROPERTY_SAME_DAY,
  CreateAchRepaymentAttributes.JSON_PROPERTY_SEC_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateAchRepaymentAttributes {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  public static final String JSON_PROPERTY_SAME_DAY = "sameDay";
  private Boolean sameDay;

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private String secCode;

  public CreateAchRepaymentAttributes() { 
  }

  public CreateAchRepaymentAttributes description(String description) {
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


  public CreateAchRepaymentAttributes amount(BigDecimal amount) {
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
  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public CreateAchRepaymentAttributes addenda(String addenda) {
    this.addenda = addenda;
    return this;
  }

  /**
   * Get addenda
   * @return addenda
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDENDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddenda() {
    return addenda;
  }


  @JsonProperty(JSON_PROPERTY_ADDENDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddenda(String addenda) {
    this.addenda = addenda;
  }


  public CreateAchRepaymentAttributes sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

  /**
   * Get sameDay
   * @return sameDay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSameDay() {
    return sameDay;
  }


  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }


  public CreateAchRepaymentAttributes secCode(String secCode) {
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
   * Return true if this CreateAchRepayment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchRepaymentAttributes createAchRepaymentAttributes = (CreateAchRepaymentAttributes) o;
    return Objects.equals(this.description, createAchRepaymentAttributes.description) &&
        Objects.equals(this.amount, createAchRepaymentAttributes.amount) &&
        Objects.equals(this.addenda, createAchRepaymentAttributes.addenda) &&
        Objects.equals(this.sameDay, createAchRepaymentAttributes.sameDay) &&
        Objects.equals(this.secCode, createAchRepaymentAttributes.secCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, amount, addenda, sameDay, secCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchRepaymentAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sameDay` to the URL query string
    if (getSameDay() != null) {
      joiner.add(String.format("%ssameDay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSameDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

