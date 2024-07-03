/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.6
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
 * Gets or Sets occupation
 */
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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Occupation fromValue(String value) {
    for (Occupation b : Occupation.values()) {
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

