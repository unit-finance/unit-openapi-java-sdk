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
import unit.java.sdk.model.CreateAchPayment;
import unit.java.sdk.model.CreateAchPaymentCounterparty;
import unit.java.sdk.model.CreateAchPaymentPlaid;
import unit.java.sdk.model.CreateBookPayment;
import unit.java.sdk.model.CreatePushToCardPayment;
import unit.java.sdk.model.CreatePushToCardPaymentAttributes;
import unit.java.sdk.model.CreatePushToCardPaymentRelationships;
import unit.java.sdk.model.CreateWirePayment;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
@JsonDeserialize(using = CreatePaymentRequestData.CreatePaymentRequestDataDeserializer.class)
@JsonSerialize(using = CreatePaymentRequestData.CreatePaymentRequestDataSerializer.class)
public class CreatePaymentRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreatePaymentRequestData.class.getName());

    public static class CreatePaymentRequestDataSerializer extends StdSerializer<CreatePaymentRequestData> {
        public CreatePaymentRequestDataSerializer(Class<CreatePaymentRequestData> t) {
            super(t);
        }

        public CreatePaymentRequestDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreatePaymentRequestData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreatePaymentRequestDataDeserializer extends StdDeserializer<CreatePaymentRequestData> {
        public CreatePaymentRequestDataDeserializer() {
            this(CreatePaymentRequestData.class);
        }

        public CreatePaymentRequestDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreatePaymentRequestData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateAchPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateAchPayment.class.equals(Integer.class) || CreateAchPayment.class.equals(Long.class) || CreateAchPayment.class.equals(Float.class) || CreateAchPayment.class.equals(Double.class) || CreateAchPayment.class.equals(Boolean.class) || CreateAchPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateAchPayment.class.equals(Integer.class) || CreateAchPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateAchPayment.class.equals(Float.class) || CreateAchPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateAchPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateAchPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateAchPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateAchPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateAchPayment'", e);
            }

            // deserialize CreateAchPaymentCounterparty
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateAchPaymentCounterparty.class.equals(Integer.class) || CreateAchPaymentCounterparty.class.equals(Long.class) || CreateAchPaymentCounterparty.class.equals(Float.class) || CreateAchPaymentCounterparty.class.equals(Double.class) || CreateAchPaymentCounterparty.class.equals(Boolean.class) || CreateAchPaymentCounterparty.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateAchPaymentCounterparty.class.equals(Integer.class) || CreateAchPaymentCounterparty.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateAchPaymentCounterparty.class.equals(Float.class) || CreateAchPaymentCounterparty.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateAchPaymentCounterparty.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateAchPaymentCounterparty.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateAchPaymentCounterparty.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateAchPaymentCounterparty'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateAchPaymentCounterparty'", e);
            }

            // deserialize CreateAchPaymentPlaid
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateAchPaymentPlaid.class.equals(Integer.class) || CreateAchPaymentPlaid.class.equals(Long.class) || CreateAchPaymentPlaid.class.equals(Float.class) || CreateAchPaymentPlaid.class.equals(Double.class) || CreateAchPaymentPlaid.class.equals(Boolean.class) || CreateAchPaymentPlaid.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateAchPaymentPlaid.class.equals(Integer.class) || CreateAchPaymentPlaid.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateAchPaymentPlaid.class.equals(Float.class) || CreateAchPaymentPlaid.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateAchPaymentPlaid.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateAchPaymentPlaid.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateAchPaymentPlaid.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateAchPaymentPlaid'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateAchPaymentPlaid'", e);
            }

            // deserialize CreateBookPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateBookPayment.class.equals(Integer.class) || CreateBookPayment.class.equals(Long.class) || CreateBookPayment.class.equals(Float.class) || CreateBookPayment.class.equals(Double.class) || CreateBookPayment.class.equals(Boolean.class) || CreateBookPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateBookPayment.class.equals(Integer.class) || CreateBookPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateBookPayment.class.equals(Float.class) || CreateBookPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateBookPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateBookPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateBookPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateBookPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateBookPayment'", e);
            }

            // deserialize CreatePushToCardPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreatePushToCardPayment.class.equals(Integer.class) || CreatePushToCardPayment.class.equals(Long.class) || CreatePushToCardPayment.class.equals(Float.class) || CreatePushToCardPayment.class.equals(Double.class) || CreatePushToCardPayment.class.equals(Boolean.class) || CreatePushToCardPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreatePushToCardPayment.class.equals(Integer.class) || CreatePushToCardPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreatePushToCardPayment.class.equals(Float.class) || CreatePushToCardPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreatePushToCardPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreatePushToCardPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreatePushToCardPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreatePushToCardPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreatePushToCardPayment'", e);
            }

            // deserialize CreateWirePayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateWirePayment.class.equals(Integer.class) || CreateWirePayment.class.equals(Long.class) || CreateWirePayment.class.equals(Float.class) || CreateWirePayment.class.equals(Double.class) || CreateWirePayment.class.equals(Boolean.class) || CreateWirePayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateWirePayment.class.equals(Integer.class) || CreateWirePayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateWirePayment.class.equals(Float.class) || CreateWirePayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateWirePayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateWirePayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateWirePayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateWirePayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateWirePayment'", e);
            }

            if (match == 1) {
                CreatePaymentRequestData ret = new CreatePaymentRequestData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreatePaymentRequestData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreatePaymentRequestData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreatePaymentRequestData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreatePaymentRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreatePaymentRequestData(CreateAchPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatePaymentRequestData(CreateAchPaymentCounterparty o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatePaymentRequestData(CreateAchPaymentPlaid o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatePaymentRequestData(CreateBookPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatePaymentRequestData(CreatePushToCardPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreatePaymentRequestData(CreateWirePayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateAchPayment", CreateAchPayment.class);
        schemas.put("CreateAchPaymentCounterparty", CreateAchPaymentCounterparty.class);
        schemas.put("CreateAchPaymentPlaid", CreateAchPaymentPlaid.class);
        schemas.put("CreateBookPayment", CreateBookPayment.class);
        schemas.put("CreatePushToCardPayment", CreatePushToCardPayment.class);
        schemas.put("CreateWirePayment", CreateWirePayment.class);
        JSON.registerDescendants(CreatePaymentRequestData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreatePaymentRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateAchPayment, CreateAchPaymentCounterparty, CreateAchPaymentPlaid, CreateBookPayment, CreatePushToCardPayment, CreateWirePayment
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateAchPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateAchPaymentCounterparty.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateAchPaymentPlaid.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateBookPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreatePushToCardPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateWirePayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateAchPayment, CreateAchPaymentCounterparty, CreateAchPaymentPlaid, CreateBookPayment, CreatePushToCardPayment, CreateWirePayment");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateAchPayment, CreateAchPaymentCounterparty, CreateAchPaymentPlaid, CreateBookPayment, CreatePushToCardPayment, CreateWirePayment
     *
     * @return The actual instance (CreateAchPayment, CreateAchPaymentCounterparty, CreateAchPaymentPlaid, CreateBookPayment, CreatePushToCardPayment, CreateWirePayment)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateAchPayment`. If the actual instance is not `CreateAchPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateAchPayment`
     * @throws ClassCastException if the instance is not `CreateAchPayment`
     */
    public CreateAchPayment getCreateAchPayment() throws ClassCastException {
        return (CreateAchPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateAchPaymentCounterparty`. If the actual instance is not `CreateAchPaymentCounterparty`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateAchPaymentCounterparty`
     * @throws ClassCastException if the instance is not `CreateAchPaymentCounterparty`
     */
    public CreateAchPaymentCounterparty getCreateAchPaymentCounterparty() throws ClassCastException {
        return (CreateAchPaymentCounterparty)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateAchPaymentPlaid`. If the actual instance is not `CreateAchPaymentPlaid`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateAchPaymentPlaid`
     * @throws ClassCastException if the instance is not `CreateAchPaymentPlaid`
     */
    public CreateAchPaymentPlaid getCreateAchPaymentPlaid() throws ClassCastException {
        return (CreateAchPaymentPlaid)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateBookPayment`. If the actual instance is not `CreateBookPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateBookPayment`
     * @throws ClassCastException if the instance is not `CreateBookPayment`
     */
    public CreateBookPayment getCreateBookPayment() throws ClassCastException {
        return (CreateBookPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreatePushToCardPayment`. If the actual instance is not `CreatePushToCardPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreatePushToCardPayment`
     * @throws ClassCastException if the instance is not `CreatePushToCardPayment`
     */
    public CreatePushToCardPayment getCreatePushToCardPayment() throws ClassCastException {
        return (CreatePushToCardPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateWirePayment`. If the actual instance is not `CreateWirePayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateWirePayment`
     * @throws ClassCastException if the instance is not `CreateWirePayment`
     */
    public CreateWirePayment getCreateWirePayment() throws ClassCastException {
        return (CreateWirePayment)super.getActualInstance();
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

    if (getActualInstance() instanceof CreateAchPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateAchPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateAchPaymentCounterparty) {
        if (getActualInstance() != null) {
          joiner.add(((CreateAchPaymentCounterparty)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateAchPaymentPlaid) {
        if (getActualInstance() != null) {
          joiner.add(((CreateAchPaymentPlaid)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateBookPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateBookPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateWirePayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateWirePayment)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreatePushToCardPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreatePushToCardPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

