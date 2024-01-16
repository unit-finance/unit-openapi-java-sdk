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
import org.openapitools.client.model.CardVerificationData;
import org.openapitools.client.model.HealthcareAmounts;
import org.openapitools.client.model.Merchant;

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
 * PurchaseAuthorizationRequestAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PurchaseAuthorizationRequestAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PARTIAL_APPROVAL_ALLOWED = "partialApprovalAllowed";
  @SerializedName(SERIALIZED_NAME_PARTIAL_APPROVAL_ALLOWED)
  private Boolean partialApprovalAllowed;

  public static final String SERIALIZED_NAME_APPROVED_AMOUNT = "approvedAmount";
  @SerializedName(SERIALIZED_NAME_APPROVED_AMOUNT)
  private Integer approvedAmount;

  public static final String SERIALIZED_NAME_DECLINE_REASON = "declineReason";
  @SerializedName(SERIALIZED_NAME_DECLINE_REASON)
  private String declineReason;

  public static final String SERIALIZED_NAME_MERCHANT = "merchant";
  @SerializedName(SERIALIZED_NAME_MERCHANT)
  private Merchant merchant;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_HEALTHCARE_AMOUNTS = "healthcareAmounts";
  @SerializedName(SERIALIZED_NAME_HEALTHCARE_AMOUNTS)
  private HealthcareAmounts healthcareAmounts;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_DIGITAL_WALLET = "digitalWallet";
  @SerializedName(SERIALIZED_NAME_DIGITAL_WALLET)
  private String digitalWallet;

  public static final String SERIALIZED_NAME_CARD_VERIFICATION_DATA = "cardVerificationData";
  @SerializedName(SERIALIZED_NAME_CARD_VERIFICATION_DATA)
  private CardVerificationData cardVerificationData;

  public static final String SERIALIZED_NAME_ECOMMERCE = "ecommerce";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE)
  private Boolean ecommerce;

  public static final String SERIALIZED_NAME_CARD_PRESENT = "cardPresent";
  @SerializedName(SERIALIZED_NAME_CARD_PRESENT)
  private Boolean cardPresent;

  public static final String SERIALIZED_NAME_CARD_NETWORK = "cardNetwork";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK)
  private String cardNetwork;

  public static final String SERIALIZED_NAME_CASH_WITHDRAWAL_AMOUNT = "cashWithdrawalAmount";
  @SerializedName(SERIALIZED_NAME_CASH_WITHDRAWAL_AMOUNT)
  private Integer cashWithdrawalAmount;

  public PurchaseAuthorizationRequestAllOfAttributes() {
  }

  public PurchaseAuthorizationRequestAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public PurchaseAuthorizationRequestAllOfAttributes amount(Integer amount) {
    
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


  public PurchaseAuthorizationRequestAllOfAttributes status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public PurchaseAuthorizationRequestAllOfAttributes partialApprovalAllowed(Boolean partialApprovalAllowed) {
    
    this.partialApprovalAllowed = partialApprovalAllowed;
    return this;
  }

   /**
   * Get partialApprovalAllowed
   * @return partialApprovalAllowed
  **/
  @javax.annotation.Nonnull
  public Boolean getPartialApprovalAllowed() {
    return partialApprovalAllowed;
  }


  public void setPartialApprovalAllowed(Boolean partialApprovalAllowed) {
    this.partialApprovalAllowed = partialApprovalAllowed;
  }


  public PurchaseAuthorizationRequestAllOfAttributes approvedAmount(Integer approvedAmount) {
    
    this.approvedAmount = approvedAmount;
    return this;
  }

   /**
   * Get approvedAmount
   * @return approvedAmount
  **/
  @javax.annotation.Nullable
  public Integer getApprovedAmount() {
    return approvedAmount;
  }


  public void setApprovedAmount(Integer approvedAmount) {
    this.approvedAmount = approvedAmount;
  }


  public PurchaseAuthorizationRequestAllOfAttributes declineReason(String declineReason) {
    
    this.declineReason = declineReason;
    return this;
  }

   /**
   * Get declineReason
   * @return declineReason
  **/
  @javax.annotation.Nullable
  public String getDeclineReason() {
    return declineReason;
  }


  public void setDeclineReason(String declineReason) {
    this.declineReason = declineReason;
  }


  public PurchaseAuthorizationRequestAllOfAttributes merchant(Merchant merchant) {
    
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @javax.annotation.Nonnull
  public Merchant getMerchant() {
    return merchant;
  }


  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }


  public PurchaseAuthorizationRequestAllOfAttributes recurring(Boolean recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @javax.annotation.Nonnull
  public Boolean getRecurring() {
    return recurring;
  }


  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public PurchaseAuthorizationRequestAllOfAttributes tags(Object tags) {
    
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


  public PurchaseAuthorizationRequestAllOfAttributes healthcareAmounts(HealthcareAmounts healthcareAmounts) {
    
    this.healthcareAmounts = healthcareAmounts;
    return this;
  }

   /**
   * Get healthcareAmounts
   * @return healthcareAmounts
  **/
  @javax.annotation.Nullable
  public HealthcareAmounts getHealthcareAmounts() {
    return healthcareAmounts;
  }


  public void setHealthcareAmounts(HealthcareAmounts healthcareAmounts) {
    this.healthcareAmounts = healthcareAmounts;
  }


  public PurchaseAuthorizationRequestAllOfAttributes paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PurchaseAuthorizationRequestAllOfAttributes digitalWallet(String digitalWallet) {
    
    this.digitalWallet = digitalWallet;
    return this;
  }

   /**
   * Get digitalWallet
   * @return digitalWallet
  **/
  @javax.annotation.Nullable
  public String getDigitalWallet() {
    return digitalWallet;
  }


  public void setDigitalWallet(String digitalWallet) {
    this.digitalWallet = digitalWallet;
  }


  public PurchaseAuthorizationRequestAllOfAttributes cardVerificationData(CardVerificationData cardVerificationData) {
    
    this.cardVerificationData = cardVerificationData;
    return this;
  }

   /**
   * Get cardVerificationData
   * @return cardVerificationData
  **/
  @javax.annotation.Nullable
  public CardVerificationData getCardVerificationData() {
    return cardVerificationData;
  }


  public void setCardVerificationData(CardVerificationData cardVerificationData) {
    this.cardVerificationData = cardVerificationData;
  }


  public PurchaseAuthorizationRequestAllOfAttributes ecommerce(Boolean ecommerce) {
    
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Get ecommerce
   * @return ecommerce
  **/
  @javax.annotation.Nullable
  public Boolean getEcommerce() {
    return ecommerce;
  }


  public void setEcommerce(Boolean ecommerce) {
    this.ecommerce = ecommerce;
  }


  public PurchaseAuthorizationRequestAllOfAttributes cardPresent(Boolean cardPresent) {
    
    this.cardPresent = cardPresent;
    return this;
  }

   /**
   * Get cardPresent
   * @return cardPresent
  **/
  @javax.annotation.Nullable
  public Boolean getCardPresent() {
    return cardPresent;
  }


  public void setCardPresent(Boolean cardPresent) {
    this.cardPresent = cardPresent;
  }


  public PurchaseAuthorizationRequestAllOfAttributes cardNetwork(String cardNetwork) {
    
    this.cardNetwork = cardNetwork;
    return this;
  }

   /**
   * Get cardNetwork
   * @return cardNetwork
  **/
  @javax.annotation.Nullable
  public String getCardNetwork() {
    return cardNetwork;
  }


  public void setCardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
  }


  public PurchaseAuthorizationRequestAllOfAttributes cashWithdrawalAmount(Integer cashWithdrawalAmount) {
    
    this.cashWithdrawalAmount = cashWithdrawalAmount;
    return this;
  }

   /**
   * Get cashWithdrawalAmount
   * @return cashWithdrawalAmount
  **/
  @javax.annotation.Nullable
  public Integer getCashWithdrawalAmount() {
    return cashWithdrawalAmount;
  }


  public void setCashWithdrawalAmount(Integer cashWithdrawalAmount) {
    this.cashWithdrawalAmount = cashWithdrawalAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseAuthorizationRequestAllOfAttributes purchaseAuthorizationRequestAllOfAttributes = (PurchaseAuthorizationRequestAllOfAttributes) o;
    return Objects.equals(this.createdAt, purchaseAuthorizationRequestAllOfAttributes.createdAt) &&
        Objects.equals(this.amount, purchaseAuthorizationRequestAllOfAttributes.amount) &&
        Objects.equals(this.status, purchaseAuthorizationRequestAllOfAttributes.status) &&
        Objects.equals(this.partialApprovalAllowed, purchaseAuthorizationRequestAllOfAttributes.partialApprovalAllowed) &&
        Objects.equals(this.approvedAmount, purchaseAuthorizationRequestAllOfAttributes.approvedAmount) &&
        Objects.equals(this.declineReason, purchaseAuthorizationRequestAllOfAttributes.declineReason) &&
        Objects.equals(this.merchant, purchaseAuthorizationRequestAllOfAttributes.merchant) &&
        Objects.equals(this.recurring, purchaseAuthorizationRequestAllOfAttributes.recurring) &&
        Objects.equals(this.tags, purchaseAuthorizationRequestAllOfAttributes.tags) &&
        Objects.equals(this.healthcareAmounts, purchaseAuthorizationRequestAllOfAttributes.healthcareAmounts) &&
        Objects.equals(this.paymentMethod, purchaseAuthorizationRequestAllOfAttributes.paymentMethod) &&
        Objects.equals(this.digitalWallet, purchaseAuthorizationRequestAllOfAttributes.digitalWallet) &&
        Objects.equals(this.cardVerificationData, purchaseAuthorizationRequestAllOfAttributes.cardVerificationData) &&
        Objects.equals(this.ecommerce, purchaseAuthorizationRequestAllOfAttributes.ecommerce) &&
        Objects.equals(this.cardPresent, purchaseAuthorizationRequestAllOfAttributes.cardPresent) &&
        Objects.equals(this.cardNetwork, purchaseAuthorizationRequestAllOfAttributes.cardNetwork) &&
        Objects.equals(this.cashWithdrawalAmount, purchaseAuthorizationRequestAllOfAttributes.cashWithdrawalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, amount, status, partialApprovalAllowed, approvedAmount, declineReason, merchant, recurring, tags, healthcareAmounts, paymentMethod, digitalWallet, cardVerificationData, ecommerce, cardPresent, cardNetwork, cashWithdrawalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseAuthorizationRequestAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partialApprovalAllowed: ").append(toIndentedString(partialApprovalAllowed)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    declineReason: ").append(toIndentedString(declineReason)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    healthcareAmounts: ").append(toIndentedString(healthcareAmounts)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    digitalWallet: ").append(toIndentedString(digitalWallet)).append("\n");
    sb.append("    cardVerificationData: ").append(toIndentedString(cardVerificationData)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
    sb.append("    cardPresent: ").append(toIndentedString(cardPresent)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cashWithdrawalAmount: ").append(toIndentedString(cashWithdrawalAmount)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("status");
    openapiFields.add("partialApprovalAllowed");
    openapiFields.add("approvedAmount");
    openapiFields.add("declineReason");
    openapiFields.add("merchant");
    openapiFields.add("recurring");
    openapiFields.add("tags");
    openapiFields.add("healthcareAmounts");
    openapiFields.add("paymentMethod");
    openapiFields.add("digitalWallet");
    openapiFields.add("cardVerificationData");
    openapiFields.add("ecommerce");
    openapiFields.add("cardPresent");
    openapiFields.add("cardNetwork");
    openapiFields.add("cashWithdrawalAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("partialApprovalAllowed");
    openapiRequiredFields.add("merchant");
    openapiRequiredFields.add("recurring");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PurchaseAuthorizationRequestAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PurchaseAuthorizationRequestAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PurchaseAuthorizationRequestAllOfAttributes is not found in the empty JSON string", PurchaseAuthorizationRequestAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PurchaseAuthorizationRequestAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PurchaseAuthorizationRequestAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PurchaseAuthorizationRequestAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("declineReason") != null && !jsonObj.get("declineReason").isJsonNull()) && !jsonObj.get("declineReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `declineReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("declineReason").toString()));
      }
      // validate the required field `merchant`
      Merchant.validateJsonElement(jsonObj.get("merchant"));
      // validate the optional field `healthcareAmounts`
      if (jsonObj.get("healthcareAmounts") != null && !jsonObj.get("healthcareAmounts").isJsonNull()) {
        HealthcareAmounts.validateJsonElement(jsonObj.get("healthcareAmounts"));
      }
      if ((jsonObj.get("paymentMethod") != null && !jsonObj.get("paymentMethod").isJsonNull()) && !jsonObj.get("paymentMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentMethod").toString()));
      }
      if ((jsonObj.get("digitalWallet") != null && !jsonObj.get("digitalWallet").isJsonNull()) && !jsonObj.get("digitalWallet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `digitalWallet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("digitalWallet").toString()));
      }
      // validate the optional field `cardVerificationData`
      if (jsonObj.get("cardVerificationData") != null && !jsonObj.get("cardVerificationData").isJsonNull()) {
        CardVerificationData.validateJsonElement(jsonObj.get("cardVerificationData"));
      }
      if ((jsonObj.get("cardNetwork") != null && !jsonObj.get("cardNetwork").isJsonNull()) && !jsonObj.get("cardNetwork").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNetwork` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNetwork").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PurchaseAuthorizationRequestAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PurchaseAuthorizationRequestAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PurchaseAuthorizationRequestAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PurchaseAuthorizationRequestAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<PurchaseAuthorizationRequestAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, PurchaseAuthorizationRequestAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PurchaseAuthorizationRequestAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PurchaseAuthorizationRequestAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PurchaseAuthorizationRequestAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to PurchaseAuthorizationRequestAllOfAttributes
  */
  public static PurchaseAuthorizationRequestAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PurchaseAuthorizationRequestAllOfAttributes.class);
  }

 /**
  * Convert an instance of PurchaseAuthorizationRequestAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

