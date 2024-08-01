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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateRecurringCapitalPartnerBookRepaymentRelationships
 */
@JsonPropertyOrder({
  CreateRecurringCapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  CreateRecurringCapitalPartnerBookRepaymentRelationships.JSON_PROPERTY_COUNTERPARTY_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CreateRecurringCapitalPartnerBookRepaymentRelationships {
  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private CreditAccountRelationship creditAccount;

  public static final String JSON_PROPERTY_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  private CounterpartyAccountRelationship counterpartyAccount;

  public CreateRecurringCapitalPartnerBookRepaymentRelationships() { 
  }

  public CreateRecurringCapitalPartnerBookRepaymentRelationships creditAccount(CreditAccountRelationship creditAccount) {
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


  public CreateRecurringCapitalPartnerBookRepaymentRelationships counterpartyAccount(CounterpartyAccountRelationship counterpartyAccount) {
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


  /**
   * Return true if this CreateRecurringCapitalPartnerBookRepaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRecurringCapitalPartnerBookRepaymentRelationships createRecurringCapitalPartnerBookRepaymentRelationships = (CreateRecurringCapitalPartnerBookRepaymentRelationships) o;
    return Objects.equals(this.creditAccount, createRecurringCapitalPartnerBookRepaymentRelationships.creditAccount) &&
        Objects.equals(this.counterpartyAccount, createRecurringCapitalPartnerBookRepaymentRelationships.counterpartyAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAccount, counterpartyAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRecurringCapitalPartnerBookRepaymentRelationships {\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
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

    // add `counterpartyAccount` to the URL query string
    if (getCounterpartyAccount() != null) {
      joiner.add(getCounterpartyAccount().toUrlQueryString(prefix + "counterpartyAccount" + suffix));
    }

    return joiner.toString();
  }
}

