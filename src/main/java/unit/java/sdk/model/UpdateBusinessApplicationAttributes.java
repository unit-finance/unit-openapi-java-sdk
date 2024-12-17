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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import unit.java.sdk.model.BusinessAnnualRevenue;
import unit.java.sdk.model.BusinessNumberOfEmployees;
import unit.java.sdk.model.BusinessVertical;
import unit.java.sdk.model.CashFlow;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * UpdateBusinessApplicationAttributes
 */
@JsonPropertyOrder({
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_TAGS,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_ANNUAL_REVENUE,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_NUMBER_OF_EMPLOYEES,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_CASH_FLOW,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_YEAR_OF_INCORPORATION,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_COUNTRIES_OF_OPERATION,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_STOCK_SYMBOL,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_WEBSITE,
  UpdateBusinessApplicationAttributes.JSON_PROPERTY_BUSINESS_VERTICAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class UpdateBusinessApplicationAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

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

  public static final String JSON_PROPERTY_WEBSITE = "website";
  private String website;

  public static final String JSON_PROPERTY_BUSINESS_VERTICAL = "businessVertical";
  private BusinessVertical businessVertical;

  public UpdateBusinessApplicationAttributes() { 
  }

  public UpdateBusinessApplicationAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateBusinessApplicationAttributes putTagsItem(String key, String tagsItem) {
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


  public UpdateBusinessApplicationAttributes annualRevenue(BusinessAnnualRevenue annualRevenue) {
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


  public UpdateBusinessApplicationAttributes numberOfEmployees(BusinessNumberOfEmployees numberOfEmployees) {
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


  public UpdateBusinessApplicationAttributes cashFlow(CashFlow cashFlow) {
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


  public UpdateBusinessApplicationAttributes yearOfIncorporation(String yearOfIncorporation) {
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


  public UpdateBusinessApplicationAttributes countriesOfOperation(List<String> countriesOfOperation) {
    this.countriesOfOperation = countriesOfOperation;
    return this;
  }

  public UpdateBusinessApplicationAttributes addCountriesOfOperationItem(String countriesOfOperationItem) {
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


  public UpdateBusinessApplicationAttributes stockSymbol(String stockSymbol) {
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


  public UpdateBusinessApplicationAttributes website(String website) {
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


  public UpdateBusinessApplicationAttributes businessVertical(BusinessVertical businessVertical) {
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
   * Return true if this UpdateBusinessApplication_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBusinessApplicationAttributes updateBusinessApplicationAttributes = (UpdateBusinessApplicationAttributes) o;
    return Objects.equals(this.tags, updateBusinessApplicationAttributes.tags) &&
        Objects.equals(this.annualRevenue, updateBusinessApplicationAttributes.annualRevenue) &&
        Objects.equals(this.numberOfEmployees, updateBusinessApplicationAttributes.numberOfEmployees) &&
        Objects.equals(this.cashFlow, updateBusinessApplicationAttributes.cashFlow) &&
        Objects.equals(this.yearOfIncorporation, updateBusinessApplicationAttributes.yearOfIncorporation) &&
        Objects.equals(this.countriesOfOperation, updateBusinessApplicationAttributes.countriesOfOperation) &&
        Objects.equals(this.stockSymbol, updateBusinessApplicationAttributes.stockSymbol) &&
        Objects.equals(this.website, updateBusinessApplicationAttributes.website) &&
        Objects.equals(this.businessVertical, updateBusinessApplicationAttributes.businessVertical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, annualRevenue, numberOfEmployees, cashFlow, yearOfIncorporation, countriesOfOperation, stockSymbol, website, businessVertical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessApplicationAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    annualRevenue: ").append(toIndentedString(annualRevenue)).append("\n");
    sb.append("    numberOfEmployees: ").append(toIndentedString(numberOfEmployees)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    yearOfIncorporation: ").append(toIndentedString(yearOfIncorporation)).append("\n");
    sb.append("    countriesOfOperation: ").append(toIndentedString(countriesOfOperation)).append("\n");
    sb.append("    stockSymbol: ").append(toIndentedString(stockSymbol)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
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

    // add `website` to the URL query string
    if (getWebsite() != null) {
      joiner.add(String.format("%swebsite%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWebsite()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `businessVertical` to the URL query string
    if (getBusinessVertical() != null) {
      joiner.add(String.format("%sbusinessVertical%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBusinessVertical()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

