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
import unit.java.sdk.model.UpdateBusinessCreditCard;
import unit.java.sdk.model.UpdateBusinessDebitCard;
import unit.java.sdk.model.UpdateBusinessVirtualCreditCard;
import unit.java.sdk.model.UpdateBusinessVirtualDebitCard;
import unit.java.sdk.model.UpdateBusinessVirtualDebitCardAttributes;
import unit.java.sdk.model.UpdateIndividualDebitCard;
import unit.java.sdk.model.UpdateIndividualVirtualDebitCard;
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
@JsonDeserialize(using = UpdateCardRequestData.UpdateCardRequestDataDeserializer.class)
@JsonSerialize(using = UpdateCardRequestData.UpdateCardRequestDataSerializer.class)
public class UpdateCardRequestData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateCardRequestData.class.getName());

    public static class UpdateCardRequestDataSerializer extends StdSerializer<UpdateCardRequestData> {
        public UpdateCardRequestDataSerializer(Class<UpdateCardRequestData> t) {
            super(t);
        }

        public UpdateCardRequestDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(UpdateCardRequestData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UpdateCardRequestDataDeserializer extends StdDeserializer<UpdateCardRequestData> {
        public UpdateCardRequestDataDeserializer() {
            this(UpdateCardRequestData.class);
        }

        public UpdateCardRequestDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UpdateCardRequestData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize UpdateBusinessCreditCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateBusinessCreditCard.class.equals(Integer.class) || UpdateBusinessCreditCard.class.equals(Long.class) || UpdateBusinessCreditCard.class.equals(Float.class) || UpdateBusinessCreditCard.class.equals(Double.class) || UpdateBusinessCreditCard.class.equals(Boolean.class) || UpdateBusinessCreditCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateBusinessCreditCard.class.equals(Integer.class) || UpdateBusinessCreditCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateBusinessCreditCard.class.equals(Float.class) || UpdateBusinessCreditCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateBusinessCreditCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateBusinessCreditCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateBusinessCreditCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateBusinessCreditCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateBusinessCreditCard'", e);
            }

            // deserialize UpdateBusinessDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateBusinessDebitCard.class.equals(Integer.class) || UpdateBusinessDebitCard.class.equals(Long.class) || UpdateBusinessDebitCard.class.equals(Float.class) || UpdateBusinessDebitCard.class.equals(Double.class) || UpdateBusinessDebitCard.class.equals(Boolean.class) || UpdateBusinessDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateBusinessDebitCard.class.equals(Integer.class) || UpdateBusinessDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateBusinessDebitCard.class.equals(Float.class) || UpdateBusinessDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateBusinessDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateBusinessDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateBusinessDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateBusinessDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateBusinessDebitCard'", e);
            }

            // deserialize UpdateBusinessVirtualCreditCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateBusinessVirtualCreditCard.class.equals(Integer.class) || UpdateBusinessVirtualCreditCard.class.equals(Long.class) || UpdateBusinessVirtualCreditCard.class.equals(Float.class) || UpdateBusinessVirtualCreditCard.class.equals(Double.class) || UpdateBusinessVirtualCreditCard.class.equals(Boolean.class) || UpdateBusinessVirtualCreditCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateBusinessVirtualCreditCard.class.equals(Integer.class) || UpdateBusinessVirtualCreditCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateBusinessVirtualCreditCard.class.equals(Float.class) || UpdateBusinessVirtualCreditCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateBusinessVirtualCreditCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateBusinessVirtualCreditCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateBusinessVirtualCreditCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateBusinessVirtualCreditCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateBusinessVirtualCreditCard'", e);
            }

            // deserialize UpdateBusinessVirtualDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateBusinessVirtualDebitCard.class.equals(Integer.class) || UpdateBusinessVirtualDebitCard.class.equals(Long.class) || UpdateBusinessVirtualDebitCard.class.equals(Float.class) || UpdateBusinessVirtualDebitCard.class.equals(Double.class) || UpdateBusinessVirtualDebitCard.class.equals(Boolean.class) || UpdateBusinessVirtualDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateBusinessVirtualDebitCard.class.equals(Integer.class) || UpdateBusinessVirtualDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateBusinessVirtualDebitCard.class.equals(Float.class) || UpdateBusinessVirtualDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateBusinessVirtualDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateBusinessVirtualDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateBusinessVirtualDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateBusinessVirtualDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateBusinessVirtualDebitCard'", e);
            }

            // deserialize UpdateIndividualDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateIndividualDebitCard.class.equals(Integer.class) || UpdateIndividualDebitCard.class.equals(Long.class) || UpdateIndividualDebitCard.class.equals(Float.class) || UpdateIndividualDebitCard.class.equals(Double.class) || UpdateIndividualDebitCard.class.equals(Boolean.class) || UpdateIndividualDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateIndividualDebitCard.class.equals(Integer.class) || UpdateIndividualDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateIndividualDebitCard.class.equals(Float.class) || UpdateIndividualDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateIndividualDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateIndividualDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateIndividualDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateIndividualDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateIndividualDebitCard'", e);
            }

            // deserialize UpdateIndividualVirtualDebitCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (UpdateIndividualVirtualDebitCard.class.equals(Integer.class) || UpdateIndividualVirtualDebitCard.class.equals(Long.class) || UpdateIndividualVirtualDebitCard.class.equals(Float.class) || UpdateIndividualVirtualDebitCard.class.equals(Double.class) || UpdateIndividualVirtualDebitCard.class.equals(Boolean.class) || UpdateIndividualVirtualDebitCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((UpdateIndividualVirtualDebitCard.class.equals(Integer.class) || UpdateIndividualVirtualDebitCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((UpdateIndividualVirtualDebitCard.class.equals(Float.class) || UpdateIndividualVirtualDebitCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (UpdateIndividualVirtualDebitCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (UpdateIndividualVirtualDebitCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(UpdateIndividualVirtualDebitCard.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'UpdateIndividualVirtualDebitCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'UpdateIndividualVirtualDebitCard'", e);
            }

            if (match == 1) {
                UpdateCardRequestData ret = new UpdateCardRequestData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UpdateCardRequestData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UpdateCardRequestData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UpdateCardRequestData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public UpdateCardRequestData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateCardRequestData(UpdateBusinessCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardRequestData(UpdateBusinessDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardRequestData(UpdateBusinessVirtualCreditCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardRequestData(UpdateBusinessVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardRequestData(UpdateIndividualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public UpdateCardRequestData(UpdateIndividualVirtualDebitCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("UpdateBusinessCreditCard", UpdateBusinessCreditCard.class);
        schemas.put("UpdateBusinessDebitCard", UpdateBusinessDebitCard.class);
        schemas.put("UpdateBusinessVirtualCreditCard", UpdateBusinessVirtualCreditCard.class);
        schemas.put("UpdateBusinessVirtualDebitCard", UpdateBusinessVirtualDebitCard.class);
        schemas.put("UpdateIndividualDebitCard", UpdateIndividualDebitCard.class);
        schemas.put("UpdateIndividualVirtualDebitCard", UpdateIndividualVirtualDebitCard.class);
        JSON.registerDescendants(UpdateCardRequestData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateCardRequestData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * UpdateBusinessCreditCard, UpdateBusinessDebitCard, UpdateBusinessVirtualCreditCard, UpdateBusinessVirtualDebitCard, UpdateIndividualDebitCard, UpdateIndividualVirtualDebitCard
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(UpdateBusinessCreditCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateBusinessDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateBusinessVirtualCreditCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateBusinessVirtualDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateIndividualDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(UpdateIndividualVirtualDebitCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be UpdateBusinessCreditCard, UpdateBusinessDebitCard, UpdateBusinessVirtualCreditCard, UpdateBusinessVirtualDebitCard, UpdateIndividualDebitCard, UpdateIndividualVirtualDebitCard");
    }

    /**
     * Get the actual instance, which can be the following:
     * UpdateBusinessCreditCard, UpdateBusinessDebitCard, UpdateBusinessVirtualCreditCard, UpdateBusinessVirtualDebitCard, UpdateIndividualDebitCard, UpdateIndividualVirtualDebitCard
     *
     * @return The actual instance (UpdateBusinessCreditCard, UpdateBusinessDebitCard, UpdateBusinessVirtualCreditCard, UpdateBusinessVirtualDebitCard, UpdateIndividualDebitCard, UpdateIndividualVirtualDebitCard)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateBusinessCreditCard`. If the actual instance is not `UpdateBusinessCreditCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateBusinessCreditCard`
     * @throws ClassCastException if the instance is not `UpdateBusinessCreditCard`
     */
    public UpdateBusinessCreditCard getUpdateBusinessCreditCard() throws ClassCastException {
        return (UpdateBusinessCreditCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateBusinessDebitCard`. If the actual instance is not `UpdateBusinessDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateBusinessDebitCard`
     * @throws ClassCastException if the instance is not `UpdateBusinessDebitCard`
     */
    public UpdateBusinessDebitCard getUpdateBusinessDebitCard() throws ClassCastException {
        return (UpdateBusinessDebitCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateBusinessVirtualCreditCard`. If the actual instance is not `UpdateBusinessVirtualCreditCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateBusinessVirtualCreditCard`
     * @throws ClassCastException if the instance is not `UpdateBusinessVirtualCreditCard`
     */
    public UpdateBusinessVirtualCreditCard getUpdateBusinessVirtualCreditCard() throws ClassCastException {
        return (UpdateBusinessVirtualCreditCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateBusinessVirtualDebitCard`. If the actual instance is not `UpdateBusinessVirtualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateBusinessVirtualDebitCard`
     * @throws ClassCastException if the instance is not `UpdateBusinessVirtualDebitCard`
     */
    public UpdateBusinessVirtualDebitCard getUpdateBusinessVirtualDebitCard() throws ClassCastException {
        return (UpdateBusinessVirtualDebitCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateIndividualDebitCard`. If the actual instance is not `UpdateIndividualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateIndividualDebitCard`
     * @throws ClassCastException if the instance is not `UpdateIndividualDebitCard`
     */
    public UpdateIndividualDebitCard getUpdateIndividualDebitCard() throws ClassCastException {
        return (UpdateIndividualDebitCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UpdateIndividualVirtualDebitCard`. If the actual instance is not `UpdateIndividualVirtualDebitCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UpdateIndividualVirtualDebitCard`
     * @throws ClassCastException if the instance is not `UpdateIndividualVirtualDebitCard`
     */
    public UpdateIndividualVirtualDebitCard getUpdateIndividualVirtualDebitCard() throws ClassCastException {
        return (UpdateIndividualVirtualDebitCard)super.getActualInstance();
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

    if (getActualInstance() instanceof UpdateIndividualDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateIndividualDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateIndividualVirtualDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateIndividualVirtualDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateBusinessDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateBusinessDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_2" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateBusinessVirtualDebitCard) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateBusinessVirtualDebitCard)getActualInstance()).toUrlQueryString(prefix + "one_of_3" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateBusinessCreditCard) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateBusinessCreditCard)getActualInstance()).toUrlQueryString(prefix + "one_of_4" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof UpdateBusinessVirtualCreditCard) {
        if (getActualInstance() != null) {
          joiner.add(((UpdateBusinessVirtualCreditCard)getActualInstance()).toUrlQueryString(prefix + "one_of_5" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

