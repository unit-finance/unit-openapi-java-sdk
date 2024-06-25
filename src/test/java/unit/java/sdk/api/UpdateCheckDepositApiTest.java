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
import unit.java.sdk.model.UnitCheckDepositResponse;
import unit.java.sdk.model.UpdateCheckDeposit;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for UpdateCheckDepositApi
 */
@Ignore
public class UpdateCheckDepositApiTest {

    private final UpdateCheckDepositApi api = new UpdateCheckDepositApi();

    
    /**
     * Update Check Deposit
     *
     * Update a Check Deposit via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String checkDepositId = null;
        UpdateCheckDeposit updateCheckDeposit = null;
        UnitCheckDepositResponse response = 
        api.execute(checkDepositId, updateCheckDeposit);
        
        // TODO: test validations
    }
    
}
