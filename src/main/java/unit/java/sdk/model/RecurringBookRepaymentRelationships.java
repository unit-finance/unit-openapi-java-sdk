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
import unit.java.sdk.model.RecurringAchRepaymentRelationshipsAllOfAccount;
import unit.java.sdk.model.RecurringRepaymentRelationshipsBaseCounterparty;
import unit.java.sdk.model.RecurringRepaymentRelationshipsBaseCreditAccount;
import unit.java.sdk.model.RecurringRepaymentRelationshipsBaseCustomer;
import unit.java.sdk.model.RecurringRepaymentRelationshipsBaseOrg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * RecurringBookRepaymentRelationships
 */
@JsonPropertyOrder({
  RecurringBookRepaymentRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  RecurringBookRepaymentRelationships.JSON_PROPERTY_COUNTERPARTY,
  RecurringBookRepaymentRelationships.JSON_PROPERTY_CUSTOMER,
  RecurringBookRepaymentRelationships.JSON_PROPERTY_ORG,
  RecurringBookRepaymentRelationships.JSON_PROPERTY_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class RecurringBookRepaymentRelationships {
  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private RecurringRepaymentRelationshipsBaseCreditAccount creditAccount;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private RecurringRepaymentRelationshipsBaseCounterparty counterparty;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private RecurringRepaymentRelationshipsBaseCustomer customer;

  public static final String JSON_PROPERTY_ORG = "org";
  private RecurringRepaymentRelationshipsBaseOrg org;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private RecurringAchRepaymentRelationshipsAllOfAccount account;

  public RecurringBookRepaymentRelationships() { 
  }

  public RecurringBookRepaymentRelationships creditAccount(RecurringRepaymentRelationshipsBaseCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
    return this;
  }

  /**
   * Get creditAccount
   * @return creditAccount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RecurringRepaymentRelationshipsBaseCreditAccount getCreditAccount() {
    return creditAccount;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditAccount(RecurringRepaymentRelationshipsBaseCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
  }


  public RecurringBookRepaymentRelationships counterparty(RecurringRepaymentRelationshipsBaseCounterparty counterparty) {
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
  public RecurringRepaymentRelationshipsBaseCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterparty(RecurringRepaymentRelationshipsBaseCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public RecurringBookRepaymentRelationships customer(RecurringRepaymentRelationshipsBaseCustomer customer) {
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
  public RecurringRepaymentRelationshipsBaseCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(RecurringRepaymentRelationshipsBaseCustomer customer) {
    this.customer = customer;
  }


  public RecurringBookRepaymentRelationships org(RecurringRepaymentRelationshipsBaseOrg org) {
    this.org = org;
    return this;
  }

  /**
   * Get org
   * @return org
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RecurringRepaymentRelationshipsBaseOrg getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrg(RecurringRepaymentRelationshipsBaseOrg org) {
    this.org = org;
  }


  public RecurringBookRepaymentRelationships account(RecurringAchRepaymentRelationshipsAllOfAccount account) {
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
  public RecurringAchRepaymentRelationshipsAllOfAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(RecurringAchRepaymentRelationshipsAllOfAccount account) {
    this.account = account;
  }


  /**
   * Return true if this RecurringBookRepaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringBookRepaymentRelationships recurringBookRepaymentRelationships = (RecurringBookRepaymentRelationships) o;
    return Objects.equals(this.creditAccount, recurringBookRepaymentRelationships.creditAccount) &&
        Objects.equals(this.counterparty, recurringBookRepaymentRelationships.counterparty) &&
        Objects.equals(this.customer, recurringBookRepaymentRelationships.customer) &&
        Objects.equals(this.org, recurringBookRepaymentRelationships.org) &&
        Objects.equals(this.account, recurringBookRepaymentRelationships.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAccount, counterparty, customer, org, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringBookRepaymentRelationships {\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

    // add `org` to the URL query string
    if (getOrg() != null) {
      joiner.add(getOrg().toUrlQueryString(prefix + "org" + suffix));
    }

    // add `account` to the URL query string
    if (getAccount() != null) {
      joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
    }

    return joiner.toString();
  }
}

