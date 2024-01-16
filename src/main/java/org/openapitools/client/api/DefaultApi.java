/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.2
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


import org.openapitools.client.model.CreateStopPayment;
import org.openapitools.client.model.ExecuteFilterParameter20;
import org.openapitools.client.model.ListPageParametersObject;
import org.openapitools.client.model.StopPaymentListResponse;
import org.openapitools.client.model.StopPaymentResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
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
     * @param page  (optional)
     * @param filter  (optional)
     * @param sort  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeCall(ListPageParametersObject page, ExecuteFilterParameter20 filter, String sort, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stop-payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeValidateBeforeCall(ListPageParametersObject page, ExecuteFilterParameter20 filter, String sort, final ApiCallback _callback) throws ApiException {
        return executeCall(page, filter, sort, _callback);

    }

    /**
     * Get a list of stop payments
     * 
     * @param page  (optional)
     * @param filter  (optional)
     * @param sort  (optional)
     * @return StopPaymentListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StopPaymentListResponse execute(ListPageParametersObject page, ExecuteFilterParameter20 filter, String sort) throws ApiException {
        ApiResponse<StopPaymentListResponse> localVarResp = executeWithHttpInfo(page, filter, sort);
        return localVarResp.getData();
    }

    /**
     * Get a list of stop payments
     * 
     * @param page  (optional)
     * @param filter  (optional)
     * @param sort  (optional)
     * @return ApiResponse&lt;StopPaymentListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StopPaymentListResponse> executeWithHttpInfo(ListPageParametersObject page, ExecuteFilterParameter20 filter, String sort) throws ApiException {
        okhttp3.Call localVarCall = executeValidateBeforeCall(page, filter, sort, null);
        Type localVarReturnType = new TypeToken<StopPaymentListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of stop payments (asynchronously)
     * 
     * @param page  (optional)
     * @param filter  (optional)
     * @param sort  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call executeAsync(ListPageParametersObject page, ExecuteFilterParameter20 filter, String sort, final ApiCallback<StopPaymentListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeValidateBeforeCall(page, filter, sort, _callback);
        Type localVarReturnType = new TypeToken<StopPaymentListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for execute_0
     * @param createStopPayment  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_0Call(CreateStopPayment createStopPayment, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createStopPayment;

        // create path and map variables
        String localVarPath = "/stop-payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execute_0ValidateBeforeCall(CreateStopPayment createStopPayment, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createStopPayment' is set
        if (createStopPayment == null) {
            throw new ApiException("Missing the required parameter 'createStopPayment' when calling execute_0(Async)");
        }

        return execute_0Call(createStopPayment, _callback);

    }

    /**
     * Create Stop Payment
     * 
     * @param createStopPayment  (required)
     * @return StopPaymentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StopPaymentResponse execute_0(CreateStopPayment createStopPayment) throws ApiException {
        ApiResponse<StopPaymentResponse> localVarResp = execute_0WithHttpInfo(createStopPayment);
        return localVarResp.getData();
    }

    /**
     * Create Stop Payment
     * 
     * @param createStopPayment  (required)
     * @return ApiResponse&lt;StopPaymentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StopPaymentResponse> execute_0WithHttpInfo(CreateStopPayment createStopPayment) throws ApiException {
        okhttp3.Call localVarCall = execute_0ValidateBeforeCall(createStopPayment, null);
        Type localVarReturnType = new TypeToken<StopPaymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Stop Payment (asynchronously)
     * 
     * @param createStopPayment  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_0Async(CreateStopPayment createStopPayment, final ApiCallback<StopPaymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = execute_0ValidateBeforeCall(createStopPayment, _callback);
        Type localVarReturnType = new TypeToken<StopPaymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for execute_1
     * @param stopPaymentId ID of the stop payment (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_1Call(String stopPaymentId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stop-payments/{stop_payment_id}"
            .replace("{" + "stop_payment_id" + "}", localVarApiClient.escapeString(stopPaymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execute_1ValidateBeforeCall(String stopPaymentId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'stopPaymentId' is set
        if (stopPaymentId == null) {
            throw new ApiException("Missing the required parameter 'stopPaymentId' when calling execute_1(Async)");
        }

        return execute_1Call(stopPaymentId, _callback);

    }

    /**
     * Get details of a specific stop payment
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @return StopPaymentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public StopPaymentResponse execute_1(String stopPaymentId) throws ApiException {
        ApiResponse<StopPaymentResponse> localVarResp = execute_1WithHttpInfo(stopPaymentId);
        return localVarResp.getData();
    }

    /**
     * Get details of a specific stop payment
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @return ApiResponse&lt;StopPaymentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StopPaymentResponse> execute_1WithHttpInfo(String stopPaymentId) throws ApiException {
        okhttp3.Call localVarCall = execute_1ValidateBeforeCall(stopPaymentId, null);
        Type localVarReturnType = new TypeToken<StopPaymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get details of a specific stop payment (asynchronously)
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_1Async(String stopPaymentId, final ApiCallback<StopPaymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = execute_1ValidateBeforeCall(stopPaymentId, _callback);
        Type localVarReturnType = new TypeToken<StopPaymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for execute_2
     * @param stopPaymentId ID of the stop payment (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Stop payment successfully canceled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_2Call(String stopPaymentId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stop-payments/{stop_payment_id}"
            .replace("{" + "stop_payment_id" + "}", localVarApiClient.escapeString(stopPaymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execute_2ValidateBeforeCall(String stopPaymentId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'stopPaymentId' is set
        if (stopPaymentId == null) {
            throw new ApiException("Missing the required parameter 'stopPaymentId' when calling execute_2(Async)");
        }

        return execute_2Call(stopPaymentId, _callback);

    }

    /**
     * Cancel a stop payment
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Stop payment successfully canceled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public void execute_2(String stopPaymentId) throws ApiException {
        execute_2WithHttpInfo(stopPaymentId);
    }

    /**
     * Cancel a stop payment
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Stop payment successfully canceled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> execute_2WithHttpInfo(String stopPaymentId) throws ApiException {
        okhttp3.Call localVarCall = execute_2ValidateBeforeCall(stopPaymentId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Cancel a stop payment (asynchronously)
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Stop payment successfully canceled </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_2Async(String stopPaymentId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execute_2ValidateBeforeCall(stopPaymentId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for execute_3
     * @param stopPaymentId ID of the stop payment (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_3Call(String stopPaymentId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stop-payments/{stop_payment_id}/disable"
            .replace("{" + "stop_payment_id" + "}", localVarApiClient.escapeString(stopPaymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execute_3ValidateBeforeCall(String stopPaymentId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'stopPaymentId' is set
        if (stopPaymentId == null) {
            throw new ApiException("Missing the required parameter 'stopPaymentId' when calling execute_3(Async)");
        }

        return execute_3Call(stopPaymentId, _callback);

    }

    /**
     * Disable a stop payment
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @return StopPaymentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public StopPaymentResponse execute_3(String stopPaymentId) throws ApiException {
        ApiResponse<StopPaymentResponse> localVarResp = execute_3WithHttpInfo(stopPaymentId);
        return localVarResp.getData();
    }

    /**
     * Disable a stop payment
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @return ApiResponse&lt;StopPaymentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StopPaymentResponse> execute_3WithHttpInfo(String stopPaymentId) throws ApiException {
        okhttp3.Call localVarCall = execute_3ValidateBeforeCall(stopPaymentId, null);
        Type localVarReturnType = new TypeToken<StopPaymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Disable a stop payment (asynchronously)
     * 
     * @param stopPaymentId ID of the stop payment (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Stop payment not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execute_3Async(String stopPaymentId, final ApiCallback<StopPaymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = execute_3ValidateBeforeCall(stopPaymentId, _callback);
        Type localVarReturnType = new TypeToken<StopPaymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
