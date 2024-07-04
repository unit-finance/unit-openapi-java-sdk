/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.6
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
import unit.java.sdk.model.ReceivedPaymentRelationshipsCustomer;
import unit.java.sdk.model.RecurringAchPaymentRelationshipsAccount;
import unit.java.sdk.model.RecurringAchPaymentRelationshipsOrg;
import unit.java.sdk.model.RecurringBookPaymentRelationshipsCounterpartyAccount;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RecurringBookPaymentRelationships
 */
@JsonPropertyOrder({
  RecurringBookPaymentRelationships.JSON_PROPERTY_ACCOUNT,
  RecurringBookPaymentRelationships.JSON_PROPERTY_COUNTERPARTY_ACCOUNT,
  RecurringBookPaymentRelationships.JSON_PROPERTY_CUSTOMER,
  RecurringBookPaymentRelationships.JSON_PROPERTY_ORG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecurringBookPaymentRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private RecurringAchPaymentRelationshipsAccount account;

  public static final String JSON_PROPERTY_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  private RecurringBookPaymentRelationshipsCounterpartyAccount counterpartyAccount;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String JSON_PROPERTY_ORG = "org";
  private RecurringAchPaymentRelationshipsOrg org;

  public RecurringBookPaymentRelationships() { 
  }

  public RecurringBookPaymentRelationships account(RecurringAchPaymentRelationshipsAccount account) {
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

  public RecurringAchPaymentRelationshipsAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(RecurringAchPaymentRelationshipsAccount account) {
    this.account = account;
  }


  public RecurringBookPaymentRelationships counterpartyAccount(RecurringBookPaymentRelationshipsCounterpartyAccount counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringBookPaymentRelationshipsCounterpartyAccount getCounterpartyAccount() {
    return counterpartyAccount;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyAccount(RecurringBookPaymentRelationshipsCounterpartyAccount counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }


  public RecurringBookPaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
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

  public ReceivedPaymentRelationshipsCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public RecurringBookPaymentRelationships org(RecurringAchPaymentRelationshipsOrg org) {
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

  public RecurringAchPaymentRelationshipsOrg getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrg(RecurringAchPaymentRelationshipsOrg org) {
    this.org = org;
  }


  /**
   * Return true if this recurringBookPaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringBookPaymentRelationships recurringBookPaymentRelationships = (RecurringBookPaymentRelationships) o;
    return Objects.equals(this.account, recurringBookPaymentRelationships.account) &&
        Objects.equals(this.counterpartyAccount, recurringBookPaymentRelationships.counterpartyAccount) &&
        Objects.equals(this.customer, recurringBookPaymentRelationships.customer) &&
        Objects.equals(this.org, recurringBookPaymentRelationships.org);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, counterpartyAccount, customer, org);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringBookPaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
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

    // add `counterpartyAccount` to the URL query string
    if (getCounterpartyAccount() != null) {
      joiner.add(getCounterpartyAccount().toUrlQueryString(prefix + "counterpartyAccount" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `org` to the URL query string
    if (getOrg() != null) {
      joiner.add(getOrg().toUrlQueryString(prefix + "org" + suffix));
    }

    return joiner.toString();
  }
}

