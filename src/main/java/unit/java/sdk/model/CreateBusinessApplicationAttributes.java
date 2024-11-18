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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.BusinessAnnualRevenue;
import unit.java.sdk.model.BusinessNumberOfEmployees;
import unit.java.sdk.model.BusinessVertical;
import unit.java.sdk.model.CashFlow;
import unit.java.sdk.model.Contact;
import unit.java.sdk.model.CreateBeneficialOwner;
import unit.java.sdk.model.CreateOfficer;
import unit.java.sdk.model.DeviceFingerprint;
import unit.java.sdk.model.EntityType;
import unit.java.sdk.model.Industry;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateBusinessApplicationAttributes
 */
@JsonPropertyOrder({
  CreateBusinessApplicationAttributes.JSON_PROPERTY_NAME,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_DBA,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_EIN,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_ENTITY_TYPE,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_DATE_OF_INCORPORATION,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_STATE_OF_INCORPORATION,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_PURPOSE,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_PHONE,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_ADDRESS,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_CONTACT,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_OFFICER,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_IP,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_WEBSITE,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_BENEFICIAL_OWNERS,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_TAGS,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_DEVICE_FINGERPRINTS,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_INDUSTRY,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_ANNUAL_REVENUE,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_NUMBER_OF_EMPLOYEES,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_CASH_FLOW,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_YEAR_OF_INCORPORATION,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_COUNTRIES_OF_OPERATION,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_STOCK_SYMBOL,
  CreateBusinessApplicationAttributes.JSON_PROPERTY_BUSINESS_VERTICAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateBusinessApplicationAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DBA = "dba";
  private String dba;

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_DATE_OF_INCORPORATION = "dateOfIncorporation";
  private LocalDate dateOfIncorporation;

  public static final String JSON_PROPERTY_STATE_OF_INCORPORATION = "stateOfIncorporation";
  private String stateOfIncorporation;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private String purpose;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private Contact contact;

  public static final String JSON_PROPERTY_OFFICER = "officer";
  private CreateOfficer officer;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_BENEFICIAL_OWNERS = "beneficialOwners";
  private List<CreateBeneficialOwner> beneficialOwners = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINTS = "deviceFingerprints";
  private List<DeviceFingerprint> deviceFingerprints = new ArrayList<>();

  public static final String JSON_PROPERTY_INDUSTRY = "industry";
  private Industry industry;

  public static final String JSON_PROPERTY_ANNUAL_REVENUE = "annualRevenue";
  private BusinessAnnualRevenue annualRevenue;

  public static final String JSON_PROPERTY_NUMBER_OF_EMPLOYEES = "numberOfEmployees";
  private BusinessNumberOfEmployees numberOfEmployees;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private CashFlow cashFlow;

  public static final String JSON_PROPERTY_YEAR_OF_INCORPORATION = "yearOfIncorporation";
  private String yearOfIncorporation;

  public static final String JSON_PROPERTY_COUNTRIES_OF_OPERATION = "countriesOfOperation";
  private List<String> countriesOfOperation = new ArrayList<>();

  public static final String JSON_PROPERTY_STOCK_SYMBOL = "stockSymbol";
  private String stockSymbol;

  public static final String JSON_PROPERTY_BUSINESS_VERTICAL = "businessVertical";
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDba() {
    return dba;
  }


  @JsonProperty(JSON_PROPERTY_DBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEin() {
    return ein;
  }


  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocalDate getDateOfIncorporation() {
    return dateOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Contact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OFFICER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CreateOfficer getOfficer() {
    return officer;
  }


  @JsonProperty(JSON_PROPERTY_OFFICER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWebsite() {
    return website;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BENEFICIAL_OWNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CreateBeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIAL_OWNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeneficialOwners(List<CreateBeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
  }


  public CreateBusinessApplicationAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateBusinessApplicationAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public CreateBusinessApplicationAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

  /**
   * Get idempotencyKey
   * @return idempotencyKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DeviceFingerprint> getDeviceFingerprints() {
    return deviceFingerprints;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Industry getIndustry() {
    return industry;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNUAL_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BusinessAnnualRevenue getAnnualRevenue() {
    return annualRevenue;
  }


  @JsonProperty(JSON_PROPERTY_ANNUAL_REVENUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EMPLOYEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BusinessNumberOfEmployees getNumberOfEmployees() {
    return numberOfEmployees;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_EMPLOYEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YEAR_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getYearOfIncorporation() {
    return yearOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRIES_OF_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCountriesOfOperation() {
    return countriesOfOperation;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES_OF_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STOCK_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStockSymbol() {
    return stockSymbol;
  }


  @JsonProperty(JSON_PROPERTY_STOCK_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BusinessVertical getBusinessVertical() {
    return businessVertical;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_VERTICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessVertical(BusinessVertical businessVertical) {
    this.businessVertical = businessVertical;
  }


  /**
   * Return true if this CreateBusinessApplication_attributes object is equal to o.
   */
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dba` to the URL query string
    if (getDba() != null) {
      joiner.add(String.format("%sdba%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDba()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ein` to the URL query string
    if (getEin() != null) {
      joiner.add(String.format("%sein%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `entityType` to the URL query string
    if (getEntityType() != null) {
      joiner.add(String.format("%sentityType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEntityType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfIncorporation` to the URL query string
    if (getDateOfIncorporation() != null) {
      joiner.add(String.format("%sdateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stateOfIncorporation` to the URL query string
    if (getStateOfIncorporation() != null) {
      joiner.add(String.format("%sstateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `purpose` to the URL query string
    if (getPurpose() != null) {
      joiner.add(String.format("%spurpose%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPurpose()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(getContact().toUrlQueryString(prefix + "contact" + suffix));
    }

    // add `officer` to the URL query string
    if (getOfficer() != null) {
      joiner.add(getOfficer().toUrlQueryString(prefix + "officer" + suffix));
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `website` to the URL query string
    if (getWebsite() != null) {
      joiner.add(String.format("%swebsite%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWebsite()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `beneficialOwners` to the URL query string
    if (getBeneficialOwners() != null) {
      for (int i = 0; i < getBeneficialOwners().size(); i++) {
        if (getBeneficialOwners().get(i) != null) {
          joiner.add(getBeneficialOwners().get(i).toUrlQueryString(String.format("%sbeneficialOwners%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deviceFingerprints` to the URL query string
    if (getDeviceFingerprints() != null) {
      for (int i = 0; i < getDeviceFingerprints().size(); i++) {
        if (getDeviceFingerprints().get(i) != null) {
          joiner.add(getDeviceFingerprints().get(i).toUrlQueryString(String.format("%sdeviceFingerprints%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `industry` to the URL query string
    if (getIndustry() != null) {
      joiner.add(String.format("%sindustry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIndustry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `annualRevenue` to the URL query string
    if (getAnnualRevenue() != null) {
      joiner.add(String.format("%sannualRevenue%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAnnualRevenue()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `numberOfEmployees` to the URL query string
    if (getNumberOfEmployees() != null) {
      joiner.add(String.format("%snumberOfEmployees%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNumberOfEmployees()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cashFlow` to the URL query string
    if (getCashFlow() != null) {
      joiner.add(String.format("%scashFlow%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCashFlow()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `yearOfIncorporation` to the URL query string
    if (getYearOfIncorporation() != null) {
      joiner.add(String.format("%syearOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getYearOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `countriesOfOperation` to the URL query string
    if (getCountriesOfOperation() != null) {
      for (int i = 0; i < getCountriesOfOperation().size(); i++) {
        joiner.add(String.format("%scountriesOfOperation%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getCountriesOfOperation().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `stockSymbol` to the URL query string
    if (getStockSymbol() != null) {
      joiner.add(String.format("%sstockSymbol%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStockSymbol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `businessVertical` to the URL query string
    if (getBusinessVertical() != null) {
      joiner.add(String.format("%sbusinessVertical%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBusinessVertical()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

