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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ExecuteFilterParameter5
 */
@JsonPropertyOrder({
  ExecuteFilterParameter5.JSON_PROPERTY_CUSTOMER_ID,
  ExecuteFilterParameter5.JSON_PROPERTY_ACCOUNT_NUMBER,
  ExecuteFilterParameter5.JSON_PROPERTY_ROUTING_NUMBER,
  ExecuteFilterParameter5.JSON_PROPERTY_PERMISSIONS,
  ExecuteFilterParameter5.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExecuteFilterParameter5 {
  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ROUTING_NUMBER = "routingNumber";
  private String routingNumber;

  /**
   * Gets or Sets permissions
   */
  public enum PermissionsEnum {
    CREDITONLY("CreditOnly"),
    
    DEBITONLY("DebitOnly"),
    
    CREDITANDDEBIT("CreditAndDebit");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<PermissionsEnum> permissions;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public ExecuteFilterParameter5() { 
  }

  public ExecuteFilterParameter5 customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ExecuteFilterParameter5 accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public ExecuteFilterParameter5 routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoutingNumber() {
    return routingNumber;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public ExecuteFilterParameter5 permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public ExecuteFilterParameter5 addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }


  public ExecuteFilterParameter5 tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public ExecuteFilterParameter5 putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
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


  /**
   * Return true if this execute_filter_parameter_5 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteFilterParameter5 executeFilterParameter5 = (ExecuteFilterParameter5) o;
    return Objects.equals(this.customerId, executeFilterParameter5.customerId) &&
        Objects.equals(this.accountNumber, executeFilterParameter5.accountNumber) &&
        Objects.equals(this.routingNumber, executeFilterParameter5.routingNumber) &&
        Objects.equals(this.permissions, executeFilterParameter5.permissions) &&
        Objects.equals(this.tags, executeFilterParameter5.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, accountNumber, routingNumber, permissions, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFilterParameter5 {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accountNumber` to the URL query string
    if (getAccountNumber() != null) {
      joiner.add(String.format("%saccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routingNumber` to the URL query string
    if (getRoutingNumber() != null) {
      joiner.add(String.format("%sroutingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoutingNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      for (int i = 0; i < getPermissions().size(); i++) {
        joiner.add(String.format("%spermissions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getPermissions().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(String.valueOf(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

