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
 * CreatePlaidCounterpartyAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePlaidCounterpartyAttributes {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUSINESS("Business"),
    
    PERSON("Person"),
    
    UNKNOWN("Unknown");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERIFY_NAME = "verifyName";
  @SerializedName(SERIALIZED_NAME_VERIFY_NAME)
  private Boolean verifyName = false;

  public static final String SERIALIZED_NAME_PLAID_PROCESSOR_TOKEN = "plaidProcessorToken";
  @SerializedName(SERIALIZED_NAME_PLAID_PROCESSOR_TOKEN)
  private String plaidProcessorToken;

  /**
   * Gets or Sets permissions
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    CREDITONLY("CreditOnly"),
    
    DEBITONLY("DebitOnly"),
    
    CREDITANDDEBIT("CreditAndDebit");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PermissionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PermissionsEnum permissions;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotencyKey";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;

  public CreatePlaidCounterpartyAttributes() {
  }

  public CreatePlaidCounterpartyAttributes type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreatePlaidCounterpartyAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreatePlaidCounterpartyAttributes verifyName(Boolean verifyName) {
    
    this.verifyName = verifyName;
    return this;
  }

   /**
   * Get verifyName
   * @return verifyName
  **/
  @javax.annotation.Nullable
  public Boolean getVerifyName() {
    return verifyName;
  }


  public void setVerifyName(Boolean verifyName) {
    this.verifyName = verifyName;
  }


  public CreatePlaidCounterpartyAttributes plaidProcessorToken(String plaidProcessorToken) {
    
    this.plaidProcessorToken = plaidProcessorToken;
    return this;
  }

   /**
   * Get plaidProcessorToken
   * @return plaidProcessorToken
  **/
  @javax.annotation.Nonnull
  public String getPlaidProcessorToken() {
    return plaidProcessorToken;
  }


  public void setPlaidProcessorToken(String plaidProcessorToken) {
    this.plaidProcessorToken = plaidProcessorToken;
  }


  public CreatePlaidCounterpartyAttributes permissions(PermissionsEnum permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  public PermissionsEnum getPermissions() {
    return permissions;
  }


  public void setPermissions(PermissionsEnum permissions) {
    this.permissions = permissions;
  }


  public CreatePlaidCounterpartyAttributes tags(Object tags) {
    
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


  public CreatePlaidCounterpartyAttributes idempotencyKey(String idempotencyKey) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlaidCounterpartyAttributes createPlaidCounterpartyAttributes = (CreatePlaidCounterpartyAttributes) o;
    return Objects.equals(this.type, createPlaidCounterpartyAttributes.type) &&
        Objects.equals(this.name, createPlaidCounterpartyAttributes.name) &&
        Objects.equals(this.verifyName, createPlaidCounterpartyAttributes.verifyName) &&
        Objects.equals(this.plaidProcessorToken, createPlaidCounterpartyAttributes.plaidProcessorToken) &&
        Objects.equals(this.permissions, createPlaidCounterpartyAttributes.permissions) &&
        Objects.equals(this.tags, createPlaidCounterpartyAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createPlaidCounterpartyAttributes.idempotencyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, verifyName, plaidProcessorToken, permissions, tags, idempotencyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlaidCounterpartyAttributes {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    verifyName: ").append(toIndentedString(verifyName)).append("\n");
    sb.append("    plaidProcessorToken: ").append(toIndentedString(plaidProcessorToken)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("verifyName");
    openapiFields.add("plaidProcessorToken");
    openapiFields.add("permissions");
    openapiFields.add("tags");
    openapiFields.add("idempotencyKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("plaidProcessorToken");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreatePlaidCounterpartyAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePlaidCounterpartyAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePlaidCounterpartyAttributes is not found in the empty JSON string", CreatePlaidCounterpartyAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePlaidCounterpartyAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePlaidCounterpartyAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePlaidCounterpartyAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("plaidProcessorToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plaidProcessorToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plaidProcessorToken").toString()));
      }
      if ((jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) && !jsonObj.get("permissions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
      if ((jsonObj.get("idempotencyKey") != null && !jsonObj.get("idempotencyKey").isJsonNull()) && !jsonObj.get("idempotencyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idempotencyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idempotencyKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePlaidCounterpartyAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePlaidCounterpartyAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePlaidCounterpartyAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePlaidCounterpartyAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePlaidCounterpartyAttributes>() {
           @Override
           public void write(JsonWriter out, CreatePlaidCounterpartyAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePlaidCounterpartyAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePlaidCounterpartyAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePlaidCounterpartyAttributes
  * @throws IOException if the JSON string is invalid with respect to CreatePlaidCounterpartyAttributes
  */
  public static CreatePlaidCounterpartyAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePlaidCounterpartyAttributes.class);
  }

 /**
  * Convert an instance of CreatePlaidCounterpartyAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

