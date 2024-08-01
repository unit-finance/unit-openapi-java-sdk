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


/**
 * UpdateCreditAccountAttributes
 */
@JsonPropertyOrder({
  UpdateCreditAccountAttributes.JSON_PROPERTY_TAGS,
  UpdateCreditAccountAttributes.JSON_PROPERTY_CREDIT_LIMIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class UpdateCreditAccountAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_CREDIT_LIMIT = "creditLimit";
  private Integer creditLimit;

  public UpdateCreditAccountAttributes() { 
  }

  public UpdateCreditAccountAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateCreditAccountAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
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


  public UpdateCreditAccountAttributes creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreditLimit() {
    return creditLimit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }


  /**
   * Return true if this UpdateCreditAccount_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCreditAccountAttributes updateCreditAccountAttributes = (UpdateCreditAccountAttributes) o;
    return Objects.equals(this.tags, updateCreditAccountAttributes.tags) &&
        Objects.equals(this.creditLimit, updateCreditAccountAttributes.creditLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, creditLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCreditAccountAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
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
            getTags().get(_key), URLEncoder.encode(String.valueOf(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `creditLimit` to the URL query string
    if (getCreditLimit() != null) {
      joiner.add(String.format("%screditLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreditLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

