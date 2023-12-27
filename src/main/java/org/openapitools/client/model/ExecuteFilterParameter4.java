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
 * ExecuteFilterParameter4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter4 {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ACCOUNT_ID = "counterpartyAccountId";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ACCOUNT_ID)
  private String counterpartyAccountId;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    REJECTED("Rejected"),
    
    PENDING("Pending"),
    
    CANCELED("Canceled"),
    
    PENDING_REVIEW("Pending Review"),
    
    CLEARING("Clearing"),
    
    SENT("Sent"),
    
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

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ACHPAYMENT("AchPayment"),
    
    BOOKPAYMENT("BookPayment"),
    
    WIREPAYMENT("WirePayment");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<TypeEnum> type;

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
  private List<DirectionEnum> direction;

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

  public static final String SERIALIZED_NAME_RECURRING_PAYMENT_ID = "recurringPaymentId";
  @SerializedName(SERIALIZED_NAME_RECURRING_PAYMENT_ID)
  private Integer recurringPaymentId;

  /**
   * Gets or Sets feature
   */
  @JsonAdapter(FeatureEnum.Adapter.class)
  public enum FeatureEnum {
    SAMEDAY("SameDay"),
    
    RECURRINGPAYMENT("RecurringPayment");

    private String value;

    FeatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeatureEnum fromValue(String value) {
      for (FeatureEnum b : FeatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeatureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeatureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private List<FeatureEnum> feature;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public ExecuteFilterParameter4() {
  }

  public ExecuteFilterParameter4 accountId(String accountId) {
    
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


  public ExecuteFilterParameter4 customerId(String customerId) {
    
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


  public ExecuteFilterParameter4 counterpartyAccountId(String counterpartyAccountId) {
    
    this.counterpartyAccountId = counterpartyAccountId;
    return this;
  }

   /**
   * Get counterpartyAccountId
   * @return counterpartyAccountId
  **/
  @javax.annotation.Nullable
  public String getCounterpartyAccountId() {
    return counterpartyAccountId;
  }


  public void setCounterpartyAccountId(String counterpartyAccountId) {
    this.counterpartyAccountId = counterpartyAccountId;
  }


  public ExecuteFilterParameter4 status(List<StatusEnum> status) {
    
    this.status = status;
    return this;
  }

  public ExecuteFilterParameter4 addStatusItem(StatusEnum statusItem) {
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


  public ExecuteFilterParameter4 type(List<TypeEnum> type) {
    
    this.type = type;
    return this;
  }

  public ExecuteFilterParameter4 addTypeItem(TypeEnum typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public List<TypeEnum> getType() {
    return type;
  }


  public void setType(List<TypeEnum> type) {
    this.type = type;
  }


  public ExecuteFilterParameter4 direction(List<DirectionEnum> direction) {
    
    this.direction = direction;
    return this;
  }

  public ExecuteFilterParameter4 addDirectionItem(DirectionEnum directionItem) {
    if (this.direction == null) {
      this.direction = new ArrayList<>();
    }
    this.direction.add(directionItem);
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public List<DirectionEnum> getDirection() {
    return direction;
  }


  public void setDirection(List<DirectionEnum> direction) {
    this.direction = direction;
  }


  public ExecuteFilterParameter4 since(String since) {
    
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


  public ExecuteFilterParameter4 until(String until) {
    
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


  public ExecuteFilterParameter4 fromAmount(Integer fromAmount) {
    
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


  public ExecuteFilterParameter4 toAmount(Integer toAmount) {
    
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


  public ExecuteFilterParameter4 recurringPaymentId(Integer recurringPaymentId) {
    
    this.recurringPaymentId = recurringPaymentId;
    return this;
  }

   /**
   * Get recurringPaymentId
   * @return recurringPaymentId
  **/
  @javax.annotation.Nullable
  public Integer getRecurringPaymentId() {
    return recurringPaymentId;
  }


  public void setRecurringPaymentId(Integer recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
  }


  public ExecuteFilterParameter4 feature(List<FeatureEnum> feature) {
    
    this.feature = feature;
    return this;
  }

  public ExecuteFilterParameter4 addFeatureItem(FeatureEnum featureItem) {
    if (this.feature == null) {
      this.feature = new ArrayList<>();
    }
    this.feature.add(featureItem);
    return this;
  }

   /**
   * Get feature
   * @return feature
  **/
  @javax.annotation.Nullable
  public List<FeatureEnum> getFeature() {
    return feature;
  }


  public void setFeature(List<FeatureEnum> feature) {
    this.feature = feature;
  }


  public ExecuteFilterParameter4 tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ExecuteFilterParameter4 putTagsItem(String key, String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter4 executeFilterParameter4 = (ExecuteFilterParameter4) o;
    return Objects.equals(this.accountId, executeFilterParameter4.accountId) &&
        Objects.equals(this.customerId, executeFilterParameter4.customerId) &&
        Objects.equals(this.counterpartyAccountId, executeFilterParameter4.counterpartyAccountId) &&
        Objects.equals(this.status, executeFilterParameter4.status) &&
        Objects.equals(this.type, executeFilterParameter4.type) &&
        Objects.equals(this.direction, executeFilterParameter4.direction) &&
        Objects.equals(this.since, executeFilterParameter4.since) &&
        Objects.equals(this.until, executeFilterParameter4.until) &&
        Objects.equals(this.fromAmount, executeFilterParameter4.fromAmount) &&
        Objects.equals(this.toAmount, executeFilterParameter4.toAmount) &&
        Objects.equals(this.recurringPaymentId, executeFilterParameter4.recurringPaymentId) &&
        Objects.equals(this.feature, executeFilterParameter4.feature) &&
        Objects.equals(this.tags, executeFilterParameter4.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, counterpartyAccountId, status, type, direction, since, until, fromAmount, toAmount, recurringPaymentId, feature, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter4 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    counterpartyAccountId: ").append(toIndentedString(counterpartyAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("customerId");
    openapiFields.add("counterpartyAccountId");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("direction");
    openapiFields.add("since");
    openapiFields.add("until");
    openapiFields.add("fromAmount");
    openapiFields.add("toAmount");
    openapiFields.add("recurringPaymentId");
    openapiFields.add("feature");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter4
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter4.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter4 is not found in the empty JSON string", ExecuteFilterParameter4.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter4.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter4` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("counterpartyAccountId") != null && !jsonObj.get("counterpartyAccountId").isJsonNull()) && !jsonObj.get("counterpartyAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `counterpartyAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("counterpartyAccountId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull() && !jsonObj.get("status").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be an array in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull() && !jsonObj.get("type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull() && !jsonObj.get("direction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be an array in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if ((jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) && !jsonObj.get("since").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `since` to be a primitive type in the JSON string but got `%s`", jsonObj.get("since").toString()));
      }
      if ((jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) && !jsonObj.get("until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("until").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("feature") != null && !jsonObj.get("feature").isJsonNull() && !jsonObj.get("feature").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature` to be an array in the JSON string but got `%s`", jsonObj.get("feature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter4.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter4' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter4> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter4.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter4>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter4 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter4 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter4 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter4
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter4
  */
  public static ExecuteFilterParameter4 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter4.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter4 to an JSON string
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

    if(this.counterpartyAccountId != null){
      params.add(new Pair("filter[counterpartyAccountId]", this.counterpartyAccountId));
    }

    if(this.customerId != null){
      params.add(new Pair("filter[customerId]", this.customerId));
    }

    if(this.fromAmount != null){
      params.add(new Pair("filter[fromAmount]", this.fromAmount.toString()));
    }

    if(this.recurringPaymentId != null){
      params.add(new Pair("filter[recurringPaymentId]", this.recurringPaymentId.toString()));
    }

    if(this.toAmount != null){
      params.add(new Pair("filter[toAmount]", this.toAmount.toString()));
    }

    if(this.since != null){
      params.add(new Pair("filter[since]", this.since));
    }

    if(this.until != null){
      params.add(new Pair("filter[until]", this.until));
    }

    if(this.status != null){
      int i=0;
      for (StatusEnum s:this.status) {
        params.add(new Pair(String.format("filter[status][%s]", i), s.getValue()));
        i++;
      }
    }

    if(this.direction != null){
      int i=0;
      for (DirectionEnum d:this.direction) {
        params.add(new Pair(String.format("filter[direction][%s]", i), d.getValue()));
        i++;
      }
    }

    if(this.feature != null){
      int i=0;
      for (FeatureEnum f:this.feature) {
        params.add(new Pair(String.format("filter[status][%s]", i), f.getValue()));
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
