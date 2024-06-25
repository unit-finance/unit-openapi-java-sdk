/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.5
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
import unit.java.sdk.model.CustomersRelationship;
import unit.java.sdk.model.ReceivedPaymentRelationshipsCustomer;
import unit.java.sdk.model.RecurringAchPaymentRelationshipsAccount;
import unit.java.sdk.model.StopPaymentRelationshipsCheckPayments;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StopPaymentRelationships
 */
@JsonPropertyOrder({
  StopPaymentRelationships.JSON_PROPERTY_ACCOUNT,
  StopPaymentRelationships.JSON_PROPERTY_CUSTOMER,
  StopPaymentRelationships.JSON_PROPERTY_CUSTOMERS,
  StopPaymentRelationships.JSON_PROPERTY_CHECK_PAYMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StopPaymentRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private RecurringAchPaymentRelationshipsAccount account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_CHECK_PAYMENTS = "checkPayments";
  private StopPaymentRelationshipsCheckPayments checkPayments;

  public StopPaymentRelationships() { 
  }

  public StopPaymentRelationships account(RecurringAchPaymentRelationshipsAccount account) {
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

  public RecurringAchPaymentRelationshipsAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(RecurringAchPaymentRelationshipsAccount account) {
    this.account = account;
  }


  public StopPaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReceivedPaymentRelationshipsCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public StopPaymentRelationships customers(CustomersRelationship customers) {
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


  public StopPaymentRelationships checkPayments(StopPaymentRelationshipsCheckPayments checkPayments) {
    this.checkPayments = checkPayments;
    return this;
  }

   /**
   * Get checkPayments
   * @return checkPayments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StopPaymentRelationshipsCheckPayments getCheckPayments() {
    return checkPayments;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckPayments(StopPaymentRelationshipsCheckPayments checkPayments) {
    this.checkPayments = checkPayments;
  }


  /**
   * Return true if this stop_payment_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopPaymentRelationships stopPaymentRelationships = (StopPaymentRelationships) o;
    return Objects.equals(this.account, stopPaymentRelationships.account) &&
        Objects.equals(this.customer, stopPaymentRelationships.customer) &&
        Objects.equals(this.customers, stopPaymentRelationships.customers) &&
        Objects.equals(this.checkPayments, stopPaymentRelationships.checkPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, checkPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopPaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    checkPayments: ").append(toIndentedString(checkPayments)).append("\n");
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

    // add `checkPayments` to the URL query string
    if (getCheckPayments() != null) {
      joiner.add(getCheckPayments().toUrlQueryString(prefix + "checkPayments" + suffix));
    }

    return joiner.toString();
  }
}

