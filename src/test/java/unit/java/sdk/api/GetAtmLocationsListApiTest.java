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


package unit.java.sdk.api;

import unit.java.sdk.ApiException;
import unit.java.sdk.model.AtmLocation;
import unit.java.sdk.model.ExecuteFilterParameter15;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetAtmLocationsListApi
 */
@Ignore
public class GetAtmLocationsListApiTest {

    private final GetAtmLocationsListApi api = new GetAtmLocationsListApi();

    
    /**
     * Get List ATM Locations
     *
     * Get List ATM Locations from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        ExecuteFilterParameter15 filter = null;
        List<AtmLocation> response = 
        api.execute(filter);
        
        // TODO: test validations
    }
    
}