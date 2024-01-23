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


package unit.java.sdk.api;

import unit.java.sdk.ApiException;
import unit.java.sdk.model.ExecuteFilterParameter7;
import unit.java.sdk.model.ListPageParametersObject;
import unit.java.sdk.model.UnitCardResponseCardsList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetListOfCardsApi
 */
@Ignore
public class GetListOfCardsApiTest {

    private final GetListOfCardsApi api = new GetListOfCardsApi();

    
    /**
     * Get List of Cards
     *
     * Get List of Cards from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        ListPageParametersObject page = null;
        ExecuteFilterParameter7 filter = null;
        String include = null;
        String sort = null;
        UnitCardResponseCardsList response = 
        api.execute(page, filter, include, sort);
        
        // TODO: test validations
    }
    
}
