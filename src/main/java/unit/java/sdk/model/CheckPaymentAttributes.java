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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import unit.java.sdk.model.CheckPaymentAttributesCounterparty;
import unit.java.sdk.model.ReturnReason;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CheckPaymentAttributes
 */
@JsonPropertyOrder({
  CheckPaymentAttributes.JSON_PROPERTY_CREATED_AT,
  CheckPaymentAttributes.JSON_PROPERTY_UPDATED_AT,
  CheckPaymentAttributes.JSON_PROPERTY_AMOUNT,
  CheckPaymentAttributes.JSON_PROPERTY_RETURN_CUTOFF_TIME,
  CheckPaymentAttributes.JSON_PROPERTY_STATUS,
  CheckPaymentAttributes.JSON_PROPERTY_MEMO,
  CheckPaymentAttributes.JSON_PROPERTY_DELIVERY_STATUS,
  CheckPaymentAttributes.JSON_PROPERTY_SEND_AT,
  CheckPaymentAttributes.JSON_PROPERTY_COUNTERPARTY,
  CheckPaymentAttributes.JSON_PROPERTY_TRACKED_AT,
  CheckPaymentAttributes.JSON_PROPERTY_POSTAL_CODE,
  CheckPaymentAttributes.JSON_PROPERTY_EXPECTED_DELIVERY,
  CheckPaymentAttributes.JSON_PROPERTY_ORIGINATED,
  CheckPaymentAttributes.JSON_PROPERTY_EXPIRATION_DATE,
  CheckPaymentAttributes.JSON_PROPERTY_REJECT_REASON,
  CheckPaymentAttributes.JSON_PROPERTY_TAGS,
  CheckPaymentAttributes.JSON_PROPERTY_DESCRIPTION,
  CheckPaymentAttributes.JSON_PROPERTY_RETURN_REASON,
  CheckPaymentAttributes.JSON_PROPERTY_PENDING_REVIEW_REASONS,
  CheckPaymentAttributes.JSON_PROPERTY_CHECK_NUMBER,
  CheckPaymentAttributes.JSON_PROPERTY_ON_US_AUXILIARY,
  CheckPaymentAttributes.JSON_PROPERTY_ON_US,
  CheckPaymentAttributes.JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER,
  CheckPaymentAttributes.JSON_PROPERTY_ADDITIONAL_VERIFICATION_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckPaymentAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_RETURN_CUTOFF_TIME = "returnCutoffTime";
  private OffsetDateTime returnCutoffTime;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    MARKEDFORRETURN("MarkedForReturn"),
    
    RETURNED("Returned"),
    
    PROCESSED("Processed"),
    
    PENDINGREVIEW("PendingReview");

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

  public static final String JSON_PROPERTY_MEMO = "memo";
  private String memo;

  /**
   * Gets or Sets deliveryStatus
   */
  public enum DeliveryStatusEnum {
    MAILED("Mailed"),
    
    INLOCALAREA("InLocalArea"),
    
    DELIVERED("Delivered"),
    
    REROUTED("Rerouted"),
    
    RETURNEDTOSENDER("ReturnedToSender");

    private String value;

    DeliveryStatusEnum(String value) {
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
    public static DeliveryStatusEnum fromValue(String value) {
      for (DeliveryStatusEnum b : DeliveryStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private DeliveryStatusEnum deliveryStatus;

  public static final String JSON_PROPERTY_SEND_AT = "sendAt";
  private OffsetDateTime sendAt;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private CheckPaymentAttributesCounterparty counterparty;

  public static final String JSON_PROPERTY_TRACKED_AT = "trackedAt";
  private OffsetDateTime trackedAt;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_EXPECTED_DELIVERY = "expectedDelivery";
  private LocalDate expectedDelivery;

  public static final String JSON_PROPERTY_ORIGINATED = "originated";
  private Boolean originated;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private LocalDate expirationDate;

  public static final String JSON_PROPERTY_REJECT_REASON = "rejectReason";
  private String rejectReason;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_RETURN_REASON = "returnReason";
  private ReturnReason returnReason;

  /**
   * Gets or Sets pendingReviewReasons
   */
  public enum PendingReviewReasonsEnum {
    NAMEMISSMATCH("NameMissMatch"),
    
    SOFTLIMIT("SoftLimit");

    private String value;

    PendingReviewReasonsEnum(String value) {
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
    public static PendingReviewReasonsEnum fromValue(String value) {
      for (PendingReviewReasonsEnum b : PendingReviewReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PENDING_REVIEW_REASONS = "pendingReviewReasons";
  private List<PendingReviewReasonsEnum> pendingReviewReasons;

  public static final String JSON_PROPERTY_CHECK_NUMBER = "checkNumber";
  private String checkNumber;

  public static final String JSON_PROPERTY_ON_US_AUXILIARY = "onUsAuxiliary";
  private String onUsAuxiliary;

  public static final String JSON_PROPERTY_ON_US = "onUs";
  private String onUs;

  public static final String JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER = "counterpartyRoutingNumber";
  private String counterpartyRoutingNumber;

  /**
   * Gets or Sets additionalVerificationStatus
   */
  public enum AdditionalVerificationStatusEnum {
    REQUIRED("Required"),
    
    NOTREQUIRED("NotRequired"),
    
    APPROVED("Approved");

    private String value;

    AdditionalVerificationStatusEnum(String value) {
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
    public static AdditionalVerificationStatusEnum fromValue(String value) {
      for (AdditionalVerificationStatusEnum b : AdditionalVerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADDITIONAL_VERIFICATION_STATUS = "additionalVerificationStatus";
  private AdditionalVerificationStatusEnum additionalVerificationStatus;

  public CheckPaymentAttributes() { 
  }

  public CheckPaymentAttributes createdAt(OffsetDateTime createdAt) {
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


  public CheckPaymentAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CheckPaymentAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 1
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public CheckPaymentAttributes returnCutoffTime(OffsetDateTime returnCutoffTime) {
    this.returnCutoffTime = returnCutoffTime;
    return this;
  }

   /**
   * Get returnCutoffTime
   * @return returnCutoffTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CUTOFF_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReturnCutoffTime() {
    return returnCutoffTime;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_CUTOFF_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnCutoffTime(OffsetDateTime returnCutoffTime) {
    this.returnCutoffTime = returnCutoffTime;
  }


  public CheckPaymentAttributes status(StatusEnum status) {
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

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CheckPaymentAttributes memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemo() {
    return memo;
  }


  @JsonProperty(JSON_PROPERTY_MEMO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemo(String memo) {
    this.memo = memo;
  }


  public CheckPaymentAttributes deliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryStatusEnum getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(DeliveryStatusEnum deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public CheckPaymentAttributes sendAt(OffsetDateTime sendAt) {
    this.sendAt = sendAt;
    return this;
  }

   /**
   * Get sendAt
   * @return sendAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSendAt() {
    return sendAt;
  }


  @JsonProperty(JSON_PROPERTY_SEND_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendAt(OffsetDateTime sendAt) {
    this.sendAt = sendAt;
  }


  public CheckPaymentAttributes counterparty(CheckPaymentAttributesCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckPaymentAttributesCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(CheckPaymentAttributesCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public CheckPaymentAttributes trackedAt(OffsetDateTime trackedAt) {
    this.trackedAt = trackedAt;
    return this;
  }

   /**
   * Get trackedAt
   * @return trackedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTrackedAt() {
    return trackedAt;
  }


  @JsonProperty(JSON_PROPERTY_TRACKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackedAt(OffsetDateTime trackedAt) {
    this.trackedAt = trackedAt;
  }


  public CheckPaymentAttributes postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public CheckPaymentAttributes expectedDelivery(LocalDate expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
    return this;
  }

   /**
   * Get expectedDelivery
   * @return expectedDelivery
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getExpectedDelivery() {
    return expectedDelivery;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedDelivery(LocalDate expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }


  public CheckPaymentAttributes originated(Boolean originated) {
    this.originated = originated;
    return this;
  }

   /**
   * Get originated
   * @return originated
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORIGINATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getOriginated() {
    return originated;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginated(Boolean originated) {
    this.originated = originated;
  }


  public CheckPaymentAttributes expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CheckPaymentAttributes rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * Get rejectReason
   * @return rejectReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRejectReason() {
    return rejectReason;
  }


  @JsonProperty(JSON_PROPERTY_REJECT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public CheckPaymentAttributes tags(Object tags) {
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


  public CheckPaymentAttributes description(String description) {
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


  public CheckPaymentAttributes returnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
    return this;
  }

   /**
   * Get returnReason
   * @return returnReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnReason getReturnReason() {
    return returnReason;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnReason(ReturnReason returnReason) {
    this.returnReason = returnReason;
  }


  public CheckPaymentAttributes pendingReviewReasons(List<PendingReviewReasonsEnum> pendingReviewReasons) {
    this.pendingReviewReasons = pendingReviewReasons;
    return this;
  }

  public CheckPaymentAttributes addPendingReviewReasonsItem(PendingReviewReasonsEnum pendingReviewReasonsItem) {
    if (this.pendingReviewReasons == null) {
      this.pendingReviewReasons = new ArrayList<>();
    }
    this.pendingReviewReasons.add(pendingReviewReasonsItem);
    return this;
  }

   /**
   * Get pendingReviewReasons
   * @return pendingReviewReasons
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING_REVIEW_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PendingReviewReasonsEnum> getPendingReviewReasons() {
    return pendingReviewReasons;
  }


  @JsonProperty(JSON_PROPERTY_PENDING_REVIEW_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPendingReviewReasons(List<PendingReviewReasonsEnum> pendingReviewReasons) {
    this.pendingReviewReasons = pendingReviewReasons;
  }


  public CheckPaymentAttributes checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckNumber() {
    return checkNumber;
  }


  @JsonProperty(JSON_PROPERTY_CHECK_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public CheckPaymentAttributes onUsAuxiliary(String onUsAuxiliary) {
    this.onUsAuxiliary = onUsAuxiliary;
    return this;
  }

   /**
   * Get onUsAuxiliary
   * @return onUsAuxiliary
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_US_AUXILIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOnUsAuxiliary() {
    return onUsAuxiliary;
  }


  @JsonProperty(JSON_PROPERTY_ON_US_AUXILIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnUsAuxiliary(String onUsAuxiliary) {
    this.onUsAuxiliary = onUsAuxiliary;
  }


  public CheckPaymentAttributes onUs(String onUs) {
    this.onUs = onUs;
    return this;
  }

   /**
   * Get onUs
   * @return onUs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_US)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOnUs() {
    return onUs;
  }


  @JsonProperty(JSON_PROPERTY_ON_US)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnUs(String onUs) {
    this.onUs = onUs;
  }


  public CheckPaymentAttributes counterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
    return this;
  }

   /**
   * Get counterpartyRoutingNumber
   * @return counterpartyRoutingNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCounterpartyRoutingNumber() {
    return counterpartyRoutingNumber;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
  }


  public CheckPaymentAttributes additionalVerificationStatus(AdditionalVerificationStatusEnum additionalVerificationStatus) {
    this.additionalVerificationStatus = additionalVerificationStatus;
    return this;
  }

   /**
   * Get additionalVerificationStatus
   * @return additionalVerificationStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdditionalVerificationStatusEnum getAdditionalVerificationStatus() {
    return additionalVerificationStatus;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalVerificationStatus(AdditionalVerificationStatusEnum additionalVerificationStatus) {
    this.additionalVerificationStatus = additionalVerificationStatus;
  }


  /**
   * Return true if this CheckPayment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPaymentAttributes checkPaymentAttributes = (CheckPaymentAttributes) o;
    return Objects.equals(this.createdAt, checkPaymentAttributes.createdAt) &&
        Objects.equals(this.updatedAt, checkPaymentAttributes.updatedAt) &&
        Objects.equals(this.amount, checkPaymentAttributes.amount) &&
        Objects.equals(this.returnCutoffTime, checkPaymentAttributes.returnCutoffTime) &&
        Objects.equals(this.status, checkPaymentAttributes.status) &&
        Objects.equals(this.memo, checkPaymentAttributes.memo) &&
        Objects.equals(this.deliveryStatus, checkPaymentAttributes.deliveryStatus) &&
        Objects.equals(this.sendAt, checkPaymentAttributes.sendAt) &&
        Objects.equals(this.counterparty, checkPaymentAttributes.counterparty) &&
        Objects.equals(this.trackedAt, checkPaymentAttributes.trackedAt) &&
        Objects.equals(this.postalCode, checkPaymentAttributes.postalCode) &&
        Objects.equals(this.expectedDelivery, checkPaymentAttributes.expectedDelivery) &&
        Objects.equals(this.originated, checkPaymentAttributes.originated) &&
        Objects.equals(this.expirationDate, checkPaymentAttributes.expirationDate) &&
        Objects.equals(this.rejectReason, checkPaymentAttributes.rejectReason) &&
        Objects.equals(this.tags, checkPaymentAttributes.tags) &&
        Objects.equals(this.description, checkPaymentAttributes.description) &&
        Objects.equals(this.returnReason, checkPaymentAttributes.returnReason) &&
        Objects.equals(this.pendingReviewReasons, checkPaymentAttributes.pendingReviewReasons) &&
        Objects.equals(this.checkNumber, checkPaymentAttributes.checkNumber) &&
        Objects.equals(this.onUsAuxiliary, checkPaymentAttributes.onUsAuxiliary) &&
        Objects.equals(this.onUs, checkPaymentAttributes.onUs) &&
        Objects.equals(this.counterpartyRoutingNumber, checkPaymentAttributes.counterpartyRoutingNumber) &&
        Objects.equals(this.additionalVerificationStatus, checkPaymentAttributes.additionalVerificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, amount, returnCutoffTime, status, memo, deliveryStatus, sendAt, counterparty, trackedAt, postalCode, expectedDelivery, originated, expirationDate, rejectReason, tags, description, returnReason, pendingReviewReasons, checkNumber, onUsAuxiliary, onUs, counterpartyRoutingNumber, additionalVerificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPaymentAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    returnCutoffTime: ").append(toIndentedString(returnCutoffTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    trackedAt: ").append(toIndentedString(trackedAt)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    expectedDelivery: ").append(toIndentedString(expectedDelivery)).append("\n");
    sb.append("    originated: ").append(toIndentedString(originated)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    pendingReviewReasons: ").append(toIndentedString(pendingReviewReasons)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    onUsAuxiliary: ").append(toIndentedString(onUsAuxiliary)).append("\n");
    sb.append("    onUs: ").append(toIndentedString(onUs)).append("\n");
    sb.append("    counterpartyRoutingNumber: ").append(toIndentedString(counterpartyRoutingNumber)).append("\n");
    sb.append("    additionalVerificationStatus: ").append(toIndentedString(additionalVerificationStatus)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `returnCutoffTime` to the URL query string
    if (getReturnCutoffTime() != null) {
      joiner.add(String.format("%sreturnCutoffTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReturnCutoffTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `memo` to the URL query string
    if (getMemo() != null) {
      joiner.add(String.format("%smemo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMemo()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deliveryStatus` to the URL query string
    if (getDeliveryStatus() != null) {
      joiner.add(String.format("%sdeliveryStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeliveryStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sendAt` to the URL query string
    if (getSendAt() != null) {
      joiner.add(String.format("%ssendAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSendAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `trackedAt` to the URL query string
    if (getTrackedAt() != null) {
      joiner.add(String.format("%strackedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `postalCode` to the URL query string
    if (getPostalCode() != null) {
      joiner.add(String.format("%spostalCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostalCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expectedDelivery` to the URL query string
    if (getExpectedDelivery() != null) {
      joiner.add(String.format("%sexpectedDelivery%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpectedDelivery()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `originated` to the URL query string
    if (getOriginated() != null) {
      joiner.add(String.format("%soriginated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOriginated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(String.format("%sexpirationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpirationDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `rejectReason` to the URL query string
    if (getRejectReason() != null) {
      joiner.add(String.format("%srejectReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRejectReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `returnReason` to the URL query string
    if (getReturnReason() != null) {
      joiner.add(String.format("%sreturnReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReturnReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pendingReviewReasons` to the URL query string
    if (getPendingReviewReasons() != null) {
      for (int i = 0; i < getPendingReviewReasons().size(); i++) {
        joiner.add(String.format("%spendingReviewReasons%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getPendingReviewReasons().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `checkNumber` to the URL query string
    if (getCheckNumber() != null) {
      joiner.add(String.format("%scheckNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `onUsAuxiliary` to the URL query string
    if (getOnUsAuxiliary() != null) {
      joiner.add(String.format("%sonUsAuxiliary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOnUsAuxiliary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `onUs` to the URL query string
    if (getOnUs() != null) {
      joiner.add(String.format("%sonUs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOnUs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterpartyRoutingNumber` to the URL query string
    if (getCounterpartyRoutingNumber() != null) {
      joiner.add(String.format("%scounterpartyRoutingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCounterpartyRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `additionalVerificationStatus` to the URL query string
    if (getAdditionalVerificationStatus() != null) {
      joiner.add(String.format("%sadditionalVerificationStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdditionalVerificationStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

