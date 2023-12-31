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
 * Gets or Sets applicationStatus
 */
@JsonAdapter(ApplicationStatus.Adapter.class)
public enum ApplicationStatus {
  
  AWAITINGDOCUMENTS("AwaitingDocuments"),
  
  PENDINGREVIEW("PendingReview"),
  
  APPROVED("Approved"),
  
  DENIED("Denied"),
  
  PENDING("Pending"),
  
  CANCELED("Canceled");

  private String value;

  ApplicationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApplicationStatus fromValue(String value) {
    for (ApplicationStatus b : ApplicationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApplicationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApplicationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApplicationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApplicationStatus.fromValue(value);
    }
  }
}

