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
import unit.java.sdk.model.ApproveCheckPaymentRequest;
import unit.java.sdk.model.UnitCheckPaymentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for ApproveCheckPaymentApi
 */
@Ignore
public class ApproveCheckPaymentApiTest {

    private final ApproveCheckPaymentApi api = new ApproveCheckPaymentApi();

    
    /**
     * Approve Check Payment by Id
     *
     * Approve a Check Payment via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String checkPaymentId = null;
        ApproveCheckPaymentRequest approveCheckPaymentRequest = null;
        UnitCheckPaymentResponse response = 
        api.execute(checkPaymentId, approveCheckPaymentRequest);
        
        // TODO: test validations
    }
    
}
