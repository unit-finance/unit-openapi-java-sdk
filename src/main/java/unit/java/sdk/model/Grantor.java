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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Grantor
 */
@JsonPropertyOrder({
  Grantor.JSON_PROPERTY_FULL_NAME,
  Grantor.JSON_PROPERTY_EMAIL,
  Grantor.JSON_PROPERTY_PHONE,
  Grantor.JSON_PROPERTY_SSN,
  Grantor.JSON_PROPERTY_PASSPORT,
  Grantor.JSON_PROPERTY_MATRICULA_CONSULAR,
  Grantor.JSON_PROPERTY_NATIONALITY,
  Grantor.JSON_PROPERTY_ADDRESS,
  Grantor.JSON_PROPERTY_DATE_OF_BIRTH,
  Grantor.JSON_PROPERTY_EVALUATION_ID,
  Grantor.JSON_PROPERTY_EVALUATION_FLAGS,
  Grantor.JSON_PROPERTY_STATUS,
  Grantor.JSON_PROPERTY_MASKED_S_S_N
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Grantor {
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

  public static final String JSON_PROPERTY_MATRICULA_CONSULAR = "matriculaConsular";
  private String matriculaConsular;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluationId";
  private String evaluationId;

  public static final String JSON_PROPERTY_EVALUATION_FLAGS = "evaluationFlags";
  private List<String> evaluationFlags;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_MASKED_S_S_N = "maskedSSN";
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


  public Grantor email(String email) {
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


  public Grantor phone(Phone phone) {
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


  public Grantor ssn(String ssn) {
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


  public Grantor passport(String passport) {
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


  public Grantor matriculaConsular(String matriculaConsular) {
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


  public Grantor nationality(String nationality) {
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


  public Grantor address(Address address) {
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


  public Grantor dateOfBirth(LocalDate dateOfBirth) {
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


  public Grantor evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

   /**
   * Get evaluationId
   * @return evaluationId
  **/
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


  public Grantor status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
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


  public Grantor maskedSSN(String maskedSSN) {
    this.maskedSSN = maskedSSN;
    return this;
  }

   /**
   * Get maskedSSN
   * @return maskedSSN
  **/
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


  /**
   * Return true if this grantor object is equal to o.
   */
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

    // add `matriculaConsular` to the URL query string
    if (getMatriculaConsular() != null) {
      joiner.add(String.format("%smatriculaConsular%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMatriculaConsular()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationId` to the URL query string
    if (getEvaluationId() != null) {
      joiner.add(String.format("%sevaluationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvaluationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationFlags` to the URL query string
    if (getEvaluationFlags() != null) {
      for (int i = 0; i < getEvaluationFlags().size(); i++) {
        joiner.add(String.format("%sevaluationFlags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getEvaluationFlags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maskedSSN` to the URL query string
    if (getMaskedSSN() != null) {
      joiner.add(String.format("%smaskedSSN%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaskedSSN()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

