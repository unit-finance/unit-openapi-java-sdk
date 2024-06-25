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
import unit.java.sdk.model.AnnualIncome;
import unit.java.sdk.model.CreatePowerOfAttorneyAgent;
import unit.java.sdk.model.DeviceFingerprint;
import unit.java.sdk.model.EvaluationParams;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Industry;
import unit.java.sdk.model.Occupation;
import unit.java.sdk.model.Phone;
import unit.java.sdk.model.SourceOfIncome;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateIndividualApplicationAttributes
 */
@JsonPropertyOrder({
  CreateIndividualApplicationAttributes.JSON_PROPERTY_FULL_NAME,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_EMAIL,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_PHONE,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_SSN,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_PASSPORT,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_NATIONALITY,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_ADDRESS,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_DATE_OF_BIRTH,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_IP,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_TAGS,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_DEVICE_FINGERPRINTS,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_JWT_SUBJECT,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_POWER_OF_ATTORNEY_AGENT,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_INDUSTRY,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_EVALUATION_PARAMS,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_OCCUPATION,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_ANNUAL_INCOME,
  CreateIndividualApplicationAttributes.JSON_PROPERTY_SOURCE_OF_INCOME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateIndividualApplicationAttributes {
  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private FullName fullName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_SSN = "ssn";
  private JsonNullable<String> ssn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PASSPORT = "passport";
  private JsonNullable<String> passport = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINTS = "deviceFingerprints";
  private List<DeviceFingerprint> deviceFingerprints;

  public static final String JSON_PROPERTY_JWT_SUBJECT = "jwtSubject";
  private JsonNullable<String> jwtSubject = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POWER_OF_ATTORNEY_AGENT = "powerOfAttorneyAgent";
  private CreatePowerOfAttorneyAgent powerOfAttorneyAgent;

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private Industry industry;

  public static final String JSON_PROPERTY_EVALUATION_PARAMS = "evaluationParams";
  private EvaluationParams evaluationParams;

  public static final String JSON_PROPERTY_OCCUPATION = "occupation";
  private Occupation occupation;

  public static final String JSON_PROPERTY_ANNUAL_INCOME = "annualIncome";
  private AnnualIncome annualIncome;

  public static final String JSON_PROPERTY_SOURCE_OF_INCOME = "sourceOfIncome";
  private SourceOfIncome sourceOfIncome;

  public CreateIndividualApplicationAttributes() { 
  }

  public CreateIndividualApplicationAttributes fullName(FullName fullName) {
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


  public CreateIndividualApplicationAttributes email(String email) {
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


  public CreateIndividualApplicationAttributes phone(Phone phone) {
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


  public CreateIndividualApplicationAttributes ssn(String ssn) {
    this.ssn = JsonNullable.<String>of(ssn);
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getSsn() {
        return ssn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSsn_JsonNullable() {
    return ssn;
  }
  
  @JsonProperty(JSON_PROPERTY_SSN)
  public void setSsn_JsonNullable(JsonNullable<String> ssn) {
    this.ssn = ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = JsonNullable.<String>of(ssn);
  }


  public CreateIndividualApplicationAttributes passport(String passport) {
    this.passport = JsonNullable.<String>of(passport);
    return this;
  }

   /**
   * Get passport
   * @return passport
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getPassport() {
        return passport.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassport_JsonNullable() {
    return passport;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSPORT)
  public void setPassport_JsonNullable(JsonNullable<String> passport) {
    this.passport = passport;
  }

  public void setPassport(String passport) {
    this.passport = JsonNullable.<String>of(passport);
  }


  public CreateIndividualApplicationAttributes nationality(String nationality) {
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


  public CreateIndividualApplicationAttributes address(Address address) {
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


  public CreateIndividualApplicationAttributes dateOfBirth(LocalDate dateOfBirth) {
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


  public CreateIndividualApplicationAttributes ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public CreateIndividualApplicationAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public CreateIndividualApplicationAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateIndividualApplicationAttributes deviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    this.deviceFingerprints = deviceFingerprints;
    return this;
  }

  public CreateIndividualApplicationAttributes addDeviceFingerprintsItem(DeviceFingerprint deviceFingerprintsItem) {
    if (this.deviceFingerprints == null) {
      this.deviceFingerprints = new ArrayList<>();
    }
    this.deviceFingerprints.add(deviceFingerprintsItem);
    return this;
  }

   /**
   * Get deviceFingerprints
   * @return deviceFingerprints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeviceFingerprint> getDeviceFingerprints() {
    return deviceFingerprints;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    this.deviceFingerprints = deviceFingerprints;
  }


  public CreateIndividualApplicationAttributes jwtSubject(String jwtSubject) {
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


  public CreateIndividualApplicationAttributes powerOfAttorneyAgent(CreatePowerOfAttorneyAgent powerOfAttorneyAgent) {
    this.powerOfAttorneyAgent = powerOfAttorneyAgent;
    return this;
  }

   /**
   * Get powerOfAttorneyAgent
   * @return powerOfAttorneyAgent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_OF_ATTORNEY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreatePowerOfAttorneyAgent getPowerOfAttorneyAgent() {
    return powerOfAttorneyAgent;
  }


  @JsonProperty(JSON_PROPERTY_POWER_OF_ATTORNEY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerOfAttorneyAgent(CreatePowerOfAttorneyAgent powerOfAttorneyAgent) {
    this.powerOfAttorneyAgent = powerOfAttorneyAgent;
  }


  public CreateIndividualApplicationAttributes industry(Industry industry) {
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


  public CreateIndividualApplicationAttributes evaluationParams(EvaluationParams evaluationParams) {
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


  public CreateIndividualApplicationAttributes occupation(Occupation occupation) {
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


  public CreateIndividualApplicationAttributes annualIncome(AnnualIncome annualIncome) {
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


  public CreateIndividualApplicationAttributes sourceOfIncome(SourceOfIncome sourceOfIncome) {
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
   * Return true if this CreateIndividualApplication_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateIndividualApplicationAttributes createIndividualApplicationAttributes = (CreateIndividualApplicationAttributes) o;
    return Objects.equals(this.fullName, createIndividualApplicationAttributes.fullName) &&
        Objects.equals(this.email, createIndividualApplicationAttributes.email) &&
        Objects.equals(this.phone, createIndividualApplicationAttributes.phone) &&
        equalsNullable(this.ssn, createIndividualApplicationAttributes.ssn) &&
        equalsNullable(this.passport, createIndividualApplicationAttributes.passport) &&
        Objects.equals(this.nationality, createIndividualApplicationAttributes.nationality) &&
        Objects.equals(this.address, createIndividualApplicationAttributes.address) &&
        Objects.equals(this.dateOfBirth, createIndividualApplicationAttributes.dateOfBirth) &&
        Objects.equals(this.ip, createIndividualApplicationAttributes.ip) &&
        Objects.equals(this.tags, createIndividualApplicationAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createIndividualApplicationAttributes.idempotencyKey) &&
        Objects.equals(this.deviceFingerprints, createIndividualApplicationAttributes.deviceFingerprints) &&
        equalsNullable(this.jwtSubject, createIndividualApplicationAttributes.jwtSubject) &&
        Objects.equals(this.powerOfAttorneyAgent, createIndividualApplicationAttributes.powerOfAttorneyAgent) &&
        Objects.equals(this.industry, createIndividualApplicationAttributes.industry) &&
        Objects.equals(this.evaluationParams, createIndividualApplicationAttributes.evaluationParams) &&
        Objects.equals(this.occupation, createIndividualApplicationAttributes.occupation) &&
        Objects.equals(this.annualIncome, createIndividualApplicationAttributes.annualIncome) &&
        Objects.equals(this.sourceOfIncome, createIndividualApplicationAttributes.sourceOfIncome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, phone, hashCodeNullable(ssn), hashCodeNullable(passport), nationality, address, dateOfBirth, ip, tags, idempotencyKey, deviceFingerprints, hashCodeNullable(jwtSubject), powerOfAttorneyAgent, industry, evaluationParams, occupation, annualIncome, sourceOfIncome);
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
    sb.append("class CreateIndividualApplicationAttributes {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    deviceFingerprints: ").append(toIndentedString(deviceFingerprints)).append("\n");
    sb.append("    jwtSubject: ").append(toIndentedString(jwtSubject)).append("\n");
    sb.append("    powerOfAttorneyAgent: ").append(toIndentedString(powerOfAttorneyAgent)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
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

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deviceFingerprints` to the URL query string
    if (getDeviceFingerprints() != null) {
      for (int i = 0; i < getDeviceFingerprints().size(); i++) {
        if (getDeviceFingerprints().get(i) != null) {
          joiner.add(getDeviceFingerprints().get(i).toUrlQueryString(String.format("%sdeviceFingerprints%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `jwtSubject` to the URL query string
    if (getJwtSubject() != null) {
      joiner.add(String.format("%sjwtSubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwtSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `powerOfAttorneyAgent` to the URL query string
    if (getPowerOfAttorneyAgent() != null) {
      joiner.add(getPowerOfAttorneyAgent().toUrlQueryString(prefix + "powerOfAttorneyAgent" + suffix));
    }

    // add `industry` to the URL query string
    if (getIndustry() != null) {
      joiner.add(String.format("%sindustry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndustry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

