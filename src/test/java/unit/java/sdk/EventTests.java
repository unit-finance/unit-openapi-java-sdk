package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.GetEventApi;
import unit.java.sdk.api.GetListEventsApi;
import unit.java.sdk.model.UnitApplicationResponseWithIncluded;
import unit.java.sdk.model.UnitEventListResponse;


import static unit.java.sdk.TestHelpers.getApiClient;

public class EventTests {
    @Test
    public void GetListEvents() throws ApiException {
        GetListEventsApi api = new GetListEventsApi(getApiClient());

        UnitEventListResponse response = api.execute(null, null);
        assert response.getData().size() > 0;

        GetEventApi getEventApi = new GetEventApi(getApiClient());

        response.getData().forEach(x -> {
            try {
                UnitEventResponse1 event = getEventApi.execute(x.getId());
                assert event.getData().getId().equals(x.getId());
                assert app.getData().getType().toLowerCase()
                        .equals(app.getData().getClass().getSimpleName().toLowerCase());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
