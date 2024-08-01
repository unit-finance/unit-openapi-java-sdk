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
import unit.java.sdk.model.CustomersRelationship;
import unit.java.sdk.model.OrgRelationship;
import unit.java.sdk.model.OriginalTransactionRelationship;
import unit.java.sdk.model.PaymentRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PushToCardReversalTransactionRelationships
 */
@JsonPropertyOrder({
  PushToCardReversalTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  PushToCardReversalTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  PushToCardReversalTransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  PushToCardReversalTransactionRelationships.JSON_PROPERTY_PAYMENT,
  PushToCardReversalTransactionRelationships.JSON_PROPERTY_ORG,
  PushToCardReversalTransactionRelationships.JSON_PROPERTY_ORIGINAL_TRANSACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class PushToCardReversalTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentRelationship payment;

  public static final String JSON_PROPERTY_ORG = "org";
  private OrgRelationship org;

  public static final String JSON_PROPERTY_ORIGINAL_TRANSACTION = "originalTransaction";
  private OriginalTransactionRelationship originalTransaction;

  public PushToCardReversalTransactionRelationships() { 
  }

  public PushToCardReversalTransactionRelationships account(AccountRelationship account) {
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


  public PushToCardReversalTransactionRelationships customer(CustomerRelationship customer) {
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


  public PushToCardReversalTransactionRelationships customers(CustomersRelationship customers) {
    this.customers = customers;
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
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


  public PushToCardReversalTransactionRelationships payment(PaymentRelationship payment) {
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

  public PaymentRelationship getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(PaymentRelationship payment) {
    this.payment = payment;
  }


  public PushToCardReversalTransactionRelationships org(OrgRelationship org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrgRelationship getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrg(OrgRelationship org) {
    this.org = org;
  }


  public PushToCardReversalTransactionRelationships originalTransaction(OriginalTransactionRelationship originalTransaction) {
    this.originalTransaction = originalTransaction;
    return this;
  }

   /**
   * Get originalTransaction
   * @return originalTransaction
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORIGINAL_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OriginalTransactionRelationship getOriginalTransaction() {
    return originalTransaction;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginalTransaction(OriginalTransactionRelationship originalTransaction) {
    this.originalTransaction = originalTransaction;
  }


  /**
   * Return true if this PushToCardReversalTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushToCardReversalTransactionRelationships pushToCardReversalTransactionRelationships = (PushToCardReversalTransactionRelationships) o;
    return Objects.equals(this.account, pushToCardReversalTransactionRelationships.account) &&
        Objects.equals(this.customer, pushToCardReversalTransactionRelationships.customer) &&
        Objects.equals(this.customers, pushToCardReversalTransactionRelationships.customers) &&
        Objects.equals(this.payment, pushToCardReversalTransactionRelationships.payment) &&
        Objects.equals(this.org, pushToCardReversalTransactionRelationships.org) &&
        Objects.equals(this.originalTransaction, pushToCardReversalTransactionRelationships.originalTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, payment, org, originalTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushToCardReversalTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    originalTransaction: ").append(toIndentedString(originalTransaction)).append("\n");
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

    // add `payment` to the URL query string
    if (getPayment() != null) {
      joiner.add(getPayment().toUrlQueryString(prefix + "payment" + suffix));
    }

    // add `org` to the URL query string
    if (getOrg() != null) {
      joiner.add(getOrg().toUrlQueryString(prefix + "org" + suffix));
    }

    // add `originalTransaction` to the URL query string
    if (getOriginalTransaction() != null) {
      joiner.add(getOriginalTransaction().toUrlQueryString(prefix + "originalTransaction" + suffix));
    }

    return joiner.toString();
  }
}

