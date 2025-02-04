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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateAchPaymentPlaidAttributes
 */
@JsonPropertyOrder({
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_AMOUNT,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_ADDENDA,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_DIRECTION,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_TAGS,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_PLAID_PROCESSOR_TOKEN,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_COUNTERPARTY_NAME,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_SAME_DAY,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE,
  CreateAchPaymentPlaidAttributes.JSON_PROPERTY_SEC_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateAchPaymentPlaidAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    DEBIT("Debit"),
    
    CREDIT("Credit");

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

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_PLAID_PROCESSOR_TOKEN = "plaidProcessorToken";
  private String plaidProcessorToken;

  public static final String JSON_PROPERTY_COUNTERPARTY_NAME = "counterpartyName";
  private String counterpartyName;

  public static final String JSON_PROPERTY_SAME_DAY = "sameDay";
  private Boolean sameDay;

  public static final String JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE = "verifyCounterpartyBalance";
  private Boolean verifyCounterpartyBalance = false;

  /**
   * Gets or Sets secCode
   */
  public enum SecCodeEnum {
    WEB("WEB"),
    
    CCD("CCD"),
    
    PPD("PPD");

    private String value;

    SecCodeEnum(String value) {
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
    public static SecCodeEnum fromValue(String value) {
      for (SecCodeEnum b : SecCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private SecCodeEnum secCode;

  public CreateAchPaymentPlaidAttributes() { 
  }

  public CreateAchPaymentPlaidAttributes amount(Long amount) {
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


  public CreateAchPaymentPlaidAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateAchPaymentPlaidAttributes addenda(String addenda) {
    this.addenda = addenda;
    return this;
  }

  /**
   * Get addenda
   * @return addenda
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDENDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddenda() {
    return addenda;
  }


  @JsonProperty(JSON_PROPERTY_ADDENDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddenda(String addenda) {
    this.addenda = addenda;
  }


  public CreateAchPaymentPlaidAttributes direction(DirectionEnum direction) {
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


  public CreateAchPaymentPlaidAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

  /**
   * Get idempotencyKey
   * @return idempotencyKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateAchPaymentPlaidAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateAchPaymentPlaidAttributes putTagsItem(String key, String tagsItem) {
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


  public CreateAchPaymentPlaidAttributes plaidProcessorToken(String plaidProcessorToken) {
    this.plaidProcessorToken = plaidProcessorToken;
    return this;
  }

  /**
   * Get plaidProcessorToken
   * @return plaidProcessorToken
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAID_PROCESSOR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPlaidProcessorToken() {
    return plaidProcessorToken;
  }


  @JsonProperty(JSON_PROPERTY_PLAID_PROCESSOR_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlaidProcessorToken(String plaidProcessorToken) {
    this.plaidProcessorToken = plaidProcessorToken;
  }


  public CreateAchPaymentPlaidAttributes counterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
    return this;
  }

  /**
   * Get counterpartyName
   * @return counterpartyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCounterpartyName() {
    return counterpartyName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
  }


  public CreateAchPaymentPlaidAttributes sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

  /**
   * Get sameDay
   * @return sameDay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSameDay() {
    return sameDay;
  }


  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }


  public CreateAchPaymentPlaidAttributes verifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
    return this;
  }

  /**
   * Get verifyCounterpartyBalance
   * @return verifyCounterpartyBalance
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVerifyCounterpartyBalance() {
    return verifyCounterpartyBalance;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
  }


  public CreateAchPaymentPlaidAttributes secCode(SecCodeEnum secCode) {
    this.secCode = secCode;
    return this;
  }

  /**
   * Get secCode
   * @return secCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecCodeEnum getSecCode() {
    return secCode;
  }


  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecCode(SecCodeEnum secCode) {
    this.secCode = secCode;
  }


  /**
   * Return true if this CreateAchPaymentPlaid_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchPaymentPlaidAttributes createAchPaymentPlaidAttributes = (CreateAchPaymentPlaidAttributes) o;
    return Objects.equals(this.amount, createAchPaymentPlaidAttributes.amount) &&
        Objects.equals(this.description, createAchPaymentPlaidAttributes.description) &&
        Objects.equals(this.addenda, createAchPaymentPlaidAttributes.addenda) &&
        Objects.equals(this.direction, createAchPaymentPlaidAttributes.direction) &&
        Objects.equals(this.idempotencyKey, createAchPaymentPlaidAttributes.idempotencyKey) &&
        Objects.equals(this.tags, createAchPaymentPlaidAttributes.tags) &&
        Objects.equals(this.plaidProcessorToken, createAchPaymentPlaidAttributes.plaidProcessorToken) &&
        Objects.equals(this.counterpartyName, createAchPaymentPlaidAttributes.counterpartyName) &&
        Objects.equals(this.sameDay, createAchPaymentPlaidAttributes.sameDay) &&
        Objects.equals(this.verifyCounterpartyBalance, createAchPaymentPlaidAttributes.verifyCounterpartyBalance) &&
        Objects.equals(this.secCode, createAchPaymentPlaidAttributes.secCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, addenda, direction, idempotencyKey, tags, plaidProcessorToken, counterpartyName, sameDay, verifyCounterpartyBalance, secCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchPaymentPlaidAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    plaidProcessorToken: ").append(toIndentedString(plaidProcessorToken)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
    sb.append("    verifyCounterpartyBalance: ").append(toIndentedString(verifyCounterpartyBalance)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `plaidProcessorToken` to the URL query string
    if (getPlaidProcessorToken() != null) {
      joiner.add(String.format("%splaidProcessorToken%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPlaidProcessorToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterpartyName` to the URL query string
    if (getCounterpartyName() != null) {
      joiner.add(String.format("%scounterpartyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCounterpartyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sameDay` to the URL query string
    if (getSameDay() != null) {
      joiner.add(String.format("%ssameDay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSameDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `verifyCounterpartyBalance` to the URL query string
    if (getVerifyCounterpartyBalance() != null) {
      joiner.add(String.format("%sverifyCounterpartyBalance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVerifyCounterpartyBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

