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
import unit.java.sdk.model.CustomerRelationship;
import unit.java.sdk.model.Relationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateCardRelationships
 */
@JsonPropertyOrder({
  CreateCardRelationships.JSON_PROPERTY_ACCOUNT,
  CreateCardRelationships.JSON_PROPERTY_CUSTOMER,
  CreateCardRelationships.JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CreateCardRelationships {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private AccountRelationship account;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private CustomerRelationship customer;

  public static final String JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT = "defaultFundingAccount";
  private Relationship defaultFundingAccount;

  public CreateCardRelationships() { 
  }

  public CreateCardRelationships account(AccountRelationship account) {
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


  public CreateCardRelationships customer(CustomerRelationship customer) {
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


  public CreateCardRelationships defaultFundingAccount(Relationship defaultFundingAccount) {
    this.defaultFundingAccount = defaultFundingAccount;
    return this;
  }

   /**
   * Get defaultFundingAccount
   * @return defaultFundingAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Relationship getDefaultFundingAccount() {
    return defaultFundingAccount;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultFundingAccount(Relationship defaultFundingAccount) {
    this.defaultFundingAccount = defaultFundingAccount;
  }


  /**
   * Return true if this CreateCardRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardRelationships createCardRelationships = (CreateCardRelationships) o;
    return Objects.equals(this.account, createCardRelationships.account) &&
        Objects.equals(this.customer, createCardRelationships.customer) &&
        Objects.equals(this.defaultFundingAccount, createCardRelationships.defaultFundingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, defaultFundingAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    defaultFundingAccount: ").append(toIndentedString(defaultFundingAccount)).append("\n");
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

    // add `defaultFundingAccount` to the URL query string
    if (getDefaultFundingAccount() != null) {
      joiner.add(getDefaultFundingAccount().toUrlQueryString(prefix + "defaultFundingAccount" + suffix));
    }

    return joiner.toString();
  }
}

