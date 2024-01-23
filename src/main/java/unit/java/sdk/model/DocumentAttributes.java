/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.3
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DocumentAttributes
 */
@JsonPropertyOrder({
  DocumentAttributes.JSON_PROPERTY_DOCUMENT_TYPE,
  DocumentAttributes.JSON_PROPERTY_STATUS,
  DocumentAttributes.JSON_PROPERTY_DESCRIPTION,
  DocumentAttributes.JSON_PROPERTY_NATIONALITY,
  DocumentAttributes.JSON_PROPERTY_SSN,
  DocumentAttributes.JSON_PROPERTY_PASSPORT,
  DocumentAttributes.JSON_PROPERTY_MATRICULA_CONSULAR,
  DocumentAttributes.JSON_PROPERTY_NAME,
  DocumentAttributes.JSON_PROPERTY_ADDRESS,
  DocumentAttributes.JSON_PROPERTY_DATE_OF_INCORPORATION,
  DocumentAttributes.JSON_PROPERTY_STATE_OF_INCORPORATION,
  DocumentAttributes.JSON_PROPERTY_DATE_OF_BIRTH,
  DocumentAttributes.JSON_PROPERTY_EIN,
  DocumentAttributes.JSON_PROPERTY_REASON_CODE,
  DocumentAttributes.JSON_PROPERTY_REASON,
  DocumentAttributes.JSON_PROPERTY_EVALUATION_ID,
  DocumentAttributes.JSON_PROPERTY_FRONT_DOCUMENT_ID,
  DocumentAttributes.JSON_PROPERTY_BACK_DOCUMENT_ID,
  DocumentAttributes.JSON_PROPERTY_FRONT_DOCUMENT_STORE_ID,
  DocumentAttributes.JSON_PROPERTY_BACK_DOCUMENT_STORE_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentAttributes {
  public static final String JSON_PROPERTY_DOCUMENT_TYPE = "documentType";
  private String documentType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_SSN = "ssn";
  private String ssn;

  public static final String JSON_PROPERTY_PASSPORT = "passport";
  private String passport;

  public static final String JSON_PROPERTY_MATRICULA_CONSULAR = "matriculaConsular";
  private String matriculaConsular;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DATE_OF_INCORPORATION = "dateOfIncorporation";
  private LocalDate dateOfIncorporation;

  public static final String JSON_PROPERTY_STATE_OF_INCORPORATION = "stateOfIncorporation";
  private String stateOfIncorporation;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_REASON_CODE = "reasonCode";
  private String reasonCode;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluationId";
  private String evaluationId;

  public static final String JSON_PROPERTY_FRONT_DOCUMENT_ID = "frontDocumentId";
  private String frontDocumentId;

  public static final String JSON_PROPERTY_BACK_DOCUMENT_ID = "backDocumentId";
  private String backDocumentId;

  public static final String JSON_PROPERTY_FRONT_DOCUMENT_STORE_ID = "frontDocumentStoreId";
  private String frontDocumentStoreId;

  public static final String JSON_PROPERTY_BACK_DOCUMENT_STORE_ID = "backDocumentStoreId";
  private String backDocumentStoreId;

  public DocumentAttributes() { 
  }

  public DocumentAttributes documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentType() {
    return documentType;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public DocumentAttributes status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentAttributes nationality(String nationality) {
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


  public DocumentAttributes ssn(String ssn) {
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


  public DocumentAttributes passport(String passport) {
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


  public DocumentAttributes matriculaConsular(String matriculaConsular) {
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


  public DocumentAttributes name(String name) {
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


  public DocumentAttributes address(Address address) {
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


  public DocumentAttributes dateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * Get dateOfIncorporation
   * @return dateOfIncorporation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDateOfIncorporation() {
    return dateOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public DocumentAttributes stateOfIncorporation(String stateOfIncorporation) {
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


  public DocumentAttributes dateOfBirth(LocalDate dateOfBirth) {
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


  public DocumentAttributes ein(String ein) {
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


  public DocumentAttributes reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReasonCode() {
    return reasonCode;
  }


  @JsonProperty(JSON_PROPERTY_REASON_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public DocumentAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public DocumentAttributes evaluationId(String evaluationId) {
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


  public DocumentAttributes frontDocumentId(String frontDocumentId) {
    this.frontDocumentId = frontDocumentId;
    return this;
  }

   /**
   * Get frontDocumentId
   * @return frontDocumentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRONT_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrontDocumentId() {
    return frontDocumentId;
  }


  @JsonProperty(JSON_PROPERTY_FRONT_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrontDocumentId(String frontDocumentId) {
    this.frontDocumentId = frontDocumentId;
  }


  public DocumentAttributes backDocumentId(String backDocumentId) {
    this.backDocumentId = backDocumentId;
    return this;
  }

   /**
   * Get backDocumentId
   * @return backDocumentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACK_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackDocumentId() {
    return backDocumentId;
  }


  @JsonProperty(JSON_PROPERTY_BACK_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackDocumentId(String backDocumentId) {
    this.backDocumentId = backDocumentId;
  }


  public DocumentAttributes frontDocumentStoreId(String frontDocumentStoreId) {
    this.frontDocumentStoreId = frontDocumentStoreId;
    return this;
  }

   /**
   * Get frontDocumentStoreId
   * @return frontDocumentStoreId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRONT_DOCUMENT_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrontDocumentStoreId() {
    return frontDocumentStoreId;
  }


  @JsonProperty(JSON_PROPERTY_FRONT_DOCUMENT_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrontDocumentStoreId(String frontDocumentStoreId) {
    this.frontDocumentStoreId = frontDocumentStoreId;
  }


  public DocumentAttributes backDocumentStoreId(String backDocumentStoreId) {
    this.backDocumentStoreId = backDocumentStoreId;
    return this;
  }

   /**
   * Get backDocumentStoreId
   * @return backDocumentStoreId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACK_DOCUMENT_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackDocumentStoreId() {
    return backDocumentStoreId;
  }


  @JsonProperty(JSON_PROPERTY_BACK_DOCUMENT_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackDocumentStoreId(String backDocumentStoreId) {
    this.backDocumentStoreId = backDocumentStoreId;
  }


  /**
   * Return true if this document_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAttributes documentAttributes = (DocumentAttributes) o;
    return Objects.equals(this.documentType, documentAttributes.documentType) &&
        Objects.equals(this.status, documentAttributes.status) &&
        Objects.equals(this.description, documentAttributes.description) &&
        Objects.equals(this.nationality, documentAttributes.nationality) &&
        Objects.equals(this.ssn, documentAttributes.ssn) &&
        Objects.equals(this.passport, documentAttributes.passport) &&
        Objects.equals(this.matriculaConsular, documentAttributes.matriculaConsular) &&
        Objects.equals(this.name, documentAttributes.name) &&
        Objects.equals(this.address, documentAttributes.address) &&
        Objects.equals(this.dateOfIncorporation, documentAttributes.dateOfIncorporation) &&
        Objects.equals(this.stateOfIncorporation, documentAttributes.stateOfIncorporation) &&
        Objects.equals(this.dateOfBirth, documentAttributes.dateOfBirth) &&
        Objects.equals(this.ein, documentAttributes.ein) &&
        Objects.equals(this.reasonCode, documentAttributes.reasonCode) &&
        Objects.equals(this.reason, documentAttributes.reason) &&
        Objects.equals(this.evaluationId, documentAttributes.evaluationId) &&
        Objects.equals(this.frontDocumentId, documentAttributes.frontDocumentId) &&
        Objects.equals(this.backDocumentId, documentAttributes.backDocumentId) &&
        Objects.equals(this.frontDocumentStoreId, documentAttributes.frontDocumentStoreId) &&
        Objects.equals(this.backDocumentStoreId, documentAttributes.backDocumentStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, status, description, nationality, ssn, passport, matriculaConsular, name, address, dateOfIncorporation, stateOfIncorporation, dateOfBirth, ein, reasonCode, reason, evaluationId, frontDocumentId, backDocumentId, frontDocumentStoreId, backDocumentStoreId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAttributes {\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    frontDocumentId: ").append(toIndentedString(frontDocumentId)).append("\n");
    sb.append("    backDocumentId: ").append(toIndentedString(backDocumentId)).append("\n");
    sb.append("    frontDocumentStoreId: ").append(toIndentedString(frontDocumentStoreId)).append("\n");
    sb.append("    backDocumentStoreId: ").append(toIndentedString(backDocumentStoreId)).append("\n");
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

    // add `documentType` to the URL query string
    if (getDocumentType() != null) {
      joiner.add(String.format("%sdocumentType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDocumentType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dateOfIncorporation` to the URL query string
    if (getDateOfIncorporation() != null) {
      joiner.add(String.format("%sdateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stateOfIncorporation` to the URL query string
    if (getStateOfIncorporation() != null) {
      joiner.add(String.format("%sstateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ein` to the URL query string
    if (getEin() != null) {
      joiner.add(String.format("%sein%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reasonCode` to the URL query string
    if (getReasonCode() != null) {
      joiner.add(String.format("%sreasonCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReasonCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationId` to the URL query string
    if (getEvaluationId() != null) {
      joiner.add(String.format("%sevaluationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvaluationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `frontDocumentId` to the URL query string
    if (getFrontDocumentId() != null) {
      joiner.add(String.format("%sfrontDocumentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrontDocumentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `backDocumentId` to the URL query string
    if (getBackDocumentId() != null) {
      joiner.add(String.format("%sbackDocumentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackDocumentId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `frontDocumentStoreId` to the URL query string
    if (getFrontDocumentStoreId() != null) {
      joiner.add(String.format("%sfrontDocumentStoreId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrontDocumentStoreId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `backDocumentStoreId` to the URL query string
    if (getBackDocumentStoreId() != null) {
      joiner.add(String.format("%sbackDocumentStoreId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackDocumentStoreId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

