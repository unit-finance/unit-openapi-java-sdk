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
 * UpdateDepositAccountAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class UpdateDepositAccountAttributes {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_DEPOSIT_PRODUCT = "depositProduct";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PRODUCT)
  private String depositProduct;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OVERDRAFT_LIMIT = "overdraftLimit";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_LIMIT)
  private Integer overdraftLimit;

  public UpdateDepositAccountAttributes() {
  }

  public UpdateDepositAccountAttributes tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }


  public UpdateDepositAccountAttributes depositProduct(String depositProduct) {
    
    this.depositProduct = depositProduct;
    return this;
  }

   /**
   * Get depositProduct
   * @return depositProduct
  **/
  @javax.annotation.Nullable
  public String getDepositProduct() {
    return depositProduct;
  }


  public void setDepositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
  }


  public UpdateDepositAccountAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateDepositAccountAttributes overdraftLimit(Integer overdraftLimit) {
    
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * minimum: 0
   * @return overdraftLimit
  **/
  @javax.annotation.Nullable
  public Integer getOverdraftLimit() {
    return overdraftLimit;
  }


  public void setOverdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDepositAccountAttributes updateDepositAccountAttributes = (UpdateDepositAccountAttributes) o;
    return Objects.equals(this.tags, updateDepositAccountAttributes.tags) &&
        Objects.equals(this.depositProduct, updateDepositAccountAttributes.depositProduct) &&
        Objects.equals(this.name, updateDepositAccountAttributes.name) &&
        Objects.equals(this.overdraftLimit, updateDepositAccountAttributes.overdraftLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, depositProduct, name, overdraftLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDepositAccountAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    depositProduct: ").append(toIndentedString(depositProduct)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
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
    openapiFields.add("tags");
    openapiFields.add("depositProduct");
    openapiFields.add("name");
    openapiFields.add("overdraftLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateDepositAccountAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateDepositAccountAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDepositAccountAttributes is not found in the empty JSON string", UpdateDepositAccountAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateDepositAccountAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDepositAccountAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("depositProduct") != null && !jsonObj.get("depositProduct").isJsonNull()) && !jsonObj.get("depositProduct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `depositProduct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("depositProduct").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDepositAccountAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDepositAccountAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDepositAccountAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDepositAccountAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDepositAccountAttributes>() {
           @Override
           public void write(JsonWriter out, UpdateDepositAccountAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDepositAccountAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDepositAccountAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDepositAccountAttributes
  * @throws IOException if the JSON string is invalid with respect to UpdateDepositAccountAttributes
  */
  public static UpdateDepositAccountAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDepositAccountAttributes.class);
  }

 /**
  * Convert an instance of UpdateDepositAccountAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

