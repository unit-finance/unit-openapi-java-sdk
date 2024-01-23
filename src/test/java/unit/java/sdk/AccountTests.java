package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.CreateAccountApi;
import unit.java.sdk.api.GetAccountApi;
import unit.java.sdk.api.GetListAccountsApi;
import unit.java.sdk.api.UpdateAccountApi;
import unit.java.sdk.model.*;

import static unit.java.sdk.CustomerTests.CreateIndividualCustomer;
import static unit.java.sdk.TestHelpers.getApiClient;

import java.util.HashMap;

public class AccountTests {
    private static ApiClient apiClient = getApiClient();

    @Test
    public void GetAccountListApiTest() throws ApiException {
        GetListAccountsApi api = new GetListAccountsApi(getApiClient());

        UnitAccountsListResponse response = api.execute(null, null, null);
        assert response.getData().size() > 0;
    }

    @Test
    public void GetAccountApiTest() throws ApiException {
        GetListAccountsApi api = new GetListAccountsApi();

        UnitAccountsListResponse response = api.execute(null, null, null);
        assert response.getData().size() > 0;

        GetAccountApi getApi = new GetAccountApi();

        response.getData().forEach(x -> {
            try {
                UnitAccountResponseWithIncluded account = getApi.execute(x.getId(), null);
                assert account.getData().getId().equals(x.getId());
                assert account.getData().getType().toLowerCase()
                        .equals(account.getData().getClass().getSimpleName().toLowerCase());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }
    @Test
    public void UpdateAccountApiTest() throws ApiException {
        GetListAccountsApi api = new GetListAccountsApi();

        UnitAccountsListResponse response = api.execute(null, null, null);
        assert response.getData().size() > 0;

        GetAccountApi getApi = new GetAccountApi(getApiClient());

        UpdateAccountApi updateAccountApi = new UpdateAccountApi(getApiClient());

        response.getData().forEach(x -> {
            try {
                UnitAccountResponseWithIncluded account = getApi.execute(x.getId(), null);
                assert account.getData().getId().equals(x.getId());
                assert account.getData().getType().toLowerCase()
                        .equals(account.getData().getClass().getSimpleName().toLowerCase());

                UpdateDepositAccountAttributes attributes = new UpdateDepositAccountAttributes();
                HashMap<String, String> tags = new HashMap<>();
                tags.put("test", "open-api-sdk");
                attributes.tags(tags);

                UpdateDepositAccount updateDepositAccount = new UpdateDepositAccount();
                updateDepositAccount.attributes(attributes);
                PatchAccount pa = new PatchAccount().data(new PatchAccountData(updateDepositAccount));

                UnitAccountResponse res = updateAccountApi.execute(x.getId(), pa);
                res.getData().getId().equals(x.getId());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static Account CreateDepositAccount() throws ApiException {
        IndividualCustomer customer = CreateIndividualCustomer();

        CreateDepositAccount cda = new CreateDepositAccount();
        CreateDepositAccountAttributes attributes = new CreateDepositAccountAttributes();
        attributes.setDepositProduct("checking");

        CreateDepositAccountRelationships relationships = new CreateDepositAccountRelationships();
        CustomerLinkageData customerRelationshipData = new CustomerLinkageData();
        customerRelationshipData.setId(customer.getId());
        customerRelationshipData.setType(CustomerLinkageData.TypeEnum.CUSTOMER);
        CustomerLinkage customerLinkageRelationship = new CustomerLinkage();
        customerLinkageRelationship.setData(customerRelationshipData);

        relationships.setCustomer(customerLinkageRelationship);

        cda.setAttributes(attributes);
        cda.setRelationships(relationships);

        CreateAccountApi createAccountApi = new CreateAccountApi(getApiClient());
        CreateAccount ca = new CreateAccount();
        ca.setData(new CreateAccountData(cda));
        return createAccountApi.execute(ca).getData();
    }

    @Test
    public void CreateDepositAccountTest() throws ApiException {
        assert CreateDepositAccount().getType().equals("depositAccount");
    }
}
