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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Schedule;

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
 * RecurringDebitAchPaymentAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecurringDebitAchPaymentAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDENDA = "addenda";
  @SerializedName(SERIALIZED_NAME_ADDENDA)
  private String addenda;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("Pending"),
    
    ACTIVE("Active"),
    
    COMPLETED("Completed"),
    
    DISABLED("Disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private Schedule schedule;

  public static final String SERIALIZED_NAME_NUMBER_OF_PAYMENTS = "numberOfPayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PAYMENTS)
  private Integer numberOfPayments;

  public static final String SERIALIZED_NAME_VERIFY_COUNTERPARTY_BALANCE = "verifyCounterpartyBalance";
  @SerializedName(SERIALIZED_NAME_VERIFY_COUNTERPARTY_BALANCE)
  private Boolean verifyCounterpartyBalance = false;

  public static final String SERIALIZED_NAME_SAME_DAY = "sameDay";
  @SerializedName(SERIALIZED_NAME_SAME_DAY)
  private Boolean sameDay = false;

  public RecurringDebitAchPaymentAllOfAttributes() {
  }

  public RecurringDebitAchPaymentAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public RecurringDebitAchPaymentAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public RecurringDebitAchPaymentAllOfAttributes amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 1
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public RecurringDebitAchPaymentAllOfAttributes description(String description) {
    
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


  public RecurringDebitAchPaymentAllOfAttributes addenda(String addenda) {
    
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


  public RecurringDebitAchPaymentAllOfAttributes tags(Object tags) {
    
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


  public RecurringDebitAchPaymentAllOfAttributes status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RecurringDebitAchPaymentAllOfAttributes schedule(Schedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nonnull
  public Schedule getSchedule() {
    return schedule;
  }


  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }


  public RecurringDebitAchPaymentAllOfAttributes numberOfPayments(Integer numberOfPayments) {
    
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Get numberOfPayments
   * @return numberOfPayments
  **/
  @javax.annotation.Nonnull
  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }


  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }


  public RecurringDebitAchPaymentAllOfAttributes verifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    
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


  public RecurringDebitAchPaymentAllOfAttributes sameDay(Boolean sameDay) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDebitAchPaymentAllOfAttributes recurringDebitAchPaymentAllOfAttributes = (RecurringDebitAchPaymentAllOfAttributes) o;
    return Objects.equals(this.createdAt, recurringDebitAchPaymentAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, recurringDebitAchPaymentAllOfAttributes.updatedAt) &&
        Objects.equals(this.amount, recurringDebitAchPaymentAllOfAttributes.amount) &&
        Objects.equals(this.description, recurringDebitAchPaymentAllOfAttributes.description) &&
        Objects.equals(this.addenda, recurringDebitAchPaymentAllOfAttributes.addenda) &&
        Objects.equals(this.tags, recurringDebitAchPaymentAllOfAttributes.tags) &&
        Objects.equals(this.status, recurringDebitAchPaymentAllOfAttributes.status) &&
        Objects.equals(this.schedule, recurringDebitAchPaymentAllOfAttributes.schedule) &&
        Objects.equals(this.numberOfPayments, recurringDebitAchPaymentAllOfAttributes.numberOfPayments) &&
        Objects.equals(this.verifyCounterpartyBalance, recurringDebitAchPaymentAllOfAttributes.verifyCounterpartyBalance) &&
        Objects.equals(this.sameDay, recurringDebitAchPaymentAllOfAttributes.sameDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, amount, description, addenda, tags, status, schedule, numberOfPayments, verifyCounterpartyBalance, sameDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDebitAchPaymentAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    verifyCounterpartyBalance: ").append(toIndentedString(verifyCounterpartyBalance)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
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
    openapiFields.add("updatedAt");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("addenda");
    openapiFields.add("tags");
    openapiFields.add("status");
    openapiFields.add("schedule");
    openapiFields.add("numberOfPayments");
    openapiFields.add("verifyCounterpartyBalance");
    openapiFields.add("sameDay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("schedule");
    openapiRequiredFields.add("numberOfPayments");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecurringDebitAchPaymentAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecurringDebitAchPaymentAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringDebitAchPaymentAllOfAttributes is not found in the empty JSON string", RecurringDebitAchPaymentAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecurringDebitAchPaymentAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecurringDebitAchPaymentAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecurringDebitAchPaymentAllOfAttributes.openapiRequiredFields) {
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
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `schedule`
      Schedule.validateJsonElement(jsonObj.get("schedule"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringDebitAchPaymentAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringDebitAchPaymentAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringDebitAchPaymentAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringDebitAchPaymentAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringDebitAchPaymentAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, RecurringDebitAchPaymentAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringDebitAchPaymentAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringDebitAchPaymentAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringDebitAchPaymentAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to RecurringDebitAchPaymentAllOfAttributes
  */
  public static RecurringDebitAchPaymentAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringDebitAchPaymentAllOfAttributes.class);
  }

 /**
  * Convert an instance of RecurringDebitAchPaymentAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

