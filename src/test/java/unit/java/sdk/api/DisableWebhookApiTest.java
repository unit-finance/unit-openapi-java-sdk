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
import unit.java.sdk.model.UnitWebhookResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DisableWebhookApi
 */
@Ignore
public class DisableWebhookApiTest {

    private final DisableWebhookApi api = new DisableWebhookApi();

    
    /**
     * Disable a Webhook
     *
     * Disable a Webhook via API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String webhookId = null;
        UnitWebhookResponse response = 
        api.execute(webhookId);
        
        // TODO: test validations
    }
    
}
