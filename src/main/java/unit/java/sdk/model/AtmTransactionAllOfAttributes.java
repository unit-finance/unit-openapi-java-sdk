/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.1
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AtmTransactionAllOfAttributes
 */
@JsonPropertyOrder({
  AtmTransactionAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_DIRECTION,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_AMOUNT,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_BALANCE,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_SUMMARY,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_CARD_LAST4_DIGITS,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_ATM_NAME,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_ATM_LOCATION,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_SURCHARGE,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_TAGS,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_NETWORK_TRANSACTION_ID,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_INTERCHANGE,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_INTERNATIONAL_SERVICE_FEE,
  AtmTransactionAllOfAttributes.JSON_PROPERTY_CARD_NETWORK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AtmTransactionAllOfAttributes {
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
  private Long amount;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Long balance;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_CARD_LAST4_DIGITS = "cardLast4Digits";
  private String cardLast4Digits;

  public static final String JSON_PROPERTY_ATM_NAME = "atmName";
  private String atmName;

  public static final String JSON_PROPERTY_ATM_LOCATION = "atmLocation";
  private String atmLocation;

  public static final String JSON_PROPERTY_SURCHARGE = "surcharge";
  private Long surcharge;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_NETWORK_TRANSACTION_ID = "networkTransactionId";
  private String networkTransactionId;

  public static final String JSON_PROPERTY_INTERCHANGE = "interchange";
  private JsonNullable<String> interchange = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INTERNATIONAL_SERVICE_FEE = "internationalServiceFee";
  private JsonNullable<Integer> internationalServiceFee = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_CARD_NETWORK = "cardNetwork";
  private String cardNetwork;

  public AtmTransactionAllOfAttributes() { 
  }

  public AtmTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public AtmTransactionAllOfAttributes direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
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


  public AtmTransactionAllOfAttributes amount(Long amount) {
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
  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public AtmTransactionAllOfAttributes balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public AtmTransactionAllOfAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
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


  public AtmTransactionAllOfAttributes cardLast4Digits(String cardLast4Digits) {
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


  public AtmTransactionAllOfAttributes atmName(String atmName) {
    this.atmName = atmName;
    return this;
  }

  /**
   * Get atmName
   * @return atmName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAtmName() {
    return atmName;
  }


  @JsonProperty(JSON_PROPERTY_ATM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtmName(String atmName) {
    this.atmName = atmName;
  }


  public AtmTransactionAllOfAttributes atmLocation(String atmLocation) {
    this.atmLocation = atmLocation;
    return this;
  }

  /**
   * Get atmLocation
   * @return atmLocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATM_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAtmLocation() {
    return atmLocation;
  }


  @JsonProperty(JSON_PROPERTY_ATM_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtmLocation(String atmLocation) {
    this.atmLocation = atmLocation;
  }


  public AtmTransactionAllOfAttributes surcharge(Long surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  /**
   * Get surcharge
   * @return surcharge
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSurcharge() {
    return surcharge;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSurcharge(Long surcharge) {
    this.surcharge = surcharge;
  }


  public AtmTransactionAllOfAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AtmTransactionAllOfAttributes putTagsItem(String key, String tagsItem) {
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


  public AtmTransactionAllOfAttributes networkTransactionId(String networkTransactionId) {
    this.networkTransactionId = networkTransactionId;
    return this;
  }

  /**
   * Get networkTransactionId
   * @return networkTransactionId
   */
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


  public AtmTransactionAllOfAttributes interchange(String interchange) {
    this.interchange = JsonNullable.<String>of(interchange);
    return this;
  }

  /**
   * Get interchange
   * @return interchange
   */
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


  public AtmTransactionAllOfAttributes internationalServiceFee(Integer internationalServiceFee) {
    this.internationalServiceFee = JsonNullable.<Integer>of(internationalServiceFee);
    return this;
  }

  /**
   * Get internationalServiceFee
   * @return internationalServiceFee
   */
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


  public AtmTransactionAllOfAttributes cardNetwork(String cardNetwork) {
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


  /**
   * Return true if this AtmTransaction_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtmTransactionAllOfAttributes atmTransactionAllOfAttributes = (AtmTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, atmTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, atmTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, atmTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, atmTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, atmTransactionAllOfAttributes.summary) &&
        Objects.equals(this.cardLast4Digits, atmTransactionAllOfAttributes.cardLast4Digits) &&
        Objects.equals(this.atmName, atmTransactionAllOfAttributes.atmName) &&
        Objects.equals(this.atmLocation, atmTransactionAllOfAttributes.atmLocation) &&
        Objects.equals(this.surcharge, atmTransactionAllOfAttributes.surcharge) &&
        Objects.equals(this.tags, atmTransactionAllOfAttributes.tags) &&
        Objects.equals(this.networkTransactionId, atmTransactionAllOfAttributes.networkTransactionId) &&
        equalsNullable(this.interchange, atmTransactionAllOfAttributes.interchange) &&
        equalsNullable(this.internationalServiceFee, atmTransactionAllOfAttributes.internationalServiceFee) &&
        Objects.equals(this.cardNetwork, atmTransactionAllOfAttributes.cardNetwork);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, cardLast4Digits, atmName, atmLocation, surcharge, tags, networkTransactionId, hashCodeNullable(interchange), hashCodeNullable(internationalServiceFee), cardNetwork);
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
    sb.append("class AtmTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    cardLast4Digits: ").append(toIndentedString(cardLast4Digits)).append("\n");
    sb.append("    atmName: ").append(toIndentedString(atmName)).append("\n");
    sb.append("    atmLocation: ").append(toIndentedString(atmLocation)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    networkTransactionId: ").append(toIndentedString(networkTransactionId)).append("\n");
    sb.append("    interchange: ").append(toIndentedString(interchange)).append("\n");
    sb.append("    internationalServiceFee: ").append(toIndentedString(internationalServiceFee)).append("\n");
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
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `summary` to the URL query string
    if (getSummary() != null) {
      joiner.add(String.format("%ssummary%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSummary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardLast4Digits` to the URL query string
    if (getCardLast4Digits() != null) {
      joiner.add(String.format("%scardLast4Digits%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardLast4Digits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `atmName` to the URL query string
    if (getAtmName() != null) {
      joiner.add(String.format("%satmName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAtmName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `atmLocation` to the URL query string
    if (getAtmLocation() != null) {
      joiner.add(String.format("%satmLocation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAtmLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `surcharge` to the URL query string
    if (getSurcharge() != null) {
      joiner.add(String.format("%ssurcharge%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSurcharge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `networkTransactionId` to the URL query string
    if (getNetworkTransactionId() != null) {
      joiner.add(String.format("%snetworkTransactionId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNetworkTransactionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interchange` to the URL query string
    if (getInterchange() != null) {
      joiner.add(String.format("%sinterchange%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInterchange()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `internationalServiceFee` to the URL query string
    if (getInternationalServiceFee() != null) {
      joiner.add(String.format("%sinternationalServiceFee%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInternationalServiceFee()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardNetwork` to the URL query string
    if (getCardNetwork() != null) {
      joiner.add(String.format("%scardNetwork%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardNetwork()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

