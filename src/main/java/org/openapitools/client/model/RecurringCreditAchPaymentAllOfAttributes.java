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
 * RecurringCreditAchPaymentAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecurringCreditAchPaymentAllOfAttributes {
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

  public RecurringCreditAchPaymentAllOfAttributes() {
  }

  public RecurringCreditAchPaymentAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes amount(Integer amount) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes description(String description) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes addenda(String addenda) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes tags(Object tags) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes status(StatusEnum status) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes schedule(Schedule schedule) {
    
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


  public RecurringCreditAchPaymentAllOfAttributes numberOfPayments(Integer numberOfPayments) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringCreditAchPaymentAllOfAttributes recurringCreditAchPaymentAllOfAttributes = (RecurringCreditAchPaymentAllOfAttributes) o;
    return Objects.equals(this.createdAt, recurringCreditAchPaymentAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, recurringCreditAchPaymentAllOfAttributes.updatedAt) &&
        Objects.equals(this.amount, recurringCreditAchPaymentAllOfAttributes.amount) &&
        Objects.equals(this.description, recurringCreditAchPaymentAllOfAttributes.description) &&
        Objects.equals(this.addenda, recurringCreditAchPaymentAllOfAttributes.addenda) &&
        Objects.equals(this.tags, recurringCreditAchPaymentAllOfAttributes.tags) &&
        Objects.equals(this.status, recurringCreditAchPaymentAllOfAttributes.status) &&
        Objects.equals(this.schedule, recurringCreditAchPaymentAllOfAttributes.schedule) &&
        Objects.equals(this.numberOfPayments, recurringCreditAchPaymentAllOfAttributes.numberOfPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, amount, description, addenda, tags, status, schedule, numberOfPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringCreditAchPaymentAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to RecurringCreditAchPaymentAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecurringCreditAchPaymentAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringCreditAchPaymentAllOfAttributes is not found in the empty JSON string", RecurringCreditAchPaymentAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RecurringCreditAchPaymentAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecurringCreditAchPaymentAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecurringCreditAchPaymentAllOfAttributes.openapiRequiredFields) {
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
       if (!RecurringCreditAchPaymentAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringCreditAchPaymentAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringCreditAchPaymentAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringCreditAchPaymentAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringCreditAchPaymentAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, RecurringCreditAchPaymentAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringCreditAchPaymentAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringCreditAchPaymentAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringCreditAchPaymentAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to RecurringCreditAchPaymentAllOfAttributes
  */
  public static RecurringCreditAchPaymentAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringCreditAchPaymentAllOfAttributes.class);
  }

 /**
  * Convert an instance of RecurringCreditAchPaymentAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
