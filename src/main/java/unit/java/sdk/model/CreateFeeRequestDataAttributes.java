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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateFeeRequestDataAttributes
 */
@JsonPropertyOrder({
  CreateFeeRequestDataAttributes.JSON_PROPERTY_AMOUNT,
  CreateFeeRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateFeeRequestDataAttributes.JSON_PROPERTY_TAGS,
  CreateFeeRequestDataAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFeeRequestDataAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public CreateFeeRequestDataAttributes() { 
  }

  public CreateFeeRequestDataAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 1
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


  public CreateFeeRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
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


  public CreateFeeRequestDataAttributes tags(Object tags) {
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


  public CreateFeeRequestDataAttributes idempotencyKey(String idempotencyKey) {
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


  /**
   * Return true if this CreateFeeRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeeRequestDataAttributes createFeeRequestDataAttributes = (CreateFeeRequestDataAttributes) o;
    return Objects.equals(this.amount, createFeeRequestDataAttributes.amount) &&
        Objects.equals(this.description, createFeeRequestDataAttributes.description) &&
        Objects.equals(this.tags, createFeeRequestDataAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createFeeRequestDataAttributes.idempotencyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, tags, idempotencyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeeRequestDataAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
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
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

