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
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.BusinessVertical;
import unit.java.sdk.model.Contact;
import unit.java.sdk.model.CreateBeneficialOwner;
import unit.java.sdk.model.CreateOfficer;
import unit.java.sdk.model.EntityType;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Industry;
import unit.java.sdk.model.Occupation;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApplicationFormPrefill
 */
@JsonPropertyOrder({
  ApplicationFormPrefill.JSON_PROPERTY_APPLICATION_TYPE,
  ApplicationFormPrefill.JSON_PROPERTY_FULL_NAME,
  ApplicationFormPrefill.JSON_PROPERTY_SSN,
  ApplicationFormPrefill.JSON_PROPERTY_PASSPORT,
  ApplicationFormPrefill.JSON_PROPERTY_NATIONALITY,
  ApplicationFormPrefill.JSON_PROPERTY_DATE_OF_BIRTH,
  ApplicationFormPrefill.JSON_PROPERTY_EMAIL,
  ApplicationFormPrefill.JSON_PROPERTY_NAME,
  ApplicationFormPrefill.JSON_PROPERTY_STATE_OF_INCORPORATION,
  ApplicationFormPrefill.JSON_PROPERTY_ENTITY_TYPE,
  ApplicationFormPrefill.JSON_PROPERTY_CONTACT,
  ApplicationFormPrefill.JSON_PROPERTY_OFFICER,
  ApplicationFormPrefill.JSON_PROPERTY_BENEFICIAL_OWNERS,
  ApplicationFormPrefill.JSON_PROPERTY_WEBSITE,
  ApplicationFormPrefill.JSON_PROPERTY_PHONE,
  ApplicationFormPrefill.JSON_PROPERTY_ADDRESS,
  ApplicationFormPrefill.JSON_PROPERTY_DBA,
  ApplicationFormPrefill.JSON_PROPERTY_EIN,
  ApplicationFormPrefill.JSON_PROPERTY_JWT_SUBJECT,
  ApplicationFormPrefill.JSON_PROPERTY_INDUSTRY,
  ApplicationFormPrefill.JSON_PROPERTY_BUSINESS_VERTICAL,
  ApplicationFormPrefill.JSON_PROPERTY_OCCUPATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationFormPrefill {
  /**
   * Gets or Sets applicationType
   */
  public enum ApplicationTypeEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business"),
    
    SOLEPROPRIETORSHIP("SoleProprietorship");

    private String value;

    ApplicationTypeEnum(String value) {
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
    public static ApplicationTypeEnum fromValue(String value) {
      for (ApplicationTypeEnum b : ApplicationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPLICATION_TYPE = "applicationType";
  private ApplicationTypeEnum applicationType;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private FullName fullName;

  public static final String JSON_PROPERTY_SSN = "ssn";
  private String ssn;

  public static final String JSON_PROPERTY_PASSPORT = "passport";
  private String passport;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATE_OF_INCORPORATION = "stateOfIncorporation";
  private String stateOfIncorporation;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private Contact contact;

  public static final String JSON_PROPERTY_OFFICER = "officer";
  private CreateOfficer officer;

  public static final String JSON_PROPERTY_BENEFICIAL_OWNERS = "beneficialOwners";
  private List<CreateBeneficialOwner> beneficialOwners;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DBA = "dba";
  private String dba;

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_JWT_SUBJECT = "jwtSubject";
  private JsonNullable<String> jwtSubject = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private Industry industry;

  public static final String JSON_PROPERTY_BUSINESS_VERTICAL = "businessVertical";
  private BusinessVertical businessVertical;

  public static final String JSON_PROPERTY_OCCUPATION = "occupation";
  private Occupation occupation;

  public ApplicationFormPrefill() { 
  }

  public ApplicationFormPrefill applicationType(ApplicationTypeEnum applicationType) {
    this.applicationType = applicationType;
    return this;
  }

   /**
   * Get applicationType
   * @return applicationType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplicationTypeEnum getApplicationType() {
    return applicationType;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationType(ApplicationTypeEnum applicationType) {
    this.applicationType = applicationType;
  }


  public ApplicationFormPrefill fullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
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


  public ApplicationFormPrefill ssn(String ssn) {
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


  public ApplicationFormPrefill passport(String passport) {
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


  public ApplicationFormPrefill nationality(String nationality) {
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


  public ApplicationFormPrefill dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
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


  public ApplicationFormPrefill email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
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


  public ApplicationFormPrefill name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApplicationFormPrefill stateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }


  public ApplicationFormPrefill entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public ApplicationFormPrefill contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Contact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(Contact contact) {
    this.contact = contact;
  }


  public ApplicationFormPrefill officer(CreateOfficer officer) {
    this.officer = officer;
    return this;
  }

   /**
   * Get officer
   * @return officer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFICER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateOfficer getOfficer() {
    return officer;
  }


  @JsonProperty(JSON_PROPERTY_OFFICER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfficer(CreateOfficer officer) {
    this.officer = officer;
  }


  public ApplicationFormPrefill beneficialOwners(List<CreateBeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
    return this;
  }

  public ApplicationFormPrefill addBeneficialOwnersItem(CreateBeneficialOwner beneficialOwnersItem) {
    if (this.beneficialOwners == null) {
      this.beneficialOwners = new ArrayList<>();
    }
    this.beneficialOwners.add(beneficialOwnersItem);
    return this;
  }

   /**
   * Get beneficialOwners
   * @return beneficialOwners
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BENEFICIAL_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateBeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIAL_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeneficialOwners(List<CreateBeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
  }


  public ApplicationFormPrefill website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsite(String website) {
    this.website = website;
  }


  public ApplicationFormPrefill phone(Phone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
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


  public ApplicationFormPrefill address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
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


  public ApplicationFormPrefill dba(String dba) {
    this.dba = dba;
    return this;
  }

   /**
   * Get dba
   * @return dba
  **/
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


  public ApplicationFormPrefill ein(String ein) {
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
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


  public ApplicationFormPrefill jwtSubject(String jwtSubject) {
    this.jwtSubject = JsonNullable.<String>of(jwtSubject);
    return this;
  }

   /**
   * Get jwtSubject
   * @return jwtSubject
  **/
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


  public ApplicationFormPrefill industry(Industry industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Industry getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustry(Industry industry) {
    this.industry = industry;
  }


  public ApplicationFormPrefill businessVertical(BusinessVertical businessVertical) {
    this.businessVertical = businessVertical;
    return this;
  }

   /**
   * Get businessVertical
   * @return businessVertical
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BusinessVertical getBusinessVertical() {
    return businessVertical;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessVertical(BusinessVertical businessVertical) {
    this.businessVertical = businessVertical;
  }


  public ApplicationFormPrefill occupation(Occupation occupation) {
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


  /**
   * Return true if this ApplicationFormPrefill object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationFormPrefill applicationFormPrefill = (ApplicationFormPrefill) o;
    return Objects.equals(this.applicationType, applicationFormPrefill.applicationType) &&
        Objects.equals(this.fullName, applicationFormPrefill.fullName) &&
        Objects.equals(this.ssn, applicationFormPrefill.ssn) &&
        Objects.equals(this.passport, applicationFormPrefill.passport) &&
        Objects.equals(this.nationality, applicationFormPrefill.nationality) &&
        Objects.equals(this.dateOfBirth, applicationFormPrefill.dateOfBirth) &&
        Objects.equals(this.email, applicationFormPrefill.email) &&
        Objects.equals(this.name, applicationFormPrefill.name) &&
        Objects.equals(this.stateOfIncorporation, applicationFormPrefill.stateOfIncorporation) &&
        Objects.equals(this.entityType, applicationFormPrefill.entityType) &&
        Objects.equals(this.contact, applicationFormPrefill.contact) &&
        Objects.equals(this.officer, applicationFormPrefill.officer) &&
        Objects.equals(this.beneficialOwners, applicationFormPrefill.beneficialOwners) &&
        Objects.equals(this.website, applicationFormPrefill.website) &&
        Objects.equals(this.phone, applicationFormPrefill.phone) &&
        Objects.equals(this.address, applicationFormPrefill.address) &&
        Objects.equals(this.dba, applicationFormPrefill.dba) &&
        Objects.equals(this.ein, applicationFormPrefill.ein) &&
        equalsNullable(this.jwtSubject, applicationFormPrefill.jwtSubject) &&
        Objects.equals(this.industry, applicationFormPrefill.industry) &&
        Objects.equals(this.businessVertical, applicationFormPrefill.businessVertical) &&
        Objects.equals(this.occupation, applicationFormPrefill.occupation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationType, fullName, ssn, passport, nationality, dateOfBirth, email, name, stateOfIncorporation, entityType, contact, officer, beneficialOwners, website, phone, address, dba, ein, hashCodeNullable(jwtSubject), industry, businessVertical, occupation);
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
    sb.append("class ApplicationFormPrefill {\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    officer: ").append(toIndentedString(officer)).append("\n");
    sb.append("    beneficialOwners: ").append(toIndentedString(beneficialOwners)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    jwtSubject: ").append(toIndentedString(jwtSubject)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    businessVertical: ").append(toIndentedString(businessVertical)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
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

    // add `applicationType` to the URL query string
    if (getApplicationType() != null) {
      joiner.add(String.format("%sapplicationType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApplicationType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(getFullName().toUrlQueryString(prefix + "fullName" + suffix));
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

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stateOfIncorporation` to the URL query string
    if (getStateOfIncorporation() != null) {
      joiner.add(String.format("%sstateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      joiner.add(String.format("%sentityType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntityType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(getContact().toUrlQueryString(prefix + "contact" + suffix));
    }

    // add `officer` to the URL query string
    if (getOfficer() != null) {
      joiner.add(getOfficer().toUrlQueryString(prefix + "officer" + suffix));
    }

    // add `beneficialOwners` to the URL query string
    if (getBeneficialOwners() != null) {
      for (int i = 0; i < getBeneficialOwners().size(); i++) {
        if (getBeneficialOwners().get(i) != null) {
          joiner.add(getBeneficialOwners().get(i).toUrlQueryString(String.format("%sbeneficialOwners%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `website` to the URL query string
    if (getWebsite() != null) {
      joiner.add(String.format("%swebsite%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebsite()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dba` to the URL query string
    if (getDba() != null) {
      joiner.add(String.format("%sdba%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDba()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ein` to the URL query string
    if (getEin() != null) {
      joiner.add(String.format("%sein%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `jwtSubject` to the URL query string
    if (getJwtSubject() != null) {
      joiner.add(String.format("%sjwtSubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwtSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `industry` to the URL query string
    if (getIndustry() != null) {
      joiner.add(String.format("%sindustry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndustry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `businessVertical` to the URL query string
    if (getBusinessVertical() != null) {
      joiner.add(String.format("%sbusinessVertical%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBusinessVertical()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `occupation` to the URL query string
    if (getOccupation() != null) {
      joiner.add(String.format("%soccupation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOccupation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

