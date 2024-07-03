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
import unit.java.sdk.model.AuthorizationRequestRelationshipsCard;
import unit.java.sdk.model.RelationshipsAccount;
import unit.java.sdk.model.RelationshipsCustomer;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AuthorizationRequestRelationships
 */
@JsonPropertyOrder({
  AuthorizationRequestRelationships.JSON_PROPERTY_CUSTOMER,
  AuthorizationRequestRelationships.JSON_PROPERTY_ACCOUNT,
  AuthorizationRequestRelationships.JSON_PROPERTY_FUNDING_ACCOUNT,
  AuthorizationRequestRelationships.JSON_PROPERTY_CARD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthorizationRequestRelationships {
  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private RelationshipsCustomer customer;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private RelationshipsAccount account;

  public static final String JSON_PROPERTY_FUNDING_ACCOUNT = "fundingAccount";
  private RelationshipsAccount fundingAccount;

  public static final String JSON_PROPERTY_CARD = "card";
  private AuthorizationRequestRelationshipsCard card;

  public AuthorizationRequestRelationships() { 
  }

  public AuthorizationRequestRelationships customer(RelationshipsCustomer customer) {
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

  public RelationshipsCustomer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomer(RelationshipsCustomer customer) {
    this.customer = customer;
  }


  public AuthorizationRequestRelationships account(RelationshipsAccount account) {
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

  public RelationshipsAccount getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(RelationshipsAccount account) {
    this.account = account;
  }


  public AuthorizationRequestRelationships fundingAccount(RelationshipsAccount fundingAccount) {
    this.fundingAccount = fundingAccount;
    return this;
  }

   /**
   * Get fundingAccount
   * @return fundingAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelationshipsAccount getFundingAccount() {
    return fundingAccount;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingAccount(RelationshipsAccount fundingAccount) {
    this.fundingAccount = fundingAccount;
  }


  public AuthorizationRequestRelationships card(AuthorizationRequestRelationshipsCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AuthorizationRequestRelationshipsCard getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(AuthorizationRequestRelationshipsCard card) {
    this.card = card;
  }


  /**
   * Return true if this authorizationRequestRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationRequestRelationships authorizationRequestRelationships = (AuthorizationRequestRelationships) o;
    return Objects.equals(this.customer, authorizationRequestRelationships.customer) &&
        Objects.equals(this.account, authorizationRequestRelationships.account) &&
        Objects.equals(this.fundingAccount, authorizationRequestRelationships.fundingAccount) &&
        Objects.equals(this.card, authorizationRequestRelationships.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, account, fundingAccount, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationRequestRelationships {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    fundingAccount: ").append(toIndentedString(fundingAccount)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `account` to the URL query string
    if (getAccount() != null) {
      joiner.add(getAccount().toUrlQueryString(prefix + "account" + suffix));
    }

    // add `fundingAccount` to the URL query string
    if (getFundingAccount() != null) {
      joiner.add(getFundingAccount().toUrlQueryString(prefix + "fundingAccount" + suffix));
    }

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    return joiner.toString();
  }
}

