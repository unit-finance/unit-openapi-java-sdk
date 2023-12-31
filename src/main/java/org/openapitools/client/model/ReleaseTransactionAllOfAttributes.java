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
import org.openapitools.client.model.Address;
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
 * ReleaseTransactionAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReleaseTransactionAllOfAttributes {
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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_SENDER_NAME = "senderName";
  @SerializedName(SERIALIZED_NAME_SENDER_NAME)
  private String senderName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SENDER_ACCOUNT_NUMBER = "senderAccountNumber";
  @SerializedName(SERIALIZED_NAME_SENDER_ACCOUNT_NUMBER)
  private String senderAccountNumber;

  public static final String SERIALIZED_NAME_SENDER_ADDRESS = "senderAddress";
  @SerializedName(SERIALIZED_NAME_SENDER_ADDRESS)
  private Address senderAddress;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private Counterparty counterparty;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public ReleaseTransactionAllOfAttributes() {
  }

  public ReleaseTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public ReleaseTransactionAllOfAttributes direction(DirectionEnum direction) {
    
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


  public ReleaseTransactionAllOfAttributes amount(Integer amount) {
    
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


  public ReleaseTransactionAllOfAttributes balance(Integer balance) {
    
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


  public ReleaseTransactionAllOfAttributes summary(String summary) {
    
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


  public ReleaseTransactionAllOfAttributes senderName(String senderName) {
    
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @javax.annotation.Nullable
  public String getSenderName() {
    return senderName;
  }


  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  public ReleaseTransactionAllOfAttributes description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReleaseTransactionAllOfAttributes senderAccountNumber(String senderAccountNumber) {
    
    this.senderAccountNumber = senderAccountNumber;
    return this;
  }

   /**
   * Get senderAccountNumber
   * @return senderAccountNumber
  **/
  @javax.annotation.Nullable
  public String getSenderAccountNumber() {
    return senderAccountNumber;
  }


  public void setSenderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
  }


  public ReleaseTransactionAllOfAttributes senderAddress(Address senderAddress) {
    
    this.senderAddress = senderAddress;
    return this;
  }

   /**
   * Get senderAddress
   * @return senderAddress
  **/
  @javax.annotation.Nullable
  public Address getSenderAddress() {
    return senderAddress;
  }


  public void setSenderAddress(Address senderAddress) {
    this.senderAddress = senderAddress;
  }


  public ReleaseTransactionAllOfAttributes counterparty(Counterparty counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @javax.annotation.Nonnull
  public Counterparty getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }


  public ReleaseTransactionAllOfAttributes tags(Object tags) {
    
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
    ReleaseTransactionAllOfAttributes releaseTransactionAllOfAttributes = (ReleaseTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, releaseTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, releaseTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, releaseTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, releaseTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, releaseTransactionAllOfAttributes.summary) &&
        Objects.equals(this.senderName, releaseTransactionAllOfAttributes.senderName) &&
        Objects.equals(this.description, releaseTransactionAllOfAttributes.description) &&
        Objects.equals(this.senderAccountNumber, releaseTransactionAllOfAttributes.senderAccountNumber) &&
        Objects.equals(this.senderAddress, releaseTransactionAllOfAttributes.senderAddress) &&
        Objects.equals(this.counterparty, releaseTransactionAllOfAttributes.counterparty) &&
        Objects.equals(this.tags, releaseTransactionAllOfAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, senderName, description, senderAccountNumber, senderAddress, counterparty, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    senderAccountNumber: ").append(toIndentedString(senderAccountNumber)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("balance");
    openapiFields.add("summary");
    openapiFields.add("senderName");
    openapiFields.add("description");
    openapiFields.add("senderAccountNumber");
    openapiFields.add("senderAddress");
    openapiFields.add("counterparty");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("counterparty");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReleaseTransactionAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReleaseTransactionAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReleaseTransactionAllOfAttributes is not found in the empty JSON string", ReleaseTransactionAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReleaseTransactionAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReleaseTransactionAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReleaseTransactionAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if (!jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("senderName") != null && !jsonObj.get("senderName").isJsonNull()) && !jsonObj.get("senderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("senderAccountNumber") != null && !jsonObj.get("senderAccountNumber").isJsonNull()) && !jsonObj.get("senderAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `senderAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("senderAccountNumber").toString()));
      }
      // validate the optional field `senderAddress`
      if (jsonObj.get("senderAddress") != null && !jsonObj.get("senderAddress").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("senderAddress"));
      }
      // validate the required field `counterparty`
      Counterparty.validateJsonElement(jsonObj.get("counterparty"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReleaseTransactionAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReleaseTransactionAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReleaseTransactionAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReleaseTransactionAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ReleaseTransactionAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, ReleaseTransactionAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReleaseTransactionAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReleaseTransactionAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReleaseTransactionAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to ReleaseTransactionAllOfAttributes
  */
  public static ReleaseTransactionAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReleaseTransactionAllOfAttributes.class);
  }

 /**
  * Convert an instance of ReleaseTransactionAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

