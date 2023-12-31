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
 * PowerOfAttorneyAgent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PowerOfAttorneyAgent {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

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

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_MATRICULA_CONSULAR = "matriculaConsular";
  @SerializedName(SERIALIZED_NAME_MATRICULA_CONSULAR)
  private String matriculaConsular;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Object address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_EVALUATION_ID = "evaluationId";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ID)
  private String evaluationId;

  public static final String SERIALIZED_NAME_EVALUATION_FLAGS = "evaluationFlags";
  @SerializedName(SERIALIZED_NAME_EVALUATION_FLAGS)
  private List<String> evaluationFlags;

  public static final String SERIALIZED_NAME_MASKED_S_S_N = "maskedSSN";
  @SerializedName(SERIALIZED_NAME_MASKED_S_S_N)
  private String maskedSSN;

  public static final String SERIALIZED_NAME_MASKED_PASSPORT = "maskedPassport";
  @SerializedName(SERIALIZED_NAME_MASKED_PASSPORT)
  private String maskedPassport;

  public static final String SERIALIZED_NAME_MASKED_MATRICULA_CONSULAR = "maskedMatriculaConsular";
  @SerializedName(SERIALIZED_NAME_MASKED_MATRICULA_CONSULAR)
  private String maskedMatriculaConsular;

  public static final String SERIALIZED_NAME_ID_THEFT_SCORE = "idTheftScore";
  @SerializedName(SERIALIZED_NAME_ID_THEFT_SCORE)
  private Integer idTheftScore;

  public PowerOfAttorneyAgent() {
  }

  public PowerOfAttorneyAgent status(String status) {
    
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


  public PowerOfAttorneyAgent fullName(FullName fullName) {
    
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


  public PowerOfAttorneyAgent email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PowerOfAttorneyAgent phone(Phone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public Phone getPhone() {
    return phone;
  }


  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public PowerOfAttorneyAgent ssn(String ssn) {
    
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


  public PowerOfAttorneyAgent passport(String passport) {
    
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


  public PowerOfAttorneyAgent nationality(String nationality) {
    
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


  public PowerOfAttorneyAgent matriculaConsular(String matriculaConsular) {
    
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


  public PowerOfAttorneyAgent address(Object address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Object getAddress() {
    return address;
  }


  public void setAddress(Object address) {
    this.address = address;
  }


  public PowerOfAttorneyAgent dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PowerOfAttorneyAgent evaluationId(String evaluationId) {
    
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


  public PowerOfAttorneyAgent evaluationFlags(List<String> evaluationFlags) {
    
    this.evaluationFlags = evaluationFlags;
    return this;
  }

  public PowerOfAttorneyAgent addEvaluationFlagsItem(String evaluationFlagsItem) {
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


  public PowerOfAttorneyAgent maskedSSN(String maskedSSN) {
    
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


  public PowerOfAttorneyAgent maskedPassport(String maskedPassport) {
    
    this.maskedPassport = maskedPassport;
    return this;
  }

   /**
   * Get maskedPassport
   * @return maskedPassport
  **/
  @javax.annotation.Nullable
  public String getMaskedPassport() {
    return maskedPassport;
  }


  public void setMaskedPassport(String maskedPassport) {
    this.maskedPassport = maskedPassport;
  }


  public PowerOfAttorneyAgent maskedMatriculaConsular(String maskedMatriculaConsular) {
    
    this.maskedMatriculaConsular = maskedMatriculaConsular;
    return this;
  }

   /**
   * Get maskedMatriculaConsular
   * @return maskedMatriculaConsular
  **/
  @javax.annotation.Nullable
  public String getMaskedMatriculaConsular() {
    return maskedMatriculaConsular;
  }


  public void setMaskedMatriculaConsular(String maskedMatriculaConsular) {
    this.maskedMatriculaConsular = maskedMatriculaConsular;
  }


  public PowerOfAttorneyAgent idTheftScore(Integer idTheftScore) {
    
    this.idTheftScore = idTheftScore;
    return this;
  }

   /**
   * Get idTheftScore
   * @return idTheftScore
  **/
  @javax.annotation.Nullable
  public Integer getIdTheftScore() {
    return idTheftScore;
  }


  public void setIdTheftScore(Integer idTheftScore) {
    this.idTheftScore = idTheftScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerOfAttorneyAgent powerOfAttorneyAgent = (PowerOfAttorneyAgent) o;
    return Objects.equals(this.status, powerOfAttorneyAgent.status) &&
        Objects.equals(this.fullName, powerOfAttorneyAgent.fullName) &&
        Objects.equals(this.email, powerOfAttorneyAgent.email) &&
        Objects.equals(this.phone, powerOfAttorneyAgent.phone) &&
        Objects.equals(this.ssn, powerOfAttorneyAgent.ssn) &&
        Objects.equals(this.passport, powerOfAttorneyAgent.passport) &&
        Objects.equals(this.nationality, powerOfAttorneyAgent.nationality) &&
        Objects.equals(this.matriculaConsular, powerOfAttorneyAgent.matriculaConsular) &&
        Objects.equals(this.address, powerOfAttorneyAgent.address) &&
        Objects.equals(this.dateOfBirth, powerOfAttorneyAgent.dateOfBirth) &&
        Objects.equals(this.evaluationId, powerOfAttorneyAgent.evaluationId) &&
        Objects.equals(this.evaluationFlags, powerOfAttorneyAgent.evaluationFlags) &&
        Objects.equals(this.maskedSSN, powerOfAttorneyAgent.maskedSSN) &&
        Objects.equals(this.maskedPassport, powerOfAttorneyAgent.maskedPassport) &&
        Objects.equals(this.maskedMatriculaConsular, powerOfAttorneyAgent.maskedMatriculaConsular) &&
        Objects.equals(this.idTheftScore, powerOfAttorneyAgent.idTheftScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, evaluationId, evaluationFlags, maskedSSN, maskedPassport, maskedMatriculaConsular, idTheftScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerOfAttorneyAgent {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationFlags: ").append(toIndentedString(evaluationFlags)).append("\n");
    sb.append("    maskedSSN: ").append(toIndentedString(maskedSSN)).append("\n");
    sb.append("    maskedPassport: ").append(toIndentedString(maskedPassport)).append("\n");
    sb.append("    maskedMatriculaConsular: ").append(toIndentedString(maskedMatriculaConsular)).append("\n");
    sb.append("    idTheftScore: ").append(toIndentedString(idTheftScore)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("fullName");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("ssn");
    openapiFields.add("passport");
    openapiFields.add("nationality");
    openapiFields.add("matriculaConsular");
    openapiFields.add("address");
    openapiFields.add("dateOfBirth");
    openapiFields.add("evaluationId");
    openapiFields.add("evaluationFlags");
    openapiFields.add("maskedSSN");
    openapiFields.add("maskedPassport");
    openapiFields.add("maskedMatriculaConsular");
    openapiFields.add("idTheftScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("fullName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PowerOfAttorneyAgent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PowerOfAttorneyAgent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PowerOfAttorneyAgent is not found in the empty JSON string", PowerOfAttorneyAgent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PowerOfAttorneyAgent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PowerOfAttorneyAgent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PowerOfAttorneyAgent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `fullName`
      FullName.validateJsonElement(jsonObj.get("fullName"));
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `phone`
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) {
        Phone.validateJsonElement(jsonObj.get("phone"));
      }
      if ((jsonObj.get("ssn") != null && !jsonObj.get("ssn").isJsonNull()) && !jsonObj.get("ssn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssn").toString()));
      }
      if ((jsonObj.get("passport") != null && !jsonObj.get("passport").isJsonNull()) && !jsonObj.get("passport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport").toString()));
      }
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("matriculaConsular") != null && !jsonObj.get("matriculaConsular").isJsonNull()) && !jsonObj.get("matriculaConsular").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matriculaConsular` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matriculaConsular").toString()));
      }
      if ((jsonObj.get("evaluationId") != null && !jsonObj.get("evaluationId").isJsonNull()) && !jsonObj.get("evaluationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evaluationId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("evaluationFlags") != null && !jsonObj.get("evaluationFlags").isJsonNull() && !jsonObj.get("evaluationFlags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluationFlags` to be an array in the JSON string but got `%s`", jsonObj.get("evaluationFlags").toString()));
      }
      if ((jsonObj.get("maskedSSN") != null && !jsonObj.get("maskedSSN").isJsonNull()) && !jsonObj.get("maskedSSN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedSSN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedSSN").toString()));
      }
      if ((jsonObj.get("maskedPassport") != null && !jsonObj.get("maskedPassport").isJsonNull()) && !jsonObj.get("maskedPassport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedPassport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedPassport").toString()));
      }
      if ((jsonObj.get("maskedMatriculaConsular") != null && !jsonObj.get("maskedMatriculaConsular").isJsonNull()) && !jsonObj.get("maskedMatriculaConsular").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedMatriculaConsular` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedMatriculaConsular").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PowerOfAttorneyAgent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PowerOfAttorneyAgent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PowerOfAttorneyAgent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PowerOfAttorneyAgent.class));

       return (TypeAdapter<T>) new TypeAdapter<PowerOfAttorneyAgent>() {
           @Override
           public void write(JsonWriter out, PowerOfAttorneyAgent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PowerOfAttorneyAgent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PowerOfAttorneyAgent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PowerOfAttorneyAgent
  * @throws IOException if the JSON string is invalid with respect to PowerOfAttorneyAgent
  */
  public static PowerOfAttorneyAgent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PowerOfAttorneyAgent.class);
  }

 /**
  * Convert an instance of PowerOfAttorneyAgent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

