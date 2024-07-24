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
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DownloadADocumentBackSideApi
 */
@Ignore
public class DownloadADocumentBackSideApiTest {

    private final DownloadADocumentBackSideApi api = new DownloadADocumentBackSideApi();

    
    /**
     * Download a Document - Back Side
     *
     * Download a Document - Back Side via API
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeTest() throws ApiException {
        String applicationId = null;
        String documentId = null;
        File response = 
        api.execute(applicationId, documentId);
        
        // TODO: test validations
    }
    
}