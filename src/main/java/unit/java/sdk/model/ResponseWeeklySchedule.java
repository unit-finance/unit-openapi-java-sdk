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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import unit.java.sdk.model.ResponseSchedule;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.JSON;
import unit.java.sdk.ApiClient;
/**
 * ResponseWeeklySchedule
 */
@JsonPropertyOrder({
  ResponseWeeklySchedule.JSON_PROPERTY_START_TIME,
  ResponseWeeklySchedule.JSON_PROPERTY_END_TIME,
  ResponseWeeklySchedule.JSON_PROPERTY_DAY_OF_MONTH,
  ResponseWeeklySchedule.JSON_PROPERTY_NEXT_SCHEDULED_ACTION,
  ResponseWeeklySchedule.JSON_PROPERTY_TOTAL_NUMBER_OF_PAYMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
@JsonIgnoreProperties(
  value = "interval", // ignore manually set interval, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the interval to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "interval", visible = true)

public class ResponseWeeklySchedule extends ResponseSchedule {
  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private LocalDate startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private LocalDate endTime;

  public static final String JSON_PROPERTY_DAY_OF_MONTH = "dayOfMonth";
  private Integer dayOfMonth;

  public static final String JSON_PROPERTY_NEXT_SCHEDULED_ACTION = "nextScheduledAction";
  private LocalDate nextScheduledAction;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_PAYMENTS = "totalNumberOfPayments";
  private Integer totalNumberOfPayments;

  public ResponseWeeklySchedule() { 
  }

  public ResponseWeeklySchedule startTime(LocalDate startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(LocalDate startTime) {
    this.startTime = startTime;
  }


  public ResponseWeeklySchedule endTime(LocalDate endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(LocalDate endTime) {
    this.endTime = endTime;
  }


  public ResponseWeeklySchedule dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * Get dayOfMonth
   * minimum: -5
   * maximum: 28
   * @return dayOfMonth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  public ResponseWeeklySchedule nextScheduledAction(LocalDate nextScheduledAction) {
    this.nextScheduledAction = nextScheduledAction;
    return this;
  }

  /**
   * Get nextScheduledAction
   * @return nextScheduledAction
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEXT_SCHEDULED_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getNextScheduledAction() {
    return nextScheduledAction;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_SCHEDULED_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextScheduledAction(LocalDate nextScheduledAction) {
    this.nextScheduledAction = nextScheduledAction;
  }


  public ResponseWeeklySchedule totalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
    return this;
  }

  /**
   * Get totalNumberOfPayments
   * minimum: 1
   * @return totalNumberOfPayments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTotalNumberOfPayments() {
    return totalNumberOfPayments;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
  }


  @Override
  public ResponseWeeklySchedule interval(IntervalEnum interval) {
    this.setInterval(interval);
    return this;
  }

  /**
   * Return true if this ResponseWeeklySchedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWeeklySchedule responseWeeklySchedule = (ResponseWeeklySchedule) o;
    return Objects.equals(this.startTime, responseWeeklySchedule.startTime) &&
        Objects.equals(this.endTime, responseWeeklySchedule.endTime) &&
        Objects.equals(this.dayOfMonth, responseWeeklySchedule.dayOfMonth) &&
        Objects.equals(this.nextScheduledAction, responseWeeklySchedule.nextScheduledAction) &&
        Objects.equals(this.totalNumberOfPayments, responseWeeklySchedule.totalNumberOfPayments) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, dayOfMonth, nextScheduledAction, totalNumberOfPayments, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWeeklySchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    nextScheduledAction: ").append(toIndentedString(nextScheduledAction)).append("\n");
    sb.append("    totalNumberOfPayments: ").append(toIndentedString(totalNumberOfPayments)).append("\n");
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

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format("%sinterval%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `startTime` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstartTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `endTime` to the URL query string
    if (getEndTime() != null) {
      joiner.add(String.format("%sendTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dayOfMonth` to the URL query string
    if (getDayOfMonth() != null) {
      joiner.add(String.format("%sdayOfMonth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDayOfMonth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nextScheduledAction` to the URL query string
    if (getNextScheduledAction() != null) {
      joiner.add(String.format("%snextScheduledAction%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNextScheduledAction()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalNumberOfPayments` to the URL query string
    if (getTotalNumberOfPayments() != null) {
      joiner.add(String.format("%stotalNumberOfPayments%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTotalNumberOfPayments()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("ResponseWeeklySchedule", ResponseWeeklySchedule.class);
  JSON.registerDiscriminator(ResponseWeeklySchedule.class, "interval", mappings);
}
}

