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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import unit.java.sdk.model.PaymentCounterparty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AchPaymentAllOfAttributes
 */
@JsonPropertyOrder({
  AchPaymentAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  AchPaymentAllOfAttributes.JSON_PROPERTY_AMOUNT,
  AchPaymentAllOfAttributes.JSON_PROPERTY_DIRECTION,
  AchPaymentAllOfAttributes.JSON_PROPERTY_DESCRIPTION,
  AchPaymentAllOfAttributes.JSON_PROPERTY_ADDENDA,
  AchPaymentAllOfAttributes.JSON_PROPERTY_COUNTERPARTY,
  AchPaymentAllOfAttributes.JSON_PROPERTY_TAGS,
  AchPaymentAllOfAttributes.JSON_PROPERTY_STATUS,
  AchPaymentAllOfAttributes.JSON_PROPERTY_SETTLEMENT_DATE,
  AchPaymentAllOfAttributes.JSON_PROPERTY_REASON,
  AchPaymentAllOfAttributes.JSON_PROPERTY_EXPECTED_COMPLETION_DATE,
  AchPaymentAllOfAttributes.JSON_PROPERTY_SEC_CODE,
  AchPaymentAllOfAttributes.JSON_PROPERTY_TRACE_NUMBER,
  AchPaymentAllOfAttributes.JSON_PROPERTY_SAME_DAY,
  AchPaymentAllOfAttributes.JSON_PROPERTY_COUNTERPARTY_VERIFICATION_METHOD,
  AchPaymentAllOfAttributes.JSON_PROPERTY_CLEARING_DAYS_OVERRIDE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AchPaymentAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    CREDIT("Credit"),
    
    DEBIT("Debit");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private PaymentCounterparty counterparty;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    REJECTED("Rejected"),
    
    CLEARING("Clearing"),
    
    SENT("Sent"),
    
    CANCELED("Canceled"),
    
    RETURNED("Returned");

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

  public static final String JSON_PROPERTY_SETTLEMENT_DATE = "settlementDate";
  private LocalDate settlementDate;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_EXPECTED_COMPLETION_DATE = "expectedCompletionDate";
  private LocalDate expectedCompletionDate;

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private String secCode;

  public static final String JSON_PROPERTY_TRACE_NUMBER = "traceNumber";
  private String traceNumber;

  public static final String JSON_PROPERTY_SAME_DAY = "sameDay";
  private Boolean sameDay;

  public static final String JSON_PROPERTY_COUNTERPARTY_VERIFICATION_METHOD = "counterpartyVerificationMethod";
  private String counterpartyVerificationMethod;

  public static final String JSON_PROPERTY_CLEARING_DAYS_OVERRIDE = "clearingDaysOverride";
  private Integer clearingDaysOverride;

  public AchPaymentAllOfAttributes() { 
  }

  public AchPaymentAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public AchPaymentAllOfAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * minimum: 1
   * @return amount
   */
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


  public AchPaymentAllOfAttributes direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public AchPaymentAllOfAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public AchPaymentAllOfAttributes addenda(String addenda) {
    this.addenda = addenda;
    return this;
  }

  /**
   * Get addenda
   * @return addenda
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDENDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddenda() {
    return addenda;
  }


  @JsonProperty(JSON_PROPERTY_ADDENDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddenda(String addenda) {
    this.addenda = addenda;
  }


  public AchPaymentAllOfAttributes counterparty(PaymentCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

  /**
   * Get counterparty
   * @return counterparty
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(PaymentCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public AchPaymentAllOfAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public AchPaymentAllOfAttributes putTagsItem(String key, String tagsItem) {
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


  public AchPaymentAllOfAttributes status(StatusEnum status) {
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


  public AchPaymentAllOfAttributes settlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  /**
   * Get settlementDate
   * @return settlementDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getSettlementDate() {
    return settlementDate;
  }


  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }


  public AchPaymentAllOfAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
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


  public AchPaymentAllOfAttributes expectedCompletionDate(LocalDate expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
    return this;
  }

  /**
   * Get expectedCompletionDate
   * @return expectedCompletionDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_COMPLETION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getExpectedCompletionDate() {
    return expectedCompletionDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_COMPLETION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedCompletionDate(LocalDate expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }


  public AchPaymentAllOfAttributes secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

  /**
   * Get secCode
   * @return secCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecCode() {
    return secCode;
  }


  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }


  public AchPaymentAllOfAttributes traceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
    return this;
  }

  /**
   * Get traceNumber
   * @return traceNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTraceNumber() {
    return traceNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
  }


  public AchPaymentAllOfAttributes sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

  /**
   * Get sameDay
   * @return sameDay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSameDay() {
    return sameDay;
  }


  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }


  public AchPaymentAllOfAttributes counterpartyVerificationMethod(String counterpartyVerificationMethod) {
    this.counterpartyVerificationMethod = counterpartyVerificationMethod;
    return this;
  }

  /**
   * Get counterpartyVerificationMethod
   * @return counterpartyVerificationMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_VERIFICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCounterpartyVerificationMethod() {
    return counterpartyVerificationMethod;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_VERIFICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyVerificationMethod(String counterpartyVerificationMethod) {
    this.counterpartyVerificationMethod = counterpartyVerificationMethod;
  }


  public AchPaymentAllOfAttributes clearingDaysOverride(Integer clearingDaysOverride) {
    this.clearingDaysOverride = clearingDaysOverride;
    return this;
  }

  /**
   * Get clearingDaysOverride
   * @return clearingDaysOverride
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLEARING_DAYS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getClearingDaysOverride() {
    return clearingDaysOverride;
  }


  @JsonProperty(JSON_PROPERTY_CLEARING_DAYS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearingDaysOverride(Integer clearingDaysOverride) {
    this.clearingDaysOverride = clearingDaysOverride;
  }


  /**
   * Return true if this AchPayment_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchPaymentAllOfAttributes achPaymentAllOfAttributes = (AchPaymentAllOfAttributes) o;
    return Objects.equals(this.createdAt, achPaymentAllOfAttributes.createdAt) &&
        Objects.equals(this.amount, achPaymentAllOfAttributes.amount) &&
        Objects.equals(this.direction, achPaymentAllOfAttributes.direction) &&
        Objects.equals(this.description, achPaymentAllOfAttributes.description) &&
        Objects.equals(this.addenda, achPaymentAllOfAttributes.addenda) &&
        Objects.equals(this.counterparty, achPaymentAllOfAttributes.counterparty) &&
        Objects.equals(this.tags, achPaymentAllOfAttributes.tags) &&
        Objects.equals(this.status, achPaymentAllOfAttributes.status) &&
        Objects.equals(this.settlementDate, achPaymentAllOfAttributes.settlementDate) &&
        Objects.equals(this.reason, achPaymentAllOfAttributes.reason) &&
        Objects.equals(this.expectedCompletionDate, achPaymentAllOfAttributes.expectedCompletionDate) &&
        Objects.equals(this.secCode, achPaymentAllOfAttributes.secCode) &&
        Objects.equals(this.traceNumber, achPaymentAllOfAttributes.traceNumber) &&
        Objects.equals(this.sameDay, achPaymentAllOfAttributes.sameDay) &&
        Objects.equals(this.counterpartyVerificationMethod, achPaymentAllOfAttributes.counterpartyVerificationMethod) &&
        Objects.equals(this.clearingDaysOverride, achPaymentAllOfAttributes.clearingDaysOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, amount, direction, description, addenda, counterparty, tags, status, settlementDate, reason, expectedCompletionDate, secCode, traceNumber, sameDay, counterpartyVerificationMethod, clearingDaysOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchPaymentAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
    sb.append("    counterpartyVerificationMethod: ").append(toIndentedString(counterpartyVerificationMethod)).append("\n");
    sb.append("    clearingDaysOverride: ").append(toIndentedString(clearingDaysOverride)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `settlementDate` to the URL query string
    if (getSettlementDate() != null) {
      joiner.add(String.format("%ssettlementDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSettlementDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expectedCompletionDate` to the URL query string
    if (getExpectedCompletionDate() != null) {
      joiner.add(String.format("%sexpectedCompletionDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpectedCompletionDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `traceNumber` to the URL query string
    if (getTraceNumber() != null) {
      joiner.add(String.format("%straceNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTraceNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sameDay` to the URL query string
    if (getSameDay() != null) {
      joiner.add(String.format("%ssameDay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSameDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterpartyVerificationMethod` to the URL query string
    if (getCounterpartyVerificationMethod() != null) {
      joiner.add(String.format("%scounterpartyVerificationMethod%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCounterpartyVerificationMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `clearingDaysOverride` to the URL query string
    if (getClearingDaysOverride() != null) {
      joiner.add(String.format("%sclearingDaysOverride%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getClearingDaysOverride()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

