/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.4
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
import unit.java.sdk.model.Address;
import unit.java.sdk.model.AuthorizedUser;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateIndividualCustomerAttributes
 */
@JsonPropertyOrder({
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_EMAIL,
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_PHONE,
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_ADDRESS,
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_DBA,
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_TAGS,
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_AUTHORIZED_USERS,
  UpdateIndividualCustomerAttributes.JSON_PROPERTY_JWT_SUBJECT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateIndividualCustomerAttributes {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DBA = "dba";
  private JsonNullable<String> dba = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_AUTHORIZED_USERS = "authorizedUsers";
  private JsonNullable<List<AuthorizedUser>> authorizedUsers = JsonNullable.<List<AuthorizedUser>>undefined();

  public static final String JSON_PROPERTY_JWT_SUBJECT = "jwtSubject";
  private JsonNullable<String> jwtSubject = JsonNullable.<String>undefined();

  public UpdateIndividualCustomerAttributes() { 
  }

  public UpdateIndividualCustomerAttributes email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateIndividualCustomerAttributes phone(Phone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
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


  public UpdateIndividualCustomerAttributes address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
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


  public UpdateIndividualCustomerAttributes dba(String dba) {
    this.dba = JsonNullable.<String>of(dba);
    return this;
  }

   /**
   * Get dba
   * @return dba
  **/
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


  public UpdateIndividualCustomerAttributes tags(Object tags) {
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


  public UpdateIndividualCustomerAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = JsonNullable.<List<AuthorizedUser>>of(authorizedUsers);
    return this;
  }

  public UpdateIndividualCustomerAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
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


  public UpdateIndividualCustomerAttributes jwtSubject(String jwtSubject) {
    this.jwtSubject = JsonNullable.<String>of(jwtSubject);
    return this;
  }

   /**
   * Get jwtSubject
   * @return jwtSubject
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public String getJwtSubject() {
        return jwtSubject.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JWT_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJwtSubject_JsonNullable() {
    return jwtSubject;
  }
  
  @JsonProperty(JSON_PROPERTY_JWT_SUBJECT)
  public void setJwtSubject_JsonNullable(JsonNullable<String> jwtSubject) {
    this.jwtSubject = jwtSubject;
  }

  public void setJwtSubject(String jwtSubject) {
    this.jwtSubject = JsonNullable.<String>of(jwtSubject);
  }


  /**
   * Return true if this updateIndividualCustomer_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIndividualCustomerAttributes updateIndividualCustomerAttributes = (UpdateIndividualCustomerAttributes) o;
    return Objects.equals(this.email, updateIndividualCustomerAttributes.email) &&
        Objects.equals(this.phone, updateIndividualCustomerAttributes.phone) &&
        Objects.equals(this.address, updateIndividualCustomerAttributes.address) &&
        equalsNullable(this.dba, updateIndividualCustomerAttributes.dba) &&
        Objects.equals(this.tags, updateIndividualCustomerAttributes.tags) &&
        equalsNullable(this.authorizedUsers, updateIndividualCustomerAttributes.authorizedUsers) &&
        equalsNullable(this.jwtSubject, updateIndividualCustomerAttributes.jwtSubject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone, address, hashCodeNullable(dba), tags, hashCodeNullable(authorizedUsers), hashCodeNullable(jwtSubject));
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
    sb.append("class UpdateIndividualCustomerAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    authorizedUsers: ").append(toIndentedString(authorizedUsers)).append("\n");
    sb.append("    jwtSubject: ").append(toIndentedString(jwtSubject)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dba` to the URL query string
    if (getDba() != null) {
      joiner.add(String.format("%sdba%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDba()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `jwtSubject` to the URL query string
    if (getJwtSubject() != null) {
      joiner.add(String.format("%sjwtSubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJwtSubject()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

