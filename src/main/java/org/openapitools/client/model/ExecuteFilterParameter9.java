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
import java.util.List;

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
import org.openapitools.client.Pair;

/**
 * ExecuteFilterParameter9
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter9 {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY_CODE = "merchantCategoryCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY_CODE)
  private List<String> merchantCategoryCode;

  public static final String SERIALIZED_NAME_FROM_AMOUNT = "fromAmount";
  @SerializedName(SERIALIZED_NAME_FROM_AMOUNT)
  private Integer fromAmount;

  public static final String SERIALIZED_NAME_TO_AMOUNT = "toAmount";
  @SerializedName(SERIALIZED_NAME_TO_AMOUNT)
  private Integer toAmount;

  public ExecuteFilterParameter9() {
  }

  public ExecuteFilterParameter9 accountId(String accountId) {
    
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


  public ExecuteFilterParameter9 customerId(String customerId) {
    
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


  public ExecuteFilterParameter9 merchantCategoryCode(List<String> merchantCategoryCode) {
    
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  public ExecuteFilterParameter9 addMerchantCategoryCodeItem(String merchantCategoryCodeItem) {
    if (this.merchantCategoryCode == null) {
      this.merchantCategoryCode = new ArrayList<>();
    }
    this.merchantCategoryCode.add(merchantCategoryCodeItem);
    return this;
  }

   /**
   * Get merchantCategoryCode
   * @return merchantCategoryCode
  **/
  @javax.annotation.Nullable
  public List<String> getMerchantCategoryCode() {
    return merchantCategoryCode;
  }


  public void setMerchantCategoryCode(List<String> merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public ExecuteFilterParameter9 fromAmount(Integer fromAmount) {
    
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


  public ExecuteFilterParameter9 toAmount(Integer toAmount) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter9 executeFilterParameter9 = (ExecuteFilterParameter9) o;
    return Objects.equals(this.accountId, executeFilterParameter9.accountId) &&
        Objects.equals(this.customerId, executeFilterParameter9.customerId) &&
        Objects.equals(this.merchantCategoryCode, executeFilterParameter9.merchantCategoryCode) &&
        Objects.equals(this.fromAmount, executeFilterParameter9.fromAmount) &&
        Objects.equals(this.toAmount, executeFilterParameter9.toAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, merchantCategoryCode, fromAmount, toAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter9 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
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
    openapiFields.add("merchantCategoryCode");
    openapiFields.add("fromAmount");
    openapiFields.add("toAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExecuteFilterParameter9
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExecuteFilterParameter9.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExecuteFilterParameter9 is not found in the empty JSON string", ExecuteFilterParameter9.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExecuteFilterParameter9.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExecuteFilterParameter9` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("merchantCategoryCode") != null && !jsonObj.get("merchantCategoryCode").isJsonNull() && !jsonObj.get("merchantCategoryCode").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantCategoryCode` to be an array in the JSON string but got `%s`", jsonObj.get("merchantCategoryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExecuteFilterParameter9.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExecuteFilterParameter9' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExecuteFilterParameter9> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExecuteFilterParameter9.class));

       return (TypeAdapter<T>) new TypeAdapter<ExecuteFilterParameter9>() {
           @Override
           public void write(JsonWriter out, ExecuteFilterParameter9 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExecuteFilterParameter9 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExecuteFilterParameter9 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExecuteFilterParameter9
  * @throws IOException if the JSON string is invalid with respect to ExecuteFilterParameter9
  */
  public static ExecuteFilterParameter9 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExecuteFilterParameter9.class);
  }

 /**
  * Convert an instance of ExecuteFilterParameter9 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }

    public List<Pair> toParams() {
        List<Pair> params = new ArrayList<>();

        if (this.accountId != null) {
            params.add(new Pair("filter[accountId]", this.accountId));
        }

        if (this.customerId != null) {
            params.add(new Pair("filter[customerId]", this.customerId));
        }

        if (this.fromAmount != null) {
            params.add(new Pair("filter[fromAmount]", this.fromAmount.toString()));
        }

        if (this.toAmount != null) {
            params.add(new Pair("filter[toAmount]", this.toAmount.toString()));
        }

        if (this.merchantCategoryCode != null) {
            int i = 0;
            for (String m : this.merchantCategoryCode) {
                params.add(new Pair(String.format("filter[merchantCategoryCode][%s]", i), m));
                i++;
            }
        }

        return params;
    }
}

