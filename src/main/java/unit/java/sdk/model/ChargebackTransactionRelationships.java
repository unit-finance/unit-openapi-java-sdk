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
import unit.java.sdk.model.ChargebackRelationship;
import unit.java.sdk.model.CounterpartyAccountRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.CustomersRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ChargebackTransactionRelationships
 */
@JsonPropertyOrder({
  ChargebackTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  ChargebackTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  ChargebackTransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  ChargebackTransactionRelationships.JSON_PROPERTY_COUNTERPARTY_ACCOUNT,
  ChargebackTransactionRelationships.JSON_PROPERTY_CHARGEBACK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class ChargebackTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  private CounterpartyAccountRelationship counterpartyAccount;

  public static final String JSON_PROPERTY_CHARGEBACK = "chargeback";
  private ChargebackRelationship chargeback;

  public ChargebackTransactionRelationships() { 
  }

  public ChargebackTransactionRelationships account(AccountRelationship account) {
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


  public ChargebackTransactionRelationships customer(CustomerRelationship customer) {
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


  public ChargebackTransactionRelationships customers(CustomersRelationship customers) {
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


  public ChargebackTransactionRelationships counterpartyAccount(CounterpartyAccountRelationship counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CounterpartyAccountRelationship getCounterpartyAccount() {
    return counterpartyAccount;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterpartyAccount(CounterpartyAccountRelationship counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }


  public ChargebackTransactionRelationships chargeback(ChargebackRelationship chargeback) {
    this.chargeback = chargeback;
    return this;
  }

   /**
   * Get chargeback
   * @return chargeback
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGEBACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChargebackRelationship getChargeback() {
    return chargeback;
  }


  @JsonProperty(JSON_PROPERTY_CHARGEBACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChargeback(ChargebackRelationship chargeback) {
    this.chargeback = chargeback;
  }


  /**
   * Return true if this ChargebackTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackTransactionRelationships chargebackTransactionRelationships = (ChargebackTransactionRelationships) o;
    return Objects.equals(this.account, chargebackTransactionRelationships.account) &&
        Objects.equals(this.customer, chargebackTransactionRelationships.customer) &&
        Objects.equals(this.customers, chargebackTransactionRelationships.customers) &&
        Objects.equals(this.counterpartyAccount, chargebackTransactionRelationships.counterpartyAccount) &&
        Objects.equals(this.chargeback, chargebackTransactionRelationships.chargeback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, counterpartyAccount, chargeback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    chargeback: ").append(toIndentedString(chargeback)).append("\n");
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

    // add `counterpartyAccount` to the URL query string
    if (getCounterpartyAccount() != null) {
      joiner.add(getCounterpartyAccount().toUrlQueryString(prefix + "counterpartyAccount" + suffix));
    }

    // add `chargeback` to the URL query string
    if (getChargeback() != null) {
      joiner.add(getChargeback().toUrlQueryString(prefix + "chargeback" + suffix));
    }

    return joiner.toString();
  }
}
