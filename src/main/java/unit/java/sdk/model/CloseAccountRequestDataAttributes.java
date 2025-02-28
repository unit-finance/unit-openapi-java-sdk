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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CloseAccountRequestDataAttributes
 */
@JsonPropertyOrder({
  CloseAccountRequestDataAttributes.JSON_PROPERTY_REASON,
  CloseAccountRequestDataAttributes.JSON_PROPERTY_FRAUD_REASON,
  CloseAccountRequestDataAttributes.JSON_PROPERTY_BANK_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CloseAccountRequestDataAttributes {
  /**
   * Gets or Sets reason
   */
  public enum ReasonEnum {
    BY_CUSTOMER("ByCustomer"),
    
    FRAUD("Fraud");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason = ReasonEnum.BY_CUSTOMER;

  /**
   * Gets or Sets fraudReason
   */
  public enum FraudReasonEnum {
    ACH_ACTIVITY("ACHActivity"),
    
    CARD_ACTIVITY("CardActivity"),
    
    CHECK_ACTIVITY("CheckActivity"),
    
    APPLICATION_HISTORY("ApplicationHistory"),
    
    ACCOUNT_ACTIVITY("AccountActivity"),
    
    CLIENT_IDENTIFIED("ClientIdentified"),
    
    IDENTITY_THEFT("IdentityTheft"),
    
    LINKED_TO_FRAUDULENT_CUSTOMER("LinkedToFraudulentCustomer");

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
      return null;
    }
  }

  public static final String JSON_PROPERTY_FRAUD_REASON = "fraudReason";
  private JsonNullable<FraudReasonEnum> fraudReason = JsonNullable.<FraudReasonEnum>undefined();

  /**
   * Gets or Sets bankReason
   */
  public enum BankReasonEnum {
    PROHIBITED_BUSINESS("ProhibitedBusiness"),
    
    MISSING_CDD_EDD("MissingCddEdd"),
    
    NON_US_OPERATION("NonUsOperation"),
    
    SUSPECTED_FRAUD("SuspectedFraud");

    private String value;

    BankReasonEnum(String value) {
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
    public static BankReasonEnum fromValue(String value) {
      for (BankReasonEnum b : BankReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_BANK_REASON = "bankReason";
  private JsonNullable<BankReasonEnum> bankReason = JsonNullable.<BankReasonEnum>undefined();

  public CloseAccountRequestDataAttributes() { 
  }

  public CloseAccountRequestDataAttributes reason(ReasonEnum reason) {
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
  public ReasonEnum getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public CloseAccountRequestDataAttributes fraudReason(FraudReasonEnum fraudReason) {
    this.fraudReason = JsonNullable.<FraudReasonEnum>of(fraudReason);
    return this;
  }

  /**
   * Get fraudReason
   * @return fraudReason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public FraudReasonEnum getFraudReason() {
        return fraudReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FRAUD_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<FraudReasonEnum> getFraudReason_JsonNullable() {
    return fraudReason;
  }
  
  @JsonProperty(JSON_PROPERTY_FRAUD_REASON)
  public void setFraudReason_JsonNullable(JsonNullable<FraudReasonEnum> fraudReason) {
    this.fraudReason = fraudReason;
  }

  public void setFraudReason(FraudReasonEnum fraudReason) {
    this.fraudReason = JsonNullable.<FraudReasonEnum>of(fraudReason);
  }


  public CloseAccountRequestDataAttributes bankReason(BankReasonEnum bankReason) {
    this.bankReason = JsonNullable.<BankReasonEnum>of(bankReason);
    return this;
  }

  /**
   * Get bankReason
   * @return bankReason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public BankReasonEnum getBankReason() {
        return bankReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BANK_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BankReasonEnum> getBankReason_JsonNullable() {
    return bankReason;
  }
  
  @JsonProperty(JSON_PROPERTY_BANK_REASON)
  public void setBankReason_JsonNullable(JsonNullable<BankReasonEnum> bankReason) {
    this.bankReason = bankReason;
  }

  public void setBankReason(BankReasonEnum bankReason) {
    this.bankReason = JsonNullable.<BankReasonEnum>of(bankReason);
  }


  /**
   * Return true if this CloseAccountRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloseAccountRequestDataAttributes closeAccountRequestDataAttributes = (CloseAccountRequestDataAttributes) o;
    return Objects.equals(this.reason, closeAccountRequestDataAttributes.reason) &&
        equalsNullable(this.fraudReason, closeAccountRequestDataAttributes.fraudReason) &&
        equalsNullable(this.bankReason, closeAccountRequestDataAttributes.bankReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, hashCodeNullable(fraudReason), hashCodeNullable(bankReason));
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
    sb.append("class CloseAccountRequestDataAttributes {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    fraudReason: ").append(toIndentedString(fraudReason)).append("\n");
    sb.append("    bankReason: ").append(toIndentedString(bankReason)).append("\n");
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

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fraudReason` to the URL query string
    if (getFraudReason() != null) {
      joiner.add(String.format("%sfraudReason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFraudReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `bankReason` to the URL query string
    if (getBankReason() != null) {
      joiner.add(String.format("%sbankReason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBankReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

