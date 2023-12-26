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
import org.openapitools.client.model.CounterpartyBalanceRelationshipsCounterparty;
import org.openapitools.client.model.RelationshipsCustomer;

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
 * CounterpartyBalanceRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CounterpartyBalanceRelationships {
  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private CounterpartyBalanceRelationshipsCounterparty counterparty;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private RelationshipsCustomer customer;

  public CounterpartyBalanceRelationships() {
  }

  public CounterpartyBalanceRelationships counterparty(CounterpartyBalanceRelationshipsCounterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @javax.annotation.Nonnull
  public CounterpartyBalanceRelationshipsCounterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(CounterpartyBalanceRelationshipsCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public CounterpartyBalanceRelationships customer(RelationshipsCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public RelationshipsCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(RelationshipsCustomer customer) {
    this.customer = customer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyBalanceRelationships counterpartyBalanceRelationships = (CounterpartyBalanceRelationships) o;
    return Objects.equals(this.counterparty, counterpartyBalanceRelationships.counterparty) &&
        Objects.equals(this.customer, counterpartyBalanceRelationships.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterparty, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyBalanceRelationships {\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("counterparty");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("counterparty");
    openapiRequiredFields.add("customer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CounterpartyBalanceRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CounterpartyBalanceRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CounterpartyBalanceRelationships is not found in the empty JSON string", CounterpartyBalanceRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CounterpartyBalanceRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CounterpartyBalanceRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CounterpartyBalanceRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `counterparty`
      CounterpartyBalanceRelationshipsCounterparty.validateJsonElement(jsonObj.get("counterparty"));
      // validate the required field `customer`
      RelationshipsCustomer.validateJsonElement(jsonObj.get("customer"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CounterpartyBalanceRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CounterpartyBalanceRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CounterpartyBalanceRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CounterpartyBalanceRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<CounterpartyBalanceRelationships>() {
           @Override
           public void write(JsonWriter out, CounterpartyBalanceRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CounterpartyBalanceRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CounterpartyBalanceRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CounterpartyBalanceRelationships
  * @throws IOException if the JSON string is invalid with respect to CounterpartyBalanceRelationships
  */
  public static CounterpartyBalanceRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CounterpartyBalanceRelationships.class);
  }

 /**
  * Convert an instance of CounterpartyBalanceRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

