/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AccountEndOfDayAttributes
 */
@JsonPropertyOrder({
  AccountEndOfDayAttributes.JSON_PROPERTY_DATE,
  AccountEndOfDayAttributes.JSON_PROPERTY_BALANCE,
  AccountEndOfDayAttributes.JSON_PROPERTY_HOLD,
  AccountEndOfDayAttributes.JSON_PROPERTY_AVAILABLE,
  AccountEndOfDayAttributes.JSON_PROPERTY_OVERDRAFT_LIMIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AccountEndOfDayAttributes {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Integer balance;

  public static final String JSON_PROPERTY_HOLD = "hold";
  private Integer hold;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Integer available;

  public static final String JSON_PROPERTY_OVERDRAFT_LIMIT = "overdraftLimit";
  private Integer overdraftLimit;

  public AccountEndOfDayAttributes() { 
  }

  public AccountEndOfDayAttributes date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public AccountEndOfDayAttributes balance(Integer balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public AccountEndOfDayAttributes hold(Integer hold) {
    this.hold = hold;
    return this;
  }

  /**
   * Get hold
   * @return hold
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getHold() {
    return hold;
  }


  @JsonProperty(JSON_PROPERTY_HOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHold(Integer hold) {
    this.hold = hold;
  }


  public AccountEndOfDayAttributes available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getAvailable() {
    return available;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailable(Integer available) {
    this.available = available;
  }


  public AccountEndOfDayAttributes overdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
    return this;
  }

  /**
   * Get overdraftLimit
   * @return overdraftLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getOverdraftLimit() {
    return overdraftLimit;
  }


  @JsonProperty(JSON_PROPERTY_OVERDRAFT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }


  /**
   * Return true if this AccountEndOfDay_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountEndOfDayAttributes accountEndOfDayAttributes = (AccountEndOfDayAttributes) o;
    return Objects.equals(this.date, accountEndOfDayAttributes.date) &&
        Objects.equals(this.balance, accountEndOfDayAttributes.balance) &&
        Objects.equals(this.hold, accountEndOfDayAttributes.hold) &&
        Objects.equals(this.available, accountEndOfDayAttributes.available) &&
        Objects.equals(this.overdraftLimit, accountEndOfDayAttributes.overdraftLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, balance, hold, available, overdraftLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEndOfDayAttributes {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hold` to the URL query string
    if (getHold() != null) {
      joiner.add(String.format("%shold%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `available` to the URL query string
    if (getAvailable() != null) {
      joiner.add(String.format("%savailable%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAvailable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `overdraftLimit` to the URL query string
    if (getOverdraftLimit() != null) {
      joiner.add(String.format("%soverdraftLimit%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOverdraftLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

