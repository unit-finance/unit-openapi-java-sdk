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
 * GenerateBarcodeRequestDataAttributes
 */
@JsonPropertyOrder({
  GenerateBarcodeRequestDataAttributes.JSON_PROPERTY_STORE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GenerateBarcodeRequestDataAttributes {
  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public GenerateBarcodeRequestDataAttributes() { 
  }

  public GenerateBarcodeRequestDataAttributes storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStoreId() {
    return storeId;
  }


  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  /**
   * Return true if this GenerateBarcodeRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateBarcodeRequestDataAttributes generateBarcodeRequestDataAttributes = (GenerateBarcodeRequestDataAttributes) o;
    return Objects.equals(this.storeId, generateBarcodeRequestDataAttributes.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateBarcodeRequestDataAttributes {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

    // add `storeId` to the URL query string
    if (getStoreId() != null) {
      joiner.add(String.format("%sstoreId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStoreId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

