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
import org.openapitools.client.model.DepositAccountAllOfAttributesSecondaryAccountNumber;

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
 * DepositAccountAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositAccountAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEPOSIT_PRODUCT = "depositProduct";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PRODUCT)
  private String depositProduct;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_SECONDARY_ACCOUNT_NUMBER = "secondaryAccountNumber";
  @SerializedName(SERIALIZED_NAME_SECONDARY_ACCOUNT_NUMBER)
  private DepositAccountAllOfAttributesSecondaryAccountNumber secondaryAccountNumber;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency = "USD";

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_OVERDRAFT_LIMIT = "overdraftLimit";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_LIMIT)
  private Integer overdraftLimit;

  public static final String SERIALIZED_NAME_HOLD = "hold";
  @SerializedName(SERIALIZED_NAME_HOLD)
  private Integer hold;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Integer available;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("Open"),
    
    CLOSED("Closed"),
    
    FROZEN("Frozen");

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

  /**
   * Gets or Sets closeReason
   */
  @JsonAdapter(CloseReasonEnum.Adapter.class)
  public enum CloseReasonEnum {
    BYCUSTOMER("ByCustomer"),
    
    FRAUD("Fraud");

    private String value;

    CloseReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CloseReasonEnum fromValue(String value) {
      for (CloseReasonEnum b : CloseReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CloseReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CloseReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CloseReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CloseReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CLOSE_REASON = "closeReason";
  @SerializedName(SERIALIZED_NAME_CLOSE_REASON)
  private CloseReasonEnum closeReason;

  /**
   * Gets or Sets fraudReason
   */
  @JsonAdapter(FraudReasonEnum.Adapter.class)
  public enum FraudReasonEnum {
    ACHACTIVITY("ACHActivity"),
    
    CARDACTIVITY("CardActivity"),
    
    CHECKACTIVITY("CheckActivity"),
    
    APPLICATIONHISTORY("ApplicationHistory"),
    
    ACCOUNTACTIVITY("AccountActivity"),
    
    CLIENTIDENTIFIED("ClientIdentified"),
    
    IDENTITYTHEFT("IdentityTheft"),
    
    LINKEDTOFRAUDULENTCUSTOMER("LinkedToFraudulentCustomer");

    private String value;

    FraudReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FraudReasonEnum fromValue(String value) {
      for (FraudReasonEnum b : FraudReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FraudReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FraudReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FraudReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FraudReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FRAUD_REASON = "fraudReason";
  @SerializedName(SERIALIZED_NAME_FRAUD_REASON)
  private FraudReasonEnum fraudReason;

  public static final String SERIALIZED_NAME_CLOSE_REASON_TEXT = "closeReasonText";
  @SerializedName(SERIALIZED_NAME_CLOSE_REASON_TEXT)
  private String closeReasonText;

  public static final String SERIALIZED_NAME_FREEZE_REASON = "freezeReason";
  @SerializedName(SERIALIZED_NAME_FREEZE_REASON)
  private String freezeReason;

  public static final String SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER = "maskedAccountNumber";
  @SerializedName(SERIALIZED_NAME_MASKED_ACCOUNT_NUMBER)
  private String maskedAccountNumber;

  public static final String SERIALIZED_NAME_IS_OVERDRAWN_WITHIN_LIMIT = "isOverdrawnWithinLimit";
  @SerializedName(SERIALIZED_NAME_IS_OVERDRAWN_WITHIN_LIMIT)
  private Boolean isOverdrawnWithinLimit;

  /**
   * Gets or Sets dacaStatus
   */
  @JsonAdapter(DacaStatusEnum.Adapter.class)
  public enum DacaStatusEnum {
    ACTIVATED("Activated"),
    
    ENTERED("Entered");

    private String value;

    DacaStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DacaStatusEnum fromValue(String value) {
      for (DacaStatusEnum b : DacaStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DacaStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DacaStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DacaStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DacaStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DACA_STATUS = "dacaStatus";
  @SerializedName(SERIALIZED_NAME_DACA_STATUS)
  private DacaStatusEnum dacaStatus;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public DepositAccountAllOfAttributes() {
  }

  public DepositAccountAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public DepositAccountAllOfAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DepositAccountAllOfAttributes depositProduct(String depositProduct) {
    
    this.depositProduct = depositProduct;
    return this;
  }

   /**
   * Get depositProduct
   * @return depositProduct
  **/
  @javax.annotation.Nonnull
  public String getDepositProduct() {
    return depositProduct;
  }


  public void setDepositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
  }


  public DepositAccountAllOfAttributes routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nonnull
  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public DepositAccountAllOfAttributes accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public DepositAccountAllOfAttributes secondaryAccountNumber(DepositAccountAllOfAttributesSecondaryAccountNumber secondaryAccountNumber) {
    
    this.secondaryAccountNumber = secondaryAccountNumber;
    return this;
  }

   /**
   * Get secondaryAccountNumber
   * @return secondaryAccountNumber
  **/
  @javax.annotation.Nullable
  public DepositAccountAllOfAttributesSecondaryAccountNumber getSecondaryAccountNumber() {
    return secondaryAccountNumber;
  }


  public void setSecondaryAccountNumber(DepositAccountAllOfAttributesSecondaryAccountNumber secondaryAccountNumber) {
    this.secondaryAccountNumber = secondaryAccountNumber;
  }


  public DepositAccountAllOfAttributes currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public DepositAccountAllOfAttributes balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public DepositAccountAllOfAttributes overdraftLimit(Integer overdraftLimit) {
    
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * minimum: 0
   * @return overdraftLimit
  **/
  @javax.annotation.Nullable
  public Integer getOverdraftLimit() {
    return overdraftLimit;
  }


  public void setOverdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }


  public DepositAccountAllOfAttributes hold(Integer hold) {
    
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @javax.annotation.Nonnull
  public Integer getHold() {
    return hold;
  }


  public void setHold(Integer hold) {
    this.hold = hold;
  }


  public DepositAccountAllOfAttributes available(Integer available) {
    
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @javax.annotation.Nonnull
  public Integer getAvailable() {
    return available;
  }


  public void setAvailable(Integer available) {
    this.available = available;
  }


  public DepositAccountAllOfAttributes tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }


  public DepositAccountAllOfAttributes status(StatusEnum status) {
    
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


  public DepositAccountAllOfAttributes closeReason(CloseReasonEnum closeReason) {
    
    this.closeReason = closeReason;
    return this;
  }

   /**
   * Get closeReason
   * @return closeReason
  **/
  @javax.annotation.Nullable
  public CloseReasonEnum getCloseReason() {
    return closeReason;
  }


  public void setCloseReason(CloseReasonEnum closeReason) {
    this.closeReason = closeReason;
  }


  public DepositAccountAllOfAttributes fraudReason(FraudReasonEnum fraudReason) {
    
    this.fraudReason = fraudReason;
    return this;
  }

   /**
   * Get fraudReason
   * @return fraudReason
  **/
  @javax.annotation.Nullable
  public FraudReasonEnum getFraudReason() {
    return fraudReason;
  }


  public void setFraudReason(FraudReasonEnum fraudReason) {
    this.fraudReason = fraudReason;
  }


  public DepositAccountAllOfAttributes closeReasonText(String closeReasonText) {
    
    this.closeReasonText = closeReasonText;
    return this;
  }

   /**
   * Get closeReasonText
   * @return closeReasonText
  **/
  @javax.annotation.Nullable
  public String getCloseReasonText() {
    return closeReasonText;
  }


  public void setCloseReasonText(String closeReasonText) {
    this.closeReasonText = closeReasonText;
  }


  public DepositAccountAllOfAttributes freezeReason(String freezeReason) {
    
    this.freezeReason = freezeReason;
    return this;
  }

   /**
   * Get freezeReason
   * @return freezeReason
  **/
  @javax.annotation.Nullable
  public String getFreezeReason() {
    return freezeReason;
  }


  public void setFreezeReason(String freezeReason) {
    this.freezeReason = freezeReason;
  }


  public DepositAccountAllOfAttributes maskedAccountNumber(String maskedAccountNumber) {
    
    this.maskedAccountNumber = maskedAccountNumber;
    return this;
  }

   /**
   * Get maskedAccountNumber
   * @return maskedAccountNumber
  **/
  @javax.annotation.Nullable
  public String getMaskedAccountNumber() {
    return maskedAccountNumber;
  }


  public void setMaskedAccountNumber(String maskedAccountNumber) {
    this.maskedAccountNumber = maskedAccountNumber;
  }


  public DepositAccountAllOfAttributes isOverdrawnWithinLimit(Boolean isOverdrawnWithinLimit) {
    
    this.isOverdrawnWithinLimit = isOverdrawnWithinLimit;
    return this;
  }

   /**
   * Get isOverdrawnWithinLimit
   * @return isOverdrawnWithinLimit
  **/
  @javax.annotation.Nullable
  public Boolean getIsOverdrawnWithinLimit() {
    return isOverdrawnWithinLimit;
  }


  public void setIsOverdrawnWithinLimit(Boolean isOverdrawnWithinLimit) {
    this.isOverdrawnWithinLimit = isOverdrawnWithinLimit;
  }


  public DepositAccountAllOfAttributes dacaStatus(DacaStatusEnum dacaStatus) {
    
    this.dacaStatus = dacaStatus;
    return this;
  }

   /**
   * Get dacaStatus
   * @return dacaStatus
  **/
  @javax.annotation.Nullable
  public DacaStatusEnum getDacaStatus() {
    return dacaStatus;
  }


  public void setDacaStatus(DacaStatusEnum dacaStatus) {
    this.dacaStatus = dacaStatus;
  }


  public DepositAccountAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountAllOfAttributes depositAccountAllOfAttributes = (DepositAccountAllOfAttributes) o;
    return Objects.equals(this.createdAt, depositAccountAllOfAttributes.createdAt) &&
        Objects.equals(this.name, depositAccountAllOfAttributes.name) &&
        Objects.equals(this.depositProduct, depositAccountAllOfAttributes.depositProduct) &&
        Objects.equals(this.routingNumber, depositAccountAllOfAttributes.routingNumber) &&
        Objects.equals(this.accountNumber, depositAccountAllOfAttributes.accountNumber) &&
        Objects.equals(this.secondaryAccountNumber, depositAccountAllOfAttributes.secondaryAccountNumber) &&
        Objects.equals(this.currency, depositAccountAllOfAttributes.currency) &&
        Objects.equals(this.balance, depositAccountAllOfAttributes.balance) &&
        Objects.equals(this.overdraftLimit, depositAccountAllOfAttributes.overdraftLimit) &&
        Objects.equals(this.hold, depositAccountAllOfAttributes.hold) &&
        Objects.equals(this.available, depositAccountAllOfAttributes.available) &&
        Objects.equals(this.tags, depositAccountAllOfAttributes.tags) &&
        Objects.equals(this.status, depositAccountAllOfAttributes.status) &&
        Objects.equals(this.closeReason, depositAccountAllOfAttributes.closeReason) &&
        Objects.equals(this.fraudReason, depositAccountAllOfAttributes.fraudReason) &&
        Objects.equals(this.closeReasonText, depositAccountAllOfAttributes.closeReasonText) &&
        Objects.equals(this.freezeReason, depositAccountAllOfAttributes.freezeReason) &&
        Objects.equals(this.maskedAccountNumber, depositAccountAllOfAttributes.maskedAccountNumber) &&
        Objects.equals(this.isOverdrawnWithinLimit, depositAccountAllOfAttributes.isOverdrawnWithinLimit) &&
        Objects.equals(this.dacaStatus, depositAccountAllOfAttributes.dacaStatus) &&
        Objects.equals(this.updatedAt, depositAccountAllOfAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, name, depositProduct, routingNumber, accountNumber, secondaryAccountNumber, currency, balance, overdraftLimit, hold, available, tags, status, closeReason, fraudReason, closeReasonText, freezeReason, maskedAccountNumber, isOverdrawnWithinLimit, dacaStatus, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    depositProduct: ").append(toIndentedString(depositProduct)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    secondaryAccountNumber: ").append(toIndentedString(secondaryAccountNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
    sb.append("    fraudReason: ").append(toIndentedString(fraudReason)).append("\n");
    sb.append("    closeReasonText: ").append(toIndentedString(closeReasonText)).append("\n");
    sb.append("    freezeReason: ").append(toIndentedString(freezeReason)).append("\n");
    sb.append("    maskedAccountNumber: ").append(toIndentedString(maskedAccountNumber)).append("\n");
    sb.append("    isOverdrawnWithinLimit: ").append(toIndentedString(isOverdrawnWithinLimit)).append("\n");
    sb.append("    dacaStatus: ").append(toIndentedString(dacaStatus)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("depositProduct");
    openapiFields.add("routingNumber");
    openapiFields.add("accountNumber");
    openapiFields.add("secondaryAccountNumber");
    openapiFields.add("currency");
    openapiFields.add("balance");
    openapiFields.add("overdraftLimit");
    openapiFields.add("hold");
    openapiFields.add("available");
    openapiFields.add("tags");
    openapiFields.add("status");
    openapiFields.add("closeReason");
    openapiFields.add("fraudReason");
    openapiFields.add("closeReasonText");
    openapiFields.add("freezeReason");
    openapiFields.add("maskedAccountNumber");
    openapiFields.add("isOverdrawnWithinLimit");
    openapiFields.add("dacaStatus");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("depositProduct");
    openapiRequiredFields.add("routingNumber");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("balance");
    openapiRequiredFields.add("hold");
    openapiRequiredFields.add("available");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DepositAccountAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DepositAccountAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositAccountAllOfAttributes is not found in the empty JSON string", DepositAccountAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DepositAccountAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DepositAccountAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DepositAccountAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("depositProduct").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `depositProduct` to be a primitive type in the JSON string but got `%s`", jsonObj.get("depositProduct").toString()));
      }
      if (!jsonObj.get("routingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routingNumber").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      // validate the optional field `secondaryAccountNumber`
      if (jsonObj.get("secondaryAccountNumber") != null && !jsonObj.get("secondaryAccountNumber").isJsonNull()) {
        DepositAccountAllOfAttributesSecondaryAccountNumber.validateJsonElement(jsonObj.get("secondaryAccountNumber"));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("closeReason") != null && !jsonObj.get("closeReason").isJsonNull()) && !jsonObj.get("closeReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closeReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closeReason").toString()));
      }
      if ((jsonObj.get("fraudReason") != null && !jsonObj.get("fraudReason").isJsonNull()) && !jsonObj.get("fraudReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fraudReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fraudReason").toString()));
      }
      if ((jsonObj.get("closeReasonText") != null && !jsonObj.get("closeReasonText").isJsonNull()) && !jsonObj.get("closeReasonText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `closeReasonText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("closeReasonText").toString()));
      }
      if ((jsonObj.get("freezeReason") != null && !jsonObj.get("freezeReason").isJsonNull()) && !jsonObj.get("freezeReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freezeReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freezeReason").toString()));
      }
      if ((jsonObj.get("maskedAccountNumber") != null && !jsonObj.get("maskedAccountNumber").isJsonNull()) && !jsonObj.get("maskedAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedAccountNumber").toString()));
      }
      if ((jsonObj.get("dacaStatus") != null && !jsonObj.get("dacaStatus").isJsonNull()) && !jsonObj.get("dacaStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dacaStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dacaStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepositAccountAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositAccountAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositAccountAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositAccountAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositAccountAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, DepositAccountAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DepositAccountAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DepositAccountAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositAccountAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to DepositAccountAllOfAttributes
  */
  public static DepositAccountAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositAccountAllOfAttributes.class);
  }

 /**
  * Convert an instance of DepositAccountAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

