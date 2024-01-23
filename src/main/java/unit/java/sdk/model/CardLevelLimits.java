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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CardLevelLimits
 */
@JsonPropertyOrder({
  CardLevelLimits.JSON_PROPERTY_DAILY_WITHDRAWAL,
  CardLevelLimits.JSON_PROPERTY_DAILY_PURCHASE,
  CardLevelLimits.JSON_PROPERTY_MONTHLY_WITHDRAWAL,
  CardLevelLimits.JSON_PROPERTY_MONTHLY_PURCHASE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CardLevelLimits {
  public static final String JSON_PROPERTY_DAILY_WITHDRAWAL = "dailyWithdrawal";
  private Integer dailyWithdrawal;

  public static final String JSON_PROPERTY_DAILY_PURCHASE = "dailyPurchase";
  private Integer dailyPurchase;

  public static final String JSON_PROPERTY_MONTHLY_WITHDRAWAL = "monthlyWithdrawal";
  private Integer monthlyWithdrawal;

  public static final String JSON_PROPERTY_MONTHLY_PURCHASE = "monthlyPurchase";
  private Integer monthlyPurchase;

  public CardLevelLimits() { 
  }

  public CardLevelLimits dailyWithdrawal(Integer dailyWithdrawal) {
    this.dailyWithdrawal = dailyWithdrawal;
    return this;
  }

   /**
   * Get dailyWithdrawal
   * @return dailyWithdrawal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDailyWithdrawal() {
    return dailyWithdrawal;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyWithdrawal(Integer dailyWithdrawal) {
    this.dailyWithdrawal = dailyWithdrawal;
  }


  public CardLevelLimits dailyPurchase(Integer dailyPurchase) {
    this.dailyPurchase = dailyPurchase;
    return this;
  }

   /**
   * Get dailyPurchase
   * @return dailyPurchase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAILY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDailyPurchase() {
    return dailyPurchase;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyPurchase(Integer dailyPurchase) {
    this.dailyPurchase = dailyPurchase;
  }


  public CardLevelLimits monthlyWithdrawal(Integer monthlyWithdrawal) {
    this.monthlyWithdrawal = monthlyWithdrawal;
    return this;
  }

   /**
   * Get monthlyWithdrawal
   * @return monthlyWithdrawal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonthlyWithdrawal() {
    return monthlyWithdrawal;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_WITHDRAWAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyWithdrawal(Integer monthlyWithdrawal) {
    this.monthlyWithdrawal = monthlyWithdrawal;
  }


  public CardLevelLimits monthlyPurchase(Integer monthlyPurchase) {
    this.monthlyPurchase = monthlyPurchase;
    return this;
  }

   /**
   * Get monthlyPurchase
   * @return monthlyPurchase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTHLY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonthlyPurchase() {
    return monthlyPurchase;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyPurchase(Integer monthlyPurchase) {
    this.monthlyPurchase = monthlyPurchase;
  }


  /**
   * Return true if this cardLevelLimits object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardLevelLimits cardLevelLimits = (CardLevelLimits) o;
    return Objects.equals(this.dailyWithdrawal, cardLevelLimits.dailyWithdrawal) &&
        Objects.equals(this.dailyPurchase, cardLevelLimits.dailyPurchase) &&
        Objects.equals(this.monthlyWithdrawal, cardLevelLimits.monthlyWithdrawal) &&
        Objects.equals(this.monthlyPurchase, cardLevelLimits.monthlyPurchase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyWithdrawal, dailyPurchase, monthlyWithdrawal, monthlyPurchase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardLevelLimits {\n");
    sb.append("    dailyWithdrawal: ").append(toIndentedString(dailyWithdrawal)).append("\n");
    sb.append("    dailyPurchase: ").append(toIndentedString(dailyPurchase)).append("\n");
    sb.append("    monthlyWithdrawal: ").append(toIndentedString(monthlyWithdrawal)).append("\n");
    sb.append("    monthlyPurchase: ").append(toIndentedString(monthlyPurchase)).append("\n");
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

    // add `dailyWithdrawal` to the URL query string
    if (getDailyWithdrawal() != null) {
      joiner.add(String.format("%sdailyWithdrawal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDailyWithdrawal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dailyPurchase` to the URL query string
    if (getDailyPurchase() != null) {
      joiner.add(String.format("%sdailyPurchase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDailyPurchase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `monthlyWithdrawal` to the URL query string
    if (getMonthlyWithdrawal() != null) {
      joiner.add(String.format("%smonthlyWithdrawal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMonthlyWithdrawal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `monthlyPurchase` to the URL query string
    if (getMonthlyPurchase() != null) {
      joiner.add(String.format("%smonthlyPurchase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMonthlyPurchase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

