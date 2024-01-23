/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.3
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
import unit.java.sdk.model.CardRelationship;
import unit.java.sdk.model.Relationship;
import unit.java.sdk.model.TransactionRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RewardRelationships
 */
@JsonPropertyOrder({
  RewardRelationships.JSON_PROPERTY_RECEIVING_ACCOUNT,
  RewardRelationships.JSON_PROPERTY_FUNDING_ACCOUNT,
  RewardRelationships.JSON_PROPERTY_CUSTOMER,
  RewardRelationships.JSON_PROPERTY_REWARDED_TRANSACTION,
  RewardRelationships.JSON_PROPERTY_TRANSACTION,
  RewardRelationships.JSON_PROPERTY_CARD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RewardRelationships {
  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT = "receivingAccount";
  private Relationship receivingAccount;

  public static final String JSON_PROPERTY_FUNDING_ACCOUNT = "fundingAccount";
  private Relationship fundingAccount;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Relationship customer;

  public static final String JSON_PROPERTY_REWARDED_TRANSACTION = "rewardedTransaction";
  private Relationship rewardedTransaction;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private TransactionRelationship transaction;

  public static final String JSON_PROPERTY_CARD = "card";
  private CardRelationship card;

  public RewardRelationships() { 
  }

  public RewardRelationships receivingAccount(Relationship receivingAccount) {
    this.receivingAccount = receivingAccount;
    return this;
  }

   /**
   * Get receivingAccount
   * @return receivingAccount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Relationship getReceivingAccount() {
    return receivingAccount;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReceivingAccount(Relationship receivingAccount) {
    this.receivingAccount = receivingAccount;
  }


  public RewardRelationships fundingAccount(Relationship fundingAccount) {
    this.fundingAccount = fundingAccount;
    return this;
  }

   /**
   * Get fundingAccount
   * @return fundingAccount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Relationship getFundingAccount() {
    return fundingAccount;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundingAccount(Relationship fundingAccount) {
    this.fundingAccount = fundingAccount;
  }


  public RewardRelationships customer(Relationship customer) {
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


  public RewardRelationships rewardedTransaction(Relationship rewardedTransaction) {
    this.rewardedTransaction = rewardedTransaction;
    return this;
  }

   /**
   * Get rewardedTransaction
   * @return rewardedTransaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REWARDED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Relationship getRewardedTransaction() {
    return rewardedTransaction;
  }


  @JsonProperty(JSON_PROPERTY_REWARDED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardedTransaction(Relationship rewardedTransaction) {
    this.rewardedTransaction = rewardedTransaction;
  }


  public RewardRelationships transaction(TransactionRelationship transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionRelationship getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(TransactionRelationship transaction) {
    this.transaction = transaction;
  }


  public RewardRelationships card(CardRelationship card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardRelationship getCard() {
    return card;
  }


  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(CardRelationship card) {
    this.card = card;
  }


  /**
   * Return true if this rewardRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardRelationships rewardRelationships = (RewardRelationships) o;
    return Objects.equals(this.receivingAccount, rewardRelationships.receivingAccount) &&
        Objects.equals(this.fundingAccount, rewardRelationships.fundingAccount) &&
        Objects.equals(this.customer, rewardRelationships.customer) &&
        Objects.equals(this.rewardedTransaction, rewardRelationships.rewardedTransaction) &&
        Objects.equals(this.transaction, rewardRelationships.transaction) &&
        Objects.equals(this.card, rewardRelationships.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receivingAccount, fundingAccount, customer, rewardedTransaction, transaction, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardRelationships {\n");
    sb.append("    receivingAccount: ").append(toIndentedString(receivingAccount)).append("\n");
    sb.append("    fundingAccount: ").append(toIndentedString(fundingAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    rewardedTransaction: ").append(toIndentedString(rewardedTransaction)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

    // add `receivingAccount` to the URL query string
    if (getReceivingAccount() != null) {
      joiner.add(getReceivingAccount().toUrlQueryString(prefix + "receivingAccount" + suffix));
    }

    // add `fundingAccount` to the URL query string
    if (getFundingAccount() != null) {
      joiner.add(getFundingAccount().toUrlQueryString(prefix + "fundingAccount" + suffix));
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `rewardedTransaction` to the URL query string
    if (getRewardedTransaction() != null) {
      joiner.add(getRewardedTransaction().toUrlQueryString(prefix + "rewardedTransaction" + suffix));
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    // add `card` to the URL query string
    if (getCard() != null) {
      joiner.add(getCard().toUrlQueryString(prefix + "card" + suffix));
    }

    return joiner.toString();
  }
}

