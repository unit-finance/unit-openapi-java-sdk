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
import unit.java.sdk.model.UnitCheckDepositResponse1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetCheckDepositFrontImageApi
 */
@Ignore
public class GetCheckDepositFrontImageApiTest {

    private final GetCheckDepositFrontImageApi api = new GetCheckDepositFrontImageApi();

    
    /**
     * Get Front Check Deposit Image by Id
     *
     * Get Front Check Deposit Image from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String checkDepositId = null;
        UnitCheckDepositResponse1 response = 
        api.execute(checkDepositId);
        
        // TODO: test validations
    }
    
}
