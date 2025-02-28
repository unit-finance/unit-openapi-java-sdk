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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CheckDepositStatus
 */
public enum CheckDepositStatus {
  
  AWAITING_IMAGES("AwaitingImages"),
  
  AWAITING_FRONT_IMAGE("AwaitingFrontImage"),
  
  AWAITING_BACK_IMAGE("AwaitingBackImage"),
  
  AWAITING_CUSTOMER_CONFIRMATION("AwaitingCustomerConfirmation"),
  
  PENDING("Pending"),
  
  PENDING_REVIEW("PendingReview"),
  
  REJECTED("Rejected"),
  
  CLEARING("Clearing"),
  
  SENT("Sent"),
  
  CANCELED("Canceled"),
  
  RETURNED("Returned");

  private String value;

  CheckDepositStatus(String value) {
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
  public static CheckDepositStatus fromValue(String value) {
    for (CheckDepositStatus b : CheckDepositStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

