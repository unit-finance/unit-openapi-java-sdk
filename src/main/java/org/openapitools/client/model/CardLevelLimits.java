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
 * CardLevelLimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CardLevelLimits {
  public static final String SERIALIZED_NAME_DAILY_WITHDRAWAL = "dailyWithdrawal";
  @SerializedName(SERIALIZED_NAME_DAILY_WITHDRAWAL)
  private Integer dailyWithdrawal;

  public static final String SERIALIZED_NAME_DAILY_PURCHASE = "dailyPurchase";
  @SerializedName(SERIALIZED_NAME_DAILY_PURCHASE)
  private Integer dailyPurchase;

  public static final String SERIALIZED_NAME_MONTHLY_WITHDRAWAL = "monthlyWithdrawal";
  @SerializedName(SERIALIZED_NAME_MONTHLY_WITHDRAWAL)
  private Integer monthlyWithdrawal;

  public static final String SERIALIZED_NAME_MONTHLY_PURCHASE = "monthlyPurchase";
  @SerializedName(SERIALIZED_NAME_MONTHLY_PURCHASE)
  private Integer monthlyPurchase;

  public CardLevelLimits() {
  }

  public CardLevelLimits dailyWithdrawal(Integer dailyWithdrawal) {
    
    this.dailyWithdrawal = dailyWithdrawal;
    return this;
  }

   /**
   * Get dailyWithdrawal
   * @return dailyWithdrawal
  **/
  @javax.annotation.Nullable
  public Integer getDailyWithdrawal() {
    return dailyWithdrawal;
  }


  public void setDailyWithdrawal(Integer dailyWithdrawal) {
    this.dailyWithdrawal = dailyWithdrawal;
  }


  public CardLevelLimits dailyPurchase(Integer dailyPurchase) {
    
    this.dailyPurchase = dailyPurchase;
    return this;
  }

   /**
   * Get dailyPurchase
   * @return dailyPurchase
  **/
  @javax.annotation.Nullable
  public Integer getDailyPurchase() {
    return dailyPurchase;
  }


  public void setDailyPurchase(Integer dailyPurchase) {
    this.dailyPurchase = dailyPurchase;
  }


  public CardLevelLimits monthlyWithdrawal(Integer monthlyWithdrawal) {
    
    this.monthlyWithdrawal = monthlyWithdrawal;
    return this;
  }

   /**
   * Get monthlyWithdrawal
   * @return monthlyWithdrawal
  **/
  @javax.annotation.Nullable
  public Integer getMonthlyWithdrawal() {
    return monthlyWithdrawal;
  }


  public void setMonthlyWithdrawal(Integer monthlyWithdrawal) {
    this.monthlyWithdrawal = monthlyWithdrawal;
  }


  public CardLevelLimits monthlyPurchase(Integer monthlyPurchase) {
    
    this.monthlyPurchase = monthlyPurchase;
    return this;
  }

   /**
   * Get monthlyPurchase
   * @return monthlyPurchase
  **/
  @javax.annotation.Nullable
  public Integer getMonthlyPurchase() {
    return monthlyPurchase;
  }


  public void setMonthlyPurchase(Integer monthlyPurchase) {
    this.monthlyPurchase = monthlyPurchase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardLevelLimits cardLevelLimits = (CardLevelLimits) o;
    return Objects.equals(this.dailyWithdrawal, cardLevelLimits.dailyWithdrawal) &&
        Objects.equals(this.dailyPurchase, cardLevelLimits.dailyPurchase) &&
        Objects.equals(this.monthlyWithdrawal, cardLevelLimits.monthlyWithdrawal) &&
        Objects.equals(this.monthlyPurchase, cardLevelLimits.monthlyPurchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyWithdrawal, dailyPurchase, monthlyWithdrawal, monthlyPurchase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardLevelLimits {\n");
    sb.append("    dailyWithdrawal: ").append(toIndentedString(dailyWithdrawal)).append("\n");
    sb.append("    dailyPurchase: ").append(toIndentedString(dailyPurchase)).append("\n");
    sb.append("    monthlyWithdrawal: ").append(toIndentedString(monthlyWithdrawal)).append("\n");
    sb.append("    monthlyPurchase: ").append(toIndentedString(monthlyPurchase)).append("\n");
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
    openapiFields.add("dailyPurchase");
    openapiFields.add("monthlyWithdrawal");
    openapiFields.add("monthlyPurchase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardLevelLimits
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CardLevelLimits.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardLevelLimits is not found in the empty JSON string", CardLevelLimits.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CardLevelLimits.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardLevelLimits` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardLevelLimits.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardLevelLimits' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardLevelLimits> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardLevelLimits.class));

       return (TypeAdapter<T>) new TypeAdapter<CardLevelLimits>() {
           @Override
           public void write(JsonWriter out, CardLevelLimits value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardLevelLimits read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardLevelLimits given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardLevelLimits
  * @throws IOException if the JSON string is invalid with respect to CardLevelLimits
  */
  public static CardLevelLimits fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardLevelLimits.class);
  }

 /**
  * Convert an instance of CardLevelLimits to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

