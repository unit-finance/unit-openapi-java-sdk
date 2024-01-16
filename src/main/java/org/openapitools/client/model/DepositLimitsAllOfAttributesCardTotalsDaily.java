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
 * DepositLimitsAllOfAttributesCardTotalsDaily
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositLimitsAllOfAttributesCardTotalsDaily {
  public static final String SERIALIZED_NAME_WITHDRAWALS = "withdrawals";
  @SerializedName(SERIALIZED_NAME_WITHDRAWALS)
  private BigDecimal withdrawals;

  public static final String SERIALIZED_NAME_DEPOSITS = "deposits";
  @SerializedName(SERIALIZED_NAME_DEPOSITS)
  private BigDecimal deposits;

  public static final String SERIALIZED_NAME_PURCHASES = "purchases";
  @SerializedName(SERIALIZED_NAME_PURCHASES)
  private BigDecimal purchases;

  public static final String SERIALIZED_NAME_CARD_TRANSACTIONS = "cardTransactions";
  @SerializedName(SERIALIZED_NAME_CARD_TRANSACTIONS)
  private BigDecimal cardTransactions;

  public DepositLimitsAllOfAttributesCardTotalsDaily() {
  }

  public DepositLimitsAllOfAttributesCardTotalsDaily withdrawals(BigDecimal withdrawals) {
    
    this.withdrawals = withdrawals;
    return this;
  }

   /**
   * Get withdrawals
   * @return withdrawals
  **/
  @javax.annotation.Nonnull
  public BigDecimal getWithdrawals() {
    return withdrawals;
  }


  public void setWithdrawals(BigDecimal withdrawals) {
    this.withdrawals = withdrawals;
  }


  public DepositLimitsAllOfAttributesCardTotalsDaily deposits(BigDecimal deposits) {
    
    this.deposits = deposits;
    return this;
  }

   /**
   * Get deposits
   * @return deposits
  **/
  @javax.annotation.Nonnull
  public BigDecimal getDeposits() {
    return deposits;
  }


  public void setDeposits(BigDecimal deposits) {
    this.deposits = deposits;
  }


  public DepositLimitsAllOfAttributesCardTotalsDaily purchases(BigDecimal purchases) {
    
    this.purchases = purchases;
    return this;
  }

   /**
   * Get purchases
   * @return purchases
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPurchases() {
    return purchases;
  }


  public void setPurchases(BigDecimal purchases) {
    this.purchases = purchases;
  }


  public DepositLimitsAllOfAttributesCardTotalsDaily cardTransactions(BigDecimal cardTransactions) {
    
    this.cardTransactions = cardTransactions;
    return this;
  }

   /**
   * Get cardTransactions
   * @return cardTransactions
  **/
  @javax.annotation.Nonnull
  public BigDecimal getCardTransactions() {
    return cardTransactions;
  }


  public void setCardTransactions(BigDecimal cardTransactions) {
    this.cardTransactions = cardTransactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributesCardTotalsDaily depositLimitsAllOfAttributesCardTotalsDaily = (DepositLimitsAllOfAttributesCardTotalsDaily) o;
    return Objects.equals(this.withdrawals, depositLimitsAllOfAttributesCardTotalsDaily.withdrawals) &&
        Objects.equals(this.deposits, depositLimitsAllOfAttributesCardTotalsDaily.deposits) &&
        Objects.equals(this.purchases, depositLimitsAllOfAttributesCardTotalsDaily.purchases) &&
        Objects.equals(this.cardTransactions, depositLimitsAllOfAttributesCardTotalsDaily.cardTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawals, deposits, purchases, cardTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributesCardTotalsDaily {\n");
    sb.append("    withdrawals: ").append(toIndentedString(withdrawals)).append("\n");
    sb.append("    deposits: ").append(toIndentedString(deposits)).append("\n");
    sb.append("    purchases: ").append(toIndentedString(purchases)).append("\n");
    sb.append("    cardTransactions: ").append(toIndentedString(cardTransactions)).append("\n");
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
    openapiFields.add("withdrawals");
    openapiFields.add("deposits");
    openapiFields.add("purchases");
    openapiFields.add("cardTransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("withdrawals");
    openapiRequiredFields.add("deposits");
    openapiRequiredFields.add("purchases");
    openapiRequiredFields.add("cardTransactions");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DepositLimitsAllOfAttributesCardTotalsDaily
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DepositLimitsAllOfAttributesCardTotalsDaily.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositLimitsAllOfAttributesCardTotalsDaily is not found in the empty JSON string", DepositLimitsAllOfAttributesCardTotalsDaily.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DepositLimitsAllOfAttributesCardTotalsDaily.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DepositLimitsAllOfAttributesCardTotalsDaily` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DepositLimitsAllOfAttributesCardTotalsDaily.openapiRequiredFields) {
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
       if (!DepositLimitsAllOfAttributesCardTotalsDaily.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositLimitsAllOfAttributesCardTotalsDaily' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositLimitsAllOfAttributesCardTotalsDaily> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositLimitsAllOfAttributesCardTotalsDaily.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositLimitsAllOfAttributesCardTotalsDaily>() {
           @Override
           public void write(JsonWriter out, DepositLimitsAllOfAttributesCardTotalsDaily value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DepositLimitsAllOfAttributesCardTotalsDaily read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DepositLimitsAllOfAttributesCardTotalsDaily given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositLimitsAllOfAttributesCardTotalsDaily
  * @throws IOException if the JSON string is invalid with respect to DepositLimitsAllOfAttributesCardTotalsDaily
  */
  public static DepositLimitsAllOfAttributesCardTotalsDaily fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositLimitsAllOfAttributesCardTotalsDaily.class);
  }

 /**
  * Convert an instance of DepositLimitsAllOfAttributesCardTotalsDaily to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

