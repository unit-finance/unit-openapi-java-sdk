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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BIN
 */
@JsonPropertyOrder({
  BIN.JSON_PROPERTY_BIN,
  BIN.JSON_PROPERTY_INSTITUTION_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BIN {
  public static final String JSON_PROPERTY_BIN = "bin";
  private String bin;

  public static final String JSON_PROPERTY_INSTITUTION_ID = "institutionId";
  private String institutionId;

  public BIN() { 
  }

  public BIN bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBin(String bin) {
    this.bin = bin;
  }


  public BIN institutionId(String institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Get institutionId
   * @return institutionId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstitutionId() {
    return institutionId;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  /**
   * Return true if this BIN object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BIN BIN = (BIN) o;
    return Objects.equals(this.bin, BIN.bin) &&
        Objects.equals(this.institutionId, BIN.institutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bin, institutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BIN {\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
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

    // add `bin` to the URL query string
    if (getBin() != null) {
      joiner.add(String.format("%sbin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `institutionId` to the URL query string
    if (getInstitutionId() != null) {
      joiner.add(String.format("%sinstitutionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstitutionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

