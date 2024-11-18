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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import unit.java.sdk.model.CardVerificationData;
import unit.java.sdk.model.Merchant;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AuthorizationAttributes
 */
@JsonPropertyOrder({
  AuthorizationAttributes.JSON_PROPERTY_CREATED_AT,
  AuthorizationAttributes.JSON_PROPERTY_AMOUNT,
  AuthorizationAttributes.JSON_PROPERTY_CARD_LAST4_DIGITS,
  AuthorizationAttributes.JSON_PROPERTY_MERCHANT,
  AuthorizationAttributes.JSON_PROPERTY_RECURRING,
  AuthorizationAttributes.JSON_PROPERTY_STATUS,
  AuthorizationAttributes.JSON_PROPERTY_DECLINE_REASON,
  AuthorizationAttributes.JSON_PROPERTY_TAGS,
  AuthorizationAttributes.JSON_PROPERTY_PAYMENT_METHOD,
  AuthorizationAttributes.JSON_PROPERTY_DIGITAL_WALLET,
  AuthorizationAttributes.JSON_PROPERTY_SUMMARY,
  AuthorizationAttributes.JSON_PROPERTY_CARD_VERIFICATION_DATA,
  AuthorizationAttributes.JSON_PROPERTY_CARD_NETWORK,
  AuthorizationAttributes.JSON_PROPERTY_CASH_WITHDRAWAL_AMOUNT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AuthorizationAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CARD_LAST4_DIGITS = "cardLast4Digits";
  private String cardLast4Digits;

  public static final String JSON_PROPERTY_MERCHANT = "merchant";
  private Merchant merchant;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Boolean recurring;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_DECLINE_REASON = "declineReason";
  private String declineReason;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public static final String JSON_PROPERTY_DIGITAL_WALLET = "digitalWallet";
  private String digitalWallet;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_CARD_VERIFICATION_DATA = "cardVerificationData";
  private CardVerificationData cardVerificationData;

  public static final String JSON_PROPERTY_CARD_NETWORK = "cardNetwork";
  private String cardNetwork;

  public static final String JSON_PROPERTY_CASH_WITHDRAWAL_AMOUNT = "cashWithdrawalAmount";
  private Integer cashWithdrawalAmount;

  public AuthorizationAttributes() { 
  }

  public AuthorizationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AuthorizationAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public AuthorizationAttributes cardLast4Digits(String cardLast4Digits) {
    this.cardLast4Digits = cardLast4Digits;
    return this;
  }

  /**
   * Get cardLast4Digits
   * @return cardLast4Digits
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCardLast4Digits() {
    return cardLast4Digits;
  }


  @JsonProperty(JSON_PROPERTY_CARD_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardLast4Digits(String cardLast4Digits) {
    this.cardLast4Digits = cardLast4Digits;
  }


  public AuthorizationAttributes merchant(Merchant merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Merchant getMerchant() {
    return merchant;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }


  public AuthorizationAttributes recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

  /**
   * Get recurring
   * @return recurring
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getRecurring() {
    return recurring;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public AuthorizationAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public AuthorizationAttributes declineReason(String declineReason) {
    this.declineReason = declineReason;
    return this;
  }

  /**
   * Get declineReason
   * @return declineReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECLINE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeclineReason() {
    return declineReason;
  }


  @JsonProperty(JSON_PROPERTY_DECLINE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeclineReason(String declineReason) {
    this.declineReason = declineReason;
  }


  public AuthorizationAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AuthorizationAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public AuthorizationAttributes paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public AuthorizationAttributes digitalWallet(String digitalWallet) {
    this.digitalWallet = digitalWallet;
    return this;
  }

  /**
   * Get digitalWallet
   * @return digitalWallet
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIGITAL_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDigitalWallet() {
    return digitalWallet;
  }


  @JsonProperty(JSON_PROPERTY_DIGITAL_WALLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDigitalWallet(String digitalWallet) {
    this.digitalWallet = digitalWallet;
  }


  public AuthorizationAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(String summary) {
    this.summary = summary;
  }


  public AuthorizationAttributes cardVerificationData(CardVerificationData cardVerificationData) {
    this.cardVerificationData = cardVerificationData;
    return this;
  }

  /**
   * Get cardVerificationData
   * @return cardVerificationData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_VERIFICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CardVerificationData getCardVerificationData() {
    return cardVerificationData;
  }


  @JsonProperty(JSON_PROPERTY_CARD_VERIFICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardVerificationData(CardVerificationData cardVerificationData) {
    this.cardVerificationData = cardVerificationData;
  }


  public AuthorizationAttributes cardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
    return this;
  }

  /**
   * Get cardNetwork
   * @return cardNetwork
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardNetwork() {
    return cardNetwork;
  }


  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
  }


  public AuthorizationAttributes cashWithdrawalAmount(Integer cashWithdrawalAmount) {
    this.cashWithdrawalAmount = cashWithdrawalAmount;
    return this;
  }

  /**
   * Get cashWithdrawalAmount
   * @return cashWithdrawalAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASH_WITHDRAWAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getCashWithdrawalAmount() {
    return cashWithdrawalAmount;
  }


  @JsonProperty(JSON_PROPERTY_CASH_WITHDRAWAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashWithdrawalAmount(Integer cashWithdrawalAmount) {
    this.cashWithdrawalAmount = cashWithdrawalAmount;
  }


  /**
   * Return true if this Authorization_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationAttributes authorizationAttributes = (AuthorizationAttributes) o;
    return Objects.equals(this.createdAt, authorizationAttributes.createdAt) &&
        Objects.equals(this.amount, authorizationAttributes.amount) &&
        Objects.equals(this.cardLast4Digits, authorizationAttributes.cardLast4Digits) &&
        Objects.equals(this.merchant, authorizationAttributes.merchant) &&
        Objects.equals(this.recurring, authorizationAttributes.recurring) &&
        Objects.equals(this.status, authorizationAttributes.status) &&
        Objects.equals(this.declineReason, authorizationAttributes.declineReason) &&
        Objects.equals(this.tags, authorizationAttributes.tags) &&
        Objects.equals(this.paymentMethod, authorizationAttributes.paymentMethod) &&
        Objects.equals(this.digitalWallet, authorizationAttributes.digitalWallet) &&
        Objects.equals(this.summary, authorizationAttributes.summary) &&
        Objects.equals(this.cardVerificationData, authorizationAttributes.cardVerificationData) &&
        Objects.equals(this.cardNetwork, authorizationAttributes.cardNetwork) &&
        Objects.equals(this.cashWithdrawalAmount, authorizationAttributes.cashWithdrawalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, amount, cardLast4Digits, merchant, recurring, status, declineReason, tags, paymentMethod, digitalWallet, summary, cardVerificationData, cardNetwork, cashWithdrawalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cardLast4Digits: ").append(toIndentedString(cardLast4Digits)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    declineReason: ").append(toIndentedString(declineReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    digitalWallet: ").append(toIndentedString(digitalWallet)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    cardVerificationData: ").append(toIndentedString(cardVerificationData)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cashWithdrawalAmount: ").append(toIndentedString(cashWithdrawalAmount)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardLast4Digits` to the URL query string
    if (getCardLast4Digits() != null) {
      joiner.add(String.format("%scardLast4Digits%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardLast4Digits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant` to the URL query string
    if (getMerchant() != null) {
      joiner.add(getMerchant().toUrlQueryString(prefix + "merchant" + suffix));
    }

    // add `recurring` to the URL query string
    if (getRecurring() != null) {
      joiner.add(String.format("%srecurring%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRecurring()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `declineReason` to the URL query string
    if (getDeclineReason() != null) {
      joiner.add(String.format("%sdeclineReason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDeclineReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `paymentMethod` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(String.format("%spaymentMethod%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaymentMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `digitalWallet` to the URL query string
    if (getDigitalWallet() != null) {
      joiner.add(String.format("%sdigitalWallet%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDigitalWallet()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `summary` to the URL query string
    if (getSummary() != null) {
      joiner.add(String.format("%ssummary%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSummary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardVerificationData` to the URL query string
    if (getCardVerificationData() != null) {
      joiner.add(getCardVerificationData().toUrlQueryString(prefix + "cardVerificationData" + suffix));
    }

    // add `cardNetwork` to the URL query string
    if (getCardNetwork() != null) {
      joiner.add(String.format("%scardNetwork%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardNetwork()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cashWithdrawalAmount` to the URL query string
    if (getCashWithdrawalAmount() != null) {
      joiner.add(String.format("%scashWithdrawalAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCashWithdrawalAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

