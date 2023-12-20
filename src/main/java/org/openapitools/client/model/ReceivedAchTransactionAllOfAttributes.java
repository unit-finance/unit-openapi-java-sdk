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
 * ReceivedAchTransactionAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReceivedAchTransactionAllOfAttributes {
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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDENDA = "addenda";
  @SerializedName(SERIALIZED_NAME_ADDENDA)
  private String addenda;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COUNTERPARTY_NAME = "counterpartyName";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_NAME)
  private String counterpartyName;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ROUTING_NUMBER = "counterpartyRoutingNumber";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ROUTING_NUMBER)
  private String counterpartyRoutingNumber;

  public static final String SERIALIZED_NAME_TRACE_NUMBER = "traceNumber";
  @SerializedName(SERIALIZED_NAME_TRACE_NUMBER)
  private String traceNumber;

  public static final String SERIALIZED_NAME_SEC_CODE = "secCode";
  @SerializedName(SERIALIZED_NAME_SEC_CODE)
  private String secCode;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public ReceivedAchTransactionAllOfAttributes() {
  }

  public ReceivedAchTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public ReceivedAchTransactionAllOfAttributes direction(DirectionEnum direction) {
    
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


  public ReceivedAchTransactionAllOfAttributes amount(Integer amount) {
    
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


  public ReceivedAchTransactionAllOfAttributes balance(Integer balance) {
    
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


  public ReceivedAchTransactionAllOfAttributes summary(String summary) {
    
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


  public ReceivedAchTransactionAllOfAttributes description(String description) {
    
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


  public ReceivedAchTransactionAllOfAttributes addenda(String addenda) {
    
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


  public ReceivedAchTransactionAllOfAttributes companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nonnull
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public ReceivedAchTransactionAllOfAttributes counterpartyName(String counterpartyName) {
    
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


  public ReceivedAchTransactionAllOfAttributes counterpartyRoutingNumber(String counterpartyRoutingNumber) {
    
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
    return this;
  }

   /**
   * Get counterpartyRoutingNumber
   * @return counterpartyRoutingNumber
  **/
  @javax.annotation.Nonnull
  public String getCounterpartyRoutingNumber() {
    return counterpartyRoutingNumber;
  }


  public void setCounterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
  }


  public ReceivedAchTransactionAllOfAttributes traceNumber(String traceNumber) {
    
    this.traceNumber = traceNumber;
    return this;
  }

   /**
   * Get traceNumber
   * @return traceNumber
  **/
  @javax.annotation.Nullable
  public String getTraceNumber() {
    return traceNumber;
  }


  public void setTraceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
  }


  public ReceivedAchTransactionAllOfAttributes secCode(String secCode) {
    
    this.secCode = secCode;
    return this;
  }

   /**
   * Get secCode
   * @return secCode
  **/
  @javax.annotation.Nullable
  public String getSecCode() {
    return secCode;
  }


  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }


  public ReceivedAchTransactionAllOfAttributes tags(Object tags) {
    
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
    ReceivedAchTransactionAllOfAttributes receivedAchTransactionAllOfAttributes = (ReceivedAchTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, receivedAchTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, receivedAchTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, receivedAchTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, receivedAchTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, receivedAchTransactionAllOfAttributes.summary) &&
        Objects.equals(this.description, receivedAchTransactionAllOfAttributes.description) &&
        Objects.equals(this.addenda, receivedAchTransactionAllOfAttributes.addenda) &&
        Objects.equals(this.companyName, receivedAchTransactionAllOfAttributes.companyName) &&
        Objects.equals(this.counterpartyName, receivedAchTransactionAllOfAttributes.counterpartyName) &&
        Objects.equals(this.counterpartyRoutingNumber, receivedAchTransactionAllOfAttributes.counterpartyRoutingNumber) &&
        Objects.equals(this.traceNumber, receivedAchTransactionAllOfAttributes.traceNumber) &&
        Objects.equals(this.secCode, receivedAchTransactionAllOfAttributes.secCode) &&
        Objects.equals(this.tags, receivedAchTransactionAllOfAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, description, addenda, companyName, counterpartyName, counterpartyRoutingNumber, traceNumber, secCode, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedAchTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
    sb.append("    counterpartyRoutingNumber: ").append(toIndentedString(counterpartyRoutingNumber)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("addenda");
    openapiFields.add("companyName");
    openapiFields.add("counterpartyName");
    openapiFields.add("counterpartyRoutingNumber");
    openapiFields.add("traceNumber");
    openapiFields.add("secCode");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("summary");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("companyName");
    openapiRequiredFields.add("counterpartyRoutingNumber");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReceivedAchTransactionAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReceivedAchTransactionAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceivedAchTransactionAllOfAttributes is not found in the empty JSON string", ReceivedAchTransactionAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReceivedAchTransactionAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReceivedAchTransactionAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReceivedAchTransactionAllOfAttributes.openapiRequiredFields) {
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
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("addenda") != null && !jsonObj.get("addenda").isJsonNull()) && !jsonObj.get("addenda").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addenda` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addenda").toString()));
      }
      if (!jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("counterpartyName") != null && !jsonObj.get("counterpartyName").isJsonNull()) && !jsonObj.get("counterpartyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterpartyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterpartyName").toString()));
      }
      if (!jsonObj.get("counterpartyRoutingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterpartyRoutingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterpartyRoutingNumber").toString()));
      }
      if ((jsonObj.get("traceNumber") != null && !jsonObj.get("traceNumber").isJsonNull()) && !jsonObj.get("traceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceNumber").toString()));
      }
      if ((jsonObj.get("secCode") != null && !jsonObj.get("secCode").isJsonNull()) && !jsonObj.get("secCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceivedAchTransactionAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceivedAchTransactionAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceivedAchTransactionAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceivedAchTransactionAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceivedAchTransactionAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, ReceivedAchTransactionAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReceivedAchTransactionAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReceivedAchTransactionAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceivedAchTransactionAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to ReceivedAchTransactionAllOfAttributes
  */
  public static ReceivedAchTransactionAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivedAchTransactionAllOfAttributes.class);
  }

 /**
  * Convert an instance of ReceivedAchTransactionAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

