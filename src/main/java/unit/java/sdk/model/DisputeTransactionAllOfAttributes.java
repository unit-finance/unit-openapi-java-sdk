/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.4
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
 * DisputeTransactionAllOfAttributes
 */
@JsonPropertyOrder({
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_CREATED_AT,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_DIRECTION,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_AMOUNT,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_BALANCE,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_SUMMARY,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_REASON,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_DISPUTE_ID,
  DisputeTransactionAllOfAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DisputeTransactionAllOfAttributes {
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
  private Integer amount;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private Integer balance;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_DISPUTE_ID = "disputeId";
  private String disputeId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public DisputeTransactionAllOfAttributes() { 
  }

  public DisputeTransactionAllOfAttributes createdAt(OffsetDateTime createdAt) {
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


  public DisputeTransactionAllOfAttributes direction(DirectionEnum direction) {
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


  public DisputeTransactionAllOfAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
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


  public DisputeTransactionAllOfAttributes balance(Integer balance) {
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


  public DisputeTransactionAllOfAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
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


  public DisputeTransactionAllOfAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public DisputeTransactionAllOfAttributes disputeId(String disputeId) {
    this.disputeId = disputeId;
    return this;
  }

   /**
   * Get disputeId
   * @return disputeId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisputeId() {
    return disputeId;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisputeId(String disputeId) {
    this.disputeId = disputeId;
  }


  public DisputeTransactionAllOfAttributes tags(Object tags) {
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
   * Return true if this DisputeTransaction_allOf_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeTransactionAllOfAttributes disputeTransactionAllOfAttributes = (DisputeTransactionAllOfAttributes) o;
    return Objects.equals(this.createdAt, disputeTransactionAllOfAttributes.createdAt) &&
        Objects.equals(this.direction, disputeTransactionAllOfAttributes.direction) &&
        Objects.equals(this.amount, disputeTransactionAllOfAttributes.amount) &&
        Objects.equals(this.balance, disputeTransactionAllOfAttributes.balance) &&
        Objects.equals(this.summary, disputeTransactionAllOfAttributes.summary) &&
        Objects.equals(this.reason, disputeTransactionAllOfAttributes.reason) &&
        Objects.equals(this.disputeId, disputeTransactionAllOfAttributes.disputeId) &&
        Objects.equals(this.tags, disputeTransactionAllOfAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, reason, disputeId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeTransactionAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    disputeId: ").append(toIndentedString(disputeId)).append("\n");
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

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(String.format("%sbalance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `summary` to the URL query string
    if (getSummary() != null) {
      joiner.add(String.format("%ssummary%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSummary()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `disputeId` to the URL query string
    if (getDisputeId() != null) {
      joiner.add(String.format("%sdisputeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDisputeId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

