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
import java.util.Arrays;
import unit.java.sdk.model.AccountRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.ReceivedPaymentRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PaymentAdvanceTransactionRelationships
 */
@JsonPropertyOrder({
  PaymentAdvanceTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  PaymentAdvanceTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  PaymentAdvanceTransactionRelationships.JSON_PROPERTY_RECEIVED_PAYMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PaymentAdvanceTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_RECEIVED_PAYMENT = "receivedPayment";
  private ReceivedPaymentRelationship receivedPayment;

  public PaymentAdvanceTransactionRelationships() { 
  }

  public PaymentAdvanceTransactionRelationships account(AccountRelationship account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountRelationship getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(AccountRelationship account) {
    this.account = account;
  }


  public PaymentAdvanceTransactionRelationships customer(CustomerRelationship customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerRelationship getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(CustomerRelationship customer) {
    this.customer = customer;
  }


  public PaymentAdvanceTransactionRelationships receivedPayment(ReceivedPaymentRelationship receivedPayment) {
    this.receivedPayment = receivedPayment;
    return this;
  }

   /**
   * Get receivedPayment
   * @return receivedPayment
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECEIVED_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReceivedPaymentRelationship getReceivedPayment() {
    return receivedPayment;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceivedPayment(ReceivedPaymentRelationship receivedPayment) {
    this.receivedPayment = receivedPayment;
  }


  /**
   * Return true if this PaymentAdvanceTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAdvanceTransactionRelationships paymentAdvanceTransactionRelationships = (PaymentAdvanceTransactionRelationships) o;
    return Objects.equals(this.account, paymentAdvanceTransactionRelationships.account) &&
        Objects.equals(this.customer, paymentAdvanceTransactionRelationships.customer) &&
        Objects.equals(this.receivedPayment, paymentAdvanceTransactionRelationships.receivedPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, receivedPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAdvanceTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    receivedPayment: ").append(toIndentedString(receivedPayment)).append("\n");
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

    // add `account` to the URL query string
    if (getAccount() != null) {
      joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `receivedPayment` to the URL query string
    if (getReceivedPayment() != null) {
      joiner.add(getReceivedPayment().toUrlQueryString(prefix + "receivedPayment" + suffix));
    }

    return joiner.toString();
  }
}

