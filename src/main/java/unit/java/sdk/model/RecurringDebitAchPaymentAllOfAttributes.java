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
import java.time.OffsetDateTime;
import java.util.Arrays;
import unit.java.sdk.model.Schedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RecurringDebitAchPaymentAllOfAttributes
 */
@JsonPropertyOrder({
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_UPDATED_AT,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_AMOUNT,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_DESCRIPTION,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_ADDENDA,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_TAGS,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_STATUS,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_SCHEDULE,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_NUMBER_OF_PAYMENTS,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE,
  RecurringDebitAchPaymentAllOfAttributes.JSON_PROPERTY_SAME_DAY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecurringDebitAchPaymentAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    ACTIVE("Active"),
    
    COMPLETED("Completed"),
    
    DISABLED("Disabled");

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

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private Schedule schedule;

  public static final String JSON_PROPERTY_NUMBER_OF_PAYMENTS = "numberOfPayments";
  private Integer numberOfPayments;

  public static final String JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE = "verifyCounterpartyBalance";
  private Boolean verifyCounterpartyBalance = false;

  public static final String JSON_PROPERTY_SAME_DAY = "sameDay";
  private Boolean sameDay = false;

  public RecurringDebitAchPaymentAllOfAttributes() { 
  }

  public RecurringDebitAchPaymentAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public RecurringDebitAchPaymentAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
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


  public RecurringDebitAchPaymentAllOfAttributes amount(Integer amount) {
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


  public RecurringDebitAchPaymentAllOfAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
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


  public RecurringDebitAchPaymentAllOfAttributes addenda(String addenda) {
    this.addenda = addenda;
    return this;
  }

   /**
   * Get addenda
   * @return addenda
  **/
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


  public RecurringDebitAchPaymentAllOfAttributes tags(Object tags) {
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


  public RecurringDebitAchPaymentAllOfAttributes status(StatusEnum status) {
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


  public RecurringDebitAchPaymentAllOfAttributes schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Schedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }


  public RecurringDebitAchPaymentAllOfAttributes numberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Get numberOfPayments
   * @return numberOfPayments
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }


  public RecurringDebitAchPaymentAllOfAttributes verifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
    return this;
  }

   /**
   * Get verifyCounterpartyBalance
   * @return verifyCounterpartyBalance
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVerifyCounterpartyBalance() {
    return verifyCounterpartyBalance;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
  }


  public RecurringDebitAchPaymentAllOfAttributes sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

   /**
   * Get sameDay
   * @return sameDay
  **/
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


  /**
   * Return true if this RecurringDebitAchPayment_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDebitAchPaymentAllOfAttributes recurringDebitAchPaymentAllOfAttributes = (RecurringDebitAchPaymentAllOfAttributes) o;
    return Objects.equals(this.createdAt, recurringDebitAchPaymentAllOfAttributes.createdAt) &&
        Objects.equals(this.updatedAt, recurringDebitAchPaymentAllOfAttributes.updatedAt) &&
        Objects.equals(this.amount, recurringDebitAchPaymentAllOfAttributes.amount) &&
        Objects.equals(this.description, recurringDebitAchPaymentAllOfAttributes.description) &&
        Objects.equals(this.addenda, recurringDebitAchPaymentAllOfAttributes.addenda) &&
        Objects.equals(this.tags, recurringDebitAchPaymentAllOfAttributes.tags) &&
        Objects.equals(this.status, recurringDebitAchPaymentAllOfAttributes.status) &&
        Objects.equals(this.schedule, recurringDebitAchPaymentAllOfAttributes.schedule) &&
        Objects.equals(this.numberOfPayments, recurringDebitAchPaymentAllOfAttributes.numberOfPayments) &&
        Objects.equals(this.verifyCounterpartyBalance, recurringDebitAchPaymentAllOfAttributes.verifyCounterpartyBalance) &&
        Objects.equals(this.sameDay, recurringDebitAchPaymentAllOfAttributes.sameDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, amount, description, addenda, tags, status, schedule, numberOfPayments, verifyCounterpartyBalance, sameDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDebitAchPaymentAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    verifyCounterpartyBalance: ").append(toIndentedString(verifyCounterpartyBalance)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `schedule` to the URL query string
    if (getSchedule() != null) {
      joiner.add(getSchedule().toUrlQueryString(prefix + "schedule" + suffix));
    }

    // add `numberOfPayments` to the URL query string
    if (getNumberOfPayments() != null) {
      joiner.add(String.format("%snumberOfPayments%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfPayments()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `verifyCounterpartyBalance` to the URL query string
    if (getVerifyCounterpartyBalance() != null) {
      joiner.add(String.format("%sverifyCounterpartyBalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerifyCounterpartyBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sameDay` to the URL query string
    if (getSameDay() != null) {
      joiner.add(String.format("%ssameDay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSameDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
