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
 * Gets or Sets businessNumberOfEmployees
 */
@JsonAdapter(BusinessNumberOfEmployees.Adapter.class)
public enum BusinessNumberOfEmployees {
  
  UPTO10("UpTo10"),
  
  BETWEEN10AND50("Between10And50"),
  
  BETWEEN50AND100("Between50And100"),
  
  BETWEEN100AND500("Between100And500"),
  
  OVER500("Over500");

  private String value;

  BusinessNumberOfEmployees(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BusinessNumberOfEmployees fromValue(String value) {
    for (BusinessNumberOfEmployees b : BusinessNumberOfEmployees.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BusinessNumberOfEmployees> {
    @Override
    public void write(final JsonWriter jsonWriter, final BusinessNumberOfEmployees enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BusinessNumberOfEmployees read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BusinessNumberOfEmployees.fromValue(value);
    }
  }
}

