/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CreateApiTokenDataAttributesResourcesInner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateCustomerTokenDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCustomerTokenDataAttributes {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_VERIFICATION_TOKEN = "verificationToken";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_TOKEN)
  private String verificationToken;

  public static final String SERIALIZED_NAME_JWT_TOKEN = "jwtToken";
  @SerializedName(SERIALIZED_NAME_JWT_TOKEN)
  private String jwtToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_VERIFICATION_CODE = "verificationCode";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_CODE)
  private String verificationCode;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<CreateApiTokenDataAttributesResourcesInner> resources;

  public static final String SERIALIZED_NAME_UPGRADABLE_SCOPE = "upgradableScope";
  @SerializedName(SERIALIZED_NAME_UPGRADABLE_SCOPE)
  private String upgradableScope;

  public CreateCustomerTokenDataAttributes() {
  }

  public CreateCustomerTokenDataAttributes scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public CreateCustomerTokenDataAttributes verificationToken(String verificationToken) {
    
    this.verificationToken = verificationToken;
    return this;
  }

   /**
   * Get verificationToken
   * @return verificationToken
  **/
  @javax.annotation.Nullable
  public String getVerificationToken() {
    return verificationToken;
  }


  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }


  public CreateCustomerTokenDataAttributes jwtToken(String jwtToken) {
    
    this.jwtToken = jwtToken;
    return this;
  }

   /**
   * Get jwtToken
   * @return jwtToken
  **/
  @javax.annotation.Nullable
  public String getJwtToken() {
    return jwtToken;
  }


  public void setJwtToken(String jwtToken) {
    this.jwtToken = jwtToken;
  }


  public CreateCustomerTokenDataAttributes expiresIn(Integer expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  public CreateCustomerTokenDataAttributes verificationCode(String verificationCode) {
    
    this.verificationCode = verificationCode;
    return this;
  }

   /**
   * Get verificationCode
   * @return verificationCode
  **/
  @javax.annotation.Nullable
  public String getVerificationCode() {
    return verificationCode;
  }


  public void setVerificationCode(String verificationCode) {
    this.verificationCode = verificationCode;
  }


  public CreateCustomerTokenDataAttributes resources(List<CreateApiTokenDataAttributesResourcesInner> resources) {
    
    this.resources = resources;
    return this;
  }

  public CreateCustomerTokenDataAttributes addResourcesItem(CreateApiTokenDataAttributesResourcesInner resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  public List<CreateApiTokenDataAttributesResourcesInner> getResources() {
    return resources;
  }


  public void setResources(List<CreateApiTokenDataAttributesResourcesInner> resources) {
    this.resources = resources;
  }


  public CreateCustomerTokenDataAttributes upgradableScope(String upgradableScope) {
    
    this.upgradableScope = upgradableScope;
    return this;
  }

   /**
   * Get upgradableScope
   * @return upgradableScope
  **/
  @javax.annotation.Nullable
  public String getUpgradableScope() {
    return upgradableScope;
  }


  public void setUpgradableScope(String upgradableScope) {
    this.upgradableScope = upgradableScope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomerTokenDataAttributes createCustomerTokenDataAttributes = (CreateCustomerTokenDataAttributes) o;
    return Objects.equals(this.scope, createCustomerTokenDataAttributes.scope) &&
        Objects.equals(this.verificationToken, createCustomerTokenDataAttributes.verificationToken) &&
        Objects.equals(this.jwtToken, createCustomerTokenDataAttributes.jwtToken) &&
        Objects.equals(this.expiresIn, createCustomerTokenDataAttributes.expiresIn) &&
        Objects.equals(this.verificationCode, createCustomerTokenDataAttributes.verificationCode) &&
        Objects.equals(this.resources, createCustomerTokenDataAttributes.resources) &&
        Objects.equals(this.upgradableScope, createCustomerTokenDataAttributes.upgradableScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, verificationToken, jwtToken, expiresIn, verificationCode, resources, upgradableScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerTokenDataAttributes {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    verificationToken: ").append(toIndentedString(verificationToken)).append("\n");
    sb.append("    jwtToken: ").append(toIndentedString(jwtToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    upgradableScope: ").append(toIndentedString(upgradableScope)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("scope");
    openapiFields.add("verificationToken");
    openapiFields.add("jwtToken");
    openapiFields.add("expiresIn");
    openapiFields.add("verificationCode");
    openapiFields.add("resources");
    openapiFields.add("upgradableScope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateCustomerTokenDataAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateCustomerTokenDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCustomerTokenDataAttributes is not found in the empty JSON string", CreateCustomerTokenDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateCustomerTokenDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCustomerTokenDataAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("verificationToken") != null && !jsonObj.get("verificationToken").isJsonNull()) && !jsonObj.get("verificationToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationToken").toString()));
      }
      if ((jsonObj.get("jwtToken") != null && !jsonObj.get("jwtToken").isJsonNull()) && !jsonObj.get("jwtToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwtToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwtToken").toString()));
      }
      if ((jsonObj.get("verificationCode") != null && !jsonObj.get("verificationCode").isJsonNull()) && !jsonObj.get("verificationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationCode").toString()));
      }
      if (jsonObj.get("resources") != null && !jsonObj.get("resources").isJsonNull()) {
        JsonArray jsonArrayresources = jsonObj.getAsJsonArray("resources");
        if (jsonArrayresources != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resources").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resources` to be an array in the JSON string but got `%s`", jsonObj.get("resources").toString()));
          }

          // validate the optional field `resources` (array)
          for (int i = 0; i < jsonArrayresources.size(); i++) {
            CreateApiTokenDataAttributesResourcesInner.validateJsonElement(jsonArrayresources.get(i));
          };
        }
      }
      if ((jsonObj.get("upgradableScope") != null && !jsonObj.get("upgradableScope").isJsonNull()) && !jsonObj.get("upgradableScope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upgradableScope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upgradableScope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCustomerTokenDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCustomerTokenDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCustomerTokenDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCustomerTokenDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCustomerTokenDataAttributes>() {
           @Override
           public void write(JsonWriter out, CreateCustomerTokenDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCustomerTokenDataAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCustomerTokenDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCustomerTokenDataAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateCustomerTokenDataAttributes
  */
  public static CreateCustomerTokenDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCustomerTokenDataAttributes.class);
  }

 /**
  * Convert an instance of CreateCustomerTokenDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
