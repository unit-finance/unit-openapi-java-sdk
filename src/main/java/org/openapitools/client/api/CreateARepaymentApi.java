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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ExecuteRequest18;
import org.openapitools.client.model.UnitRepaymentResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateARepaymentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreateARepaymentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CreateARepaymentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for execute
     * @param executeRequest18 Create a Repayment Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeCall(ExecuteRequest18 executeRequest18, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = executeRequest18;

        // create path and map variables
        String localVarPath = "/repayments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeValidateBeforeCall(ExecuteRequest18 executeRequest18, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'executeRequest18' is set
        if (executeRequest18 == null) {
            throw new ApiException("Missing the required parameter 'executeRequest18' when calling execute(Async)");
        }

        return executeCall(executeRequest18, _callback);

    }

    /**
     * Create a Repayment
     * Create a Repayment via API 
     * @param executeRequest18 Create a Repayment Request (required)
     * @return UnitRepaymentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public UnitRepaymentResponse execute(ExecuteRequest18 executeRequest18) throws ApiException {
        ApiResponse<UnitRepaymentResponse> localVarResp = executeWithHttpInfo(executeRequest18);
        return localVarResp.getData();
    }

    /**
     * Create a Repayment
     * Create a Repayment via API 
     * @param executeRequest18 Create a Repayment Request (required)
     * @return ApiResponse&lt;UnitRepaymentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UnitRepaymentResponse> executeWithHttpInfo(ExecuteRequest18 executeRequest18) throws ApiException {
        okhttp3.Call localVarCall = executeValidateBeforeCall(executeRequest18, null);
        Type localVarReturnType = new TypeToken<UnitRepaymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a Repayment (asynchronously)
     * Create a Repayment via API 
     * @param executeRequest18 Create a Repayment Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeAsync(ExecuteRequest18 executeRequest18, final ApiCallback<UnitRepaymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeValidateBeforeCall(executeRequest18, _callback);
        Type localVarReturnType = new TypeToken<UnitRepaymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
