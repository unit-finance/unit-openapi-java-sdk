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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import unit.java.sdk.model.DisputeAttributesStatusHistoryInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * DisputeAttributes
 */
@JsonPropertyOrder({
  DisputeAttributes.JSON_PROPERTY_SOURCE,
  DisputeAttributes.JSON_PROPERTY_EXTERNAL_ID,
  DisputeAttributes.JSON_PROPERTY_LINK,
  DisputeAttributes.JSON_PROPERTY_DESCRIPTION,
  DisputeAttributes.JSON_PROPERTY_AMOUNT,
  DisputeAttributes.JSON_PROPERTY_STATUS,
  DisputeAttributes.JSON_PROPERTY_STATUS_HISTORY,
  DisputeAttributes.JSON_PROPERTY_CREATED_AT,
  DisputeAttributes.JSON_PROPERTY_DECISION_REASON
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class DisputeAttributes {
  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    DEBIT_CARD("DebitCard"),
    
    ACH("ACH");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SourceEnum source;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_HISTORY = "statusHistory";
  private List<DisputeAttributesStatusHistoryInner> statusHistory = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DECISION_REASON = "decisionReason";
  private String decisionReason;

  public DisputeAttributes() { 
  }

  public DisputeAttributes source(SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SourceEnum getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  public DisputeAttributes externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public DisputeAttributes link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(String link) {
    this.link = link;
  }


  public DisputeAttributes description(String description) {
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


  public DisputeAttributes amount(Long amount) {
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


  public DisputeAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public DisputeAttributes statusHistory(List<DisputeAttributesStatusHistoryInner> statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

  public DisputeAttributes addStatusHistoryItem(DisputeAttributesStatusHistoryInner statusHistoryItem) {
    if (this.statusHistory == null) {
      this.statusHistory = new ArrayList<>();
    }
    this.statusHistory.add(statusHistoryItem);
    return this;
  }

  /**
   * Get statusHistory
   * @return statusHistory
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DisputeAttributesStatusHistoryInner> getStatusHistory() {
    return statusHistory;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusHistory(List<DisputeAttributesStatusHistoryInner> statusHistory) {
    this.statusHistory = statusHistory;
  }


  public DisputeAttributes createdAt(OffsetDateTime createdAt) {
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


  public DisputeAttributes decisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
    return this;
  }

  /**
   * Get decisionReason
   * @return decisionReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDecisionReason() {
    return decisionReason;
  }


  @JsonProperty(JSON_PROPERTY_DECISION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDecisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
  }


  /**
   * Return true if this Dispute_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAttributes disputeAttributes = (DisputeAttributes) o;
    return Objects.equals(this.source, disputeAttributes.source) &&
        Objects.equals(this.externalId, disputeAttributes.externalId) &&
        Objects.equals(this.link, disputeAttributes.link) &&
        Objects.equals(this.description, disputeAttributes.description) &&
        Objects.equals(this.amount, disputeAttributes.amount) &&
        Objects.equals(this.status, disputeAttributes.status) &&
        Objects.equals(this.statusHistory, disputeAttributes.statusHistory) &&
        Objects.equals(this.createdAt, disputeAttributes.createdAt) &&
        Objects.equals(this.decisionReason, disputeAttributes.decisionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, externalId, link, description, amount, status, statusHistory, createdAt, decisionReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAttributes {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    decisionReason: ").append(toIndentedString(decisionReason)).append("\n");
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

    // add `source` to the URL query string
    if (getSource() != null) {
      joiner.add(String.format("%ssource%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSource()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExternalId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `link` to the URL query string
    if (getLink() != null) {
      joiner.add(String.format("%slink%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLink()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `statusHistory` to the URL query string
    if (getStatusHistory() != null) {
      for (int i = 0; i < getStatusHistory().size(); i++) {
        if (getStatusHistory().get(i) != null) {
          joiner.add(getStatusHistory().get(i).toUrlQueryString(String.format("%sstatusHistory%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `decisionReason` to the URL query string
    if (getDecisionReason() != null) {
      joiner.add(String.format("%sdecisionReason%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDecisionReason()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

