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
import java.util.stream.Collectors;

import org.openapitools.client.JSON;
import org.openapitools.client.Pair;

/**
 * ExecuteFilterParameter12
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter12 {
  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private String since;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private String until;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<String> type;

  public ExecuteFilterParameter12() {
  }

  public ExecuteFilterParameter12 since(String since) {
    
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


  public ExecuteFilterParameter12 until(String until) {
    
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


  public ExecuteFilterParameter12 type(List<String> type) {
    
    this.type = type;
    return this;
  }

  public ExecuteFilterParameter12 addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public List<String> getType() {
    return type;
  }


  public void setType(List<String> type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter12 executeFilterParameter12 = (ExecuteFilterParameter12) o;
    return Objects.equals(this.since, executeFilterParameter12.since) &&
        Objects.equals(this.until, executeFilterParameter12.until) &&
        Objects.equals(this.type, executeFilterParameter12.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(since, until, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter12 {\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter12
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter12.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter12 is not found in the empty JSON string", ExecuteFilterParameter12.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter12.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter12` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) && !jsonObj.get("since").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `since` to be a primitive type in the JSON string but got `%s`", jsonObj.get("since").toString()));
      }
      if ((jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) && !jsonObj.get("until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("until").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull() && !jsonObj.get("type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter12.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter12' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter12> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter12.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter12>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter12 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter12 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter12 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter12
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter12
  */
  public static ExecuteFilterParameter12 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter12.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter12 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }

    public List<Pair> toParams(){
        List<Pair> params = new ArrayList<>();

        if(this.since != null){
            params.add(new Pair("filter[since]", this.since));
        }

        if(this.until != null){
            params.add(new Pair("filter[until]", this.until));
        }

        if(this.type != null){
            int i=0;
            for (String t:this.type) {
                params.add(new Pair(String.format("filter[type][%s]", i), t));
                i++;
            }
        }

        return params;
    }
}

