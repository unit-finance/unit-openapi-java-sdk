/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.4
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
import java.util.Arrays;
import unit.java.sdk.model.Schedule1;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateRecurringDebitAchPaymentAttributes
 */
@JsonPropertyOrder({
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_AMOUNT,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_ADDENDA,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_SAME_DAY,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_TAGS,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_SCHEDULE,
  CreateRecurringDebitAchPaymentAttributes.JSON_PROPERTY_CLEARING_DAYS_OVERRIDE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRecurringDebitAchPaymentAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_SAME_DAY = "sameDay";
  private Boolean sameDay = false;

  public static final String JSON_PROPERTY_VERIFY_COUNTERPARTY_BALANCE = "verifyCounterpartyBalance";
  private Boolean verifyCounterpartyBalance = false;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private Schedule1 schedule;

  public static final String JSON_PROPERTY_CLEARING_DAYS_OVERRIDE = "clearingDaysOverride";
  private Integer clearingDaysOverride;

  public CreateRecurringDebitAchPaymentAttributes() { 
  }

  public CreateRecurringDebitAchPaymentAttributes amount(Integer amount) {
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


  public CreateRecurringDebitAchPaymentAttributes description(String description) {
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


  public CreateRecurringDebitAchPaymentAttributes addenda(String addenda) {
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


  public CreateRecurringDebitAchPaymentAttributes idempotencyKey(String idempotencyKey) {
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


  public CreateRecurringDebitAchPaymentAttributes sameDay(Boolean sameDay) {
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


  public CreateRecurringDebitAchPaymentAttributes verifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
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


  public CreateRecurringDebitAchPaymentAttributes tags(Object tags) {
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


  public CreateRecurringDebitAchPaymentAttributes schedule(Schedule1 schedule) {
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

  public Schedule1 getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchedule(Schedule1 schedule) {
    this.schedule = schedule;
  }


  public CreateRecurringDebitAchPaymentAttributes clearingDaysOverride(Integer clearingDaysOverride) {
    this.clearingDaysOverride = clearingDaysOverride;
    return this;
  }

   /**
   * Get clearingDaysOverride
   * minimum: 0
   * @return clearingDaysOverride
  **/
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
   * Return true if this createRecurringDebitAchPayment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRecurringDebitAchPaymentAttributes createRecurringDebitAchPaymentAttributes = (CreateRecurringDebitAchPaymentAttributes) o;
    return Objects.equals(this.amount, createRecurringDebitAchPaymentAttributes.amount) &&
        Objects.equals(this.description, createRecurringDebitAchPaymentAttributes.description) &&
        Objects.equals(this.addenda, createRecurringDebitAchPaymentAttributes.addenda) &&
        Objects.equals(this.idempotencyKey, createRecurringDebitAchPaymentAttributes.idempotencyKey) &&
        Objects.equals(this.sameDay, createRecurringDebitAchPaymentAttributes.sameDay) &&
        Objects.equals(this.verifyCounterpartyBalance, createRecurringDebitAchPaymentAttributes.verifyCounterpartyBalance) &&
        Objects.equals(this.tags, createRecurringDebitAchPaymentAttributes.tags) &&
        Objects.equals(this.schedule, createRecurringDebitAchPaymentAttributes.schedule) &&
        Objects.equals(this.clearingDaysOverride, createRecurringDebitAchPaymentAttributes.clearingDaysOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, addenda, idempotencyKey, sameDay, verifyCounterpartyBalance, tags, schedule, clearingDaysOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRecurringDebitAchPaymentAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
    sb.append("    verifyCounterpartyBalance: ").append(toIndentedString(verifyCounterpartyBalance)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sameDay` to the URL query string
    if (getSameDay() != null) {
      joiner.add(String.format("%ssameDay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSameDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `verifyCounterpartyBalance` to the URL query string
    if (getVerifyCounterpartyBalance() != null) {
      joiner.add(String.format("%sverifyCounterpartyBalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerifyCounterpartyBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `schedule` to the URL query string
    if (getSchedule() != null) {
      joiner.add(getSchedule().toUrlQueryString(prefix + "schedule" + suffix));
    }

    // add `clearingDaysOverride` to the URL query string
    if (getClearingDaysOverride() != null) {
      joiner.add(String.format("%sclearingDaysOverride%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClearingDaysOverride()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

