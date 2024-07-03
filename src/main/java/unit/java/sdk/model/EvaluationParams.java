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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EvaluationParams
 */
@JsonPropertyOrder({
  EvaluationParams.JSON_PROPERTY_USE_SELFIE_VERIFICATION,
  EvaluationParams.JSON_PROPERTY_REQUIRE_ID_VERIFICATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EvaluationParams {
  /**
   * Gets or Sets useSelfieVerification
   */
  public enum UseSelfieVerificationEnum {
    NEVER("Never"),
    
    REPLACEIDENTIFICATION("ReplaceIdentification"),
    
    ALWAYS("Always");

    private String value;

    UseSelfieVerificationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UseSelfieVerificationEnum fromValue(String value) {
      for (UseSelfieVerificationEnum b : UseSelfieVerificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USE_SELFIE_VERIFICATION = "useSelfieVerification";
  private UseSelfieVerificationEnum useSelfieVerification;

  public static final String JSON_PROPERTY_REQUIRE_ID_VERIFICATION = "requireIdVerification";
  private Boolean requireIdVerification = false;

  public EvaluationParams() { 
  }

  public EvaluationParams useSelfieVerification(UseSelfieVerificationEnum useSelfieVerification) {
    this.useSelfieVerification = useSelfieVerification;
    return this;
  }

   /**
   * Get useSelfieVerification
   * @return useSelfieVerification
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_SELFIE_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UseSelfieVerificationEnum getUseSelfieVerification() {
    return useSelfieVerification;
  }


  @JsonProperty(JSON_PROPERTY_USE_SELFIE_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseSelfieVerification(UseSelfieVerificationEnum useSelfieVerification) {
    this.useSelfieVerification = useSelfieVerification;
  }


  public EvaluationParams requireIdVerification(Boolean requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
    return this;
  }

   /**
   * Get requireIdVerification
   * @return requireIdVerification
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRE_ID_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequireIdVerification() {
    return requireIdVerification;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_ID_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequireIdVerification(Boolean requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
  }


  /**
   * Return true if this evaluationParams object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationParams evaluationParams = (EvaluationParams) o;
    return Objects.equals(this.useSelfieVerification, evaluationParams.useSelfieVerification) &&
        Objects.equals(this.requireIdVerification, evaluationParams.requireIdVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useSelfieVerification, requireIdVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationParams {\n");
    sb.append("    useSelfieVerification: ").append(toIndentedString(useSelfieVerification)).append("\n");
    sb.append("    requireIdVerification: ").append(toIndentedString(requireIdVerification)).append("\n");
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

    // add `useSelfieVerification` to the URL query string
    if (getUseSelfieVerification() != null) {
      joiner.add(String.format("%suseSelfieVerification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUseSelfieVerification()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `requireIdVerification` to the URL query string
    if (getRequireIdVerification() != null) {
      joiner.add(String.format("%srequireIdVerification%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequireIdVerification()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

