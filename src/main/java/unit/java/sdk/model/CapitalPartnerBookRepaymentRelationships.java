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
import unit.java.sdk.model.BookRepaymentRelationshipsAllOfCounterpartyAccount;
import unit.java.sdk.model.ReceivedPaymentRelationshipsCustomer;
import unit.java.sdk.model.RepaymentRelationshipsBaseCreditAccount;
import unit.java.sdk.model.RepaymentRelationshipsBaseOrg;
import unit.java.sdk.model.RepaymentRelationshipsBasePayment;
import unit.java.sdk.model.RepaymentRelationshipsBaseRecurringPayment;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CapitalPartnerBookRepaymentRelationships
 */
@JsonPropertyOrder({
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_ORG,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_CUSTOMER,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_PAYMENT,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_RECURRING_PAYMENT,
  CapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_COUNTERPARTY_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CapitalPartnerBookRepaymentRelationships {
  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private RepaymentRelationshipsBaseCreditAccount creditAccount;

  public static final String JSON_PROPERTY_ORG = "org";
  private RepaymentRelationshipsBaseOrg org;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private RepaymentRelationshipsBasePayment payment;

  public static final String JSON_PROPERTY_RECURRING_PAYMENT = "recurringPayment";
  private RepaymentRelationshipsBaseRecurringPayment recurringPayment;

  public static final String JSON_PROPERTY_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  private BookRepaymentRelationshipsAllOfCounterpartyAccount counterpartyAccount;

  public CapitalPartnerBookRepaymentRelationships() { 
  }

  public CapitalPartnerBookRepaymentRelationships creditAccount(RepaymentRelationshipsBaseCreditAccount creditAccount) {
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

  public RepaymentRelationshipsBaseCreditAccount getCreditAccount() {
    return creditAccount;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditAccount(RepaymentRelationshipsBaseCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
  }


  public CapitalPartnerBookRepaymentRelationships org(RepaymentRelationshipsBaseOrg org) {
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

  public RepaymentRelationshipsBaseOrg getOrg() {
    return org;
  }


  @JsonProperty(JSON_PROPERTY_ORG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrg(RepaymentRelationshipsBaseOrg org) {
    this.org = org;
  }


  public CapitalPartnerBookRepaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
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


  public CapitalPartnerBookRepaymentRelationships payment(RepaymentRelationshipsBasePayment payment) {
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

  public RepaymentRelationshipsBasePayment getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayment(RepaymentRelationshipsBasePayment payment) {
    this.payment = payment;
  }


  public CapitalPartnerBookRepaymentRelationships recurringPayment(RepaymentRelationshipsBaseRecurringPayment recurringPayment) {
    this.recurringPayment = recurringPayment;
    return this;
  }

   /**
   * Get recurringPayment
   * @return recurringPayment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepaymentRelationshipsBaseRecurringPayment getRecurringPayment() {
    return recurringPayment;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringPayment(RepaymentRelationshipsBaseRecurringPayment recurringPayment) {
    this.recurringPayment = recurringPayment;
  }


  public CapitalPartnerBookRepaymentRelationships counterpartyAccount(BookRepaymentRelationshipsAllOfCounterpartyAccount counterpartyAccount) {
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

  public BookRepaymentRelationshipsAllOfCounterpartyAccount getCounterpartyAccount() {
    return counterpartyAccount;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterpartyAccount(BookRepaymentRelationshipsAllOfCounterpartyAccount counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
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
        Objects.equals(this.payment, capitalPartnerBookRepaymentRelationships.payment) &&
        Objects.equals(this.recurringPayment, capitalPartnerBookRepaymentRelationships.recurringPayment) &&
        Objects.equals(this.counterpartyAccount, capitalPartnerBookRepaymentRelationships.counterpartyAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAccount, org, customer, payment, recurringPayment, counterpartyAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalPartnerBookRepaymentRelationships {\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
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

    // add `payment` to the URL query string
    if (getPayment() != null) {
      joiner.add(getPayment().toUrlQueryString(prefix + "payment" + suffix));
    }

    // add `recurringPayment` to the URL query string
    if (getRecurringPayment() != null) {
      joiner.add(getRecurringPayment().toUrlQueryString(prefix + "recurringPayment" + suffix));
    }

    // add `counterpartyAccount` to the URL query string
    if (getCounterpartyAccount() != null) {
      joiner.add(getCounterpartyAccount().toUrlQueryString(prefix + "counterpartyAccount" + suffix));
    }

    return joiner.toString();
  }
}

