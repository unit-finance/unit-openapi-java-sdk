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
 * ExecuteFilterParameter14
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter14 {
  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private String since;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private String until;

  public static final String SERIALIZED_NAME_FROM_ID = "fromId";
  @SerializedName(SERIALIZED_NAME_FROM_ID)
  private Integer fromId;

  public static final String SERIALIZED_NAME_TO_ID = "toId";
  @SerializedName(SERIALIZED_NAME_TO_ID)
  private Integer toId;

  public ExecuteFilterParameter14() {
  }

  public ExecuteFilterParameter14 since(String since) {
    
    this.since = since;
    return this;
  }

   /**
   * Get since
   * @return since
  **/
  @javax.annotation.Nullable
  public String getSince() {
    return since;
  }


  public void setSince(String since) {
    this.since = since;
  }


  public ExecuteFilterParameter14 until(String until) {
    
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  @javax.annotation.Nullable
  public String getUntil() {
    return until;
  }


  public void setUntil(String until) {
    this.until = until;
  }


  public ExecuteFilterParameter14 fromId(Integer fromId) {
    
    this.fromId = fromId;
    return this;
  }

   /**
   * Get fromId
   * @return fromId
  **/
  @javax.annotation.Nullable
  public Integer getFromId() {
    return fromId;
  }


  public void setFromId(Integer fromId) {
    this.fromId = fromId;
  }


  public ExecuteFilterParameter14 toId(Integer toId) {
    
    this.toId = toId;
    return this;
  }

   /**
   * Get toId
   * @return toId
  **/
  @javax.annotation.Nullable
  public Integer getToId() {
    return toId;
  }


  public void setToId(Integer toId) {
    this.toId = toId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter14 executeFilterParameter14 = (ExecuteFilterParameter14) o;
    return Objects.equals(this.since, executeFilterParameter14.since) &&
        Objects.equals(this.until, executeFilterParameter14.until) &&
        Objects.equals(this.fromId, executeFilterParameter14.fromId) &&
        Objects.equals(this.toId, executeFilterParameter14.toId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(since, until, fromId, toId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter14 {\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    toId: ").append(toIndentedString(toId)).append("\n");
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
    openapiFields.add("since");
    openapiFields.add("until");
    openapiFields.add("fromId");
    openapiFields.add("toId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter14
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter14.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter14 is not found in the empty JSON string", ExecuteFilterParameter14.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter14.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter14` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) && !jsonObj.get("since").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `since` to be a primitive type in the JSON string but got `%s`", jsonObj.get("since").toString()));
      }
      if ((jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) && !jsonObj.get("until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("until").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter14.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter14' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter14> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter14.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter14>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter14 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter14 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter14 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter14
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter14
  */
  public static ExecuteFilterParameter14 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter14.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter14 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

