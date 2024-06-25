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
import unit.java.sdk.model.CreateApiToken;
import unit.java.sdk.model.UnitApiTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CreateOrgApiTokenApi
 */
@Ignore
public class CreateOrgApiTokenApiTest {

    private final CreateOrgApiTokenApi api = new CreateOrgApiTokenApi();

    
    /**
     * Create Org API Token
     *
     * Create an Org API Token via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String userId = null;
        CreateApiToken createApiToken = null;
        UnitApiTokenResponse response = 
        api.execute(userId, createApiToken);
        
        // TODO: test validations
    }
    
}
