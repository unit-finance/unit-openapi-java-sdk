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
import unit.java.sdk.model.UnitEventResponse1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for GetEventApi
 */
@Ignore
public class GetEventApiTest {

    private final GetEventApi api = new GetEventApi();

    
    /**
     * Get Event by Id
     *
     * Get an Event from API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String eventId = null;
        UnitEventResponse1 response = 
        api.execute(eventId);
        
        // TODO: test validations
    }
    
}
