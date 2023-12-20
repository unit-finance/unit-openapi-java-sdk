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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.FullName;
import org.openapitools.client.model.Phone;
import org.openapitools.client.model.VirtualCardStatus;

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
 * BusinessVirtualDebitCardAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessVirtualDebitCardAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LAST4_DIGITS = "last4Digits";
  @SerializedName(SERIALIZED_NAME_LAST4_DIGITS)
  private String last4Digits;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private FullName fullName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private Phone phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_PASSPORT = "passport";
  @SerializedName(SERIALIZED_NAME_PASSPORT)
  private String passport;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private VirtualCardStatus status;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_FREEZE_REASON = "freezeReason";
  @SerializedName(SERIALIZED_NAME_FREEZE_REASON)
  private String freezeReason;

  public BusinessVirtualDebitCardAllOfAttributes() {
  }

  public BusinessVirtualDebitCardAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
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


  public BusinessVirtualDebitCardAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    
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


  public BusinessVirtualDebitCardAllOfAttributes last4Digits(String last4Digits) {
    
    this.last4Digits = last4Digits;
    return this;
  }

   /**
   * Get last4Digits
   * @return last4Digits
  **/
  @javax.annotation.Nonnull
  public String getLast4Digits() {
    return last4Digits;
  }


  public void setLast4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
  }


  public BusinessVirtualDebitCardAllOfAttributes expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nonnull
  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public BusinessVirtualDebitCardAllOfAttributes address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public BusinessVirtualDebitCardAllOfAttributes fullName(FullName fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nonnull
  public FullName getFullName() {
    return fullName;
  }


  public void setFullName(FullName fullName) {
    this.fullName = fullName;
  }


  public BusinessVirtualDebitCardAllOfAttributes phone(Phone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nonnull
  public Phone getPhone() {
    return phone;
  }


  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public BusinessVirtualDebitCardAllOfAttributes email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public BusinessVirtualDebitCardAllOfAttributes dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nonnull
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public BusinessVirtualDebitCardAllOfAttributes nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public BusinessVirtualDebitCardAllOfAttributes ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @javax.annotation.Nullable
  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public BusinessVirtualDebitCardAllOfAttributes passport(String passport) {
    
    this.passport = passport;
    return this;
  }

   /**
   * Get passport
   * @return passport
  **/
  @javax.annotation.Nullable
  public String getPassport() {
    return passport;
  }


  public void setPassport(String passport) {
    this.passport = passport;
  }


  public BusinessVirtualDebitCardAllOfAttributes bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * Get bin
   * @return bin
  **/
  @javax.annotation.Nullable
  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public BusinessVirtualDebitCardAllOfAttributes status(VirtualCardStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public VirtualCardStatus getStatus() {
    return status;
  }


  public void setStatus(VirtualCardStatus status) {
    this.status = status;
  }


  public BusinessVirtualDebitCardAllOfAttributes tags(Object tags) {
    
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


  public BusinessVirtualDebitCardAllOfAttributes freezeReason(String freezeReason) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessVirtualDebitCardAllOfAttributes businessVirtualDebitCardAllOfAttributes = (BusinessVirtualDebitCardAllOfAttributes) o;
    return Objects.equals(this.createdAt, businessVirtualDebitCardAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, businessVirtualDebitCardAllOfAttributes.updatedAt) &&
        Objects.equals(this.last4Digits, businessVirtualDebitCardAllOfAttributes.last4Digits) &&
        Objects.equals(this.expirationDate, businessVirtualDebitCardAllOfAttributes.expirationDate) &&
        Objects.equals(this.address, businessVirtualDebitCardAllOfAttributes.address) &&
        Objects.equals(this.fullName, businessVirtualDebitCardAllOfAttributes.fullName) &&
        Objects.equals(this.phone, businessVirtualDebitCardAllOfAttributes.phone) &&
        Objects.equals(this.email, businessVirtualDebitCardAllOfAttributes.email) &&
        Objects.equals(this.dateOfBirth, businessVirtualDebitCardAllOfAttributes.dateOfBirth) &&
        Objects.equals(this.nationality, businessVirtualDebitCardAllOfAttributes.nationality) &&
        Objects.equals(this.ssn, businessVirtualDebitCardAllOfAttributes.ssn) &&
        Objects.equals(this.passport, businessVirtualDebitCardAllOfAttributes.passport) &&
        Objects.equals(this.bin, businessVirtualDebitCardAllOfAttributes.bin) &&
        Objects.equals(this.status, businessVirtualDebitCardAllOfAttributes.status) &&
        Objects.equals(this.tags, businessVirtualDebitCardAllOfAttributes.tags) &&
        Objects.equals(this.freezeReason, businessVirtualDebitCardAllOfAttributes.freezeReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, last4Digits, expirationDate, address, fullName, phone, email, dateOfBirth, nationality, ssn, passport, bin, status, tags, freezeReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessVirtualDebitCardAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    freezeReason: ").append(toIndentedString(freezeReason)).append("\n");
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
    openapiFields.add("last4Digits");
    openapiFields.add("expirationDate");
    openapiFields.add("address");
    openapiFields.add("fullName");
    openapiFields.add("phone");
    openapiFields.add("email");
    openapiFields.add("dateOfBirth");
    openapiFields.add("nationality");
    openapiFields.add("ssn");
    openapiFields.add("passport");
    openapiFields.add("bin");
    openapiFields.add("status");
    openapiFields.add("tags");
    openapiFields.add("freezeReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("last4Digits");
    openapiRequiredFields.add("expirationDate");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("fullName");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("dateOfBirth");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BusinessVirtualDebitCardAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessVirtualDebitCardAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessVirtualDebitCardAllOfAttributes is not found in the empty JSON string", BusinessVirtualDebitCardAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BusinessVirtualDebitCardAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessVirtualDebitCardAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessVirtualDebitCardAllOfAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("last4Digits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last4Digits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last4Digits").toString()));
      }
      if (!jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      // validate the required field `address`
      Address.validateJsonElement(jsonObj.get("address"));
      // validate the required field `fullName`
      FullName.validateJsonElement(jsonObj.get("fullName"));
      // validate the required field `phone`
      Phone.validateJsonElement(jsonObj.get("phone"));
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      if ((jsonObj.get("passport") != null && !jsonObj.get("passport").isJsonNull()) && !jsonObj.get("passport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport").toString()));
      }
      if ((jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonNull()) && !jsonObj.get("bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      if ((jsonObj.get("freezeReason") != null && !jsonObj.get("freezeReason").isJsonNull()) && !jsonObj.get("freezeReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freezeReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freezeReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessVirtualDebitCardAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessVirtualDebitCardAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessVirtualDebitCardAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessVirtualDebitCardAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessVirtualDebitCardAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, BusinessVirtualDebitCardAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessVirtualDebitCardAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessVirtualDebitCardAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessVirtualDebitCardAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to BusinessVirtualDebitCardAllOfAttributes
  */
  public static BusinessVirtualDebitCardAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessVirtualDebitCardAllOfAttributes.class);
  }

 /**
  * Convert an instance of BusinessVirtualDebitCardAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

