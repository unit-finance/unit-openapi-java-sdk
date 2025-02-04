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
import java.util.Arrays;
import java.util.Map;
import unit.java.sdk.model.AccountRelationship;
import unit.java.sdk.model.CounterpartyRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.CustomersRelationship;
import unit.java.sdk.model.RecurringPaymentRelationship;
import unit.java.sdk.model.TransactionRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AchPaymentRelationships
 */
@JsonPropertyOrder({
  AchPaymentRelationships.JSON_PROPERTY_ACCOUNT,
  AchPaymentRelationships.JSON_PROPERTY_CUSTOMER,
  AchPaymentRelationships.JSON_PROPERTY_CUSTOMERS,
  AchPaymentRelationships.JSON_PROPERTY_COUNTERPARTY,
  AchPaymentRelationships.JSON_PROPERTY_TRANSACTION,
  AchPaymentRelationships.JSON_PROPERTY_RECURRING_PAYMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AchPaymentRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private CounterpartyRelationship counterparty;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private TransactionRelationship transaction;

  public static final String JSON_PROPERTY_RECURRING_PAYMENT = "recurringPayment";
  private RecurringPaymentRelationship recurringPayment;

  public AchPaymentRelationships() { 
  }

  public AchPaymentRelationships account(AccountRelationship account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   */
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


  public AchPaymentRelationships customer(CustomerRelationship customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
   */
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


  public AchPaymentRelationships customers(CustomersRelationship customers) {
    this.customers = customers;
    return this;
  }

  /**
   * Get customers
   * @return customers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomersRelationship getCustomers() {
    return customers;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomers(CustomersRelationship customers) {
    this.customers = customers;
  }


  public AchPaymentRelationships counterparty(CounterpartyRelationship counterparty) {
    this.counterparty = counterparty;
    return this;
  }

  /**
   * Get counterparty
   * @return counterparty
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CounterpartyRelationship getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterparty(CounterpartyRelationship counterparty) {
    this.counterparty = counterparty;
  }


  public AchPaymentRelationships transaction(TransactionRelationship transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TransactionRelationship getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransaction(TransactionRelationship transaction) {
    this.transaction = transaction;
  }


  public AchPaymentRelationships recurringPayment(RecurringPaymentRelationship recurringPayment) {
    this.recurringPayment = recurringPayment;
    return this;
  }

  /**
   * Get recurringPayment
   * @return recurringPayment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RecurringPaymentRelationship getRecurringPayment() {
    return recurringPayment;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringPayment(RecurringPaymentRelationship recurringPayment) {
    this.recurringPayment = recurringPayment;
  }


  /**
   * Return true if this AchPaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchPaymentRelationships achPaymentRelationships = (AchPaymentRelationships) o;
    return Objects.equals(this.account, achPaymentRelationships.account) &&
        Objects.equals(this.customer, achPaymentRelationships.customer) &&
        Objects.equals(this.customers, achPaymentRelationships.customers) &&
        Objects.equals(this.counterparty, achPaymentRelationships.counterparty) &&
        Objects.equals(this.transaction, achPaymentRelationships.transaction) &&
        Objects.equals(this.recurringPayment, achPaymentRelationships.recurringPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, counterparty, transaction, recurringPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchPaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
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

    // add `customers` to the URL query string
    if (getCustomers() != null) {
      joiner.add(getCustomers().toUrlQueryString(prefix + "customers" + suffix));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    // add `recurringPayment` to the URL query string
    if (getRecurringPayment() != null) {
      joiner.add(getRecurringPayment().toUrlQueryString(prefix + "recurringPayment" + suffix));
    }

    return joiner.toString();
  }
}

