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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import unit.java.sdk.model.AchStopPaymentDisableReason;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AchStopPaymentAttributes
 */
@JsonPropertyOrder({
  AchStopPaymentAttributes.JSON_PROPERTY_CREATED_AT,
  AchStopPaymentAttributes.JSON_PROPERTY_UPDATED_AT,
  AchStopPaymentAttributes.JSON_PROPERTY_MIN_AMOUNT,
  AchStopPaymentAttributes.JSON_PROPERTY_ORIGINATOR_NAME,
  AchStopPaymentAttributes.JSON_PROPERTY_DIRECTION,
  AchStopPaymentAttributes.JSON_PROPERTY_EXPIRATION,
  AchStopPaymentAttributes.JSON_PROPERTY_IS_MULTI_USE,
  AchStopPaymentAttributes.JSON_PROPERTY_DESCRIPTION,
  AchStopPaymentAttributes.JSON_PROPERTY_DISABLE_REASON,
  AchStopPaymentAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  AchStopPaymentAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AchStopPaymentAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private LocalDate createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private LocalDate updatedAt;

  public static final String JSON_PROPERTY_MIN_AMOUNT = "minAmount";
  private Integer minAmount;

  public static final String JSON_PROPERTY_ORIGINATOR_NAME = "originatorName";
  private List<String> originatorName = new ArrayList<>();

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction = "debit";

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private LocalDate expiration;

  public static final String JSON_PROPERTY_IS_MULTI_USE = "isMultiUse";
  private Boolean isMultiUse;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLE_REASON = "disableReason";
  private AchStopPaymentDisableReason disableReason;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public AchStopPaymentAttributes() { 
  }

  public AchStopPaymentAttributes createdAt(LocalDate createdAt) {
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
  public LocalDate getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public AchStopPaymentAttributes updatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }


  public AchStopPaymentAttributes minAmount(Integer minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Get minAmount
   * @return minAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMinAmount() {
    return minAmount;
  }


  @JsonProperty(JSON_PROPERTY_MIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAmount(Integer minAmount) {
    this.minAmount = minAmount;
  }


  public AchStopPaymentAttributes originatorName(List<String> originatorName) {
    this.originatorName = originatorName;
    return this;
  }

  public AchStopPaymentAttributes addOriginatorNameItem(String originatorNameItem) {
    if (this.originatorName == null) {
      this.originatorName = new ArrayList<>();
    }
    this.originatorName.add(originatorNameItem);
    return this;
  }

  /**
   * Get originatorName
   * @return originatorName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOriginatorName() {
    return originatorName;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorName(List<String> originatorName) {
    this.originatorName = originatorName;
  }


  public AchStopPaymentAttributes direction(String direction) {
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
  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  public AchStopPaymentAttributes expiration(LocalDate expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiration(LocalDate expiration) {
    this.expiration = expiration;
  }


  public AchStopPaymentAttributes isMultiUse(Boolean isMultiUse) {
    this.isMultiUse = isMultiUse;
    return this;
  }

  /**
   * Get isMultiUse
   * @return isMultiUse
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_MULTI_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMultiUse() {
    return isMultiUse;
  }


  @JsonProperty(JSON_PROPERTY_IS_MULTI_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMultiUse(Boolean isMultiUse) {
    this.isMultiUse = isMultiUse;
  }


  public AchStopPaymentAttributes description(String description) {
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


  public AchStopPaymentAttributes disableReason(AchStopPaymentDisableReason disableReason) {
    this.disableReason = disableReason;
    return this;
  }

  /**
   * Get disableReason
   * @return disableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AchStopPaymentDisableReason getDisableReason() {
    return disableReason;
  }


  @JsonProperty(JSON_PROPERTY_DISABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisableReason(AchStopPaymentDisableReason disableReason) {
    this.disableReason = disableReason;
  }


  public AchStopPaymentAttributes idempotencyKey(String idempotencyKey) {
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


  public AchStopPaymentAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AchStopPaymentAttributes putTagsItem(String key, String tagsItem) {
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  /**
   * Return true if this AchStopPayment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchStopPaymentAttributes achStopPaymentAttributes = (AchStopPaymentAttributes) o;
    return Objects.equals(this.createdAt, achStopPaymentAttributes.createdAt) &&
        Objects.equals(this.updatedAt, achStopPaymentAttributes.updatedAt) &&
        Objects.equals(this.minAmount, achStopPaymentAttributes.minAmount) &&
        Objects.equals(this.originatorName, achStopPaymentAttributes.originatorName) &&
        Objects.equals(this.direction, achStopPaymentAttributes.direction) &&
        Objects.equals(this.expiration, achStopPaymentAttributes.expiration) &&
        Objects.equals(this.isMultiUse, achStopPaymentAttributes.isMultiUse) &&
        Objects.equals(this.description, achStopPaymentAttributes.description) &&
        Objects.equals(this.disableReason, achStopPaymentAttributes.disableReason) &&
        Objects.equals(this.idempotencyKey, achStopPaymentAttributes.idempotencyKey) &&
        Objects.equals(this.tags, achStopPaymentAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, minAmount, originatorName, direction, expiration, isMultiUse, description, disableReason, idempotencyKey, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchStopPaymentAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    originatorName: ").append(toIndentedString(originatorName)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    isMultiUse: ").append(toIndentedString(isMultiUse)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableReason: ").append(toIndentedString(disableReason)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `minAmount` to the URL query string
    if (getMinAmount() != null) {
      joiner.add(String.format("%sminAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMinAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `originatorName` to the URL query string
    if (getOriginatorName() != null) {
      for (int i = 0; i < getOriginatorName().size(); i++) {
        joiner.add(String.format("%soriginatorName%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getOriginatorName().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiration` to the URL query string
    if (getExpiration() != null) {
      joiner.add(String.format("%sexpiration%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpiration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isMultiUse` to the URL query string
    if (getIsMultiUse() != null) {
      joiner.add(String.format("%sisMultiUse%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIsMultiUse()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `disableReason` to the URL query string
    if (getDisableReason() != null) {
      joiner.add(String.format("%sdisableReason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDisableReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }
}

