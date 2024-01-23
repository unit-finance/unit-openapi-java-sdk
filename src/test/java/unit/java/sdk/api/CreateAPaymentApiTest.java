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
import unit.java.sdk.model.CreatePayment;
import unit.java.sdk.model.UnitPaymentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for CreateAPaymentApi
 */
@Ignore
public class CreateAPaymentApiTest {

    private final CreateAPaymentApi api = new CreateAPaymentApi();

    
    /**
     * Create a Payment
     *
     * Create a Payment via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        CreatePayment createPayment = null;
        UnitPaymentResponse response = 
        api.execute(createPayment);
        
        // TODO: test validations
    }
    
}
