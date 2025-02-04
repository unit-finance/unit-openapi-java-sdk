/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.1
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.AuthorizedUser;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * IndividualCustomerAllOfAttributes
 */
@JsonPropertyOrder({
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_FULL_NAME,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_EMAIL,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_PHONE,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_SSN,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_PASSPORT,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_NATIONALITY,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_MATRICULA_CONSULAR,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_ADDRESS,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_DATE_OF_BIRTH,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_EIN,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_DBA,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_SOLE_PROPRIETORSHIP,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_TAGS,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_RISK_RATE,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_MASKED_S_S_N,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_MASKED_PASSPORT,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_MASKED_MATRICULA_CONSULAR,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_AUTHORIZED_USERS,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_JWT_SUBJECT,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_STATUS,
  IndividualCustomerAllOfAttributes.JSON_PROPERTY_ARCHIVE_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class IndividualCustomerAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

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

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_DBA = "dba";
  private String dba;

  public static final String JSON_PROPERTY_SOLE_PROPRIETORSHIP = "soleProprietorship";
  private Boolean soleProprietorship = false;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  /**
   * Gets or Sets riskRate
   */
  public enum RiskRateEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    RiskRateEnum(String value) {
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
    public static RiskRateEnum fromValue(String value) {
      for (RiskRateEnum b : RiskRateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RISK_RATE = "riskRate";
  private RiskRateEnum riskRate;

  public static final String JSON_PROPERTY_MASKED_S_S_N = "maskedSSN";
  private String maskedSSN;

  public static final String JSON_PROPERTY_MASKED_PASSPORT = "maskedPassport";
  private String maskedPassport;

  public static final String JSON_PROPERTY_MASKED_MATRICULA_CONSULAR = "maskedMatriculaConsular";
  private String maskedMatriculaConsular;

  public static final String JSON_PROPERTY_AUTHORIZED_USERS = "authorizedUsers";
  private List<AuthorizedUser> authorizedUsers = new ArrayList<>();

  public static final String JSON_PROPERTY_JWT_SUBJECT = "jwtSubject";
  private JsonNullable<String> jwtSubject = JsonNullable.<String>undefined();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    ARCHIVED("Archived");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * Gets or Sets archiveReason
   */
  public enum ArchiveReasonEnum {
    INACTIVE("Inactive"),
    
    FRAUD_ACH_ACTIVITY("FraudACHActivity"),
    
    FRAUD_CARD_ACTIVITY("FraudCardActivity"),
    
    FRAUD_CHECK_ACTIVITY("FraudCheckActivity"),
    
    FRAUD_APPLICATION_HISTORY("FraudApplicationHistory"),
    
    FRAUD_ACCOUNT_ACTIVITY("FraudAccountActivity"),
    
    FRAUD_CLIENT_IDENTIFIED("FraudClientIdentified"),
    
    FRAUD_LINKED_TO_FRAUDULENT_CUSTOMER("FraudLinkedToFraudulentCustomer");

    private String value;

    ArchiveReasonEnum(String value) {
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
    public static ArchiveReasonEnum fromValue(String value) {
      for (ArchiveReasonEnum b : ArchiveReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ARCHIVE_REASON = "archiveReason";
  private ArchiveReasonEnum archiveReason;

  public IndividualCustomerAllOfAttributes() { 
  }

  public IndividualCustomerAllOfAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public IndividualCustomerAllOfAttributes fullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
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


  public IndividualCustomerAllOfAttributes email(String email) {
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


  public IndividualCustomerAllOfAttributes phone(Phone phone) {
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


  public IndividualCustomerAllOfAttributes ssn(String ssn) {
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


  public IndividualCustomerAllOfAttributes passport(String passport) {
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


  public IndividualCustomerAllOfAttributes nationality(String nationality) {
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


  public IndividualCustomerAllOfAttributes matriculaConsular(String matriculaConsular) {
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


  public IndividualCustomerAllOfAttributes address(Address address) {
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


  public IndividualCustomerAllOfAttributes dateOfBirth(LocalDate dateOfBirth) {
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


  public IndividualCustomerAllOfAttributes ein(String ein) {
    this.ein = ein;
    return this;
  }

  /**
   * Get ein
   * @return ein
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEin() {
    return ein;
  }


  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEin(String ein) {
    this.ein = ein;
  }


  public IndividualCustomerAllOfAttributes dba(String dba) {
    this.dba = dba;
    return this;
  }

  /**
   * Get dba
   * @return dba
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDba() {
    return dba;
  }


  @JsonProperty(JSON_PROPERTY_DBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDba(String dba) {
    this.dba = dba;
  }


  public IndividualCustomerAllOfAttributes soleProprietorship(Boolean soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
    return this;
  }

  /**
   * Get soleProprietorship
   * @return soleProprietorship
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSoleProprietorship() {
    return soleProprietorship;
  }


  @JsonProperty(JSON_PROPERTY_SOLE_PROPRIETORSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoleProprietorship(Boolean soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
  }


  public IndividualCustomerAllOfAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public IndividualCustomerAllOfAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public IndividualCustomerAllOfAttributes riskRate(RiskRateEnum riskRate) {
    this.riskRate = riskRate;
    return this;
  }

  /**
   * Get riskRate
   * @return riskRate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RISK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RiskRateEnum getRiskRate() {
    return riskRate;
  }


  @JsonProperty(JSON_PROPERTY_RISK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskRate(RiskRateEnum riskRate) {
    this.riskRate = riskRate;
  }


  public IndividualCustomerAllOfAttributes maskedSSN(String maskedSSN) {
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


  public IndividualCustomerAllOfAttributes maskedPassport(String maskedPassport) {
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


  public IndividualCustomerAllOfAttributes maskedMatriculaConsular(String maskedMatriculaConsular) {
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


  public IndividualCustomerAllOfAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
    return this;
  }

  public IndividualCustomerAllOfAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
    if (this.authorizedUsers == null) {
      this.authorizedUsers = new ArrayList<>();
    }
    this.authorizedUsers.add(authorizedUsersItem);
    return this;
  }

  /**
   * Get authorizedUsers
   * @return authorizedUsers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AuthorizedUser> getAuthorizedUsers() {
    return authorizedUsers;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
  }


  public IndividualCustomerAllOfAttributes jwtSubject(String jwtSubject) {
    this.jwtSubject = JsonNullable.<String>of(jwtSubject);
    return this;
  }

  /**
   * Get jwtSubject
   * @return jwtSubject
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getJwtSubject() {
        return jwtSubject.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JWT_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJwtSubject_JsonNullable() {
    return jwtSubject;
  }
  
  @JsonProperty(JSON_PROPERTY_JWT_SUBJECT)
  public void setJwtSubject_JsonNullable(JsonNullable<String> jwtSubject) {
    this.jwtSubject = jwtSubject;
  }

  public void setJwtSubject(String jwtSubject) {
    this.jwtSubject = JsonNullable.<String>of(jwtSubject);
  }


  public IndividualCustomerAllOfAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public IndividualCustomerAllOfAttributes archiveReason(ArchiveReasonEnum archiveReason) {
    this.archiveReason = archiveReason;
    return this;
  }

  /**
   * Get archiveReason
   * @return archiveReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ArchiveReasonEnum getArchiveReason() {
    return archiveReason;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchiveReason(ArchiveReasonEnum archiveReason) {
    this.archiveReason = archiveReason;
  }


  /**
   * Return true if this IndividualCustomer_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualCustomerAllOfAttributes individualCustomerAllOfAttributes = (IndividualCustomerAllOfAttributes) o;
    return Objects.equals(this.createdAt, individualCustomerAllOfAttributes.createdAt) &&
        Objects.equals(this.fullName, individualCustomerAllOfAttributes.fullName) &&
        Objects.equals(this.email, individualCustomerAllOfAttributes.email) &&
        Objects.equals(this.phone, individualCustomerAllOfAttributes.phone) &&
        Objects.equals(this.ssn, individualCustomerAllOfAttributes.ssn) &&
        Objects.equals(this.passport, individualCustomerAllOfAttributes.passport) &&
        Objects.equals(this.nationality, individualCustomerAllOfAttributes.nationality) &&
        Objects.equals(this.matriculaConsular, individualCustomerAllOfAttributes.matriculaConsular) &&
        Objects.equals(this.address, individualCustomerAllOfAttributes.address) &&
        Objects.equals(this.dateOfBirth, individualCustomerAllOfAttributes.dateOfBirth) &&
        Objects.equals(this.ein, individualCustomerAllOfAttributes.ein) &&
        Objects.equals(this.dba, individualCustomerAllOfAttributes.dba) &&
        Objects.equals(this.soleProprietorship, individualCustomerAllOfAttributes.soleProprietorship) &&
        Objects.equals(this.tags, individualCustomerAllOfAttributes.tags) &&
        Objects.equals(this.riskRate, individualCustomerAllOfAttributes.riskRate) &&
        Objects.equals(this.maskedSSN, individualCustomerAllOfAttributes.maskedSSN) &&
        Objects.equals(this.maskedPassport, individualCustomerAllOfAttributes.maskedPassport) &&
        Objects.equals(this.maskedMatriculaConsular, individualCustomerAllOfAttributes.maskedMatriculaConsular) &&
        Objects.equals(this.authorizedUsers, individualCustomerAllOfAttributes.authorizedUsers) &&
        equalsNullable(this.jwtSubject, individualCustomerAllOfAttributes.jwtSubject) &&
        Objects.equals(this.status, individualCustomerAllOfAttributes.status) &&
        Objects.equals(this.archiveReason, individualCustomerAllOfAttributes.archiveReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, ein, dba, soleProprietorship, tags, riskRate, maskedSSN, maskedPassport, maskedMatriculaConsular, authorizedUsers, hashCodeNullable(jwtSubject), status, archiveReason);
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
    sb.append("class IndividualCustomerAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    soleProprietorship: ").append(toIndentedString(soleProprietorship)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    riskRate: ").append(toIndentedString(riskRate)).append("\n");
    sb.append("    maskedSSN: ").append(toIndentedString(maskedSSN)).append("\n");
    sb.append("    maskedPassport: ").append(toIndentedString(maskedPassport)).append("\n");
    sb.append("    maskedMatriculaConsular: ").append(toIndentedString(maskedMatriculaConsular)).append("\n");
    sb.append("    authorizedUsers: ").append(toIndentedString(authorizedUsers)).append("\n");
    sb.append("    jwtSubject: ").append(toIndentedString(jwtSubject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    archiveReason: ").append(toIndentedString(archiveReason)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `ein` to the URL query string
    if (getEin() != null) {
      joiner.add(String.format("%sein%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dba` to the URL query string
    if (getDba() != null) {
      joiner.add(String.format("%sdba%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDba()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `soleProprietorship` to the URL query string
    if (getSoleProprietorship() != null) {
      joiner.add(String.format("%ssoleProprietorship%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSoleProprietorship()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `riskRate` to the URL query string
    if (getRiskRate() != null) {
      joiner.add(String.format("%sriskRate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRiskRate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `authorizedUsers` to the URL query string
    if (getAuthorizedUsers() != null) {
      for (int i = 0; i < getAuthorizedUsers().size(); i++) {
        if (getAuthorizedUsers().get(i) != null) {
          joiner.add(getAuthorizedUsers().get(i).toUrlQueryString(String.format("%sauthorizedUsers%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `jwtSubject` to the URL query string
    if (getJwtSubject() != null) {
      joiner.add(String.format("%sjwtSubject%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getJwtSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `archiveReason` to the URL query string
    if (getArchiveReason() != null) {
      joiner.add(String.format("%sarchiveReason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArchiveReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

