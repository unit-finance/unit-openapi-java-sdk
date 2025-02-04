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
import unit.java.sdk.model.ReturnedTransactionRelationship;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * ReturnedRelationship
 */
@JsonPropertyOrder({
  ReturnedRelationship.JSON_PROPERTY_RETURNED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ReturnedRelationship {
  public static final String JSON_PROPERTY_RETURNED = "returned";
  private ReturnedTransactionRelationship returned;

  public ReturnedRelationship() { 
  }

  public ReturnedRelationship returned(ReturnedTransactionRelationship returned) {
    this.returned = returned;
    return this;
  }

  /**
   * Get returned
   * @return returned
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReturnedTransactionRelationship getReturned() {
    return returned;
  }


  @JsonProperty(JSON_PROPERTY_RETURNED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturned(ReturnedTransactionRelationship returned) {
    this.returned = returned;
  }


  /**
   * Return true if this ReturnedRelationship object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnedRelationship returnedRelationship = (ReturnedRelationship) o;
    return Objects.equals(this.returned, returnedRelationship.returned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnedRelationship {\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
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

    // add `returned` to the URL query string
    if (getReturned() != null) {
      joiner.add(getReturned().toUrlQueryString(prefix + "returned" + suffix));
    }

    return joiner.toString();
  }
}

