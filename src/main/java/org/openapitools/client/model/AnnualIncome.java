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
 * Gets or Sets annualIncome
 */
@JsonAdapter(AnnualIncome.Adapter.class)
public enum AnnualIncome {
  
  UPTO10K("UpTo10k"),
  
  BETWEEN10KAND25K("Between10kAnd25k"),
  
  BETWEEN25KAND50K("Between25kAnd50k"),
  
  BETWEEN50KAND100K("Between50kAnd100k"),
  
  BETWEEN100KAND250K("Between100kAnd250k"),
  
  OVER250K("Over250k");

  private String value;

  AnnualIncome(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AnnualIncome fromValue(String value) {
    for (AnnualIncome b : AnnualIncome.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AnnualIncome> {
    @Override
    public void write(final JsonWriter jsonWriter, final AnnualIncome enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AnnualIncome read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AnnualIncome.fromValue(value);
    }
  }
}

