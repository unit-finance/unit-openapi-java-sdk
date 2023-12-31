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
import java.time.LocalDate;
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
 * AccountEndOfDayAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountEndOfDayAttributes {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_HOLD = "hold";
  @SerializedName(SERIALIZED_NAME_HOLD)
  private Integer hold;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_OVERDRAFT_LIMIT = "overdraftLimit";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_LIMIT)
  private Integer overdraftLimit;

  public AccountEndOfDayAttributes() {
  }

  public AccountEndOfDayAttributes date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nonnull
  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public AccountEndOfDayAttributes balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public AccountEndOfDayAttributes hold(Integer hold) {
    
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @javax.annotation.Nonnull
  public Integer getHold() {
    return hold;
  }


  public void setHold(Integer hold) {
    this.hold = hold;
  }


  public AccountEndOfDayAttributes available(Integer available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nonnull
  public Integer getAvailable() {
    return available;
  }


  public void setAvailable(Integer available) {
    this.available = available;
  }


  public AccountEndOfDayAttributes overdraftLimit(Integer overdraftLimit) {
    
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
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
    AccountEndOfDayAttributes accountEndOfDayAttributes = (AccountEndOfDayAttributes) o;
    return Objects.equals(this.date, accountEndOfDayAttributes.date) &&
        Objects.equals(this.balance, accountEndOfDayAttributes.balance) &&
        Objects.equals(this.hold, accountEndOfDayAttributes.hold) &&
        Objects.equals(this.available, accountEndOfDayAttributes.available) &&
        Objects.equals(this.overdraftLimit, accountEndOfDayAttributes.overdraftLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, balance, hold, available, overdraftLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEndOfDayAttributes {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("balance");
    openapiFields.add("hold");
    openapiFields.add("available");
    openapiFields.add("overdraftLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("hold");
    openapiRequiredFields.add("available");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountEndOfDayAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountEndOfDayAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountEndOfDayAttributes is not found in the empty JSON string", AccountEndOfDayAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountEndOfDayAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountEndOfDayAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccountEndOfDayAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountEndOfDayAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountEndOfDayAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountEndOfDayAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountEndOfDayAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountEndOfDayAttributes>() {
           @Override
           public void write(JsonWriter out, AccountEndOfDayAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountEndOfDayAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountEndOfDayAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountEndOfDayAttributes
  * @throws IOException if the JSON string is invalid with respect to AccountEndOfDayAttributes
  */
  public static AccountEndOfDayAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountEndOfDayAttributes.class);
  }

 /**
  * Convert an instance of AccountEndOfDayAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

