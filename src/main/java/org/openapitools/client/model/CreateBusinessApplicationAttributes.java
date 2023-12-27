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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.BusinessAnnualRevenue;
import org.openapitools.client.model.BusinessNumberOfEmployees;
import org.openapitools.client.model.BusinessVertical;
import org.openapitools.client.model.CashFlow;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.CreateBeneficialOwner;
import org.openapitools.client.model.CreateOfficer;
import org.openapitools.client.model.DeviceFingerprint;
import org.openapitools.client.model.EntityType;
import org.openapitools.client.model.Industry;
import org.openapitools.client.model.Phone;

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
 * CreateBusinessApplicationAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBusinessApplicationAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DBA = "dba";
  @SerializedName(SERIALIZED_NAME_DBA)
  private String dba;

  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityType entityType;

  public static final String SERIALIZED_NAME_DATE_OF_INCORPORATION = "dateOfIncorporation";
  @SerializedName(SERIALIZED_NAME_DATE_OF_INCORPORATION)
  private LocalDate dateOfIncorporation;

  public static final String SERIALIZED_NAME_STATE_OF_INCORPORATION = "stateOfIncorporation";
  @SerializedName(SERIALIZED_NAME_STATE_OF_INCORPORATION)
  private String stateOfIncorporation;

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private String purpose;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private Phone phone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private Contact contact;

  public static final String SERIALIZED_NAME_OFFICER = "officer";
  @SerializedName(SERIALIZED_NAME_OFFICER)
  private CreateOfficer officer;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_BENEFICIAL_OWNERS = "beneficialOwners";
  @SerializedName(SERIALIZED_NAME_BENEFICIAL_OWNERS)
  private List<CreateBeneficialOwner> beneficialOwners = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_DEVICE_FINGERPRINTS = "deviceFingerprints";
  @SerializedName(SERIALIZED_NAME_DEVICE_FINGERPRINTS)
  private List<DeviceFingerprint> deviceFingerprints;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private Industry industry;

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

  public CreateBusinessApplicationAttributes() {
  }

  public CreateBusinessApplicationAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateBusinessApplicationAttributes dba(String dba) {
    
    this.dba = dba;
    return this;
  }

   /**
   * Get dba
   * @return dba
  **/
  @javax.annotation.Nullable
  public String getDba() {
    return dba;
  }


  public void setDba(String dba) {
    this.dba = dba;
  }


  public CreateBusinessApplicationAttributes ein(String ein) {
    
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
  @javax.annotation.Nonnull
  public String getEin() {
    return ein;
  }


  public void setEin(String ein) {
    this.ein = ein;
  }


  public CreateBusinessApplicationAttributes entityType(EntityType entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nonnull
  public EntityType getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public CreateBusinessApplicationAttributes dateOfIncorporation(LocalDate dateOfIncorporation) {
    
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * Get dateOfIncorporation
   * @return dateOfIncorporation
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfIncorporation() {
    return dateOfIncorporation;
  }


  public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public CreateBusinessApplicationAttributes stateOfIncorporation(String stateOfIncorporation) {
    
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @javax.annotation.Nonnull
  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }


  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }


  public CreateBusinessApplicationAttributes purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @javax.annotation.Nullable
  public String getPurpose() {
    return purpose;
  }


  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public CreateBusinessApplicationAttributes phone(Phone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nonnull
  public Phone getPhone() {
    return phone;
  }


  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public CreateBusinessApplicationAttributes address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public CreateBusinessApplicationAttributes contact(Contact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nonnull
  public Contact getContact() {
    return contact;
  }


  public void setContact(Contact contact) {
    this.contact = contact;
  }


  public CreateBusinessApplicationAttributes officer(CreateOfficer officer) {
    
    this.officer = officer;
    return this;
  }

   /**
   * Get officer
   * @return officer
  **/
  @javax.annotation.Nonnull
  public CreateOfficer getOfficer() {
    return officer;
  }


  public void setOfficer(CreateOfficer officer) {
    this.officer = officer;
  }


  public CreateBusinessApplicationAttributes ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }


  public void setIp(String ip) {
    this.ip = ip;
  }


  public CreateBusinessApplicationAttributes website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public CreateBusinessApplicationAttributes beneficialOwners(List<CreateBeneficialOwner> beneficialOwners) {
    
    this.beneficialOwners = beneficialOwners;
    return this;
  }

  public CreateBusinessApplicationAttributes addBeneficialOwnersItem(CreateBeneficialOwner beneficialOwnersItem) {
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
  @javax.annotation.Nonnull
  public List<CreateBeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }


  public void setBeneficialOwners(List<CreateBeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
  }


  public CreateBusinessApplicationAttributes tags(Object tags) {
    
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


  public CreateBusinessApplicationAttributes idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @javax.annotation.Nullable
  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateBusinessApplicationAttributes deviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    
    this.deviceFingerprints = deviceFingerprints;
    return this;
  }

  public CreateBusinessApplicationAttributes addDeviceFingerprintsItem(DeviceFingerprint deviceFingerprintsItem) {
    if (this.deviceFingerprints == null) {
      this.deviceFingerprints = new ArrayList<>();
    }
    this.deviceFingerprints.add(deviceFingerprintsItem);
    return this;
  }

   /**
   * Get deviceFingerprints
   * @return deviceFingerprints
  **/
  @javax.annotation.Nullable
  public List<DeviceFingerprint> getDeviceFingerprints() {
    return deviceFingerprints;
  }


  public void setDeviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    this.deviceFingerprints = deviceFingerprints;
  }


  public CreateBusinessApplicationAttributes industry(Industry industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  public Industry getIndustry() {
    return industry;
  }


  public void setIndustry(Industry industry) {
    this.industry = industry;
  }


  public CreateBusinessApplicationAttributes annualRevenue(BusinessAnnualRevenue annualRevenue) {
    
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


  public CreateBusinessApplicationAttributes numberOfEmployees(BusinessNumberOfEmployees numberOfEmployees) {
    
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


  public CreateBusinessApplicationAttributes cashFlow(CashFlow cashFlow) {
    
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


  public CreateBusinessApplicationAttributes yearOfIncorporation(String yearOfIncorporation) {
    
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


  public CreateBusinessApplicationAttributes countriesOfOperation(List<String> countriesOfOperation) {
    
    this.countriesOfOperation = countriesOfOperation;
    return this;
  }

  public CreateBusinessApplicationAttributes addCountriesOfOperationItem(String countriesOfOperationItem) {
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


  public CreateBusinessApplicationAttributes stockSymbol(String stockSymbol) {
    
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


  public CreateBusinessApplicationAttributes businessVertical(BusinessVertical businessVertical) {
    
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
    CreateBusinessApplicationAttributes createBusinessApplicationAttributes = (CreateBusinessApplicationAttributes) o;
    return Objects.equals(this.name, createBusinessApplicationAttributes.name) &&
        Objects.equals(this.dba, createBusinessApplicationAttributes.dba) &&
        Objects.equals(this.ein, createBusinessApplicationAttributes.ein) &&
        Objects.equals(this.entityType, createBusinessApplicationAttributes.entityType) &&
        Objects.equals(this.dateOfIncorporation, createBusinessApplicationAttributes.dateOfIncorporation) &&
        Objects.equals(this.stateOfIncorporation, createBusinessApplicationAttributes.stateOfIncorporation) &&
        Objects.equals(this.purpose, createBusinessApplicationAttributes.purpose) &&
        Objects.equals(this.phone, createBusinessApplicationAttributes.phone) &&
        Objects.equals(this.address, createBusinessApplicationAttributes.address) &&
        Objects.equals(this.contact, createBusinessApplicationAttributes.contact) &&
        Objects.equals(this.officer, createBusinessApplicationAttributes.officer) &&
        Objects.equals(this.ip, createBusinessApplicationAttributes.ip) &&
        Objects.equals(this.website, createBusinessApplicationAttributes.website) &&
        Objects.equals(this.beneficialOwners, createBusinessApplicationAttributes.beneficialOwners) &&
        Objects.equals(this.tags, createBusinessApplicationAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createBusinessApplicationAttributes.idempotencyKey) &&
        Objects.equals(this.deviceFingerprints, createBusinessApplicationAttributes.deviceFingerprints) &&
        Objects.equals(this.industry, createBusinessApplicationAttributes.industry) &&
        Objects.equals(this.annualRevenue, createBusinessApplicationAttributes.annualRevenue) &&
        Objects.equals(this.numberOfEmployees, createBusinessApplicationAttributes.numberOfEmployees) &&
        Objects.equals(this.cashFlow, createBusinessApplicationAttributes.cashFlow) &&
        Objects.equals(this.yearOfIncorporation, createBusinessApplicationAttributes.yearOfIncorporation) &&
        Objects.equals(this.countriesOfOperation, createBusinessApplicationAttributes.countriesOfOperation) &&
        Objects.equals(this.stockSymbol, createBusinessApplicationAttributes.stockSymbol) &&
        Objects.equals(this.businessVertical, createBusinessApplicationAttributes.businessVertical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dba, ein, entityType, dateOfIncorporation, stateOfIncorporation, purpose, phone, address, contact, officer, ip, website, beneficialOwners, tags, idempotencyKey, deviceFingerprints, industry, annualRevenue, numberOfEmployees, cashFlow, yearOfIncorporation, countriesOfOperation, stockSymbol, businessVertical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBusinessApplicationAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    officer: ").append(toIndentedString(officer)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    beneficialOwners: ").append(toIndentedString(beneficialOwners)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    deviceFingerprints: ").append(toIndentedString(deviceFingerprints)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("dba");
    openapiFields.add("ein");
    openapiFields.add("entityType");
    openapiFields.add("dateOfIncorporation");
    openapiFields.add("stateOfIncorporation");
    openapiFields.add("purpose");
    openapiFields.add("phone");
    openapiFields.add("address");
    openapiFields.add("contact");
    openapiFields.add("officer");
    openapiFields.add("ip");
    openapiFields.add("website");
    openapiFields.add("beneficialOwners");
    openapiFields.add("tags");
    openapiFields.add("idempotencyKey");
    openapiFields.add("deviceFingerprints");
    openapiFields.add("industry");
    openapiFields.add("annualRevenue");
    openapiFields.add("numberOfEmployees");
    openapiFields.add("cashFlow");
    openapiFields.add("yearOfIncorporation");
    openapiFields.add("countriesOfOperation");
    openapiFields.add("stockSymbol");
    openapiFields.add("businessVertical");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("ein");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("stateOfIncorporation");
    openapiRequiredFields.add("phone");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("contact");
    openapiRequiredFields.add("officer");
    openapiRequiredFields.add("beneficialOwners");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBusinessApplicationAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBusinessApplicationAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBusinessApplicationAttributes is not found in the empty JSON string", CreateBusinessApplicationAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateBusinessApplicationAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateBusinessApplicationAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateBusinessApplicationAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dba") != null && !jsonObj.get("dba").isJsonNull()) && !jsonObj.get("dba").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dba` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dba").toString()));
      }
      if (!jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if (!jsonObj.get("stateOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOfIncorporation").toString()));
      }
      if ((jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      // validate the required field `phone`
      Phone.validateJsonElement(jsonObj.get("phone"));
      // validate the required field `address`
      Address.validateJsonElement(jsonObj.get("address"));
      // validate the required field `contact`
      Contact.validateJsonElement(jsonObj.get("contact"));
      // validate the required field `officer`
      CreateOfficer.validateJsonElement(jsonObj.get("officer"));
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("beneficialOwners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficialOwners` to be an array in the JSON string but got `%s`", jsonObj.get("beneficialOwners").toString()));
      }

      JsonArray jsonArraybeneficialOwners = jsonObj.getAsJsonArray("beneficialOwners");
      // validate the required field `beneficialOwners` (array)
      for (int i = 0; i < jsonArraybeneficialOwners.size(); i++) {
        CreateBeneficialOwner.validateJsonElement(jsonArraybeneficialOwners.get(i));
      };
      if ((jsonObj.get("idempotencyKey") != null && !jsonObj.get("idempotencyKey").isJsonNull()) && !jsonObj.get("idempotencyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotencyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotencyKey").toString()));
      }
      if (jsonObj.get("deviceFingerprints") != null && !jsonObj.get("deviceFingerprints").isJsonNull()) {
        JsonArray jsonArraydeviceFingerprints = jsonObj.getAsJsonArray("deviceFingerprints");
        if (jsonArraydeviceFingerprints != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deviceFingerprints").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deviceFingerprints` to be an array in the JSON string but got `%s`", jsonObj.get("deviceFingerprints").toString()));
          }

          // validate the optional field `deviceFingerprints` (array)
          for (int i = 0; i < jsonArraydeviceFingerprints.size(); i++) {
            DeviceFingerprint.validateJsonElement(jsonArraydeviceFingerprints.get(i));
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
       if (!CreateBusinessApplicationAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBusinessApplicationAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBusinessApplicationAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBusinessApplicationAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBusinessApplicationAttributes>() {
           @Override
           public void write(JsonWriter out, CreateBusinessApplicationAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateBusinessApplicationAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateBusinessApplicationAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBusinessApplicationAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateBusinessApplicationAttributes
  */
  public static CreateBusinessApplicationAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBusinessApplicationAttributes.class);
  }

 /**
  * Convert an instance of CreateBusinessApplicationAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
