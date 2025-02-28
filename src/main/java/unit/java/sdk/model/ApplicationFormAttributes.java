/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.1
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
import unit.java.sdk.model.ApplicationFormPrefill;
import unit.java.sdk.model.ApplicationFormSettingsOverride;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * ApplicationFormAttributes
 */
@JsonPropertyOrder({
  ApplicationFormAttributes.JSON_PROPERTY_EMAIL,
  ApplicationFormAttributes.JSON_PROPERTY_URL,
  ApplicationFormAttributes.JSON_PROPERTY_STAGE,
  ApplicationFormAttributes.JSON_PROPERTY_APPLICANT_DETAILS,
  ApplicationFormAttributes.JSON_PROPERTY_SETTINGS_OVERRIDE,
  ApplicationFormAttributes.JSON_PROPERTY_TAGS,
  ApplicationFormAttributes.JSON_PROPERTY_ALLOWED_APPLICATION_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ApplicationFormAttributes {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  /**
   * Gets or Sets stage
   */
  public enum StageEnum {
    CHOOSE_BUSINESS_OR_INDIVIDUAL("ChooseBusinessOrIndividual"),
    
    ENTER_INDIVIDUAL_INFORMATION("EnterIndividualInformation"),
    
    INDIVIDUAL_PHONE_VERIFICATION("IndividualPhoneVerification"),
    
    INDIVIDUAL_APPLICATION_CREATED("IndividualApplicationCreated"),
    
    ENTER_BUSINESS_INFORMATION("EnterBusinessInformation"),
    
    ENTER_BUSINESS_ADDITIONAL_INFORMATION("EnterBusinessAdditionalInformation"),
    
    ENTER_OFFICER_INFORMATION("EnterOfficerInformation"),
    
    BUSINESS_PHONE_VERIFICATION("BusinessPhoneVerification"),
    
    ENTER_BENEFICIAL_OWNERS_INFORMATION("EnterBeneficialOwnersInformation"),
    
    BUSINESS_APPLICATION_CREATED("BusinessApplicationCreated"),
    
    ENTER_SOLE_PROPRIETORSHIP_INFORMATION("EnterSoleProprietorshipInformation"),
    
    ENTER_SOLE_PROPRIETORSHIP_BUSINESS_INFORMATION("EnterSoleProprietorshipBusinessInformation"),
    
    SOLE_PROPRIETORSHIP_PHONE_VERIFICATION("SoleProprietorshipPhoneVerification"),
    
    SOLE_PROPRIETORSHIP_APPLICATION_CREATED("SoleProprietorshipApplicationCreated");

    private String value;

    StageEnum(String value) {
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
    public static StageEnum fromValue(String value) {
      for (StageEnum b : StageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STAGE = "stage";
  private StageEnum stage;

  public static final String JSON_PROPERTY_APPLICANT_DETAILS = "applicantDetails";
  private ApplicationFormPrefill applicantDetails;

  public static final String JSON_PROPERTY_SETTINGS_OVERRIDE = "settingsOverride";
  private ApplicationFormSettingsOverride settingsOverride;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  /**
   * Gets or Sets allowedApplicationTypes
   */
  public enum AllowedApplicationTypesEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business"),
    
    SOLE_PROPRIETORSHIP("SoleProprietorship");

    private String value;

    AllowedApplicationTypesEnum(String value) {
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
    public static AllowedApplicationTypesEnum fromValue(String value) {
      for (AllowedApplicationTypesEnum b : AllowedApplicationTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALLOWED_APPLICATION_TYPES = "allowedApplicationTypes";
  private List<AllowedApplicationTypesEnum> allowedApplicationTypes = new ArrayList<>();

  public ApplicationFormAttributes() { 
  }

  public ApplicationFormAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public ApplicationFormAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ApplicationFormAttributes stage(StageEnum stage) {
    this.stage = stage;
    return this;
  }

  /**
   * Get stage
   * @return stage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StageEnum getStage() {
    return stage;
  }


  @JsonProperty(JSON_PROPERTY_STAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStage(StageEnum stage) {
    this.stage = stage;
  }


  public ApplicationFormAttributes applicantDetails(ApplicationFormPrefill applicantDetails) {
    this.applicantDetails = applicantDetails;
    return this;
  }

  /**
   * Get applicantDetails
   * @return applicantDetails
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationFormPrefill getApplicantDetails() {
    return applicantDetails;
  }


  @JsonProperty(JSON_PROPERTY_APPLICANT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicantDetails(ApplicationFormPrefill applicantDetails) {
    this.applicantDetails = applicantDetails;
  }


  public ApplicationFormAttributes settingsOverride(ApplicationFormSettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
    return this;
  }

  /**
   * Get settingsOverride
   * @return settingsOverride
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApplicationFormSettingsOverride getSettingsOverride() {
    return settingsOverride;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettingsOverride(ApplicationFormSettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
  }


  public ApplicationFormAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ApplicationFormAttributes putTagsItem(String key, String tagsItem) {
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


  public ApplicationFormAttributes allowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
    return this;
  }

  public ApplicationFormAttributes addAllowedApplicationTypesItem(AllowedApplicationTypesEnum allowedApplicationTypesItem) {
    if (this.allowedApplicationTypes == null) {
      this.allowedApplicationTypes = new ArrayList<>();
    }
    this.allowedApplicationTypes.add(allowedApplicationTypesItem);
    return this;
  }

  /**
   * Get allowedApplicationTypes
   * @return allowedApplicationTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_APPLICATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AllowedApplicationTypesEnum> getAllowedApplicationTypes() {
    return allowedApplicationTypes;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_APPLICATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
  }


  /**
   * Return true if this ApplicationForm_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationFormAttributes applicationFormAttributes = (ApplicationFormAttributes) o;
    return Objects.equals(this.email, applicationFormAttributes.email) &&
        Objects.equals(this.url, applicationFormAttributes.url) &&
        Objects.equals(this.stage, applicationFormAttributes.stage) &&
        Objects.equals(this.applicantDetails, applicationFormAttributes.applicantDetails) &&
        Objects.equals(this.settingsOverride, applicationFormAttributes.settingsOverride) &&
        Objects.equals(this.tags, applicationFormAttributes.tags) &&
        Objects.equals(this.allowedApplicationTypes, applicationFormAttributes.allowedApplicationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, url, stage, applicantDetails, settingsOverride, tags, allowedApplicationTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationFormAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    applicantDetails: ").append(toIndentedString(applicantDetails)).append("\n");
    sb.append("    settingsOverride: ").append(toIndentedString(settingsOverride)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    allowedApplicationTypes: ").append(toIndentedString(allowedApplicationTypes)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stage` to the URL query string
    if (getStage() != null) {
      joiner.add(String.format("%sstage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `applicantDetails` to the URL query string
    if (getApplicantDetails() != null) {
      joiner.add(getApplicantDetails().toUrlQueryString(prefix + "applicantDetails" + suffix));
    }

    // add `settingsOverride` to the URL query string
    if (getSettingsOverride() != null) {
      joiner.add(getSettingsOverride().toUrlQueryString(prefix + "settingsOverride" + suffix));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `allowedApplicationTypes` to the URL query string
    if (getAllowedApplicationTypes() != null) {
      for (int i = 0; i < getAllowedApplicationTypes().size(); i++) {
        joiner.add(String.format("%sallowedApplicationTypes%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getAllowedApplicationTypes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

