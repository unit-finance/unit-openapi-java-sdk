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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BeneficialOwner;
import org.openapitools.client.model.BusinessAnnualRevenue;
import org.openapitools.client.model.BusinessNumberOfEmployees;
import org.openapitools.client.model.BusinessVertical;
import org.openapitools.client.model.CashFlow;
import org.openapitools.client.model.Officer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * PatchBusinessApplicationAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class PatchBusinessApplicationAttributes {
  public static final String SERIALIZED_NAME_OFFICER = "officer";
  @SerializedName(SERIALIZED_NAME_OFFICER)
  private Officer officer;

  public static final String SERIALIZED_NAME_BENEFICIAL_OWNERS = "beneficialOwners";
  @SerializedName(SERIALIZED_NAME_BENEFICIAL_OWNERS)
  private List<BeneficialOwner> beneficialOwners;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_ANNUAL_REVENUE = "annualRevenue";
  @SerializedName(SERIALIZED_NAME_ANNUAL_REVENUE)
  private BusinessAnnualRevenue annualRevenue;

  public static final String SERIALIZED_NAME_NUMBER_OF_EMPLOYEES = "numberOfEmployees";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_EMPLOYEES)
  private BusinessNumberOfEmployees numberOfEmployees;

  public static final String SERIALIZED_NAME_CASH_FLOW = "cashFlow";
  @SerializedName(SERIALIZED_NAME_CASH_FLOW)
  private CashFlow cashFlow;

  public static final String SERIALIZED_NAME_YEAR_OF_INCORPORATION = "yearOfIncorporation";
  @SerializedName(SERIALIZED_NAME_YEAR_OF_INCORPORATION)
  private String yearOfIncorporation;

  public static final String SERIALIZED_NAME_COUNTRIES_OF_OPERATION = "countriesOfOperation";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_OF_OPERATION)
  private List<String> countriesOfOperation;

  public static final String SERIALIZED_NAME_STOCK_SYMBOL = "stockSymbol";
  @SerializedName(SERIALIZED_NAME_STOCK_SYMBOL)
  private String stockSymbol;

  public static final String SERIALIZED_NAME_BUSINESS_VERTICAL = "businessVertical";
  @SerializedName(SERIALIZED_NAME_BUSINESS_VERTICAL)
  private BusinessVertical businessVertical;

  public PatchBusinessApplicationAttributes() {
  }

  public PatchBusinessApplicationAttributes officer(Officer officer) {
    
    this.officer = officer;
    return this;
  }

   /**
   * Get officer
   * @return officer
  **/
  @javax.annotation.Nullable
  public Officer getOfficer() {
    return officer;
  }


  public void setOfficer(Officer officer) {
    this.officer = officer;
  }


  public PatchBusinessApplicationAttributes beneficialOwners(List<BeneficialOwner> beneficialOwners) {
    
    this.beneficialOwners = beneficialOwners;
    return this;
  }

  public PatchBusinessApplicationAttributes addBeneficialOwnersItem(BeneficialOwner beneficialOwnersItem) {
    if (this.beneficialOwners == null) {
      this.beneficialOwners = new ArrayList<>();
    }
    this.beneficialOwners.add(beneficialOwnersItem);
    return this;
  }

   /**
   * Get beneficialOwners
   * @return beneficialOwners
  **/
  @javax.annotation.Nullable
  public List<BeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }


  public void setBeneficialOwners(List<BeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
  }


  public PatchBusinessApplicationAttributes tags(Object tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  public Object getTags() {
    return tags;
  }


  public void setTags(Object tags) {
    this.tags = tags;
  }


  public PatchBusinessApplicationAttributes annualRevenue(BusinessAnnualRevenue annualRevenue) {
    
    this.annualRevenue = annualRevenue;
    return this;
  }

   /**
   * Get annualRevenue
   * @return annualRevenue
  **/
  @javax.annotation.Nullable
  public BusinessAnnualRevenue getAnnualRevenue() {
    return annualRevenue;
  }


  public void setAnnualRevenue(BusinessAnnualRevenue annualRevenue) {
    this.annualRevenue = annualRevenue;
  }


  public PatchBusinessApplicationAttributes numberOfEmployees(BusinessNumberOfEmployees numberOfEmployees) {
    
    this.numberOfEmployees = numberOfEmployees;
    return this;
  }

   /**
   * Get numberOfEmployees
   * @return numberOfEmployees
  **/
  @javax.annotation.Nullable
  public BusinessNumberOfEmployees getNumberOfEmployees() {
    return numberOfEmployees;
  }


  public void setNumberOfEmployees(BusinessNumberOfEmployees numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }


  public PatchBusinessApplicationAttributes cashFlow(CashFlow cashFlow) {
    
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * Get cashFlow
   * @return cashFlow
  **/
  @javax.annotation.Nullable
  public CashFlow getCashFlow() {
    return cashFlow;
  }


  public void setCashFlow(CashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  public PatchBusinessApplicationAttributes yearOfIncorporation(String yearOfIncorporation) {
    
    this.yearOfIncorporation = yearOfIncorporation;
    return this;
  }

   /**
   * Get yearOfIncorporation
   * @return yearOfIncorporation
  **/
  @javax.annotation.Nullable
  public String getYearOfIncorporation() {
    return yearOfIncorporation;
  }


  public void setYearOfIncorporation(String yearOfIncorporation) {
    this.yearOfIncorporation = yearOfIncorporation;
  }


  public PatchBusinessApplicationAttributes countriesOfOperation(List<String> countriesOfOperation) {
    
    this.countriesOfOperation = countriesOfOperation;
    return this;
  }

  public PatchBusinessApplicationAttributes addCountriesOfOperationItem(String countriesOfOperationItem) {
    if (this.countriesOfOperation == null) {
      this.countriesOfOperation = new ArrayList<>();
    }
    this.countriesOfOperation.add(countriesOfOperationItem);
    return this;
  }

   /**
   * Get countriesOfOperation
   * @return countriesOfOperation
  **/
  @javax.annotation.Nullable
  public List<String> getCountriesOfOperation() {
    return countriesOfOperation;
  }


  public void setCountriesOfOperation(List<String> countriesOfOperation) {
    this.countriesOfOperation = countriesOfOperation;
  }


  public PatchBusinessApplicationAttributes stockSymbol(String stockSymbol) {
    
    this.stockSymbol = stockSymbol;
    return this;
  }

   /**
   * Get stockSymbol
   * @return stockSymbol
  **/
  @javax.annotation.Nullable
  public String getStockSymbol() {
    return stockSymbol;
  }


  public void setStockSymbol(String stockSymbol) {
    this.stockSymbol = stockSymbol;
  }


  public PatchBusinessApplicationAttributes businessVertical(BusinessVertical businessVertical) {
    
    this.businessVertical = businessVertical;
    return this;
  }

   /**
   * Get businessVertical
   * @return businessVertical
  **/
  @javax.annotation.Nullable
  public BusinessVertical getBusinessVertical() {
    return businessVertical;
  }


  public void setBusinessVertical(BusinessVertical businessVertical) {
    this.businessVertical = businessVertical;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchBusinessApplicationAttributes patchBusinessApplicationAttributes = (PatchBusinessApplicationAttributes) o;
    return Objects.equals(this.officer, patchBusinessApplicationAttributes.officer) &&
        Objects.equals(this.beneficialOwners, patchBusinessApplicationAttributes.beneficialOwners) &&
        Objects.equals(this.tags, patchBusinessApplicationAttributes.tags) &&
        Objects.equals(this.annualRevenue, patchBusinessApplicationAttributes.annualRevenue) &&
        Objects.equals(this.numberOfEmployees, patchBusinessApplicationAttributes.numberOfEmployees) &&
        Objects.equals(this.cashFlow, patchBusinessApplicationAttributes.cashFlow) &&
        Objects.equals(this.yearOfIncorporation, patchBusinessApplicationAttributes.yearOfIncorporation) &&
        Objects.equals(this.countriesOfOperation, patchBusinessApplicationAttributes.countriesOfOperation) &&
        Objects.equals(this.stockSymbol, patchBusinessApplicationAttributes.stockSymbol) &&
        Objects.equals(this.businessVertical, patchBusinessApplicationAttributes.businessVertical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officer, beneficialOwners, tags, annualRevenue, numberOfEmployees, cashFlow, yearOfIncorporation, countriesOfOperation, stockSymbol, businessVertical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBusinessApplicationAttributes {\n");
    sb.append("    officer: ").append(toIndentedString(officer)).append("\n");
    sb.append("    beneficialOwners: ").append(toIndentedString(beneficialOwners)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    annualRevenue: ").append(toIndentedString(annualRevenue)).append("\n");
    sb.append("    numberOfEmployees: ").append(toIndentedString(numberOfEmployees)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    yearOfIncorporation: ").append(toIndentedString(yearOfIncorporation)).append("\n");
    sb.append("    countriesOfOperation: ").append(toIndentedString(countriesOfOperation)).append("\n");
    sb.append("    stockSymbol: ").append(toIndentedString(stockSymbol)).append("\n");
    sb.append("    businessVertical: ").append(toIndentedString(businessVertical)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("officer");
    openapiFields.add("beneficialOwners");
    openapiFields.add("tags");
    openapiFields.add("annualRevenue");
    openapiFields.add("numberOfEmployees");
    openapiFields.add("cashFlow");
    openapiFields.add("yearOfIncorporation");
    openapiFields.add("countriesOfOperation");
    openapiFields.add("stockSymbol");
    openapiFields.add("businessVertical");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PatchBusinessApplicationAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchBusinessApplicationAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchBusinessApplicationAttributes is not found in the empty JSON string", PatchBusinessApplicationAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchBusinessApplicationAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchBusinessApplicationAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `officer`
      if (jsonObj.get("officer") != null && !jsonObj.get("officer").isJsonNull()) {
        Officer.validateJsonElement(jsonObj.get("officer"));
      }
      if (jsonObj.get("beneficialOwners") != null && !jsonObj.get("beneficialOwners").isJsonNull()) {
        JsonArray jsonArraybeneficialOwners = jsonObj.getAsJsonArray("beneficialOwners");
        if (jsonArraybeneficialOwners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("beneficialOwners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `beneficialOwners` to be an array in the JSON string but got `%s`", jsonObj.get("beneficialOwners").toString()));
          }

          // validate the optional field `beneficialOwners` (array)
          for (int i = 0; i < jsonArraybeneficialOwners.size(); i++) {
            BeneficialOwner.validateJsonElement(jsonArraybeneficialOwners.get(i));
          };
        }
      }
      if ((jsonObj.get("yearOfIncorporation") != null && !jsonObj.get("yearOfIncorporation").isJsonNull()) && !jsonObj.get("yearOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yearOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yearOfIncorporation").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countriesOfOperation") != null && !jsonObj.get("countriesOfOperation").isJsonNull() && !jsonObj.get("countriesOfOperation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countriesOfOperation` to be an array in the JSON string but got `%s`", jsonObj.get("countriesOfOperation").toString()));
      }
      if ((jsonObj.get("stockSymbol") != null && !jsonObj.get("stockSymbol").isJsonNull()) && !jsonObj.get("stockSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stockSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stockSymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchBusinessApplicationAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchBusinessApplicationAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchBusinessApplicationAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessApplicationAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchBusinessApplicationAttributes>() {
           @Override
           public void write(JsonWriter out, PatchBusinessApplicationAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchBusinessApplicationAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchBusinessApplicationAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchBusinessApplicationAttributes
  * @throws IOException if the JSON string is invalid with respect to PatchBusinessApplicationAttributes
  */
  public static PatchBusinessApplicationAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchBusinessApplicationAttributes.class);
  }

 /**
  * Convert an instance of PatchBusinessApplicationAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

