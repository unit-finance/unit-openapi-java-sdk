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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReceivedPaymentAttributes
 */
@JsonPropertyOrder({
  ReceivedPaymentAttributes.JSON_PROPERTY_CREATED_AT,
  ReceivedPaymentAttributes.JSON_PROPERTY_STATUS,
  ReceivedPaymentAttributes.JSON_PROPERTY_AMOUNT,
  ReceivedPaymentAttributes.JSON_PROPERTY_COMPLETION_DATE,
  ReceivedPaymentAttributes.JSON_PROPERTY_DIRECTION,
  ReceivedPaymentAttributes.JSON_PROPERTY_WAS_ADVANCED,
  ReceivedPaymentAttributes.JSON_PROPERTY_IS_ADVANCEABLE,
  ReceivedPaymentAttributes.JSON_PROPERTY_IS_ADVACEABLE,
  ReceivedPaymentAttributes.JSON_PROPERTY_COMPANY_NAME,
  ReceivedPaymentAttributes.JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER,
  ReceivedPaymentAttributes.JSON_PROPERTY_DESCRIPTION,
  ReceivedPaymentAttributes.JSON_PROPERTY_ADDENDA,
  ReceivedPaymentAttributes.JSON_PROPERTY_TRACE_NUMBER,
  ReceivedPaymentAttributes.JSON_PROPERTY_SEC_CODE,
  ReceivedPaymentAttributes.JSON_PROPERTY_RETURN_REASON,
  ReceivedPaymentAttributes.JSON_PROPERTY_RECEIVING_ENTITY_NAME,
  ReceivedPaymentAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReceivedPaymentAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    ADVANCED("Advanced"),
    
    COMPLETED("Completed"),
    
    RETURNED("Returned");

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

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_COMPLETION_DATE = "completionDate";
  private String completionDate;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    DEBIT("Debit"),
    
    CREDIT("Credit");

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

  public static final String JSON_PROPERTY_WAS_ADVANCED = "wasAdvanced";
  private Boolean wasAdvanced;

  public static final String JSON_PROPERTY_IS_ADVANCEABLE = "isAdvanceable";
  private Boolean isAdvanceable;

  public static final String JSON_PROPERTY_IS_ADVACEABLE = "isAdvaceable";
  private Boolean isAdvaceable;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_COUNTERPARTY_ROUTING_NUMBER = "counterpartyRoutingNumber";
  private String counterpartyRoutingNumber;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

  public static final String JSON_PROPERTY_TRACE_NUMBER = "traceNumber";
  private String traceNumber;

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private String secCode;

  public static final String JSON_PROPERTY_RETURN_REASON = "returnReason";
  private String returnReason;

  public static final String JSON_PROPERTY_RECEIVING_ENTITY_NAME = "receivingEntityName";
  private String receivingEntityName;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public ReceivedPaymentAttributes() { 
  }

  public ReceivedPaymentAttributes createdAt(OffsetDateTime createdAt) {
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


  public ReceivedPaymentAttributes status(StatusEnum status) {
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


  public ReceivedPaymentAttributes amount(Integer amount) {
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


  public ReceivedPaymentAttributes completionDate(String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

   /**
   * Get completionDate
   * @return completionDate
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLETION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompletionDate() {
    return completionDate;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompletionDate(String completionDate) {
    this.completionDate = completionDate;
  }


  public ReceivedPaymentAttributes direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
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


  public ReceivedPaymentAttributes wasAdvanced(Boolean wasAdvanced) {
    this.wasAdvanced = wasAdvanced;
    return this;
  }

   /**
   * Get wasAdvanced
   * @return wasAdvanced
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WAS_ADVANCED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getWasAdvanced() {
    return wasAdvanced;
  }


  @JsonProperty(JSON_PROPERTY_WAS_ADVANCED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWasAdvanced(Boolean wasAdvanced) {
    this.wasAdvanced = wasAdvanced;
  }


  public ReceivedPaymentAttributes isAdvanceable(Boolean isAdvanceable) {
    this.isAdvanceable = isAdvanceable;
    return this;
  }

   /**
   * Get isAdvanceable
   * @return isAdvanceable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ADVANCEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAdvanceable() {
    return isAdvanceable;
  }


  @JsonProperty(JSON_PROPERTY_IS_ADVANCEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAdvanceable(Boolean isAdvanceable) {
    this.isAdvanceable = isAdvanceable;
  }


  public ReceivedPaymentAttributes isAdvaceable(Boolean isAdvaceable) {
    this.isAdvaceable = isAdvaceable;
    return this;
  }

   /**
   * Get isAdvaceable
   * @return isAdvaceable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ADVACEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAdvaceable() {
    return isAdvaceable;
  }


  @JsonProperty(JSON_PROPERTY_IS_ADVACEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAdvaceable(Boolean isAdvaceable) {
    this.isAdvaceable = isAdvaceable;
  }


  public ReceivedPaymentAttributes companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
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


  public ReceivedPaymentAttributes counterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
    return this;
  }

   /**
   * Get counterpartyRoutingNumber
   * @return counterpartyRoutingNumber
  **/
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


  public ReceivedPaymentAttributes description(String description) {
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


  public ReceivedPaymentAttributes addenda(String addenda) {
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


  public ReceivedPaymentAttributes traceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
    return this;
  }

   /**
   * Get traceNumber
   * @return traceNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTraceNumber() {
    return traceNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTraceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
  }


  public ReceivedPaymentAttributes secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * Get secCode
   * @return secCode
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecCode() {
    return secCode;
  }


  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }


  public ReceivedPaymentAttributes returnReason(String returnReason) {
    this.returnReason = returnReason;
    return this;
  }

   /**
   * Get returnReason
   * @return returnReason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnReason() {
    return returnReason;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }


  public ReceivedPaymentAttributes receivingEntityName(String receivingEntityName) {
    this.receivingEntityName = receivingEntityName;
    return this;
  }

   /**
   * Get receivingEntityName
   * @return receivingEntityName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVING_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivingEntityName() {
    return receivingEntityName;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVING_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivingEntityName(String receivingEntityName) {
    this.receivingEntityName = receivingEntityName;
  }


  public ReceivedPaymentAttributes tags(Object tags) {
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


  /**
   * Return true if this received_payment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivedPaymentAttributes receivedPaymentAttributes = (ReceivedPaymentAttributes) o;
    return Objects.equals(this.createdAt, receivedPaymentAttributes.createdAt) &&
        Objects.equals(this.status, receivedPaymentAttributes.status) &&
        Objects.equals(this.amount, receivedPaymentAttributes.amount) &&
        Objects.equals(this.completionDate, receivedPaymentAttributes.completionDate) &&
        Objects.equals(this.direction, receivedPaymentAttributes.direction) &&
        Objects.equals(this.wasAdvanced, receivedPaymentAttributes.wasAdvanced) &&
        Objects.equals(this.isAdvanceable, receivedPaymentAttributes.isAdvanceable) &&
        Objects.equals(this.isAdvaceable, receivedPaymentAttributes.isAdvaceable) &&
        Objects.equals(this.companyName, receivedPaymentAttributes.companyName) &&
        Objects.equals(this.counterpartyRoutingNumber, receivedPaymentAttributes.counterpartyRoutingNumber) &&
        Objects.equals(this.description, receivedPaymentAttributes.description) &&
        Objects.equals(this.addenda, receivedPaymentAttributes.addenda) &&
        Objects.equals(this.traceNumber, receivedPaymentAttributes.traceNumber) &&
        Objects.equals(this.secCode, receivedPaymentAttributes.secCode) &&
        Objects.equals(this.returnReason, receivedPaymentAttributes.returnReason) &&
        Objects.equals(this.receivingEntityName, receivedPaymentAttributes.receivingEntityName) &&
        Objects.equals(this.tags, receivedPaymentAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, status, amount, completionDate, direction, wasAdvanced, isAdvanceable, isAdvaceable, companyName, counterpartyRoutingNumber, description, addenda, traceNumber, secCode, returnReason, receivingEntityName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivedPaymentAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    wasAdvanced: ").append(toIndentedString(wasAdvanced)).append("\n");
    sb.append("    isAdvanceable: ").append(toIndentedString(isAdvanceable)).append("\n");
    sb.append("    isAdvaceable: ").append(toIndentedString(isAdvaceable)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    counterpartyRoutingNumber: ").append(toIndentedString(counterpartyRoutingNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    receivingEntityName: ").append(toIndentedString(receivingEntityName)).append("\n");
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
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `completionDate` to the URL query string
    if (getCompletionDate() != null) {
      joiner.add(String.format("%scompletionDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `wasAdvanced` to the URL query string
    if (getWasAdvanced() != null) {
      joiner.add(String.format("%swasAdvanced%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWasAdvanced()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isAdvanceable` to the URL query string
    if (getIsAdvanceable() != null) {
      joiner.add(String.format("%sisAdvanceable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAdvanceable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `isAdvaceable` to the URL query string
    if (getIsAdvaceable() != null) {
      joiner.add(String.format("%sisAdvaceable%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsAdvaceable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterpartyRoutingNumber` to the URL query string
    if (getCounterpartyRoutingNumber() != null) {
      joiner.add(String.format("%scounterpartyRoutingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCounterpartyRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `traceNumber` to the URL query string
    if (getTraceNumber() != null) {
      joiner.add(String.format("%straceNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTraceNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `returnReason` to the URL query string
    if (getReturnReason() != null) {
      joiner.add(String.format("%sreturnReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReturnReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `receivingEntityName` to the URL query string
    if (getReceivingEntityName() != null) {
      joiner.add(String.format("%sreceivingEntityName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReceivingEntityName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

