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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import unit.java.sdk.model.PaymentCounterparty;
import unit.java.sdk.model.WirePaymentAllOfAttributesImadOmad;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * WireTransactionAllOfAttributes
 */
@JsonPropertyOrder({
  WireTransactionAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  WireTransactionAllOfAttributes.JSON_PROPERTY_DIRECTION,
  WireTransactionAllOfAttributes.JSON_PROPERTY_AMOUNT,
  WireTransactionAllOfAttributes.JSON_PROPERTY_BALANCE,
  WireTransactionAllOfAttributes.JSON_PROPERTY_SUMMARY,
  WireTransactionAllOfAttributes.JSON_PROPERTY_COUNTERPARTY,
  WireTransactionAllOfAttributes.JSON_PROPERTY_DESCRIPTION,
  WireTransactionAllOfAttributes.JSON_PROPERTY_SENDER_REFERENCE,
  WireTransactionAllOfAttributes.JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY,
  WireTransactionAllOfAttributes.JSON_PROPERTY_ORIGINATOR_TO_BENEFICIARY_INFORMATION,
  WireTransactionAllOfAttributes.JSON_PROPERTY_BENEFICIARY_INFORMATION,
  WireTransactionAllOfAttributes.JSON_PROPERTY_BENEFICIARY_ADVICE_INFORMATION,
  WireTransactionAllOfAttributes.JSON_PROPERTY_IMAD_OMAD,
  WireTransactionAllOfAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WireTransactionAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    CREDIT("Credit"),
    
    DEBIT("Debit");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Long balance;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private PaymentCounterparty counterparty;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SENDER_REFERENCE = "senderReference";
  private String senderReference;

  public static final String JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY = "referenceForBeneficiary";
  private String referenceForBeneficiary;

  public static final String JSON_PROPERTY_ORIGINATOR_TO_BENEFICIARY_INFORMATION = "originatorToBeneficiaryInformation";
  private String originatorToBeneficiaryInformation;

  public static final String JSON_PROPERTY_BENEFICIARY_INFORMATION = "beneficiaryInformation";
  private String beneficiaryInformation;

  public static final String JSON_PROPERTY_BENEFICIARY_ADVICE_INFORMATION = "beneficiaryAdviceInformation";
  private String beneficiaryAdviceInformation;

  public static final String JSON_PROPERTY_IMAD_OMAD = "imadOmad";
  private WirePaymentAllOfAttributesImadOmad imadOmad;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public WireTransactionAllOfAttributes() { 
  }

  public WireTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public WireTransactionAllOfAttributes direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public WireTransactionAllOfAttributes amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public WireTransactionAllOfAttributes balance(Long balance) {
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
  public Long getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public WireTransactionAllOfAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSummary(String summary) {
    this.summary = summary;
  }


  public WireTransactionAllOfAttributes counterparty(PaymentCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

  /**
   * Get counterparty
   * @return counterparty
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PaymentCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterparty(PaymentCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public WireTransactionAllOfAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public WireTransactionAllOfAttributes senderReference(String senderReference) {
    this.senderReference = senderReference;
    return this;
  }

  /**
   * Get senderReference
   * @return senderReference
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSenderReference() {
    return senderReference;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderReference(String senderReference) {
    this.senderReference = senderReference;
  }


  public WireTransactionAllOfAttributes referenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

  /**
   * Get referenceForBeneficiary
   * @return referenceForBeneficiary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }


  public WireTransactionAllOfAttributes originatorToBeneficiaryInformation(String originatorToBeneficiaryInformation) {
    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation;
    return this;
  }

  /**
   * Get originatorToBeneficiaryInformation
   * @return originatorToBeneficiaryInformation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINATOR_TO_BENEFICIARY_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatorToBeneficiaryInformation() {
    return originatorToBeneficiaryInformation;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINATOR_TO_BENEFICIARY_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatorToBeneficiaryInformation(String originatorToBeneficiaryInformation) {
    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation;
  }


  public WireTransactionAllOfAttributes beneficiaryInformation(String beneficiaryInformation) {
    this.beneficiaryInformation = beneficiaryInformation;
    return this;
  }

  /**
   * Get beneficiaryInformation
   * @return beneficiaryInformation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBeneficiaryInformation() {
    return beneficiaryInformation;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARY_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeneficiaryInformation(String beneficiaryInformation) {
    this.beneficiaryInformation = beneficiaryInformation;
  }


  public WireTransactionAllOfAttributes beneficiaryAdviceInformation(String beneficiaryAdviceInformation) {
    this.beneficiaryAdviceInformation = beneficiaryAdviceInformation;
    return this;
  }

  /**
   * Get beneficiaryAdviceInformation
   * @return beneficiaryAdviceInformation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ADVICE_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBeneficiaryAdviceInformation() {
    return beneficiaryAdviceInformation;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ADVICE_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeneficiaryAdviceInformation(String beneficiaryAdviceInformation) {
    this.beneficiaryAdviceInformation = beneficiaryAdviceInformation;
  }


  public WireTransactionAllOfAttributes imadOmad(WirePaymentAllOfAttributesImadOmad imadOmad) {
    this.imadOmad = imadOmad;
    return this;
  }

  /**
   * Get imadOmad
   * @return imadOmad
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAD_OMAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WirePaymentAllOfAttributesImadOmad getImadOmad() {
    return imadOmad;
  }


  @JsonProperty(JSON_PROPERTY_IMAD_OMAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImadOmad(WirePaymentAllOfAttributesImadOmad imadOmad) {
    this.imadOmad = imadOmad;
  }


  public WireTransactionAllOfAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public WireTransactionAllOfAttributes putTagsItem(String key, String tagsItem) {
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
   * Return true if this WireTransaction_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransactionAllOfAttributes wireTransactionAllOfAttributes = (WireTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, wireTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, wireTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, wireTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, wireTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, wireTransactionAllOfAttributes.summary) &&
        Objects.equals(this.counterparty, wireTransactionAllOfAttributes.counterparty) &&
        Objects.equals(this.description, wireTransactionAllOfAttributes.description) &&
        Objects.equals(this.senderReference, wireTransactionAllOfAttributes.senderReference) &&
        Objects.equals(this.referenceForBeneficiary, wireTransactionAllOfAttributes.referenceForBeneficiary) &&
        Objects.equals(this.originatorToBeneficiaryInformation, wireTransactionAllOfAttributes.originatorToBeneficiaryInformation) &&
        Objects.equals(this.beneficiaryInformation, wireTransactionAllOfAttributes.beneficiaryInformation) &&
        Objects.equals(this.beneficiaryAdviceInformation, wireTransactionAllOfAttributes.beneficiaryAdviceInformation) &&
        Objects.equals(this.imadOmad, wireTransactionAllOfAttributes.imadOmad) &&
        Objects.equals(this.tags, wireTransactionAllOfAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, counterparty, description, senderReference, referenceForBeneficiary, originatorToBeneficiaryInformation, beneficiaryInformation, beneficiaryAdviceInformation, imadOmad, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    senderReference: ").append(toIndentedString(senderReference)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
    sb.append("    originatorToBeneficiaryInformation: ").append(toIndentedString(originatorToBeneficiaryInformation)).append("\n");
    sb.append("    beneficiaryInformation: ").append(toIndentedString(beneficiaryInformation)).append("\n");
    sb.append("    beneficiaryAdviceInformation: ").append(toIndentedString(beneficiaryAdviceInformation)).append("\n");
    sb.append("    imadOmad: ").append(toIndentedString(imadOmad)).append("\n");
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

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `summary` to the URL query string
    if (getSummary() != null) {
      joiner.add(String.format("%ssummary%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSummary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `senderReference` to the URL query string
    if (getSenderReference() != null) {
      joiner.add(String.format("%ssenderReference%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSenderReference()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `referenceForBeneficiary` to the URL query string
    if (getReferenceForBeneficiary() != null) {
      joiner.add(String.format("%sreferenceForBeneficiary%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReferenceForBeneficiary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `originatorToBeneficiaryInformation` to the URL query string
    if (getOriginatorToBeneficiaryInformation() != null) {
      joiner.add(String.format("%soriginatorToBeneficiaryInformation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOriginatorToBeneficiaryInformation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `beneficiaryInformation` to the URL query string
    if (getBeneficiaryInformation() != null) {
      joiner.add(String.format("%sbeneficiaryInformation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBeneficiaryInformation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `beneficiaryAdviceInformation` to the URL query string
    if (getBeneficiaryAdviceInformation() != null) {
      joiner.add(String.format("%sbeneficiaryAdviceInformation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBeneficiaryAdviceInformation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `imadOmad` to the URL query string
    if (getImadOmad() != null) {
      joiner.add(getImadOmad().toUrlQueryString(prefix + "imadOmad" + suffix));
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

