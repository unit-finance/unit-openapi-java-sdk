/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.6
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
import unit.java.sdk.model.DepositAccountAllOfAttributesSecondaryAccountNumber;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DepositAccountAllOfAttributes
 */
@JsonPropertyOrder({
  DepositAccountAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  DepositAccountAllOfAttributes.JSON_PROPERTY_NAME,
  DepositAccountAllOfAttributes.JSON_PROPERTY_DEPOSIT_PRODUCT,
  DepositAccountAllOfAttributes.JSON_PROPERTY_ROUTING_NUMBER,
  DepositAccountAllOfAttributes.JSON_PROPERTY_ACCOUNT_NUMBER,
  DepositAccountAllOfAttributes.JSON_PROPERTY_SECONDARY_ACCOUNT_NUMBER,
  DepositAccountAllOfAttributes.JSON_PROPERTY_CURRENCY,
  DepositAccountAllOfAttributes.JSON_PROPERTY_BALANCE,
  DepositAccountAllOfAttributes.JSON_PROPERTY_OVERDRAFT_LIMIT,
  DepositAccountAllOfAttributes.JSON_PROPERTY_HOLD,
  DepositAccountAllOfAttributes.JSON_PROPERTY_AVAILABLE,
  DepositAccountAllOfAttributes.JSON_PROPERTY_TAGS,
  DepositAccountAllOfAttributes.JSON_PROPERTY_STATUS,
  DepositAccountAllOfAttributes.JSON_PROPERTY_CLOSE_REASON,
  DepositAccountAllOfAttributes.JSON_PROPERTY_FRAUD_REASON,
  DepositAccountAllOfAttributes.JSON_PROPERTY_CLOSE_REASON_TEXT,
  DepositAccountAllOfAttributes.JSON_PROPERTY_FREEZE_REASON,
  DepositAccountAllOfAttributes.JSON_PROPERTY_MASKED_ACCOUNT_NUMBER,
  DepositAccountAllOfAttributes.JSON_PROPERTY_IS_OVERDRAWN_WITHIN_LIMIT,
  DepositAccountAllOfAttributes.JSON_PROPERTY_DACA_STATUS,
  DepositAccountAllOfAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositAccountAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEPOSIT_PRODUCT = "depositProduct";
  private String depositProduct;

  public static final String JSON_PROPERTY_ROUTING_NUMBER = "routingNumber";
  private String routingNumber;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_SECONDARY_ACCOUNT_NUMBER = "secondaryAccountNumber";
  private DepositAccountAllOfAttributesSecondaryAccountNumber secondaryAccountNumber;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency = "USD";

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Integer balance;

  public static final String JSON_PROPERTY_OVERDRAFT_LIMIT = "overdraftLimit";
  private Integer overdraftLimit;

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
    
    NEGATIVEBALANCE("NegativeBalance"),
    
    BYBANK("ByBank"),
    
    BREACHOFTERMSANDCONDITIONS("BreachOfTermsAndConditions"),
    
    NOACCOUNTACTIVITY("NoAccountActivity"),
    
    PROGRAMCHANGE("ProgramChange");

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

  public static final String JSON_PROPERTY_MASKED_ACCOUNT_NUMBER = "maskedAccountNumber";
  private String maskedAccountNumber;

  public static final String JSON_PROPERTY_IS_OVERDRAWN_WITHIN_LIMIT = "isOverdrawnWithinLimit";
  private Boolean isOverdrawnWithinLimit;

  /**
   * Gets or Sets dacaStatus
   */
  public enum DacaStatusEnum {
    ACTIVATED("Activated"),
    
    ENTERED("Entered");

    private String value;

    DacaStatusEnum(String value) {
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
    public static DacaStatusEnum fromValue(String value) {
      for (DacaStatusEnum b : DacaStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DACA_STATUS = "dacaStatus";
  private DacaStatusEnum dacaStatus;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public DepositAccountAllOfAttributes() { 
  }

  public DepositAccountAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public DepositAccountAllOfAttributes name(String name) {
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


  public DepositAccountAllOfAttributes depositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
    return this;
  }

   /**
   * Get depositProduct
   * @return depositProduct
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPOSIT_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDepositProduct() {
    return depositProduct;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSIT_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
  }


  public DepositAccountAllOfAttributes routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoutingNumber() {
    return routingNumber;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public DepositAccountAllOfAttributes accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public DepositAccountAllOfAttributes secondaryAccountNumber(DepositAccountAllOfAttributesSecondaryAccountNumber secondaryAccountNumber) {
    this.secondaryAccountNumber = secondaryAccountNumber;
    return this;
  }

   /**
   * Get secondaryAccountNumber
   * @return secondaryAccountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECONDARY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositAccountAllOfAttributesSecondaryAccountNumber getSecondaryAccountNumber() {
    return secondaryAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryAccountNumber(DepositAccountAllOfAttributesSecondaryAccountNumber secondaryAccountNumber) {
    this.secondaryAccountNumber = secondaryAccountNumber;
  }


  public DepositAccountAllOfAttributes currency(String currency) {
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


  public DepositAccountAllOfAttributes balance(Integer balance) {
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


  public DepositAccountAllOfAttributes overdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * minimum: 0
   * @return overdraftLimit
  **/
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


  public DepositAccountAllOfAttributes hold(Integer hold) {
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


  public DepositAccountAllOfAttributes available(Integer available) {
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


  public DepositAccountAllOfAttributes tags(Object tags) {
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


  public DepositAccountAllOfAttributes status(StatusEnum status) {
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


  public DepositAccountAllOfAttributes closeReason(CloseReasonEnum closeReason) {
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


  public DepositAccountAllOfAttributes fraudReason(FraudReasonEnum fraudReason) {
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


  public DepositAccountAllOfAttributes closeReasonText(String closeReasonText) {
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


  public DepositAccountAllOfAttributes freezeReason(String freezeReason) {
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


  public DepositAccountAllOfAttributes maskedAccountNumber(String maskedAccountNumber) {
    this.maskedAccountNumber = maskedAccountNumber;
    return this;
  }

   /**
   * Get maskedAccountNumber
   * @return maskedAccountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASKED_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaskedAccountNumber() {
    return maskedAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_MASKED_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedAccountNumber(String maskedAccountNumber) {
    this.maskedAccountNumber = maskedAccountNumber;
  }


  public DepositAccountAllOfAttributes isOverdrawnWithinLimit(Boolean isOverdrawnWithinLimit) {
    this.isOverdrawnWithinLimit = isOverdrawnWithinLimit;
    return this;
  }

   /**
   * Get isOverdrawnWithinLimit
   * @return isOverdrawnWithinLimit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_OVERDRAWN_WITHIN_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOverdrawnWithinLimit() {
    return isOverdrawnWithinLimit;
  }


  @JsonProperty(JSON_PROPERTY_IS_OVERDRAWN_WITHIN_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOverdrawnWithinLimit(Boolean isOverdrawnWithinLimit) {
    this.isOverdrawnWithinLimit = isOverdrawnWithinLimit;
  }


  public DepositAccountAllOfAttributes dacaStatus(DacaStatusEnum dacaStatus) {
    this.dacaStatus = dacaStatus;
    return this;
  }

   /**
   * Get dacaStatus
   * @return dacaStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DACA_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DacaStatusEnum getDacaStatus() {
    return dacaStatus;
  }


  @JsonProperty(JSON_PROPERTY_DACA_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDacaStatus(DacaStatusEnum dacaStatus) {
    this.dacaStatus = dacaStatus;
  }


  public DepositAccountAllOfAttributes updatedAt(OffsetDateTime updatedAt) {
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
   * Return true if this DepositAccount_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountAllOfAttributes depositAccountAllOfAttributes = (DepositAccountAllOfAttributes) o;
    return Objects.equals(this.createdAt, depositAccountAllOfAttributes.createdAt) &&
        Objects.equals(this.name, depositAccountAllOfAttributes.name) &&
        Objects.equals(this.depositProduct, depositAccountAllOfAttributes.depositProduct) &&
        Objects.equals(this.routingNumber, depositAccountAllOfAttributes.routingNumber) &&
        Objects.equals(this.accountNumber, depositAccountAllOfAttributes.accountNumber) &&
        Objects.equals(this.secondaryAccountNumber, depositAccountAllOfAttributes.secondaryAccountNumber) &&
        Objects.equals(this.currency, depositAccountAllOfAttributes.currency) &&
        Objects.equals(this.balance, depositAccountAllOfAttributes.balance) &&
        Objects.equals(this.overdraftLimit, depositAccountAllOfAttributes.overdraftLimit) &&
        Objects.equals(this.hold, depositAccountAllOfAttributes.hold) &&
        Objects.equals(this.available, depositAccountAllOfAttributes.available) &&
        Objects.equals(this.tags, depositAccountAllOfAttributes.tags) &&
        Objects.equals(this.status, depositAccountAllOfAttributes.status) &&
        Objects.equals(this.closeReason, depositAccountAllOfAttributes.closeReason) &&
        Objects.equals(this.fraudReason, depositAccountAllOfAttributes.fraudReason) &&
        Objects.equals(this.closeReasonText, depositAccountAllOfAttributes.closeReasonText) &&
        Objects.equals(this.freezeReason, depositAccountAllOfAttributes.freezeReason) &&
        Objects.equals(this.maskedAccountNumber, depositAccountAllOfAttributes.maskedAccountNumber) &&
        Objects.equals(this.isOverdrawnWithinLimit, depositAccountAllOfAttributes.isOverdrawnWithinLimit) &&
        Objects.equals(this.dacaStatus, depositAccountAllOfAttributes.dacaStatus) &&
        Objects.equals(this.updatedAt, depositAccountAllOfAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, name, depositProduct, routingNumber, accountNumber, secondaryAccountNumber, currency, balance, overdraftLimit, hold, available, tags, status, closeReason, fraudReason, closeReasonText, freezeReason, maskedAccountNumber, isOverdrawnWithinLimit, dacaStatus, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    depositProduct: ").append(toIndentedString(depositProduct)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    secondaryAccountNumber: ").append(toIndentedString(secondaryAccountNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    closeReason: ").append(toIndentedString(closeReason)).append("\n");
    sb.append("    fraudReason: ").append(toIndentedString(fraudReason)).append("\n");
    sb.append("    closeReasonText: ").append(toIndentedString(closeReasonText)).append("\n");
    sb.append("    freezeReason: ").append(toIndentedString(freezeReason)).append("\n");
    sb.append("    maskedAccountNumber: ").append(toIndentedString(maskedAccountNumber)).append("\n");
    sb.append("    isOverdrawnWithinLimit: ").append(toIndentedString(isOverdrawnWithinLimit)).append("\n");
    sb.append("    dacaStatus: ").append(toIndentedString(dacaStatus)).append("\n");
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

    // add `depositProduct` to the URL query string
    if (getDepositProduct() != null) {
      joiner.add(String.format("%sdepositProduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDepositProduct()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routingNumber` to the URL query string
    if (getRoutingNumber() != null) {
      joiner.add(String.format("%sroutingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountNumber` to the URL query string
    if (getAccountNumber() != null) {
      joiner.add(String.format("%saccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secondaryAccountNumber` to the URL query string
    if (getSecondaryAccountNumber() != null) {
      joiner.add(getSecondaryAccountNumber().toUrlQueryString(prefix + "secondaryAccountNumber" + suffix));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `overdraftLimit` to the URL query string
    if (getOverdraftLimit() != null) {
      joiner.add(String.format("%soverdraftLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOverdraftLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `maskedAccountNumber` to the URL query string
    if (getMaskedAccountNumber() != null) {
      joiner.add(String.format("%smaskedAccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaskedAccountNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isOverdrawnWithinLimit` to the URL query string
    if (getIsOverdrawnWithinLimit() != null) {
      joiner.add(String.format("%sisOverdrawnWithinLimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsOverdrawnWithinLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dacaStatus` to the URL query string
    if (getDacaStatus() != null) {
      joiner.add(String.format("%sdacaStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDacaStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

