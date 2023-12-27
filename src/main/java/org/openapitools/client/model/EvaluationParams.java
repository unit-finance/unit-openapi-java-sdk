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
import java.util.Arrays;

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
 * EvaluationParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EvaluationParams {
  /**
   * Gets or Sets useSelfieVerification
   */
  @JsonAdapter(UseSelfieVerificationEnum.Adapter.class)
  public enum UseSelfieVerificationEnum {
    NEVER("Never"),
    
    REPLACEIDENTIFICATION("ReplaceIdentification"),
    
    ALWAYS("Always");

    private String value;

    UseSelfieVerificationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UseSelfieVerificationEnum fromValue(String value) {
      for (UseSelfieVerificationEnum b : UseSelfieVerificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UseSelfieVerificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UseSelfieVerificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UseSelfieVerificationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UseSelfieVerificationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USE_SELFIE_VERIFICATION = "useSelfieVerification";
  @SerializedName(SERIALIZED_NAME_USE_SELFIE_VERIFICATION)
  private UseSelfieVerificationEnum useSelfieVerification;

  public static final String SERIALIZED_NAME_REQUIRE_ID_VERIFICATION = "requireIdVerification";
  @SerializedName(SERIALIZED_NAME_REQUIRE_ID_VERIFICATION)
  private Boolean requireIdVerification = false;

  public EvaluationParams() {
  }

  public EvaluationParams useSelfieVerification(UseSelfieVerificationEnum useSelfieVerification) {
    
    this.useSelfieVerification = useSelfieVerification;
    return this;
  }

   /**
   * Get useSelfieVerification
   * @return useSelfieVerification
  **/
  @javax.annotation.Nullable
  public UseSelfieVerificationEnum getUseSelfieVerification() {
    return useSelfieVerification;
  }


  public void setUseSelfieVerification(UseSelfieVerificationEnum useSelfieVerification) {
    this.useSelfieVerification = useSelfieVerification;
  }


  public EvaluationParams requireIdVerification(Boolean requireIdVerification) {
    
    this.requireIdVerification = requireIdVerification;
    return this;
  }

   /**
   * Get requireIdVerification
   * @return requireIdVerification
  **/
  @javax.annotation.Nullable
  public Boolean getRequireIdVerification() {
    return requireIdVerification;
  }


  public void setRequireIdVerification(Boolean requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationParams evaluationParams = (EvaluationParams) o;
    return Objects.equals(this.useSelfieVerification, evaluationParams.useSelfieVerification) &&
        Objects.equals(this.requireIdVerification, evaluationParams.requireIdVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useSelfieVerification, requireIdVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationParams {\n");
    sb.append("    useSelfieVerification: ").append(toIndentedString(useSelfieVerification)).append("\n");
    sb.append("    requireIdVerification: ").append(toIndentedString(requireIdVerification)).append("\n");
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
    openapiFields.add("useSelfieVerification");
    openapiFields.add("requireIdVerification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EvaluationParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EvaluationParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EvaluationParams is not found in the empty JSON string", EvaluationParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EvaluationParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EvaluationParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("useSelfieVerification") != null && !jsonObj.get("useSelfieVerification").isJsonNull()) && !jsonObj.get("useSelfieVerification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `useSelfieVerification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("useSelfieVerification").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EvaluationParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EvaluationParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EvaluationParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EvaluationParams.class));

       return (TypeAdapter<T>) new TypeAdapter<EvaluationParams>() {
           @Override
           public void write(JsonWriter out, EvaluationParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EvaluationParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EvaluationParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EvaluationParams
  * @throws IOException if the JSON string is invalid with respect to EvaluationParams
  */
  public static EvaluationParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EvaluationParams.class);
  }

 /**
  * Convert an instance of EvaluationParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

