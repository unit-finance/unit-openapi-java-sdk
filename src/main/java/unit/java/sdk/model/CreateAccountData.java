/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.6
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
import unit.java.sdk.model.CreateCreditAccount;
import unit.java.sdk.model.CreateDepositAccount;
import unit.java.sdk.model.CreateDepositAccountAttributes;
import unit.java.sdk.model.CreateDepositAccountRelationships;
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
@JsonDeserialize(using = CreateAccountData.CreateAccountDataDeserializer.class)
@JsonSerialize(using = CreateAccountData.CreateAccountDataSerializer.class)
public class CreateAccountData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateAccountData.class.getName());

    public static class CreateAccountDataSerializer extends StdSerializer<CreateAccountData> {
        public CreateAccountDataSerializer(Class<CreateAccountData> t) {
            super(t);
        }

        public CreateAccountDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(CreateAccountData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CreateAccountDataDeserializer extends StdDeserializer<CreateAccountData> {
        public CreateAccountDataDeserializer() {
            this(CreateAccountData.class);
        }

        public CreateAccountDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CreateAccountData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CreateCreditAccount
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateCreditAccount.class.equals(Integer.class) || CreateCreditAccount.class.equals(Long.class) || CreateCreditAccount.class.equals(Float.class) || CreateCreditAccount.class.equals(Double.class) || CreateCreditAccount.class.equals(Boolean.class) || CreateCreditAccount.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateCreditAccount.class.equals(Integer.class) || CreateCreditAccount.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateCreditAccount.class.equals(Float.class) || CreateCreditAccount.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateCreditAccount.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateCreditAccount.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateCreditAccount.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateCreditAccount'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateCreditAccount'", e);
            }

            // deserialize CreateDepositAccount
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CreateDepositAccount.class.equals(Integer.class) || CreateDepositAccount.class.equals(Long.class) || CreateDepositAccount.class.equals(Float.class) || CreateDepositAccount.class.equals(Double.class) || CreateDepositAccount.class.equals(Boolean.class) || CreateDepositAccount.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CreateDepositAccount.class.equals(Integer.class) || CreateDepositAccount.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CreateDepositAccount.class.equals(Float.class) || CreateDepositAccount.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CreateDepositAccount.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CreateDepositAccount.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(CreateDepositAccount.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CreateDepositAccount'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CreateDepositAccount'", e);
            }

            if (match == 1) {
                CreateAccountData ret = new CreateAccountData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CreateAccountData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CreateAccountData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CreateAccountData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<>();

    public CreateAccountData() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateAccountData(CreateCreditAccount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateAccountData(CreateDepositAccount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateCreditAccount", CreateCreditAccount.class);
        schemas.put("CreateDepositAccount", CreateDepositAccount.class);
        JSON.registerDescendants(CreateAccountData.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateAccountData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateCreditAccount, CreateDepositAccount
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(CreateCreditAccount.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(CreateDepositAccount.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateCreditAccount, CreateDepositAccount");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateCreditAccount, CreateDepositAccount
     *
     * @return The actual instance (CreateCreditAccount, CreateDepositAccount)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateCreditAccount`. If the actual instance is not `CreateCreditAccount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateCreditAccount`
     * @throws ClassCastException if the instance is not `CreateCreditAccount`
     */
    public CreateCreditAccount getCreateCreditAccount() throws ClassCastException {
        return (CreateCreditAccount)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateDepositAccount`. If the actual instance is not `CreateDepositAccount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateDepositAccount`
     * @throws ClassCastException if the instance is not `CreateDepositAccount`
     */
    public CreateDepositAccount getCreateDepositAccount() throws ClassCastException {
        return (CreateDepositAccount)super.getActualInstance();
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

    if (getActualInstance() instanceof CreateCreditAccount) {
        if (getActualInstance() != null) {
          joiner.add(((CreateCreditAccount)getActualInstance()).toUrlQueryString(prefix + "one_of_0" + suffix));
        }
        return joiner.toString();
    }
    if (getActualInstance() instanceof CreateDepositAccount) {
        if (getActualInstance() != null) {
          joiner.add(((CreateDepositAccount)getActualInstance()).toUrlQueryString(prefix + "one_of_1" + suffix));
        }
        return joiner.toString();
    }
    return null;
  }

}

