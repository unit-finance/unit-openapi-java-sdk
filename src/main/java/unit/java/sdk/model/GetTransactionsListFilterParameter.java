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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * GetTransactionsListFilterParameter
 */
@JsonPropertyOrder({
  GetTransactionsListFilterParameter.JSON_PROPERTY_ACCOUNT_ID,
  GetTransactionsListFilterParameter.JSON_PROPERTY_CUSTOMER_ID,
  GetTransactionsListFilterParameter.JSON_PROPERTY_QUERY,
  GetTransactionsListFilterParameter.JSON_PROPERTY_TAGS,
  GetTransactionsListFilterParameter.JSON_PROPERTY_SINCE,
  GetTransactionsListFilterParameter.JSON_PROPERTY_UNTIL,
  GetTransactionsListFilterParameter.JSON_PROPERTY_CARD_ID,
  GetTransactionsListFilterParameter.JSON_PROPERTY_EXCLUDE_FEES,
  GetTransactionsListFilterParameter.JSON_PROPERTY_TYPE,
  GetTransactionsListFilterParameter.JSON_PROPERTY_DIRECTION,
  GetTransactionsListFilterParameter.JSON_PROPERTY_FROM_AMOUNT,
  GetTransactionsListFilterParameter.JSON_PROPERTY_TO_AMOUNT,
  GetTransactionsListFilterParameter.JSON_PROPERTY_ACCOUNT_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class GetTransactionsListFilterParameter {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_SINCE = "since";
  private String since;

  public static final String JSON_PROPERTY_UNTIL = "until";
  private String until;

  public static final String JSON_PROPERTY_CARD_ID = "cardId";
  private String cardId;

  public static final String JSON_PROPERTY_EXCLUDE_FEES = "excludeFees";
  private Boolean excludeFees;

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<String> type = new ArrayList<>();

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
  private List<DirectionEnum> direction = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM_AMOUNT = "fromAmount";
  private Long fromAmount;

  public static final String JSON_PROPERTY_TO_AMOUNT = "toAmount";
  private Long toAmount;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private String accountType;

  public GetTransactionsListFilterParameter() { 
  }

  public GetTransactionsListFilterParameter accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public GetTransactionsListFilterParameter customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public GetTransactionsListFilterParameter query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(String query) {
    this.query = query;
  }


  public GetTransactionsListFilterParameter tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public GetTransactionsListFilterParameter putTagsItem(String key, String tagsItem) {
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


  public GetTransactionsListFilterParameter since(String since) {
    this.since = since;
    return this;
  }

  /**
   * Get since
   * @return since
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSince() {
    return since;
  }


  @JsonProperty(JSON_PROPERTY_SINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSince(String since) {
    this.since = since;
  }


  public GetTransactionsListFilterParameter until(String until) {
    this.until = until;
    return this;
  }

  /**
   * Get until
   * @return until
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUntil() {
    return until;
  }


  @JsonProperty(JSON_PROPERTY_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUntil(String until) {
    this.until = until;
  }


  public GetTransactionsListFilterParameter cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardId() {
    return cardId;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public GetTransactionsListFilterParameter excludeFees(Boolean excludeFees) {
    this.excludeFees = excludeFees;
    return this;
  }

  /**
   * Get excludeFees
   * @return excludeFees
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeFees() {
    return excludeFees;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeFees(Boolean excludeFees) {
    this.excludeFees = excludeFees;
  }


  public GetTransactionsListFilterParameter type(List<String> type) {
    this.type = type;
    return this;
  }

  public GetTransactionsListFilterParameter addTypeItem(String typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(List<String> type) {
    this.type = type;
  }


  public GetTransactionsListFilterParameter direction(List<DirectionEnum> direction) {
    this.direction = direction;
    return this;
  }

  public GetTransactionsListFilterParameter addDirectionItem(DirectionEnum directionItem) {
    if (this.direction == null) {
      this.direction = new ArrayList<>();
    }
    this.direction.add(directionItem);
    return this;
  }

  /**
   * Get direction
   * @return direction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DirectionEnum> getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(List<DirectionEnum> direction) {
    this.direction = direction;
  }


  public GetTransactionsListFilterParameter fromAmount(Long fromAmount) {
    this.fromAmount = fromAmount;
    return this;
  }

  /**
   * Get fromAmount
   * @return fromAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFromAmount() {
    return fromAmount;
  }


  @JsonProperty(JSON_PROPERTY_FROM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAmount(Long fromAmount) {
    this.fromAmount = fromAmount;
  }


  public GetTransactionsListFilterParameter toAmount(Long toAmount) {
    this.toAmount = toAmount;
    return this;
  }

  /**
   * Get toAmount
   * @return toAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getToAmount() {
    return toAmount;
  }


  @JsonProperty(JSON_PROPERTY_TO_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAmount(Long toAmount) {
    this.toAmount = toAmount;
  }


  public GetTransactionsListFilterParameter accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * Return true if this getTransactionsList_filter_parameter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactionsListFilterParameter getTransactionsListFilterParameter = (GetTransactionsListFilterParameter) o;
    return Objects.equals(this.accountId, getTransactionsListFilterParameter.accountId) &&
        Objects.equals(this.customerId, getTransactionsListFilterParameter.customerId) &&
        Objects.equals(this.query, getTransactionsListFilterParameter.query) &&
        Objects.equals(this.tags, getTransactionsListFilterParameter.tags) &&
        Objects.equals(this.since, getTransactionsListFilterParameter.since) &&
        Objects.equals(this.until, getTransactionsListFilterParameter.until) &&
        Objects.equals(this.cardId, getTransactionsListFilterParameter.cardId) &&
        Objects.equals(this.excludeFees, getTransactionsListFilterParameter.excludeFees) &&
        Objects.equals(this.type, getTransactionsListFilterParameter.type) &&
        Objects.equals(this.direction, getTransactionsListFilterParameter.direction) &&
        Objects.equals(this.fromAmount, getTransactionsListFilterParameter.fromAmount) &&
        Objects.equals(this.toAmount, getTransactionsListFilterParameter.toAmount) &&
        Objects.equals(this.accountType, getTransactionsListFilterParameter.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customerId, query, tags, since, until, cardId, excludeFees, type, direction, fromAmount, toAmount, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionsListFilterParameter {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    excludeFees: ").append(toIndentedString(excludeFees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    fromAmount: ").append(toIndentedString(fromAmount)).append("\n");
    sb.append("    toAmount: ").append(toIndentedString(toAmount)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

    // add `accountId` to the URL query string
    if (getAccountId() != null) {
      joiner.add(String.format("%saccountId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccountId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCustomerId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `query` to the URL query string
    if (getQuery() != null) {
      joiner.add(String.format("%squery%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getQuery()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `since` to the URL query string
    if (getSince() != null) {
      joiner.add(String.format("%ssince%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSince()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `until` to the URL query string
    if (getUntil() != null) {
      joiner.add(String.format("%suntil%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUntil()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardId` to the URL query string
    if (getCardId() != null) {
      joiner.add(String.format("%scardId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `excludeFees` to the URL query string
    if (getExcludeFees() != null) {
      joiner.add(String.format("%sexcludeFees%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExcludeFees()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      for (int i = 0; i < getType().size(); i++) {
        joiner.add(String.format("%stype%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getType().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      for (int i = 0; i < getDirection().size(); i++) {
        joiner.add(String.format("%sdirection%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getDirection().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `fromAmount` to the URL query string
    if (getFromAmount() != null) {
      joiner.add(String.format("%sfromAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFromAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toAmount` to the URL query string
    if (getToAmount() != null) {
      joiner.add(String.format("%stoAmount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getToAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountType` to the URL query string
    if (getAccountType() != null) {
      joiner.add(String.format("%saccountType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccountType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

