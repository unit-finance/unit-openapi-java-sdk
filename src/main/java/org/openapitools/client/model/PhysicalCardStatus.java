/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets physicalCardStatus
 */
@JsonAdapter(PhysicalCardStatus.Adapter.class)
public enum PhysicalCardStatus {
  
  ACTIVE("Active"),
  
  INACTIVE("Inactive"),
  
  STOLEN("Stolen"),
  
  LOST("Lost"),
  
  FROZEN("Frozen"),
  
  CLOSEDBYCUSTOMER("ClosedByCustomer"),
  
  UNKNOWN("Unknown"),
  
  SUSPECTEDFRAUD("SuspectedFraud"),
  
  ACTIVEFORONLINEUSE("ActiveForOnlineUse");

  private String value;

  PhysicalCardStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PhysicalCardStatus fromValue(String value) {
    for (PhysicalCardStatus b : PhysicalCardStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PhysicalCardStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PhysicalCardStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PhysicalCardStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PhysicalCardStatus.fromValue(value);
    }
  }
}
