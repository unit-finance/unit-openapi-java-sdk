/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.1.0
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
import unit.java.sdk.model.CreateBusinessCreditCardRequest;
import unit.java.sdk.model.CreateBusinessDebitCardRequest;
import unit.java.sdk.model.CreateBusinessVirtualCreditCardRequest;
import unit.java.sdk.model.CreateBusinessVirtualDebitCardRequest;
import unit.java.sdk.model.CreateBusinessVirtualDebitCardRequestAttributes;
import unit.java.sdk.model.CreateCardRelationships;
import unit.java.sdk.model.CreateIndividualDebitCardRequest;
import unit.java.sdk.model.CreateIndividualVirtualDebitCardRequest;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
@JsonDeserialize(using = CreateCardRequestData.CreateCardRequestDataDeserializer.class)
@JsonSerialize(using = CreateCardRequestData.CreateCardRequestDataSerializer.class)
public class CreateCardRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateCardRequestData.class.getName());

    public static class CreateCardRequestDataSerializer extends StdSerializer<CreateCardRequestData> {
        public CreateCardRequestDataSerializer(Class<CreateCardRequestData> t) {
            super(t);
        }

        public CreateCardRequestDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateCardRequestData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateCardRequestDataDeserializer extends StdDeserializer<CreateCardRequestData> {
        public CreateCardRequestDataDeserializer() {
            this(CreateCardRequestData.class);
        }

        public CreateCardRequestDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateCardRequestData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateBusinessCreditCardRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessCreditCardRequest.class.equals(Integer.class) || CreateBusinessCreditCardRequest.class.equals(Long.class) || CreateBusinessCreditCardRequest.class.equals(Float.class) || CreateBusinessCreditCardRequest.class.equals(Double.class) || CreateBusinessCreditCardRequest.class.equals(Boolean.class) || CreateBusinessCreditCardRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessCreditCardRequest.class.equals(Integer.class) || CreateBusinessCreditCardRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessCreditCardRequest.class.equals(Float.class) || CreateBusinessCreditCardRequest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessCreditCardRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessCreditCardRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessCreditCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessCreditCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessCreditCardRequest'", e);
            }

            // deserialize CreateBusinessDebitCardRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessDebitCardRequest.class.equals(Integer.class) || CreateBusinessDebitCardRequest.class.equals(Long.class) || CreateBusinessDebitCardRequest.class.equals(Float.class) || CreateBusinessDebitCardRequest.class.equals(Double.class) || CreateBusinessDebitCardRequest.class.equals(Boolean.class) || CreateBusinessDebitCardRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessDebitCardRequest.class.equals(Integer.class) || CreateBusinessDebitCardRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessDebitCardRequest.class.equals(Float.class) || CreateBusinessDebitCardRequest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessDebitCardRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessDebitCardRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessDebitCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessDebitCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessDebitCardRequest'", e);
            }

            // deserialize CreateBusinessVirtualCreditCardRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessVirtualCreditCardRequest.class.equals(Integer.class) || CreateBusinessVirtualCreditCardRequest.class.equals(Long.class) || CreateBusinessVirtualCreditCardRequest.class.equals(Float.class) || CreateBusinessVirtualCreditCardRequest.class.equals(Double.class) || CreateBusinessVirtualCreditCardRequest.class.equals(Boolean.class) || CreateBusinessVirtualCreditCardRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessVirtualCreditCardRequest.class.equals(Integer.class) || CreateBusinessVirtualCreditCardRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessVirtualCreditCardRequest.class.equals(Float.class) || CreateBusinessVirtualCreditCardRequest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessVirtualCreditCardRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessVirtualCreditCardRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessVirtualCreditCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessVirtualCreditCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessVirtualCreditCardRequest'", e);
            }

            // deserialize CreateBusinessVirtualDebitCardRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBusinessVirtualDebitCardRequest.class.equals(Integer.class) || CreateBusinessVirtualDebitCardRequest.class.equals(Long.class) || CreateBusinessVirtualDebitCardRequest.class.equals(Float.class) || CreateBusinessVirtualDebitCardRequest.class.equals(Double.class) || CreateBusinessVirtualDebitCardRequest.class.equals(Boolean.class) || CreateBusinessVirtualDebitCardRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBusinessVirtualDebitCardRequest.class.equals(Integer.class) || CreateBusinessVirtualDebitCardRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBusinessVirtualDebitCardRequest.class.equals(Float.class) || CreateBusinessVirtualDebitCardRequest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBusinessVirtualDebitCardRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBusinessVirtualDebitCardRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBusinessVirtualDebitCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBusinessVirtualDebitCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBusinessVirtualDebitCardRequest'", e);
            }

            // deserialize CreateIndividualDebitCardRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateIndividualDebitCardRequest.class.equals(Integer.class) || CreateIndividualDebitCardRequest.class.equals(Long.class) || CreateIndividualDebitCardRequest.class.equals(Float.class) || CreateIndividualDebitCardRequest.class.equals(Double.class) || CreateIndividualDebitCardRequest.class.equals(Boolean.class) || CreateIndividualDebitCardRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateIndividualDebitCardRequest.class.equals(Integer.class) || CreateIndividualDebitCardRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateIndividualDebitCardRequest.class.equals(Float.class) || CreateIndividualDebitCardRequest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateIndividualDebitCardRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateIndividualDebitCardRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateIndividualDebitCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateIndividualDebitCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateIndividualDebitCardRequest'", e);
            }

            // deserialize CreateIndividualVirtualDebitCardRequest
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateIndividualVirtualDebitCardRequest.class.equals(Integer.class) || CreateIndividualVirtualDebitCardRequest.class.equals(Long.class) || CreateIndividualVirtualDebitCardRequest.class.equals(Float.class) || CreateIndividualVirtualDebitCardRequest.class.equals(Double.class) || CreateIndividualVirtualDebitCardRequest.class.equals(Boolean.class) || CreateIndividualVirtualDebitCardRequest.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateIndividualVirtualDebitCardRequest.class.equals(Integer.class) || CreateIndividualVirtualDebitCardRequest.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateIndividualVirtualDebitCardRequest.class.equals(Float.class) || CreateIndividualVirtualDebitCardRequest.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateIndividualVirtualDebitCardRequest.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateIndividualVirtualDebitCardRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateIndividualVirtualDebitCardRequest.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateIndividualVirtualDebitCardRequest'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateIndividualVirtualDebitCardRequest'", e);
            }

            if (match == 1) {
                CreateCardRequestData ret = new CreateCardRequestData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateCardRequestData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateCardRequestData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateCardRequestData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateCardRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateCardRequestData(CreateBusinessCreditCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardRequestData(CreateBusinessDebitCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardRequestData(CreateBusinessVirtualCreditCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardRequestData(CreateBusinessVirtualDebitCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardRequestData(CreateIndividualDebitCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateCardRequestData(CreateIndividualVirtualDebitCardRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateBusinessCreditCardRequest", CreateBusinessCreditCardRequest.class);
        schemas.put("CreateBusinessDebitCardRequest", CreateBusinessDebitCardRequest.class);
        schemas.put("CreateBusinessVirtualCreditCardRequest", CreateBusinessVirtualCreditCardRequest.class);
        schemas.put("CreateBusinessVirtualDebitCardRequest", CreateBusinessVirtualDebitCardRequest.class);
        schemas.put("CreateIndividualDebitCardRequest", CreateIndividualDebitCardRequest.class);
        schemas.put("CreateIndividualVirtualDebitCardRequest", CreateIndividualVirtualDebitCardRequest.class);
        JSON.registerDescendants(CreateCardRequestData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateCardRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateBusinessCreditCardRequest, CreateBusinessDebitCardRequest, CreateBusinessVirtualCreditCardRequest, CreateBusinessVirtualDebitCardRequest, CreateIndividualDebitCardRequest, CreateIndividualVirtualDebitCardRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateBusinessCreditCardRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBusinessDebitCardRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBusinessVirtualCreditCardRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBusinessVirtualDebitCardRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateIndividualDebitCardRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateIndividualVirtualDebitCardRequest.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateBusinessCreditCardRequest, CreateBusinessDebitCardRequest, CreateBusinessVirtualCreditCardRequest, CreateBusinessVirtualDebitCardRequest, CreateIndividualDebitCardRequest, CreateIndividualVirtualDebitCardRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateBusinessCreditCardRequest, CreateBusinessDebitCardRequest, CreateBusinessVirtualCreditCardRequest, CreateBusinessVirtualDebitCardRequest, CreateIndividualDebitCardRequest, CreateIndividualVirtualDebitCardRequest
     *
     * @return The actual instance (CreateBusinessCreditCardRequest, CreateBusinessDebitCardRequest, CreateBusinessVirtualCreditCardRequest, CreateBusinessVirtualDebitCardRequest, CreateIndividualDebitCardRequest, CreateIndividualVirtualDebitCardRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateBusinessCreditCardRequest`. If the actual instance is not `CreateBusinessCreditCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessCreditCardRequest`
     * @throws ClassCastException if the instance is not `CreateBusinessCreditCardRequest`
     */
    public CreateBusinessCreditCardRequest getCreateBusinessCreditCardRequest() throws ClassCastException {
        return (CreateBusinessCreditCardRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateBusinessDebitCardRequest`. If the actual instance is not `CreateBusinessDebitCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessDebitCardRequest`
     * @throws ClassCastException if the instance is not `CreateBusinessDebitCardRequest`
     */
    public CreateBusinessDebitCardRequest getCreateBusinessDebitCardRequest() throws ClassCastException {
        return (CreateBusinessDebitCardRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateBusinessVirtualCreditCardRequest`. If the actual instance is not `CreateBusinessVirtualCreditCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessVirtualCreditCardRequest`
     * @throws ClassCastException if the instance is not `CreateBusinessVirtualCreditCardRequest`
     */
    public CreateBusinessVirtualCreditCardRequest getCreateBusinessVirtualCreditCardRequest() throws ClassCastException {
        return (CreateBusinessVirtualCreditCardRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateBusinessVirtualDebitCardRequest`. If the actual instance is not `CreateBusinessVirtualDebitCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBusinessVirtualDebitCardRequest`
     * @throws ClassCastException if the instance is not `CreateBusinessVirtualDebitCardRequest`
     */
    public CreateBusinessVirtualDebitCardRequest getCreateBusinessVirtualDebitCardRequest() throws ClassCastException {
        return (CreateBusinessVirtualDebitCardRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateIndividualDebitCardRequest`. If the actual instance is not `CreateIndividualDebitCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateIndividualDebitCardRequest`
     * @throws ClassCastException if the instance is not `CreateIndividualDebitCardRequest`
     */
    public CreateIndividualDebitCardRequest getCreateIndividualDebitCardRequest() throws ClassCastException {
        return (CreateIndividualDebitCardRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateIndividualVirtualDebitCardRequest`. If the actual instance is not `CreateIndividualVirtualDebitCardRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateIndividualVirtualDebitCardRequest`
     * @throws ClassCastException if the instance is not `CreateIndividualVirtualDebitCardRequest`
     */
    public CreateIndividualVirtualDebitCardRequest getCreateIndividualVirtualDebitCardRequest() throws ClassCastException {
        return (CreateIndividualVirtualDebitCardRequest)super.getActualInstance();
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

    if (getActualInstance() instanceof CreateIndividualDebitCardRequest) {
        if (getActualInstance() != null) {
          joiner.add(((CreateIndividualDebitCardRequest)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessDebitCardRequest) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessDebitCardRequest)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessCreditCardRequest) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessCreditCardRequest)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateIndividualVirtualDebitCardRequest) {
        if (getActualInstance() != null) {
          joiner.add(((CreateIndividualVirtualDebitCardRequest)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessVirtualDebitCardRequest) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessVirtualDebitCardRequest)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBusinessVirtualCreditCardRequest) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBusinessVirtualCreditCardRequest)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}
