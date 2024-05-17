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
import java.util.Arrays;
import unit.java.sdk.model.Counterparty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateAchPaymentAttributes
 */
@JsonPropertyOrder({
  CreateAchPaymentAttributes.JSON_PROPERTY_AMOUNT,
  CreateAchPaymentAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateAchPaymentAttributes.JSON_PROPERTY_ADDENDA,
  CreateAchPaymentAttributes.JSON_PROPERTY_DIRECTION,
  CreateAchPaymentAttributes.JSON_PROPERTY_COUNTERPARTY,
  CreateAchPaymentAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateAchPaymentAttributes.JSON_PROPERTY_SAME_DAY,
  CreateAchPaymentAttributes.JSON_PROPERTY_TAGS,
  CreateAchPaymentAttributes.JSON_PROPERTY_SEC_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateAchPaymentAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ADDENDA = "addenda";
  private String addenda;

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

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private Counterparty counterparty;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_SAME_DAY = "sameDay";
  private Boolean sameDay;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  /**
   * Gets or Sets secCode
   */
  public enum SecCodeEnum {
    WEB("WEB"),
    
    CCD("CCD"),
    
    PPD("PPD");

    private String value;

    SecCodeEnum(String value) {
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
    public static SecCodeEnum fromValue(String value) {
      for (SecCodeEnum b : SecCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEC_CODE = "secCode";
  private SecCodeEnum secCode;

  public CreateAchPaymentAttributes() { 
  }

  public CreateAchPaymentAttributes amount(Integer amount) {
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


  public CreateAchPaymentAttributes description(String description) {
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


  public CreateAchPaymentAttributes addenda(String addenda) {
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


  public CreateAchPaymentAttributes direction(DirectionEnum direction) {
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


  public CreateAchPaymentAttributes counterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Counterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }


  public CreateAchPaymentAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateAchPaymentAttributes sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

   /**
   * Get sameDay
   * @return sameDay
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSameDay() {
    return sameDay;
  }


  @JsonProperty(JSON_PROPERTY_SAME_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }


  public CreateAchPaymentAttributes tags(Object tags) {
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


  public CreateAchPaymentAttributes secCode(SecCodeEnum secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * Get secCode
   * @return secCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecCodeEnum getSecCode() {
    return secCode;
  }


  @JsonProperty(JSON_PROPERTY_SEC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecCode(SecCodeEnum secCode) {
    this.secCode = secCode;
  }


  /**
   * Return true if this CreateAchPayment_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAchPaymentAttributes createAchPaymentAttributes = (CreateAchPaymentAttributes) o;
    return Objects.equals(this.amount, createAchPaymentAttributes.amount) &&
        Objects.equals(this.description, createAchPaymentAttributes.description) &&
        Objects.equals(this.addenda, createAchPaymentAttributes.addenda) &&
        Objects.equals(this.direction, createAchPaymentAttributes.direction) &&
        Objects.equals(this.counterparty, createAchPaymentAttributes.counterparty) &&
        Objects.equals(this.idempotencyKey, createAchPaymentAttributes.idempotencyKey) &&
        Objects.equals(this.sameDay, createAchPaymentAttributes.sameDay) &&
        Objects.equals(this.tags, createAchPaymentAttributes.tags) &&
        Objects.equals(this.secCode, createAchPaymentAttributes.secCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, addenda, direction, counterparty, idempotencyKey, sameDay, tags, secCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAchPaymentAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `addenda` to the URL query string
    if (getAddenda() != null) {
      joiner.add(String.format("%saddenda%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddenda()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `direction` to the URL query string
    if (getDirection() != null) {
      joiner.add(String.format("%sdirection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `counterparty` to the URL query string
    if (getCounterparty() != null) {
      joiner.add(getCounterparty().toUrlQueryString(prefix + "counterparty" + suffix));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sameDay` to the URL query string
    if (getSameDay() != null) {
      joiner.add(String.format("%ssameDay%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSameDay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secCode` to the URL query string
    if (getSecCode() != null) {
      joiner.add(String.format("%ssecCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

