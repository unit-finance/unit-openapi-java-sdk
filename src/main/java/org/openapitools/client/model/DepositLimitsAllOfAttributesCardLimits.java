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
import java.math.BigDecimal;
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
 * DepositLimitsAllOfAttributesCardLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class DepositLimitsAllOfAttributesCardLimits {
  public static final String SERIALIZED_NAME_DAILY_WITHDRAWAL = "dailyWithdrawal";
  @SerializedName(SERIALIZED_NAME_DAILY_WITHDRAWAL)
  private BigDecimal dailyWithdrawal;

  public static final String SERIALIZED_NAME_DAILY_DEPOSIT = "dailyDeposit";
  @SerializedName(SERIALIZED_NAME_DAILY_DEPOSIT)
  private BigDecimal dailyDeposit;

  public static final String SERIALIZED_NAME_DAILY_PURCHASE = "dailyPurchase";
  @SerializedName(SERIALIZED_NAME_DAILY_PURCHASE)
  private BigDecimal dailyPurchase;

  public static final String SERIALIZED_NAME_DAILY_CARD_TRANSACTION = "dailyCardTransaction";
  @SerializedName(SERIALIZED_NAME_DAILY_CARD_TRANSACTION)
  private BigDecimal dailyCardTransaction;

  public DepositLimitsAllOfAttributesCardLimits() {
  }

  public DepositLimitsAllOfAttributesCardLimits dailyWithdrawal(BigDecimal dailyWithdrawal) {
    
    this.dailyWithdrawal = dailyWithdrawal;
    return this;
  }

   /**
   * Get dailyWithdrawal
   * @return dailyWithdrawal
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDailyWithdrawal() {
    return dailyWithdrawal;
  }


  public void setDailyWithdrawal(BigDecimal dailyWithdrawal) {
    this.dailyWithdrawal = dailyWithdrawal;
  }


  public DepositLimitsAllOfAttributesCardLimits dailyDeposit(BigDecimal dailyDeposit) {
    
    this.dailyDeposit = dailyDeposit;
    return this;
  }

   /**
   * Get dailyDeposit
   * @return dailyDeposit
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDailyDeposit() {
    return dailyDeposit;
  }


  public void setDailyDeposit(BigDecimal dailyDeposit) {
    this.dailyDeposit = dailyDeposit;
  }


  public DepositLimitsAllOfAttributesCardLimits dailyPurchase(BigDecimal dailyPurchase) {
    
    this.dailyPurchase = dailyPurchase;
    return this;
  }

   /**
   * Get dailyPurchase
   * @return dailyPurchase
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDailyPurchase() {
    return dailyPurchase;
  }


  public void setDailyPurchase(BigDecimal dailyPurchase) {
    this.dailyPurchase = dailyPurchase;
  }


  public DepositLimitsAllOfAttributesCardLimits dailyCardTransaction(BigDecimal dailyCardTransaction) {
    
    this.dailyCardTransaction = dailyCardTransaction;
    return this;
  }

   /**
   * Get dailyCardTransaction
   * @return dailyCardTransaction
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDailyCardTransaction() {
    return dailyCardTransaction;
  }


  public void setDailyCardTransaction(BigDecimal dailyCardTransaction) {
    this.dailyCardTransaction = dailyCardTransaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesCardLimits depositLimitsAllOfAttributesCardLimits = (DepositLimitsAllOfAttributesCardLimits) o;
    return Objects.equals(this.dailyWithdrawal, depositLimitsAllOfAttributesCardLimits.dailyWithdrawal) &&
        Objects.equals(this.dailyDeposit, depositLimitsAllOfAttributesCardLimits.dailyDeposit) &&
        Objects.equals(this.dailyPurchase, depositLimitsAllOfAttributesCardLimits.dailyPurchase) &&
        Objects.equals(this.dailyCardTransaction, depositLimitsAllOfAttributesCardLimits.dailyCardTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyWithdrawal, dailyDeposit, dailyPurchase, dailyCardTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesCardLimits {\n");
    sb.append("    dailyWithdrawal: ").append(toIndentedString(dailyWithdrawal)).append("\n");
    sb.append("    dailyDeposit: ").append(toIndentedString(dailyDeposit)).append("\n");
    sb.append("    dailyPurchase: ").append(toIndentedString(dailyPurchase)).append("\n");
    sb.append("    dailyCardTransaction: ").append(toIndentedString(dailyCardTransaction)).append("\n");
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
    openapiFields.add("dailyWithdrawal");
    openapiFields.add("dailyDeposit");
    openapiFields.add("dailyPurchase");
    openapiFields.add("dailyCardTransaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dailyWithdrawal");
    openapiRequiredFields.add("dailyDeposit");
    openapiRequiredFields.add("dailyPurchase");
    openapiRequiredFields.add("dailyCardTransaction");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DepositLimitsAllOfAttributesCardLimits
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DepositLimitsAllOfAttributesCardLimits.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositLimitsAllOfAttributesCardLimits is not found in the empty JSON string", DepositLimitsAllOfAttributesCardLimits.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DepositLimitsAllOfAttributesCardLimits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DepositLimitsAllOfAttributesCardLimits` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DepositLimitsAllOfAttributesCardLimits.openapiRequiredFields) {
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
       if (!DepositLimitsAllOfAttributesCardLimits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositLimitsAllOfAttributesCardLimits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositLimitsAllOfAttributesCardLimits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositLimitsAllOfAttributesCardLimits.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositLimitsAllOfAttributesCardLimits>() {
           @Override
           public void write(JsonWriter out, DepositLimitsAllOfAttributesCardLimits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DepositLimitsAllOfAttributesCardLimits read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DepositLimitsAllOfAttributesCardLimits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositLimitsAllOfAttributesCardLimits
  * @throws IOException if the JSON string is invalid with respect to DepositLimitsAllOfAttributesCardLimits
  */
  public static DepositLimitsAllOfAttributesCardLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositLimitsAllOfAttributesCardLimits.class);
  }

 /**
  * Convert an instance of DepositLimitsAllOfAttributesCardLimits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

