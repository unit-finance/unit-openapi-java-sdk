/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
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
import java.util.Arrays;

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
 * CustomerTokenVerificationAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerTokenVerificationAttributes {
  public static final String SERIALIZED_NAME_VERIFICATION_TOKEN = "verificationToken";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_TOKEN)
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
  **/
  @javax.annotation.Nullable
  public String getVerificationToken() {
    return verificationToken;
  }


  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("verificationToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerTokenVerificationAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerTokenVerificationAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerTokenVerificationAttributes is not found in the empty JSON string", CustomerTokenVerificationAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerTokenVerificationAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerTokenVerificationAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("verificationToken") != null && !jsonObj.get("verificationToken").isJsonNull()) && !jsonObj.get("verificationToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verificationToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerTokenVerificationAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerTokenVerificationAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerTokenVerificationAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerTokenVerificationAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerTokenVerificationAttributes>() {
           @Override
           public void write(JsonWriter out, CustomerTokenVerificationAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerTokenVerificationAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerTokenVerificationAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerTokenVerificationAttributes
  * @throws IOException if the JSON string is invalid with respect to CustomerTokenVerificationAttributes
  */
  public static CustomerTokenVerificationAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerTokenVerificationAttributes.class);
  }

 /**
  * Convert an instance of CustomerTokenVerificationAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

