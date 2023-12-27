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
 * Gets or Sets businessAnnualRevenue
 */
@JsonAdapter(BusinessAnnualRevenue.Adapter.class)
public enum BusinessAnnualRevenue {
  
  UPTO250K("UpTo250k"),
  
  BETWEEN250KAND500K("Between250kAnd500k"),
  
  BETWEEN500KAND1M("Between500kAnd1m"),
  
  BETWEEN1MAND5M("Between1mAnd5m"),
  
  OVER5M("Over5m");

  private String value;

  BusinessAnnualRevenue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessAnnualRevenue fromValue(String value) {
    for (BusinessAnnualRevenue b : BusinessAnnualRevenue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BusinessAnnualRevenue> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessAnnualRevenue enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessAnnualRevenue read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessAnnualRevenue.fromValue(value);
    }
  }
}
