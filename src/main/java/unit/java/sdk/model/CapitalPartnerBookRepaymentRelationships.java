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
import unit.java.sdk.model.CounterpartyAccountRelationship;
import unit.java.sdk.model.CreditAccountRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.OrgRelationship;
import unit.java.sdk.model.PaymentRelationship;
import unit.java.sdk.model.RecurringRepaymentRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CapitalPartnerBookRepaymentRelationships
 */
@JsonPropertyOrder({
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_ORG,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_CUSTOMER,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_COUNTERPARTY_ACCOUNT,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_PAYMENT,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_RECURRING_REPAYMENT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CapitalPartnerBookRepaymentRelationships {
  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private CreditAccountRelationship creditAccount;

  public static final String JSON_PROPERTY_ORG = "org";
  private OrgRelationship org;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  private CounterpartyAccountRelationship counterpartyAccount;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentRelationship payment;

  public static final String JSON_PROPERTY_RECURRING_REPAYMENT = "recurringRepayment";
  private RecurringRepaymentRelationship recurringRepayment;

  public CapitalPartnerBookRepaymentRelationships() { 
  }

  public CapitalPartnerBookRepaymentRelationships creditAccount(CreditAccountRelationship creditAccount) {
    this.creditAccount = creditAccount;
    return this;
  }

   /**
   * Get creditAccount
   * @return creditAccount
  **/
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


  public CapitalPartnerBookRepaymentRelationships org(OrgRelationship org) {
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


  public CapitalPartnerBookRepaymentRelationships customer(CustomerRelationship customer) {
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


  public CapitalPartnerBookRepaymentRelationships counterpartyAccount(CounterpartyAccountRelationship counterpartyAccount) {
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


  public CapitalPartnerBookRepaymentRelationships payment(PaymentRelationship payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
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


  public CapitalPartnerBookRepaymentRelationships recurringRepayment(RecurringRepaymentRelationship recurringRepayment) {
    this.recurringRepayment = recurringRepayment;
    return this;
  }

   /**
   * Get recurringRepayment
   * @return recurringRepayment
  **/
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
   * Return true if this CapitalPartnerBookRepaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalPartnerBookRepaymentRelationships capitalPartnerBookRepaymentRelationships = (CapitalPartnerBookRepaymentRelationships) o;
    return Objects.equals(this.creditAccount, capitalPartnerBookRepaymentRelationships.creditAccount) &&
        Objects.equals(this.org, capitalPartnerBookRepaymentRelationships.org) &&
        Objects.equals(this.customer, capitalPartnerBookRepaymentRelationships.customer) &&
        Objects.equals(this.counterpartyAccount, capitalPartnerBookRepaymentRelationships.counterpartyAccount) &&
        Objects.equals(this.payment, capitalPartnerBookRepaymentRelationships.payment) &&
        Objects.equals(this.recurringRepayment, capitalPartnerBookRepaymentRelationships.recurringRepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAccount, org, customer, counterpartyAccount, payment, recurringRepayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalPartnerBookRepaymentRelationships {\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
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

    // add `counterpartyAccount` to the URL query string
    if (getCounterpartyAccount() != null) {
      joiner.add(getCounterpartyAccount().toUrlQueryString(prefix + "counterpartyAccount" + suffix));
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

