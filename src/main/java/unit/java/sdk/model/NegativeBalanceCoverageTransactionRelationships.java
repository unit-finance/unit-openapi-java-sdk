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
import unit.java.sdk.model.AccountRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.CustomersRelationship;
import unit.java.sdk.model.ReceiverAccountRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * NegativeBalanceCoverageTransactionRelationships
 */
@JsonPropertyOrder({
  NegativeBalanceCoverageTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  NegativeBalanceCoverageTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  NegativeBalanceCoverageTransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  NegativeBalanceCoverageTransactionRelationships.JSON_PROPERTY_RECEIVER_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class NegativeBalanceCoverageTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_RECEIVER_ACCOUNT = "receiverAccount";
  private ReceiverAccountRelationship receiverAccount;

  public NegativeBalanceCoverageTransactionRelationships() { 
  }

  public NegativeBalanceCoverageTransactionRelationships account(AccountRelationship account) {
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


  public NegativeBalanceCoverageTransactionRelationships customer(CustomerRelationship customer) {
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


  public NegativeBalanceCoverageTransactionRelationships customers(CustomersRelationship customers) {
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


  public NegativeBalanceCoverageTransactionRelationships receiverAccount(ReceiverAccountRelationship receiverAccount) {
    this.receiverAccount = receiverAccount;
    return this;
  }

  /**
   * Get receiverAccount
   * @return receiverAccount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECEIVER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReceiverAccountRelationship getReceiverAccount() {
    return receiverAccount;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceiverAccount(ReceiverAccountRelationship receiverAccount) {
    this.receiverAccount = receiverAccount;
  }


  /**
   * Return true if this NegativeBalanceCoverageTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegativeBalanceCoverageTransactionRelationships negativeBalanceCoverageTransactionRelationships = (NegativeBalanceCoverageTransactionRelationships) o;
    return Objects.equals(this.account, negativeBalanceCoverageTransactionRelationships.account) &&
        Objects.equals(this.customer, negativeBalanceCoverageTransactionRelationships.customer) &&
        Objects.equals(this.customers, negativeBalanceCoverageTransactionRelationships.customers) &&
        Objects.equals(this.receiverAccount, negativeBalanceCoverageTransactionRelationships.receiverAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, receiverAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeBalanceCoverageTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    receiverAccount: ").append(toIndentedString(receiverAccount)).append("\n");
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

    // add `receiverAccount` to the URL query string
    if (getReceiverAccount() != null) {
      joiner.add(getReceiverAccount().toUrlQueryString(prefix + "receiverAccount" + suffix));
    }

    return joiner.toString();
  }
}

