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
import org.openapitools.client.model.CustomersRelationship;
import org.openapitools.client.model.ReceivedPaymentRelationshipsCustomer;
import org.openapitools.client.model.ReceivedPaymentRelationshipsReceivePaymentTransaction;
import org.openapitools.client.model.RecurringAchPaymentRelationshipsAccount;

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
 * CheckPaymentRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckPaymentRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private RecurringAchPaymentRelationshipsAccount account;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private CustomersRelationship customers;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private ReceivedPaymentRelationshipsReceivePaymentTransaction transaction;

  public CheckPaymentRelationships() {
  }

  public CheckPaymentRelationships account(RecurringAchPaymentRelationshipsAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  public RecurringAchPaymentRelationshipsAccount getAccount() {
    return account;
  }


  public void setAccount(RecurringAchPaymentRelationshipsAccount account) {
    this.account = account;
  }


  public CheckPaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public ReceivedPaymentRelationshipsCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public CheckPaymentRelationships customers(CustomersRelationship customers) {
    
    this.customers = customers;
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @javax.annotation.Nullable
  public CustomersRelationship getCustomers() {
    return customers;
  }


  public void setCustomers(CustomersRelationship customers) {
    this.customers = customers;
  }


  public CheckPaymentRelationships transaction(ReceivedPaymentRelationshipsReceivePaymentTransaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  public ReceivedPaymentRelationshipsReceivePaymentTransaction getTransaction() {
    return transaction;
  }


  public void setTransaction(ReceivedPaymentRelationshipsReceivePaymentTransaction transaction) {
    this.transaction = transaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPaymentRelationships checkPaymentRelationships = (CheckPaymentRelationships) o;
    return Objects.equals(this.account, checkPaymentRelationships.account) &&
        Objects.equals(this.customer, checkPaymentRelationships.customer) &&
        Objects.equals(this.customers, checkPaymentRelationships.customers) &&
        Objects.equals(this.transaction, checkPaymentRelationships.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("customers");
    openapiFields.add("transaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CheckPaymentRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckPaymentRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckPaymentRelationships is not found in the empty JSON string", CheckPaymentRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CheckPaymentRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckPaymentRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckPaymentRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `account`
      RecurringAchPaymentRelationshipsAccount.validateJsonElement(jsonObj.get("account"));
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        ReceivedPaymentRelationshipsCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `customers`
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        CustomersRelationship.validateJsonElement(jsonObj.get("customers"));
      }
      // validate the optional field `transaction`
      if (jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) {
        ReceivedPaymentRelationshipsReceivePaymentTransaction.validateJsonElement(jsonObj.get("transaction"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckPaymentRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckPaymentRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckPaymentRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckPaymentRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckPaymentRelationships>() {
           @Override
           public void write(JsonWriter out, CheckPaymentRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckPaymentRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckPaymentRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckPaymentRelationships
  * @throws IOException if the JSON string is invalid with respect to CheckPaymentRelationships
  */
  public static CheckPaymentRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckPaymentRelationships.class);
  }

 /**
  * Convert an instance of CheckPaymentRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

