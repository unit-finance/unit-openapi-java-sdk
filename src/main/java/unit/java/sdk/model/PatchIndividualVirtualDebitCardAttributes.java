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
import unit.java.sdk.model.CardLevelLimits;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PatchIndividualVirtualDebitCardAttributes
 */
@JsonPropertyOrder({
  PatchIndividualVirtualDebitCardAttributes.JSON_PROPERTY_TAGS,
  PatchIndividualVirtualDebitCardAttributes.JSON_PROPERTY_LIMITS,
  PatchIndividualVirtualDebitCardAttributes.JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchIndividualVirtualDebitCardAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private CardLevelLimits limits;

  public static final String JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT_ID = "defaultFundingAccountId";
  private String defaultFundingAccountId;

  public PatchIndividualVirtualDebitCardAttributes() { 
  }

  public PatchIndividualVirtualDebitCardAttributes tags(Object tags) {
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


  public PatchIndividualVirtualDebitCardAttributes limits(CardLevelLimits limits) {
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


  public PatchIndividualVirtualDebitCardAttributes defaultFundingAccountId(String defaultFundingAccountId) {
    this.defaultFundingAccountId = defaultFundingAccountId;
    return this;
  }

   /**
   * Get defaultFundingAccountId
   * @return defaultFundingAccountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultFundingAccountId() {
    return defaultFundingAccountId;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultFundingAccountId(String defaultFundingAccountId) {
    this.defaultFundingAccountId = defaultFundingAccountId;
  }


  /**
   * Return true if this patchIndividualVirtualDebitCard_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchIndividualVirtualDebitCardAttributes patchIndividualVirtualDebitCardAttributes = (PatchIndividualVirtualDebitCardAttributes) o;
    return Objects.equals(this.tags, patchIndividualVirtualDebitCardAttributes.tags) &&
        Objects.equals(this.limits, patchIndividualVirtualDebitCardAttributes.limits) &&
        Objects.equals(this.defaultFundingAccountId, patchIndividualVirtualDebitCardAttributes.defaultFundingAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, limits, defaultFundingAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchIndividualVirtualDebitCardAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    defaultFundingAccountId: ").append(toIndentedString(defaultFundingAccountId)).append("\n");
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

    // add `defaultFundingAccountId` to the URL query string
    if (getDefaultFundingAccountId() != null) {
      joiner.add(String.format("%sdefaultFundingAccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultFundingAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

