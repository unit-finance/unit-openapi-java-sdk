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
import unit.java.sdk.model.CounterpartyRelationship;
import unit.java.sdk.model.CreditAccountRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateAchRepaymentRelationships
 */
@JsonPropertyOrder({
  CreateAchRepaymentRelationships.JSON_PROPERTY_ACCOUNT,
  CreateAchRepaymentRelationships.JSON_PROPERTY_CREDIT_ACCOUNT,
  CreateAchRepaymentRelationships.JSON_PROPERTY_COUNTERPARTY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateAchRepaymentRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CREDIT_ACCOUNT = "creditAccount";
  private CreditAccountRelationship creditAccount;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private CounterpartyRelationship counterparty;

  public CreateAchRepaymentRelationships() { 
  }

  public CreateAchRepaymentRelationships account(AccountRelationship account) {
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


  public CreateAchRepaymentRelationships creditAccount(CreditAccountRelationship creditAccount) {
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


  public CreateAchRepaymentRelationships counterparty(CounterpartyRelationship counterparty) {
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


  /**
   * Return true if this CreateAchRepaymentRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchRepaymentRelationships createAchRepaymentRelationships = (CreateAchRepaymentRelationships) o;
    return Objects.equals(this.account, createAchRepaymentRelationships.account) &&
        Objects.equals(this.creditAccount, createAchRepaymentRelationships.creditAccount) &&
        Objects.equals(this.counterparty, createAchRepaymentRelationships.counterparty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, creditAccount, counterparty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchRepaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    return joiner.toString();
  }
}

