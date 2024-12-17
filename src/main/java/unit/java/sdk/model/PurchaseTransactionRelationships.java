/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
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
import unit.java.sdk.model.AuthorizationRelationship;
import unit.java.sdk.model.AuthorizationRequestRelationship;
import unit.java.sdk.model.CardRelationship;
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.CustomersRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * PurchaseTransactionRelationships
 */
@JsonPropertyOrder({
  PurchaseTransactionRelationships.JSON_PROPERTY_ACCOUNT,
  PurchaseTransactionRelationships.JSON_PROPERTY_CUSTOMER,
  PurchaseTransactionRelationships.JSON_PROPERTY_CUSTOMERS,
  PurchaseTransactionRelationships.JSON_PROPERTY_CARD,
  PurchaseTransactionRelationships.JSON_PROPERTY_AUTHORIZATION,
  PurchaseTransactionRelationships.JSON_PROPERTY_AUTHORIZATION_REQUEST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class PurchaseTransactionRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_CUSTOMERS = "customers";
  private CustomersRelationship customers;

  public static final String JSON_PROPERTY_CARD = "card";
  private CardRelationship card;

  public static final String JSON_PROPERTY_AUTHORIZATION = "authorization";
  private AuthorizationRelationship authorization;

  public static final String JSON_PROPERTY_AUTHORIZATION_REQUEST = "authorizationRequest";
  private AuthorizationRequestRelationship authorizationRequest;

  public PurchaseTransactionRelationships() { 
  }

  public PurchaseTransactionRelationships account(AccountRelationship account) {
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


  public PurchaseTransactionRelationships customer(CustomerRelationship customer) {
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


  public PurchaseTransactionRelationships customers(CustomersRelationship customers) {
    this.customers = customers;
    return this;
  }

  /**
   * Get customers
   * @return customers
   */
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


  public PurchaseTransactionRelationships card(CardRelationship card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CardRelationship getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCard(CardRelationship card) {
    this.card = card;
  }


  public PurchaseTransactionRelationships authorization(AuthorizationRelationship authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * Get authorization
   * @return authorization
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AuthorizationRelationship getAuthorization() {
    return authorization;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorization(AuthorizationRelationship authorization) {
    this.authorization = authorization;
  }


  public PurchaseTransactionRelationships authorizationRequest(AuthorizationRequestRelationship authorizationRequest) {
    this.authorizationRequest = authorizationRequest;
    return this;
  }

  /**
   * Get authorizationRequest
   * @return authorizationRequest
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthorizationRequestRelationship getAuthorizationRequest() {
    return authorizationRequest;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationRequest(AuthorizationRequestRelationship authorizationRequest) {
    this.authorizationRequest = authorizationRequest;
  }


  /**
   * Return true if this PurchaseTransactionRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseTransactionRelationships purchaseTransactionRelationships = (PurchaseTransactionRelationships) o;
    return Objects.equals(this.account, purchaseTransactionRelationships.account) &&
        Objects.equals(this.customer, purchaseTransactionRelationships.customer) &&
        Objects.equals(this.customers, purchaseTransactionRelationships.customers) &&
        Objects.equals(this.card, purchaseTransactionRelationships.card) &&
        Objects.equals(this.authorization, purchaseTransactionRelationships.authorization) &&
        Objects.equals(this.authorizationRequest, purchaseTransactionRelationships.authorizationRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, card, authorization, authorizationRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTransactionRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    authorizationRequest: ").append(toIndentedString(authorizationRequest)).append("\n");
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

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    // add `authorization` to the URL query string
    if (getAuthorization() != null) {
      joiner.add(getAuthorization().toUrlQueryString(prefix + "authorization" + suffix));
    }

    // add `authorizationRequest` to the URL query string
    if (getAuthorizationRequest() != null) {
      joiner.add(getAuthorizationRequest().toUrlQueryString(prefix + "authorizationRequest" + suffix));
    }

    return joiner.toString();
  }
}

