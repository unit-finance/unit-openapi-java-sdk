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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import unit.java.sdk.model.ApplicationStatus;
import unit.java.sdk.model.Grantor;
import unit.java.sdk.model.Revocability;
import unit.java.sdk.model.SourceOfFunds;
import unit.java.sdk.model.TrustContact;
import unit.java.sdk.model.Trustee;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TrustApplicationAllOfAttributes
 */
@JsonPropertyOrder({
  TrustApplicationAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_UPDATED_AT,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_STATUS,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_MESSAGE,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_EVALUATION_OUTCOME,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_EVALUATION_ID,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_EVALUATION_ENTITY_ID,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_NAME,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_DATE_OF_INCORPORATION,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_STATE_OF_INCORPORATION,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_REVOCABILITY,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_SOURCE_OF_FUNDS,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_TAX_ID,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_CONTACT,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_TRUSTEES,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_GRANTOR,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_IP,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_DECISION_METHOD,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_DECISION_USER_ID,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_DECISION_REASON,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_DECISION_DATE_TIME,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_TAGS,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_RISK_RATE,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_EVALUATION_FLAGS,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_IP_LOCATION_DETAILS,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_PHONE_LOCATION_DETAILS,
  TrustApplicationAllOfAttributes.JSON_PROPERTY_ARCHIVED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrustApplicationAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ApplicationStatus status;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_EVALUATION_OUTCOME = "evaluationOutcome";
  private String evaluationOutcome;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluationId";
  private String evaluationId;

  public static final String JSON_PROPERTY_EVALUATION_ENTITY_ID = "evaluationEntityId";
  private String evaluationEntityId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATE_OF_INCORPORATION = "dateOfIncorporation";
  private LocalDate dateOfIncorporation;

  public static final String JSON_PROPERTY_STATE_OF_INCORPORATION = "stateOfIncorporation";
  private String stateOfIncorporation;

  public static final String JSON_PROPERTY_REVOCABILITY = "revocability";
  private Revocability revocability;

  public static final String JSON_PROPERTY_SOURCE_OF_FUNDS = "sourceOfFunds";
  private SourceOfFunds sourceOfFunds;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private TrustContact contact;

  public static final String JSON_PROPERTY_TRUSTEES = "trustees";
  private List<Trustee> trustees;

  public static final String JSON_PROPERTY_GRANTOR = "grantor";
  private Grantor grantor;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  /**
   * Gets or Sets decisionMethod
   */
  public enum DecisionMethodEnum {
    MANUALLY("Manually"),
    
    AUTOMATICALLY("Automatically");

    private String value;

    DecisionMethodEnum(String value) {
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
    public static DecisionMethodEnum fromValue(String value) {
      for (DecisionMethodEnum b : DecisionMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DECISION_METHOD = "decisionMethod";
  private DecisionMethodEnum decisionMethod;

  public static final String JSON_PROPERTY_DECISION_USER_ID = "decisionUserId";
  private String decisionUserId;

  public static final String JSON_PROPERTY_DECISION_REASON = "decisionReason";
  private String decisionReason;

  public static final String JSON_PROPERTY_DECISION_DATE_TIME = "decisionDateTime";
  private OffsetDateTime decisionDateTime;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

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

  public static final String JSON_PROPERTY_EVALUATION_FLAGS = "evaluationFlags";
  private List<String> evaluationFlags;

  public static final String JSON_PROPERTY_IP_LOCATION_DETAILS = "ipLocationDetails";
  private Object ipLocationDetails;

  public static final String JSON_PROPERTY_PHONE_LOCATION_DETAILS = "phoneLocationDetails";
  private Object phoneLocationDetails;

  public static final String JSON_PROPERTY_ARCHIVED = "archived";
  private Boolean archived;

  public TrustApplicationAllOfAttributes() { 
  }

  public TrustApplicationAllOfAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
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


  public TrustApplicationAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TrustApplicationAllOfAttributes status(ApplicationStatus status) {
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

  public ApplicationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ApplicationStatus status) {
    this.status = status;
  }


  public TrustApplicationAllOfAttributes message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public TrustApplicationAllOfAttributes evaluationOutcome(String evaluationOutcome) {
    this.evaluationOutcome = evaluationOutcome;
    return this;
  }

   /**
   * Get evaluationOutcome
   * @return evaluationOutcome
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEvaluationOutcome() {
    return evaluationOutcome;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATION_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvaluationOutcome(String evaluationOutcome) {
    this.evaluationOutcome = evaluationOutcome;
  }


  public TrustApplicationAllOfAttributes evaluationId(String evaluationId) {
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


  public TrustApplicationAllOfAttributes evaluationEntityId(String evaluationEntityId) {
    this.evaluationEntityId = evaluationEntityId;
    return this;
  }

   /**
   * Get evaluationEntityId
   * @return evaluationEntityId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVALUATION_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEvaluationEntityId() {
    return evaluationEntityId;
  }


  @JsonProperty(JSON_PROPERTY_EVALUATION_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvaluationEntityId(String evaluationEntityId) {
    this.evaluationEntityId = evaluationEntityId;
  }


  public TrustApplicationAllOfAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TrustApplicationAllOfAttributes dateOfIncorporation(LocalDate dateOfIncorporation) {
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


  public TrustApplicationAllOfAttributes stateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }


  public TrustApplicationAllOfAttributes revocability(Revocability revocability) {
    this.revocability = revocability;
    return this;
  }

   /**
   * Get revocability
   * @return revocability
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVOCABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Revocability getRevocability() {
    return revocability;
  }


  @JsonProperty(JSON_PROPERTY_REVOCABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevocability(Revocability revocability) {
    this.revocability = revocability;
  }


  public TrustApplicationAllOfAttributes sourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceOfFunds getSourceOfFunds() {
    return sourceOfFunds;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public TrustApplicationAllOfAttributes taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public TrustApplicationAllOfAttributes contact(TrustContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TrustContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContact(TrustContact contact) {
    this.contact = contact;
  }


  public TrustApplicationAllOfAttributes trustees(List<Trustee> trustees) {
    this.trustees = trustees;
    return this;
  }

  public TrustApplicationAllOfAttributes addTrusteesItem(Trustee trusteesItem) {
    if (this.trustees == null) {
      this.trustees = new ArrayList<>();
    }
    this.trustees.add(trusteesItem);
    return this;
  }

   /**
   * Get trustees
   * @return trustees
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUSTEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Trustee> getTrustees() {
    return trustees;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrustees(List<Trustee> trustees) {
    this.trustees = trustees;
  }


  public TrustApplicationAllOfAttributes grantor(Grantor grantor) {
    this.grantor = grantor;
    return this;
  }

   /**
   * Get grantor
   * @return grantor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Grantor getGrantor() {
    return grantor;
  }


  @JsonProperty(JSON_PROPERTY_GRANTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantor(Grantor grantor) {
    this.grantor = grantor;
  }


  public TrustApplicationAllOfAttributes ip(String ip) {
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


  public TrustApplicationAllOfAttributes decisionMethod(DecisionMethodEnum decisionMethod) {
    this.decisionMethod = decisionMethod;
    return this;
  }

   /**
   * Get decisionMethod
   * @return decisionMethod
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DecisionMethodEnum getDecisionMethod() {
    return decisionMethod;
  }


  @JsonProperty(JSON_PROPERTY_DECISION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecisionMethod(DecisionMethodEnum decisionMethod) {
    this.decisionMethod = decisionMethod;
  }


  public TrustApplicationAllOfAttributes decisionUserId(String decisionUserId) {
    this.decisionUserId = decisionUserId;
    return this;
  }

   /**
   * Get decisionUserId
   * @return decisionUserId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDecisionUserId() {
    return decisionUserId;
  }


  @JsonProperty(JSON_PROPERTY_DECISION_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecisionUserId(String decisionUserId) {
    this.decisionUserId = decisionUserId;
  }


  public TrustApplicationAllOfAttributes decisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
    return this;
  }

   /**
   * Get decisionReason
   * @return decisionReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDecisionReason() {
    return decisionReason;
  }


  @JsonProperty(JSON_PROPERTY_DECISION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
  }


  public TrustApplicationAllOfAttributes decisionDateTime(OffsetDateTime decisionDateTime) {
    this.decisionDateTime = decisionDateTime;
    return this;
  }

   /**
   * Get decisionDateTime
   * @return decisionDateTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDecisionDateTime() {
    return decisionDateTime;
  }


  @JsonProperty(JSON_PROPERTY_DECISION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecisionDateTime(OffsetDateTime decisionDateTime) {
    this.decisionDateTime = decisionDateTime;
  }


  public TrustApplicationAllOfAttributes tags(Object tags) {
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


  public TrustApplicationAllOfAttributes riskRate(RiskRateEnum riskRate) {
    this.riskRate = riskRate;
    return this;
  }

   /**
   * Get riskRate
   * @return riskRate
  **/
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


  public TrustApplicationAllOfAttributes evaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
    return this;
  }

  public TrustApplicationAllOfAttributes addEvaluationFlagsItem(String evaluationFlagsItem) {
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


  public TrustApplicationAllOfAttributes ipLocationDetails(Object ipLocationDetails) {
    this.ipLocationDetails = ipLocationDetails;
    return this;
  }

   /**
   * Get ipLocationDetails
   * @return ipLocationDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_LOCATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getIpLocationDetails() {
    return ipLocationDetails;
  }


  @JsonProperty(JSON_PROPERTY_IP_LOCATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpLocationDetails(Object ipLocationDetails) {
    this.ipLocationDetails = ipLocationDetails;
  }


  public TrustApplicationAllOfAttributes phoneLocationDetails(Object phoneLocationDetails) {
    this.phoneLocationDetails = phoneLocationDetails;
    return this;
  }

   /**
   * Get phoneLocationDetails
   * @return phoneLocationDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_LOCATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPhoneLocationDetails() {
    return phoneLocationDetails;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_LOCATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneLocationDetails(Object phoneLocationDetails) {
    this.phoneLocationDetails = phoneLocationDetails;
  }


  public TrustApplicationAllOfAttributes archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getArchived() {
    return archived;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  /**
   * Return true if this TrustApplication_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustApplicationAllOfAttributes trustApplicationAllOfAttributes = (TrustApplicationAllOfAttributes) o;
    return Objects.equals(this.createdAt, trustApplicationAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, trustApplicationAllOfAttributes.updatedAt) &&
        Objects.equals(this.status, trustApplicationAllOfAttributes.status) &&
        Objects.equals(this.message, trustApplicationAllOfAttributes.message) &&
        Objects.equals(this.evaluationOutcome, trustApplicationAllOfAttributes.evaluationOutcome) &&
        Objects.equals(this.evaluationId, trustApplicationAllOfAttributes.evaluationId) &&
        Objects.equals(this.evaluationEntityId, trustApplicationAllOfAttributes.evaluationEntityId) &&
        Objects.equals(this.name, trustApplicationAllOfAttributes.name) &&
        Objects.equals(this.dateOfIncorporation, trustApplicationAllOfAttributes.dateOfIncorporation) &&
        Objects.equals(this.stateOfIncorporation, trustApplicationAllOfAttributes.stateOfIncorporation) &&
        Objects.equals(this.revocability, trustApplicationAllOfAttributes.revocability) &&
        Objects.equals(this.sourceOfFunds, trustApplicationAllOfAttributes.sourceOfFunds) &&
        Objects.equals(this.taxId, trustApplicationAllOfAttributes.taxId) &&
        Objects.equals(this.contact, trustApplicationAllOfAttributes.contact) &&
        Objects.equals(this.trustees, trustApplicationAllOfAttributes.trustees) &&
        Objects.equals(this.grantor, trustApplicationAllOfAttributes.grantor) &&
        Objects.equals(this.ip, trustApplicationAllOfAttributes.ip) &&
        Objects.equals(this.decisionMethod, trustApplicationAllOfAttributes.decisionMethod) &&
        Objects.equals(this.decisionUserId, trustApplicationAllOfAttributes.decisionUserId) &&
        Objects.equals(this.decisionReason, trustApplicationAllOfAttributes.decisionReason) &&
        Objects.equals(this.decisionDateTime, trustApplicationAllOfAttributes.decisionDateTime) &&
        Objects.equals(this.tags, trustApplicationAllOfAttributes.tags) &&
        Objects.equals(this.riskRate, trustApplicationAllOfAttributes.riskRate) &&
        Objects.equals(this.evaluationFlags, trustApplicationAllOfAttributes.evaluationFlags) &&
        Objects.equals(this.ipLocationDetails, trustApplicationAllOfAttributes.ipLocationDetails) &&
        Objects.equals(this.phoneLocationDetails, trustApplicationAllOfAttributes.phoneLocationDetails) &&
        Objects.equals(this.archived, trustApplicationAllOfAttributes.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, status, message, evaluationOutcome, evaluationId, evaluationEntityId, name, dateOfIncorporation, stateOfIncorporation, revocability, sourceOfFunds, taxId, contact, trustees, grantor, ip, decisionMethod, decisionUserId, decisionReason, decisionDateTime, tags, riskRate, evaluationFlags, ipLocationDetails, phoneLocationDetails, archived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustApplicationAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    evaluationOutcome: ").append(toIndentedString(evaluationOutcome)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationEntityId: ").append(toIndentedString(evaluationEntityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    revocability: ").append(toIndentedString(revocability)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    trustees: ").append(toIndentedString(trustees)).append("\n");
    sb.append("    grantor: ").append(toIndentedString(grantor)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    decisionMethod: ").append(toIndentedString(decisionMethod)).append("\n");
    sb.append("    decisionUserId: ").append(toIndentedString(decisionUserId)).append("\n");
    sb.append("    decisionReason: ").append(toIndentedString(decisionReason)).append("\n");
    sb.append("    decisionDateTime: ").append(toIndentedString(decisionDateTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    riskRate: ").append(toIndentedString(riskRate)).append("\n");
    sb.append("    evaluationFlags: ").append(toIndentedString(evaluationFlags)).append("\n");
    sb.append("    ipLocationDetails: ").append(toIndentedString(ipLocationDetails)).append("\n");
    sb.append("    phoneLocationDetails: ").append(toIndentedString(phoneLocationDetails)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationOutcome` to the URL query string
    if (getEvaluationOutcome() != null) {
      joiner.add(String.format("%sevaluationOutcome%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvaluationOutcome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationId` to the URL query string
    if (getEvaluationId() != null) {
      joiner.add(String.format("%sevaluationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvaluationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationEntityId` to the URL query string
    if (getEvaluationEntityId() != null) {
      joiner.add(String.format("%sevaluationEntityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvaluationEntityId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfIncorporation` to the URL query string
    if (getDateOfIncorporation() != null) {
      joiner.add(String.format("%sdateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stateOfIncorporation` to the URL query string
    if (getStateOfIncorporation() != null) {
      joiner.add(String.format("%sstateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `revocability` to the URL query string
    if (getRevocability() != null) {
      joiner.add(String.format("%srevocability%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevocability()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sourceOfFunds` to the URL query string
    if (getSourceOfFunds() != null) {
      joiner.add(String.format("%ssourceOfFunds%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceOfFunds()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `taxId` to the URL query string
    if (getTaxId() != null) {
      joiner.add(String.format("%staxId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(getContact().toUrlQueryString(prefix + "contact" + suffix));
    }

    // add `trustees` to the URL query string
    if (getTrustees() != null) {
      for (int i = 0; i < getTrustees().size(); i++) {
        if (getTrustees().get(i) != null) {
          joiner.add(getTrustees().get(i).toUrlQueryString(String.format("%strustees%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `grantor` to the URL query string
    if (getGrantor() != null) {
      joiner.add(getGrantor().toUrlQueryString(prefix + "grantor" + suffix));
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decisionMethod` to the URL query string
    if (getDecisionMethod() != null) {
      joiner.add(String.format("%sdecisionMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecisionMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decisionUserId` to the URL query string
    if (getDecisionUserId() != null) {
      joiner.add(String.format("%sdecisionUserId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecisionUserId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decisionReason` to the URL query string
    if (getDecisionReason() != null) {
      joiner.add(String.format("%sdecisionReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecisionReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decisionDateTime` to the URL query string
    if (getDecisionDateTime() != null) {
      joiner.add(String.format("%sdecisionDateTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDecisionDateTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `riskRate` to the URL query string
    if (getRiskRate() != null) {
      joiner.add(String.format("%sriskRate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRiskRate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `evaluationFlags` to the URL query string
    if (getEvaluationFlags() != null) {
      for (int i = 0; i < getEvaluationFlags().size(); i++) {
        joiner.add(String.format("%sevaluationFlags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getEvaluationFlags().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `ipLocationDetails` to the URL query string
    if (getIpLocationDetails() != null) {
      joiner.add(String.format("%sipLocationDetails%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIpLocationDetails()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phoneLocationDetails` to the URL query string
    if (getPhoneLocationDetails() != null) {
      joiner.add(String.format("%sphoneLocationDetails%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneLocationDetails()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `archived` to the URL query string
    if (getArchived() != null) {
      joiner.add(String.format("%sarchived%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getArchived()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
