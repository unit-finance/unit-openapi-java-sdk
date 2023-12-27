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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import java.util.stream.Collectors;

import org.openapitools.client.JSON;
import org.openapitools.client.Pair;

/**
 * ExecuteFilterParameter19
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter19 {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("New"),
    
    PENDING("Pending"),
    
    CANCELED("Canceled"),
    
    REJECTED("Rejected"),
    
    INDELIVERY("InDelivery"),
    
    INPRODUCTION("InProduction"),
    
    DELIVERED("Delivered"),
    
    RETURNEDTOSENDER("ReturnedToSender"),
    
    PENDING2("Pending"),
    
    PROCESSED("Processed"),
    
    PENDINGREVIEW("PendingReview"),
    
    MARKEDFORRETURN("MarkedForReturn"),
    
    RETURNED("Returned");

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
  private List<StatusEnum> status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private String since;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private String until;

  public static final String SERIALIZED_NAME_FROM_AMOUNT = "fromAmount";
  @SerializedName(SERIALIZED_NAME_FROM_AMOUNT)
  private Integer fromAmount;

  public static final String SERIALIZED_NAME_TO_AMOUNT = "toAmount";
  @SerializedName(SERIALIZED_NAME_TO_AMOUNT)
  private Integer toAmount;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public ExecuteFilterParameter19() {
  }

  public ExecuteFilterParameter19 accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ExecuteFilterParameter19 customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ExecuteFilterParameter19 status(List<StatusEnum> status) {
    
    this.status = status;
    return this;
  }

  public ExecuteFilterParameter19 addStatusItem(StatusEnum statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public List<StatusEnum> getStatus() {
    return status;
  }


  public void setStatus(List<StatusEnum> status) {
    this.status = status;
  }


  public ExecuteFilterParameter19 tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ExecuteFilterParameter19 putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public ExecuteFilterParameter19 since(String since) {
    
    this.since = since;
    return this;
  }

   /**
   * Get since
   * @return since
  **/
  @javax.annotation.Nullable
  public String getSince() {
    return since;
  }


  public void setSince(String since) {
    this.since = since;
  }


  public ExecuteFilterParameter19 until(String until) {
    
    this.until = until;
    return this;
  }

   /**
   * Get until
   * @return until
  **/
  @javax.annotation.Nullable
  public String getUntil() {
    return until;
  }


  public void setUntil(String until) {
    this.until = until;
  }


  public ExecuteFilterParameter19 fromAmount(Integer fromAmount) {
    
    this.fromAmount = fromAmount;
    return this;
  }

   /**
   * Get fromAmount
   * @return fromAmount
  **/
  @javax.annotation.Nullable
  public Integer getFromAmount() {
    return fromAmount;
  }


  public void setFromAmount(Integer fromAmount) {
    this.fromAmount = fromAmount;
  }


  public ExecuteFilterParameter19 toAmount(Integer toAmount) {
    
    this.toAmount = toAmount;
    return this;
  }

   /**
   * Get toAmount
   * @return toAmount
  **/
  @javax.annotation.Nullable
  public Integer getToAmount() {
    return toAmount;
  }


  public void setToAmount(Integer toAmount) {
    this.toAmount = toAmount;
  }


  public ExecuteFilterParameter19 checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter19 executeFilterParameter19 = (ExecuteFilterParameter19) o;
    return Objects.equals(this.accountId, executeFilterParameter19.accountId) &&
        Objects.equals(this.customerId, executeFilterParameter19.customerId) &&
        Objects.equals(this.status, executeFilterParameter19.status) &&
        Objects.equals(this.tags, executeFilterParameter19.tags) &&
        Objects.equals(this.since, executeFilterParameter19.since) &&
        Objects.equals(this.until, executeFilterParameter19.until) &&
        Objects.equals(this.fromAmount, executeFilterParameter19.fromAmount) &&
        Objects.equals(this.toAmount, executeFilterParameter19.toAmount) &&
        Objects.equals(this.checkNumber, executeFilterParameter19.checkNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, status, tags, since, until, fromAmount, toAmount, checkNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter19 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("customerId");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("since");
    openapiFields.add("until");
    openapiFields.add("fromAmount");
    openapiFields.add("toAmount");
    openapiFields.add("checkNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter19
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter19.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter19 is not found in the empty JSON string", ExecuteFilterParameter19.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter19.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter19` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) && !jsonObj.get("since").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `since` to be a primitive type in the JSON string but got `%s`", jsonObj.get("since").toString()));
      }
      if ((jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) && !jsonObj.get("until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("until").toString()));
      }
      if ((jsonObj.get("checkNumber") != null && !jsonObj.get("checkNumber").isJsonNull()) && !jsonObj.get("checkNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter19.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter19' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter19> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter19.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter19>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter19 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter19 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter19 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter19
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter19
  */
  public static ExecuteFilterParameter19 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter19.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter19 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }

  public List<Pair> toParams(){
    List<Pair> params = new ArrayList<>();

    if(this.accountId != null){
      params.add(new Pair("filter[accountId]", this.accountId));
    }

    if(this.customerId != null){
      params.add(new Pair("filter[customerId]", this.customerId));
    }

    if(this.since != null){
      params.add(new Pair("filter[since]", this.since));
    }

    if(this.until != null){
      params.add(new Pair("filter[until]", this.until));
    }

    if(this.checkNumber != null){
      params.add(new Pair("filter[checkNumber]", this.checkNumber));
    }

    if(this.fromAmount != null){
      params.add(new Pair("filter[fromAmount]", this.fromAmount.toString()));
    }

    if(this.toAmount != null){
      params.add(new Pair("filter[toAmount]", this.toAmount.toString()));
    }

    if(this.status != null){
      int i=0;
      for (StatusEnum s:this.status) {
        params.add(new Pair(String.format("filter[status][%s]", i), s.getValue()));
        i++;
      }
    }

    if(this.tags != null){
      String tagsAsString = this.tags.keySet().stream()
              .map(key -> key + ":" + this.tags.get(key))
              .collect(Collectors.joining(", ", "{", "}"));
      params.add(new Pair("filter[tags]", tagsAsString));
    }

    return params;
  }
}
