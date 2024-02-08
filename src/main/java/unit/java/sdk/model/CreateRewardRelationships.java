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
import unit.java.sdk.model.ReceivedPaymentRelationshipsReceivePaymentTransaction;
import unit.java.sdk.model.Relationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateRewardRelationships
 */
@JsonPropertyOrder({
  CreateRewardRelationships.JSON_PROPERTY_FUNDING_ACCOUNT,
  CreateRewardRelationships.JSON_PROPERTY_RECEIVING_ACCOUNT,
  CreateRewardRelationships.JSON_PROPERTY_REWARDED_TRANSACTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRewardRelationships {
  public static final String JSON_PROPERTY_FUNDING_ACCOUNT = "fundingAccount";
  private Relationship fundingAccount;

  public static final String JSON_PROPERTY_RECEIVING_ACCOUNT = "receivingAccount";
  private Relationship receivingAccount;

  public static final String JSON_PROPERTY_REWARDED_TRANSACTION = "rewardedTransaction";
  private ReceivedPaymentRelationshipsReceivePaymentTransaction rewardedTransaction;

  public CreateRewardRelationships() { 
  }

  public CreateRewardRelationships fundingAccount(Relationship fundingAccount) {
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

  public Relationship getFundingAccount() {
    return fundingAccount;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingAccount(Relationship fundingAccount) {
    this.fundingAccount = fundingAccount;
  }


  public CreateRewardRelationships receivingAccount(Relationship receivingAccount) {
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


  public CreateRewardRelationships rewardedTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction rewardedTransaction) {
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

  public ReceivedPaymentRelationshipsReceivePaymentTransaction getRewardedTransaction() {
    return rewardedTransaction;
  }


  @JsonProperty(JSON_PROPERTY_REWARDED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewardedTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction rewardedTransaction) {
    this.rewardedTransaction = rewardedTransaction;
  }


  /**
   * Return true if this createRewardRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRewardRelationships createRewardRelationships = (CreateRewardRelationships) o;
    return Objects.equals(this.fundingAccount, createRewardRelationships.fundingAccount) &&
        Objects.equals(this.receivingAccount, createRewardRelationships.receivingAccount) &&
        Objects.equals(this.rewardedTransaction, createRewardRelationships.rewardedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingAccount, receivingAccount, rewardedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRewardRelationships {\n");
    sb.append("    fundingAccount: ").append(toIndentedString(fundingAccount)).append("\n");
    sb.append("    receivingAccount: ").append(toIndentedString(receivingAccount)).append("\n");
    sb.append("    rewardedTransaction: ").append(toIndentedString(rewardedTransaction)).append("\n");
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

    // add `fundingAccount` to the URL query string
    if (getFundingAccount() != null) {
      joiner.add(getFundingAccount().toUrlQueryString(prefix + "fundingAccount" + suffix));
    }

    // add `receivingAccount` to the URL query string
    if (getReceivingAccount() != null) {
      joiner.add(getReceivingAccount().toUrlQueryString(prefix + "receivingAccount" + suffix));
    }

    // add `rewardedTransaction` to the URL query string
    if (getRewardedTransaction() != null) {
      joiner.add(getRewardedTransaction().toUrlQueryString(prefix + "rewardedTransaction" + suffix));
    }

    return joiner.toString();
  }
}
