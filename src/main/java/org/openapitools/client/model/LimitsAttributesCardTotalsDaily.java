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
 * LimitsAttributesCardTotalsDaily
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LimitsAttributesCardTotalsDaily {
  public static final String SERIALIZED_NAME_WITHDRAWAL = "withdrawal";
  @SerializedName(SERIALIZED_NAME_WITHDRAWAL)
  private BigDecimal withdrawal;

  public static final String SERIALIZED_NAME_DEPOSIT = "deposit";
  @SerializedName(SERIALIZED_NAME_DEPOSIT)
  private BigDecimal deposit;

  public static final String SERIALIZED_NAME_PURCHASE = "purchase";
  @SerializedName(SERIALIZED_NAME_PURCHASE)
  private BigDecimal purchase;

  public static final String SERIALIZED_NAME_CARD_TRANSACTION = "cardTransaction";
  @SerializedName(SERIALIZED_NAME_CARD_TRANSACTION)
  private BigDecimal cardTransaction;

  public LimitsAttributesCardTotalsDaily() {
  }

  public LimitsAttributesCardTotalsDaily withdrawal(BigDecimal withdrawal) {
    
    this.withdrawal = withdrawal;
    return this;
  }

   /**
   * Get withdrawal
   * @return withdrawal
  **/
  @javax.annotation.Nullable
  public BigDecimal getWithdrawal() {
    return withdrawal;
  }


  public void setWithdrawal(BigDecimal withdrawal) {
    this.withdrawal = withdrawal;
  }


  public LimitsAttributesCardTotalsDaily deposit(BigDecimal deposit) {
    
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @javax.annotation.Nullable
  public BigDecimal getDeposit() {
    return deposit;
  }


  public void setDeposit(BigDecimal deposit) {
    this.deposit = deposit;
  }


  public LimitsAttributesCardTotalsDaily purchase(BigDecimal purchase) {
    
    this.purchase = purchase;
    return this;
  }

   /**
   * Get purchase
   * @return purchase
  **/
  @javax.annotation.Nullable
  public BigDecimal getPurchase() {
    return purchase;
  }


  public void setPurchase(BigDecimal purchase) {
    this.purchase = purchase;
  }


  public LimitsAttributesCardTotalsDaily cardTransaction(BigDecimal cardTransaction) {
    
    this.cardTransaction = cardTransaction;
    return this;
  }

   /**
   * Get cardTransaction
   * @return cardTransaction
  **/
  @javax.annotation.Nullable
  public BigDecimal getCardTransaction() {
    return cardTransaction;
  }


  public void setCardTransaction(BigDecimal cardTransaction) {
    this.cardTransaction = cardTransaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitsAttributesCardTotalsDaily limitsAttributesCardTotalsDaily = (LimitsAttributesCardTotalsDaily) o;
    return Objects.equals(this.withdrawal, limitsAttributesCardTotalsDaily.withdrawal) &&
        Objects.equals(this.deposit, limitsAttributesCardTotalsDaily.deposit) &&
        Objects.equals(this.purchase, limitsAttributesCardTotalsDaily.purchase) &&
        Objects.equals(this.cardTransaction, limitsAttributesCardTotalsDaily.cardTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawal, deposit, purchase, cardTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitsAttributesCardTotalsDaily {\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    purchase: ").append(toIndentedString(purchase)).append("\n");
    sb.append("    cardTransaction: ").append(toIndentedString(cardTransaction)).append("\n");
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
    openapiFields.add("withdrawal");
    openapiFields.add("deposit");
    openapiFields.add("purchase");
    openapiFields.add("cardTransaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LimitsAttributesCardTotalsDaily
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LimitsAttributesCardTotalsDaily.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LimitsAttributesCardTotalsDaily is not found in the empty JSON string", LimitsAttributesCardTotalsDaily.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LimitsAttributesCardTotalsDaily.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LimitsAttributesCardTotalsDaily` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LimitsAttributesCardTotalsDaily.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LimitsAttributesCardTotalsDaily' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LimitsAttributesCardTotalsDaily> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LimitsAttributesCardTotalsDaily.class));

       return (TypeAdapter<T>) new TypeAdapter<LimitsAttributesCardTotalsDaily>() {
           @Override
           public void write(JsonWriter out, LimitsAttributesCardTotalsDaily value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LimitsAttributesCardTotalsDaily read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LimitsAttributesCardTotalsDaily given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LimitsAttributesCardTotalsDaily
  * @throws IOException if the JSON string is invalid with respect to LimitsAttributesCardTotalsDaily
  */
  public static LimitsAttributesCardTotalsDaily fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LimitsAttributesCardTotalsDaily.class);
  }

 /**
  * Convert an instance of LimitsAttributesCardTotalsDaily to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

