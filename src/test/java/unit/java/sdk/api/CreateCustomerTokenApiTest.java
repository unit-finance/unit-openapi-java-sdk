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
import unit.java.sdk.model.CreateCustomerToken;
import unit.java.sdk.model.UnitCustomerTokenResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CreateCustomerTokenApi
 */
@Ignore
public class CreateCustomerTokenApiTest {

    private final CreateCustomerTokenApi api = new CreateCustomerTokenApi();

    
    /**
     * Create Customer Token
     *
     * Create a Customer Token via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String customerId = null;
        CreateCustomerToken createCustomerToken = null;
        UnitCustomerTokenResponse response = 
        api.execute(customerId, createCustomerToken);
        
        // TODO: test validations
    }
    
}
