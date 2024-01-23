/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.3
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
import unit.java.sdk.model.AchRepaymentAllOfRelationshipsAccount;
import unit.java.sdk.model.AchRepaymentAllOfRelationshipsCounterparty;
import unit.java.sdk.model.AchRepaymentAllOfRelationshipsCreditAccount;
import unit.java.sdk.model.AchRepaymentAllOfRelationshipsCustomer;
import unit.java.sdk.model.AchRepaymentAllOfRelationshipsPayment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AchRepaymentAllOfRelationships
 */
@JsonPropertyOrder({
  AchRepaymentAllOfRelationships.JSON_PROPERTY_ACCOUNT,
  AchRepaymentAllOfRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  AchRepaymentAllOfRelationships.JSON_PROPERTY_COUNTERPARTY,
  AchRepaymentAllOfRelationships.JSON_PROPERTY_CUSTOMER,
  AchRepaymentAllOfRelationships.JSON_PROPERTY_PAYMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AchRepaymentAllOfRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AchRepaymentAllOfRelationshipsAccount account;

  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private AchRepaymentAllOfRelationshipsCreditAccount creditAccount;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private AchRepaymentAllOfRelationshipsCounterparty counterparty;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private AchRepaymentAllOfRelationshipsCustomer customer;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private AchRepaymentAllOfRelationshipsPayment payment;

  public AchRepaymentAllOfRelationships() { 
  }

  public AchRepaymentAllOfRelationships account(AchRepaymentAllOfRelationshipsAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AchRepaymentAllOfRelationshipsAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(AchRepaymentAllOfRelationshipsAccount account) {
    this.account = account;
  }


  public AchRepaymentAllOfRelationships creditAccount(AchRepaymentAllOfRelationshipsCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
    return this;
  }

   /**
   * Get creditAccount
   * @return creditAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AchRepaymentAllOfRelationshipsCreditAccount getCreditAccount() {
    return creditAccount;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditAccount(AchRepaymentAllOfRelationshipsCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
  }


  public AchRepaymentAllOfRelationships counterparty(AchRepaymentAllOfRelationshipsCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AchRepaymentAllOfRelationshipsCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(AchRepaymentAllOfRelationshipsCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public AchRepaymentAllOfRelationships customer(AchRepaymentAllOfRelationshipsCustomer customer) {
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

  public AchRepaymentAllOfRelationshipsCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(AchRepaymentAllOfRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public AchRepaymentAllOfRelationships payment(AchRepaymentAllOfRelationshipsPayment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AchRepaymentAllOfRelationshipsPayment getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(AchRepaymentAllOfRelationshipsPayment payment) {
    this.payment = payment;
  }


  /**
   * Return true if this AchRepayment_allOf_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchRepaymentAllOfRelationships achRepaymentAllOfRelationships = (AchRepaymentAllOfRelationships) o;
    return Objects.equals(this.account, achRepaymentAllOfRelationships.account) &&
        Objects.equals(this.creditAccount, achRepaymentAllOfRelationships.creditAccount) &&
        Objects.equals(this.counterparty, achRepaymentAllOfRelationships.counterparty) &&
        Objects.equals(this.customer, achRepaymentAllOfRelationships.customer) &&
        Objects.equals(this.payment, achRepaymentAllOfRelationships.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, creditAccount, counterparty, customer, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchRepaymentAllOfRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

    // add `creditAccount` to the URL query string
    if (getCreditAccount() != null) {
      joiner.add(getCreditAccount().toUrlQueryString(prefix + "creditAccount" + suffix));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `payment` to the URL query string
    if (getPayment() != null) {
      joiner.add(getPayment().toUrlQueryString(prefix + "payment" + suffix));
    }

    return joiner.toString();
  }
}

