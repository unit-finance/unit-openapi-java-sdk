/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.1.0
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
 * CreateOfficer
 */
@JsonPropertyOrder({
  CreateOfficer.JSON_PROPERTY_FULL_NAME,
  CreateOfficer.JSON_PROPERTY_EMAIL,
  CreateOfficer.JSON_PROPERTY_PHONE,
  CreateOfficer.JSON_PROPERTY_SSN,
  CreateOfficer.JSON_PROPERTY_PASSPORT,
  CreateOfficer.JSON_PROPERTY_NATIONALITY,
  CreateOfficer.JSON_PROPERTY_MATRICULA_CONSULAR,
  CreateOfficer.JSON_PROPERTY_ADDRESS,
  CreateOfficer.JSON_PROPERTY_DATE_OF_BIRTH,
  CreateOfficer.JSON_PROPERTY_TITLE,
  CreateOfficer.JSON_PROPERTY_EVALUATION_PARAMS,
  CreateOfficer.JSON_PROPERTY_OCCUPATION,
  CreateOfficer.JSON_PROPERTY_ANNUAL_INCOME,
  CreateOfficer.JSON_PROPERTY_SOURCE_OF_INCOME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class CreateOfficer {
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

  /**
   * Gets or Sets title
   */
  public enum TitleEnum {
    PRESIDENT("President"),
    
    CEO("CEO"),
    
    COO("COO"),
    
    CFO("CFO"),
    
    BENEFITSADMINISTRATIONOFFICER("BenefitsAdministrationOfficer"),
    
    CIO("CIO"),
    
    VP("VP"),
    
    AVP("AVP"),
    
    TREASURER("Treasurer"),
    
    SECRETARY("Secretary"),
    
    CONTROLLER("Controller"),
    
    MANAGER("Manager"),
    
    PARTNER("Partner"),
    
    MEMBER("Member");

    private String value;

    TitleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TitleEnum fromValue(String value) {
      for (TitleEnum b : TitleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TITLE = "title";
  private TitleEnum title;

  public static final String JSON_PROPERTY_EVALUATION_PARAMS = "EvaluationParams";
  private EvaluationParams evaluationParams;

  public static final String JSON_PROPERTY_OCCUPATION = "occupation";
  private Occupation occupation;

  public static final String JSON_PROPERTY_ANNUAL_INCOME = "annualIncome";
  private AnnualIncome annualIncome;

  public static final String JSON_PROPERTY_SOURCE_OF_INCOME = "sourceOfIncome";
  private SourceOfIncome sourceOfIncome;

  public CreateOfficer() { 
  }

  public CreateOfficer fullName(FullName fullName) {
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


  public CreateOfficer email(String email) {
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


  public CreateOfficer phone(Phone phone) {
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


  public CreateOfficer ssn(String ssn) {
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


  public CreateOfficer passport(String passport) {
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


  public CreateOfficer nationality(String nationality) {
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


  public CreateOfficer matriculaConsular(String matriculaConsular) {
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


  public CreateOfficer address(Address address) {
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


  public CreateOfficer dateOfBirth(LocalDate dateOfBirth) {
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


  public CreateOfficer title(TitleEnum title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TitleEnum getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(TitleEnum title) {
    this.title = title;
  }


  public CreateOfficer evaluationParams(EvaluationParams evaluationParams) {
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


  public CreateOfficer occupation(Occupation occupation) {
    this.occupation = occupation;
    return this;
  }

   /**
   * Get occupation
   * @return occupation
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OCCUPATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Occupation getOccupation() {
    return occupation;
  }


  @JsonProperty(JSON_PROPERTY_OCCUPATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOccupation(Occupation occupation) {
    this.occupation = occupation;
  }


  public CreateOfficer annualIncome(AnnualIncome annualIncome) {
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


  public CreateOfficer sourceOfIncome(SourceOfIncome sourceOfIncome) {
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
   * Return true if this CreateOfficer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOfficer createOfficer = (CreateOfficer) o;
    return Objects.equals(this.fullName, createOfficer.fullName) &&
        Objects.equals(this.email, createOfficer.email) &&
        Objects.equals(this.phone, createOfficer.phone) &&
        Objects.equals(this.ssn, createOfficer.ssn) &&
        Objects.equals(this.passport, createOfficer.passport) &&
        Objects.equals(this.nationality, createOfficer.nationality) &&
        Objects.equals(this.matriculaConsular, createOfficer.matriculaConsular) &&
        Objects.equals(this.address, createOfficer.address) &&
        Objects.equals(this.dateOfBirth, createOfficer.dateOfBirth) &&
        Objects.equals(this.title, createOfficer.title) &&
        Objects.equals(this.evaluationParams, createOfficer.evaluationParams) &&
        Objects.equals(this.occupation, createOfficer.occupation) &&
        Objects.equals(this.annualIncome, createOfficer.annualIncome) &&
        Objects.equals(this.sourceOfIncome, createOfficer.sourceOfIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, title, evaluationParams, occupation, annualIncome, sourceOfIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOfficer {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `EvaluationParams` to the URL query string
    if (getEvaluationParams() != null) {
      joiner.add(getEvaluationParams().toUrlQueryString(prefix + "EvaluationParams" + suffix));
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

