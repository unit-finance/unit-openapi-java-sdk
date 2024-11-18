/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.1.0
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
 * Gets or Sets BusinessVertical
 */
public enum BusinessVertical {
  
  ADULT_ENTERTAINMENT_DATING_OR_ESCORT_SERVICES("AdultEntertainmentDatingOrEscortServices"),
  
  AGRICULTURE_FORESTRY_FISHING_OR_HUNTING("AgricultureForestryFishingOrHunting"),
  
  ARTS_ENTERTAINMENT_AND_RECREATION("ArtsEntertainmentAndRecreation"),
  
  BUSINESS_SUPPORT_OR_BUILDING_SERVICES("BusinessSupportOrBuildingServices"),
  
  CANNABIS("Cannabis"),
  
  CONSTRUCTION("Construction"),
  
  DIRECT_MARKETING_OR_TELEMARKETING("DirectMarketingOrTelemarketing"),
  
  EDUCATIONAL_SERVICES("EducationalServices"),
  
  FINANCIAL_SERVICES_CRYPTOCURRENCY("FinancialServicesCryptocurrency"),
  
  FINANCIAL_SERVICES_DEBIT_COLLECTION_OR_CONSOLIDATION("FinancialServicesDebitCollectionOrConsolidation"),
  
  FINANCIAL_SERVICES_MONEY_SERVICES_BUSINESS_OR_CURRENCY_EXCHANGE("FinancialServicesMoneyServicesBusinessOrCurrencyExchange"),
  
  FINANCIAL_SERVICES_OTHER("FinancialServicesOther"),
  
  FINANCIAL_SERVICES_PAYDAY_LENDING("FinancialServicesPaydayLending"),
  
  GAMING_OR_GAMBLING("GamingOrGambling"),
  
  HEALTH_CARE_AND_SOCIAL_ASSISTANCE("HealthCareAndSocialAssistance"),
  
  HOSPITALITY_ACCOMMODATION_OR_FOOD_SERVICES("HospitalityAccommodationOrFoodServices"),
  
  LEGAL_ACCOUNTING_CONSULTING_OR_COMPUTER_PROGRAMMING("LegalAccountingConsultingOrComputerProgramming"),
  
  MANUFACTURING("Manufacturing"),
  
  MINING("Mining"),
  
  NUTRACEUTICALS("Nutraceuticals"),
  
  PERSONAL_CARE_SERVICES("PersonalCareServices"),
  
  PUBLIC_ADMINISTRATION("PublicAdministration"),
  
  REAL_ESTATE("RealEstate"),
  
  RELIGIOUS_CIVIC_AND_SOCIAL_ORGANIZATIONS("ReligiousCivicAndSocialOrganizations"),
  
  REPAIR_AND_MAINTENANCE("RepairAndMaintenance"),
  
  RETAIL_TRADE("RetailTrade"),
  
  TECHNOLOGY_MEDIA_OR_TELECOM("TechnologyMediaOrTelecom"),
  
  TRANSPORTATION_OR_WAREHOUSING("TransportationOrWarehousing"),
  
  UTILITIES("Utilities"),
  
  WHOLESALE_TRADE("WholesaleTrade");

  private String value;

  BusinessVertical(String value) {
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
  public static BusinessVertical fromValue(String value) {
    for (BusinessVertical b : BusinessVertical.values()) {
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

