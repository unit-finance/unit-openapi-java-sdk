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
import unit.java.sdk.model.UnitDocumentResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for UploadAPngDocumentForAnApplicationBackSideApi
 */
@Ignore
public class UploadAPngDocumentForAnApplicationBackSideApiTest {

    private final UploadAPngDocumentForAnApplicationBackSideApi api = new UploadAPngDocumentForAnApplicationBackSideApi();

    
    /**
     * Upload a PNG document - Back Side
     *
     * Upload a PNG file via API - Back Side
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String applicationId = null;
        String documentId = null;
        Object body = null;
        UnitDocumentResponse response = 
        api.execute(applicationId, documentId, body);
        
        // TODO: test validations
    }
    
}
