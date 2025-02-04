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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import unit.java.sdk.model.AuthorizedUser;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * AddAuthorizedUsersRequestDataAttributes
 */
@JsonPropertyOrder({
  AddAuthorizedUsersRequestDataAttributes.JSON_PROPERTY_AUTHORIZED_USERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class AddAuthorizedUsersRequestDataAttributes {
  public static final String JSON_PROPERTY_AUTHORIZED_USERS = "authorizedUsers";
  private List<AuthorizedUser> authorizedUsers = new ArrayList<>();

  public AddAuthorizedUsersRequestDataAttributes() { 
  }

  public AddAuthorizedUsersRequestDataAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
    return this;
  }

  public AddAuthorizedUsersRequestDataAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
    if (this.authorizedUsers == null) {
      this.authorizedUsers = new ArrayList<>();
    }
    this.authorizedUsers.add(authorizedUsersItem);
    return this;
  }

  /**
   * Get authorizedUsers
   * @return authorizedUsers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AuthorizedUser> getAuthorizedUsers() {
    return authorizedUsers;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
  }


  /**
   * Return true if this AddAuthorizedUsersRequest_data_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAuthorizedUsersRequestDataAttributes addAuthorizedUsersRequestDataAttributes = (AddAuthorizedUsersRequestDataAttributes) o;
    return Objects.equals(this.authorizedUsers, addAuthorizedUsersRequestDataAttributes.authorizedUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAuthorizedUsersRequestDataAttributes {\n");
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

