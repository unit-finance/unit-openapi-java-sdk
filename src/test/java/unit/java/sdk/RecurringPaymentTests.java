package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.GetListRecurringPaymentsApi;
import unit.java.sdk.api.GetRecurringPaymentApi;
import unit.java.sdk.model.UnitRecurringPaymentListResponse;
import unit.java.sdk.model.UnitRecurringPaymentResponse;

import static unit.java.sdk.TestHelpers.getApiClient;

public class RecurringPaymentTests {
    @Test
    public void GetRecurringPaymentListApiTest() throws ApiException {
        GetListRecurringPaymentsApi api = new GetListRecurringPaymentsApi(getApiClient());

        UnitRecurringPaymentListResponse response = api.execute(null, null, null);
        assert response.getData().size() != 0;
    }

    @Test
    public void GetRecurringPaymentApiTest() throws ApiException {
        GetListRecurringPaymentsApi api = new GetListRecurringPaymentsApi(getApiClient());

        UnitRecurringPaymentListResponse response = api.execute(null, null, null);
        assert response.getData().size() != 0;

        GetRecurringPaymentApi getApi = new GetRecurringPaymentApi(getApiClient());

        response.getData().forEach(x -> {
            try {
                UnitRecurringPaymentResponse payment = getApi.execute(x.getId());
                assert payment.getData().getId().equals(x.getId());
                assert payment.getData().getType().toLowerCase()
                        .equals(payment.getData().getClass().getSimpleName().toLowerCase());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
