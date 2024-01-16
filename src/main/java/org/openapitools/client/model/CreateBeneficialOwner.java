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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.AnnualIncome;
import org.openapitools.client.model.EvaluationParams;
import org.openapitools.client.model.FullName;
import org.openapitools.client.model.Occupation;
import org.openapitools.client.model.Phone;
import org.openapitools.client.model.SourceOfIncome;

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
 * CreateBeneficialOwner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBeneficialOwner {
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
  private Address address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Integer percentage;

  public static final String SERIALIZED_NAME_EVALUATION_PARAMS = "evaluationParams";
  @SerializedName(SERIALIZED_NAME_EVALUATION_PARAMS)
  private EvaluationParams evaluationParams;

  public static final String SERIALIZED_NAME_OCCUPATION = "occupation";
  @SerializedName(SERIALIZED_NAME_OCCUPATION)
  private Occupation occupation;

  public static final String SERIALIZED_NAME_ANNUAL_INCOME = "annualIncome";
  @SerializedName(SERIALIZED_NAME_ANNUAL_INCOME)
  private AnnualIncome annualIncome;

  public static final String SERIALIZED_NAME_SOURCE_OF_INCOME = "sourceOfIncome";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_INCOME)
  private SourceOfIncome sourceOfIncome;

  public CreateBeneficialOwner() {
  }

  public CreateBeneficialOwner fullName(FullName fullName) {
    
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


  public CreateBeneficialOwner email(String email) {
    
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


  public CreateBeneficialOwner phone(Phone phone) {
    
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


  public CreateBeneficialOwner ssn(String ssn) {
    
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


  public CreateBeneficialOwner passport(String passport) {
    
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


  public CreateBeneficialOwner nationality(String nationality) {
    
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


  public CreateBeneficialOwner matriculaConsular(String matriculaConsular) {
    
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


  public CreateBeneficialOwner address(Address address) {
    
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


  public CreateBeneficialOwner dateOfBirth(LocalDate dateOfBirth) {
    
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


  public CreateBeneficialOwner percentage(Integer percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * minimum: 0
   * maximum: 100
   * @return percentage
  **/
  @javax.annotation.Nullable
  public Integer getPercentage() {
    return percentage;
  }


  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }


  public CreateBeneficialOwner evaluationParams(EvaluationParams evaluationParams) {
    
    this.evaluationParams = evaluationParams;
    return this;
  }

   /**
   * Get evaluationParams
   * @return evaluationParams
  **/
  @javax.annotation.Nullable
  public EvaluationParams getEvaluationParams() {
    return evaluationParams;
  }


  public void setEvaluationParams(EvaluationParams evaluationParams) {
    this.evaluationParams = evaluationParams;
  }


  public CreateBeneficialOwner occupation(Occupation occupation) {
    
    this.occupation = occupation;
    return this;
  }

   /**
   * Get occupation
   * @return occupation
  **/
  @javax.annotation.Nullable
  public Occupation getOccupation() {
    return occupation;
  }


  public void setOccupation(Occupation occupation) {
    this.occupation = occupation;
  }


  public CreateBeneficialOwner annualIncome(AnnualIncome annualIncome) {
    
    this.annualIncome = annualIncome;
    return this;
  }

   /**
   * Get annualIncome
   * @return annualIncome
  **/
  @javax.annotation.Nullable
  public AnnualIncome getAnnualIncome() {
    return annualIncome;
  }


  public void setAnnualIncome(AnnualIncome annualIncome) {
    this.annualIncome = annualIncome;
  }


  public CreateBeneficialOwner sourceOfIncome(SourceOfIncome sourceOfIncome) {
    
    this.sourceOfIncome = sourceOfIncome;
    return this;
  }

   /**
   * Get sourceOfIncome
   * @return sourceOfIncome
  **/
  @javax.annotation.Nullable
  public SourceOfIncome getSourceOfIncome() {
    return sourceOfIncome;
  }


  public void setSourceOfIncome(SourceOfIncome sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBeneficialOwner createBeneficialOwner = (CreateBeneficialOwner) o;
    return Objects.equals(this.fullName, createBeneficialOwner.fullName) &&
        Objects.equals(this.email, createBeneficialOwner.email) &&
        Objects.equals(this.phone, createBeneficialOwner.phone) &&
        Objects.equals(this.ssn, createBeneficialOwner.ssn) &&
        Objects.equals(this.passport, createBeneficialOwner.passport) &&
        Objects.equals(this.nationality, createBeneficialOwner.nationality) &&
        Objects.equals(this.matriculaConsular, createBeneficialOwner.matriculaConsular) &&
        Objects.equals(this.address, createBeneficialOwner.address) &&
        Objects.equals(this.dateOfBirth, createBeneficialOwner.dateOfBirth) &&
        Objects.equals(this.percentage, createBeneficialOwner.percentage) &&
        Objects.equals(this.evaluationParams, createBeneficialOwner.evaluationParams) &&
        Objects.equals(this.occupation, createBeneficialOwner.occupation) &&
        Objects.equals(this.annualIncome, createBeneficialOwner.annualIncome) &&
        Objects.equals(this.sourceOfIncome, createBeneficialOwner.sourceOfIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, percentage, evaluationParams, occupation, annualIncome, sourceOfIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBeneficialOwner {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    evaluationParams: ").append(toIndentedString(evaluationParams)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    annualIncome: ").append(toIndentedString(annualIncome)).append("\n");
    sb.append("    sourceOfIncome: ").append(toIndentedString(sourceOfIncome)).append("\n");
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
    openapiFields.add("nationality");
    openapiFields.add("matriculaConsular");
    openapiFields.add("address");
    openapiFields.add("dateOfBirth");
    openapiFields.add("percentage");
    openapiFields.add("evaluationParams");
    openapiFields.add("occupation");
    openapiFields.add("annualIncome");
    openapiFields.add("sourceOfIncome");

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
  * @throws IOException if the JSON Element is invalid with respect to CreateBeneficialOwner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBeneficialOwner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBeneficialOwner is not found in the empty JSON string", CreateBeneficialOwner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBeneficialOwner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBeneficialOwner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBeneficialOwner.openapiRequiredFields) {
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
      if ((jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonNull()) && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      if ((jsonObj.get("matriculaConsular") != null && !jsonObj.get("matriculaConsular").isJsonNull()) && !jsonObj.get("matriculaConsular").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matriculaConsular` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matriculaConsular").toString()));
      }
      // validate the required field `address`
      Address.validateJsonElement(jsonObj.get("address"));
      // validate the optional field `evaluationParams`
      if (jsonObj.get("evaluationParams") != null && !jsonObj.get("evaluationParams").isJsonNull()) {
        EvaluationParams.validateJsonElement(jsonObj.get("evaluationParams"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBeneficialOwner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBeneficialOwner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBeneficialOwner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBeneficialOwner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBeneficialOwner>() {
           @Override
           public void write(JsonWriter out, CreateBeneficialOwner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBeneficialOwner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBeneficialOwner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBeneficialOwner
  * @throws IOException if the JSON string is invalid with respect to CreateBeneficialOwner
  */
  public static CreateBeneficialOwner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBeneficialOwner.class);
  }

 /**
  * Convert an instance of CreateBeneficialOwner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

