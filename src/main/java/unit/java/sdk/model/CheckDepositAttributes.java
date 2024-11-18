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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.CheckDepositCounterparty;
import unit.java.sdk.model.StatusEvent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CheckDepositAttributes
 */
@JsonPropertyOrder({
  CheckDepositAttributes.JSON_PROPERTY_CREATED_AT,
  CheckDepositAttributes.JSON_PROPERTY_SETTLEMENT_DATE,
  CheckDepositAttributes.JSON_PROPERTY_AMOUNT,
  CheckDepositAttributes.JSON_PROPERTY_DESCRIPTION,
  CheckDepositAttributes.JSON_PROPERTY_STATUS,
  CheckDepositAttributes.JSON_PROPERTY_REASON,
  CheckDepositAttributes.JSON_PROPERTY_STATUS_CREATED_AT,
  CheckDepositAttributes.JSON_PROPERTY_STATUS_SET_BY,
  CheckDepositAttributes.JSON_PROPERTY_STATUS_HISTORY,
  CheckDepositAttributes.JSON_PROPERTY_REASON_TEXT,
  CheckDepositAttributes.JSON_PROPERTY_CHECK_NUMBER,
  CheckDepositAttributes.JSON_PROPERTY_VENDOR,
  CheckDepositAttributes.JSON_PROPERTY_COUNTERPARTY,
  CheckDepositAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CheckDepositAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_SETTLEMENT_DATE = "settlementDate";
  private LocalDate settlementDate;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    AWAITING_IMAGES("AwaitingImages"),
    
    AWAITING_FRONT_IMAGE("AwaitingFrontImage"),
    
    AWAITING_BACK_IMAGE("AwaitingBackImage"),
    
    PENDING("Pending"),
    
    PENDING_REVIEW("PendingReview"),
    
    AWAITING_CUSTOMER_CONFIRMATION("AwaitingCustomerConfirmation"),
    
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

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS_CREATED_AT = "statusCreatedAt";
  private OffsetDateTime statusCreatedAt;

  public static final String JSON_PROPERTY_STATUS_SET_BY = "statusSetBy";
  private String statusSetBy;

  public static final String JSON_PROPERTY_STATUS_HISTORY = "statusHistory";
  private List<StatusEvent> statusHistory = new ArrayList<>();

  public static final String JSON_PROPERTY_REASON_TEXT = "reasonText";
  private String reasonText;

  public static final String JSON_PROPERTY_CHECK_NUMBER = "checkNumber";
  private String checkNumber;

  public static final String JSON_PROPERTY_VENDOR = "vendor";
  private String vendor;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private CheckDepositCounterparty counterparty;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public CheckDepositAttributes() { 
  }

  public CheckDepositAttributes createdAt(OffsetDateTime createdAt) {
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


  public CheckDepositAttributes settlementDate(LocalDate settlementDate) {
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


  public CheckDepositAttributes amount(Integer amount) {
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


  public CheckDepositAttributes description(String description) {
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


  public CheckDepositAttributes status(StatusEnum status) {
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


  public CheckDepositAttributes reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }


  public CheckDepositAttributes statusCreatedAt(OffsetDateTime statusCreatedAt) {
    this.statusCreatedAt = statusCreatedAt;
    return this;
  }

  /**
   * Get statusCreatedAt
   * @return statusCreatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStatusCreatedAt() {
    return statusCreatedAt;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCreatedAt(OffsetDateTime statusCreatedAt) {
    this.statusCreatedAt = statusCreatedAt;
  }


  public CheckDepositAttributes statusSetBy(String statusSetBy) {
    this.statusSetBy = statusSetBy;
    return this;
  }

  /**
   * Get statusSetBy
   * @return statusSetBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_SET_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatusSetBy() {
    return statusSetBy;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_SET_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusSetBy(String statusSetBy) {
    this.statusSetBy = statusSetBy;
  }


  public CheckDepositAttributes statusHistory(List<StatusEvent> statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

  public CheckDepositAttributes addStatusHistoryItem(StatusEvent statusHistoryItem) {
    if (this.statusHistory == null) {
      this.statusHistory = new ArrayList<>();
    }
    this.statusHistory.add(statusHistoryItem);
    return this;
  }

  /**
   * Get statusHistory
   * @return statusHistory
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<StatusEvent> getStatusHistory() {
    return statusHistory;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusHistory(List<StatusEvent> statusHistory) {
    this.statusHistory = statusHistory;
  }


  public CheckDepositAttributes reasonText(String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

  /**
   * Get reasonText
   * @return reasonText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReasonText() {
    return reasonText;
  }


  @JsonProperty(JSON_PROPERTY_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  public CheckDepositAttributes checkNumber(String checkNumber) {
    this.checkNumber = checkNumber;
    return this;
  }

  /**
   * Get checkNumber
   * @return checkNumber
   */
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


  public CheckDepositAttributes vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Get vendor
   * @return vendor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVendor() {
    return vendor;
  }


  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public CheckDepositAttributes counterparty(CheckDepositCounterparty counterparty) {
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
  public CheckDepositCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(CheckDepositCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public CheckDepositAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CheckDepositAttributes putTagsItem(String key, String tagsItem) {
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


  /**
   * Return true if this CheckDeposit_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDepositAttributes checkDepositAttributes = (CheckDepositAttributes) o;
    return Objects.equals(this.createdAt, checkDepositAttributes.createdAt) &&
        Objects.equals(this.settlementDate, checkDepositAttributes.settlementDate) &&
        Objects.equals(this.amount, checkDepositAttributes.amount) &&
        Objects.equals(this.description, checkDepositAttributes.description) &&
        Objects.equals(this.status, checkDepositAttributes.status) &&
        equalsNullable(this.reason, checkDepositAttributes.reason) &&
        Objects.equals(this.statusCreatedAt, checkDepositAttributes.statusCreatedAt) &&
        Objects.equals(this.statusSetBy, checkDepositAttributes.statusSetBy) &&
        Objects.equals(this.statusHistory, checkDepositAttributes.statusHistory) &&
        Objects.equals(this.reasonText, checkDepositAttributes.reasonText) &&
        Objects.equals(this.checkNumber, checkDepositAttributes.checkNumber) &&
        Objects.equals(this.vendor, checkDepositAttributes.vendor) &&
        Objects.equals(this.counterparty, checkDepositAttributes.counterparty) &&
        Objects.equals(this.tags, checkDepositAttributes.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, settlementDate, amount, description, status, hashCodeNullable(reason), statusCreatedAt, statusSetBy, statusHistory, reasonText, checkNumber, vendor, counterparty, tags);
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
    sb.append("class CheckDepositAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    statusCreatedAt: ").append(toIndentedString(statusCreatedAt)).append("\n");
    sb.append("    statusSetBy: ").append(toIndentedString(statusSetBy)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `settlementDate` to the URL query string
    if (getSettlementDate() != null) {
      joiner.add(String.format("%ssettlementDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSettlementDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `statusCreatedAt` to the URL query string
    if (getStatusCreatedAt() != null) {
      joiner.add(String.format("%sstatusCreatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatusCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `statusSetBy` to the URL query string
    if (getStatusSetBy() != null) {
      joiner.add(String.format("%sstatusSetBy%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatusSetBy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `statusHistory` to the URL query string
    if (getStatusHistory() != null) {
      for (int i = 0; i < getStatusHistory().size(); i++) {
        if (getStatusHistory().get(i) != null) {
          joiner.add(getStatusHistory().get(i).toUrlQueryString(String.format("%sstatusHistory%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `reasonText` to the URL query string
    if (getReasonText() != null) {
      joiner.add(String.format("%sreasonText%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReasonText()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `checkNumber` to the URL query string
    if (getCheckNumber() != null) {
      joiner.add(String.format("%scheckNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCheckNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `vendor` to the URL query string
    if (getVendor() != null) {
      joiner.add(String.format("%svendor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVendor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }
}

