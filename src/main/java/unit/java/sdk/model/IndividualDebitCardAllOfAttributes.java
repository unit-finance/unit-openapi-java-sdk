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
import java.time.OffsetDateTime;
import java.util.Arrays;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.PhysicalCardStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IndividualDebitCardAllOfAttributes
 */
@JsonPropertyOrder({
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_UPDATED_AT,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_LAST4_DIGITS,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_EXPIRATION_DATE,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_SHIPPING_ADDRESS,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_BIN,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_STATUS,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_DESIGN,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_TAGS,
  IndividualDebitCardAllOfAttributes.JSON_PROPERTY_FREEZE_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndividualDebitCardAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_LAST4_DIGITS = "last4Digits";
  private String last4Digits;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private Address shippingAddress;

  public static final String JSON_PROPERTY_BIN = "bin";
  private String bin;

  public static final String JSON_PROPERTY_STATUS = "status";
  private PhysicalCardStatus status;

  public static final String JSON_PROPERTY_DESIGN = "design";
  private String design;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_FREEZE_REASON = "freezeReason";
  private String freezeReason;

  public IndividualDebitCardAllOfAttributes() { 
  }

  public IndividualDebitCardAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public IndividualDebitCardAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public IndividualDebitCardAllOfAttributes last4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
    return this;
  }

   /**
   * Get last4Digits
   * @return last4Digits
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLast4Digits() {
    return last4Digits;
  }


  @JsonProperty(JSON_PROPERTY_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLast4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
  }


  public IndividualDebitCardAllOfAttributes expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public IndividualDebitCardAllOfAttributes shippingAddress(Address shippingAddress) {
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


  public IndividualDebitCardAllOfAttributes bin(String bin) {
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

  public String getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(String bin) {
    this.bin = bin;
  }


  public IndividualDebitCardAllOfAttributes status(PhysicalCardStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PhysicalCardStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(PhysicalCardStatus status) {
    this.status = status;
  }


  public IndividualDebitCardAllOfAttributes design(String design) {
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


  public IndividualDebitCardAllOfAttributes tags(Object tags) {
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


  public IndividualDebitCardAllOfAttributes freezeReason(String freezeReason) {
    this.freezeReason = freezeReason;
    return this;
  }

   /**
   * Get freezeReason
   * @return freezeReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREEZE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFreezeReason() {
    return freezeReason;
  }


  @JsonProperty(JSON_PROPERTY_FREEZE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreezeReason(String freezeReason) {
    this.freezeReason = freezeReason;
  }


  /**
   * Return true if this IndividualDebitCard_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualDebitCardAllOfAttributes individualDebitCardAllOfAttributes = (IndividualDebitCardAllOfAttributes) o;
    return Objects.equals(this.createdAt, individualDebitCardAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, individualDebitCardAllOfAttributes.updatedAt) &&
        Objects.equals(this.last4Digits, individualDebitCardAllOfAttributes.last4Digits) &&
        Objects.equals(this.expirationDate, individualDebitCardAllOfAttributes.expirationDate) &&
        Objects.equals(this.shippingAddress, individualDebitCardAllOfAttributes.shippingAddress) &&
        Objects.equals(this.bin, individualDebitCardAllOfAttributes.bin) &&
        Objects.equals(this.status, individualDebitCardAllOfAttributes.status) &&
        Objects.equals(this.design, individualDebitCardAllOfAttributes.design) &&
        Objects.equals(this.tags, individualDebitCardAllOfAttributes.tags) &&
        Objects.equals(this.freezeReason, individualDebitCardAllOfAttributes.freezeReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, last4Digits, expirationDate, shippingAddress, bin, status, design, tags, freezeReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualDebitCardAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    freezeReason: ").append(toIndentedString(freezeReason)).append("\n");
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

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `last4Digits` to the URL query string
    if (getLast4Digits() != null) {
      joiner.add(String.format("%slast4Digits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLast4Digits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(String.format("%sexpirationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpirationDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
    }

    // add `bin` to the URL query string
    if (getBin() != null) {
      joiner.add(String.format("%sbin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `design` to the URL query string
    if (getDesign() != null) {
      joiner.add(String.format("%sdesign%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDesign()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `freezeReason` to the URL query string
    if (getFreezeReason() != null) {
      joiner.add(String.format("%sfreezeReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFreezeReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
