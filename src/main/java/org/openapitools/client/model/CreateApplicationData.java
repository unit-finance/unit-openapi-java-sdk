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
import org.openapitools.client.model.CreateBusinessApplication;
import org.openapitools.client.model.CreateIndividualApplication;
import org.openapitools.client.model.CreateSoleProprietorApplication;
import org.openapitools.client.model.CreateTrustApplication;
import org.openapitools.client.model.CreateTrustApplicationAttributes;



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
public class CreateApplicationData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateApplicationData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateApplicationData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateApplicationData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateIndividualApplication> adapterCreateIndividualApplication = gson.getDelegateAdapter(this, TypeToken.get(CreateIndividualApplication.class));
            final TypeAdapter<CreateSoleProprietorApplication> adapterCreateSoleProprietorApplication = gson.getDelegateAdapter(this, TypeToken.get(CreateSoleProprietorApplication.class));
            final TypeAdapter<CreateBusinessApplication> adapterCreateBusinessApplication = gson.getDelegateAdapter(this, TypeToken.get(CreateBusinessApplication.class));
            final TypeAdapter<CreateTrustApplication> adapterCreateTrustApplication = gson.getDelegateAdapter(this, TypeToken.get(CreateTrustApplication.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateApplicationData>() {
                @Override
                public void write(JsonWriter out, CreateApplicationData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateIndividualApplication`
                    if (value.getActualInstance() instanceof CreateIndividualApplication) {
                      JsonElement element = adapterCreateIndividualApplication.toJsonTree((CreateIndividualApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateSoleProprietorApplication`
                    if (value.getActualInstance() instanceof CreateSoleProprietorApplication) {
                      JsonElement element = adapterCreateSoleProprietorApplication.toJsonTree((CreateSoleProprietorApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateBusinessApplication`
                    if (value.getActualInstance() instanceof CreateBusinessApplication) {
                      JsonElement element = adapterCreateBusinessApplication.toJsonTree((CreateBusinessApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateTrustApplication`
                    if (value.getActualInstance() instanceof CreateTrustApplication) {
                      JsonElement element = adapterCreateTrustApplication.toJsonTree((CreateTrustApplication)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication");
                }

                @Override
                public CreateApplicationData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateIndividualApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateIndividualApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateIndividualApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateIndividualApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateIndividualApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateIndividualApplication'", e);
                    }
                    // deserialize CreateSoleProprietorApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateSoleProprietorApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateSoleProprietorApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSoleProprietorApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSoleProprietorApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSoleProprietorApplication'", e);
                    }
                    // deserialize CreateBusinessApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateBusinessApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateBusinessApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateBusinessApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateBusinessApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateBusinessApplication'", e);
                    }
                    // deserialize CreateTrustApplication
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreateTrustApplication.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreateTrustApplication;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateTrustApplication'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateTrustApplication failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateTrustApplication'", e);
                    }

                    if (match == 1) {
                        CreateApplicationData ret = new CreateApplicationData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateApplicationData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateApplicationData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateApplicationData(CreateBusinessApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateApplicationData(CreateIndividualApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateApplicationData(CreateSoleProprietorApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateApplicationData(CreateTrustApplication o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateIndividualApplication", CreateIndividualApplication.class);
        schemas.put("CreateSoleProprietorApplication", CreateSoleProprietorApplication.class);
        schemas.put("CreateBusinessApplication", CreateBusinessApplication.class);
        schemas.put("CreateTrustApplication", CreateTrustApplication.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateApplicationData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateIndividualApplication) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateSoleProprietorApplication) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateBusinessApplication) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateTrustApplication) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication
     *
     * @return The actual instance (CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateIndividualApplication`. If the actual instance is not `CreateIndividualApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateIndividualApplication`
     * @throws ClassCastException if the instance is not `CreateIndividualApplication`
     */
    public CreateIndividualApplication getCreateIndividualApplication() throws ClassCastException {
        return (CreateIndividualApplication)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateSoleProprietorApplication`. If the actual instance is not `CreateSoleProprietorApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSoleProprietorApplication`
     * @throws ClassCastException if the instance is not `CreateSoleProprietorApplication`
     */
    public CreateSoleProprietorApplication getCreateSoleProprietorApplication() throws ClassCastException {
        return (CreateSoleProprietorApplication)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateBusinessApplication`. If the actual instance is not `CreateBusinessApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessApplication`
     * @throws ClassCastException if the instance is not `CreateBusinessApplication`
     */
    public CreateBusinessApplication getCreateBusinessApplication() throws ClassCastException {
        return (CreateBusinessApplication)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateTrustApplication`. If the actual instance is not `CreateTrustApplication`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateTrustApplication`
     * @throws ClassCastException if the instance is not `CreateTrustApplication`
     */
    public CreateTrustApplication getCreateTrustApplication() throws ClassCastException {
        return (CreateTrustApplication)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateApplicationData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateIndividualApplication
    try {
      CreateIndividualApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateIndividualApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateSoleProprietorApplication
    try {
      CreateSoleProprietorApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSoleProprietorApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateBusinessApplication
    try {
      CreateBusinessApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateBusinessApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateTrustApplication
    try {
      CreateTrustApplication.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateTrustApplication failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateApplicationData with oneOf schemas: CreateBusinessApplication, CreateIndividualApplication, CreateSoleProprietorApplication, CreateTrustApplication. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CreateApplicationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApplicationData
  * @throws IOException if the JSON string is invalid with respect to CreateApplicationData
  */
  public static CreateApplicationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApplicationData.class);
  }

 /**
  * Convert an instance of CreateApplicationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

