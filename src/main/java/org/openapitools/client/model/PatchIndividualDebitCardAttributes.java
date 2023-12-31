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
import org.openapitools.client.model.Address;
import org.openapitools.client.model.CardLevelLimits;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PatchIndividualDebitCardAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PatchIndividualDebitCardAttributes {
  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shippingAddress";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private Address shippingAddress;

  public static final String SERIALIZED_NAME_DESIGN = "design";
  @SerializedName(SERIALIZED_NAME_DESIGN)
  private String design;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Object tags;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private CardLevelLimits limits;

  public static final String SERIALIZED_NAME_DEFAULT_FUNDING_ACCOUNT_ID = "defaultFundingAccountId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_FUNDING_ACCOUNT_ID)
  private String defaultFundingAccountId;

  public PatchIndividualDebitCardAttributes() {
  }

  public PatchIndividualDebitCardAttributes shippingAddress(Address shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  public Address getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public PatchIndividualDebitCardAttributes design(String design) {
    
    this.design = design;
    return this;
  }

   /**
   * Get design
   * @return design
  **/
  @javax.annotation.Nullable
  public String getDesign() {
    return design;
  }


  public void setDesign(String design) {
    this.design = design;
  }


  public PatchIndividualDebitCardAttributes tags(Object tags) {
    
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


  public PatchIndividualDebitCardAttributes limits(CardLevelLimits limits) {
    
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @javax.annotation.Nullable
  public CardLevelLimits getLimits() {
    return limits;
  }


  public void setLimits(CardLevelLimits limits) {
    this.limits = limits;
  }


  public PatchIndividualDebitCardAttributes defaultFundingAccountId(String defaultFundingAccountId) {
    
    this.defaultFundingAccountId = defaultFundingAccountId;
    return this;
  }

   /**
   * Get defaultFundingAccountId
   * @return defaultFundingAccountId
  **/
  @javax.annotation.Nullable
  public String getDefaultFundingAccountId() {
    return defaultFundingAccountId;
  }


  public void setDefaultFundingAccountId(String defaultFundingAccountId) {
    this.defaultFundingAccountId = defaultFundingAccountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchIndividualDebitCardAttributes patchIndividualDebitCardAttributes = (PatchIndividualDebitCardAttributes) o;
    return Objects.equals(this.shippingAddress, patchIndividualDebitCardAttributes.shippingAddress) &&
        Objects.equals(this.design, patchIndividualDebitCardAttributes.design) &&
        Objects.equals(this.tags, patchIndividualDebitCardAttributes.tags) &&
        Objects.equals(this.limits, patchIndividualDebitCardAttributes.limits) &&
        Objects.equals(this.defaultFundingAccountId, patchIndividualDebitCardAttributes.defaultFundingAccountId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddress, design, tags, limits, defaultFundingAccountId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchIndividualDebitCardAttributes {\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    defaultFundingAccountId: ").append(toIndentedString(defaultFundingAccountId)).append("\n");
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
    openapiFields.add("shippingAddress");
    openapiFields.add("design");
    openapiFields.add("tags");
    openapiFields.add("limits");
    openapiFields.add("defaultFundingAccountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PatchIndividualDebitCardAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchIndividualDebitCardAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchIndividualDebitCardAttributes is not found in the empty JSON string", PatchIndividualDebitCardAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchIndividualDebitCardAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchIndividualDebitCardAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `shippingAddress`
      if (jsonObj.get("shippingAddress") != null && !jsonObj.get("shippingAddress").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("shippingAddress"));
      }
      if ((jsonObj.get("design") != null && !jsonObj.get("design").isJsonNull()) && !jsonObj.get("design").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `design` to be a primitive type in the JSON string but got `%s`", jsonObj.get("design").toString()));
      }
      // validate the optional field `limits`
      if (jsonObj.get("limits") != null && !jsonObj.get("limits").isJsonNull()) {
        CardLevelLimits.validateJsonElement(jsonObj.get("limits"));
      }
      if ((jsonObj.get("defaultFundingAccountId") != null && !jsonObj.get("defaultFundingAccountId").isJsonNull()) && !jsonObj.get("defaultFundingAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultFundingAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultFundingAccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchIndividualDebitCardAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchIndividualDebitCardAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchIndividualDebitCardAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchIndividualDebitCardAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchIndividualDebitCardAttributes>() {
           @Override
           public void write(JsonWriter out, PatchIndividualDebitCardAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchIndividualDebitCardAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchIndividualDebitCardAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchIndividualDebitCardAttributes
  * @throws IOException if the JSON string is invalid with respect to PatchIndividualDebitCardAttributes
  */
  public static PatchIndividualDebitCardAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchIndividualDebitCardAttributes.class);
  }

 /**
  * Convert an instance of PatchIndividualDebitCardAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

