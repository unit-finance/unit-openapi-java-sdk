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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreditAccountAllOfAttributes
 */
@JsonPropertyOrder({
  CreditAccountAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  CreditAccountAllOfAttributes.JSON_PROPERTY_NAME,
  CreditAccountAllOfAttributes.JSON_PROPERTY_CREDIT_TERMS,
  CreditAccountAllOfAttributes.JSON_PROPERTY_CURRENCY,
  CreditAccountAllOfAttributes.JSON_PROPERTY_BALANCE,
  CreditAccountAllOfAttributes.JSON_PROPERTY_HOLD,
  CreditAccountAllOfAttributes.JSON_PROPERTY_AVAILABLE,
  CreditAccountAllOfAttributes.JSON_PROPERTY_TAGS,
  CreditAccountAllOfAttributes.JSON_PROPERTY_STATUS,
  CreditAccountAllOfAttributes.JSON_PROPERTY_CLOSE_REASON,
  CreditAccountAllOfAttributes.JSON_PROPERTY_FRAUD_REASON,
  CreditAccountAllOfAttributes.JSON_PROPERTY_CLOSE_REASON_TEXT,
  CreditAccountAllOfAttributes.JSON_PROPERTY_FREEZE_REASON,
  CreditAccountAllOfAttributes.JSON_PROPERTY_CREDIT_LIMIT,
  CreditAccountAllOfAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreditAccountAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREDIT_TERMS = "creditTerms";
  private String creditTerms;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency = "USD";

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Integer balance;

  public static final String JSON_PROPERTY_HOLD = "hold";
  private Integer hold;

  public static final String JSON_PROPERTY_AVAILABLE = "available";
  private Integer available;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OPEN("Open"),
    
    CLOSED("Closed"),
    
    FROZEN("Frozen");

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

  /**
   * Gets or Sets closeReason
   */
  public enum CloseReasonEnum {
    BYCUSTOMER("ByCustomer"),
    
    FRAUD("Fraud"),
    
    OVERDUE("Overdue");

    private String value;

    CloseReasonEnum(String value) {
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
    public static CloseReasonEnum fromValue(String value) {
      for (CloseReasonEnum b : CloseReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CLOSE_REASON = "closeReason";
  private CloseReasonEnum closeReason;

  /**
   * Gets or Sets fraudReason
   */
  public enum FraudReasonEnum {
    ACHACTIVITY("ACHActivity"),
    
    CARDACTIVITY("CardActivity"),
    
    CHECKACTIVITY("CheckActivity"),
    
    APPLICATIONHISTORY("ApplicationHistory"),
    
    ACCOUNTACTIVITY("AccountActivity"),
    
    CLIENTIDENTIFIED("ClientIdentified"),
    
    IDENTITYTHEFT("IdentityTheft"),
    
    LINKEDTOFRAUDULENTCUSTOMER("LinkedToFraudulentCustomer");

    private String value;

    FraudReasonEnum(String value) {
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
    public static FraudReasonEnum fromValue(String value) {
      for (FraudReasonEnum b : FraudReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FRAUD_REASON = "fraudReason";
  private FraudReasonEnum fraudReason;

  public static final String JSON_PROPERTY_CLOSE_REASON_TEXT = "closeReasonText";
  private String closeReasonText;

  public static final String JSON_PROPERTY_FREEZE_REASON = "freezeReason";
  private String freezeReason;

  public static final String JSON_PROPERTY_CREDIT_LIMIT = "creditLimit";
  private Integer creditLimit;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public CreditAccountAllOfAttributes() { 
  }

  public CreditAccountAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public CreditAccountAllOfAttributes name(String name) {
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


  public CreditAccountAllOfAttributes creditTerms(String creditTerms) {
    this.creditTerms = creditTerms;
    return this;
  }

   /**
   * Get creditTerms
   * @return creditTerms
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreditTerms() {
    return creditTerms;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditTerms(String creditTerms) {
    this.creditTerms = creditTerms;
  }


  public CreditAccountAllOfAttributes currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CreditAccountAllOfAttributes balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
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


  public CreditAccountAllOfAttributes hold(Integer hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
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


  public CreditAccountAllOfAttributes available(Integer available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
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


  public CreditAccountAllOfAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public CreditAccountAllOfAttributes status(StatusEnum status) {
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


  public CreditAccountAllOfAttributes closeReason(CloseReasonEnum closeReason) {
    this.closeReason = closeReason;
    return this;
  }

   /**
   * Get closeReason
   * @return closeReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloseReasonEnum getCloseReason() {
    return closeReason;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloseReason(CloseReasonEnum closeReason) {
    this.closeReason = closeReason;
  }


  public CreditAccountAllOfAttributes fraudReason(FraudReasonEnum fraudReason) {
    this.fraudReason = fraudReason;
    return this;
  }

   /**
   * Get fraudReason
   * @return fraudReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAUD_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FraudReasonEnum getFraudReason() {
    return fraudReason;
  }


  @JsonProperty(JSON_PROPERTY_FRAUD_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudReason(FraudReasonEnum fraudReason) {
    this.fraudReason = fraudReason;
  }


  public CreditAccountAllOfAttributes closeReasonText(String closeReasonText) {
    this.closeReasonText = closeReasonText;
    return this;
  }

   /**
   * Get closeReasonText
   * @return closeReasonText
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSE_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloseReasonText() {
    return closeReasonText;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_REASON_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloseReasonText(String closeReasonText) {
    this.closeReasonText = closeReasonText;
  }


  public CreditAccountAllOfAttributes freezeReason(String freezeReason) {
    this.freezeReason = freezeReason;
    return this;
  }

   /**
   * Get freezeReason
   * @return freezeReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREEZE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFreezeReason() {
    return freezeReason;
  }


  @JsonProperty(JSON_PROPERTY_FREEZE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreezeReason(String freezeReason) {
    this.freezeReason = freezeReason;
  }


  public CreditAccountAllOfAttributes creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * minimum: 0
   * @return creditLimit
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreditLimit() {
    return creditLimit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }


  public CreditAccountAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
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


  /**
   * Return true if this CreditAccount_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditAccountAllOfAttributes creditAccountAllOfAttributes = (CreditAccountAllOfAttributes) o;
    return Objects.equals(this.createdAt, creditAccountAllOfAttributes.createdAt) &&
        Objects.equals(this.name, creditAccountAllOfAttributes.name) &&
        Objects.equals(this.creditTerms, creditAccountAllOfAttributes.creditTerms) &&
        Objects.equals(this.currency, creditAccountAllOfAttributes.currency) &&
        Objects.equals(this.balance, creditAccountAllOfAttributes.balance) &&
        Objects.equals(this.hold, creditAccountAllOfAttributes.hold) &&
        Objects.equals(this.available, creditAccountAllOfAttributes.available) &&
        Objects.equals(this.tags, creditAccountAllOfAttributes.tags) &&
        Objects.equals(this.status, creditAccountAllOfAttributes.status) &&
        Objects.equals(this.closeReason, creditAccountAllOfAttributes.closeReason) &&
        Objects.equals(this.fraudReason, creditAccountAllOfAttributes.fraudReason) &&
        Objects.equals(this.closeReasonText, creditAccountAllOfAttributes.closeReasonText) &&
        Objects.equals(this.freezeReason, creditAccountAllOfAttributes.freezeReason) &&
        Objects.equals(this.creditLimit, creditAccountAllOfAttributes.creditLimit) &&
        Objects.equals(this.updatedAt, creditAccountAllOfAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, name, creditTerms, currency, balance, hold, available, tags, status, closeReason, fraudReason, closeReasonText, freezeReason, creditLimit, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditAccountAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creditTerms: ").append(toIndentedString(creditTerms)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
    sb.append("    fraudReason: ").append(toIndentedString(fraudReason)).append("\n");
    sb.append("    closeReasonText: ").append(toIndentedString(closeReasonText)).append("\n");
    sb.append("    freezeReason: ").append(toIndentedString(freezeReason)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `creditTerms` to the URL query string
    if (getCreditTerms() != null) {
      joiner.add(String.format("%screditTerms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreditTerms()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hold` to the URL query string
    if (getHold() != null) {
      joiner.add(String.format("%shold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `available` to the URL query string
    if (getAvailable() != null) {
      joiner.add(String.format("%savailable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvailable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `closeReason` to the URL query string
    if (getCloseReason() != null) {
      joiner.add(String.format("%scloseReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCloseReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fraudReason` to the URL query string
    if (getFraudReason() != null) {
      joiner.add(String.format("%sfraudReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFraudReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `closeReasonText` to the URL query string
    if (getCloseReasonText() != null) {
      joiner.add(String.format("%scloseReasonText%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCloseReasonText()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `freezeReason` to the URL query string
    if (getFreezeReason() != null) {
      joiner.add(String.format("%sfreezeReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFreezeReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `creditLimit` to the URL query string
    if (getCreditLimit() != null) {
      joiner.add(String.format("%screditLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreditLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
