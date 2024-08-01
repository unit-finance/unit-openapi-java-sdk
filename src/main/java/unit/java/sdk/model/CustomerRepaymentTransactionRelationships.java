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
import unit.java.sdk.model.RepaymentRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomerRepaymentTransactionRelationships
 */
@JsonPropertyOrder({
  CustomerRepaymentTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  CustomerRepaymentTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  CustomerRepaymentTransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  CustomerRepaymentTransactionRelationships.JSON_PROPERTY_ORG,
  CustomerRepaymentTransactionRelationships.JSON_PROPERTY_REPAYMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CustomerRepaymentTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_ORG = "org";
  private OrgRelationship org;

  public static final String JSON_PROPERTY_REPAYMENT = "repayment";
  private RepaymentRelationship repayment;

  public CustomerRepaymentTransactionRelationships() { 
  }

  public CustomerRepaymentTransactionRelationships account(AccountRelationship account) {
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


  public CustomerRepaymentTransactionRelationships customer(CustomerRelationship customer) {
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


  public CustomerRepaymentTransactionRelationships customers(CustomersRelationship customers) {
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


  public CustomerRepaymentTransactionRelationships org(OrgRelationship org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrgRelationship getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrg(OrgRelationship org) {
    this.org = org;
  }


  public CustomerRepaymentTransactionRelationships repayment(RepaymentRelationship repayment) {
    this.repayment = repayment;
    return this;
  }

   /**
   * Get repayment
   * @return repayment
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RepaymentRelationship getRepayment() {
    return repayment;
  }


  @JsonProperty(JSON_PROPERTY_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepayment(RepaymentRelationship repayment) {
    this.repayment = repayment;
  }


  /**
   * Return true if this CustomerRepaymentTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRepaymentTransactionRelationships customerRepaymentTransactionRelationships = (CustomerRepaymentTransactionRelationships) o;
    return Objects.equals(this.account, customerRepaymentTransactionRelationships.account) &&
        Objects.equals(this.customer, customerRepaymentTransactionRelationships.customer) &&
        Objects.equals(this.customers, customerRepaymentTransactionRelationships.customers) &&
        Objects.equals(this.org, customerRepaymentTransactionRelationships.org) &&
        Objects.equals(this.repayment, customerRepaymentTransactionRelationships.repayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, org, repayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRepaymentTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
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

    // add `org` to the URL query string
    if (getOrg() != null) {
      joiner.add(getOrg().toUrlQueryString(prefix + "org" + suffix));
    }

    // add `repayment` to the URL query string
    if (getRepayment() != null) {
      joiner.add(getRepayment().toUrlQueryString(prefix + "repayment" + suffix));
    }

    return joiner.toString();
  }
}

