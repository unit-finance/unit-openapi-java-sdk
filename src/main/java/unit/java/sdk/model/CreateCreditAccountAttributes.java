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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateCreditAccountAttributes
 */
@JsonPropertyOrder({
  CreateCreditAccountAttributes.JSON_PROPERTY_CREDIT_TERMS,
  CreateCreditAccountAttributes.JSON_PROPERTY_CREDIT_LIMIT,
  CreateCreditAccountAttributes.JSON_PROPERTY_TAGS,
  CreateCreditAccountAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CreateCreditAccountAttributes {
  public static final String JSON_PROPERTY_CREDIT_TERMS = "creditTerms";
  private String creditTerms;

  public static final String JSON_PROPERTY_CREDIT_LIMIT = "creditLimit";
  private Integer creditLimit;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Object> tags = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public CreateCreditAccountAttributes() { 
  }

  public CreateCreditAccountAttributes creditTerms(String creditTerms) {
    this.creditTerms = creditTerms;
    return this;
  }

   /**
   * Get creditTerms
   * @return creditTerms
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreditTerms() {
    return creditTerms;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditTerms(String creditTerms) {
    this.creditTerms = creditTerms;
  }


  public CreateCreditAccountAttributes creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreditLimit() {
    return creditLimit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }


  public CreateCreditAccountAttributes tags(Object tags) {
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


  public CreateCreditAccountAttributes idempotencyKey(String idempotencyKey) {
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
   * Return true if this CreateCreditAccount_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCreditAccountAttributes createCreditAccountAttributes = (CreateCreditAccountAttributes) o;
    return Objects.equals(this.creditTerms, createCreditAccountAttributes.creditTerms) &&
        Objects.equals(this.creditLimit, createCreditAccountAttributes.creditLimit) &&
        equalsNullable(this.tags, createCreditAccountAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createCreditAccountAttributes.idempotencyKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditTerms, creditLimit, hashCodeNullable(tags), idempotencyKey);
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
    sb.append("class CreateCreditAccountAttributes {\n");
    sb.append("    creditTerms: ").append(toIndentedString(creditTerms)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
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

    // add `creditTerms` to the URL query string
    if (getCreditTerms() != null) {
      joiner.add(String.format("%screditTerms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreditTerms()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `creditLimit` to the URL query string
    if (getCreditLimit() != null) {
      joiner.add(String.format("%screditLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreditLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

