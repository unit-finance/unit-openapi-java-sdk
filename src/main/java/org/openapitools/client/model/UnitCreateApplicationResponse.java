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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Application;
import org.openapitools.client.model.Document;

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
 * UnitCreateApplicationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnitCreateApplicationResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Application data;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private List<Document> included;

  public UnitCreateApplicationResponse() {
  }

  public UnitCreateApplicationResponse data(Application data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public Application getData() {
    return data;
  }


  public void setData(Application data) {
    this.data = data;
  }


  public UnitCreateApplicationResponse included(List<Document> included) {
    
    this.included = included;
    return this;
  }

  public UnitCreateApplicationResponse addIncludedItem(Document includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @javax.annotation.Nullable
  public List<Document> getIncluded() {
    return included;
  }


  public void setIncluded(List<Document> included) {
    this.included = included;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitCreateApplicationResponse unitCreateApplicationResponse = (UnitCreateApplicationResponse) o;
    return Objects.equals(this.data, unitCreateApplicationResponse.data) &&
        Objects.equals(this.included, unitCreateApplicationResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitCreateApplicationResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("included");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UnitCreateApplicationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnitCreateApplicationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnitCreateApplicationResponse is not found in the empty JSON string", UnitCreateApplicationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnitCreateApplicationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnitCreateApplicationResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        Application.validateJsonElement(jsonObj.get("data"));
      }
      if (jsonObj.get("included") != null && !jsonObj.get("included").isJsonNull()) {
        JsonArray jsonArrayincluded = jsonObj.getAsJsonArray("included");
        if (jsonArrayincluded != null) {
          // ensure the json data is an array
          if (!jsonObj.get("included").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `included` to be an array in the JSON string but got `%s`", jsonObj.get("included").toString()));
          }

          // validate the optional field `included` (array)
          for (int i = 0; i < jsonArrayincluded.size(); i++) {
            Document.validateJsonElement(jsonArrayincluded.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnitCreateApplicationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnitCreateApplicationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnitCreateApplicationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnitCreateApplicationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UnitCreateApplicationResponse>() {
           @Override
           public void write(JsonWriter out, UnitCreateApplicationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnitCreateApplicationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnitCreateApplicationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnitCreateApplicationResponse
  * @throws IOException if the JSON string is invalid with respect to UnitCreateApplicationResponse
  */
  public static UnitCreateApplicationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnitCreateApplicationResponse.class);
  }

 /**
  * Convert an instance of UnitCreateApplicationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

