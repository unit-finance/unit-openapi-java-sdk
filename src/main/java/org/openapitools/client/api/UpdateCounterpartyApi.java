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


import org.openapitools.client.model.UnitCounterpartyResponse;
import org.openapitools.client.model.UpdateCounterparty;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateCounterpartyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UpdateCounterpartyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UpdateCounterpartyApi(ApiClient apiClient) {
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
     * @param counterpartyId ID of the counterparty to update (required)
     * @param updateCounterparty Update Counterparty Request (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeCall(String counterpartyId, UpdateCounterparty updateCounterparty, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateCounterparty;

        // create path and map variables
        String localVarPath = "/counterparties/{counterpartyId}"
            .replace("{" + "counterpartyId" + "}", localVarApiClient.escapeString(counterpartyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeValidateBeforeCall(String counterpartyId, UpdateCounterparty updateCounterparty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'counterpartyId' is set
        if (counterpartyId == null) {
            throw new ApiException("Missing the required parameter 'counterpartyId' when calling execute(Async)");
        }

        // verify the required parameter 'updateCounterparty' is set
        if (updateCounterparty == null) {
            throw new ApiException("Missing the required parameter 'updateCounterparty' when calling execute(Async)");
        }

        return executeCall(counterpartyId, updateCounterparty, _callback);

    }

    /**
     * Update Counterparty
     * Update a Counterparty via API 
     * @param counterpartyId ID of the counterparty to update (required)
     * @param updateCounterparty Update Counterparty Request (required)
     * @return UnitCounterpartyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public UnitCounterpartyResponse execute(String counterpartyId, UpdateCounterparty updateCounterparty) throws ApiException {
        ApiResponse<UnitCounterpartyResponse> localVarResp = executeWithHttpInfo(counterpartyId, updateCounterparty);
        return localVarResp.getData();
    }

    /**
     * Update Counterparty
     * Update a Counterparty via API 
     * @param counterpartyId ID of the counterparty to update (required)
     * @param updateCounterparty Update Counterparty Request (required)
     * @return ApiResponse&lt;UnitCounterpartyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UnitCounterpartyResponse> executeWithHttpInfo(String counterpartyId, UpdateCounterparty updateCounterparty) throws ApiException {
        okhttp3.Call localVarCall = executeValidateBeforeCall(counterpartyId, updateCounterparty, null);
        Type localVarReturnType = new TypeToken<UnitCounterpartyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update Counterparty (asynchronously)
     * Update a Counterparty via API 
     * @param counterpartyId ID of the counterparty to update (required)
     * @param updateCounterparty Update Counterparty Request (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeAsync(String counterpartyId, UpdateCounterparty updateCounterparty, final ApiCallback<UnitCounterpartyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeValidateBeforeCall(counterpartyId, updateCounterparty, _callback);
        Type localVarReturnType = new TypeToken<UnitCounterpartyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
