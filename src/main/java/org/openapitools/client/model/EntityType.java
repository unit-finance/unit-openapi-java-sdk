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
 * Gets or Sets entityType
 */
@JsonAdapter(EntityType.Adapter.class)
public enum EntityType {
  
  CORPORATION("Corporation"),
  
  LLC("LLC"),
  
  PARTNERSHIP("Partnership"),
  
  PUBLICLYTRADEDCORPORATION("PubliclyTradedCorporation"),
  
  PRIVATELYHELDCORPORATION("PrivatelyHeldCorporation"),
  
  NOTFORPROFITORGANIZATION("NotForProfitOrganization");

  private String value;

  EntityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityType fromValue(String value) {
    for (EntityType b : EntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EntityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EntityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EntityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EntityType.fromValue(value);
    }
  }
}

