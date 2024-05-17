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
import unit.java.sdk.model.CardLevelLimits;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PatchBusinessVirtualDebitCardAttributes
 */
@JsonPropertyOrder({
  PatchBusinessVirtualDebitCardAttributes.JSON_PROPERTY_ADDRESS,
  PatchBusinessVirtualDebitCardAttributes.JSON_PROPERTY_PHONE,
  PatchBusinessVirtualDebitCardAttributes.JSON_PROPERTY_EMAIL,
  PatchBusinessVirtualDebitCardAttributes.JSON_PROPERTY_TAGS,
  PatchBusinessVirtualDebitCardAttributes.JSON_PROPERTY_LIMITS,
  PatchBusinessVirtualDebitCardAttributes.JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchBusinessVirtualDebitCardAttributes {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private CardLevelLimits limits;

  public static final String JSON_PROPERTY_DEFAULT_FUNDING_ACCOUNT_ID = "defaultFundingAccountId";
  private String defaultFundingAccountId;

  public PatchBusinessVirtualDebitCardAttributes() { 
  }

  public PatchBusinessVirtualDebitCardAttributes address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public PatchBusinessVirtualDebitCardAttributes phone(Phone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public PatchBusinessVirtualDebitCardAttributes email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public PatchBusinessVirtualDebitCardAttributes tags(Object tags) {
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


  public PatchBusinessVirtualDebitCardAttributes limits(CardLevelLimits limits) {
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


  public PatchBusinessVirtualDebitCardAttributes defaultFundingAccountId(String defaultFundingAccountId) {
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
   * Return true if this patchBusinessVirtualDebitCard_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchBusinessVirtualDebitCardAttributes patchBusinessVirtualDebitCardAttributes = (PatchBusinessVirtualDebitCardAttributes) o;
    return Objects.equals(this.address, patchBusinessVirtualDebitCardAttributes.address) &&
        Objects.equals(this.phone, patchBusinessVirtualDebitCardAttributes.phone) &&
        Objects.equals(this.email, patchBusinessVirtualDebitCardAttributes.email) &&
        Objects.equals(this.tags, patchBusinessVirtualDebitCardAttributes.tags) &&
        Objects.equals(this.limits, patchBusinessVirtualDebitCardAttributes.limits) &&
        Objects.equals(this.defaultFundingAccountId, patchBusinessVirtualDebitCardAttributes.defaultFundingAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, phone, email, tags, limits, defaultFundingAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBusinessVirtualDebitCardAttributes {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

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

