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
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.CustomerRelationships;
import org.openapitools.client.model.TrustCustomerAllOfAttributes;

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
 * TrustCustomer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrustCustomer extends Customer {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private TrustCustomerAllOfAttributes attributes;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private CustomerRelationships relationships;

  public TrustCustomer() {
    this.type = this.getClass().getSimpleName();
  }

  public TrustCustomer attributes(TrustCustomerAllOfAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public TrustCustomerAllOfAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(TrustCustomerAllOfAttributes attributes) {
    this.attributes = attributes;
  }


  public TrustCustomer relationships(CustomerRelationships relationships) {
    
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable
  public CustomerRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(CustomerRelationships relationships) {
    this.relationships = relationships;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustCustomer trustCustomer = (TrustCustomer) o;
    return Objects.equals(this.attributes, trustCustomer.attributes) &&
        Objects.equals(this.relationships, trustCustomer.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustCustomer {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("attributes");
    openapiFields.add("relationships");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TrustCustomer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TrustCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustCustomer is not found in the empty JSON string", TrustCustomer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TrustCustomer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrustCustomer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustCustomer>() {
           @Override
           public void write(JsonWriter out, TrustCustomer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrustCustomer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrustCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrustCustomer
  * @throws IOException if the JSON string is invalid with respect to TrustCustomer
  */
  public static TrustCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustCustomer.class);
  }

 /**
  * Convert an instance of TrustCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

