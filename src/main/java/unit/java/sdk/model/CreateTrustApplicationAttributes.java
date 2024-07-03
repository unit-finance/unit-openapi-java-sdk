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
import java.util.List;
import unit.java.sdk.model.Beneficiary;
import unit.java.sdk.model.DeviceFingerprint;
import unit.java.sdk.model.Grantor;
import unit.java.sdk.model.TrustContact;
import unit.java.sdk.model.Trustee;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateTrustApplicationAttributes
 */
@JsonPropertyOrder({
  CreateTrustApplicationAttributes.JSON_PROPERTY_NAME,
  CreateTrustApplicationAttributes.JSON_PROPERTY_STATE_OF_INCORPORATION,
  CreateTrustApplicationAttributes.JSON_PROPERTY_REVOCABILITY,
  CreateTrustApplicationAttributes.JSON_PROPERTY_SOURCE_OF_FUNDS,
  CreateTrustApplicationAttributes.JSON_PROPERTY_TAX_ID,
  CreateTrustApplicationAttributes.JSON_PROPERTY_GRANTOR,
  CreateTrustApplicationAttributes.JSON_PROPERTY_TRUSTEES,
  CreateTrustApplicationAttributes.JSON_PROPERTY_BENEFICIARIES,
  CreateTrustApplicationAttributes.JSON_PROPERTY_CONTACT,
  CreateTrustApplicationAttributes.JSON_PROPERTY_IP,
  CreateTrustApplicationAttributes.JSON_PROPERTY_TAGS,
  CreateTrustApplicationAttributes.JSON_PROPERTY_IDEMPOTENCY_KEY,
  CreateTrustApplicationAttributes.JSON_PROPERTY_DEVICE_FINGERPRINTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTrustApplicationAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATE_OF_INCORPORATION = "stateOfIncorporation";
  private String stateOfIncorporation;

  /**
   * Gets or Sets revocability
   */
  public enum RevocabilityEnum {
    REVOCABLE("Revocable"),
    
    IRREVOCABLE("Irrevocable");

    private String value;

    RevocabilityEnum(String value) {
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
    public static RevocabilityEnum fromValue(String value) {
      for (RevocabilityEnum b : RevocabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REVOCABILITY = "revocability";
  private RevocabilityEnum revocability;

  /**
   * Gets or Sets sourceOfFunds
   */
  public enum SourceOfFundsEnum {
    INHERITANCE("Inheritance"),
    
    SALARY("Salary"),
    
    SAVINGS("Savings"),
    
    INVESTMENTRETURNS("InvestmentReturns"),
    
    GIFTS("Gifts");

    private String value;

    SourceOfFundsEnum(String value) {
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
    public static SourceOfFundsEnum fromValue(String value) {
      for (SourceOfFundsEnum b : SourceOfFundsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SOURCE_OF_FUNDS = "sourceOfFunds";
  private SourceOfFundsEnum sourceOfFunds;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public static final String JSON_PROPERTY_GRANTOR = "grantor";
  private Grantor grantor;

  public static final String JSON_PROPERTY_TRUSTEES = "trustees";
  private List<Trustee> trustees = new ArrayList<>();

  public static final String JSON_PROPERTY_BENEFICIARIES = "beneficiaries";
  private List<Beneficiary> beneficiaries = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private TrustContact contact;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private Object tags;

  public static final String JSON_PROPERTY_IDEMPOTENCY_KEY = "idempotencyKey";
  private String idempotencyKey;

  public static final String JSON_PROPERTY_DEVICE_FINGERPRINTS = "deviceFingerprints";
  private List<DeviceFingerprint> deviceFingerprints;

  public CreateTrustApplicationAttributes() { 
  }

  public CreateTrustApplicationAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateTrustApplicationAttributes stateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }


  @JsonProperty(JSON_PROPERTY_STATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }


  public CreateTrustApplicationAttributes revocability(RevocabilityEnum revocability) {
    this.revocability = revocability;
    return this;
  }

   /**
   * Get revocability
   * @return revocability
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REVOCABILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RevocabilityEnum getRevocability() {
    return revocability;
  }


  @JsonProperty(JSON_PROPERTY_REVOCABILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRevocability(RevocabilityEnum revocability) {
    this.revocability = revocability;
  }


  public CreateTrustApplicationAttributes sourceOfFunds(SourceOfFundsEnum sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SourceOfFundsEnum getSourceOfFunds() {
    return sourceOfFunds;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_OF_FUNDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceOfFunds(SourceOfFundsEnum sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public CreateTrustApplicationAttributes taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public CreateTrustApplicationAttributes grantor(Grantor grantor) {
    this.grantor = grantor;
    return this;
  }

   /**
   * Get grantor
   * @return grantor
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GRANTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Grantor getGrantor() {
    return grantor;
  }


  @JsonProperty(JSON_PROPERTY_GRANTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrantor(Grantor grantor) {
    this.grantor = grantor;
  }


  public CreateTrustApplicationAttributes trustees(List<Trustee> trustees) {
    this.trustees = trustees;
    return this;
  }

  public CreateTrustApplicationAttributes addTrusteesItem(Trustee trusteesItem) {
    if (this.trustees == null) {
      this.trustees = new ArrayList<>();
    }
    this.trustees.add(trusteesItem);
    return this;
  }

   /**
   * Get trustees
   * @return trustees
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRUSTEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Trustee> getTrustees() {
    return trustees;
  }


  @JsonProperty(JSON_PROPERTY_TRUSTEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrustees(List<Trustee> trustees) {
    this.trustees = trustees;
  }


  public CreateTrustApplicationAttributes beneficiaries(List<Beneficiary> beneficiaries) {
    this.beneficiaries = beneficiaries;
    return this;
  }

  public CreateTrustApplicationAttributes addBeneficiariesItem(Beneficiary beneficiariesItem) {
    if (this.beneficiaries == null) {
      this.beneficiaries = new ArrayList<>();
    }
    this.beneficiaries.add(beneficiariesItem);
    return this;
  }

   /**
   * Get beneficiaries
   * @return beneficiaries
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BENEFICIARIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Beneficiary> getBeneficiaries() {
    return beneficiaries;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeneficiaries(List<Beneficiary> beneficiaries) {
    this.beneficiaries = beneficiaries;
  }


  public CreateTrustApplicationAttributes contact(TrustContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TrustContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContact(TrustContact contact) {
    this.contact = contact;
  }


  public CreateTrustApplicationAttributes ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public CreateTrustApplicationAttributes tags(Object tags) {
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


  public CreateTrustApplicationAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
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


  public CreateTrustApplicationAttributes deviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    this.deviceFingerprints = deviceFingerprints;
    return this;
  }

  public CreateTrustApplicationAttributes addDeviceFingerprintsItem(DeviceFingerprint deviceFingerprintsItem) {
    if (this.deviceFingerprints == null) {
      this.deviceFingerprints = new ArrayList<>();
    }
    this.deviceFingerprints.add(deviceFingerprintsItem);
    return this;
  }

   /**
   * Get deviceFingerprints
   * @return deviceFingerprints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeviceFingerprint> getDeviceFingerprints() {
    return deviceFingerprints;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FINGERPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFingerprints(List<DeviceFingerprint> deviceFingerprints) {
    this.deviceFingerprints = deviceFingerprints;
  }


  /**
   * Return true if this CreateTrustApplication_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTrustApplicationAttributes createTrustApplicationAttributes = (CreateTrustApplicationAttributes) o;
    return Objects.equals(this.name, createTrustApplicationAttributes.name) &&
        Objects.equals(this.stateOfIncorporation, createTrustApplicationAttributes.stateOfIncorporation) &&
        Objects.equals(this.revocability, createTrustApplicationAttributes.revocability) &&
        Objects.equals(this.sourceOfFunds, createTrustApplicationAttributes.sourceOfFunds) &&
        Objects.equals(this.taxId, createTrustApplicationAttributes.taxId) &&
        Objects.equals(this.grantor, createTrustApplicationAttributes.grantor) &&
        Objects.equals(this.trustees, createTrustApplicationAttributes.trustees) &&
        Objects.equals(this.beneficiaries, createTrustApplicationAttributes.beneficiaries) &&
        Objects.equals(this.contact, createTrustApplicationAttributes.contact) &&
        Objects.equals(this.ip, createTrustApplicationAttributes.ip) &&
        Objects.equals(this.tags, createTrustApplicationAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createTrustApplicationAttributes.idempotencyKey) &&
        Objects.equals(this.deviceFingerprints, createTrustApplicationAttributes.deviceFingerprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stateOfIncorporation, revocability, sourceOfFunds, taxId, grantor, trustees, beneficiaries, contact, ip, tags, idempotencyKey, deviceFingerprints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrustApplicationAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    revocability: ").append(toIndentedString(revocability)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    grantor: ").append(toIndentedString(grantor)).append("\n");
    sb.append("    trustees: ").append(toIndentedString(trustees)).append("\n");
    sb.append("    beneficiaries: ").append(toIndentedString(beneficiaries)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    deviceFingerprints: ").append(toIndentedString(deviceFingerprints)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `stateOfIncorporation` to the URL query string
    if (getStateOfIncorporation() != null) {
      joiner.add(String.format("%sstateOfIncorporation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStateOfIncorporation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `revocability` to the URL query string
    if (getRevocability() != null) {
      joiner.add(String.format("%srevocability%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevocability()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sourceOfFunds` to the URL query string
    if (getSourceOfFunds() != null) {
      joiner.add(String.format("%ssourceOfFunds%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceOfFunds()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `taxId` to the URL query string
    if (getTaxId() != null) {
      joiner.add(String.format("%staxId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `grantor` to the URL query string
    if (getGrantor() != null) {
      joiner.add(getGrantor().toUrlQueryString(prefix + "grantor" + suffix));
    }

    // add `trustees` to the URL query string
    if (getTrustees() != null) {
      for (int i = 0; i < getTrustees().size(); i++) {
        if (getTrustees().get(i) != null) {
          joiner.add(getTrustees().get(i).toUrlQueryString(String.format("%strustees%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `beneficiaries` to the URL query string
    if (getBeneficiaries() != null) {
      for (int i = 0; i < getBeneficiaries().size(); i++) {
        if (getBeneficiaries().get(i) != null) {
          joiner.add(getBeneficiaries().get(i).toUrlQueryString(String.format("%sbeneficiaries%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `contact` to the URL query string
    if (getContact() != null) {
      joiner.add(getContact().toUrlQueryString(prefix + "contact" + suffix));
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTags()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `idempotencyKey` to the URL query string
    if (getIdempotencyKey() != null) {
      joiner.add(String.format("%sidempotencyKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdempotencyKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deviceFingerprints` to the URL query string
    if (getDeviceFingerprints() != null) {
      for (int i = 0; i < getDeviceFingerprints().size(); i++) {
        if (getDeviceFingerprints().get(i) != null) {
          joiner.add(getDeviceFingerprints().get(i).toUrlQueryString(String.format("%sdeviceFingerprints%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

