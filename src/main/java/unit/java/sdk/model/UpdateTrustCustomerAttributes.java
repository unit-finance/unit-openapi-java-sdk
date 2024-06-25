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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.AuthorizedUser;
import unit.java.sdk.model.TrustContact;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateTrustCustomerAttributes
 */
@JsonPropertyOrder({
  UpdateTrustCustomerAttributes.JSON_PROPERTY_CONTACT,
  UpdateTrustCustomerAttributes.JSON_PROPERTY_TAGS,
  UpdateTrustCustomerAttributes.JSON_PROPERTY_AUTHORIZED_USERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateTrustCustomerAttributes {
  public static final String JSON_PROPERTY_CONTACT = "contact";
  private TrustContact contact;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_AUTHORIZED_USERS = "authorizedUsers";
  private JsonNullable<List<AuthorizedUser>> authorizedUsers = JsonNullable.<List<AuthorizedUser>>undefined();

  public UpdateTrustCustomerAttributes() { 
  }

  public UpdateTrustCustomerAttributes contact(TrustContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrustContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(TrustContact contact) {
    this.contact = contact;
  }


  public UpdateTrustCustomerAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Object tags) {
    this.tags = tags;
  }


  public UpdateTrustCustomerAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = JsonNullable.<List<AuthorizedUser>>of(authorizedUsers);
    return this;
  }

  public UpdateTrustCustomerAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
    if (this.authorizedUsers == null || !this.authorizedUsers.isPresent()) {
      this.authorizedUsers = JsonNullable.<List<AuthorizedUser>>of(new ArrayList<>());
    }
    try {
      this.authorizedUsers.get().add(authorizedUsersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get authorizedUsers
   * @return authorizedUsers
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public List<AuthorizedUser> getAuthorizedUsers() {
        return authorizedUsers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTHORIZED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AuthorizedUser>> getAuthorizedUsers_JsonNullable() {
    return authorizedUsers;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_USERS)
  public void setAuthorizedUsers_JsonNullable(JsonNullable<List<AuthorizedUser>> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
  }

  public void setAuthorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = JsonNullable.<List<AuthorizedUser>>of(authorizedUsers);
  }


  /**
   * Return true if this updateTrustCustomer_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrustCustomerAttributes updateTrustCustomerAttributes = (UpdateTrustCustomerAttributes) o;
    return Objects.equals(this.contact, updateTrustCustomerAttributes.contact) &&
        Objects.equals(this.tags, updateTrustCustomerAttributes.tags) &&
        equalsNullable(this.authorizedUsers, updateTrustCustomerAttributes.authorizedUsers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, tags, hashCodeNullable(authorizedUsers));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrustCustomerAttributes {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    authorizedUsers: ").append(toIndentedString(authorizedUsers)).append("\n");
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

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(getContact().toUrlQueryString(prefix + "contact" + suffix));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `authorizedUsers` to the URL query string
    if (getAuthorizedUsers() != null) {
      for (int i = 0; i < getAuthorizedUsers().size(); i++) {
        if (getAuthorizedUsers().get(i) != null) {
          joiner.add(getAuthorizedUsers().get(i).toUrlQueryString(String.format("%sauthorizedUsers%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

