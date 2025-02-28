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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.CardLevelLimits;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Phone;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * CreateBusinessCardAttributes
 */
@JsonPropertyOrder({
  CreateBusinessCardAttributes.JSON_PROPERTY_SHIPPING_ADDRESS,
  CreateBusinessCardAttributes.JSON_PROPERTY_ADDRESS,
  CreateBusinessCardAttributes.JSON_PROPERTY_FULL_NAME,
  CreateBusinessCardAttributes.JSON_PROPERTY_PHONE,
  CreateBusinessCardAttributes.JSON_PROPERTY_EMAIL,
  CreateBusinessCardAttributes.JSON_PROPERTY_DATE_OF_BIRTH,
  CreateBusinessCardAttributes.JSON_PROPERTY_NATIONALITY,
  CreateBusinessCardAttributes.JSON_PROPERTY_SSN,
  CreateBusinessCardAttributes.JSON_PROPERTY_PASSPORT,
  CreateBusinessCardAttributes.JSON_PROPERTY_DESIGN,
  CreateBusinessCardAttributes.JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT,
  CreateBusinessCardAttributes.JSON_PROPERTY_TAGS,
  CreateBusinessCardAttributes.JSON_PROPERTY_LIMITS,
  CreateBusinessCardAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateBusinessCardAttributes.JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE,
  CreateBusinessCardAttributes.JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME,
  CreateBusinessCardAttributes.JSON_PROPERTY_EXPIRY_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class CreateBusinessCardAttributes {
  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private Address shippingAddress;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private FullName fullName;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_SSN = "ssn";
  private String ssn;

  public static final String JSON_PROPERTY_PASSPORT = "passport";
  private String passport;

  public static final String JSON_PROPERTY_DESIGN = "design";
  private String design;

  public static final String JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT = "additionalEmbossedText";
  private String additionalEmbossedText;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Map<String, String> tags = new HashMap<>();

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private CardLevelLimits limits;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE = "activeForOnlineUse";
  private Boolean activeForOnlineUse;

  public static final String JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME = "printOnlyBusinessName";
  private Boolean printOnlyBusinessName;

  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public CreateBusinessCardAttributes() { 
  }

  public CreateBusinessCardAttributes shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public CreateBusinessCardAttributes address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public CreateBusinessCardAttributes fullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FullName getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(FullName fullName) {
    this.fullName = fullName;
  }


  public CreateBusinessCardAttributes phone(Phone phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  public CreateBusinessCardAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CreateBusinessCardAttributes dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public CreateBusinessCardAttributes nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNationality() {
    return nationality;
  }


  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public CreateBusinessCardAttributes ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSsn() {
    return ssn;
  }


  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public CreateBusinessCardAttributes passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassport() {
    return passport;
  }


  @JsonProperty(JSON_PROPERTY_PASSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassport(String passport) {
    this.passport = passport;
  }


  public CreateBusinessCardAttributes design(String design) {
    this.design = design;
    return this;
  }

  /**
   * Get design
   * @return design
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDesign() {
    return design;
  }


  @JsonProperty(JSON_PROPERTY_DESIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesign(String design) {
    this.design = design;
  }


  public CreateBusinessCardAttributes additionalEmbossedText(String additionalEmbossedText) {
    this.additionalEmbossedText = additionalEmbossedText;
    return this;
  }

  /**
   * Get additionalEmbossedText
   * @return additionalEmbossedText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAdditionalEmbossedText() {
    return additionalEmbossedText;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_EMBOSSED_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalEmbossedText(String additionalEmbossedText) {
    this.additionalEmbossedText = additionalEmbossedText;
  }


  public CreateBusinessCardAttributes tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateBusinessCardAttributes putTagsItem(String key, String tagsItem) {
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


  public CreateBusinessCardAttributes limits(CardLevelLimits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   * @return limits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CardLevelLimits getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimits(CardLevelLimits limits) {
    this.limits = limits;
  }


  public CreateBusinessCardAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

  /**
   * Get idempotencyKey
   * @return idempotencyKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  @JsonProperty(JSON_PROPERTY_IDEMPOTENCY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  public CreateBusinessCardAttributes activeForOnlineUse(Boolean activeForOnlineUse) {
    this.activeForOnlineUse = activeForOnlineUse;
    return this;
  }

  /**
   * Get activeForOnlineUse
   * @return activeForOnlineUse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getActiveForOnlineUse() {
    return activeForOnlineUse;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FOR_ONLINE_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveForOnlineUse(Boolean activeForOnlineUse) {
    this.activeForOnlineUse = activeForOnlineUse;
  }


  public CreateBusinessCardAttributes printOnlyBusinessName(Boolean printOnlyBusinessName) {
    this.printOnlyBusinessName = printOnlyBusinessName;
    return this;
  }

  /**
   * Get printOnlyBusinessName
   * @return printOnlyBusinessName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPrintOnlyBusinessName() {
    return printOnlyBusinessName;
  }


  @JsonProperty(JSON_PROPERTY_PRINT_ONLY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrintOnlyBusinessName(Boolean printOnlyBusinessName) {
    this.printOnlyBusinessName = printOnlyBusinessName;
  }


  public CreateBusinessCardAttributes expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpiryDate() {
    return expiryDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  /**
   * Return true if this CreateBusinessCardAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBusinessCardAttributes createBusinessCardAttributes = (CreateBusinessCardAttributes) o;
    return Objects.equals(this.shippingAddress, createBusinessCardAttributes.shippingAddress) &&
        Objects.equals(this.address, createBusinessCardAttributes.address) &&
        Objects.equals(this.fullName, createBusinessCardAttributes.fullName) &&
        Objects.equals(this.phone, createBusinessCardAttributes.phone) &&
        Objects.equals(this.email, createBusinessCardAttributes.email) &&
        Objects.equals(this.dateOfBirth, createBusinessCardAttributes.dateOfBirth) &&
        Objects.equals(this.nationality, createBusinessCardAttributes.nationality) &&
        Objects.equals(this.ssn, createBusinessCardAttributes.ssn) &&
        Objects.equals(this.passport, createBusinessCardAttributes.passport) &&
        Objects.equals(this.design, createBusinessCardAttributes.design) &&
        Objects.equals(this.additionalEmbossedText, createBusinessCardAttributes.additionalEmbossedText) &&
        Objects.equals(this.tags, createBusinessCardAttributes.tags) &&
        Objects.equals(this.limits, createBusinessCardAttributes.limits) &&
        Objects.equals(this.idempotencyKey, createBusinessCardAttributes.idempotencyKey) &&
        Objects.equals(this.activeForOnlineUse, createBusinessCardAttributes.activeForOnlineUse) &&
        Objects.equals(this.printOnlyBusinessName, createBusinessCardAttributes.printOnlyBusinessName) &&
        Objects.equals(this.expiryDate, createBusinessCardAttributes.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddress, address, fullName, phone, email, dateOfBirth, nationality, ssn, passport, design, additionalEmbossedText, tags, limits, idempotencyKey, activeForOnlineUse, printOnlyBusinessName, expiryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBusinessCardAttributes {\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    additionalEmbossedText: ").append(toIndentedString(additionalEmbossedText)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    activeForOnlineUse: ").append(toIndentedString(activeForOnlineUse)).append("\n");
    sb.append("    printOnlyBusinessName: ").append(toIndentedString(printOnlyBusinessName)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(getFullName().toUrlQueryString(prefix + "fullName" + suffix));
    }

    // add `phone` to the URL query string
    if (getPhone() != null) {
      joiner.add(getPhone().toUrlQueryString(prefix + "phone" + suffix));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssn` to the URL query string
    if (getSsn() != null) {
      joiner.add(String.format("%sssn%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSsn()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `passport` to the URL query string
    if (getPassport() != null) {
      joiner.add(String.format("%spassport%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPassport()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `design` to the URL query string
    if (getDesign() != null) {
      joiner.add(String.format("%sdesign%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDesign()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `additionalEmbossedText` to the URL query string
    if (getAdditionalEmbossedText() != null) {
      joiner.add(String.format("%sadditionalEmbossedText%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAdditionalEmbossedText()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (String _key : getTags().keySet()) {
        joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getTags().get(_key), URLEncoder.encode(ApiClient.valueToString(getTags().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `limits` to the URL query string
    if (getLimits() != null) {
      joiner.add(getLimits().toUrlQueryString(prefix + "limits" + suffix));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `activeForOnlineUse` to the URL query string
    if (getActiveForOnlineUse() != null) {
      joiner.add(String.format("%sactiveForOnlineUse%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getActiveForOnlineUse()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `printOnlyBusinessName` to the URL query string
    if (getPrintOnlyBusinessName() != null) {
      joiner.add(String.format("%sprintOnlyBusinessName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPrintOnlyBusinessName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expiryDate` to the URL query string
    if (getExpiryDate() != null) {
      joiner.add(String.format("%sexpiryDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpiryDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

