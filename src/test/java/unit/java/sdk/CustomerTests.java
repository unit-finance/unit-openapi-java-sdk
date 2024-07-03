package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.CreateApplicationApi;
import unit.java.sdk.api.GetCustomerApi;
import unit.java.sdk.api.GetListCustomersApi;
import unit.java.sdk.model.BusinessApplication;
import unit.java.sdk.model.BusinessCustomer;
import unit.java.sdk.model.IndividualApplication;
import unit.java.sdk.model.IndividualCustomer;
import unit.java.sdk.model.UnitCreateApplicationResponse;
import unit.java.sdk.model.UnitCustomersListResponse;

import static unit.java.sdk.TestHelpers.CreateApplicationRequest;
import static unit.java.sdk.TestHelpers.CreateBusinessApplicationRequest;
import static unit.java.sdk.TestHelpers.getApiClient;

public class CustomerTests {
    @Test
    public void GetCustomersListApiTest() throws ApiException {
        GetListCustomersApi api = new GetListCustomersApi(getApiClient());

        UnitCustomersListResponse response = api.execute(null, null, null);
        assert response.getData().size() > 0;
    }

    public static BusinessCustomer CreateBusinessCustomer() throws ApiException {
        CreateApplicationApi apiClient = new CreateApplicationApi(getApiClient());

        UnitCreateApplicationResponse res = apiClient.execute(CreateBusinessApplicationRequest());
        assert res.getData().getType().equals("businessApplication");

        BusinessApplication app = (BusinessApplication) res.getData();
        String customerId = app.getRelationships().getCustomer().getData().getId();
        GetCustomerApi customerApi = new GetCustomerApi(getApiClient());

        return (BusinessCustomer) customerApi.execute(customerId).getData();
    }

    public static IndividualCustomer CreateIndividualCustomer() throws ApiException {
        CreateApplicationApi apiClient = new CreateApplicationApi(getApiClient());
        UnitCreateApplicationResponse res = apiClient.execute(CreateApplicationRequest());
        assert res.getData().getType().equals("individualApplication");

        IndividualApplication app = (IndividualApplication) res.getData();
        String customerId = app.getRelationships().getCustomer().getData().getId();
        GetCustomerApi customerApi = new GetCustomerApi(getApiClient());

        return (IndividualCustomer) customerApi.execute(customerId).getData();
    }

    @Test
    public void CreateIndividualCustomerTest() throws ApiException {
        IndividualCustomer customer = CreateIndividualCustomer();
        assert customer.getType().equals("individualCustomer");
    }
}
