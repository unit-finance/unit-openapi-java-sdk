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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateCheckDepositRequestDataAttributes
 */
@JsonPropertyOrder({
  CreateCheckDepositRequestDataAttributes.JSON_PROPERTY_AMOUNT,
  CreateCheckDepositRequestDataAttributes.JSON_PROPERTY_CLEARING_DAYS_OVERRIDE,
  CreateCheckDepositRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateCheckDepositRequestDataAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateCheckDepositRequestDataAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateCheckDepositRequestDataAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CLEARING_DAYS_OVERRIDE = "clearingDaysOverride";
  private Integer clearingDaysOverride;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public CreateCheckDepositRequestDataAttributes() { 
  }

  public CreateCheckDepositRequestDataAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * minimum: 1
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


  public CreateCheckDepositRequestDataAttributes clearingDaysOverride(Integer clearingDaysOverride) {
    this.clearingDaysOverride = clearingDaysOverride;
    return this;
  }

  /**
   * Get clearingDaysOverride
   * minimum: 1
   * @return clearingDaysOverride
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLEARING_DAYS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getClearingDaysOverride() {
    return clearingDaysOverride;
  }


  @JsonProperty(JSON_PROPERTY_CLEARING_DAYS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearingDaysOverride(Integer clearingDaysOverride) {
    this.clearingDaysOverride = clearingDaysOverride;
  }


  public CreateCheckDepositRequestDataAttributes description(String description) {
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


  public CreateCheckDepositRequestDataAttributes idempotencyKey(String idempotencyKey) {
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


  public CreateCheckDepositRequestDataAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateCheckDepositRequestDataAttributes putTagsItem(String key, String tagsItem) {
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


  /**
   * Return true if this CreateCheckDepositRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCheckDepositRequestDataAttributes createCheckDepositRequestDataAttributes = (CreateCheckDepositRequestDataAttributes) o;
    return Objects.equals(this.amount, createCheckDepositRequestDataAttributes.amount) &&
        Objects.equals(this.clearingDaysOverride, createCheckDepositRequestDataAttributes.clearingDaysOverride) &&
        Objects.equals(this.description, createCheckDepositRequestDataAttributes.description) &&
        Objects.equals(this.idempotencyKey, createCheckDepositRequestDataAttributes.idempotencyKey) &&
        Objects.equals(this.tags, createCheckDepositRequestDataAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, clearingDaysOverride, description, idempotencyKey, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCheckDepositRequestDataAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    clearingDaysOverride: ").append(toIndentedString(clearingDaysOverride)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `clearingDaysOverride` to the URL query string
    if (getClearingDaysOverride() != null) {
      joiner.add(String.format("%sclearingDaysOverride%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getClearingDaysOverride()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

