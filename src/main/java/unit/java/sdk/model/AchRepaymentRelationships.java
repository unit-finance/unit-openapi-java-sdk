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
import unit.java.sdk.model.CounterpartyRelationship;
import unit.java.sdk.model.CreditAccountRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.OrgRelationship;
import unit.java.sdk.model.PaymentRelationship;
import unit.java.sdk.model.RecurringRepaymentRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AchRepaymentRelationships
 */
@JsonPropertyOrder({
  AchRepaymentRelationships.JSON_PROPERTY_ACCOUNT,
  AchRepaymentRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  AchRepaymentRelationships.JSON_PROPERTY_ORG,
  AchRepaymentRelationships.JSON_PROPERTY_CUSTOMER,
  AchRepaymentRelationships.JSON_PROPERTY_COUNTERPARTY,
  AchRepaymentRelationships.JSON_PROPERTY_PAYMENT,
  AchRepaymentRelationships.JSON_PROPERTY_RECURRING_REPAYMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AchRepaymentRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private CreditAccountRelationship creditAccount;

  public static final String JSON_PROPERTY_ORG = "org";
  private OrgRelationship org;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private CounterpartyRelationship counterparty;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentRelationship payment;

  public static final String JSON_PROPERTY_RECURRING_REPAYMENT = "recurringRepayment";
  private RecurringRepaymentRelationship recurringRepayment;

  public AchRepaymentRelationships() { 
  }

  public AchRepaymentRelationships account(AccountRelationship account) {
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


  public AchRepaymentRelationships creditAccount(CreditAccountRelationship creditAccount) {
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
  public CreditAccountRelationship getCreditAccount() {
    return creditAccount;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditAccount(CreditAccountRelationship creditAccount) {
    this.creditAccount = creditAccount;
  }


  public AchRepaymentRelationships org(OrgRelationship org) {
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
  public OrgRelationship getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrg(OrgRelationship org) {
    this.org = org;
  }


  public AchRepaymentRelationships customer(CustomerRelationship customer) {
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


  public AchRepaymentRelationships counterparty(CounterpartyRelationship counterparty) {
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


  public AchRepaymentRelationships payment(PaymentRelationship payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PaymentRelationship getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayment(PaymentRelationship payment) {
    this.payment = payment;
  }


  public AchRepaymentRelationships recurringRepayment(RecurringRepaymentRelationship recurringRepayment) {
    this.recurringRepayment = recurringRepayment;
    return this;
  }

  /**
   * Get recurringRepayment
   * @return recurringRepayment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RecurringRepaymentRelationship getRecurringRepayment() {
    return recurringRepayment;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringRepayment(RecurringRepaymentRelationship recurringRepayment) {
    this.recurringRepayment = recurringRepayment;
  }


  /**
   * Return true if this AchRepaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchRepaymentRelationships achRepaymentRelationships = (AchRepaymentRelationships) o;
    return Objects.equals(this.account, achRepaymentRelationships.account) &&
        Objects.equals(this.creditAccount, achRepaymentRelationships.creditAccount) &&
        Objects.equals(this.org, achRepaymentRelationships.org) &&
        Objects.equals(this.customer, achRepaymentRelationships.customer) &&
        Objects.equals(this.counterparty, achRepaymentRelationships.counterparty) &&
        Objects.equals(this.payment, achRepaymentRelationships.payment) &&
        Objects.equals(this.recurringRepayment, achRepaymentRelationships.recurringRepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, creditAccount, org, customer, counterparty, payment, recurringRepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchRepaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    recurringRepayment: ").append(toIndentedString(recurringRepayment)).append("\n");
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

    // add `org` to the URL query string
    if (getOrg() != null) {
      joiner.add(getOrg().toUrlQueryString(prefix + "org" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `payment` to the URL query string
    if (getPayment() != null) {
      joiner.add(getPayment().toUrlQueryString(prefix + "payment" + suffix));
    }

    // add `recurringRepayment` to the URL query string
    if (getRecurringRepayment() != null) {
      joiner.add(getRecurringRepayment().toUrlQueryString(prefix + "recurringRepayment" + suffix));
    }

    return joiner.toString();
  }
}

