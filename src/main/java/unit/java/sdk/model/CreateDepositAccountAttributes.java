/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.6
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateDepositAccountAttributes
 */
@JsonPropertyOrder({
  CreateDepositAccountAttributes.JSON_PROPERTY_DEPOSIT_PRODUCT,
  CreateDepositAccountAttributes.JSON_PROPERTY_TAGS,
  CreateDepositAccountAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDepositAccountAttributes {
  public static final String JSON_PROPERTY_DEPOSIT_PRODUCT = "depositProduct";
  private String depositProduct;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Object> tags = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private JsonNullable<String> idempotencyKey = JsonNullable.<String>undefined();

  public CreateDepositAccountAttributes() { 
  }

  public CreateDepositAccountAttributes depositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
    return this;
  }

   /**
   * Get depositProduct
   * @return depositProduct
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPOSIT_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDepositProduct() {
    return depositProduct;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSIT_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
  }


  public CreateDepositAccountAttributes tags(Object tags) {
    this.tags = JsonNullable.<Object>of(tags);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<Object> tags) {
    this.tags = tags;
  }

  public void setTags(Object tags) {
    this.tags = JsonNullable.<Object>of(tags);
  }


  public CreateDepositAccountAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = JsonNullable.<String>of(idempotencyKey);
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getIdempotencyKey() {
        return idempotencyKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdempotencyKey_JsonNullable() {
    return idempotencyKey;
  }
  
  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  public void setIdempotencyKey_JsonNullable(JsonNullable<String> idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = JsonNullable.<String>of(idempotencyKey);
  }


  /**
   * Return true if this CreateDepositAccount_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDepositAccountAttributes createDepositAccountAttributes = (CreateDepositAccountAttributes) o;
    return Objects.equals(this.depositProduct, createDepositAccountAttributes.depositProduct) &&
        equalsNullable(this.tags, createDepositAccountAttributes.tags) &&
        equalsNullable(this.idempotencyKey, createDepositAccountAttributes.idempotencyKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositProduct, hashCodeNullable(tags), hashCodeNullable(idempotencyKey));
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
    sb.append("class CreateDepositAccountAttributes {\n");
    sb.append("    depositProduct: ").append(toIndentedString(depositProduct)).append("\n");
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

    // add `depositProduct` to the URL query string
    if (getDepositProduct() != null) {
      joiner.add(String.format("%sdepositProduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDepositProduct()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

