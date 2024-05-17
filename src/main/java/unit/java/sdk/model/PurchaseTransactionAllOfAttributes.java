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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.CardVerificationData;
import unit.java.sdk.model.Coordinates;
import unit.java.sdk.model.Merchant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PurchaseTransactionAllOfAttributes
 */
@JsonPropertyOrder({
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_DIRECTION,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_AMOUNT,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_BALANCE,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_SUMMARY,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_CARD_LAST4_DIGITS,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_MERCHANT,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_COORDINATES,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_RECURRING,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_TAGS,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_NETWORK_TRANSACTION_ID,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_INTERCHANGE,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_ECOMMERCE,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_CARD_PRESENT,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_INTERNATIONAL_SERVICE_FEE,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_PAYMENT_METHOD,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_DIGITAL_WALLET,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_CARD_VERIFICATION_DATA,
  PurchaseTransactionAllOfAttributes.JSON_PROPERTY_CARD_NETWORK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PurchaseTransactionAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    CREDIT("Credit"),
    
    DEBIT("Debit");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Integer balance;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_CARD_LAST4_DIGITS = "cardLast4Digits";
  private String cardLast4Digits;

  public static final String JSON_PROPERTY_MERCHANT = "merchant";
  private Merchant merchant;

  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  private Coordinates coordinates;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private Boolean recurring;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_NETWORK_TRANSACTION_ID = "networkTransactionId";
  private String networkTransactionId;

  public static final String JSON_PROPERTY_INTERCHANGE = "interchange";
  private JsonNullable<String> interchange = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ECOMMERCE = "ecommerce";
  private Boolean ecommerce;

  public static final String JSON_PROPERTY_CARD_PRESENT = "cardPresent";
  private Boolean cardPresent;

  public static final String JSON_PROPERTY_INTERNATIONAL_SERVICE_FEE = "internationalServiceFee";
  private JsonNullable<Integer> internationalServiceFee = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public static final String JSON_PROPERTY_DIGITAL_WALLET = "digitalWallet";
  private String digitalWallet;

  public static final String JSON_PROPERTY_CARD_VERIFICATION_DATA = "cardVerificationData";
  private CardVerificationData cardVerificationData;

  public static final String JSON_PROPERTY_CARD_NETWORK = "cardNetwork";
  private String cardNetwork;

  public PurchaseTransactionAllOfAttributes() { 
  }

  public PurchaseTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
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


  public PurchaseTransactionAllOfAttributes direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public PurchaseTransactionAllOfAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
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


  public PurchaseTransactionAllOfAttributes balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public PurchaseTransactionAllOfAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSummary(String summary) {
    this.summary = summary;
  }


  public PurchaseTransactionAllOfAttributes cardLast4Digits(String cardLast4Digits) {
    this.cardLast4Digits = cardLast4Digits;
    return this;
  }

   /**
   * Get cardLast4Digits
   * @return cardLast4Digits
  **/
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


  public PurchaseTransactionAllOfAttributes merchant(Merchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
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


  public PurchaseTransactionAllOfAttributes coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Coordinates getCoordinates() {
    return coordinates;
  }


  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }


  public PurchaseTransactionAllOfAttributes recurring(Boolean recurring) {
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
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


  public PurchaseTransactionAllOfAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public PurchaseTransactionAllOfAttributes networkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
    return this;
  }

   /**
   * Get networkTransactionId
   * @return networkTransactionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkTransactionId() {
    return networkTransactionId;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
  }


  public PurchaseTransactionAllOfAttributes interchange(String interchange) {
    this.interchange = JsonNullable.<String>of(interchange);
    return this;
  }

   /**
   * Get interchange
   * @return interchange
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getInterchange() {
        return interchange.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInterchange_JsonNullable() {
    return interchange;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERCHANGE)
  public void setInterchange_JsonNullable(JsonNullable<String> interchange) {
    this.interchange = interchange;
  }

  public void setInterchange(String interchange) {
    this.interchange = JsonNullable.<String>of(interchange);
  }


  public PurchaseTransactionAllOfAttributes ecommerce(Boolean ecommerce) {
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Get ecommerce
   * @return ecommerce
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ECOMMERCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEcommerce() {
    return ecommerce;
  }


  @JsonProperty(JSON_PROPERTY_ECOMMERCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEcommerce(Boolean ecommerce) {
    this.ecommerce = ecommerce;
  }


  public PurchaseTransactionAllOfAttributes cardPresent(Boolean cardPresent) {
    this.cardPresent = cardPresent;
    return this;
  }

   /**
   * Get cardPresent
   * @return cardPresent
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARD_PRESENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCardPresent() {
    return cardPresent;
  }


  @JsonProperty(JSON_PROPERTY_CARD_PRESENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCardPresent(Boolean cardPresent) {
    this.cardPresent = cardPresent;
  }


  public PurchaseTransactionAllOfAttributes internationalServiceFee(Integer internationalServiceFee) {
    this.internationalServiceFee = JsonNullable.<Integer>of(internationalServiceFee);
    return this;
  }

   /**
   * Get internationalServiceFee
   * @return internationalServiceFee
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Integer getInternationalServiceFee() {
        return internationalServiceFee.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_SERVICE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getInternationalServiceFee_JsonNullable() {
    return internationalServiceFee;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_SERVICE_FEE)
  public void setInternationalServiceFee_JsonNullable(JsonNullable<Integer> internationalServiceFee) {
    this.internationalServiceFee = internationalServiceFee;
  }

  public void setInternationalServiceFee(Integer internationalServiceFee) {
    this.internationalServiceFee = JsonNullable.<Integer>of(internationalServiceFee);
  }


  public PurchaseTransactionAllOfAttributes paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
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


  public PurchaseTransactionAllOfAttributes digitalWallet(String digitalWallet) {
    this.digitalWallet = digitalWallet;
    return this;
  }

   /**
   * Get digitalWallet
   * @return digitalWallet
  **/
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


  public PurchaseTransactionAllOfAttributes cardVerificationData(CardVerificationData cardVerificationData) {
    this.cardVerificationData = cardVerificationData;
    return this;
  }

   /**
   * Get cardVerificationData
   * @return cardVerificationData
  **/
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


  public PurchaseTransactionAllOfAttributes cardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
    return this;
  }

   /**
   * Get cardNetwork
   * @return cardNetwork
  **/
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


  /**
   * Return true if this PurchaseTransaction_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseTransactionAllOfAttributes purchaseTransactionAllOfAttributes = (PurchaseTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, purchaseTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, purchaseTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, purchaseTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, purchaseTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, purchaseTransactionAllOfAttributes.summary) &&
        Objects.equals(this.cardLast4Digits, purchaseTransactionAllOfAttributes.cardLast4Digits) &&
        Objects.equals(this.merchant, purchaseTransactionAllOfAttributes.merchant) &&
        Objects.equals(this.coordinates, purchaseTransactionAllOfAttributes.coordinates) &&
        Objects.equals(this.recurring, purchaseTransactionAllOfAttributes.recurring) &&
        Objects.equals(this.tags, purchaseTransactionAllOfAttributes.tags) &&
        Objects.equals(this.networkTransactionId, purchaseTransactionAllOfAttributes.networkTransactionId) &&
        equalsNullable(this.interchange, purchaseTransactionAllOfAttributes.interchange) &&
        Objects.equals(this.ecommerce, purchaseTransactionAllOfAttributes.ecommerce) &&
        Objects.equals(this.cardPresent, purchaseTransactionAllOfAttributes.cardPresent) &&
        equalsNullable(this.internationalServiceFee, purchaseTransactionAllOfAttributes.internationalServiceFee) &&
        Objects.equals(this.paymentMethod, purchaseTransactionAllOfAttributes.paymentMethod) &&
        Objects.equals(this.digitalWallet, purchaseTransactionAllOfAttributes.digitalWallet) &&
        Objects.equals(this.cardVerificationData, purchaseTransactionAllOfAttributes.cardVerificationData) &&
        Objects.equals(this.cardNetwork, purchaseTransactionAllOfAttributes.cardNetwork);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, cardLast4Digits, merchant, coordinates, recurring, tags, networkTransactionId, hashCodeNullable(interchange), ecommerce, cardPresent, hashCodeNullable(internationalServiceFee), paymentMethod, digitalWallet, cardVerificationData, cardNetwork);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    cardLast4Digits: ").append(toIndentedString(cardLast4Digits)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
    sb.append("    interchange: ").append(toIndentedString(interchange)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
    sb.append("    cardPresent: ").append(toIndentedString(cardPresent)).append("\n");
    sb.append("    internationalServiceFee: ").append(toIndentedString(internationalServiceFee)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    digitalWallet: ").append(toIndentedString(digitalWallet)).append("\n");
    sb.append("    cardVerificationData: ").append(toIndentedString(cardVerificationData)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
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
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `summary` to the URL query string
    if (getSummary() != null) {
      joiner.add(String.format("%ssummary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSummary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardLast4Digits` to the URL query string
    if (getCardLast4Digits() != null) {
      joiner.add(String.format("%scardLast4Digits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardLast4Digits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `merchant` to the URL query string
    if (getMerchant() != null) {
      joiner.add(getMerchant().toUrlQueryString(prefix + "merchant" + suffix));
    }

    // add `coordinates` to the URL query string
    if (getCoordinates() != null) {
      joiner.add(getCoordinates().toUrlQueryString(prefix + "coordinates" + suffix));
    }

    // add `recurring` to the URL query string
    if (getRecurring() != null) {
      joiner.add(String.format("%srecurring%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurring()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `networkTransactionId` to the URL query string
    if (getNetworkTransactionId() != null) {
      joiner.add(String.format("%snetworkTransactionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetworkTransactionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interchange` to the URL query string
    if (getInterchange() != null) {
      joiner.add(String.format("%sinterchange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInterchange()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ecommerce` to the URL query string
    if (getEcommerce() != null) {
      joiner.add(String.format("%secommerce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEcommerce()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardPresent` to the URL query string
    if (getCardPresent() != null) {
      joiner.add(String.format("%scardPresent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardPresent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `internationalServiceFee` to the URL query string
    if (getInternationalServiceFee() != null) {
      joiner.add(String.format("%sinternationalServiceFee%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternationalServiceFee()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `paymentMethod` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(String.format("%spaymentMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `digitalWallet` to the URL query string
    if (getDigitalWallet() != null) {
      joiner.add(String.format("%sdigitalWallet%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDigitalWallet()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardVerificationData` to the URL query string
    if (getCardVerificationData() != null) {
      joiner.add(getCardVerificationData().toUrlQueryString(prefix + "cardVerificationData" + suffix));
    }

    // add `cardNetwork` to the URL query string
    if (getCardNetwork() != null) {
      joiner.add(String.format("%scardNetwork%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardNetwork()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

