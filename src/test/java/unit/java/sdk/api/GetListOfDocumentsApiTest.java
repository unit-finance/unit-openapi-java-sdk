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
import unit.java.sdk.model.UnitListDocumentsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetListOfDocumentsApi
 */
@Ignore
public class GetListOfDocumentsApiTest {

    private final GetListOfDocumentsApi api = new GetListOfDocumentsApi();

    
    /**
     * Get List of Documents
     *
     * Get List of Documents via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String applicationId = null;
        UnitListDocumentsResponse response = 
        api.execute(applicationId);
        
        // TODO: test validations
    }
    
}
