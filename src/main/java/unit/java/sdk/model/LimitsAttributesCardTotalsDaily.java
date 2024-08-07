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


/**
 * LimitsAttributesCardTotalsDaily
 */
@JsonPropertyOrder({
  LimitsAttributesCardTotalsDaily.JSON_PROPERTY_WITHDRAWAL,
  LimitsAttributesCardTotalsDaily.JSON_PROPERTY_DEPOSIT,
  LimitsAttributesCardTotalsDaily.JSON_PROPERTY_PURCHASE,
  LimitsAttributesCardTotalsDaily.JSON_PROPERTY_CARD_TRANSACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class LimitsAttributesCardTotalsDaily {
  public static final String JSON_PROPERTY_WITHDRAWAL = "withdrawal";
  private BigDecimal withdrawal;

  public static final String JSON_PROPERTY_DEPOSIT = "deposit";
  private BigDecimal deposit;

  public static final String JSON_PROPERTY_PURCHASE = "purchase";
  private BigDecimal purchase;

  public static final String JSON_PROPERTY_CARD_TRANSACTION = "cardTransaction";
  private BigDecimal cardTransaction;

  public LimitsAttributesCardTotalsDaily() { 
  }

  public LimitsAttributesCardTotalsDaily withdrawal(BigDecimal withdrawal) {
    this.withdrawal = withdrawal;
    return this;
  }

   /**
   * Get withdrawal
   * @return withdrawal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWithdrawal() {
    return withdrawal;
  }


  @JsonProperty(JSON_PROPERTY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithdrawal(BigDecimal withdrawal) {
    this.withdrawal = withdrawal;
  }


  public LimitsAttributesCardTotalsDaily deposit(BigDecimal deposit) {
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDeposit() {
    return deposit;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeposit(BigDecimal deposit) {
    this.deposit = deposit;
  }


  public LimitsAttributesCardTotalsDaily purchase(BigDecimal purchase) {
    this.purchase = purchase;
    return this;
  }

   /**
   * Get purchase
   * @return purchase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPurchase() {
    return purchase;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchase(BigDecimal purchase) {
    this.purchase = purchase;
  }


  public LimitsAttributesCardTotalsDaily cardTransaction(BigDecimal cardTransaction) {
    this.cardTransaction = cardTransaction;
    return this;
  }

   /**
   * Get cardTransaction
   * @return cardTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCardTransaction() {
    return cardTransaction;
  }


  @JsonProperty(JSON_PROPERTY_CARD_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardTransaction(BigDecimal cardTransaction) {
    this.cardTransaction = cardTransaction;
  }


  /**
   * Return true if this Limits_attributes_card_totalsDaily object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitsAttributesCardTotalsDaily limitsAttributesCardTotalsDaily = (LimitsAttributesCardTotalsDaily) o;
    return Objects.equals(this.withdrawal, limitsAttributesCardTotalsDaily.withdrawal) &&
        Objects.equals(this.deposit, limitsAttributesCardTotalsDaily.deposit) &&
        Objects.equals(this.purchase, limitsAttributesCardTotalsDaily.purchase) &&
        Objects.equals(this.cardTransaction, limitsAttributesCardTotalsDaily.cardTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawal, deposit, purchase, cardTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitsAttributesCardTotalsDaily {\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    purchase: ").append(toIndentedString(purchase)).append("\n");
    sb.append("    cardTransaction: ").append(toIndentedString(cardTransaction)).append("\n");
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

    // add `withdrawal` to the URL query string
    if (getWithdrawal() != null) {
      joiner.add(String.format("%swithdrawal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWithdrawal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deposit` to the URL query string
    if (getDeposit() != null) {
      joiner.add(String.format("%sdeposit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeposit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `purchase` to the URL query string
    if (getPurchase() != null) {
      joiner.add(String.format("%spurchase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPurchase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardTransaction` to the URL query string
    if (getCardTransaction() != null) {
      joiner.add(String.format("%scardTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardTransaction()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

