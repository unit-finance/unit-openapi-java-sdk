/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
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
import java.time.OffsetDateTime;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * WebhookAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookAttributes {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  /**
   * Gets or Sets contentType
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    JSON("Json"),
    
    JSONAPI("JsonAPI");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private ContentTypeEnum contentType;

  /**
   * Gets or Sets deliveryMode
   */
  @JsonAdapter(DeliveryModeEnum.Adapter.class)
  public enum DeliveryModeEnum {
    ATMOSTONCE("AtMostOnce"),
    
    ATLEASTONCE("AtLeastOnce");

    private String value;

    DeliveryModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryModeEnum fromValue(String value) {
      for (DeliveryModeEnum b : DeliveryModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "deliveryMode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private DeliveryModeEnum deliveryMode;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TYPE = "subscriptionType";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TYPE)
  private String subscriptionType;

  public WebhookAttributes() {
  }

  public WebhookAttributes createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WebhookAttributes label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public WebhookAttributes url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookAttributes status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public WebhookAttributes contentType(ContentTypeEnum contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  public ContentTypeEnum getContentType() {
    return contentType;
  }


  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  public WebhookAttributes deliveryMode(DeliveryModeEnum deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Get deliveryMode
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public DeliveryModeEnum getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public WebhookAttributes token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public WebhookAttributes subscriptionType(String subscriptionType) {
    
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Get subscriptionType
   * @return subscriptionType
  **/
  @javax.annotation.Nullable
  public String getSubscriptionType() {
    return subscriptionType;
  }


  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookAttributes webhookAttributes = (WebhookAttributes) o;
    return Objects.equals(this.createdAt, webhookAttributes.createdAt) &&
        Objects.equals(this.label, webhookAttributes.label) &&
        Objects.equals(this.url, webhookAttributes.url) &&
        Objects.equals(this.status, webhookAttributes.status) &&
        Objects.equals(this.contentType, webhookAttributes.contentType) &&
        Objects.equals(this.deliveryMode, webhookAttributes.deliveryMode) &&
        Objects.equals(this.token, webhookAttributes.token) &&
        Objects.equals(this.subscriptionType, webhookAttributes.subscriptionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, label, url, status, contentType, deliveryMode, token, subscriptionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("createdAt");
    openapiFields.add("label");
    openapiFields.add("url");
    openapiFields.add("status");
    openapiFields.add("contentType");
    openapiFields.add("deliveryMode");
    openapiFields.add("token");
    openapiFields.add("subscriptionType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebhookAttributes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookAttributes is not found in the empty JSON string", WebhookAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonNull()) && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      if ((jsonObj.get("deliveryMode") != null && !jsonObj.get("deliveryMode").isJsonNull()) && !jsonObj.get("deliveryMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryMode").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("subscriptionType") != null && !jsonObj.get("subscriptionType").isJsonNull()) && !jsonObj.get("subscriptionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookAttributes>() {
           @Override
           public void write(JsonWriter out, WebhookAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookAttributes
  * @throws IOException if the JSON string is invalid with respect to WebhookAttributes
  */
  public static WebhookAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookAttributes.class);
  }

 /**
  * Convert an instance of WebhookAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

