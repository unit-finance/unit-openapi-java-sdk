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
import unit.java.sdk.model.CreateAchStopPayment;
import unit.java.sdk.model.CreateAchStopPaymentAttributes;
import unit.java.sdk.model.CreateAchStopPaymentRelationships;
import unit.java.sdk.model.CreateCheckStopPayment;
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
@JsonDeserialize(using = CreateStopPaymentRequestData.CreateStopPaymentRequestDataDeserializer.class)
@JsonSerialize(using = CreateStopPaymentRequestData.CreateStopPaymentRequestDataSerializer.class)
public class CreateStopPaymentRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateStopPaymentRequestData.class.getName());

    public static class CreateStopPaymentRequestDataSerializer extends StdSerializer<CreateStopPaymentRequestData> {
        public CreateStopPaymentRequestDataSerializer(Class<CreateStopPaymentRequestData> t) {
            super(t);
        }

        public CreateStopPaymentRequestDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateStopPaymentRequestData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateStopPaymentRequestDataDeserializer extends StdDeserializer<CreateStopPaymentRequestData> {
        public CreateStopPaymentRequestDataDeserializer() {
            this(CreateStopPaymentRequestData.class);
        }

        public CreateStopPaymentRequestDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateStopPaymentRequestData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateAchStopPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateAchStopPayment.class.equals(Integer.class) || CreateAchStopPayment.class.equals(Long.class) || CreateAchStopPayment.class.equals(Float.class) || CreateAchStopPayment.class.equals(Double.class) || CreateAchStopPayment.class.equals(Boolean.class) || CreateAchStopPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateAchStopPayment.class.equals(Integer.class) || CreateAchStopPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateAchStopPayment.class.equals(Float.class) || CreateAchStopPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateAchStopPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateAchStopPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateAchStopPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateAchStopPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateAchStopPayment'", e);
            }

            // deserialize CreateCheckStopPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateCheckStopPayment.class.equals(Integer.class) || CreateCheckStopPayment.class.equals(Long.class) || CreateCheckStopPayment.class.equals(Float.class) || CreateCheckStopPayment.class.equals(Double.class) || CreateCheckStopPayment.class.equals(Boolean.class) || CreateCheckStopPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateCheckStopPayment.class.equals(Integer.class) || CreateCheckStopPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateCheckStopPayment.class.equals(Float.class) || CreateCheckStopPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateCheckStopPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateCheckStopPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateCheckStopPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateCheckStopPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateCheckStopPayment'", e);
            }

            if (match == 1) {
                CreateStopPaymentRequestData ret = new CreateStopPaymentRequestData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateStopPaymentRequestData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateStopPaymentRequestData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateStopPaymentRequestData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateStopPaymentRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateStopPaymentRequestData(CreateAchStopPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateStopPaymentRequestData(CreateCheckStopPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateAchStopPayment", CreateAchStopPayment.class);
        schemas.put("CreateCheckStopPayment", CreateCheckStopPayment.class);
        JSON.registerDescendants(CreateStopPaymentRequestData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateStopPaymentRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateAchStopPayment, CreateCheckStopPayment
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateAchStopPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateCheckStopPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateAchStopPayment, CreateCheckStopPayment");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateAchStopPayment, CreateCheckStopPayment
     *
     * @return The actual instance (CreateAchStopPayment, CreateCheckStopPayment)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateAchStopPayment`. If the actual instance is not `CreateAchStopPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateAchStopPayment`
     * @throws ClassCastException if the instance is not `CreateAchStopPayment`
     */
    public CreateAchStopPayment getCreateAchStopPayment() throws ClassCastException {
        return (CreateAchStopPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateCheckStopPayment`. If the actual instance is not `CreateCheckStopPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateCheckStopPayment`
     * @throws ClassCastException if the instance is not `CreateCheckStopPayment`
     */
    public CreateCheckStopPayment getCreateCheckStopPayment() throws ClassCastException {
        return (CreateCheckStopPayment)super.getActualInstance();
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

    if (getActualInstance() instanceof CreateCheckStopPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateCheckStopPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateAchStopPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateAchStopPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

