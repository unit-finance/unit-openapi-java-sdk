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
import unit.java.sdk.model.ExecuteFilterParameter11;
import unit.java.sdk.model.ListPageParametersObject;
import unit.java.sdk.model.UnitRewardsListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetListRewardsApi
 */
@Ignore
public class GetListRewardsApiTest {

    private final GetListRewardsApi api = new GetListRewardsApi();

    
    /**
     * Get Rewards List
     *
     * Get Rewards List from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        ListPageParametersObject page = null;
        ExecuteFilterParameter11 filter = null;
        String sort = null;
        String include = null;
        UnitRewardsListResponse response = 
        api.execute(page, filter, sort, include);
        
        // TODO: test validations
    }
    
}
