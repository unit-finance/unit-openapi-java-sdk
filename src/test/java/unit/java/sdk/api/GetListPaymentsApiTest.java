/*
 * Unit OpenAPI specifications
 * An OpenAPI specifications for unit-sdk clients
 *
 * The version of the OpenAPI document: 0.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package unit.java.sdk.api;

import unit.java.sdk.ApiException;
import unit.java.sdk.model.ExecuteFilterParameter4;
import unit.java.sdk.model.ListPageParametersObject;
import unit.java.sdk.model.UnitPaymentsListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetListPaymentsApi
 */
@Ignore
public class GetListPaymentsApiTest {

    private final GetListPaymentsApi api = new GetListPaymentsApi();

    
    /**
     * Get List Payments
     *
     * Get List Payments from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        ListPageParametersObject page = null;
        ExecuteFilterParameter4 filter = null;
        String include = null;
        String sort = null;
        UnitPaymentsListResponse response = 
        api.execute(page, filter, include, sort);
        
        // TODO: test validations
    }
    
}
