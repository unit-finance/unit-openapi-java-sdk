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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VerifyDocument
 */
@JsonPropertyOrder({
  VerifyDocument.JSON_PROPERTY_JOB_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VerifyDocument {
  public static final String JSON_PROPERTY_JOB_ID = "jobId";
  private String jobId;

  public VerifyDocument() { 
  }

  public VerifyDocument jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobId() {
    return jobId;
  }


  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  /**
   * Return true if this VerifyDocument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyDocument verifyDocument = (VerifyDocument) o;
    return Objects.equals(this.jobId, verifyDocument.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyDocument {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

    // add `jobId` to the URL query string
    if (getJobId() != null) {
      joiner.add(String.format("%sjobId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJobId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

