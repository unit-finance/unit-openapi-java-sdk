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
import org.openapitools.client.model.DepositLimitsAllOfAttributesAch;
import org.openapitools.client.model.DepositLimitsAllOfAttributesCard;
import org.openapitools.client.model.DepositLimitsAllOfAttributesCheckDeposit;

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
 * DepositLimitsAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositLimitsAllOfAttributes {
  public static final String SERIALIZED_NAME_ACH = "ach";
  @SerializedName(SERIALIZED_NAME_ACH)
  private DepositLimitsAllOfAttributesAch ach;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private DepositLimitsAllOfAttributesCard card;

  public static final String SERIALIZED_NAME_CHECK_DEPOSIT = "checkDeposit";
  @SerializedName(SERIALIZED_NAME_CHECK_DEPOSIT)
  private DepositLimitsAllOfAttributesCheckDeposit checkDeposit;

  public DepositLimitsAllOfAttributes() {
  }

  public DepositLimitsAllOfAttributes ach(DepositLimitsAllOfAttributesAch ach) {
    
    this.ach = ach;
    return this;
  }

   /**
   * Get ach
   * @return ach
  **/
  @javax.annotation.Nonnull
  public DepositLimitsAllOfAttributesAch getAch() {
    return ach;
  }


  public void setAch(DepositLimitsAllOfAttributesAch ach) {
    this.ach = ach;
  }


  public DepositLimitsAllOfAttributes card(DepositLimitsAllOfAttributesCard card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nonnull
  public DepositLimitsAllOfAttributesCard getCard() {
    return card;
  }


  public void setCard(DepositLimitsAllOfAttributesCard card) {
    this.card = card;
  }


  public DepositLimitsAllOfAttributes checkDeposit(DepositLimitsAllOfAttributesCheckDeposit checkDeposit) {
    
    this.checkDeposit = checkDeposit;
    return this;
  }

   /**
   * Get checkDeposit
   * @return checkDeposit
  **/
  @javax.annotation.Nonnull
  public DepositLimitsAllOfAttributesCheckDeposit getCheckDeposit() {
    return checkDeposit;
  }


  public void setCheckDeposit(DepositLimitsAllOfAttributesCheckDeposit checkDeposit) {
    this.checkDeposit = checkDeposit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAllOfAttributes depositLimitsAllOfAttributes = (DepositLimitsAllOfAttributes) o;
    return Objects.equals(this.ach, depositLimitsAllOfAttributes.ach) &&
        Objects.equals(this.card, depositLimitsAllOfAttributes.card) &&
        Objects.equals(this.checkDeposit, depositLimitsAllOfAttributes.checkDeposit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, card, checkDeposit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAllOfAttributes {\n");
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    checkDeposit: ").append(toIndentedString(checkDeposit)).append("\n");
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
    openapiFields.add("ach");
    openapiFields.add("card");
    openapiFields.add("checkDeposit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ach");
    openapiRequiredFields.add("card");
    openapiRequiredFields.add("checkDeposit");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DepositLimitsAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DepositLimitsAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositLimitsAllOfAttributes is not found in the empty JSON string", DepositLimitsAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DepositLimitsAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DepositLimitsAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DepositLimitsAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `ach`
      DepositLimitsAllOfAttributesAch.validateJsonElement(jsonObj.get("ach"));
      // validate the required field `card`
      DepositLimitsAllOfAttributesCard.validateJsonElement(jsonObj.get("card"));
      // validate the required field `checkDeposit`
      DepositLimitsAllOfAttributesCheckDeposit.validateJsonElement(jsonObj.get("checkDeposit"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepositLimitsAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositLimitsAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositLimitsAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositLimitsAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositLimitsAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, DepositLimitsAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DepositLimitsAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DepositLimitsAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositLimitsAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to DepositLimitsAllOfAttributes
  */
  public static DepositLimitsAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositLimitsAllOfAttributes.class);
  }

 /**
  * Convert an instance of DepositLimitsAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

