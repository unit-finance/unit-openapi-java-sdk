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
 * InstitutionAttributes
 */
@JsonPropertyOrder({
  InstitutionAttributes.JSON_PROPERTY_ROUTING_NUMBER,
  InstitutionAttributes.JSON_PROPERTY_NAME,
  InstitutionAttributes.JSON_PROPERTY_ADDRESS,
  InstitutionAttributes.JSON_PROPERTY_IS_WIRE_SUPPORTED,
  InstitutionAttributes.JSON_PROPERTY_IS_A_C_H_SUPPORTED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstitutionAttributes {
  public static final String JSON_PROPERTY_ROUTING_NUMBER = "routingNumber";
  private String routingNumber;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_IS_WIRE_SUPPORTED = "isWireSupported";
  private Boolean isWireSupported;

  public static final String JSON_PROPERTY_IS_A_C_H_SUPPORTED = "isACHSupported";
  private Boolean isACHSupported;

  public InstitutionAttributes() { 
  }

  public InstitutionAttributes routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoutingNumber() {
    return routingNumber;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public InstitutionAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public InstitutionAttributes address(String address) {
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

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public InstitutionAttributes isWireSupported(Boolean isWireSupported) {
    this.isWireSupported = isWireSupported;
    return this;
  }

   /**
   * Get isWireSupported
   * @return isWireSupported
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_WIRE_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsWireSupported() {
    return isWireSupported;
  }


  @JsonProperty(JSON_PROPERTY_IS_WIRE_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsWireSupported(Boolean isWireSupported) {
    this.isWireSupported = isWireSupported;
  }


  public InstitutionAttributes isACHSupported(Boolean isACHSupported) {
    this.isACHSupported = isACHSupported;
    return this;
  }

   /**
   * Get isACHSupported
   * @return isACHSupported
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_A_C_H_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsACHSupported() {
    return isACHSupported;
  }


  @JsonProperty(JSON_PROPERTY_IS_A_C_H_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsACHSupported(Boolean isACHSupported) {
    this.isACHSupported = isACHSupported;
  }


  /**
   * Return true if this institution_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionAttributes institutionAttributes = (InstitutionAttributes) o;
    return Objects.equals(this.routingNumber, institutionAttributes.routingNumber) &&
        Objects.equals(this.name, institutionAttributes.name) &&
        Objects.equals(this.address, institutionAttributes.address) &&
        Objects.equals(this.isWireSupported, institutionAttributes.isWireSupported) &&
        Objects.equals(this.isACHSupported, institutionAttributes.isACHSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, name, address, isWireSupported, isACHSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionAttributes {\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isWireSupported: ").append(toIndentedString(isWireSupported)).append("\n");
    sb.append("    isACHSupported: ").append(toIndentedString(isACHSupported)).append("\n");
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

    // add `routingNumber` to the URL query string
    if (getRoutingNumber() != null) {
      joiner.add(String.format("%sroutingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isWireSupported` to the URL query string
    if (getIsWireSupported() != null) {
      joiner.add(String.format("%sisWireSupported%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsWireSupported()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isACHSupported` to the URL query string
    if (getIsACHSupported() != null) {
      joiner.add(String.format("%sisACHSupported%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsACHSupported()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

