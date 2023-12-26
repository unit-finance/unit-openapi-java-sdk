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
import org.openapitools.client.model.CheckDepositTransactionAllOfAttributes;
import org.openapitools.client.model.Transaction;
import org.openapitools.client.model.TransactionRelationships;

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
 * SettlementTransaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SettlementTransaction extends Transaction {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private CheckDepositTransactionAllOfAttributes attributes;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private TransactionRelationships relationships;

  public SettlementTransaction() {
    this.type = this.getClass().getSimpleName();
  }

  public SettlementTransaction attributes(CheckDepositTransactionAllOfAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  public CheckDepositTransactionAllOfAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(CheckDepositTransactionAllOfAttributes attributes) {
    this.attributes = attributes;
  }


  public SettlementTransaction relationships(TransactionRelationships relationships) {
    
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nonnull
  public TransactionRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(TransactionRelationships relationships) {
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
    SettlementTransaction settlementTransaction = (SettlementTransaction) o;
    return Objects.equals(this.attributes, settlementTransaction.attributes) &&
        Objects.equals(this.relationships, settlementTransaction.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementTransaction {\n");
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
    openapiRequiredFields.add("attributes");
    openapiRequiredFields.add("relationships");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementTransaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SettlementTransaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettlementTransaction is not found in the empty JSON string", SettlementTransaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SettlementTransaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SettlementTransaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SettlementTransaction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementTransaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementTransaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementTransaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementTransaction.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementTransaction>() {
           @Override
           public void write(JsonWriter out, SettlementTransaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementTransaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementTransaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementTransaction
  * @throws IOException if the JSON string is invalid with respect to SettlementTransaction
  */
  public static SettlementTransaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementTransaction.class);
  }

 /**
  * Convert an instance of SettlementTransaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

