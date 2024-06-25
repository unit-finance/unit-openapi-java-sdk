/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.5
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
import java.util.Arrays;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.AnnualIncome;
import unit.java.sdk.model.EvaluationParams;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Occupation;
import unit.java.sdk.model.Phone;
import unit.java.sdk.model.SourceOfIncome;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateBeneficialOwner
 */
@JsonPropertyOrder({
  CreateBeneficialOwner.JSON_PROPERTY_FULL_NAME,
  CreateBeneficialOwner.JSON_PROPERTY_EMAIL,
  CreateBeneficialOwner.JSON_PROPERTY_PHONE,
  CreateBeneficialOwner.JSON_PROPERTY_SSN,
  CreateBeneficialOwner.JSON_PROPERTY_PASSPORT,
  CreateBeneficialOwner.JSON_PROPERTY_NATIONALITY,
  CreateBeneficialOwner.JSON_PROPERTY_MATRICULA_CONSULAR,
  CreateBeneficialOwner.JSON_PROPERTY_ADDRESS,
  CreateBeneficialOwner.JSON_PROPERTY_DATE_OF_BIRTH,
  CreateBeneficialOwner.JSON_PROPERTY_PERCENTAGE,
  CreateBeneficialOwner.JSON_PROPERTY_EVALUATION_PARAMS,
  CreateBeneficialOwner.JSON_PROPERTY_OCCUPATION,
  CreateBeneficialOwner.JSON_PROPERTY_ANNUAL_INCOME,
  CreateBeneficialOwner.JSON_PROPERTY_SOURCE_OF_INCOME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBeneficialOwner {
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

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private Integer percentage;

  public static final String JSON_PROPERTY_EVALUATION_PARAMS = "evaluationParams";
  private EvaluationParams evaluationParams;

  public static final String JSON_PROPERTY_OCCUPATION = "occupation";
  private Occupation occupation;

  public static final String JSON_PROPERTY_ANNUAL_INCOME = "annualIncome";
  private AnnualIncome annualIncome;

  public static final String JSON_PROPERTY_SOURCE_OF_INCOME = "sourceOfIncome";
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FullName getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


  public CreateBeneficialOwner passport(String passport) {
    this.passport = passport;
    return this;
  }

   /**
   * Get passport
   * @return passport
  **/
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


  public CreateBeneficialOwner nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
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


  public CreateBeneficialOwner matriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
    return this;
  }

   /**
   * Get matriculaConsular
   * @return matriculaConsular
  **/
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


  public CreateBeneficialOwner address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


  public CreateBeneficialOwner evaluationParams(EvaluationParams evaluationParams) {
    this.evaluationParams = evaluationParams;
    return this;
  }

   /**
   * Get evaluationParams
   * @return evaluationParams
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EvaluationParams getEvaluationParams() {
    return evaluationParams;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATION_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


  public CreateBeneficialOwner annualIncome(AnnualIncome annualIncome) {
    this.annualIncome = annualIncome;
    return this;
  }

   /**
   * Get annualIncome
   * @return annualIncome
  **/
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


  public CreateBeneficialOwner sourceOfIncome(SourceOfIncome sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
    return this;
  }

   /**
   * Get sourceOfIncome
   * @return sourceOfIncome
  **/
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
   * Return true if this createBeneficialOwner object is equal to o.
   */
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

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(getFullName().toUrlQueryString(prefix + "fullName" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `ssn` to the URL query string
    if (getSsn() != null) {
      joiner.add(String.format("%sssn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `passport` to the URL query string
    if (getPassport() != null) {
      joiner.add(String.format("%spassport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassport()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `matriculaConsular` to the URL query string
    if (getMatriculaConsular() != null) {
      joiner.add(String.format("%smatriculaConsular%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMatriculaConsular()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `percentage` to the URL query string
    if (getPercentage() != null) {
      joiner.add(String.format("%spercentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPercentage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationParams` to the URL query string
    if (getEvaluationParams() != null) {
      joiner.add(getEvaluationParams().toUrlQueryString(prefix + "evaluationParams" + suffix));
    }

    // add `occupation` to the URL query string
    if (getOccupation() != null) {
      joiner.add(String.format("%soccupation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOccupation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `annualIncome` to the URL query string
    if (getAnnualIncome() != null) {
      joiner.add(String.format("%sannualIncome%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAnnualIncome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sourceOfIncome` to the URL query string
    if (getSourceOfIncome() != null) {
      joiner.add(String.format("%ssourceOfIncome%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceOfIncome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

