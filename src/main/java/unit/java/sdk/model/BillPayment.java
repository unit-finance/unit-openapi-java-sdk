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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import unit.java.sdk.model.BillPaymentAllOfAttributes;
import unit.java.sdk.model.Payment;
import unit.java.sdk.model.PaymentRelationships;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.JSON;
/**
 * BillPayment
 */
@JsonPropertyOrder({
  BillPayment.JSON_PROPERTY_ATTRIBUTES,
  BillPayment.JSON_PROPERTY_RELATIONSHIPS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class BillPayment extends Payment {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private BillPaymentAllOfAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private PaymentRelationships relationships;

  public BillPayment() { 
  }

  public BillPayment attributes(BillPaymentAllOfAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BillPaymentAllOfAttributes getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttributes(BillPaymentAllOfAttributes attributes) {
    this.attributes = attributes;
  }


  public BillPayment relationships(PaymentRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentRelationships getRelationships() {
    return relationships;
  }


  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRelationships(PaymentRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public BillPayment type(String type) {
    this.setType(type);
    return this;
  }

  @Override
  public BillPayment id(String id) {
    this.setId(id);
    return this;
  }

  /**
   * Return true if this BillPayment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPayment billPayment = (BillPayment) o;
    return Objects.equals(this.attributes, billPayment.attributes) &&
        Objects.equals(this.relationships, billPayment.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillPayment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `attributes` to the URL query string
    if (getAttributes() != null) {
      joiner.add(getAttributes().toUrlQueryString(prefix + "attributes" + suffix));
    }

    // add `relationships` to the URL query string
    if (getRelationships() != null) {
      joiner.add(String.format("%srelationships%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRelationships()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("BillPayment", BillPayment.class);
  JSON.registerDiscriminator(BillPayment.class, "type", mappings);
}
}

