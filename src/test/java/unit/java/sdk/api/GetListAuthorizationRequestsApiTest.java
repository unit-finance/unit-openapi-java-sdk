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

import unit.java.sdk.ApiException;
import unit.java.sdk.model.ExecuteFilterParameter9;
import unit.java.sdk.model.ListPageParametersObject;
import unit.java.sdk.model.UnitListAuthorizationRequestsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetListAuthorizationRequestsApi
 */
@Ignore
public class GetListAuthorizationRequestsApiTest {

    private final GetListAuthorizationRequestsApi api = new GetListAuthorizationRequestsApi();

    
    /**
     * Get List Authorization Requests
     *
     * Get List Authorization Requests from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        ListPageParametersObject page = null;
        ExecuteFilterParameter9 filter = null;
        UnitListAuthorizationRequestsResponse response = 
        api.execute(page, filter);
        
        // TODO: test validations
    }
    
}
