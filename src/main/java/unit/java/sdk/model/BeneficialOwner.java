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


package unit.java.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.AnnualIncome;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Occupation;
import unit.java.sdk.model.Phone;
import unit.java.sdk.model.SourceOfIncome;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * BeneficialOwner
 */
@JsonPropertyOrder({
  BeneficialOwner.JSON_PROPERTY_STATUS,
  BeneficialOwner.JSON_PROPERTY_FULL_NAME,
  BeneficialOwner.JSON_PROPERTY_EMAIL,
  BeneficialOwner.JSON_PROPERTY_PHONE,
  BeneficialOwner.JSON_PROPERTY_SSN,
  BeneficialOwner.JSON_PROPERTY_PASSPORT,
  BeneficialOwner.JSON_PROPERTY_NATIONALITY,
  BeneficialOwner.JSON_PROPERTY_MATRICULA_CONSULAR,
  BeneficialOwner.JSON_PROPERTY_ADDRESS,
  BeneficialOwner.JSON_PROPERTY_DATE_OF_BIRTH,
  BeneficialOwner.JSON_PROPERTY_EVALUATION_ID,
  BeneficialOwner.JSON_PROPERTY_PERCENTAGE,
  BeneficialOwner.JSON_PROPERTY_EVALUATION_FLAGS,
  BeneficialOwner.JSON_PROPERTY_MASKED_S_S_N,
  BeneficialOwner.JSON_PROPERTY_MASKED_PASSPORT,
  BeneficialOwner.JSON_PROPERTY_MASKED_MATRICULA_CONSULAR,
  BeneficialOwner.JSON_PROPERTY_ID_THEFT_SCORE,
  BeneficialOwner.JSON_PROPERTY_EVALUATION_CODES,
  BeneficialOwner.JSON_PROPERTY_OCCUPATION,
  BeneficialOwner.JSON_PROPERTY_ANNUAL_INCOME,
  BeneficialOwner.JSON_PROPERTY_SOURCE_OF_INCOME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class BeneficialOwner {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private FullName fullName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_SSN = "ssn";
  private String ssn;

  public static final String JSON_PROPERTY_PASSPORT = "passport";
  private String passport;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_MATRICULA_CONSULAR = "matriculaConsular";
  private String matriculaConsular;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluationId";
  private String evaluationId;

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private Integer percentage;

  public static final String JSON_PROPERTY_EVALUATION_FLAGS = "evaluationFlags";
  private List<String> evaluationFlags = new ArrayList<>();

  public static final String JSON_PROPERTY_MASKED_S_S_N = "maskedSSN";
  private String maskedSSN;

  public static final String JSON_PROPERTY_MASKED_PASSPORT = "maskedPassport";
  private String maskedPassport;

  public static final String JSON_PROPERTY_MASKED_MATRICULA_CONSULAR = "maskedMatriculaConsular";
  private String maskedMatriculaConsular;

  public static final String JSON_PROPERTY_ID_THEFT_SCORE = "idTheftScore";
  private Integer idTheftScore;

  public static final String JSON_PROPERTY_EVALUATION_CODES = "evaluationCodes";
  private List<String> evaluationCodes = new ArrayList<>();

  public static final String JSON_PROPERTY_OCCUPATION = "occupation";
  private Occupation occupation;

  public static final String JSON_PROPERTY_ANNUAL_INCOME = "annualIncome";
  private AnnualIncome annualIncome;

  public static final String JSON_PROPERTY_SOURCE_OF_INCOME = "sourceOfIncome";
  private SourceOfIncome sourceOfIncome;

  public BeneficialOwner() { 
  }

  public BeneficialOwner status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public BeneficialOwner fullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FullName getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(FullName fullName) {
    this.fullName = fullName;
  }


  public BeneficialOwner email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public BeneficialOwner phone(Phone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public BeneficialOwner ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSsn() {
    return ssn;
  }


  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public BeneficialOwner passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassport() {
    return passport;
  }


  @JsonProperty(JSON_PROPERTY_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassport(String passport) {
    this.passport = passport;
  }


  public BeneficialOwner nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNationality() {
    return nationality;
  }


  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public BeneficialOwner matriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
    return this;
  }

  /**
   * Get matriculaConsular
   * @return matriculaConsular
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MATRICULA_CONSULAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMatriculaConsular() {
    return matriculaConsular;
  }


  @JsonProperty(JSON_PROPERTY_MATRICULA_CONSULAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
  }


  public BeneficialOwner address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public BeneficialOwner dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public BeneficialOwner evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * Get evaluationId
   * @return evaluationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEvaluationId() {
    return evaluationId;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }


  public BeneficialOwner percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * minimum: 0
   * maximum: 100
   * @return percentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPercentage() {
    return percentage;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }


  public BeneficialOwner evaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
    return this;
  }

  public BeneficialOwner addEvaluationFlagsItem(String evaluationFlagsItem) {
    if (this.evaluationFlags == null) {
      this.evaluationFlags = new ArrayList<>();
    }
    this.evaluationFlags.add(evaluationFlagsItem);
    return this;
  }

  /**
   * Get evaluationFlags
   * @return evaluationFlags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEvaluationFlags() {
    return evaluationFlags;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATION_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
  }


  public BeneficialOwner maskedSSN(String maskedSSN) {
    this.maskedSSN = maskedSSN;
    return this;
  }

  /**
   * Get maskedSSN
   * @return maskedSSN
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASKED_S_S_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaskedSSN() {
    return maskedSSN;
  }


  @JsonProperty(JSON_PROPERTY_MASKED_S_S_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedSSN(String maskedSSN) {
    this.maskedSSN = maskedSSN;
  }


  public BeneficialOwner maskedPassport(String maskedPassport) {
    this.maskedPassport = maskedPassport;
    return this;
  }

  /**
   * Get maskedPassport
   * @return maskedPassport
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASKED_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaskedPassport() {
    return maskedPassport;
  }


  @JsonProperty(JSON_PROPERTY_MASKED_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedPassport(String maskedPassport) {
    this.maskedPassport = maskedPassport;
  }


  public BeneficialOwner maskedMatriculaConsular(String maskedMatriculaConsular) {
    this.maskedMatriculaConsular = maskedMatriculaConsular;
    return this;
  }

  /**
   * Get maskedMatriculaConsular
   * @return maskedMatriculaConsular
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASKED_MATRICULA_CONSULAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaskedMatriculaConsular() {
    return maskedMatriculaConsular;
  }


  @JsonProperty(JSON_PROPERTY_MASKED_MATRICULA_CONSULAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedMatriculaConsular(String maskedMatriculaConsular) {
    this.maskedMatriculaConsular = maskedMatriculaConsular;
  }


  public BeneficialOwner idTheftScore(Integer idTheftScore) {
    this.idTheftScore = idTheftScore;
    return this;
  }

  /**
   * Get idTheftScore
   * @return idTheftScore
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_THEFT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getIdTheftScore() {
    return idTheftScore;
  }


  @JsonProperty(JSON_PROPERTY_ID_THEFT_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdTheftScore(Integer idTheftScore) {
    this.idTheftScore = idTheftScore;
  }


  public BeneficialOwner evaluationCodes(List<String> evaluationCodes) {
    this.evaluationCodes = evaluationCodes;
    return this;
  }

  public BeneficialOwner addEvaluationCodesItem(String evaluationCodesItem) {
    if (this.evaluationCodes == null) {
      this.evaluationCodes = new ArrayList<>();
    }
    this.evaluationCodes.add(evaluationCodesItem);
    return this;
  }

  /**
   * Get evaluationCodes
   * @return evaluationCodes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEvaluationCodes() {
    return evaluationCodes;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATION_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvaluationCodes(List<String> evaluationCodes) {
    this.evaluationCodes = evaluationCodes;
  }


  public BeneficialOwner occupation(Occupation occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * Get occupation
   * @return occupation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCCUPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Occupation getOccupation() {
    return occupation;
  }


  @JsonProperty(JSON_PROPERTY_OCCUPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccupation(Occupation occupation) {
    this.occupation = occupation;
  }


  public BeneficialOwner annualIncome(AnnualIncome annualIncome) {
    this.annualIncome = annualIncome;
    return this;
  }

  /**
   * Get annualIncome
   * @return annualIncome
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNUAL_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnnualIncome getAnnualIncome() {
    return annualIncome;
  }


  @JsonProperty(JSON_PROPERTY_ANNUAL_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualIncome(AnnualIncome annualIncome) {
    this.annualIncome = annualIncome;
  }


  public BeneficialOwner sourceOfIncome(SourceOfIncome sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
    return this;
  }

  /**
   * Get sourceOfIncome
   * @return sourceOfIncome
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SourceOfIncome getSourceOfIncome() {
    return sourceOfIncome;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_OF_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceOfIncome(SourceOfIncome sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
  }


  /**
   * Return true if this BeneficialOwner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficialOwner beneficialOwner = (BeneficialOwner) o;
    return Objects.equals(this.status, beneficialOwner.status) &&
        Objects.equals(this.fullName, beneficialOwner.fullName) &&
        Objects.equals(this.email, beneficialOwner.email) &&
        Objects.equals(this.phone, beneficialOwner.phone) &&
        Objects.equals(this.ssn, beneficialOwner.ssn) &&
        Objects.equals(this.passport, beneficialOwner.passport) &&
        Objects.equals(this.nationality, beneficialOwner.nationality) &&
        Objects.equals(this.matriculaConsular, beneficialOwner.matriculaConsular) &&
        Objects.equals(this.address, beneficialOwner.address) &&
        Objects.equals(this.dateOfBirth, beneficialOwner.dateOfBirth) &&
        Objects.equals(this.evaluationId, beneficialOwner.evaluationId) &&
        Objects.equals(this.percentage, beneficialOwner.percentage) &&
        Objects.equals(this.evaluationFlags, beneficialOwner.evaluationFlags) &&
        Objects.equals(this.maskedSSN, beneficialOwner.maskedSSN) &&
        Objects.equals(this.maskedPassport, beneficialOwner.maskedPassport) &&
        Objects.equals(this.maskedMatriculaConsular, beneficialOwner.maskedMatriculaConsular) &&
        Objects.equals(this.idTheftScore, beneficialOwner.idTheftScore) &&
        Objects.equals(this.evaluationCodes, beneficialOwner.evaluationCodes) &&
        Objects.equals(this.occupation, beneficialOwner.occupation) &&
        Objects.equals(this.annualIncome, beneficialOwner.annualIncome) &&
        Objects.equals(this.sourceOfIncome, beneficialOwner.sourceOfIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, evaluationId, percentage, evaluationFlags, maskedSSN, maskedPassport, maskedMatriculaConsular, idTheftScore, evaluationCodes, occupation, annualIncome, sourceOfIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficialOwner {\n");
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
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    evaluationFlags: ").append(toIndentedString(evaluationFlags)).append("\n");
    sb.append("    maskedSSN: ").append(toIndentedString(maskedSSN)).append("\n");
    sb.append("    maskedPassport: ").append(toIndentedString(maskedPassport)).append("\n");
    sb.append("    maskedMatriculaConsular: ").append(toIndentedString(maskedMatriculaConsular)).append("\n");
    sb.append("    idTheftScore: ").append(toIndentedString(idTheftScore)).append("\n");
    sb.append("    evaluationCodes: ").append(toIndentedString(evaluationCodes)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(getFullName().toUrlQueryString(prefix + "fullName" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `ssn` to the URL query string
    if (getSsn() != null) {
      joiner.add(String.format("%sssn%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSsn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `passport` to the URL query string
    if (getPassport() != null) {
      joiner.add(String.format("%spassport%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPassport()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `matriculaConsular` to the URL query string
    if (getMatriculaConsular() != null) {
      joiner.add(String.format("%smatriculaConsular%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMatriculaConsular()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationId` to the URL query string
    if (getEvaluationId() != null) {
      joiner.add(String.format("%sevaluationId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEvaluationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `percentage` to the URL query string
    if (getPercentage() != null) {
      joiner.add(String.format("%spercentage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPercentage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationFlags` to the URL query string
    if (getEvaluationFlags() != null) {
      for (int i = 0; i < getEvaluationFlags().size(); i++) {
        joiner.add(String.format("%sevaluationFlags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getEvaluationFlags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `maskedSSN` to the URL query string
    if (getMaskedSSN() != null) {
      joiner.add(String.format("%smaskedSSN%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMaskedSSN()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maskedPassport` to the URL query string
    if (getMaskedPassport() != null) {
      joiner.add(String.format("%smaskedPassport%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMaskedPassport()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maskedMatriculaConsular` to the URL query string
    if (getMaskedMatriculaConsular() != null) {
      joiner.add(String.format("%smaskedMatriculaConsular%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMaskedMatriculaConsular()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `idTheftScore` to the URL query string
    if (getIdTheftScore() != null) {
      joiner.add(String.format("%sidTheftScore%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdTheftScore()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationCodes` to the URL query string
    if (getEvaluationCodes() != null) {
      for (int i = 0; i < getEvaluationCodes().size(); i++) {
        joiner.add(String.format("%sevaluationCodes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getEvaluationCodes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `occupation` to the URL query string
    if (getOccupation() != null) {
      joiner.add(String.format("%soccupation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOccupation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `annualIncome` to the URL query string
    if (getAnnualIncome() != null) {
      joiner.add(String.format("%sannualIncome%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAnnualIncome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sourceOfIncome` to the URL query string
    if (getSourceOfIncome() != null) {
      joiner.add(String.format("%ssourceOfIncome%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSourceOfIncome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

