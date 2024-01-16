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

import org.openapitools.client.JSON;

/**
 * ExecuteFilterParameter16
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter16 {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private String since;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private String until;

  public static final String SERIALIZED_NAME_CARD_ID = "cardId";
  @SerializedName(SERIALIZED_NAME_CARD_ID)
  private String cardId;

  public static final String SERIALIZED_NAME_EXCLUDE_FEES = "excludeFees";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FEES)
  private Boolean excludeFees;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<String> type;

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

  public static final String SERIALIZED_NAME_FROM_AMOUNT = "fromAmount";
  @SerializedName(SERIALIZED_NAME_FROM_AMOUNT)
  private Integer fromAmount;

  public static final String SERIALIZED_NAME_TO_AMOUNT = "toAmount";
  @SerializedName(SERIALIZED_NAME_TO_AMOUNT)
  private Integer toAmount;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public ExecuteFilterParameter16() {
  }

  public ExecuteFilterParameter16 accountId(String accountId) {
    
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


  public ExecuteFilterParameter16 customerId(String customerId) {
    
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


  public ExecuteFilterParameter16 query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public ExecuteFilterParameter16 tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ExecuteFilterParameter16 putTagsItem(String key, String tagsItem) {
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


  public ExecuteFilterParameter16 since(String since) {
    
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


  public ExecuteFilterParameter16 until(String until) {
    
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


  public ExecuteFilterParameter16 cardId(String cardId) {
    
    this.cardId = cardId;
    return this;
  }

   /**
   * Get cardId
   * @return cardId
  **/
  @javax.annotation.Nullable
  public String getCardId() {
    return cardId;
  }


  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public ExecuteFilterParameter16 excludeFees(Boolean excludeFees) {
    
    this.excludeFees = excludeFees;
    return this;
  }

   /**
   * Get excludeFees
   * @return excludeFees
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeFees() {
    return excludeFees;
  }


  public void setExcludeFees(Boolean excludeFees) {
    this.excludeFees = excludeFees;
  }


  public ExecuteFilterParameter16 type(List<String> type) {
    
    this.type = type;
    return this;
  }

  public ExecuteFilterParameter16 addTypeItem(String typeItem) {
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
  public List<String> getType() {
    return type;
  }


  public void setType(List<String> type) {
    this.type = type;
  }


  public ExecuteFilterParameter16 direction(List<DirectionEnum> direction) {
    
    this.direction = direction;
    return this;
  }

  public ExecuteFilterParameter16 addDirectionItem(DirectionEnum directionItem) {
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


  public ExecuteFilterParameter16 fromAmount(Integer fromAmount) {
    
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


  public ExecuteFilterParameter16 toAmount(Integer toAmount) {
    
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


  public ExecuteFilterParameter16 accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter16 executeFilterParameter16 = (ExecuteFilterParameter16) o;
    return Objects.equals(this.accountId, executeFilterParameter16.accountId) &&
        Objects.equals(this.customerId, executeFilterParameter16.customerId) &&
        Objects.equals(this.query, executeFilterParameter16.query) &&
        Objects.equals(this.tags, executeFilterParameter16.tags) &&
        Objects.equals(this.since, executeFilterParameter16.since) &&
        Objects.equals(this.until, executeFilterParameter16.until) &&
        Objects.equals(this.cardId, executeFilterParameter16.cardId) &&
        Objects.equals(this.excludeFees, executeFilterParameter16.excludeFees) &&
        Objects.equals(this.type, executeFilterParameter16.type) &&
        Objects.equals(this.direction, executeFilterParameter16.direction) &&
        Objects.equals(this.fromAmount, executeFilterParameter16.fromAmount) &&
        Objects.equals(this.toAmount, executeFilterParameter16.toAmount) &&
        Objects.equals(this.accountType, executeFilterParameter16.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, query, tags, since, until, cardId, excludeFees, type, direction, fromAmount, toAmount, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter16 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    excludeFees: ").append(toIndentedString(excludeFees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("tags");
    openapiFields.add("since");
    openapiFields.add("until");
    openapiFields.add("cardId");
    openapiFields.add("excludeFees");
    openapiFields.add("type");
    openapiFields.add("direction");
    openapiFields.add("fromAmount");
    openapiFields.add("toAmount");
    openapiFields.add("accountType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter16
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter16.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter16 is not found in the empty JSON string", ExecuteFilterParameter16.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter16.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter16` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("since") != null && !jsonObj.get("since").isJsonNull()) && !jsonObj.get("since").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `since` to be a primitive type in the JSON string but got `%s`", jsonObj.get("since").toString()));
      }
      if ((jsonObj.get("until") != null && !jsonObj.get("until").isJsonNull()) && !jsonObj.get("until").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `until` to be a primitive type in the JSON string but got `%s`", jsonObj.get("until").toString()));
      }
      if ((jsonObj.get("cardId") != null && !jsonObj.get("cardId").isJsonNull()) && !jsonObj.get("cardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull() && !jsonObj.get("type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull() && !jsonObj.get("direction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be an array in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter16.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter16' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter16> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter16.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter16>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter16 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter16 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter16 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter16
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter16
  */
  public static ExecuteFilterParameter16 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter16.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter16 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

