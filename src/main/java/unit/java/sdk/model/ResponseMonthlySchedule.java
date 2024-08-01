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
/**
 * ResponseMonthlySchedule
 */
@JsonPropertyOrder({
  ResponseMonthlySchedule.JSON_PROPERTY_START_TIME,
  ResponseMonthlySchedule.JSON_PROPERTY_END_TIME,
  ResponseMonthlySchedule.JSON_PROPERTY_DAY_OF_MONTH,
  ResponseMonthlySchedule.JSON_PROPERTY_DAY_OF_WEEK,
  ResponseMonthlySchedule.JSON_PROPERTY_TOTAL_NUMBER_OF_PAYMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
@JsonIgnoreProperties(
  value = "interval", // ignore manually set interval, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the interval to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "interval", visible = true)

public class ResponseMonthlySchedule extends ResponseSchedule {
  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private LocalDate startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private LocalDate endTime;

  public static final String JSON_PROPERTY_DAY_OF_MONTH = "dayOfMonth";
  private Integer dayOfMonth;

  /**
   * Gets or Sets dayOfWeek
   */
  public enum DayOfWeekEnum {
    SUNDAY("Sunday"),
    
    MONDAY("Monday"),
    
    TUESDAY("Tuesday"),
    
    WEDNESDAY("Wednesday"),
    
    THURSDAY("Thursday"),
    
    FRIDAY("Friday"),
    
    SATURDAY("Saturday");

    private String value;

    DayOfWeekEnum(String value) {
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
    public static DayOfWeekEnum fromValue(String value) {
      for (DayOfWeekEnum b : DayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DAY_OF_WEEK = "dayOfWeek";
  private DayOfWeekEnum dayOfWeek;

  public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_PAYMENTS = "totalNumberOfPayments";
  private Integer totalNumberOfPayments;

  public ResponseMonthlySchedule() { 
  }

  public ResponseMonthlySchedule startTime(LocalDate startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
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


  public ResponseMonthlySchedule endTime(LocalDate endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
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


  public ResponseMonthlySchedule dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Get dayOfMonth
   * minimum: -5
   * maximum: 28
   * @return dayOfMonth
  **/
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


  public ResponseMonthlySchedule dayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DayOfWeekEnum getDayOfWeek() {
    return dayOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAY_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDayOfWeek(DayOfWeekEnum dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  public ResponseMonthlySchedule totalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
    return this;
  }

   /**
   * Get totalNumberOfPayments
   * minimum: 1
   * @return totalNumberOfPayments
  **/
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
  public ResponseMonthlySchedule interval(IntervalEnum interval) {
    this.setInterval(interval);
    return this;
  }

  /**
   * Return true if this ResponseMonthlySchedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMonthlySchedule responseMonthlySchedule = (ResponseMonthlySchedule) o;
    return Objects.equals(this.startTime, responseMonthlySchedule.startTime) &&
        Objects.equals(this.endTime, responseMonthlySchedule.endTime) &&
        Objects.equals(this.dayOfMonth, responseMonthlySchedule.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, responseMonthlySchedule.dayOfWeek) &&
        Objects.equals(this.totalNumberOfPayments, responseMonthlySchedule.totalNumberOfPayments) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, dayOfMonth, dayOfWeek, totalNumberOfPayments, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMonthlySchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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
      joiner.add(String.format("%sinterval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `startTime` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstartTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `endTime` to the URL query string
    if (getEndTime() != null) {
      joiner.add(String.format("%sendTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dayOfMonth` to the URL query string
    if (getDayOfMonth() != null) {
      joiner.add(String.format("%sdayOfMonth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDayOfMonth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dayOfWeek` to the URL query string
    if (getDayOfWeek() != null) {
      joiner.add(String.format("%sdayOfWeek%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDayOfWeek()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `totalNumberOfPayments` to the URL query string
    if (getTotalNumberOfPayments() != null) {
      joiner.add(String.format("%stotalNumberOfPayments%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalNumberOfPayments()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("ResponseMonthlySchedule", ResponseMonthlySchedule.class);
  JSON.registerDiscriminator(ResponseMonthlySchedule.class, "interval", mappings);
}
}

