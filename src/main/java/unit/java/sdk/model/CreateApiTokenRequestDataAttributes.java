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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.CreateApiTokenRequestDataAttributesResourcesInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateApiTokenRequestDataAttributes
 */
@JsonPropertyOrder({
  CreateApiTokenRequestDataAttributes.JSON_PROPERTY_SCOPE,
  CreateApiTokenRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateApiTokenRequestDataAttributes.JSON_PROPERTY_EXPIRATION,
  CreateApiTokenRequestDataAttributes.JSON_PROPERTY_SOURCE_IP,
  CreateApiTokenRequestDataAttributes.JSON_PROPERTY_RESOURCES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateApiTokenRequestDataAttributes {
  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private OffsetDateTime expiration;

  public static final String JSON_PROPERTY_SOURCE_IP = "sourceIp";
  private String sourceIp;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private JsonNullable<List<CreateApiTokenRequestDataAttributesResourcesInner>> resources = JsonNullable.<List<CreateApiTokenRequestDataAttributesResourcesInner>>undefined();

  public CreateApiTokenRequestDataAttributes() { 
  }

  public CreateApiTokenRequestDataAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }


  public CreateApiTokenRequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateApiTokenRequestDataAttributes expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }


  public CreateApiTokenRequestDataAttributes sourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }

  /**
   * Get sourceIp
   * @return sourceIp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSourceIp() {
    return sourceIp;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }


  public CreateApiTokenRequestDataAttributes resources(List<CreateApiTokenRequestDataAttributesResourcesInner> resources) {
    this.resources = JsonNullable.<List<CreateApiTokenRequestDataAttributesResourcesInner>>of(resources);
    return this;
  }

  public CreateApiTokenRequestDataAttributes addResourcesItem(CreateApiTokenRequestDataAttributesResourcesInner resourcesItem) {
    if (this.resources == null || !this.resources.isPresent()) {
      this.resources = JsonNullable.<List<CreateApiTokenRequestDataAttributesResourcesInner>>of(new ArrayList<>());
    }
    try {
      this.resources.get().add(resourcesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get resources
   * @return resources
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<CreateApiTokenRequestDataAttributesResourcesInner> getResources() {
        return resources.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<CreateApiTokenRequestDataAttributesResourcesInner>> getResources_JsonNullable() {
    return resources;
  }
  
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  public void setResources_JsonNullable(JsonNullable<List<CreateApiTokenRequestDataAttributesResourcesInner>> resources) {
    this.resources = resources;
  }

  public void setResources(List<CreateApiTokenRequestDataAttributesResourcesInner> resources) {
    this.resources = JsonNullable.<List<CreateApiTokenRequestDataAttributesResourcesInner>>of(resources);
  }


  /**
   * Return true if this CreateApiTokenRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiTokenRequestDataAttributes createApiTokenRequestDataAttributes = (CreateApiTokenRequestDataAttributes) o;
    return Objects.equals(this.scope, createApiTokenRequestDataAttributes.scope) &&
        Objects.equals(this.description, createApiTokenRequestDataAttributes.description) &&
        Objects.equals(this.expiration, createApiTokenRequestDataAttributes.expiration) &&
        Objects.equals(this.sourceIp, createApiTokenRequestDataAttributes.sourceIp) &&
        equalsNullable(this.resources, createApiTokenRequestDataAttributes.resources);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, description, expiration, sourceIp, hashCodeNullable(resources));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApiTokenRequestDataAttributes {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

    // add `scope` to the URL query string
    if (getScope() != null) {
      joiner.add(String.format("%sscope%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getScope()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiration` to the URL query string
    if (getExpiration() != null) {
      joiner.add(String.format("%sexpiration%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpiration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sourceIp` to the URL query string
    if (getSourceIp() != null) {
      joiner.add(String.format("%ssourceIp%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSourceIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `resources` to the URL query string
    if (getResources() != null) {
      for (int i = 0; i < getResources().size(); i++) {
        if (getResources().get(i) != null) {
          joiner.add(getResources().get(i).toUrlQueryString(String.format("%sresources%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

