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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateAtmDepositSimulationRequestDataAttributes
 */
@JsonPropertyOrder({
  CreateAtmDepositSimulationRequestDataAttributes.JSON_PROPERTY_AMOUNT,
  CreateAtmDepositSimulationRequestDataAttributes.JSON_PROPERTY_ATM_NAME,
  CreateAtmDepositSimulationRequestDataAttributes.JSON_PROPERTY_ATM_LOCATION,
  CreateAtmDepositSimulationRequestDataAttributes.JSON_PROPERTY_LAST4_DIGITS,
  CreateAtmDepositSimulationRequestDataAttributes.JSON_PROPERTY_CARD_NETWORK,
  CreateAtmDepositSimulationRequestDataAttributes.JSON_PROPERTY_SURCHARGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateAtmDepositSimulationRequestDataAttributes {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_ATM_NAME = "atmName";
  private String atmName;

  public static final String JSON_PROPERTY_ATM_LOCATION = "atmLocation";
  private String atmLocation;

  public static final String JSON_PROPERTY_LAST4_DIGITS = "last4Digits";
  private String last4Digits;

  /**
   * Gets or Sets cardNetwork
   */
  public enum CardNetworkEnum {
    VISA("Visa"),
    
    INTERLINK("Interlink"),
    
    ACCEL("Accel"),
    
    ALLPOINT("Allpoint"),
    
    OTHER("Other");

    private String value;

    CardNetworkEnum(String value) {
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
    public static CardNetworkEnum fromValue(String value) {
      for (CardNetworkEnum b : CardNetworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CARD_NETWORK = "cardNetwork";
  private CardNetworkEnum cardNetwork;

  public static final String JSON_PROPERTY_SURCHARGE = "surcharge";
  private Long surcharge;

  public CreateAtmDepositSimulationRequestDataAttributes() { 
  }

  public CreateAtmDepositSimulationRequestDataAttributes amount(Long amount) {
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


  public CreateAtmDepositSimulationRequestDataAttributes atmName(String atmName) {
    this.atmName = atmName;
    return this;
  }

  /**
   * Get atmName
   * @return atmName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAtmName() {
    return atmName;
  }


  @JsonProperty(JSON_PROPERTY_ATM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAtmName(String atmName) {
    this.atmName = atmName;
  }


  public CreateAtmDepositSimulationRequestDataAttributes atmLocation(String atmLocation) {
    this.atmLocation = atmLocation;
    return this;
  }

  /**
   * Get atmLocation
   * @return atmLocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATM_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAtmLocation() {
    return atmLocation;
  }


  @JsonProperty(JSON_PROPERTY_ATM_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtmLocation(String atmLocation) {
    this.atmLocation = atmLocation;
  }


  public CreateAtmDepositSimulationRequestDataAttributes last4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
    return this;
  }

  /**
   * Get last4Digits
   * @return last4Digits
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLast4Digits() {
    return last4Digits;
  }


  @JsonProperty(JSON_PROPERTY_LAST4_DIGITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLast4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
  }


  public CreateAtmDepositSimulationRequestDataAttributes cardNetwork(CardNetworkEnum cardNetwork) {
    this.cardNetwork = cardNetwork;
    return this;
  }

  /**
   * Get cardNetwork
   * @return cardNetwork
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CardNetworkEnum getCardNetwork() {
    return cardNetwork;
  }


  @JsonProperty(JSON_PROPERTY_CARD_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardNetwork(CardNetworkEnum cardNetwork) {
    this.cardNetwork = cardNetwork;
  }


  public CreateAtmDepositSimulationRequestDataAttributes surcharge(Long surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  /**
   * Get surcharge
   * @return surcharge
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSurcharge() {
    return surcharge;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurcharge(Long surcharge) {
    this.surcharge = surcharge;
  }


  /**
   * Return true if this CreateAtmDepositSimulationRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAtmDepositSimulationRequestDataAttributes createAtmDepositSimulationRequestDataAttributes = (CreateAtmDepositSimulationRequestDataAttributes) o;
    return Objects.equals(this.amount, createAtmDepositSimulationRequestDataAttributes.amount) &&
        Objects.equals(this.atmName, createAtmDepositSimulationRequestDataAttributes.atmName) &&
        Objects.equals(this.atmLocation, createAtmDepositSimulationRequestDataAttributes.atmLocation) &&
        Objects.equals(this.last4Digits, createAtmDepositSimulationRequestDataAttributes.last4Digits) &&
        Objects.equals(this.cardNetwork, createAtmDepositSimulationRequestDataAttributes.cardNetwork) &&
        Objects.equals(this.surcharge, createAtmDepositSimulationRequestDataAttributes.surcharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, atmName, atmLocation, last4Digits, cardNetwork, surcharge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAtmDepositSimulationRequestDataAttributes {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    atmName: ").append(toIndentedString(atmName)).append("\n");
    sb.append("    atmLocation: ").append(toIndentedString(atmLocation)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
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
      joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAmount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `atmName` to the URL query string
    if (getAtmName() != null) {
      joiner.add(String.format("%satmName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAtmName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `atmLocation` to the URL query string
    if (getAtmLocation() != null) {
      joiner.add(String.format("%satmLocation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAtmLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `last4Digits` to the URL query string
    if (getLast4Digits() != null) {
      joiner.add(String.format("%slast4Digits%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLast4Digits()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardNetwork` to the URL query string
    if (getCardNetwork() != null) {
      joiner.add(String.format("%scardNetwork%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardNetwork()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `surcharge` to the URL query string
    if (getSurcharge() != null) {
      joiner.add(String.format("%ssurcharge%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSurcharge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

