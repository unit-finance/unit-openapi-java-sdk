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
 * CreateAchPaymentPlaidAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAchPaymentPlaidAttributes {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDENDA = "addenda";
  @SerializedName(SERIALIZED_NAME_ADDENDA)
  private String addenda;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    DEBIT("Debit"),
    
    CREDIT("Credit");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_PLAID_PROCESSOR_TOKEN = "plaidProcessorToken";
  @SerializedName(SERIALIZED_NAME_PLAID_PROCESSOR_TOKEN)
  private String plaidProcessorToken;

  public static final String SERIALIZED_NAME_COUNTERPARTY_NAME = "counterpartyName";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_NAME)
  private String counterpartyName;

  public static final String SERIALIZED_NAME_SAME_DAY = "sameDay";
  @SerializedName(SERIALIZED_NAME_SAME_DAY)
  private Boolean sameDay;

  public static final String SERIALIZED_NAME_VERIFY_COUNTERPARTY_BALANCE = "verifyCounterpartyBalance";
  @SerializedName(SERIALIZED_NAME_VERIFY_COUNTERPARTY_BALANCE)
  private Boolean verifyCounterpartyBalance = false;

  /**
   * Gets or Sets secCode
   */
  @JsonAdapter(SecCodeEnum.Adapter.class)
  public enum SecCodeEnum {
    WEB("WEB"),
    
    CCD("CCD"),
    
    PPD("PPD");

    private String value;

    SecCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecCodeEnum fromValue(String value) {
      for (SecCodeEnum b : SecCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SecCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SecCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEC_CODE = "secCode";
  @SerializedName(SERIALIZED_NAME_SEC_CODE)
  private SecCodeEnum secCode;

  public CreateAchPaymentPlaidAttributes() {
  }

  public CreateAchPaymentPlaidAttributes amount(Integer amount) {
    
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


  public CreateAchPaymentPlaidAttributes description(String description) {
    
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


  public CreateAchPaymentPlaidAttributes addenda(String addenda) {
    
    this.addenda = addenda;
    return this;
  }

   /**
   * Get addenda
   * @return addenda
  **/
  @javax.annotation.Nullable
  public String getAddenda() {
    return addenda;
  }


  public void setAddenda(String addenda) {
    this.addenda = addenda;
  }


  public CreateAchPaymentPlaidAttributes direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nonnull
  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public CreateAchPaymentPlaidAttributes idempotencyKey(String idempotencyKey) {
    
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


  public CreateAchPaymentPlaidAttributes tags(Object tags) {
    
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


  public CreateAchPaymentPlaidAttributes plaidProcessorToken(String plaidProcessorToken) {
    
    this.plaidProcessorToken = plaidProcessorToken;
    return this;
  }

   /**
   * Get plaidProcessorToken
   * @return plaidProcessorToken
  **/
  @javax.annotation.Nonnull
  public String getPlaidProcessorToken() {
    return plaidProcessorToken;
  }


  public void setPlaidProcessorToken(String plaidProcessorToken) {
    this.plaidProcessorToken = plaidProcessorToken;
  }


  public CreateAchPaymentPlaidAttributes counterpartyName(String counterpartyName) {
    
    this.counterpartyName = counterpartyName;
    return this;
  }

   /**
   * Get counterpartyName
   * @return counterpartyName
  **/
  @javax.annotation.Nullable
  public String getCounterpartyName() {
    return counterpartyName;
  }


  public void setCounterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
  }


  public CreateAchPaymentPlaidAttributes sameDay(Boolean sameDay) {
    
    this.sameDay = sameDay;
    return this;
  }

   /**
   * Get sameDay
   * @return sameDay
  **/
  @javax.annotation.Nullable
  public Boolean getSameDay() {
    return sameDay;
  }


  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }


  public CreateAchPaymentPlaidAttributes verifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
    return this;
  }

   /**
   * Get verifyCounterpartyBalance
   * @return verifyCounterpartyBalance
  **/
  @javax.annotation.Nullable
  public Boolean getVerifyCounterpartyBalance() {
    return verifyCounterpartyBalance;
  }


  public void setVerifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
  }


  public CreateAchPaymentPlaidAttributes secCode(SecCodeEnum secCode) {
    
    this.secCode = secCode;
    return this;
  }

   /**
   * Get secCode
   * @return secCode
  **/
  @javax.annotation.Nullable
  public SecCodeEnum getSecCode() {
    return secCode;
  }


  public void setSecCode(SecCodeEnum secCode) {
    this.secCode = secCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchPaymentPlaidAttributes createAchPaymentPlaidAttributes = (CreateAchPaymentPlaidAttributes) o;
    return Objects.equals(this.amount, createAchPaymentPlaidAttributes.amount) &&
        Objects.equals(this.description, createAchPaymentPlaidAttributes.description) &&
        Objects.equals(this.addenda, createAchPaymentPlaidAttributes.addenda) &&
        Objects.equals(this.direction, createAchPaymentPlaidAttributes.direction) &&
        Objects.equals(this.idempotencyKey, createAchPaymentPlaidAttributes.idempotencyKey) &&
        Objects.equals(this.tags, createAchPaymentPlaidAttributes.tags) &&
        Objects.equals(this.plaidProcessorToken, createAchPaymentPlaidAttributes.plaidProcessorToken) &&
        Objects.equals(this.counterpartyName, createAchPaymentPlaidAttributes.counterpartyName) &&
        Objects.equals(this.sameDay, createAchPaymentPlaidAttributes.sameDay) &&
        Objects.equals(this.verifyCounterpartyBalance, createAchPaymentPlaidAttributes.verifyCounterpartyBalance) &&
        Objects.equals(this.secCode, createAchPaymentPlaidAttributes.secCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, addenda, direction, idempotencyKey, tags, plaidProcessorToken, counterpartyName, sameDay, verifyCounterpartyBalance, secCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchPaymentPlaidAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    plaidProcessorToken: ").append(toIndentedString(plaidProcessorToken)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
    sb.append("    verifyCounterpartyBalance: ").append(toIndentedString(verifyCounterpartyBalance)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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
    openapiFields.add("addenda");
    openapiFields.add("direction");
    openapiFields.add("idempotencyKey");
    openapiFields.add("tags");
    openapiFields.add("plaidProcessorToken");
    openapiFields.add("counterpartyName");
    openapiFields.add("sameDay");
    openapiFields.add("verifyCounterpartyBalance");
    openapiFields.add("secCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("plaidProcessorToken");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateAchPaymentPlaidAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateAchPaymentPlaidAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAchPaymentPlaidAttributes is not found in the empty JSON string", CreateAchPaymentPlaidAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateAchPaymentPlaidAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAchPaymentPlaidAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateAchPaymentPlaidAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("addenda") != null && !jsonObj.get("addenda").isJsonNull()) && !jsonObj.get("addenda").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addenda` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addenda").toString()));
      }
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if ((jsonObj.get("idempotencyKey") != null && !jsonObj.get("idempotencyKey").isJsonNull()) && !jsonObj.get("idempotencyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotencyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotencyKey").toString()));
      }
      if (!jsonObj.get("plaidProcessorToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plaidProcessorToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plaidProcessorToken").toString()));
      }
      if ((jsonObj.get("counterpartyName") != null && !jsonObj.get("counterpartyName").isJsonNull()) && !jsonObj.get("counterpartyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterpartyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterpartyName").toString()));
      }
      if ((jsonObj.get("secCode") != null && !jsonObj.get("secCode").isJsonNull()) && !jsonObj.get("secCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAchPaymentPlaidAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAchPaymentPlaidAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAchPaymentPlaidAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAchPaymentPlaidAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAchPaymentPlaidAttributes>() {
           @Override
           public void write(JsonWriter out, CreateAchPaymentPlaidAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAchPaymentPlaidAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAchPaymentPlaidAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAchPaymentPlaidAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateAchPaymentPlaidAttributes
  */
  public static CreateAchPaymentPlaidAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAchPaymentPlaidAttributes.class);
  }

 /**
  * Convert an instance of CreateAchPaymentPlaidAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

