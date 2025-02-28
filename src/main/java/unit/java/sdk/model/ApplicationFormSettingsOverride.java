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
import unit.java.sdk.model.ApplicationFormAdditionalDisclosuresInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import unit.java.sdk.ApiClient;
/**
 * ApplicationFormSettingsOverride
 */
@JsonPropertyOrder({
  ApplicationFormSettingsOverride.JSON_PROPERTY_REDIRECT_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_PRIVACY_POLICY_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_ELECTRONIC_DISCLOSURES_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_DEPOSIT_TERMS_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_CLIENT_TERMS_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_CARDHOLDER_TERMS_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_CASH_ADVANCED_TERMS_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_DEBIT_CARD_DISCLOSURE_URL,
  ApplicationFormSettingsOverride.JSON_PROPERTY_ADDITIONAL_DISCLOSURES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class ApplicationFormSettingsOverride {
  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  private String redirectUrl;

  public static final String JSON_PROPERTY_PRIVACY_POLICY_URL = "privacyPolicyUrl";
  private String privacyPolicyUrl;

  public static final String JSON_PROPERTY_ELECTRONIC_DISCLOSURES_URL = "electronicDisclosuresUrl";
  private String electronicDisclosuresUrl;

  public static final String JSON_PROPERTY_DEPOSIT_TERMS_URL = "depositTermsUrl";
  private String depositTermsUrl;

  public static final String JSON_PROPERTY_CLIENT_TERMS_URL = "clientTermsUrl";
  private String clientTermsUrl;

  public static final String JSON_PROPERTY_CARDHOLDER_TERMS_URL = "cardholderTermsUrl";
  private String cardholderTermsUrl;

  public static final String JSON_PROPERTY_CASH_ADVANCED_TERMS_URL = "cashAdvancedTermsUrl";
  private String cashAdvancedTermsUrl;

  public static final String JSON_PROPERTY_DEBIT_CARD_DISCLOSURE_URL = "debitCardDisclosureUrl";
  private String debitCardDisclosureUrl;

  public static final String JSON_PROPERTY_ADDITIONAL_DISCLOSURES = "additionalDisclosures";
  private List<ApplicationFormAdditionalDisclosuresInner> additionalDisclosures = new ArrayList<>();

  public ApplicationFormSettingsOverride() { 
  }

  public ApplicationFormSettingsOverride redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

  /**
   * Get redirectUrl
   * @return redirectUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRedirectUrl() {
    return redirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public ApplicationFormSettingsOverride privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

  /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }


  @JsonProperty(JSON_PROPERTY_PRIVACY_POLICY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public ApplicationFormSettingsOverride electronicDisclosuresUrl(String electronicDisclosuresUrl) {
    this.electronicDisclosuresUrl = electronicDisclosuresUrl;
    return this;
  }

  /**
   * Get electronicDisclosuresUrl
   * @return electronicDisclosuresUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELECTRONIC_DISCLOSURES_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getElectronicDisclosuresUrl() {
    return electronicDisclosuresUrl;
  }


  @JsonProperty(JSON_PROPERTY_ELECTRONIC_DISCLOSURES_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElectronicDisclosuresUrl(String electronicDisclosuresUrl) {
    this.electronicDisclosuresUrl = electronicDisclosuresUrl;
  }


  public ApplicationFormSettingsOverride depositTermsUrl(String depositTermsUrl) {
    this.depositTermsUrl = depositTermsUrl;
    return this;
  }

  /**
   * Get depositTermsUrl
   * @return depositTermsUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPOSIT_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDepositTermsUrl() {
    return depositTermsUrl;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSIT_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepositTermsUrl(String depositTermsUrl) {
    this.depositTermsUrl = depositTermsUrl;
  }


  public ApplicationFormSettingsOverride clientTermsUrl(String clientTermsUrl) {
    this.clientTermsUrl = clientTermsUrl;
    return this;
  }

  /**
   * Get clientTermsUrl
   * @return clientTermsUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientTermsUrl() {
    return clientTermsUrl;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientTermsUrl(String clientTermsUrl) {
    this.clientTermsUrl = clientTermsUrl;
  }


  public ApplicationFormSettingsOverride cardholderTermsUrl(String cardholderTermsUrl) {
    this.cardholderTermsUrl = cardholderTermsUrl;
    return this;
  }

  /**
   * Get cardholderTermsUrl
   * @return cardholderTermsUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARDHOLDER_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardholderTermsUrl() {
    return cardholderTermsUrl;
  }


  @JsonProperty(JSON_PROPERTY_CARDHOLDER_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderTermsUrl(String cardholderTermsUrl) {
    this.cardholderTermsUrl = cardholderTermsUrl;
  }


  public ApplicationFormSettingsOverride cashAdvancedTermsUrl(String cashAdvancedTermsUrl) {
    this.cashAdvancedTermsUrl = cashAdvancedTermsUrl;
    return this;
  }

  /**
   * Get cashAdvancedTermsUrl
   * @return cashAdvancedTermsUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASH_ADVANCED_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCashAdvancedTermsUrl() {
    return cashAdvancedTermsUrl;
  }


  @JsonProperty(JSON_PROPERTY_CASH_ADVANCED_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashAdvancedTermsUrl(String cashAdvancedTermsUrl) {
    this.cashAdvancedTermsUrl = cashAdvancedTermsUrl;
  }


  public ApplicationFormSettingsOverride debitCardDisclosureUrl(String debitCardDisclosureUrl) {
    this.debitCardDisclosureUrl = debitCardDisclosureUrl;
    return this;
  }

  /**
   * Get debitCardDisclosureUrl
   * @return debitCardDisclosureUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEBIT_CARD_DISCLOSURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDebitCardDisclosureUrl() {
    return debitCardDisclosureUrl;
  }


  @JsonProperty(JSON_PROPERTY_DEBIT_CARD_DISCLOSURE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebitCardDisclosureUrl(String debitCardDisclosureUrl) {
    this.debitCardDisclosureUrl = debitCardDisclosureUrl;
  }


  public ApplicationFormSettingsOverride additionalDisclosures(List<ApplicationFormAdditionalDisclosuresInner> additionalDisclosures) {
    this.additionalDisclosures = additionalDisclosures;
    return this;
  }

  public ApplicationFormSettingsOverride addAdditionalDisclosuresItem(ApplicationFormAdditionalDisclosuresInner additionalDisclosuresItem) {
    if (this.additionalDisclosures == null) {
      this.additionalDisclosures = new ArrayList<>();
    }
    this.additionalDisclosures.add(additionalDisclosuresItem);
    return this;
  }

  /**
   * Get additionalDisclosures
   * @return additionalDisclosures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DISCLOSURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApplicationFormAdditionalDisclosuresInner> getAdditionalDisclosures() {
    return additionalDisclosures;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DISCLOSURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalDisclosures(List<ApplicationFormAdditionalDisclosuresInner> additionalDisclosures) {
    this.additionalDisclosures = additionalDisclosures;
  }


  /**
   * Return true if this ApplicationFormSettingsOverride object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationFormSettingsOverride applicationFormSettingsOverride = (ApplicationFormSettingsOverride) o;
    return Objects.equals(this.redirectUrl, applicationFormSettingsOverride.redirectUrl) &&
        Objects.equals(this.privacyPolicyUrl, applicationFormSettingsOverride.privacyPolicyUrl) &&
        Objects.equals(this.electronicDisclosuresUrl, applicationFormSettingsOverride.electronicDisclosuresUrl) &&
        Objects.equals(this.depositTermsUrl, applicationFormSettingsOverride.depositTermsUrl) &&
        Objects.equals(this.clientTermsUrl, applicationFormSettingsOverride.clientTermsUrl) &&
        Objects.equals(this.cardholderTermsUrl, applicationFormSettingsOverride.cardholderTermsUrl) &&
        Objects.equals(this.cashAdvancedTermsUrl, applicationFormSettingsOverride.cashAdvancedTermsUrl) &&
        Objects.equals(this.debitCardDisclosureUrl, applicationFormSettingsOverride.debitCardDisclosureUrl) &&
        Objects.equals(this.additionalDisclosures, applicationFormSettingsOverride.additionalDisclosures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl, privacyPolicyUrl, electronicDisclosuresUrl, depositTermsUrl, clientTermsUrl, cardholderTermsUrl, cashAdvancedTermsUrl, debitCardDisclosureUrl, additionalDisclosures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationFormSettingsOverride {\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    electronicDisclosuresUrl: ").append(toIndentedString(electronicDisclosuresUrl)).append("\n");
    sb.append("    depositTermsUrl: ").append(toIndentedString(depositTermsUrl)).append("\n");
    sb.append("    clientTermsUrl: ").append(toIndentedString(clientTermsUrl)).append("\n");
    sb.append("    cardholderTermsUrl: ").append(toIndentedString(cardholderTermsUrl)).append("\n");
    sb.append("    cashAdvancedTermsUrl: ").append(toIndentedString(cashAdvancedTermsUrl)).append("\n");
    sb.append("    debitCardDisclosureUrl: ").append(toIndentedString(debitCardDisclosureUrl)).append("\n");
    sb.append("    additionalDisclosures: ").append(toIndentedString(additionalDisclosures)).append("\n");
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

    // add `redirectUrl` to the URL query string
    if (getRedirectUrl() != null) {
      joiner.add(String.format("%sredirectUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRedirectUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `privacyPolicyUrl` to the URL query string
    if (getPrivacyPolicyUrl() != null) {
      joiner.add(String.format("%sprivacyPolicyUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPrivacyPolicyUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `electronicDisclosuresUrl` to the URL query string
    if (getElectronicDisclosuresUrl() != null) {
      joiner.add(String.format("%selectronicDisclosuresUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getElectronicDisclosuresUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `depositTermsUrl` to the URL query string
    if (getDepositTermsUrl() != null) {
      joiner.add(String.format("%sdepositTermsUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDepositTermsUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `clientTermsUrl` to the URL query string
    if (getClientTermsUrl() != null) {
      joiner.add(String.format("%sclientTermsUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getClientTermsUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cardholderTermsUrl` to the URL query string
    if (getCardholderTermsUrl() != null) {
      joiner.add(String.format("%scardholderTermsUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCardholderTermsUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cashAdvancedTermsUrl` to the URL query string
    if (getCashAdvancedTermsUrl() != null) {
      joiner.add(String.format("%scashAdvancedTermsUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCashAdvancedTermsUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `debitCardDisclosureUrl` to the URL query string
    if (getDebitCardDisclosureUrl() != null) {
      joiner.add(String.format("%sdebitCardDisclosureUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDebitCardDisclosureUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `additionalDisclosures` to the URL query string
    if (getAdditionalDisclosures() != null) {
      for (int i = 0; i < getAdditionalDisclosures().size(); i++) {
        if (getAdditionalDisclosures().get(i) != null) {
          joiner.add(getAdditionalDisclosures().get(i).toUrlQueryString(String.format("%sadditionalDisclosures%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

