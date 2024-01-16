/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
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
import org.openapitools.client.model.PatchBusinessApplication;
import org.openapitools.client.model.PatchBusinessApplicationBeneficialOwner;
import org.openapitools.client.model.PatchBusinessApplicationOfficer;
import org.openapitools.client.model.PatchIndividualApplication;
import org.openapitools.client.model.PatchSoleProprietorApplication;
import org.openapitools.client.model.PatchTrustApplication;
import org.openapitools.client.model.PatchTrustApplicationAttributes;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateApplicationData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateApplicationData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateApplicationData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateApplicationData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PatchBusinessApplication> adapterPatchBusinessApplication = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessApplication.class));
            final TypeAdapter<PatchBusinessApplicationOfficer> adapterPatchBusinessApplicationOfficer = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessApplicationOfficer.class));
            final TypeAdapter<PatchBusinessApplicationBeneficialOwner> adapterPatchBusinessApplicationBeneficialOwner = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessApplicationBeneficialOwner.class));
            final TypeAdapter<PatchSoleProprietorApplication> adapterPatchSoleProprietorApplication = gson.getDelegateAdapter(this, TypeToken.get(PatchSoleProprietorApplication.class));
            final TypeAdapter<PatchIndividualApplication> adapterPatchIndividualApplication = gson.getDelegateAdapter(this, TypeToken.get(PatchIndividualApplication.class));
            final TypeAdapter<PatchTrustApplication> adapterPatchTrustApplication = gson.getDelegateAdapter(this, TypeToken.get(PatchTrustApplication.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateApplicationData>() {
                @Override
                public void write(JsonWriter out, UpdateApplicationData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PatchBusinessApplication`
                    if (value.getActualInstance() instanceof PatchBusinessApplication) {
                      JsonElement element = adapterPatchBusinessApplication.toJsonTree((PatchBusinessApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchBusinessApplicationOfficer`
                    if (value.getActualInstance() instanceof PatchBusinessApplicationOfficer) {
                      JsonElement element = adapterPatchBusinessApplicationOfficer.toJsonTree((PatchBusinessApplicationOfficer)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchBusinessApplicationBeneficialOwner`
                    if (value.getActualInstance() instanceof PatchBusinessApplicationBeneficialOwner) {
                      JsonElement element = adapterPatchBusinessApplicationBeneficialOwner.toJsonTree((PatchBusinessApplicationBeneficialOwner)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchSoleProprietorApplication`
                    if (value.getActualInstance() instanceof PatchSoleProprietorApplication) {
                      JsonElement element = adapterPatchSoleProprietorApplication.toJsonTree((PatchSoleProprietorApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchIndividualApplication`
                    if (value.getActualInstance() instanceof PatchIndividualApplication) {
                      JsonElement element = adapterPatchIndividualApplication.toJsonTree((PatchIndividualApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchTrustApplication`
                    if (value.getActualInstance() instanceof PatchTrustApplication) {
                      JsonElement element = adapterPatchTrustApplication.toJsonTree((PatchTrustApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication");
                }

                @Override
                public UpdateApplicationData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PatchBusinessApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessApplication'", e);
                    }
                    // deserialize PatchBusinessApplicationOfficer
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessApplicationOfficer.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessApplicationOfficer;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessApplicationOfficer'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessApplicationOfficer failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessApplicationOfficer'", e);
                    }
                    // deserialize PatchBusinessApplicationBeneficialOwner
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessApplicationBeneficialOwner.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessApplicationBeneficialOwner;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessApplicationBeneficialOwner'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessApplicationBeneficialOwner failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessApplicationBeneficialOwner'", e);
                    }
                    // deserialize PatchSoleProprietorApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchSoleProprietorApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchSoleProprietorApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchSoleProprietorApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchSoleProprietorApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchSoleProprietorApplication'", e);
                    }
                    // deserialize PatchIndividualApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchIndividualApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchIndividualApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchIndividualApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchIndividualApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchIndividualApplication'", e);
                    }
                    // deserialize PatchTrustApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchTrustApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchTrustApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchTrustApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchTrustApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchTrustApplication'", e);
                    }

                    if (match == 1) {
                        UpdateApplicationData ret = new UpdateApplicationData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateApplicationData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateApplicationData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateApplicationData(PatchBusinessApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchBusinessApplicationBeneficialOwner o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchBusinessApplicationOfficer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchIndividualApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchSoleProprietorApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateApplicationData(PatchTrustApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PatchBusinessApplication", PatchBusinessApplication.class);
        schemas.put("PatchBusinessApplicationOfficer", PatchBusinessApplicationOfficer.class);
        schemas.put("PatchBusinessApplicationBeneficialOwner", PatchBusinessApplicationBeneficialOwner.class);
        schemas.put("PatchSoleProprietorApplication", PatchSoleProprietorApplication.class);
        schemas.put("PatchIndividualApplication", PatchIndividualApplication.class);
        schemas.put("PatchTrustApplication", PatchTrustApplication.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateApplicationData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PatchBusinessApplication) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchBusinessApplicationOfficer) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchBusinessApplicationBeneficialOwner) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchSoleProprietorApplication) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchIndividualApplication) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchTrustApplication) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication");
    }

    /**
     * Get the actual instance, which can be the following:
     * PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication
     *
     * @return The actual instance (PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchBusinessApplication`. If the actual instance is not `PatchBusinessApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessApplication`
     * @throws ClassCastException if the instance is not `PatchBusinessApplication`
     */
    public PatchBusinessApplication getPatchBusinessApplication() throws ClassCastException {
        return (PatchBusinessApplication)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchBusinessApplicationOfficer`. If the actual instance is not `PatchBusinessApplicationOfficer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessApplicationOfficer`
     * @throws ClassCastException if the instance is not `PatchBusinessApplicationOfficer`
     */
    public PatchBusinessApplicationOfficer getPatchBusinessApplicationOfficer() throws ClassCastException {
        return (PatchBusinessApplicationOfficer)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchBusinessApplicationBeneficialOwner`. If the actual instance is not `PatchBusinessApplicationBeneficialOwner`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessApplicationBeneficialOwner`
     * @throws ClassCastException if the instance is not `PatchBusinessApplicationBeneficialOwner`
     */
    public PatchBusinessApplicationBeneficialOwner getPatchBusinessApplicationBeneficialOwner() throws ClassCastException {
        return (PatchBusinessApplicationBeneficialOwner)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchSoleProprietorApplication`. If the actual instance is not `PatchSoleProprietorApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchSoleProprietorApplication`
     * @throws ClassCastException if the instance is not `PatchSoleProprietorApplication`
     */
    public PatchSoleProprietorApplication getPatchSoleProprietorApplication() throws ClassCastException {
        return (PatchSoleProprietorApplication)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchIndividualApplication`. If the actual instance is not `PatchIndividualApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchIndividualApplication`
     * @throws ClassCastException if the instance is not `PatchIndividualApplication`
     */
    public PatchIndividualApplication getPatchIndividualApplication() throws ClassCastException {
        return (PatchIndividualApplication)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchTrustApplication`. If the actual instance is not `PatchTrustApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchTrustApplication`
     * @throws ClassCastException if the instance is not `PatchTrustApplication`
     */
    public PatchTrustApplication getPatchTrustApplication() throws ClassCastException {
        return (PatchTrustApplication)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateApplicationData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PatchBusinessApplication
    try {
      PatchBusinessApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchBusinessApplicationOfficer
    try {
      PatchBusinessApplicationOfficer.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessApplicationOfficer failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchBusinessApplicationBeneficialOwner
    try {
      PatchBusinessApplicationBeneficialOwner.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessApplicationBeneficialOwner failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchSoleProprietorApplication
    try {
      PatchSoleProprietorApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchSoleProprietorApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchIndividualApplication
    try {
      PatchIndividualApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchIndividualApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchTrustApplication
    try {
      PatchTrustApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchTrustApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UpdateApplicationData with oneOf schemas: PatchBusinessApplication, PatchBusinessApplicationBeneficialOwner, PatchBusinessApplicationOfficer, PatchIndividualApplication, PatchSoleProprietorApplication, PatchTrustApplication. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of UpdateApplicationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateApplicationData
  * @throws IOException if the JSON string is invalid with respect to UpdateApplicationData
  */
  public static UpdateApplicationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateApplicationData.class);
  }

 /**
  * Convert an instance of UpdateApplicationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

