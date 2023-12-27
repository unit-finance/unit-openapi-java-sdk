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
import org.openapitools.client.model.CustomersRelationship;
import org.openapitools.client.model.ReceivedPaymentRelationshipsCustomer;
import org.openapitools.client.model.RecurringAchPaymentRelationshipsAccount;
import org.openapitools.client.model.StopPaymentRelationshipsCheckPayments;

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
 * StopPaymentRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StopPaymentRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private RecurringAchPaymentRelationshipsAccount account;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private ReceivedPaymentRelationshipsCustomer customer;

  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private CustomersRelationship customers;

  public static final String SERIALIZED_NAME_CHECK_PAYMENTS = "checkPayments";
  @SerializedName(SERIALIZED_NAME_CHECK_PAYMENTS)
  private StopPaymentRelationshipsCheckPayments checkPayments;

  public StopPaymentRelationships() {
  }

  public StopPaymentRelationships account(RecurringAchPaymentRelationshipsAccount account) {
    
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


  public StopPaymentRelationships customer(ReceivedPaymentRelationshipsCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public ReceivedPaymentRelationshipsCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(ReceivedPaymentRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public StopPaymentRelationships customers(CustomersRelationship customers) {
    
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


  public StopPaymentRelationships checkPayments(StopPaymentRelationshipsCheckPayments checkPayments) {
    
    this.checkPayments = checkPayments;
    return this;
  }

   /**
   * Get checkPayments
   * @return checkPayments
  **/
  @javax.annotation.Nullable
  public StopPaymentRelationshipsCheckPayments getCheckPayments() {
    return checkPayments;
  }


  public void setCheckPayments(StopPaymentRelationshipsCheckPayments checkPayments) {
    this.checkPayments = checkPayments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopPaymentRelationships stopPaymentRelationships = (StopPaymentRelationships) o;
    return Objects.equals(this.account, stopPaymentRelationships.account) &&
        Objects.equals(this.customer, stopPaymentRelationships.customer) &&
        Objects.equals(this.customers, stopPaymentRelationships.customers) &&
        Objects.equals(this.checkPayments, stopPaymentRelationships.checkPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, checkPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopPaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    checkPayments: ").append(toIndentedString(checkPayments)).append("\n");
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
    openapiFields.add("checkPayments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("customer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StopPaymentRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StopPaymentRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StopPaymentRelationships is not found in the empty JSON string", StopPaymentRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StopPaymentRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StopPaymentRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StopPaymentRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `account`
      RecurringAchPaymentRelationshipsAccount.validateJsonElement(jsonObj.get("account"));
      // validate the required field `customer`
      ReceivedPaymentRelationshipsCustomer.validateJsonElement(jsonObj.get("customer"));
      // validate the optional field `customers`
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        CustomersRelationship.validateJsonElement(jsonObj.get("customers"));
      }
      // validate the optional field `checkPayments`
      if (jsonObj.get("checkPayments") != null && !jsonObj.get("checkPayments").isJsonNull()) {
        StopPaymentRelationshipsCheckPayments.validateJsonElement(jsonObj.get("checkPayments"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StopPaymentRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StopPaymentRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StopPaymentRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StopPaymentRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<StopPaymentRelationships>() {
           @Override
           public void write(JsonWriter out, StopPaymentRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StopPaymentRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StopPaymentRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StopPaymentRelationships
  * @throws IOException if the JSON string is invalid with respect to StopPaymentRelationships
  */
  public static StopPaymentRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StopPaymentRelationships.class);
  }

 /**
  * Convert an instance of StopPaymentRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
