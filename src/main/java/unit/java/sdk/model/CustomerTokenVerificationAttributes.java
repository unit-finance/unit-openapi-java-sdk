/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.1
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


import unit.java.sdk.ApiClient;
/**
 * CustomerTokenVerificationAttributes
 */
@JsonPropertyOrder({
  CustomerTokenVerificationAttributes.JSON_PROPERTY_VERIFICATION_TOKEN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CustomerTokenVerificationAttributes {
  public static final String JSON_PROPERTY_VERIFICATION_TOKEN = "verificationToken";
  private String verificationToken;

  public CustomerTokenVerificationAttributes() { 
  }

  public CustomerTokenVerificationAttributes verificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

  /**
   * Get verificationToken
   * @return verificationToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFICATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVerificationToken() {
    return verificationToken;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }


  /**
   * Return true if this CustomerTokenVerification_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTokenVerificationAttributes customerTokenVerificationAttributes = (CustomerTokenVerificationAttributes) o;
    return Objects.equals(this.verificationToken, customerTokenVerificationAttributes.verificationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTokenVerificationAttributes {\n");
    sb.append("    verificationToken: ").append(toIndentedString(verificationToken)).append("\n");
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

    // add `verificationToken` to the URL query string
    if (getVerificationToken() != null) {
      joiner.add(String.format("%sverificationToken%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVerificationToken()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

