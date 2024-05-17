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
import java.util.Arrays;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.BIN;
import unit.java.sdk.model.CardLevelLimits;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateIndividualDebitCardAttributes
 */
@JsonPropertyOrder({
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_SHIPPING_ADDRESS,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_DESIGN,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_TAGS,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_LIMITS,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_BIN,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_CARD_QUALIFIER,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_CARD_DESIGN_ID,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME,
  CreateIndividualDebitCardAttributes.JSON_PROPERTY_EXPIRY_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIndividualDebitCardAttributes {
  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private Address shippingAddress;

  public static final String JSON_PROPERTY_DESIGN = "design";
  private String design;

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

  public static final String JSON_PROPERTY_CARD_DESIGN_ID = "cardDesignId";
  private String cardDesignId;

  public static final String JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT = "additionalEmbossedText";
  private String additionalEmbossedText;

  public static final String JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE = "activeForOnlineUse";
  private Boolean activeForOnlineUse;

  public static final String JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME = "printOnlyBusinessName";
  private Boolean printOnlyBusinessName;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public CreateIndividualDebitCardAttributes() { 
  }

  public CreateIndividualDebitCardAttributes shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public CreateIndividualDebitCardAttributes design(String design) {
    this.design = design;
    return this;
  }

   /**
   * Get design
   * @return design
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesign() {
    return design;
  }


  @JsonProperty(JSON_PROPERTY_DESIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesign(String design) {
    this.design = design;
  }


  public CreateIndividualDebitCardAttributes tags(Object tags) {
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


  public CreateIndividualDebitCardAttributes limits(CardLevelLimits limits) {
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


  public CreateIndividualDebitCardAttributes idempotencyKey(String idempotencyKey) {
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


  public CreateIndividualDebitCardAttributes bin(BIN bin) {
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


  public CreateIndividualDebitCardAttributes cardQualifier(String cardQualifier) {
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


  public CreateIndividualDebitCardAttributes cardDesignId(String cardDesignId) {
    this.cardDesignId = cardDesignId;
    return this;
  }

   /**
   * Get cardDesignId
   * @return cardDesignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_DESIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardDesignId() {
    return cardDesignId;
  }


  @JsonProperty(JSON_PROPERTY_CARD_DESIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardDesignId(String cardDesignId) {
    this.cardDesignId = cardDesignId;
  }


  public CreateIndividualDebitCardAttributes additionalEmbossedText(String additionalEmbossedText) {
    this.additionalEmbossedText = additionalEmbossedText;
    return this;
  }

   /**
   * Get additionalEmbossedText
   * @return additionalEmbossedText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalEmbossedText() {
    return additionalEmbossedText;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalEmbossedText(String additionalEmbossedText) {
    this.additionalEmbossedText = additionalEmbossedText;
  }


  public CreateIndividualDebitCardAttributes activeForOnlineUse(Boolean activeForOnlineUse) {
    this.activeForOnlineUse = activeForOnlineUse;
    return this;
  }

   /**
   * Get activeForOnlineUse
   * @return activeForOnlineUse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveForOnlineUse() {
    return activeForOnlineUse;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveForOnlineUse(Boolean activeForOnlineUse) {
    this.activeForOnlineUse = activeForOnlineUse;
  }


  public CreateIndividualDebitCardAttributes printOnlyBusinessName(Boolean printOnlyBusinessName) {
    this.printOnlyBusinessName = printOnlyBusinessName;
    return this;
  }

   /**
   * Get printOnlyBusinessName
   * @return printOnlyBusinessName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrintOnlyBusinessName() {
    return printOnlyBusinessName;
  }


  @JsonProperty(JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrintOnlyBusinessName(Boolean printOnlyBusinessName) {
    this.printOnlyBusinessName = printOnlyBusinessName;
  }


  public CreateIndividualDebitCardAttributes expiryDate(String expiryDate) {
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
   * Return true if this CreateIndividualDebitCard_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndividualDebitCardAttributes createIndividualDebitCardAttributes = (CreateIndividualDebitCardAttributes) o;
    return Objects.equals(this.shippingAddress, createIndividualDebitCardAttributes.shippingAddress) &&
        Objects.equals(this.design, createIndividualDebitCardAttributes.design) &&
        Objects.equals(this.tags, createIndividualDebitCardAttributes.tags) &&
        Objects.equals(this.limits, createIndividualDebitCardAttributes.limits) &&
        Objects.equals(this.idempotencyKey, createIndividualDebitCardAttributes.idempotencyKey) &&
        Objects.equals(this.bin, createIndividualDebitCardAttributes.bin) &&
        Objects.equals(this.cardQualifier, createIndividualDebitCardAttributes.cardQualifier) &&
        Objects.equals(this.cardDesignId, createIndividualDebitCardAttributes.cardDesignId) &&
        Objects.equals(this.additionalEmbossedText, createIndividualDebitCardAttributes.additionalEmbossedText) &&
        Objects.equals(this.activeForOnlineUse, createIndividualDebitCardAttributes.activeForOnlineUse) &&
        Objects.equals(this.printOnlyBusinessName, createIndividualDebitCardAttributes.printOnlyBusinessName) &&
        Objects.equals(this.expiryDate, createIndividualDebitCardAttributes.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddress, design, tags, limits, idempotencyKey, bin, cardQualifier, cardDesignId, additionalEmbossedText, activeForOnlineUse, printOnlyBusinessName, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIndividualDebitCardAttributes {\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cardQualifier: ").append(toIndentedString(cardQualifier)).append("\n");
    sb.append("    cardDesignId: ").append(toIndentedString(cardDesignId)).append("\n");
    sb.append("    additionalEmbossedText: ").append(toIndentedString(additionalEmbossedText)).append("\n");
    sb.append("    activeForOnlineUse: ").append(toIndentedString(activeForOnlineUse)).append("\n");
    sb.append("    printOnlyBusinessName: ").append(toIndentedString(printOnlyBusinessName)).append("\n");
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

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
    }

    // add `design` to the URL query string
    if (getDesign() != null) {
      joiner.add(String.format("%sdesign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDesign()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

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

    // add `cardDesignId` to the URL query string
    if (getCardDesignId() != null) {
      joiner.add(String.format("%scardDesignId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardDesignId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `additionalEmbossedText` to the URL query string
    if (getAdditionalEmbossedText() != null) {
      joiner.add(String.format("%sadditionalEmbossedText%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdditionalEmbossedText()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `activeForOnlineUse` to the URL query string
    if (getActiveForOnlineUse() != null) {
      joiner.add(String.format("%sactiveForOnlineUse%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActiveForOnlineUse()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `printOnlyBusinessName` to the URL query string
    if (getPrintOnlyBusinessName() != null) {
      joiner.add(String.format("%sprintOnlyBusinessName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrintOnlyBusinessName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiryDate` to the URL query string
    if (getExpiryDate() != null) {
      joiner.add(String.format("%sexpiryDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiryDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

