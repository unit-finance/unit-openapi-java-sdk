/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.5
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
import java.util.Arrays;
import unit.java.sdk.model.AnnualIncome;
import unit.java.sdk.model.Occupation;
import unit.java.sdk.model.SourceOfIncome;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PatchIndividualApplicationAttributes
 */
@JsonPropertyOrder({
  PatchIndividualApplicationAttributes.JSON_PROPERTY_TAGS,
  PatchIndividualApplicationAttributes.JSON_PROPERTY_OCCUPATION,
  PatchIndividualApplicationAttributes.JSON_PROPERTY_ANNUAL_INCOME,
  PatchIndividualApplicationAttributes.JSON_PROPERTY_SOURCE_OF_INCOME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchIndividualApplicationAttributes {
  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_OCCUPATION = "occupation";
  private Occupation occupation;

  public static final String JSON_PROPERTY_ANNUAL_INCOME = "annualIncome";
  private AnnualIncome annualIncome;

  public static final String JSON_PROPERTY_SOURCE_OF_INCOME = "sourceOfIncome";
  private SourceOfIncome sourceOfIncome;

  public PatchIndividualApplicationAttributes() { 
  }

  public PatchIndividualApplicationAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public PatchIndividualApplicationAttributes occupation(Occupation occupation) {
    this.occupation = occupation;
    return this;
  }

   /**
   * Get occupation
   * @return occupation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCCUPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Occupation getOccupation() {
    return occupation;
  }


  @JsonProperty(JSON_PROPERTY_OCCUPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccupation(Occupation occupation) {
    this.occupation = occupation;
  }


  public PatchIndividualApplicationAttributes annualIncome(AnnualIncome annualIncome) {
    this.annualIncome = annualIncome;
    return this;
  }

   /**
   * Get annualIncome
   * @return annualIncome
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANNUAL_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AnnualIncome getAnnualIncome() {
    return annualIncome;
  }


  @JsonProperty(JSON_PROPERTY_ANNUAL_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualIncome(AnnualIncome annualIncome) {
    this.annualIncome = annualIncome;
  }


  public PatchIndividualApplicationAttributes sourceOfIncome(SourceOfIncome sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
    return this;
  }

   /**
   * Get sourceOfIncome
   * @return sourceOfIncome
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SourceOfIncome getSourceOfIncome() {
    return sourceOfIncome;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_OF_INCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceOfIncome(SourceOfIncome sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
  }


  /**
   * Return true if this patchIndividualApplication_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchIndividualApplicationAttributes patchIndividualApplicationAttributes = (PatchIndividualApplicationAttributes) o;
    return Objects.equals(this.tags, patchIndividualApplicationAttributes.tags) &&
        Objects.equals(this.occupation, patchIndividualApplicationAttributes.occupation) &&
        Objects.equals(this.annualIncome, patchIndividualApplicationAttributes.annualIncome) &&
        Objects.equals(this.sourceOfIncome, patchIndividualApplicationAttributes.sourceOfIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, occupation, annualIncome, sourceOfIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchIndividualApplicationAttributes {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    annualIncome: ").append(toIndentedString(annualIncome)).append("\n");
    sb.append("    sourceOfIncome: ").append(toIndentedString(sourceOfIncome)).append("\n");
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
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `occupation` to the URL query string
    if (getOccupation() != null) {
      joiner.add(String.format("%soccupation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOccupation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `annualIncome` to the URL query string
    if (getAnnualIncome() != null) {
      joiner.add(String.format("%sannualIncome%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAnnualIncome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sourceOfIncome` to the URL query string
    if (getSourceOfIncome() != null) {
      joiner.add(String.format("%ssourceOfIncome%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceOfIncome()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

