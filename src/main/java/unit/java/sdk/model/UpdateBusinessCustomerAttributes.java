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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.AuthorizedUser;
import unit.java.sdk.model.Phone;
import unit.java.sdk.model.ResponseContact;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * UpdateBusinessCustomerAttributes
 */
@JsonPropertyOrder({
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_DBA,
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_EIN,
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_PHONE,
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_ADDRESS,
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_CONTACT,
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_TAGS,
  UpdateBusinessCustomerAttributes.JSON_PROPERTY_AUTHORIZED_USERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class UpdateBusinessCustomerAttributes {
  public static final String JSON_PROPERTY_DBA = "dba";
  private JsonNullable<String> dba = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EIN = "ein";
  private String ein;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private ResponseContact contact;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_AUTHORIZED_USERS = "authorizedUsers";
  private JsonNullable<List<AuthorizedUser>> authorizedUsers = JsonNullable.<List<AuthorizedUser>>undefined();

  public UpdateBusinessCustomerAttributes() { 
  }

  public UpdateBusinessCustomerAttributes dba(String dba) {
    this.dba = JsonNullable.<String>of(dba);
    return this;
  }

  /**
   * Get dba
   * @return dba
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDba() {
        return dba.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DBA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDba_JsonNullable() {
    return dba;
  }
  
  @JsonProperty(JSON_PROPERTY_DBA)
  public void setDba_JsonNullable(JsonNullable<String> dba) {
    this.dba = dba;
  }

  public void setDba(String dba) {
    this.dba = JsonNullable.<String>of(dba);
  }


  public UpdateBusinessCustomerAttributes ein(String ein) {
    this.ein = ein;
    return this;
  }

  /**
   * Get ein
   * @return ein
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEin() {
    return ein;
  }


  @JsonProperty(JSON_PROPERTY_EIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEin(String ein) {
    this.ein = ein;
  }


  public UpdateBusinessCustomerAttributes phone(Phone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public UpdateBusinessCustomerAttributes address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public UpdateBusinessCustomerAttributes contact(ResponseContact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResponseContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(ResponseContact contact) {
    this.contact = contact;
  }


  public UpdateBusinessCustomerAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateBusinessCustomerAttributes putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public UpdateBusinessCustomerAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = JsonNullable.<List<AuthorizedUser>>of(authorizedUsers);
    return this;
  }

  public UpdateBusinessCustomerAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
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
   */
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
   * Return true if this UpdateBusinessCustomer_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBusinessCustomerAttributes updateBusinessCustomerAttributes = (UpdateBusinessCustomerAttributes) o;
    return equalsNullable(this.dba, updateBusinessCustomerAttributes.dba) &&
        Objects.equals(this.ein, updateBusinessCustomerAttributes.ein) &&
        Objects.equals(this.phone, updateBusinessCustomerAttributes.phone) &&
        Objects.equals(this.address, updateBusinessCustomerAttributes.address) &&
        Objects.equals(this.contact, updateBusinessCustomerAttributes.contact) &&
        Objects.equals(this.tags, updateBusinessCustomerAttributes.tags) &&
        equalsNullable(this.authorizedUsers, updateBusinessCustomerAttributes.authorizedUsers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dba), ein, phone, address, contact, tags, hashCodeNullable(authorizedUsers));
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
    sb.append("class UpdateBusinessCustomerAttributes {\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

    // add `dba` to the URL query string
    if (getDba() != null) {
      joiner.add(String.format("%sdba%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDba()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ein` to the URL query string
    if (getEin() != null) {
      joiner.add(String.format("%sein%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(getContact().toUrlQueryString(prefix + "contact" + suffix));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
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

