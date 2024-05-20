/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.4
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.JSON;
/**
 * Transaction
 */
@JsonPropertyOrder({
  Transaction.JSON_PROPERTY_ID,
  Transaction.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AccountLowBalanceClosureTransaction.class, name = "accountLowBalanceClosureTransaction"),
  @JsonSubTypes.Type(value = AdjustmentTransaction.class, name = "adjustmentTransaction"),
  @JsonSubTypes.Type(value = AtmTransaction.class, name = "atmTransaction"),
  @JsonSubTypes.Type(value = BankRepaymentTransaction.class, name = "bankRepaymentTransaction"),
  @JsonSubTypes.Type(value = BillPayTransaction.class, name = "billPayTransaction"),
  @JsonSubTypes.Type(value = BookTransaction.class, name = "bookTransaction"),
  @JsonSubTypes.Type(value = CardTransaction.class, name = "cardTransaction"),
  @JsonSubTypes.Type(value = CashDepositTransaction.class, name = "cashDepositTransaction"),
  @JsonSubTypes.Type(value = ChargebackTransaction.class, name = "chargebackTransaction"),
  @JsonSubTypes.Type(value = CheckDepositTransaction.class, name = "checkDepositTransaction"),
  @JsonSubTypes.Type(value = CheckPaymentTransaction.class, name = "checkPaymentTransaction"),
  @JsonSubTypes.Type(value = CustomerRepaymentReturnedTransaction.class, name = "customerRepaymentReturnedTransaction"),
  @JsonSubTypes.Type(value = CustomerRepaymentTransaction.class, name = "customerRepaymentTransaction"),
  @JsonSubTypes.Type(value = DishonoredAchTransaction.class, name = "dishonoredAchTransaction"),
  @JsonSubTypes.Type(value = DisputeSettlementTransaction.class, name = "disputeSettlementTransaction"),
  @JsonSubTypes.Type(value = DisputeTransaction.class, name = "disputeTransaction"),
  @JsonSubTypes.Type(value = FeeTransaction.class, name = "feeTransaction"),
  @JsonSubTypes.Type(value = InterchangeTransaction.class, name = "interchangeTransaction"),
  @JsonSubTypes.Type(value = InterestShareTransaction.class, name = "interestShareTransaction"),
  @JsonSubTypes.Type(value = InterestTransaction.class, name = "interestTransaction"),
  @JsonSubTypes.Type(value = NegativeBalanceCoverageTransaction.class, name = "negativeBalanceCoverageTransaction"),
  @JsonSubTypes.Type(value = OriginatedAchTransaction.class, name = "originatedAchTransaction"),
  @JsonSubTypes.Type(value = PaymentAdvanceTransaction.class, name = "paymentAdvanceTransaction"),
  @JsonSubTypes.Type(value = PurchaseTransaction.class, name = "purchaseTransaction"),
  @JsonSubTypes.Type(value = ReceivedAchTransaction.class, name = "receivedAchTransaction"),
  @JsonSubTypes.Type(value = ReleaseTransaction.class, name = "releaseTransaction"),
  @JsonSubTypes.Type(value = RepaidPaymentAdvanceTransaction.class, name = "repaidPaymentAdvanceTransaction"),
  @JsonSubTypes.Type(value = ReturnedAchTransaction.class, name = "returnedAchTransaction"),
  @JsonSubTypes.Type(value = ReturnedCheckDepositTransaction.class, name = "returnedCheckDepositTransaction"),
  @JsonSubTypes.Type(value = ReturnedCheckPaymentTransaction.class, name = "returnedCheckPaymentTransaction"),
  @JsonSubTypes.Type(value = ReturnedReceivedAchTransaction.class, name = "returnedReceivedAchTransaction"),
  @JsonSubTypes.Type(value = ReversalTransaction.class, name = "reversalTransaction"),
  @JsonSubTypes.Type(value = RewardTransaction.class, name = "rewardTransaction"),
  @JsonSubTypes.Type(value = SettlementTransaction.class, name = "settlementTransaction"),
  @JsonSubTypes.Type(value = SponsoredInterestTransaction.class, name = "sponsoredInterestTransaction"),
  @JsonSubTypes.Type(value = WireTransaction.class, name = "wireTransaction"),
})

public class Transaction {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Transaction() { 
  }

  public Transaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Transaction type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this transaction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.type, transaction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("accountLowBalanceClosureTransaction", AccountLowBalanceClosureTransaction.class);
  mappings.put("adjustmentTransaction", AdjustmentTransaction.class);
  mappings.put("atmTransaction", AtmTransaction.class);
  mappings.put("bankRepaymentTransaction", BankRepaymentTransaction.class);
  mappings.put("billPayTransaction", BillPayTransaction.class);
  mappings.put("bookTransaction", BookTransaction.class);
  mappings.put("cardTransaction", CardTransaction.class);
  mappings.put("cashDepositTransaction", CashDepositTransaction.class);
  mappings.put("chargebackTransaction", ChargebackTransaction.class);
  mappings.put("checkDepositTransaction", CheckDepositTransaction.class);
  mappings.put("checkPaymentTransaction", CheckPaymentTransaction.class);
  mappings.put("customerRepaymentReturnedTransaction", CustomerRepaymentReturnedTransaction.class);
  mappings.put("customerRepaymentTransaction", CustomerRepaymentTransaction.class);
  mappings.put("dishonoredAchTransaction", DishonoredAchTransaction.class);
  mappings.put("disputeSettlementTransaction", DisputeSettlementTransaction.class);
  mappings.put("disputeTransaction", DisputeTransaction.class);
  mappings.put("feeTransaction", FeeTransaction.class);
  mappings.put("interchangeTransaction", InterchangeTransaction.class);
  mappings.put("interestShareTransaction", InterestShareTransaction.class);
  mappings.put("interestTransaction", InterestTransaction.class);
  mappings.put("negativeBalanceCoverageTransaction", NegativeBalanceCoverageTransaction.class);
  mappings.put("originatedAchTransaction", OriginatedAchTransaction.class);
  mappings.put("paymentAdvanceTransaction", PaymentAdvanceTransaction.class);
  mappings.put("purchaseTransaction", PurchaseTransaction.class);
  mappings.put("receivedAchTransaction", ReceivedAchTransaction.class);
  mappings.put("releaseTransaction", ReleaseTransaction.class);
  mappings.put("repaidPaymentAdvanceTransaction", RepaidPaymentAdvanceTransaction.class);
  mappings.put("returnedAchTransaction", ReturnedAchTransaction.class);
  mappings.put("returnedCheckDepositTransaction", ReturnedCheckDepositTransaction.class);
  mappings.put("returnedCheckPaymentTransaction", ReturnedCheckPaymentTransaction.class);
  mappings.put("returnedReceivedAchTransaction", ReturnedReceivedAchTransaction.class);
  mappings.put("reversalTransaction", ReversalTransaction.class);
  mappings.put("rewardTransaction", RewardTransaction.class);
  mappings.put("settlementTransaction", SettlementTransaction.class);
  mappings.put("sponsoredInterestTransaction", SponsoredInterestTransaction.class);
  mappings.put("wireTransaction", WireTransaction.class);
  mappings.put("transaction", Transaction.class);
  JSON.registerDiscriminator(Transaction.class, "type", mappings);
}
}

