package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.CreateAPaymentApi;
import unit.java.sdk.api.GetListPaymentsApi;
import unit.java.sdk.api.GetPaymentApi;
import unit.java.sdk.model.*;

import static unit.java.sdk.AccountTests.CreateDepositAccount;
import static unit.java.sdk.TestHelpers.*;

public class PaymentTests {
    @Test
    public void GetPaymentsListApiTest() throws ApiException {
        GetListPaymentsApi api = new GetListPaymentsApi(getApiClient());

        UnitPaymentsListResponse response = api.execute(null, null, null, null);
        assert response.getData().size() > 0;
    }
    @Test
    public void GetPaymentsApiTest() throws ApiException {
        GetListPaymentsApi api = new GetListPaymentsApi(getApiClient());

        UnitPaymentsListResponse response = api.execute(null, null, null, null);
        assert response.getData().size() > 0;

        GetPaymentApi getPaymentApi = new GetPaymentApi(getApiClient());

        for (Payment p: response.getData()) {
            UnitPaymentResponseWithIncluded paymentResponse = getPaymentApi.execute(p.getId(), null);
            assert paymentResponse.getData().getType().contains("Payment");
        }
    }

    @Test
    public void CreateBookPaymentTest() throws ApiException {
        CreateBookPayment createBookPayment = new CreateBookPayment();
        CreateBookPaymentAttributes attributes = new CreateBookPaymentAttributes();
        attributes.setAmount(1000);
        attributes.setDescription("Funding");
        createBookPayment.setAttributes(attributes);

        DepositAccount account1 = (DepositAccount) CreateDepositAccount();
        DepositAccount account2 = (DepositAccount) CreateDepositAccount();

        CreateBookPaymentRelationships relationships = new CreateBookPaymentRelationships();

        AccountRelationship accountRelationship = new AccountRelationship();
        AccountRelationshipData accountRelationshipData = new AccountRelationshipData();
        accountRelationshipData.setId(account1.getId());
        accountRelationshipData.setType(AccountRelationshipData.TypeEnum.DEPOSITACCOUNT);
        accountRelationship.setData(accountRelationshipData);

        CounterpartyAccountRelationship counterpartyAccountRelationship = new CounterpartyAccountRelationship();
        CounterpartyAccountRelationshipData counterpartyAccountRelationshipData = new CounterpartyAccountRelationshipData();
        counterpartyAccountRelationshipData.setId(account2.getId());
        counterpartyAccountRelationshipData.setType(CounterpartyAccountRelationshipData.TypeEnum.DEPOSITACCOUNT);
        counterpartyAccountRelationship.setData(counterpartyAccountRelationshipData);

        relationships.setAccount(accountRelationship);
        relationships.setCounterpartyAccount(counterpartyAccountRelationship);
        createBookPayment.setRelationships(relationships);

        CreateAPaymentApi createApi = new CreateAPaymentApi(getApiClient());
        CreatePayment request = new CreatePayment();
        CreatePaymentData data = new CreatePaymentData(createBookPayment);
        request.setData(data);

        UnitPaymentResponse response = createApi.execute(request);
        assert response.getData().getType().equals("bookPayment");
    }

    public static CreateAchPayment CreateAchPaymentRequest(String accountId) throws ApiException {
        CreateAchPayment createAchPayment = new CreateAchPayment();
        CreateAchPaymentAttributes attributes = new CreateAchPaymentAttributes();
        attributes.setAmount(1000);
        attributes.setCounterparty(CreateCounterparty());
        attributes.setDirection(CreateAchPaymentAttributes.DirectionEnum.CREDIT);
        attributes.setDescription("Funding");
        createAchPayment.setAttributes(attributes);

        CreateAchPaymentRelationships relationships = new CreateAchPaymentRelationships();
        AccountRelationship accountRelationship = new AccountRelationship();
        AccountRelationshipData accountRelationshipData = new AccountRelationshipData();
        accountRelationshipData.setId(accountId);
        accountRelationshipData.setType(AccountRelationshipData.TypeEnum.ACCOUNT);
        accountRelationship.setData(accountRelationshipData);
        relationships.setAccount(accountRelationship);
        createAchPayment.setRelationships(relationships);

        return createAchPayment;
    }
    @Test
    public void CreateAchPaymentTest() throws ApiException {
        CreateAPaymentApi createApi = new CreateAPaymentApi(getApiClient());

        DepositAccount account = (DepositAccount) CreateDepositAccount();

        CreateAchPayment createAchPayment = CreateAchPaymentRequest(account.getId());
        CreatePayment request = new CreatePayment();
        CreatePaymentData data = new CreatePaymentData(createAchPayment);
        request.setData(data);
        UnitPaymentResponse response = createApi.execute(request);
        assert response.getData().getType().equals("achPayment");
    }

    @Test
    public void CreateWirePaymentTest() throws ApiException {
        CreateWirePayment createWirePayment = new CreateWirePayment();
        CreateWirePaymentAttributes attributes = new CreateWirePaymentAttributes();
        createWirePayment.setType("wirePayment");
        attributes.setAmount(100);
        attributes.setDirection(CreateWirePaymentAttributes.DirectionEnum.CREDIT);
        attributes.setCounterparty(CreateWireCounterparty());
        attributes.setDescription("Wire payment");
        createWirePayment.setAttributes(attributes);

        DepositAccount account = (DepositAccount) CreateDepositAccount();

        CreateAchPaymentRelationships relationships = new CreateAchPaymentRelationships();
        AccountRelationship accountRelationship = new AccountRelationship();
        AccountRelationshipData accountRelationshipData = new AccountRelationshipData();
        accountRelationshipData.setId(account.getId());
        accountRelationshipData.setType(AccountRelationshipData.TypeEnum.ACCOUNT);
        accountRelationship.setData(accountRelationshipData);
        relationships.setAccount(accountRelationship);
        createWirePayment.setRelationships(relationships);

        CreateAPaymentApi createApi = new CreateAPaymentApi(getApiClient());
        CreatePayment request = new CreatePayment();
        CreatePaymentData data = new CreatePaymentData(createWirePayment);
        request.setData(data);

        UnitPaymentResponse response = createApi.execute(request);
        assert response.getData().getType().equals("wirePayment");
    }
}
