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
import org.openapitools.client.model.Beneficiary;
import org.openapitools.client.model.DeviceFingerprint;
import org.openapitools.client.model.Grantor;
import org.openapitools.client.model.TrustContact;
import org.openapitools.client.model.Trustee;

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
 * CreateTrustApplicationAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class CreateTrustApplicationAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATE_OF_INCORPORATION = "stateOfIncorporation";
  @SerializedName(SERIALIZED_NAME_STATE_OF_INCORPORATION)
  private String stateOfIncorporation;

  /**
   * Gets or Sets revocability
   */
  @JsonAdapter(RevocabilityEnum.Adapter.class)
  public enum RevocabilityEnum {
    REVOCABLE("Revocable"),
    
    IRREVOCABLE("Irrevocable");

    private String value;

    RevocabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RevocabilityEnum fromValue(String value) {
      for (RevocabilityEnum b : RevocabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RevocabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RevocabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RevocabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RevocabilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVOCABILITY = "revocability";
  @SerializedName(SERIALIZED_NAME_REVOCABILITY)
  private RevocabilityEnum revocability;

  /**
   * Gets or Sets sourceOfFunds
   */
  @JsonAdapter(SourceOfFundsEnum.Adapter.class)
  public enum SourceOfFundsEnum {
    INHERITANCE("Inheritance"),
    
    SALARY("Salary"),
    
    SAVINGS("Savings"),
    
    INVESTMENTRETURNS("InvestmentReturns"),
    
    GIFTS("Gifts");

    private String value;

    SourceOfFundsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceOfFundsEnum fromValue(String value) {
      for (SourceOfFundsEnum b : SourceOfFundsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceOfFundsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceOfFundsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceOfFundsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceOfFundsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS = "sourceOfFunds";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS)
  private SourceOfFundsEnum sourceOfFunds;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public static final String SERIALIZED_NAME_GRANTOR = "grantor";
  @SerializedName(SERIALIZED_NAME_GRANTOR)
  private Grantor grantor;

  public static final String SERIALIZED_NAME_TRUSTEES = "trustees";
  @SerializedName(SERIALIZED_NAME_TRUSTEES)
  private List<Trustee> trustees = new ArrayList<>();

  public static final String SERIALIZED_NAME_BENEFICIARIES = "beneficiaries";
  @SerializedName(SERIALIZED_NAME_BENEFICIARIES)
  private List<Beneficiary> beneficiaries = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private TrustContact contact;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public static final String SERIALIZED_NAME_DEVICE_FINGERPRINTS = "deviceFingerprints";
  @SerializedName(SERIALIZED_NAME_DEVICE_FINGERPRINTS)
  private List<DeviceFingerprint> deviceFingerprints;

  public CreateTrustApplicationAttributes() {
  }

  public CreateTrustApplicationAttributes name(String name) {
    
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


  public CreateTrustApplicationAttributes stateOfIncorporation(String stateOfIncorporation) {
    
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


  public CreateTrustApplicationAttributes revocability(RevocabilityEnum revocability) {
    
    this.revocability = revocability;
    return this;
  }

   /**
   * Get revocability
   * @return revocability
  **/
  @javax.annotation.Nonnull
  public RevocabilityEnum getRevocability() {
    return revocability;
  }


  public void setRevocability(RevocabilityEnum revocability) {
    this.revocability = revocability;
  }


  public CreateTrustApplicationAttributes sourceOfFunds(SourceOfFundsEnum sourceOfFunds) {
    
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @javax.annotation.Nonnull
  public SourceOfFundsEnum getSourceOfFunds() {
    return sourceOfFunds;
  }


  public void setSourceOfFunds(SourceOfFundsEnum sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public CreateTrustApplicationAttributes taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nonnull
  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public CreateTrustApplicationAttributes grantor(Grantor grantor) {
    
    this.grantor = grantor;
    return this;
  }

   /**
   * Get grantor
   * @return grantor
  **/
  @javax.annotation.Nonnull
  public Grantor getGrantor() {
    return grantor;
  }


  public void setGrantor(Grantor grantor) {
    this.grantor = grantor;
  }


  public CreateTrustApplicationAttributes trustees(List<Trustee> trustees) {
    
    this.trustees = trustees;
    return this;
  }

  public CreateTrustApplicationAttributes addTrusteesItem(Trustee trusteesItem) {
    if (this.trustees == null) {
      this.trustees = new ArrayList<>();
    }
    this.trustees.add(trusteesItem);
    return this;
  }

   /**
   * Get trustees
   * @return trustees
  **/
  @javax.annotation.Nonnull
  public List<Trustee> getTrustees() {
    return trustees;
  }


  public void setTrustees(List<Trustee> trustees) {
    this.trustees = trustees;
  }


  public CreateTrustApplicationAttributes beneficiaries(List<Beneficiary> beneficiaries) {
    
    this.beneficiaries = beneficiaries;
    return this;
  }

  public CreateTrustApplicationAttributes addBeneficiariesItem(Beneficiary beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

   /**
   * Get beneficiaries
   * @return beneficiaries
  **/
  @javax.annotation.Nonnull
  public List<Beneficiary> getBeneficiaries() {
    return beneficiaries;
  }


  public void setBeneficiaries(List<Beneficiary> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }


  public CreateTrustApplicationAttributes contact(TrustContact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nonnull
  public TrustContact getContact() {
    return contact;
  }


  public void setContact(TrustContact contact) {
    this.contact = contact;
  }


  public CreateTrustApplicationAttributes ip(String ip) {
    
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


  public CreateTrustApplicationAttributes tags(Object tags) {
    
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


  public CreateTrustApplicationAttributes idempotencyKey(String idempotencyKey) {
    
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


  public CreateTrustApplicationAttributes deviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    
    this.deviceFingerprints = deviceFingerprints;
    return this;
  }

  public CreateTrustApplicationAttributes addDeviceFingerprintsItem(DeviceFingerprint deviceFingerprintsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrustApplicationAttributes createTrustApplicationAttributes = (CreateTrustApplicationAttributes) o;
    return Objects.equals(this.name, createTrustApplicationAttributes.name) &&
        Objects.equals(this.stateOfIncorporation, createTrustApplicationAttributes.stateOfIncorporation) &&
        Objects.equals(this.revocability, createTrustApplicationAttributes.revocability) &&
        Objects.equals(this.sourceOfFunds, createTrustApplicationAttributes.sourceOfFunds) &&
        Objects.equals(this.taxId, createTrustApplicationAttributes.taxId) &&
        Objects.equals(this.grantor, createTrustApplicationAttributes.grantor) &&
        Objects.equals(this.trustees, createTrustApplicationAttributes.trustees) &&
        Objects.equals(this.beneficiaries, createTrustApplicationAttributes.beneficiaries) &&
        Objects.equals(this.contact, createTrustApplicationAttributes.contact) &&
        Objects.equals(this.ip, createTrustApplicationAttributes.ip) &&
        Objects.equals(this.tags, createTrustApplicationAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createTrustApplicationAttributes.idempotencyKey) &&
        Objects.equals(this.deviceFingerprints, createTrustApplicationAttributes.deviceFingerprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stateOfIncorporation, revocability, sourceOfFunds, taxId, grantor, trustees, beneficiaries, contact, ip, tags, idempotencyKey, deviceFingerprints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrustApplicationAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    revocability: ").append(toIndentedString(revocability)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    grantor: ").append(toIndentedString(grantor)).append("\n");
    sb.append("    trustees: ").append(toIndentedString(trustees)).append("\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    deviceFingerprints: ").append(toIndentedString(deviceFingerprints)).append("\n");
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
    openapiFields.add("stateOfIncorporation");
    openapiFields.add("revocability");
    openapiFields.add("sourceOfFunds");
    openapiFields.add("taxId");
    openapiFields.add("grantor");
    openapiFields.add("trustees");
    openapiFields.add("beneficiaries");
    openapiFields.add("contact");
    openapiFields.add("ip");
    openapiFields.add("tags");
    openapiFields.add("idempotencyKey");
    openapiFields.add("deviceFingerprints");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("stateOfIncorporation");
    openapiRequiredFields.add("revocability");
    openapiRequiredFields.add("sourceOfFunds");
    openapiRequiredFields.add("taxId");
    openapiRequiredFields.add("grantor");
    openapiRequiredFields.add("trustees");
    openapiRequiredFields.add("beneficiaries");
    openapiRequiredFields.add("contact");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTrustApplicationAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTrustApplicationAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTrustApplicationAttributes is not found in the empty JSON string", CreateTrustApplicationAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTrustApplicationAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTrustApplicationAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTrustApplicationAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("stateOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOfIncorporation").toString()));
      }
      if (!jsonObj.get("revocability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revocability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revocability").toString()));
      }
      if (!jsonObj.get("sourceOfFunds").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceOfFunds` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceOfFunds").toString()));
      }
      if (!jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
      // validate the required field `grantor`
      Grantor.validateJsonElement(jsonObj.get("grantor"));
      // ensure the json data is an array
      if (!jsonObj.get("trustees").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `trustees` to be an array in the JSON string but got `%s`", jsonObj.get("trustees").toString()));
      }

      JsonArray jsonArraytrustees = jsonObj.getAsJsonArray("trustees");
      // validate the required field `trustees` (array)
      for (int i = 0; i < jsonArraytrustees.size(); i++) {
        Trustee.validateJsonElement(jsonArraytrustees.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("beneficiaries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaries` to be an array in the JSON string but got `%s`", jsonObj.get("beneficiaries").toString()));
      }

      JsonArray jsonArraybeneficiaries = jsonObj.getAsJsonArray("beneficiaries");
      // validate the required field `beneficiaries` (array)
      for (int i = 0; i < jsonArraybeneficiaries.size(); i++) {
        Beneficiary.validateJsonElement(jsonArraybeneficiaries.get(i));
      };
      // validate the required field `contact`
      TrustContact.validateJsonElement(jsonObj.get("contact"));
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTrustApplicationAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTrustApplicationAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTrustApplicationAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTrustApplicationAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTrustApplicationAttributes>() {
           @Override
           public void write(JsonWriter out, CreateTrustApplicationAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTrustApplicationAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTrustApplicationAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTrustApplicationAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateTrustApplicationAttributes
  */
  public static CreateTrustApplicationAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTrustApplicationAttributes.class);
  }

 /**
  * Convert an instance of CreateTrustApplicationAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

