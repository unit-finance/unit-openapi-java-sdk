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
import unit.java.sdk.model.BIN;
import unit.java.sdk.model.CardLevelLimits;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateIndividualVirtualDebitCardAttributes
 */
@JsonPropertyOrder({
  CreateIndividualVirtualDebitCardAttributes.JSON_PROPERTY_TAGS,
  CreateIndividualVirtualDebitCardAttributes.JSON_PROPERTY_LIMITS,
  CreateIndividualVirtualDebitCardAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateIndividualVirtualDebitCardAttributes.JSON_PROPERTY_BIN,
  CreateIndividualVirtualDebitCardAttributes.JSON_PROPERTY_CARD_QUALIFIER,
  CreateIndividualVirtualDebitCardAttributes.JSON_PROPERTY_EXPIRY_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIndividualVirtualDebitCardAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private CardLevelLimits limits;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_BIN = "bin";
  private BIN bin;

  public static final String JSON_PROPERTY_CARD_QUALIFIER = "cardQualifier";
  private String cardQualifier;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public CreateIndividualVirtualDebitCardAttributes() { 
  }

  public CreateIndividualVirtualDebitCardAttributes tags(Object tags) {
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


  public CreateIndividualVirtualDebitCardAttributes limits(CardLevelLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
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


  public CreateIndividualVirtualDebitCardAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
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


  public CreateIndividualVirtualDebitCardAttributes bin(BIN bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BIN getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(BIN bin) {
    this.bin = bin;
  }


  public CreateIndividualVirtualDebitCardAttributes cardQualifier(String cardQualifier) {
    this.cardQualifier = cardQualifier;
    return this;
  }

   /**
   * Get cardQualifier
   * @return cardQualifier
  **/
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


  public CreateIndividualVirtualDebitCardAttributes expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
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
   * Return true if this CreateIndividualVirtualDebitCard_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndividualVirtualDebitCardAttributes createIndividualVirtualDebitCardAttributes = (CreateIndividualVirtualDebitCardAttributes) o;
    return Objects.equals(this.tags, createIndividualVirtualDebitCardAttributes.tags) &&
        Objects.equals(this.limits, createIndividualVirtualDebitCardAttributes.limits) &&
        Objects.equals(this.idempotencyKey, createIndividualVirtualDebitCardAttributes.idempotencyKey) &&
        Objects.equals(this.bin, createIndividualVirtualDebitCardAttributes.bin) &&
        Objects.equals(this.cardQualifier, createIndividualVirtualDebitCardAttributes.cardQualifier) &&
        Objects.equals(this.expiryDate, createIndividualVirtualDebitCardAttributes.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, limits, idempotencyKey, bin, cardQualifier, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIndividualVirtualDebitCardAttributes {\n");
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
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `limits` to the URL query string
    if (getLimits() != null) {
      joiner.add(getLimits().toUrlQueryString(prefix + "limits" + suffix));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bin` to the URL query string
    if (getBin() != null) {
      joiner.add(getBin().toUrlQueryString(prefix + "bin" + suffix));
    }

    // add `cardQualifier` to the URL query string
    if (getCardQualifier() != null) {
      joiner.add(String.format("%scardQualifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardQualifier()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiryDate` to the URL query string
    if (getExpiryDate() != null) {
      joiner.add(String.format("%sexpiryDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiryDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

