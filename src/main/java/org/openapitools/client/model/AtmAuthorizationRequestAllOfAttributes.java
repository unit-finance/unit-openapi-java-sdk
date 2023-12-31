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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AtmAuthorizationRequestAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AtmAuthorizationRequestAllOfAttributes {
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

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private String direction;

  public static final String SERIALIZED_NAME_ATM_NAME = "atmName";
  @SerializedName(SERIALIZED_NAME_ATM_NAME)
  private String atmName;

  public static final String SERIALIZED_NAME_ATM_LOCATION = "atmLocation";
  @SerializedName(SERIALIZED_NAME_ATM_LOCATION)
  private String atmLocation;

  public static final String SERIALIZED_NAME_SURCHARGE = "surcharge";
  @SerializedName(SERIALIZED_NAME_SURCHARGE)
  private Integer surcharge;

  public static final String SERIALIZED_NAME_INTERNATIONAL_SERVICE_FEE = "internationalServiceFee";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_SERVICE_FEE)
  private BigDecimal internationalServiceFee;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_CARD_NETWORK = "cardNetwork";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK)
  private String cardNetwork;

  public AtmAuthorizationRequestAllOfAttributes() {
  }

  public AtmAuthorizationRequestAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public AtmAuthorizationRequestAllOfAttributes amount(Integer amount) {
    
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


  public AtmAuthorizationRequestAllOfAttributes status(String status) {
    
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


  public AtmAuthorizationRequestAllOfAttributes partialApprovalAllowed(Boolean partialApprovalAllowed) {
    
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


  public AtmAuthorizationRequestAllOfAttributes approvedAmount(Integer approvedAmount) {
    
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


  public AtmAuthorizationRequestAllOfAttributes declineReason(String declineReason) {
    
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


  public AtmAuthorizationRequestAllOfAttributes direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nonnull
  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public AtmAuthorizationRequestAllOfAttributes atmName(String atmName) {
    
    this.atmName = atmName;
    return this;
  }

   /**
   * Get atmName
   * @return atmName
  **/
  @javax.annotation.Nonnull
  public String getAtmName() {
    return atmName;
  }


  public void setAtmName(String atmName) {
    this.atmName = atmName;
  }


  public AtmAuthorizationRequestAllOfAttributes atmLocation(String atmLocation) {
    
    this.atmLocation = atmLocation;
    return this;
  }

   /**
   * Get atmLocation
   * @return atmLocation
  **/
  @javax.annotation.Nullable
  public String getAtmLocation() {
    return atmLocation;
  }


  public void setAtmLocation(String atmLocation) {
    this.atmLocation = atmLocation;
  }


  public AtmAuthorizationRequestAllOfAttributes surcharge(Integer surcharge) {
    
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Get surcharge
   * @return surcharge
  **/
  @javax.annotation.Nonnull
  public Integer getSurcharge() {
    return surcharge;
  }


  public void setSurcharge(Integer surcharge) {
    this.surcharge = surcharge;
  }


  public AtmAuthorizationRequestAllOfAttributes internationalServiceFee(BigDecimal internationalServiceFee) {
    
    this.internationalServiceFee = internationalServiceFee;
    return this;
  }

   /**
   * Get internationalServiceFee
   * @return internationalServiceFee
  **/
  @javax.annotation.Nullable
  public BigDecimal getInternationalServiceFee() {
    return internationalServiceFee;
  }


  public void setInternationalServiceFee(BigDecimal internationalServiceFee) {
    this.internationalServiceFee = internationalServiceFee;
  }


  public AtmAuthorizationRequestAllOfAttributes tags(Object tags) {
    
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


  public AtmAuthorizationRequestAllOfAttributes cardNetwork(String cardNetwork) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtmAuthorizationRequestAllOfAttributes atmAuthorizationRequestAllOfAttributes = (AtmAuthorizationRequestAllOfAttributes) o;
    return Objects.equals(this.createdAt, atmAuthorizationRequestAllOfAttributes.createdAt) &&
        Objects.equals(this.amount, atmAuthorizationRequestAllOfAttributes.amount) &&
        Objects.equals(this.status, atmAuthorizationRequestAllOfAttributes.status) &&
        Objects.equals(this.partialApprovalAllowed, atmAuthorizationRequestAllOfAttributes.partialApprovalAllowed) &&
        Objects.equals(this.approvedAmount, atmAuthorizationRequestAllOfAttributes.approvedAmount) &&
        Objects.equals(this.declineReason, atmAuthorizationRequestAllOfAttributes.declineReason) &&
        Objects.equals(this.direction, atmAuthorizationRequestAllOfAttributes.direction) &&
        Objects.equals(this.atmName, atmAuthorizationRequestAllOfAttributes.atmName) &&
        Objects.equals(this.atmLocation, atmAuthorizationRequestAllOfAttributes.atmLocation) &&
        Objects.equals(this.surcharge, atmAuthorizationRequestAllOfAttributes.surcharge) &&
        Objects.equals(this.internationalServiceFee, atmAuthorizationRequestAllOfAttributes.internationalServiceFee) &&
        Objects.equals(this.tags, atmAuthorizationRequestAllOfAttributes.tags) &&
        Objects.equals(this.cardNetwork, atmAuthorizationRequestAllOfAttributes.cardNetwork);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, amount, status, partialApprovalAllowed, approvedAmount, declineReason, direction, atmName, atmLocation, surcharge, internationalServiceFee, tags, cardNetwork);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtmAuthorizationRequestAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partialApprovalAllowed: ").append(toIndentedString(partialApprovalAllowed)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    declineReason: ").append(toIndentedString(declineReason)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    atmName: ").append(toIndentedString(atmName)).append("\n");
    sb.append("    atmLocation: ").append(toIndentedString(atmLocation)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    internationalServiceFee: ").append(toIndentedString(internationalServiceFee)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
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
    openapiFields.add("direction");
    openapiFields.add("atmName");
    openapiFields.add("atmLocation");
    openapiFields.add("surcharge");
    openapiFields.add("internationalServiceFee");
    openapiFields.add("tags");
    openapiFields.add("cardNetwork");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("partialApprovalAllowed");
    openapiRequiredFields.add("direction");
    openapiRequiredFields.add("atmName");
    openapiRequiredFields.add("surcharge");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AtmAuthorizationRequestAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AtmAuthorizationRequestAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AtmAuthorizationRequestAllOfAttributes is not found in the empty JSON string", AtmAuthorizationRequestAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AtmAuthorizationRequestAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AtmAuthorizationRequestAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AtmAuthorizationRequestAllOfAttributes.openapiRequiredFields) {
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
      if (!jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if (!jsonObj.get("atmName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `atmName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("atmName").toString()));
      }
      if ((jsonObj.get("atmLocation") != null && !jsonObj.get("atmLocation").isJsonNull()) && !jsonObj.get("atmLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `atmLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("atmLocation").toString()));
      }
      if ((jsonObj.get("cardNetwork") != null && !jsonObj.get("cardNetwork").isJsonNull()) && !jsonObj.get("cardNetwork").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNetwork` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNetwork").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AtmAuthorizationRequestAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AtmAuthorizationRequestAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AtmAuthorizationRequestAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AtmAuthorizationRequestAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AtmAuthorizationRequestAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, AtmAuthorizationRequestAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AtmAuthorizationRequestAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AtmAuthorizationRequestAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AtmAuthorizationRequestAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to AtmAuthorizationRequestAllOfAttributes
  */
  public static AtmAuthorizationRequestAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AtmAuthorizationRequestAllOfAttributes.class);
  }

 /**
  * Convert an instance of AtmAuthorizationRequestAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

