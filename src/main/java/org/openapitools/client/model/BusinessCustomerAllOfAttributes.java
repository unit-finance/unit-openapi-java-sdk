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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.AuthorizedUser;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.EntityType;
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
 * BusinessCustomerAllOfAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-18T11:36:55.328745700+02:00[Asia/Jerusalem]")
public class BusinessCustomerAllOfAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

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

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  /**
   * Gets or Sets riskRate
   */
  @JsonAdapter(RiskRateEnum.Adapter.class)
  public enum RiskRateEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    RiskRateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RiskRateEnum fromValue(String value) {
      for (RiskRateEnum b : RiskRateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RiskRateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskRateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RiskRateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RiskRateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RISK_RATE = "riskRate";
  @SerializedName(SERIALIZED_NAME_RISK_RATE)
  private RiskRateEnum riskRate;

  public static final String SERIALIZED_NAME_AUTHORIZED_USERS = "authorizedUsers";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED_USERS)
  private List<AuthorizedUser> authorizedUsers;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("Active"),
    
    ARCHIVED("Archived");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * Gets or Sets archiveReason
   */
  @JsonAdapter(ArchiveReasonEnum.Adapter.class)
  public enum ArchiveReasonEnum {
    INACTIVE("Inactive"),
    
    FRAUDACHACTIVITY("FraudACHActivity"),
    
    FRAUDCARDACTIVITY("FraudCardActivity"),
    
    FRAUDCHECKACTIVITY("FraudCheckActivity"),
    
    FRAUDAPPLICATIONHISTORY("FraudApplicationHistory"),
    
    FRAUDACCOUNTACTIVITY("FraudAccountActivity"),
    
    FRAUDCLIENTIDENTIFIED("FraudClientIdentified"),
    
    FRAUDLINKEDTOFRAUDULENTCUSTOMER("FraudLinkedToFraudulentCustomer");

    private String value;

    ArchiveReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArchiveReasonEnum fromValue(String value) {
      for (ArchiveReasonEnum b : ArchiveReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArchiveReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArchiveReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArchiveReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArchiveReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARCHIVE_REASON = "archiveReason";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_REASON)
  private ArchiveReasonEnum archiveReason;

  public BusinessCustomerAllOfAttributes() {
  }

  public BusinessCustomerAllOfAttributes createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BusinessCustomerAllOfAttributes name(String name) {
    
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


  public BusinessCustomerAllOfAttributes dba(String dba) {
    
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


  public BusinessCustomerAllOfAttributes ein(String ein) {
    
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
  @javax.annotation.Nullable
  public String getEin() {
    return ein;
  }


  public void setEin(String ein) {
    this.ein = ein;
  }


  public BusinessCustomerAllOfAttributes entityType(EntityType entityType) {
    
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


  public BusinessCustomerAllOfAttributes dateOfIncorporation(LocalDate dateOfIncorporation) {
    
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


  public BusinessCustomerAllOfAttributes stateOfIncorporation(String stateOfIncorporation) {
    
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


  public BusinessCustomerAllOfAttributes purpose(String purpose) {
    
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


  public BusinessCustomerAllOfAttributes phone(Phone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public Phone getPhone() {
    return phone;
  }


  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public BusinessCustomerAllOfAttributes address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public BusinessCustomerAllOfAttributes contact(Contact contact) {
    
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


  public BusinessCustomerAllOfAttributes tags(Object tags) {
    
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


  public BusinessCustomerAllOfAttributes riskRate(RiskRateEnum riskRate) {
    
    this.riskRate = riskRate;
    return this;
  }

   /**
   * Get riskRate
   * @return riskRate
  **/
  @javax.annotation.Nullable
  public RiskRateEnum getRiskRate() {
    return riskRate;
  }


  public void setRiskRate(RiskRateEnum riskRate) {
    this.riskRate = riskRate;
  }


  public BusinessCustomerAllOfAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    
    this.authorizedUsers = authorizedUsers;
    return this;
  }

  public BusinessCustomerAllOfAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
    if (this.authorizedUsers == null) {
      this.authorizedUsers = new ArrayList<>();
    }
    this.authorizedUsers.add(authorizedUsersItem);
    return this;
  }

   /**
   * Get authorizedUsers
   * @return authorizedUsers
  **/
  @javax.annotation.Nullable
  public List<AuthorizedUser> getAuthorizedUsers() {
    return authorizedUsers;
  }


  public void setAuthorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
  }


  public BusinessCustomerAllOfAttributes status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BusinessCustomerAllOfAttributes archiveReason(ArchiveReasonEnum archiveReason) {
    
    this.archiveReason = archiveReason;
    return this;
  }

   /**
   * Get archiveReason
   * @return archiveReason
  **/
  @javax.annotation.Nullable
  public ArchiveReasonEnum getArchiveReason() {
    return archiveReason;
  }


  public void setArchiveReason(ArchiveReasonEnum archiveReason) {
    this.archiveReason = archiveReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessCustomerAllOfAttributes businessCustomerAllOfAttributes = (BusinessCustomerAllOfAttributes) o;
    return Objects.equals(this.createdAt, businessCustomerAllOfAttributes.createdAt) &&
        Objects.equals(this.name, businessCustomerAllOfAttributes.name) &&
        Objects.equals(this.dba, businessCustomerAllOfAttributes.dba) &&
        Objects.equals(this.ein, businessCustomerAllOfAttributes.ein) &&
        Objects.equals(this.entityType, businessCustomerAllOfAttributes.entityType) &&
        Objects.equals(this.dateOfIncorporation, businessCustomerAllOfAttributes.dateOfIncorporation) &&
        Objects.equals(this.stateOfIncorporation, businessCustomerAllOfAttributes.stateOfIncorporation) &&
        Objects.equals(this.purpose, businessCustomerAllOfAttributes.purpose) &&
        Objects.equals(this.phone, businessCustomerAllOfAttributes.phone) &&
        Objects.equals(this.address, businessCustomerAllOfAttributes.address) &&
        Objects.equals(this.contact, businessCustomerAllOfAttributes.contact) &&
        Objects.equals(this.tags, businessCustomerAllOfAttributes.tags) &&
        Objects.equals(this.riskRate, businessCustomerAllOfAttributes.riskRate) &&
        Objects.equals(this.authorizedUsers, businessCustomerAllOfAttributes.authorizedUsers) &&
        Objects.equals(this.status, businessCustomerAllOfAttributes.status) &&
        Objects.equals(this.archiveReason, businessCustomerAllOfAttributes.archiveReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, name, dba, ein, entityType, dateOfIncorporation, stateOfIncorporation, purpose, phone, address, contact, tags, riskRate, authorizedUsers, status, archiveReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessCustomerAllOfAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    riskRate: ").append(toIndentedString(riskRate)).append("\n");
    sb.append("    authorizedUsers: ").append(toIndentedString(authorizedUsers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    archiveReason: ").append(toIndentedString(archiveReason)).append("\n");
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
    openapiFields.add("createdAt");
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
    openapiFields.add("tags");
    openapiFields.add("riskRate");
    openapiFields.add("authorizedUsers");
    openapiFields.add("status");
    openapiFields.add("archiveReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("stateOfIncorporation");
    openapiRequiredFields.add("contact");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BusinessCustomerAllOfAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusinessCustomerAllOfAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessCustomerAllOfAttributes is not found in the empty JSON string", BusinessCustomerAllOfAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BusinessCustomerAllOfAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessCustomerAllOfAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessCustomerAllOfAttributes.openapiRequiredFields) {
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
      if ((jsonObj.get("ein") != null && !jsonObj.get("ein").isJsonNull()) && !jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if (!jsonObj.get("stateOfIncorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOfIncorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOfIncorporation").toString()));
      }
      if ((jsonObj.get("purpose") != null && !jsonObj.get("purpose").isJsonNull()) && !jsonObj.get("purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purpose").toString()));
      }
      // validate the optional field `phone`
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) {
        Phone.validateJsonElement(jsonObj.get("phone"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      // validate the required field `contact`
      Contact.validateJsonElement(jsonObj.get("contact"));
      if ((jsonObj.get("riskRate") != null && !jsonObj.get("riskRate").isJsonNull()) && !jsonObj.get("riskRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `riskRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riskRate").toString()));
      }
      if (jsonObj.get("authorizedUsers") != null && !jsonObj.get("authorizedUsers").isJsonNull()) {
        JsonArray jsonArrayauthorizedUsers = jsonObj.getAsJsonArray("authorizedUsers");
        if (jsonArrayauthorizedUsers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("authorizedUsers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `authorizedUsers` to be an array in the JSON string but got `%s`", jsonObj.get("authorizedUsers").toString()));
          }

          // validate the optional field `authorizedUsers` (array)
          for (int i = 0; i < jsonArrayauthorizedUsers.size(); i++) {
            AuthorizedUser.validateJsonElement(jsonArrayauthorizedUsers.get(i));
          };
        }
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("archiveReason") != null && !jsonObj.get("archiveReason").isJsonNull()) && !jsonObj.get("archiveReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `archiveReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("archiveReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessCustomerAllOfAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessCustomerAllOfAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessCustomerAllOfAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessCustomerAllOfAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessCustomerAllOfAttributes>() {
           @Override
           public void write(JsonWriter out, BusinessCustomerAllOfAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessCustomerAllOfAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessCustomerAllOfAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessCustomerAllOfAttributes
  * @throws IOException if the JSON string is invalid with respect to BusinessCustomerAllOfAttributes
  */
  public static BusinessCustomerAllOfAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessCustomerAllOfAttributes.class);
  }

 /**
  * Convert an instance of BusinessCustomerAllOfAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

