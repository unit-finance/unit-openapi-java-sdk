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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import unit.java.sdk.model.WirePaymentAllOfAttributesImadOmad;
import unit.java.sdk.model.WirePaymentCounterparty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WirePaymentAllOfAttributes
 */
@JsonPropertyOrder({
  WirePaymentAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  WirePaymentAllOfAttributes.JSON_PROPERTY_AMOUNT,
  WirePaymentAllOfAttributes.JSON_PROPERTY_DIRECTION,
  WirePaymentAllOfAttributes.JSON_PROPERTY_DESCRIPTION,
  WirePaymentAllOfAttributes.JSON_PROPERTY_COUNTERPARTY,
  WirePaymentAllOfAttributes.JSON_PROPERTY_STATUS,
  WirePaymentAllOfAttributes.JSON_PROPERTY_SETTLEMENT_DATE,
  WirePaymentAllOfAttributes.JSON_PROPERTY_REASON,
  WirePaymentAllOfAttributes.JSON_PROPERTY_IMAD_OMAD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class WirePaymentAllOfAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
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

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private WirePaymentCounterparty counterparty;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("Pending"),
    
    REJECTED("Rejected"),
    
    CLEARING("Clearing"),
    
    SENT("Sent"),
    
    CANCELED("Canceled"),
    
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

  public static final String JSON_PROPERTY_SETTLEMENT_DATE = "settlementDate";
  private LocalDate settlementDate;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_IMAD_OMAD = "imadOmad";
  private WirePaymentAllOfAttributesImadOmad imadOmad;

  public WirePaymentAllOfAttributes() { 
  }

  public WirePaymentAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public WirePaymentAllOfAttributes amount(Integer amount) {
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


  public WirePaymentAllOfAttributes direction(DirectionEnum direction) {
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


  public WirePaymentAllOfAttributes description(String description) {
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


  public WirePaymentAllOfAttributes counterparty(WirePaymentCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WirePaymentCounterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(WirePaymentCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  public WirePaymentAllOfAttributes status(StatusEnum status) {
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


  public WirePaymentAllOfAttributes settlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * Get settlementDate
   * @return settlementDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getSettlementDate() {
    return settlementDate;
  }


  @JsonProperty(JSON_PROPERTY_SETTLEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }


  public WirePaymentAllOfAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public WirePaymentAllOfAttributes imadOmad(WirePaymentAllOfAttributesImadOmad imadOmad) {
    this.imadOmad = imadOmad;
    return this;
  }

   /**
   * Get imadOmad
   * @return imadOmad
  **/
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


  /**
   * Return true if this WirePayment_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WirePaymentAllOfAttributes wirePaymentAllOfAttributes = (WirePaymentAllOfAttributes) o;
    return Objects.equals(this.createdAt, wirePaymentAllOfAttributes.createdAt) &&
        Objects.equals(this.amount, wirePaymentAllOfAttributes.amount) &&
        Objects.equals(this.direction, wirePaymentAllOfAttributes.direction) &&
        Objects.equals(this.description, wirePaymentAllOfAttributes.description) &&
        Objects.equals(this.counterparty, wirePaymentAllOfAttributes.counterparty) &&
        Objects.equals(this.status, wirePaymentAllOfAttributes.status) &&
        Objects.equals(this.settlementDate, wirePaymentAllOfAttributes.settlementDate) &&
        Objects.equals(this.reason, wirePaymentAllOfAttributes.reason) &&
        Objects.equals(this.imadOmad, wirePaymentAllOfAttributes.imadOmad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, amount, direction, description, counterparty, status, settlementDate, reason, imadOmad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WirePaymentAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    imadOmad: ").append(toIndentedString(imadOmad)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `settlementDate` to the URL query string
    if (getSettlementDate() != null) {
      joiner.add(String.format("%ssettlementDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSettlementDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `imadOmad` to the URL query string
    if (getImadOmad() != null) {
      joiner.add(getImadOmad().toUrlQueryString(prefix + "imadOmad" + suffix));
    }

    return joiner.toString();
  }
}

