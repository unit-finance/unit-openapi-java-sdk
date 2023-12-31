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
 * Gets or Sets occupation
 */
@JsonAdapter(Occupation.Adapter.class)
public enum Occupation {
  
  ARCHITECTORENGINEER("ArchitectOrEngineer"),
  
  BUSINESSANALYSTACCOUNTANTORFINANCIALADVISOR("BusinessAnalystAccountantOrFinancialAdvisor"),
  
  COMMUNITYANDSOCIALSERVICESWORKER("CommunityAndSocialServicesWorker"),
  
  CONSTRUCTIONMECHANICORMAINTENANCEWORKER("ConstructionMechanicOrMaintenanceWorker"),
  
  DOCTOR("Doctor"),
  
  EDUCATOR("Educator"),
  
  ENTERTAINMENTSPORTSARTSORMEDIA("EntertainmentSportsArtsOrMedia"),
  
  EXECUTIVEORMANAGER("ExecutiveOrManager"),
  
  FARMERFISHERMANFORESTER("FarmerFishermanForester"),
  
  FOODSERVICEWORKER("FoodServiceWorker"),
  
  GIGWORKER("GigWorker"),
  
  HOSPITALITYOFFICEORADMINISTRATIVESUPPORTWORKER("HospitalityOfficeOrAdministrativeSupportWorker"),
  
  HOUSEHOLDMANAGER("HouseholdManager"),
  
  JANITORHOUSEKEEPERLANDSCAPER("JanitorHousekeeperLandscaper"),
  
  LAWYER("Lawyer"),
  
  MANUFACTURINGORPRODUCTIONWORKER("ManufacturingOrProductionWorker"),
  
  MILITARYORPUBLICSAFETY("MilitaryOrPublicSafety"),
  
  NURSEHEALTHCARETECHNICIANORHEALTHCARESUPPORT("NurseHealthcareTechnicianOrHealthcareSupport"),
  
  PERSONALCAREORSERVICEWORKER("PersonalCareOrServiceWorker"),
  
  PILOTDRIVEROPERATOR("PilotDriverOperator"),
  
  SALESREPRESENTATIVEBROKERAGENT("SalesRepresentativeBrokerAgent"),
  
  SCIENTISTORTECHNOLOGIST("ScientistOrTechnologist"),
  
  STUDENT("Student");

  private String value;

  Occupation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Occupation fromValue(String value) {
    for (Occupation b : Occupation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Occupation> {
    @Override
    public void write(final JsonWriter jsonWriter, final Occupation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Occupation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Occupation.fromValue(value);
    }
  }
}

