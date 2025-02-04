/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.2.1
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import unit.java.sdk.model.CreatePaymentRelationshipsWithCounterpartyAccount;
import unit.java.sdk.model.CreateRecurringCreditAchPayment;
import unit.java.sdk.model.CreateRecurringCreditBookPayment;
import unit.java.sdk.model.CreateRecurringCreditBookPaymentAttributes;
import unit.java.sdk.model.CreateRecurringDebitAchPayment;
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
@JsonDeserialize(using = CreateRecurringPaymentRequestData.CreateRecurringPaymentRequestDataDeserializer.class)
@JsonSerialize(using = CreateRecurringPaymentRequestData.CreateRecurringPaymentRequestDataSerializer.class)
public class CreateRecurringPaymentRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateRecurringPaymentRequestData.class.getName());

    public static class CreateRecurringPaymentRequestDataSerializer extends StdSerializer<CreateRecurringPaymentRequestData> {
        public CreateRecurringPaymentRequestDataSerializer(Class<CreateRecurringPaymentRequestData> t) {
            super(t);
        }

        public CreateRecurringPaymentRequestDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateRecurringPaymentRequestData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateRecurringPaymentRequestDataDeserializer extends StdDeserializer<CreateRecurringPaymentRequestData> {
        public CreateRecurringPaymentRequestDataDeserializer() {
            this(CreateRecurringPaymentRequestData.class);
        }

        public CreateRecurringPaymentRequestDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateRecurringPaymentRequestData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateRecurringCreditAchPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateRecurringCreditAchPayment.class.equals(Integer.class) || CreateRecurringCreditAchPayment.class.equals(Long.class) || CreateRecurringCreditAchPayment.class.equals(Float.class) || CreateRecurringCreditAchPayment.class.equals(Double.class) || CreateRecurringCreditAchPayment.class.equals(Boolean.class) || CreateRecurringCreditAchPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateRecurringCreditAchPayment.class.equals(Integer.class) || CreateRecurringCreditAchPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateRecurringCreditAchPayment.class.equals(Float.class) || CreateRecurringCreditAchPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateRecurringCreditAchPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateRecurringCreditAchPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateRecurringCreditAchPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateRecurringCreditAchPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateRecurringCreditAchPayment'", e);
            }

            // deserialize CreateRecurringCreditBookPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateRecurringCreditBookPayment.class.equals(Integer.class) || CreateRecurringCreditBookPayment.class.equals(Long.class) || CreateRecurringCreditBookPayment.class.equals(Float.class) || CreateRecurringCreditBookPayment.class.equals(Double.class) || CreateRecurringCreditBookPayment.class.equals(Boolean.class) || CreateRecurringCreditBookPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateRecurringCreditBookPayment.class.equals(Integer.class) || CreateRecurringCreditBookPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateRecurringCreditBookPayment.class.equals(Float.class) || CreateRecurringCreditBookPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateRecurringCreditBookPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateRecurringCreditBookPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateRecurringCreditBookPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateRecurringCreditBookPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateRecurringCreditBookPayment'", e);
            }

            // deserialize CreateRecurringDebitAchPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateRecurringDebitAchPayment.class.equals(Integer.class) || CreateRecurringDebitAchPayment.class.equals(Long.class) || CreateRecurringDebitAchPayment.class.equals(Float.class) || CreateRecurringDebitAchPayment.class.equals(Double.class) || CreateRecurringDebitAchPayment.class.equals(Boolean.class) || CreateRecurringDebitAchPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateRecurringDebitAchPayment.class.equals(Integer.class) || CreateRecurringDebitAchPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateRecurringDebitAchPayment.class.equals(Float.class) || CreateRecurringDebitAchPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateRecurringDebitAchPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateRecurringDebitAchPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateRecurringDebitAchPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateRecurringDebitAchPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateRecurringDebitAchPayment'", e);
            }

            if (match == 1) {
                CreateRecurringPaymentRequestData ret = new CreateRecurringPaymentRequestData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateRecurringPaymentRequestData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateRecurringPaymentRequestData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateRecurringPaymentRequestData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateRecurringPaymentRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateRecurringPaymentRequestData(CreateRecurringCreditAchPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateRecurringPaymentRequestData(CreateRecurringCreditBookPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateRecurringPaymentRequestData(CreateRecurringDebitAchPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateRecurringCreditAchPayment", CreateRecurringCreditAchPayment.class);
        schemas.put("CreateRecurringCreditBookPayment", CreateRecurringCreditBookPayment.class);
        schemas.put("CreateRecurringDebitAchPayment", CreateRecurringDebitAchPayment.class);
        JSON.registerDescendants(CreateRecurringPaymentRequestData.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("$recurringCreditAchPayment", CreateRecurringCreditAchPayment.class);
        mappings.put("recurringCreditBookPayment", CreateRecurringCreditBookPayment.class);
        mappings.put("recurringDebitAchPayment", CreateRecurringDebitAchPayment.class);
        mappings.put("CreateRecurringCreditAchPayment", CreateRecurringCreditAchPayment.class);
        mappings.put("CreateRecurringCreditBookPayment", CreateRecurringCreditBookPayment.class);
        mappings.put("CreateRecurringDebitAchPayment", CreateRecurringDebitAchPayment.class);
        mappings.put("CreateRecurringPaymentRequest_data", CreateRecurringPaymentRequestData.class);
        JSON.registerDiscriminator(CreateRecurringPaymentRequestData.class, "type", mappings);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateRecurringPaymentRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateRecurringCreditAchPayment, CreateRecurringCreditBookPayment, CreateRecurringDebitAchPayment
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateRecurringCreditAchPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateRecurringCreditBookPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateRecurringDebitAchPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateRecurringCreditAchPayment, CreateRecurringCreditBookPayment, CreateRecurringDebitAchPayment");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateRecurringCreditAchPayment, CreateRecurringCreditBookPayment, CreateRecurringDebitAchPayment
     *
     * @return The actual instance (CreateRecurringCreditAchPayment, CreateRecurringCreditBookPayment, CreateRecurringDebitAchPayment)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateRecurringCreditAchPayment`. If the actual instance is not `CreateRecurringCreditAchPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateRecurringCreditAchPayment`
     * @throws ClassCastException if the instance is not `CreateRecurringCreditAchPayment`
     */
    public CreateRecurringCreditAchPayment getCreateRecurringCreditAchPayment() throws ClassCastException {
        return (CreateRecurringCreditAchPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateRecurringCreditBookPayment`. If the actual instance is not `CreateRecurringCreditBookPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateRecurringCreditBookPayment`
     * @throws ClassCastException if the instance is not `CreateRecurringCreditBookPayment`
     */
    public CreateRecurringCreditBookPayment getCreateRecurringCreditBookPayment() throws ClassCastException {
        return (CreateRecurringCreditBookPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateRecurringDebitAchPayment`. If the actual instance is not `CreateRecurringDebitAchPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateRecurringDebitAchPayment`
     * @throws ClassCastException if the instance is not `CreateRecurringDebitAchPayment`
     */
    public CreateRecurringDebitAchPayment getCreateRecurringDebitAchPayment() throws ClassCastException {
        return (CreateRecurringDebitAchPayment)super.getActualInstance();
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

    if (getActualInstance() instanceof CreateRecurringCreditAchPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateRecurringCreditAchPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateRecurringDebitAchPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateRecurringDebitAchPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateRecurringCreditBookPayment) {
        if (getActualInstance() != null) {
          joiner.add(((CreateRecurringCreditBookPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

