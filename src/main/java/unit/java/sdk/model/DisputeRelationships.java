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
import unit.java.sdk.model.Relationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DisputeRelationships
 */
@JsonPropertyOrder({
  DisputeRelationships.JSON_PROPERTY_CUSTOMER,
  DisputeRelationships.JSON_PROPERTY_ACCOUNT,
  DisputeRelationships.JSON_PROPERTY_TRANSACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisputeRelationships {
  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Relationship customer;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Relationship account;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private Relationship transaction;

  public DisputeRelationships() { 
  }

  public DisputeRelationships customer(Relationship customer) {
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

  public Relationship getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomer(Relationship customer) {
    this.customer = customer;
  }


  public DisputeRelationships account(Relationship account) {
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

  public Relationship getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(Relationship account) {
    this.account = account;
  }


  public DisputeRelationships transaction(Relationship transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Relationship getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransaction(Relationship transaction) {
    this.transaction = transaction;
  }


  /**
   * Return true if this disputeRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeRelationships disputeRelationships = (DisputeRelationships) o;
    return Objects.equals(this.customer, disputeRelationships.customer) &&
        Objects.equals(this.account, disputeRelationships.account) &&
        Objects.equals(this.transaction, disputeRelationships.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, account, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeRelationships {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    return joiner.toString();
  }
}

