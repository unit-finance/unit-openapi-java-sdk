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
import java.util.HashMap;
import java.util.Map;
import unit.java.sdk.model.Bin;
import unit.java.sdk.model.CardLevelLimits;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateIndividualVirtualDebitCardRequestAttributes
 */
@JsonPropertyOrder({
  CreateIndividualVirtualDebitCardRequestAttributes.JSON_PROPERTY_TAGS,
  CreateIndividualVirtualDebitCardRequestAttributes.JSON_PROPERTY_LIMITS,
  CreateIndividualVirtualDebitCardRequestAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateIndividualVirtualDebitCardRequestAttributes.JSON_PROPERTY_BIN,
  CreateIndividualVirtualDebitCardRequestAttributes.JSON_PROPERTY_CARD_QUALIFIER,
  CreateIndividualVirtualDebitCardRequestAttributes.JSON_PROPERTY_EXPIRY_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateIndividualVirtualDebitCardRequestAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private CardLevelLimits limits;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_BIN = "bin";
  private Bin bin;

  public static final String JSON_PROPERTY_CARD_QUALIFIER = "cardQualifier";
  private String cardQualifier;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public CreateIndividualVirtualDebitCardRequestAttributes() { 
  }

  public CreateIndividualVirtualDebitCardRequestAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateIndividualVirtualDebitCardRequestAttributes putTagsItem(String key, String tagsItem) {
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


  public CreateIndividualVirtualDebitCardRequestAttributes limits(CardLevelLimits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   * @return limits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CardLevelLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimits(CardLevelLimits limits) {
    this.limits = limits;
  }


  public CreateIndividualVirtualDebitCardRequestAttributes idempotencyKey(String idempotencyKey) {
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


  public CreateIndividualVirtualDebitCardRequestAttributes bin(Bin bin) {
    this.bin = bin;
    return this;
  }

  /**
   * Get bin
   * @return bin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Bin getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(Bin bin) {
    this.bin = bin;
  }


  public CreateIndividualVirtualDebitCardRequestAttributes cardQualifier(String cardQualifier) {
    this.cardQualifier = cardQualifier;
    return this;
  }

  /**
   * Get cardQualifier
   * @return cardQualifier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardQualifier() {
    return cardQualifier;
  }


  @JsonProperty(JSON_PROPERTY_CARD_QUALIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardQualifier(String cardQualifier) {
    this.cardQualifier = cardQualifier;
  }


  public CreateIndividualVirtualDebitCardRequestAttributes expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpiryDate() {
    return expiryDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  /**
   * Return true if this CreateIndividualVirtualDebitCardRequest_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndividualVirtualDebitCardRequestAttributes createIndividualVirtualDebitCardRequestAttributes = (CreateIndividualVirtualDebitCardRequestAttributes) o;
    return Objects.equals(this.tags, createIndividualVirtualDebitCardRequestAttributes.tags) &&
        Objects.equals(this.limits, createIndividualVirtualDebitCardRequestAttributes.limits) &&
        Objects.equals(this.idempotencyKey, createIndividualVirtualDebitCardRequestAttributes.idempotencyKey) &&
        Objects.equals(this.bin, createIndividualVirtualDebitCardRequestAttributes.bin) &&
        Objects.equals(this.cardQualifier, createIndividualVirtualDebitCardRequestAttributes.cardQualifier) &&
        Objects.equals(this.expiryDate, createIndividualVirtualDebitCardRequestAttributes.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, limits, idempotencyKey, bin, cardQualifier, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIndividualVirtualDebitCardRequestAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cardQualifier: ").append(toIndentedString(cardQualifier)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `limits` to the URL query string
    if (getLimits() != null) {
      joiner.add(getLimits().toUrlQueryString(prefix + "limits" + suffix));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bin` to the URL query string
    if (getBin() != null) {
      joiner.add(getBin().toUrlQueryString(prefix + "bin" + suffix));
    }

    // add `cardQualifier` to the URL query string
    if (getCardQualifier() != null) {
      joiner.add(String.format("%scardQualifier%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardQualifier()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiryDate` to the URL query string
    if (getExpiryDate() != null) {
      joiner.add(String.format("%sexpiryDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpiryDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

