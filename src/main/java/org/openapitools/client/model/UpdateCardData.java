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
import org.openapitools.client.model.PatchBusinessCreditCard;
import org.openapitools.client.model.PatchBusinessDebitCard;
import org.openapitools.client.model.PatchBusinessVirtualCreditCard;
import org.openapitools.client.model.PatchBusinessVirtualDebitCard;
import org.openapitools.client.model.PatchBusinessVirtualDebitCardAttributes;
import org.openapitools.client.model.PatchIndividualDebitCard;
import org.openapitools.client.model.PatchIndividualVirtualDebitCard;



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
public class UpdateCardData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateCardData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateCardData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateCardData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PatchIndividualDebitCard> adapterPatchIndividualDebitCard = gson.getDelegateAdapter(this, TypeToken.get(PatchIndividualDebitCard.class));
            final TypeAdapter<PatchIndividualVirtualDebitCard> adapterPatchIndividualVirtualDebitCard = gson.getDelegateAdapter(this, TypeToken.get(PatchIndividualVirtualDebitCard.class));
            final TypeAdapter<PatchBusinessDebitCard> adapterPatchBusinessDebitCard = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessDebitCard.class));
            final TypeAdapter<PatchBusinessVirtualDebitCard> adapterPatchBusinessVirtualDebitCard = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessVirtualDebitCard.class));
            final TypeAdapter<PatchBusinessCreditCard> adapterPatchBusinessCreditCard = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessCreditCard.class));
            final TypeAdapter<PatchBusinessVirtualCreditCard> adapterPatchBusinessVirtualCreditCard = gson.getDelegateAdapter(this, TypeToken.get(PatchBusinessVirtualCreditCard.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateCardData>() {
                @Override
                public void write(JsonWriter out, UpdateCardData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PatchIndividualDebitCard`
                    if (value.getActualInstance() instanceof PatchIndividualDebitCard) {
                      JsonElement element = adapterPatchIndividualDebitCard.toJsonTree((PatchIndividualDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchIndividualVirtualDebitCard`
                    if (value.getActualInstance() instanceof PatchIndividualVirtualDebitCard) {
                      JsonElement element = adapterPatchIndividualVirtualDebitCard.toJsonTree((PatchIndividualVirtualDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchBusinessDebitCard`
                    if (value.getActualInstance() instanceof PatchBusinessDebitCard) {
                      JsonElement element = adapterPatchBusinessDebitCard.toJsonTree((PatchBusinessDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchBusinessVirtualDebitCard`
                    if (value.getActualInstance() instanceof PatchBusinessVirtualDebitCard) {
                      JsonElement element = adapterPatchBusinessVirtualDebitCard.toJsonTree((PatchBusinessVirtualDebitCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchBusinessCreditCard`
                    if (value.getActualInstance() instanceof PatchBusinessCreditCard) {
                      JsonElement element = adapterPatchBusinessCreditCard.toJsonTree((PatchBusinessCreditCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PatchBusinessVirtualCreditCard`
                    if (value.getActualInstance() instanceof PatchBusinessVirtualCreditCard) {
                      JsonElement element = adapterPatchBusinessVirtualCreditCard.toJsonTree((PatchBusinessVirtualCreditCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PatchBusinessCreditCard, PatchBusinessDebitCard, PatchBusinessVirtualCreditCard, PatchBusinessVirtualDebitCard, PatchIndividualDebitCard, PatchIndividualVirtualDebitCard");
                }

                @Override
                public UpdateCardData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PatchIndividualDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchIndividualDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchIndividualDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchIndividualDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchIndividualDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchIndividualDebitCard'", e);
                    }
                    // deserialize PatchIndividualVirtualDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchIndividualVirtualDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchIndividualVirtualDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchIndividualVirtualDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchIndividualVirtualDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchIndividualVirtualDebitCard'", e);
                    }
                    // deserialize PatchBusinessDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessDebitCard'", e);
                    }
                    // deserialize PatchBusinessVirtualDebitCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessVirtualDebitCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessVirtualDebitCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessVirtualDebitCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessVirtualDebitCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessVirtualDebitCard'", e);
                    }
                    // deserialize PatchBusinessCreditCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessCreditCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessCreditCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessCreditCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessCreditCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessCreditCard'", e);
                    }
                    // deserialize PatchBusinessVirtualCreditCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PatchBusinessVirtualCreditCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterPatchBusinessVirtualCreditCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PatchBusinessVirtualCreditCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PatchBusinessVirtualCreditCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PatchBusinessVirtualCreditCard'", e);
                    }

                    if (match == 1) {
                        UpdateCardData ret = new UpdateCardData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateCardData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateCardData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateCardData(PatchBusinessCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardData(PatchBusinessDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardData(PatchBusinessVirtualCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardData(PatchBusinessVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardData(PatchIndividualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardData(PatchIndividualVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PatchIndividualDebitCard", PatchIndividualDebitCard.class);
        schemas.put("PatchIndividualVirtualDebitCard", PatchIndividualVirtualDebitCard.class);
        schemas.put("PatchBusinessDebitCard", PatchBusinessDebitCard.class);
        schemas.put("PatchBusinessVirtualDebitCard", PatchBusinessVirtualDebitCard.class);
        schemas.put("PatchBusinessCreditCard", PatchBusinessCreditCard.class);
        schemas.put("PatchBusinessVirtualCreditCard", PatchBusinessVirtualCreditCard.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateCardData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PatchBusinessCreditCard, PatchBusinessDebitCard, PatchBusinessVirtualCreditCard, PatchBusinessVirtualDebitCard, PatchIndividualDebitCard, PatchIndividualVirtualDebitCard
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PatchIndividualDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchIndividualVirtualDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchBusinessDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchBusinessVirtualDebitCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchBusinessCreditCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PatchBusinessVirtualCreditCard) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PatchBusinessCreditCard, PatchBusinessDebitCard, PatchBusinessVirtualCreditCard, PatchBusinessVirtualDebitCard, PatchIndividualDebitCard, PatchIndividualVirtualDebitCard");
    }

    /**
     * Get the actual instance, which can be the following:
     * PatchBusinessCreditCard, PatchBusinessDebitCard, PatchBusinessVirtualCreditCard, PatchBusinessVirtualDebitCard, PatchIndividualDebitCard, PatchIndividualVirtualDebitCard
     *
     * @return The actual instance (PatchBusinessCreditCard, PatchBusinessDebitCard, PatchBusinessVirtualCreditCard, PatchBusinessVirtualDebitCard, PatchIndividualDebitCard, PatchIndividualVirtualDebitCard)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchIndividualDebitCard`. If the actual instance is not `PatchIndividualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchIndividualDebitCard`
     * @throws ClassCastException if the instance is not `PatchIndividualDebitCard`
     */
    public PatchIndividualDebitCard getPatchIndividualDebitCard() throws ClassCastException {
        return (PatchIndividualDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchIndividualVirtualDebitCard`. If the actual instance is not `PatchIndividualVirtualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchIndividualVirtualDebitCard`
     * @throws ClassCastException if the instance is not `PatchIndividualVirtualDebitCard`
     */
    public PatchIndividualVirtualDebitCard getPatchIndividualVirtualDebitCard() throws ClassCastException {
        return (PatchIndividualVirtualDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchBusinessDebitCard`. If the actual instance is not `PatchBusinessDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessDebitCard`
     * @throws ClassCastException if the instance is not `PatchBusinessDebitCard`
     */
    public PatchBusinessDebitCard getPatchBusinessDebitCard() throws ClassCastException {
        return (PatchBusinessDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchBusinessVirtualDebitCard`. If the actual instance is not `PatchBusinessVirtualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessVirtualDebitCard`
     * @throws ClassCastException if the instance is not `PatchBusinessVirtualDebitCard`
     */
    public PatchBusinessVirtualDebitCard getPatchBusinessVirtualDebitCard() throws ClassCastException {
        return (PatchBusinessVirtualDebitCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchBusinessCreditCard`. If the actual instance is not `PatchBusinessCreditCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessCreditCard`
     * @throws ClassCastException if the instance is not `PatchBusinessCreditCard`
     */
    public PatchBusinessCreditCard getPatchBusinessCreditCard() throws ClassCastException {
        return (PatchBusinessCreditCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PatchBusinessVirtualCreditCard`. If the actual instance is not `PatchBusinessVirtualCreditCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchBusinessVirtualCreditCard`
     * @throws ClassCastException if the instance is not `PatchBusinessVirtualCreditCard`
     */
    public PatchBusinessVirtualCreditCard getPatchBusinessVirtualCreditCard() throws ClassCastException {
        return (PatchBusinessVirtualCreditCard)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateCardData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PatchIndividualDebitCard
    try {
      PatchIndividualDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchIndividualDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchIndividualVirtualDebitCard
    try {
      PatchIndividualVirtualDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchIndividualVirtualDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchBusinessDebitCard
    try {
      PatchBusinessDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchBusinessVirtualDebitCard
    try {
      PatchBusinessVirtualDebitCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessVirtualDebitCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchBusinessCreditCard
    try {
      PatchBusinessCreditCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessCreditCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PatchBusinessVirtualCreditCard
    try {
      PatchBusinessVirtualCreditCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PatchBusinessVirtualCreditCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for UpdateCardData with oneOf schemas: PatchBusinessCreditCard, PatchBusinessDebitCard, PatchBusinessVirtualCreditCard, PatchBusinessVirtualDebitCard, PatchIndividualDebitCard, PatchIndividualVirtualDebitCard. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of UpdateCardData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateCardData
  * @throws IOException if the JSON string is invalid with respect to UpdateCardData
  */
  public static UpdateCardData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCardData.class);
  }

 /**
  * Convert an instance of UpdateCardData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
