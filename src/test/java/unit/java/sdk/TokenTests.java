package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.CreateCustomerTokenApi;
import unit.java.sdk.api.GetListOrgApiTokensApi;
import unit.java.sdk.model.*;


import java.util.List;

import static unit.java.sdk.TestHelpers.getApiClient;

public class TokenTests {
    @Test
    public void GetOrgTokensTest() throws ApiException {
        GetListOrgApiTokensApi listApi = new GetListOrgApiTokensApi(getApiClient());
        List<ApiToken> response = listApi.execute("252").getData();

        for (ApiToken t : response) {
            assert t.getType().equals("apiToken");
        }
    }

    @Test
    public void CreateCustomerToken() throws ApiException {
        CreateCustomerTokenApi createApi = new CreateCustomerTokenApi(getApiClient());

        CreateCustomerToken request = new CreateCustomerToken();

        CreateCustomerTokenData data = new CreateCustomerTokenData();
        CreateCustomerTokenDataAttributes attributes = new CreateCustomerTokenDataAttributes();
        attributes.setScope("customers accounts");
        data.setAttributes(attributes);
        request.setData(data);

        UnitCustomerTokenResponse res = createApi.execute("1527981", request);
        assert res.getData().getType().equals("customerBearerToken");
    }
}
