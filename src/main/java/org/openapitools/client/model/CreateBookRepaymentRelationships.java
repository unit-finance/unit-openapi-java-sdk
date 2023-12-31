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
import org.openapitools.client.model.Relationship;

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
 * CreateBookRepaymentRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBookRepaymentRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Relationship account;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT = "creditAccount";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT)
  private Relationship creditAccount;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ACCOUNT)
  private Relationship counterpartyAccount;

  public CreateBookRepaymentRelationships() {
  }

  public CreateBookRepaymentRelationships account(Relationship account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  public Relationship getAccount() {
    return account;
  }


  public void setAccount(Relationship account) {
    this.account = account;
  }


  public CreateBookRepaymentRelationships creditAccount(Relationship creditAccount) {
    
    this.creditAccount = creditAccount;
    return this;
  }

   /**
   * Get creditAccount
   * @return creditAccount
  **/
  @javax.annotation.Nonnull
  public Relationship getCreditAccount() {
    return creditAccount;
  }


  public void setCreditAccount(Relationship creditAccount) {
    this.creditAccount = creditAccount;
  }


  public CreateBookRepaymentRelationships counterpartyAccount(Relationship counterpartyAccount) {
    
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @javax.annotation.Nonnull
  public Relationship getCounterpartyAccount() {
    return counterpartyAccount;
  }


  public void setCounterpartyAccount(Relationship counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBookRepaymentRelationships createBookRepaymentRelationships = (CreateBookRepaymentRelationships) o;
    return Objects.equals(this.account, createBookRepaymentRelationships.account) &&
        Objects.equals(this.creditAccount, createBookRepaymentRelationships.creditAccount) &&
        Objects.equals(this.counterpartyAccount, createBookRepaymentRelationships.counterpartyAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, creditAccount, counterpartyAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBookRepaymentRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("creditAccount");
    openapiFields.add("counterpartyAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account");
    openapiRequiredFields.add("creditAccount");
    openapiRequiredFields.add("counterpartyAccount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBookRepaymentRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBookRepaymentRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBookRepaymentRelationships is not found in the empty JSON string", CreateBookRepaymentRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBookRepaymentRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBookRepaymentRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBookRepaymentRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `account`
      Relationship.validateJsonElement(jsonObj.get("account"));
      // validate the required field `creditAccount`
      Relationship.validateJsonElement(jsonObj.get("creditAccount"));
      // validate the required field `counterpartyAccount`
      Relationship.validateJsonElement(jsonObj.get("counterpartyAccount"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBookRepaymentRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBookRepaymentRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBookRepaymentRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBookRepaymentRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBookRepaymentRelationships>() {
           @Override
           public void write(JsonWriter out, CreateBookRepaymentRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBookRepaymentRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBookRepaymentRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBookRepaymentRelationships
  * @throws IOException if the JSON string is invalid with respect to CreateBookRepaymentRelationships
  */
  public static CreateBookRepaymentRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBookRepaymentRelationships.class);
  }

 /**
  * Convert an instance of CreateBookRepaymentRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

