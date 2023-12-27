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
import org.openapitools.client.model.Application;
import org.openapitools.client.model.ApplicationForm;

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
 * UnitApplicationFormResponseWithIncluded
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnitApplicationFormResponseWithIncluded {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ApplicationForm data;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private Application included;

  public UnitApplicationFormResponseWithIncluded() {
  }

  public UnitApplicationFormResponseWithIncluded data(ApplicationForm data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public ApplicationForm getData() {
    return data;
  }


  public void setData(ApplicationForm data) {
    this.data = data;
  }


  public UnitApplicationFormResponseWithIncluded included(Application included) {
    
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @javax.annotation.Nullable
  public Application getIncluded() {
    return included;
  }


  public void setIncluded(Application included) {
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
    UnitApplicationFormResponseWithIncluded unitApplicationFormResponseWithIncluded = (UnitApplicationFormResponseWithIncluded) o;
    return Objects.equals(this.data, unitApplicationFormResponseWithIncluded.data) &&
        Objects.equals(this.included, unitApplicationFormResponseWithIncluded.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitApplicationFormResponseWithIncluded {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to UnitApplicationFormResponseWithIncluded
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnitApplicationFormResponseWithIncluded.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnitApplicationFormResponseWithIncluded is not found in the empty JSON string", UnitApplicationFormResponseWithIncluded.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnitApplicationFormResponseWithIncluded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnitApplicationFormResponseWithIncluded` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        ApplicationForm.validateJsonElement(jsonObj.get("data"));
      }
      // validate the optional field `included`
      if (jsonObj.get("included") != null && !jsonObj.get("included").isJsonNull()) {
        Application.validateJsonElement(jsonObj.get("included"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnitApplicationFormResponseWithIncluded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnitApplicationFormResponseWithIncluded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnitApplicationFormResponseWithIncluded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnitApplicationFormResponseWithIncluded.class));

       return (TypeAdapter<T>) new TypeAdapter<UnitApplicationFormResponseWithIncluded>() {
           @Override
           public void write(JsonWriter out, UnitApplicationFormResponseWithIncluded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnitApplicationFormResponseWithIncluded read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnitApplicationFormResponseWithIncluded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnitApplicationFormResponseWithIncluded
  * @throws IOException if the JSON string is invalid with respect to UnitApplicationFormResponseWithIncluded
  */
  public static UnitApplicationFormResponseWithIncluded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnitApplicationFormResponseWithIncluded.class);
  }

 /**
  * Convert an instance of UnitApplicationFormResponseWithIncluded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

