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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * ReceivedAchTransactionAllOfAttributes
 */
@JsonPropertyOrder({
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_DIRECTION,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_AMOUNT,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_BALANCE,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_SUMMARY,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_DESCRIPTION,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_ADDENDA,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_COMPANY_NAME,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_COUNTERPARTY_NAME,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_TRACE_NUMBER,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_SEC_CODE,
  ReceivedAchTransactionAllOfAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ReceivedAchTransactionAllOfAttributes {
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

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_COUNTERPARTY_NAME = "counterpartyName";
  private String counterpartyName;

  public static final String JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER = "counterpartyRoutingNumber";
  private String counterpartyRoutingNumber;

  public static final String JSON_PROPERTY_TRACE_NUMBER = "traceNumber";
  private String traceNumber;

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private String secCode;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public ReceivedAchTransactionAllOfAttributes() { 
  }

  public ReceivedAchTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public ReceivedAchTransactionAllOfAttributes direction(DirectionEnum direction) {
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


  public ReceivedAchTransactionAllOfAttributes amount(Long amount) {
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


  public ReceivedAchTransactionAllOfAttributes balance(Long balance) {
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


  public ReceivedAchTransactionAllOfAttributes summary(String summary) {
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


  public ReceivedAchTransactionAllOfAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
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


  public ReceivedAchTransactionAllOfAttributes addenda(String addenda) {
    this.addenda = addenda;
    return this;
  }

  /**
   * Get addenda
   * @return addenda
   */
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


  public ReceivedAchTransactionAllOfAttributes companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public ReceivedAchTransactionAllOfAttributes counterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
    return this;
  }

  /**
   * Get counterpartyName
   * @return counterpartyName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCounterpartyName() {
    return counterpartyName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
  }


  public ReceivedAchTransactionAllOfAttributes counterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
    return this;
  }

  /**
   * Get counterpartyRoutingNumber
   * @return counterpartyRoutingNumber
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCounterpartyRoutingNumber() {
    return counterpartyRoutingNumber;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
  }


  public ReceivedAchTransactionAllOfAttributes traceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
    return this;
  }

  /**
   * Get traceNumber
   * @return traceNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTraceNumber() {
    return traceNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
  }


  public ReceivedAchTransactionAllOfAttributes secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

  /**
   * Get secCode
   * @return secCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSecCode() {
    return secCode;
  }


  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }


  public ReceivedAchTransactionAllOfAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ReceivedAchTransactionAllOfAttributes putTagsItem(String key, String tagsItem) {
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
   * Return true if this ReceivedAchTransaction_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedAchTransactionAllOfAttributes receivedAchTransactionAllOfAttributes = (ReceivedAchTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, receivedAchTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, receivedAchTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, receivedAchTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, receivedAchTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, receivedAchTransactionAllOfAttributes.summary) &&
        Objects.equals(this.description, receivedAchTransactionAllOfAttributes.description) &&
        Objects.equals(this.addenda, receivedAchTransactionAllOfAttributes.addenda) &&
        Objects.equals(this.companyName, receivedAchTransactionAllOfAttributes.companyName) &&
        Objects.equals(this.counterpartyName, receivedAchTransactionAllOfAttributes.counterpartyName) &&
        Objects.equals(this.counterpartyRoutingNumber, receivedAchTransactionAllOfAttributes.counterpartyRoutingNumber) &&
        Objects.equals(this.traceNumber, receivedAchTransactionAllOfAttributes.traceNumber) &&
        Objects.equals(this.secCode, receivedAchTransactionAllOfAttributes.secCode) &&
        Objects.equals(this.tags, receivedAchTransactionAllOfAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, description, addenda, companyName, counterpartyName, counterpartyRoutingNumber, traceNumber, secCode, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedAchTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
    sb.append("    counterpartyRoutingNumber: ").append(toIndentedString(counterpartyRoutingNumber)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCompanyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterpartyName` to the URL query string
    if (getCounterpartyName() != null) {
      joiner.add(String.format("%scounterpartyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCounterpartyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterpartyRoutingNumber` to the URL query string
    if (getCounterpartyRoutingNumber() != null) {
      joiner.add(String.format("%scounterpartyRoutingNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCounterpartyRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `traceNumber` to the URL query string
    if (getTraceNumber() != null) {
      joiner.add(String.format("%straceNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTraceNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

