package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.GetReceivedPaymentApi;
import unit.java.sdk.api.GetReceivedPaymentsListApi;
import unit.java.sdk.model.UnitReceivedPaymentListResponse;
import unit.java.sdk.model.UnitReceivedPaymentResponseWithIncluded;

import static unit.java.sdk.TestHelpers.getApiClient;

public class ReceivedPaymentTests {
    @Test
    public void GetReceivedPaymentListApiTest() throws ApiException {
        GetReceivedPaymentsListApi api = new GetReceivedPaymentsListApi(getApiClient());

        UnitReceivedPaymentListResponse response = api.execute(null);
        assert response.getData().size() != 0;
    }

    @Test
    public void GetReceivedPaymentListWithIncludedApiTest() throws ApiException {
        GetReceivedPaymentsListApi api = new GetReceivedPaymentsListApi(getApiClient());

        UnitReceivedPaymentListResponse response = api.execute(null);
        assert response.getData().size() != 0;
    }

    @Test
    public void GetReceivedPaymentApiTest() throws ApiException {
        GetReceivedPaymentsListApi api = new GetReceivedPaymentsListApi(getApiClient());

        UnitReceivedPaymentListResponse response = api.execute(null);
        assert response.getData().size() != 0;

        GetReceivedPaymentApi getApi = new GetReceivedPaymentApi(getApiClient());

        response.getData().forEach(x -> {
            try {
                UnitReceivedPaymentResponseWithIncluded payment = getApi.execute(x.getId(), null);
                assert payment.getData().getId().equals(x.getId());
                assert payment.getData().getAttributes().getAmount().equals(x.getAttributes().getAmount());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
