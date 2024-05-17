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
import unit.java.sdk.model.Astra;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreatePushToCardPaymentAttributesConfiguration
 */
@JsonPropertyOrder({
  CreatePushToCardPaymentAttributesConfiguration.JSON_PROPERTY_ASTRA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePushToCardPaymentAttributesConfiguration {
  public static final String JSON_PROPERTY_ASTRA = "astra";
  private Astra astra;

  public CreatePushToCardPaymentAttributesConfiguration() { 
  }

  public CreatePushToCardPaymentAttributesConfiguration astra(Astra astra) {
    this.astra = astra;
    return this;
  }

   /**
   * Get astra
   * @return astra
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASTRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Astra getAstra() {
    return astra;
  }


  @JsonProperty(JSON_PROPERTY_ASTRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAstra(Astra astra) {
    this.astra = astra;
  }


  /**
   * Return true if this CreatePushToCardPayment_attributes_configuration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePushToCardPaymentAttributesConfiguration createPushToCardPaymentAttributesConfiguration = (CreatePushToCardPaymentAttributesConfiguration) o;
    return Objects.equals(this.astra, createPushToCardPaymentAttributesConfiguration.astra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(astra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePushToCardPaymentAttributesConfiguration {\n");
    sb.append("    astra: ").append(toIndentedString(astra)).append("\n");
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

    // add `astra` to the URL query string
    if (getAstra() != null) {
      joiner.add(getAstra().toUrlQueryString(prefix + "astra" + suffix));
    }

    return joiner.toString();
  }
}

