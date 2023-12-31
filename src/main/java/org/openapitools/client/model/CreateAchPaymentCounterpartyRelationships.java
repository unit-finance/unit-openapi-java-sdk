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
import org.openapitools.client.model.AccountRelationship;
import org.openapitools.client.model.CounterpartyRelationship;

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
 * CreateAchPaymentCounterpartyRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAchPaymentCounterpartyRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AccountRelationship account;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private CounterpartyRelationship counterparty;

  public CreateAchPaymentCounterpartyRelationships() {
  }

  public CreateAchPaymentCounterpartyRelationships account(AccountRelationship account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  public AccountRelationship getAccount() {
    return account;
  }


  public void setAccount(AccountRelationship account) {
    this.account = account;
  }


  public CreateAchPaymentCounterpartyRelationships counterparty(CounterpartyRelationship counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @javax.annotation.Nonnull
  public CounterpartyRelationship getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(CounterpartyRelationship counterparty) {
    this.counterparty = counterparty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchPaymentCounterpartyRelationships createAchPaymentCounterpartyRelationships = (CreateAchPaymentCounterpartyRelationships) o;
    return Objects.equals(this.account, createAchPaymentCounterpartyRelationships.account) &&
        Objects.equals(this.counterparty, createAchPaymentCounterpartyRelationships.counterparty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, counterparty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchPaymentCounterpartyRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("counterparty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("counterparty");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateAchPaymentCounterpartyRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAchPaymentCounterpartyRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAchPaymentCounterpartyRelationships is not found in the empty JSON string", CreateAchPaymentCounterpartyRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAchPaymentCounterpartyRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAchPaymentCounterpartyRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAchPaymentCounterpartyRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `account`
      AccountRelationship.validateJsonElement(jsonObj.get("account"));
      // validate the required field `counterparty`
      CounterpartyRelationship.validateJsonElement(jsonObj.get("counterparty"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAchPaymentCounterpartyRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAchPaymentCounterpartyRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAchPaymentCounterpartyRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAchPaymentCounterpartyRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAchPaymentCounterpartyRelationships>() {
           @Override
           public void write(JsonWriter out, CreateAchPaymentCounterpartyRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAchPaymentCounterpartyRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAchPaymentCounterpartyRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAchPaymentCounterpartyRelationships
  * @throws IOException if the JSON string is invalid with respect to CreateAchPaymentCounterpartyRelationships
  */
  public static CreateAchPaymentCounterpartyRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAchPaymentCounterpartyRelationships.class);
  }

 /**
  * Convert an instance of CreateAchPaymentCounterpartyRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

