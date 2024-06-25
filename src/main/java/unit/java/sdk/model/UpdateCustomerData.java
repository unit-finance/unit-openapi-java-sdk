/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.5
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
import java.util.Arrays;
import unit.java.sdk.model.UpdateBusinessCustomer;
import unit.java.sdk.model.UpdateIndividualCustomer;
import unit.java.sdk.model.UpdateTrustCustomer;
import unit.java.sdk.model.UpdateTrustCustomerAttributes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import unit.java.sdk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = UpdateCustomerData.UpdateCustomerDataDeserializer.class)
@JsonSerialize(using = UpdateCustomerData.UpdateCustomerDataSerializer.class)
public class UpdateCustomerData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateCustomerData.class.getName());

    public static class UpdateCustomerDataSerializer extends StdSerializer<UpdateCustomerData> {
        public UpdateCustomerDataSerializer(Class<UpdateCustomerData> t) {
            super(t);
        }

        public UpdateCustomerDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(UpdateCustomerData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UpdateCustomerDataDeserializer extends StdDeserializer<UpdateCustomerData> {
        public UpdateCustomerDataDeserializer() {
            this(UpdateCustomerData.class);
        }

        public UpdateCustomerDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UpdateCustomerData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize UpdateBusinessCustomer
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateBusinessCustomer.class.equals(Integer.class) || UpdateBusinessCustomer.class.equals(Long.class) || UpdateBusinessCustomer.class.equals(Float.class) || UpdateBusinessCustomer.class.equals(Double.class) || UpdateBusinessCustomer.class.equals(Boolean.class) || UpdateBusinessCustomer.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateBusinessCustomer.class.equals(Integer.class) || UpdateBusinessCustomer.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateBusinessCustomer.class.equals(Float.class) || UpdateBusinessCustomer.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateBusinessCustomer.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateBusinessCustomer.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateBusinessCustomer.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateBusinessCustomer'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateBusinessCustomer'", e);
            }

            // deserialize UpdateIndividualCustomer
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateIndividualCustomer.class.equals(Integer.class) || UpdateIndividualCustomer.class.equals(Long.class) || UpdateIndividualCustomer.class.equals(Float.class) || UpdateIndividualCustomer.class.equals(Double.class) || UpdateIndividualCustomer.class.equals(Boolean.class) || UpdateIndividualCustomer.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateIndividualCustomer.class.equals(Integer.class) || UpdateIndividualCustomer.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateIndividualCustomer.class.equals(Float.class) || UpdateIndividualCustomer.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateIndividualCustomer.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateIndividualCustomer.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateIndividualCustomer.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateIndividualCustomer'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateIndividualCustomer'", e);
            }

            // deserialize UpdateTrustCustomer
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateTrustCustomer.class.equals(Integer.class) || UpdateTrustCustomer.class.equals(Long.class) || UpdateTrustCustomer.class.equals(Float.class) || UpdateTrustCustomer.class.equals(Double.class) || UpdateTrustCustomer.class.equals(Boolean.class) || UpdateTrustCustomer.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateTrustCustomer.class.equals(Integer.class) || UpdateTrustCustomer.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateTrustCustomer.class.equals(Float.class) || UpdateTrustCustomer.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateTrustCustomer.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateTrustCustomer.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateTrustCustomer.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateTrustCustomer'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateTrustCustomer'", e);
            }

            if (match == 1) {
                UpdateCustomerData ret = new UpdateCustomerData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UpdateCustomerData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UpdateCustomerData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UpdateCustomerData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public UpdateCustomerData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateCustomerData(UpdateBusinessCustomer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCustomerData(UpdateIndividualCustomer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCustomerData(UpdateTrustCustomer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateBusinessCustomer", UpdateBusinessCustomer.class);
        schemas.put("UpdateIndividualCustomer", UpdateIndividualCustomer.class);
        schemas.put("UpdateTrustCustomer", UpdateTrustCustomer.class);
        JSON.registerDescendants(UpdateCustomerData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateCustomerData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateBusinessCustomer, UpdateIndividualCustomer, UpdateTrustCustomer
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(UpdateBusinessCustomer.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateIndividualCustomer.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateTrustCustomer.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateBusinessCustomer, UpdateIndividualCustomer, UpdateTrustCustomer");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateBusinessCustomer, UpdateIndividualCustomer, UpdateTrustCustomer
     *
     * @return The actual instance (UpdateBusinessCustomer, UpdateIndividualCustomer, UpdateTrustCustomer)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateBusinessCustomer`. If the actual instance is not `UpdateBusinessCustomer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateBusinessCustomer`
     * @throws ClassCastException if the instance is not `UpdateBusinessCustomer`
     */
    public UpdateBusinessCustomer getUpdateBusinessCustomer() throws ClassCastException {
        return (UpdateBusinessCustomer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateIndividualCustomer`. If the actual instance is not `UpdateIndividualCustomer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateIndividualCustomer`
     * @throws ClassCastException if the instance is not `UpdateIndividualCustomer`
     */
    public UpdateIndividualCustomer getUpdateIndividualCustomer() throws ClassCastException {
        return (UpdateIndividualCustomer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateTrustCustomer`. If the actual instance is not `UpdateTrustCustomer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateTrustCustomer`
     * @throws ClassCastException if the instance is not `UpdateTrustCustomer`
     */
    public UpdateTrustCustomer getUpdateTrustCustomer() throws ClassCastException {
        return (UpdateTrustCustomer)super.getActualInstance();
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

    if (getActualInstance() instanceof UpdateIndividualCustomer) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateIndividualCustomer)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateBusinessCustomer) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateBusinessCustomer)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateTrustCustomer) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateTrustCustomer)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

