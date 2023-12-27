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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.FullName;
import org.openapitools.client.model.Phone;

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
 * Grantor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Grantor {
  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private FullName fullName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private Phone phone;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_PASSPORT = "passport";
  @SerializedName(SERIALIZED_NAME_PASSPORT)
  private String passport;

  public static final String SERIALIZED_NAME_MATRICULA_CONSULAR = "matriculaConsular";
  @SerializedName(SERIALIZED_NAME_MATRICULA_CONSULAR)
  private String matriculaConsular;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_EVALUATION_ID = "evaluationId";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ID)
  private String evaluationId;

  public static final String SERIALIZED_NAME_EVALUATION_FLAGS = "evaluationFlags";
  @SerializedName(SERIALIZED_NAME_EVALUATION_FLAGS)
  private List<String> evaluationFlags;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MASKED_S_S_N = "maskedSSN";
  @SerializedName(SERIALIZED_NAME_MASKED_S_S_N)
  private String maskedSSN;

  public Grantor() {
  }

  public Grantor fullName(FullName fullName) {
    
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


  public Grantor email(String email) {
    
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


  public Grantor phone(Phone phone) {
    
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


  public Grantor ssn(String ssn) {
    
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


  public Grantor passport(String passport) {
    
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


  public Grantor matriculaConsular(String matriculaConsular) {
    
    this.matriculaConsular = matriculaConsular;
    return this;
  }

   /**
   * Get matriculaConsular
   * @return matriculaConsular
  **/
  @javax.annotation.Nullable
  public String getMatriculaConsular() {
    return matriculaConsular;
  }


  public void setMatriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
  }


  public Grantor nationality(String nationality) {
    
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


  public Grantor address(Address address) {
    
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


  public Grantor dateOfBirth(LocalDate dateOfBirth) {
    
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


  public Grantor evaluationId(String evaluationId) {
    
    this.evaluationId = evaluationId;
    return this;
  }

   /**
   * Get evaluationId
   * @return evaluationId
  **/
  @javax.annotation.Nullable
  public String getEvaluationId() {
    return evaluationId;
  }


  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }


  public Grantor evaluationFlags(List<String> evaluationFlags) {
    
    this.evaluationFlags = evaluationFlags;
    return this;
  }

  public Grantor addEvaluationFlagsItem(String evaluationFlagsItem) {
    if (this.evaluationFlags == null) {
      this.evaluationFlags = new ArrayList<>();
    }
    this.evaluationFlags.add(evaluationFlagsItem);
    return this;
  }

   /**
   * Get evaluationFlags
   * @return evaluationFlags
  **/
  @javax.annotation.Nullable
  public List<String> getEvaluationFlags() {
    return evaluationFlags;
  }


  public void setEvaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
  }


  public Grantor status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Grantor maskedSSN(String maskedSSN) {
    
    this.maskedSSN = maskedSSN;
    return this;
  }

   /**
   * Get maskedSSN
   * @return maskedSSN
  **/
  @javax.annotation.Nullable
  public String getMaskedSSN() {
    return maskedSSN;
  }


  public void setMaskedSSN(String maskedSSN) {
    this.maskedSSN = maskedSSN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grantor grantor = (Grantor) o;
    return Objects.equals(this.fullName, grantor.fullName) &&
        Objects.equals(this.email, grantor.email) &&
        Objects.equals(this.phone, grantor.phone) &&
        Objects.equals(this.ssn, grantor.ssn) &&
        Objects.equals(this.passport, grantor.passport) &&
        Objects.equals(this.matriculaConsular, grantor.matriculaConsular) &&
        Objects.equals(this.nationality, grantor.nationality) &&
        Objects.equals(this.address, grantor.address) &&
        Objects.equals(this.dateOfBirth, grantor.dateOfBirth) &&
        Objects.equals(this.evaluationId, grantor.evaluationId) &&
        Objects.equals(this.evaluationFlags, grantor.evaluationFlags) &&
        Objects.equals(this.status, grantor.status) &&
        Objects.equals(this.maskedSSN, grantor.maskedSSN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, phone, ssn, passport, matriculaConsular, nationality, address, dateOfBirth, evaluationId, evaluationFlags, status, maskedSSN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grantor {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationFlags: ").append(toIndentedString(evaluationFlags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    maskedSSN: ").append(toIndentedString(maskedSSN)).append("\n");
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
    openapiFields.add("fullName");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("ssn");
    openapiFields.add("passport");
    openapiFields.add("matriculaConsular");
    openapiFields.add("nationality");
    openapiFields.add("address");
    openapiFields.add("dateOfBirth");
    openapiFields.add("evaluationId");
    openapiFields.add("evaluationFlags");
    openapiFields.add("status");
    openapiFields.add("maskedSSN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fullName");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("dateOfBirth");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Grantor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Grantor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Grantor is not found in the empty JSON string", Grantor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Grantor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Grantor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Grantor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `fullName`
      FullName.validateJsonElement(jsonObj.get("fullName"));
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the required field `phone`
      Phone.validateJsonElement(jsonObj.get("phone"));
      if ((jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      if ((jsonObj.get("passport") != null && !jsonObj.get("passport").isJsonNull()) && !jsonObj.get("passport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport").toString()));
      }
      if ((jsonObj.get("matriculaConsular") != null && !jsonObj.get("matriculaConsular").isJsonNull()) && !jsonObj.get("matriculaConsular").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matriculaConsular` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matriculaConsular").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      // validate the required field `address`
      Address.validateJsonElement(jsonObj.get("address"));
      if ((jsonObj.get("evaluationId") != null && !jsonObj.get("evaluationId").isJsonNull()) && !jsonObj.get("evaluationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evaluationId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("evaluationFlags") != null && !jsonObj.get("evaluationFlags").isJsonNull() && !jsonObj.get("evaluationFlags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluationFlags` to be an array in the JSON string but got `%s`", jsonObj.get("evaluationFlags").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("maskedSSN") != null && !jsonObj.get("maskedSSN").isJsonNull()) && !jsonObj.get("maskedSSN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedSSN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedSSN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Grantor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Grantor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Grantor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Grantor.class));

       return (TypeAdapter<T>) new TypeAdapter<Grantor>() {
           @Override
           public void write(JsonWriter out, Grantor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Grantor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Grantor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Grantor
  * @throws IOException if the JSON string is invalid with respect to Grantor
  */
  public static Grantor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Grantor.class);
  }

 /**
  * Convert an instance of Grantor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
