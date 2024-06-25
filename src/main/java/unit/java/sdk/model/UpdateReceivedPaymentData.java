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
import unit.java.sdk.model.PatchAchReceivedPayment;
import unit.java.sdk.model.PatchTrustApplicationAttributes;
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
@JsonDeserialize(using = UpdateReceivedPaymentData.UpdateReceivedPaymentDataDeserializer.class)
@JsonSerialize(using = UpdateReceivedPaymentData.UpdateReceivedPaymentDataSerializer.class)
public class UpdateReceivedPaymentData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateReceivedPaymentData.class.getName());

    public static class UpdateReceivedPaymentDataSerializer extends StdSerializer<UpdateReceivedPaymentData> {
        public UpdateReceivedPaymentDataSerializer(Class<UpdateReceivedPaymentData> t) {
            super(t);
        }

        public UpdateReceivedPaymentDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(UpdateReceivedPaymentData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class UpdateReceivedPaymentDataDeserializer extends StdDeserializer<UpdateReceivedPaymentData> {
        public UpdateReceivedPaymentDataDeserializer() {
            this(UpdateReceivedPaymentData.class);
        }

        public UpdateReceivedPaymentDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public UpdateReceivedPaymentData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize PatchAchReceivedPayment
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (PatchAchReceivedPayment.class.equals(Integer.class) || PatchAchReceivedPayment.class.equals(Long.class) || PatchAchReceivedPayment.class.equals(Float.class) || PatchAchReceivedPayment.class.equals(Double.class) || PatchAchReceivedPayment.class.equals(Boolean.class) || PatchAchReceivedPayment.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((PatchAchReceivedPayment.class.equals(Integer.class) || PatchAchReceivedPayment.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((PatchAchReceivedPayment.class.equals(Float.class) || PatchAchReceivedPayment.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (PatchAchReceivedPayment.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (PatchAchReceivedPayment.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(PatchAchReceivedPayment.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'PatchAchReceivedPayment'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'PatchAchReceivedPayment'", e);
            }

            if (match == 1) {
                UpdateReceivedPaymentData ret = new UpdateReceivedPaymentData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for UpdateReceivedPaymentData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public UpdateReceivedPaymentData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "UpdateReceivedPaymentData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public UpdateReceivedPaymentData() {
        super("oneOf", Boolean.FALSE);
    }

    public UpdateReceivedPaymentData(PatchAchReceivedPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PatchAchReceivedPayment", PatchAchReceivedPayment.class);
        JSON.registerDescendants(UpdateReceivedPaymentData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateReceivedPaymentData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PatchAchReceivedPayment
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(PatchAchReceivedPayment.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PatchAchReceivedPayment");
    }

    /**
     * Get the actual instance, which can be the following:
     * PatchAchReceivedPayment
     *
     * @return The actual instance (PatchAchReceivedPayment)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PatchAchReceivedPayment`. If the actual instance is not `PatchAchReceivedPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PatchAchReceivedPayment`
     * @throws ClassCastException if the instance is not `PatchAchReceivedPayment`
     */
    public PatchAchReceivedPayment getPatchAchReceivedPayment() throws ClassCastException {
        return (PatchAchReceivedPayment)super.getActualInstance();
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

    if (getActualInstance() instanceof PatchAchReceivedPayment) {
        if (getActualInstance() != null) {
          joiner.add(((PatchAchReceivedPayment)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

