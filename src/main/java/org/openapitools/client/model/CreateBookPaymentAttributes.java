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
 * CreateBookPaymentAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class CreateBookPaymentAttributes {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_TRANSACTION_SUMMARY_OVERRIDE = "transactionSummaryOverride";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_SUMMARY_OVERRIDE)
  private String transactionSummaryOverride;

  public CreateBookPaymentAttributes() {
  }

  public CreateBookPaymentAttributes amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public CreateBookPaymentAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateBookPaymentAttributes idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @javax.annotation.Nullable
  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateBookPaymentAttributes tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }


  public CreateBookPaymentAttributes transactionSummaryOverride(String transactionSummaryOverride) {
    
    this.transactionSummaryOverride = transactionSummaryOverride;
    return this;
  }

   /**
   * Get transactionSummaryOverride
   * @return transactionSummaryOverride
  **/
  @javax.annotation.Nullable
  public String getTransactionSummaryOverride() {
    return transactionSummaryOverride;
  }


  public void setTransactionSummaryOverride(String transactionSummaryOverride) {
    this.transactionSummaryOverride = transactionSummaryOverride;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBookPaymentAttributes createBookPaymentAttributes = (CreateBookPaymentAttributes) o;
    return Objects.equals(this.amount, createBookPaymentAttributes.amount) &&
        Objects.equals(this.description, createBookPaymentAttributes.description) &&
        Objects.equals(this.idempotencyKey, createBookPaymentAttributes.idempotencyKey) &&
        Objects.equals(this.tags, createBookPaymentAttributes.tags) &&
        Objects.equals(this.transactionSummaryOverride, createBookPaymentAttributes.transactionSummaryOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, idempotencyKey, tags, transactionSummaryOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBookPaymentAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    transactionSummaryOverride: ").append(toIndentedString(transactionSummaryOverride)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("idempotencyKey");
    openapiFields.add("tags");
    openapiFields.add("transactionSummaryOverride");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBookPaymentAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBookPaymentAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBookPaymentAttributes is not found in the empty JSON string", CreateBookPaymentAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBookPaymentAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBookPaymentAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBookPaymentAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("idempotencyKey") != null && !jsonObj.get("idempotencyKey").isJsonNull()) && !jsonObj.get("idempotencyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotencyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotencyKey").toString()));
      }
      if ((jsonObj.get("transactionSummaryOverride") != null && !jsonObj.get("transactionSummaryOverride").isJsonNull()) && !jsonObj.get("transactionSummaryOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionSummaryOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionSummaryOverride").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBookPaymentAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBookPaymentAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBookPaymentAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBookPaymentAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBookPaymentAttributes>() {
           @Override
           public void write(JsonWriter out, CreateBookPaymentAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBookPaymentAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBookPaymentAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBookPaymentAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateBookPaymentAttributes
  */
  public static CreateBookPaymentAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBookPaymentAttributes.class);
  }

 /**
  * Convert an instance of CreateBookPaymentAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

