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
import unit.java.sdk.model.ReturnedTransactionRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReturnedReceivedAchTransactionRelationships
 */
@JsonPropertyOrder({
  ReturnedReceivedAchTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  ReturnedReceivedAchTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  ReturnedReceivedAchTransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  ReturnedReceivedAchTransactionRelationships.JSON_PROPERTY_RETURNED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ReturnedReceivedAchTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_RETURNED = "returned";
  private ReturnedTransactionRelationship returned;

  public ReturnedReceivedAchTransactionRelationships() { 
  }

  public ReturnedReceivedAchTransactionRelationships account(AccountRelationship account) {
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


  public ReturnedReceivedAchTransactionRelationships customer(CustomerRelationship customer) {
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


  public ReturnedReceivedAchTransactionRelationships customers(CustomersRelationship customers) {
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


  public ReturnedReceivedAchTransactionRelationships returned(ReturnedTransactionRelationship returned) {
    this.returned = returned;
    return this;
  }

   /**
   * Get returned
   * @return returned
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReturnedTransactionRelationship getReturned() {
    return returned;
  }


  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReturned(ReturnedTransactionRelationship returned) {
    this.returned = returned;
  }


  /**
   * Return true if this ReturnedReceivedAchTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnedReceivedAchTransactionRelationships returnedReceivedAchTransactionRelationships = (ReturnedReceivedAchTransactionRelationships) o;
    return Objects.equals(this.account, returnedReceivedAchTransactionRelationships.account) &&
        Objects.equals(this.customer, returnedReceivedAchTransactionRelationships.customer) &&
        Objects.equals(this.customers, returnedReceivedAchTransactionRelationships.customers) &&
        Objects.equals(this.returned, returnedReceivedAchTransactionRelationships.returned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, returned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnedReceivedAchTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
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

    // add `returned` to the URL query string
    if (getReturned() != null) {
      joiner.add(getReturned().toUrlQueryString(prefix + "returned" + suffix));
    }

    return joiner.toString();
  }
}

