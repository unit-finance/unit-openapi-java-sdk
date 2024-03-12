package unit.java.sdk;

import static unit.java.sdk.TestHelpers.getApiClient;

import org.junit.Test;
import unit.java.sdk.api.CreateApplicationFormApi;
import unit.java.sdk.api.GetListApplicationFormsApi;
import unit.java.sdk.model.*;

public class ApplicationFormTests {

    @Test
    public void GetApplicationFormListApiTest() throws ApiException {
        GetListApplicationFormsApi api = new GetListApplicationFormsApi(getApiClient());
        UnitApplicationFormsListResponse response = api.execute(null,null,null);
        assert response.getData().size() > 0;
    }

    @Test
    public void CreateApplicationFormTest() throws ApiException {
        CreateApplicationFormApi api = new CreateApplicationFormApi(getApiClient());
        CreateApplicationForm caf = new CreateApplicationForm();
        CreateApplicationFormData data = new CreateApplicationFormData();
        CreateApplicationFormDataAttributes attributes = new CreateApplicationFormDataAttributes();
        ApplicationFormPrefill prefill = new ApplicationFormPrefill();
        prefill.setJwtSubject("test");
        attributes.setApplicantDetails(prefill);
        data.setAttributes(attributes);
        caf.setData(data);
        UnitApplicationFormResponse response = api.execute(caf);
        assert response.getData().getType().equals("applicationForm");
    }
}
