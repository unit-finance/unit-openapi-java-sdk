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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Counterparty;

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
 * ChargebackTransactionAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChargebackTransactionAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    CREDIT("Credit"),
    
    DEBIT("Debit");

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

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private Counterparty counterparty;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public ChargebackTransactionAllOfAttributes() {
  }

  public ChargebackTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ChargebackTransactionAllOfAttributes direction(DirectionEnum direction) {
    
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


  public ChargebackTransactionAllOfAttributes counterparty(Counterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @javax.annotation.Nullable
  public Counterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }


  public ChargebackTransactionAllOfAttributes amount(Integer amount) {
    
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


  public ChargebackTransactionAllOfAttributes balance(Integer balance) {
    
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


  public ChargebackTransactionAllOfAttributes summary(String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nonnull
  public String getSummary() {
    return summary;
  }


  public void setSummary(String summary) {
    this.summary = summary;
  }


  public ChargebackTransactionAllOfAttributes tags(Object tags) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackTransactionAllOfAttributes chargebackTransactionAllOfAttributes = (ChargebackTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, chargebackTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, chargebackTransactionAllOfAttributes.direction) &&
        Objects.equals(this.counterparty, chargebackTransactionAllOfAttributes.counterparty) &&
        Objects.equals(this.amount, chargebackTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, chargebackTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, chargebackTransactionAllOfAttributes.summary) &&
        Objects.equals(this.tags, chargebackTransactionAllOfAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, counterparty, amount, balance, summary, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargebackTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("direction");
    openapiFields.add("counterparty");
    openapiFields.add("amount");
    openapiFields.add("balance");
    openapiFields.add("summary");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("summary");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChargebackTransactionAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChargebackTransactionAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargebackTransactionAllOfAttributes is not found in the empty JSON string", ChargebackTransactionAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChargebackTransactionAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargebackTransactionAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChargebackTransactionAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      // validate the optional field `counterparty`
      if (jsonObj.get("counterparty") != null && !jsonObj.get("counterparty").isJsonNull()) {
        Counterparty.validateJsonElement(jsonObj.get("counterparty"));
      }
      if (!jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargebackTransactionAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargebackTransactionAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargebackTransactionAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargebackTransactionAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargebackTransactionAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, ChargebackTransactionAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargebackTransactionAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargebackTransactionAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargebackTransactionAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to ChargebackTransactionAllOfAttributes
  */
  public static ChargebackTransactionAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargebackTransactionAllOfAttributes.class);
  }

 /**
  * Convert an instance of ChargebackTransactionAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

