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
import org.openapitools.client.model.AchRepaymentAllOfRelationshipsAccount;
import org.openapitools.client.model.AchRepaymentAllOfRelationshipsCreditAccount;
import org.openapitools.client.model.AchRepaymentAllOfRelationshipsCustomer;
import org.openapitools.client.model.AchRepaymentAllOfRelationshipsPayment;
import org.openapitools.client.model.BookRepaymentAllOfRelationshipsCounterpartyAccount;

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
 * BookRepaymentAllOfRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class BookRepaymentAllOfRelationships {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AchRepaymentAllOfRelationshipsAccount account;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT = "creditAccount";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT)
  private AchRepaymentAllOfRelationshipsCreditAccount creditAccount;

  public static final String SERIALIZED_NAME_COUNTERPARTY_ACCOUNT = "counterpartyAccount";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_ACCOUNT)
  private BookRepaymentAllOfRelationshipsCounterpartyAccount counterpartyAccount;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private AchRepaymentAllOfRelationshipsCustomer customer;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private AchRepaymentAllOfRelationshipsPayment payment;

  public BookRepaymentAllOfRelationships() {
  }

  public BookRepaymentAllOfRelationships account(AchRepaymentAllOfRelationshipsAccount account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  public AchRepaymentAllOfRelationshipsAccount getAccount() {
    return account;
  }


  public void setAccount(AchRepaymentAllOfRelationshipsAccount account) {
    this.account = account;
  }


  public BookRepaymentAllOfRelationships creditAccount(AchRepaymentAllOfRelationshipsCreditAccount creditAccount) {
    
    this.creditAccount = creditAccount;
    return this;
  }

   /**
   * Get creditAccount
   * @return creditAccount
  **/
  @javax.annotation.Nullable
  public AchRepaymentAllOfRelationshipsCreditAccount getCreditAccount() {
    return creditAccount;
  }


  public void setCreditAccount(AchRepaymentAllOfRelationshipsCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
  }


  public BookRepaymentAllOfRelationships counterpartyAccount(BookRepaymentAllOfRelationshipsCounterpartyAccount counterpartyAccount) {
    
    this.counterpartyAccount = counterpartyAccount;
    return this;
  }

   /**
   * Get counterpartyAccount
   * @return counterpartyAccount
  **/
  @javax.annotation.Nullable
  public BookRepaymentAllOfRelationshipsCounterpartyAccount getCounterpartyAccount() {
    return counterpartyAccount;
  }


  public void setCounterpartyAccount(BookRepaymentAllOfRelationshipsCounterpartyAccount counterpartyAccount) {
    this.counterpartyAccount = counterpartyAccount;
  }


  public BookRepaymentAllOfRelationships customer(AchRepaymentAllOfRelationshipsCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public AchRepaymentAllOfRelationshipsCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(AchRepaymentAllOfRelationshipsCustomer customer) {
    this.customer = customer;
  }


  public BookRepaymentAllOfRelationships payment(AchRepaymentAllOfRelationshipsPayment payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  public AchRepaymentAllOfRelationshipsPayment getPayment() {
    return payment;
  }


  public void setPayment(AchRepaymentAllOfRelationshipsPayment payment) {
    this.payment = payment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookRepaymentAllOfRelationships bookRepaymentAllOfRelationships = (BookRepaymentAllOfRelationships) o;
    return Objects.equals(this.account, bookRepaymentAllOfRelationships.account) &&
        Objects.equals(this.creditAccount, bookRepaymentAllOfRelationships.creditAccount) &&
        Objects.equals(this.counterpartyAccount, bookRepaymentAllOfRelationships.counterpartyAccount) &&
        Objects.equals(this.customer, bookRepaymentAllOfRelationships.customer) &&
        Objects.equals(this.payment, bookRepaymentAllOfRelationships.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, creditAccount, counterpartyAccount, customer, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookRepaymentAllOfRelationships {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    counterpartyAccount: ").append(toIndentedString(counterpartyAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("payment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BookRepaymentAllOfRelationships
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BookRepaymentAllOfRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookRepaymentAllOfRelationships is not found in the empty JSON string", BookRepaymentAllOfRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BookRepaymentAllOfRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookRepaymentAllOfRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        AchRepaymentAllOfRelationshipsAccount.validateJsonElement(jsonObj.get("account"));
      }
      // validate the optional field `creditAccount`
      if (jsonObj.get("creditAccount") != null && !jsonObj.get("creditAccount").isJsonNull()) {
        AchRepaymentAllOfRelationshipsCreditAccount.validateJsonElement(jsonObj.get("creditAccount"));
      }
      // validate the optional field `counterpartyAccount`
      if (jsonObj.get("counterpartyAccount") != null && !jsonObj.get("counterpartyAccount").isJsonNull()) {
        BookRepaymentAllOfRelationshipsCounterpartyAccount.validateJsonElement(jsonObj.get("counterpartyAccount"));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        AchRepaymentAllOfRelationshipsCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        AchRepaymentAllOfRelationshipsPayment.validateJsonElement(jsonObj.get("payment"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookRepaymentAllOfRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookRepaymentAllOfRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookRepaymentAllOfRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookRepaymentAllOfRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<BookRepaymentAllOfRelationships>() {
           @Override
           public void write(JsonWriter out, BookRepaymentAllOfRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookRepaymentAllOfRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookRepaymentAllOfRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookRepaymentAllOfRelationships
  * @throws IOException if the JSON string is invalid with respect to BookRepaymentAllOfRelationships
  */
  public static BookRepaymentAllOfRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookRepaymentAllOfRelationships.class);
  }

 /**
  * Convert an instance of BookRepaymentAllOfRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

