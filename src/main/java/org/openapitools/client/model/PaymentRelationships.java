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
import org.openapitools.client.model.PaymentRelationshipsCustomers;
import org.openapitools.client.model.Relationship;

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
 * PaymentRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Relationship account;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Relationship customer;

  public static final String SERIALIZED_NAME_CUSTOMERS = "customers";
  @SerializedName(SERIALIZED_NAME_CUSTOMERS)
  private PaymentRelationshipsCustomers customers;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private Relationship counterparty;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ACCOUNT)
  private Relationship counterpartyAccount;

  public static final String SERIALIZED_NAME_TRANSACTION = "transaction";
  @SerializedName(SERIALIZED_NAME_TRANSACTION)
  private Relationship transaction;

  public static final String SERIALIZED_NAME_RECURRING_PAYMENT = "recurringPayment";
  @SerializedName(SERIALIZED_NAME_RECURRING_PAYMENT)
  private Relationship recurringPayment;

  public PaymentRelationships() {
  }

  public PaymentRelationships account(Relationship account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  public Relationship getAccount() {
    return account;
  }


  public void setAccount(Relationship account) {
    this.account = account;
  }


  public PaymentRelationships customer(Relationship customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public Relationship getCustomer() {
    return customer;
  }


  public void setCustomer(Relationship customer) {
    this.customer = customer;
  }


  public PaymentRelationships customers(PaymentRelationshipsCustomers customers) {
    
    this.customers = customers;
    return this;
  }

   /**
   * Get customers
   * @return customers
  **/
  @javax.annotation.Nullable
  public PaymentRelationshipsCustomers getCustomers() {
    return customers;
  }


  public void setCustomers(PaymentRelationshipsCustomers customers) {
    this.customers = customers;
  }


  public PaymentRelationships counterparty(Relationship counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @javax.annotation.Nullable
  public Relationship getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(Relationship counterparty) {
    this.counterparty = counterparty;
  }


  public PaymentRelationships counterpartyAccount(Relationship counterpartyAccount) {
    
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @javax.annotation.Nullable
  public Relationship getCounterpartyAccount() {
    return counterpartyAccount;
  }


  public void setCounterpartyAccount(Relationship counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }


  public PaymentRelationships transaction(Relationship transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  public Relationship getTransaction() {
    return transaction;
  }


  public void setTransaction(Relationship transaction) {
    this.transaction = transaction;
  }


  public PaymentRelationships recurringPayment(Relationship recurringPayment) {
    
    this.recurringPayment = recurringPayment;
    return this;
  }

   /**
   * Get recurringPayment
   * @return recurringPayment
  **/
  @javax.annotation.Nullable
  public Relationship getRecurringPayment() {
    return recurringPayment;
  }


  public void setRecurringPayment(Relationship recurringPayment) {
    this.recurringPayment = recurringPayment;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PaymentRelationships instance itself
   */
  public PaymentRelationships putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRelationships paymentRelationships = (PaymentRelationships) o;
    return Objects.equals(this.account, paymentRelationships.account) &&
        Objects.equals(this.customer, paymentRelationships.customer) &&
        Objects.equals(this.customers, paymentRelationships.customers) &&
        Objects.equals(this.counterparty, paymentRelationships.counterparty) &&
        Objects.equals(this.counterpartyAccount, paymentRelationships.counterpartyAccount) &&
        Objects.equals(this.transaction, paymentRelationships.transaction) &&
        Objects.equals(this.recurringPayment, paymentRelationships.recurringPayment)&&
        Objects.equals(this.additionalProperties, paymentRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, customer, customers, counterparty, counterpartyAccount, transaction, recurringPayment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    recurringPayment: ").append(toIndentedString(recurringPayment)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("counterparty");
    openapiFields.add("counterpartyAccount");
    openapiFields.add("transaction");
    openapiFields.add("recurringPayment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentRelationships is not found in the empty JSON string", PaymentRelationships.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("account"));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `customers`
      if (jsonObj.get("customers") != null && !jsonObj.get("customers").isJsonNull()) {
        PaymentRelationshipsCustomers.validateJsonElement(jsonObj.get("customers"));
      }
      // validate the optional field `counterparty`
      if (jsonObj.get("counterparty") != null && !jsonObj.get("counterparty").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("counterparty"));
      }
      // validate the optional field `counterpartyAccount`
      if (jsonObj.get("counterpartyAccount") != null && !jsonObj.get("counterpartyAccount").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("counterpartyAccount"));
      }
      // validate the optional field `transaction`
      if (jsonObj.get("transaction") != null && !jsonObj.get("transaction").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("transaction"));
      }
      // validate the optional field `recurringPayment`
      if (jsonObj.get("recurringPayment") != null && !jsonObj.get("recurringPayment").isJsonNull()) {
        Relationship.validateJsonElement(jsonObj.get("recurringPayment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentRelationships>() {
           @Override
           public void write(JsonWriter out, PaymentRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PaymentRelationships instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentRelationships
  * @throws IOException if the JSON string is invalid with respect to PaymentRelationships
  */
  public static PaymentRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentRelationships.class);
  }

 /**
  * Convert an instance of PaymentRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

