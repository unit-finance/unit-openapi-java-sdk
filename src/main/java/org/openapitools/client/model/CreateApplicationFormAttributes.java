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
import org.openapitools.client.model.Prefilled;
import org.openapitools.client.model.RequireIdVerification;
import org.openapitools.client.model.SettingsOverride;

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
 * CreateApplicationFormAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApplicationFormAttributes {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_APPLICANT_DETAILS = "applicantDetails";
  @SerializedName(SERIALIZED_NAME_APPLICANT_DETAILS)
  private Prefilled applicantDetails;

  public static final String SERIALIZED_NAME_SETTINGS_OVERRIDE = "settingsOverride";
  @SerializedName(SERIALIZED_NAME_SETTINGS_OVERRIDE)
  private SettingsOverride settingsOverride;

  public static final String SERIALIZED_NAME_REQUIRE_ID_VERIFICATION = "requireIdVerification";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID_VERIFICATION)
  private RequireIdVerification requireIdVerification;

  /**
   * Gets or Sets allowedApplicationTypes
   */
  @JsonAdapter(AllowedApplicationTypesEnum.Adapter.class)
  public enum AllowedApplicationTypesEnum {
    INDIVIDUAL("Individual"),
    
    BUSINESS("Business"),
    
    SOLEPROPRIETORSHIP("SoleProprietorship");

    private String value;

    AllowedApplicationTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedApplicationTypesEnum fromValue(String value) {
      for (AllowedApplicationTypesEnum b : AllowedApplicationTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedApplicationTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedApplicationTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedApplicationTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedApplicationTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_APPLICATION_TYPES = "allowedApplicationTypes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_APPLICATION_TYPES)
  private List<AllowedApplicationTypesEnum> allowedApplicationTypes;

  /**
   * Gets or Sets lang
   */
  @JsonAdapter(LangEnum.Adapter.class)
  public enum LangEnum {
    EN("en"),
    
    ES("es");

    private String value;

    LangEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LangEnum fromValue(String value) {
      for (LangEnum b : LangEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LangEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LangEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LangEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LangEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LANG = "lang";
  @SerializedName(SERIALIZED_NAME_LANG)
  private LangEnum lang;

  public static final String SERIALIZED_NAME_HIDE_APPLICATION_PROGRESS_TRACKER = "hideApplicationProgressTracker";
  @SerializedName(SERIALIZED_NAME_HIDE_APPLICATION_PROGRESS_TRACKER)
  private Boolean hideApplicationProgressTracker;

  public CreateApplicationFormAttributes() {
  }

  public CreateApplicationFormAttributes email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CreateApplicationFormAttributes tags(Object tags) {
    
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


  public CreateApplicationFormAttributes applicantDetails(Prefilled applicantDetails) {
    
    this.applicantDetails = applicantDetails;
    return this;
  }

   /**
   * Get applicantDetails
   * @return applicantDetails
  **/
  @javax.annotation.Nullable
  public Prefilled getApplicantDetails() {
    return applicantDetails;
  }


  public void setApplicantDetails(Prefilled applicantDetails) {
    this.applicantDetails = applicantDetails;
  }


  public CreateApplicationFormAttributes settingsOverride(SettingsOverride settingsOverride) {
    
    this.settingsOverride = settingsOverride;
    return this;
  }

   /**
   * Get settingsOverride
   * @return settingsOverride
  **/
  @javax.annotation.Nullable
  public SettingsOverride getSettingsOverride() {
    return settingsOverride;
  }


  public void setSettingsOverride(SettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
  }


  public CreateApplicationFormAttributes requireIdVerification(RequireIdVerification requireIdVerification) {
    
    this.requireIdVerification = requireIdVerification;
    return this;
  }

   /**
   * Get requireIdVerification
   * @return requireIdVerification
  **/
  @javax.annotation.Nullable
  public RequireIdVerification getRequireIdVerification() {
    return requireIdVerification;
  }


  public void setRequireIdVerification(RequireIdVerification requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
  }


  public CreateApplicationFormAttributes allowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    
    this.allowedApplicationTypes = allowedApplicationTypes;
    return this;
  }

  public CreateApplicationFormAttributes addAllowedApplicationTypesItem(AllowedApplicationTypesEnum allowedApplicationTypesItem) {
    if (this.allowedApplicationTypes == null) {
      this.allowedApplicationTypes = new ArrayList<>();
    }
    this.allowedApplicationTypes.add(allowedApplicationTypesItem);
    return this;
  }

   /**
   * Get allowedApplicationTypes
   * @return allowedApplicationTypes
  **/
  @javax.annotation.Nullable
  public List<AllowedApplicationTypesEnum> getAllowedApplicationTypes() {
    return allowedApplicationTypes;
  }


  public void setAllowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
  }


  public CreateApplicationFormAttributes lang(LangEnum lang) {
    
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @javax.annotation.Nullable
  public LangEnum getLang() {
    return lang;
  }


  public void setLang(LangEnum lang) {
    this.lang = lang;
  }


  public CreateApplicationFormAttributes hideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
    return this;
  }

   /**
   * Get hideApplicationProgressTracker
   * @return hideApplicationProgressTracker
  **/
  @javax.annotation.Nullable
  public Boolean getHideApplicationProgressTracker() {
    return hideApplicationProgressTracker;
  }


  public void setHideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicationFormAttributes createApplicationFormAttributes = (CreateApplicationFormAttributes) o;
    return Objects.equals(this.email, createApplicationFormAttributes.email) &&
        Objects.equals(this.tags, createApplicationFormAttributes.tags) &&
        Objects.equals(this.applicantDetails, createApplicationFormAttributes.applicantDetails) &&
        Objects.equals(this.settingsOverride, createApplicationFormAttributes.settingsOverride) &&
        Objects.equals(this.requireIdVerification, createApplicationFormAttributes.requireIdVerification) &&
        Objects.equals(this.allowedApplicationTypes, createApplicationFormAttributes.allowedApplicationTypes) &&
        Objects.equals(this.lang, createApplicationFormAttributes.lang) &&
        Objects.equals(this.hideApplicationProgressTracker, createApplicationFormAttributes.hideApplicationProgressTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, tags, applicantDetails, settingsOverride, requireIdVerification, allowedApplicationTypes, lang, hideApplicationProgressTracker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicationFormAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applicantDetails: ").append(toIndentedString(applicantDetails)).append("\n");
    sb.append("    settingsOverride: ").append(toIndentedString(settingsOverride)).append("\n");
    sb.append("    requireIdVerification: ").append(toIndentedString(requireIdVerification)).append("\n");
    sb.append("    allowedApplicationTypes: ").append(toIndentedString(allowedApplicationTypes)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    hideApplicationProgressTracker: ").append(toIndentedString(hideApplicationProgressTracker)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("tags");
    openapiFields.add("applicantDetails");
    openapiFields.add("settingsOverride");
    openapiFields.add("requireIdVerification");
    openapiFields.add("allowedApplicationTypes");
    openapiFields.add("lang");
    openapiFields.add("hideApplicationProgressTracker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateApplicationFormAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateApplicationFormAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateApplicationFormAttributes is not found in the empty JSON string", CreateApplicationFormAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateApplicationFormAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateApplicationFormAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field `applicantDetails`
      if (jsonObj.get("applicantDetails") != null && !jsonObj.get("applicantDetails").isJsonNull()) {
        Prefilled.validateJsonElement(jsonObj.get("applicantDetails"));
      }
      // validate the optional field `settingsOverride`
      if (jsonObj.get("settingsOverride") != null && !jsonObj.get("settingsOverride").isJsonNull()) {
        SettingsOverride.validateJsonElement(jsonObj.get("settingsOverride"));
      }
      // validate the optional field `requireIdVerification`
      if (jsonObj.get("requireIdVerification") != null && !jsonObj.get("requireIdVerification").isJsonNull()) {
        RequireIdVerification.validateJsonElement(jsonObj.get("requireIdVerification"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowedApplicationTypes") != null && !jsonObj.get("allowedApplicationTypes").isJsonNull() && !jsonObj.get("allowedApplicationTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedApplicationTypes` to be an array in the JSON string but got `%s`", jsonObj.get("allowedApplicationTypes").toString()));
      }
      if ((jsonObj.get("lang") != null && !jsonObj.get("lang").isJsonNull()) && !jsonObj.get("lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lang").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateApplicationFormAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateApplicationFormAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateApplicationFormAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateApplicationFormAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateApplicationFormAttributes>() {
           @Override
           public void write(JsonWriter out, CreateApplicationFormAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateApplicationFormAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateApplicationFormAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApplicationFormAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateApplicationFormAttributes
  */
  public static CreateApplicationFormAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApplicationFormAttributes.class);
  }

 /**
  * Convert an instance of CreateApplicationFormAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

