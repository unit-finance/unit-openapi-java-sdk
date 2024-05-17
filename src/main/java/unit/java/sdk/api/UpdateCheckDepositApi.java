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

package unit.java.sdk.api;

import unit.java.sdk.ApiClient;
import unit.java.sdk.ApiException;
import unit.java.sdk.ApiResponse;
import unit.java.sdk.Pair;

import unit.java.sdk.model.UnitCheckDepositResponse;
import unit.java.sdk.model.UpdateCheckDeposit;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateCheckDepositApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public UpdateCheckDepositApi() {
    this(new ApiClient());
  }

  public UpdateCheckDepositApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Update Check Deposit
   * Update a Check Deposit via API 
   * @param checkDepositId ID of the check deposit to update (required)
   * @param updateCheckDeposit Update Check Deposit Request (required)
   * @return UnitCheckDepositResponse
   * @throws ApiException if fails to make API call
   */
  public UnitCheckDepositResponse execute(String checkDepositId, UpdateCheckDeposit updateCheckDeposit) throws ApiException {
    ApiResponse<UnitCheckDepositResponse> localVarResponse = executeWithHttpInfo(checkDepositId, updateCheckDeposit);
    return localVarResponse.getData();
  }

  /**
   * Update Check Deposit
   * Update a Check Deposit via API 
   * @param checkDepositId ID of the check deposit to update (required)
   * @param updateCheckDeposit Update Check Deposit Request (required)
   * @return ApiResponse&lt;UnitCheckDepositResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UnitCheckDepositResponse> executeWithHttpInfo(String checkDepositId, UpdateCheckDeposit updateCheckDeposit) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = executeRequestBuilder(checkDepositId, updateCheckDeposit);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("execute", localVarResponse);
        }
        return new ApiResponse<UnitCheckDepositResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<UnitCheckDepositResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder executeRequestBuilder(String checkDepositId, UpdateCheckDeposit updateCheckDeposit) throws ApiException {
    // verify the required parameter 'checkDepositId' is set
    if (checkDepositId == null) {
      throw new ApiException(400, "Missing the required parameter 'checkDepositId' when calling execute");
    }
    // verify the required parameter 'updateCheckDeposit' is set
    if (updateCheckDeposit == null) {
      throw new ApiException(400, "Missing the required parameter 'updateCheckDeposit' when calling execute");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/check-deposits/{checkDepositId}"
        .replace("{checkDepositId}", ApiClient.urlEncode(checkDepositId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/vnd.api+json");
    localVarRequestBuilder.header("Accept", "application/vnd.api+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateCheckDeposit);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
