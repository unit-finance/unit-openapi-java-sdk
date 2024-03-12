package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.CreateACardApi;
import unit.java.sdk.api.CreateAPaymentApi;
import unit.java.sdk.api.CreateAccountApi;
import unit.java.sdk.api.CreateApplicationApi;
import unit.java.sdk.model.*;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.time.LocalDate;

import static unit.java.sdk.AccountTests.CreateDepositAccountRequest;
import static unit.java.sdk.PaymentTests.CreateAchPaymentRequest;
import static unit.java.sdk.TestHelpers.*;
import static unit.java.sdk.TestSimulations.PostRequest;
import static unit.java.sdk.TestSimulations.SimulateAchPayment;

public class CreateBusinessVirtualDebitCardTest {

    public CreateApplication createBusinessApplication() {
        CreateApplication ca = new CreateApplication();
        CreateApplicationData data = new CreateApplicationData(CreateBusinessApplicationRequest());
        ca.setData(data);
        return ca;
    }

    public CreateApplication createIndividualApplication() {
        CreateApplication ca = new CreateApplication();
        CreateApplicationData data = new CreateApplicationData(CreateIndividualApplicationRequest());
        ca.setData(data);
        return ca;
    }

    @Test
    public void CreateAwaitingDocumentsApplicationApiTest() throws ApiException {
        CreateApplicationApi apiClient = new CreateApplicationApi(getApiClient());
        CreateApplication ca = createBusinessApplication();
        UnitCreateApplicationResponse res = apiClient.execute(ca);
        assert res.getData().getType().equals("businessApplication");
        assert ((BusinessApplication)res.getData()).getAttributes().getStatus().equals(ApplicationStatus.APPROVED);
    }

    @Test
    public void CreateBusinessVirtualDebitCardTest() throws ApiException, IOException, InterruptedException {
        CreateApplicationApi apiClient = new CreateApplicationApi(getApiClient());
        CreateApplication ca = createBusinessApplication();
        UnitCreateApplicationResponse res = apiClient.execute(ca);
        assert res.getData().getType().equals("businessApplication");
        assert ((BusinessApplication)res.getData()).getAttributes().getStatus().equals(ApplicationStatus.APPROVED);

        RelationshipData customer = ((BusinessApplication)res.getData()).getRelationships().getCustomer().getData();

        CreateAccountApi createAccountApi = new CreateAccountApi(getApiClient());
        CreateAccount createAccount = new CreateAccount();
        createAccount.setData(new CreateAccountData(CreateDepositAccountRequest(customer.getId())));
        DepositAccount account = (DepositAccount)createAccountApi.execute(createAccount).getData();

        assert account.getType().equals("depositAccount");
        assert account.getRelationships().getCustomer().getData().getId().equals(customer.getId());

        assert SimulateAchPayment(account.getId()).statusCode() == 201;

        CreateBusinessVirtualDebitCard createBusinessVirtualDebitCard = new CreateBusinessVirtualDebitCard();
        CreateBusinessVirtualDebitCardAttributes attr = new CreateBusinessVirtualDebitCardAttributes();

        attr.setFullName(CreateFullName());
        attr.setAddress(CreateAddress());

        attr.setSsn("721074426");
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));
        attr.setEmail("richard@piedpiper.com");
        attr.setPhone(CreatePhone());
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));

        createBusinessVirtualDebitCard.setAttributes(attr);
        CreateCardRelationships relationshipsForCard = new CreateCardRelationships();
        Relationship accountRelationship = CreateRelationship("depositAccount", account.getId());
        relationshipsForCard.setAccount(accountRelationship);
        createBusinessVirtualDebitCard.setRelationships(relationshipsForCard);

        CreateCard createCard = new CreateCard();
        CreateCardData createCardData = new CreateCardData(createBusinessVirtualDebitCard);
        createCard.setData(createCardData);

        CreateACardApi createACardApi = new CreateACardApi(getApiClient());
        UnitCardResponse cardResponse = createACardApi.execute(createCard);
        assert cardResponse.getData().getType().equals(createBusinessVirtualDebitCard.getType().getValue());
//
//        CreateAchPayment createPayment = CreateAchPaymentRequest(account.getId());
//        CreateAchPaymentAttributes achPaymentAttributes = createPayment.getAttributes();
//        achPaymentAttributes.setAddenda("Some very long description of the payment");
//        achPaymentAttributes.setDescription("Testing #5");
//        createPayment.setAttributes(achPaymentAttributes);
//
//        CreateAPaymentApi createApi = new CreateAPaymentApi(getApiClient());
//        CreatePayment request = new CreatePayment();
//        CreatePaymentData data = new CreatePaymentData(createPayment);
//        request.setData(data);
//        UnitPaymentResponse response = createApi.execute(request);
//        assert response.getData().getType().equals("achPayment");
//        assert ((AchPayment)response.getData()).getAttributes().getStatus().equals(AchPaymentAllOfAttributes.StatusEnum.PENDING);
//
//        response = createApi.execute(request);
//        assert response.getData().getType().equals("achPayment");
//        assert ((AchPayment)response.getData()).getAttributes().getStatus().equals(AchPaymentAllOfAttributes.StatusEnum.SENT);

        CreateApplication createIndividualApplication = CreateApplicationRequest();
        res = apiClient.execute(createIndividualApplication);
        IndividualApplication individualApplication = (IndividualApplication) res.getData();
        assert res.getData().getType().equals("individualApplication");
        assert individualApplication.getType().equals("individualApplication");
        assert individualApplication.getAttributes().getStatus().equals(ApplicationStatus.APPROVED);

        customer = individualApplication.getRelationships().getCustomer().getData();
        createAccount = new CreateAccount();
        createAccount.setData(new CreateAccountData(CreateDepositAccountRequest(customer.getId())));
        account = (DepositAccount)createAccountApi.execute(createAccount).getData();
        assert account.getType().equals("depositAccount");
        assert account.getRelationships().getCustomer().getData().getId().equals(customer.getId());

        CreateIndividualDebitCard createIndividualDebitCard = new CreateIndividualDebitCard();
        CreateIndividualDebitCardAttributes createIndividualDebitCardAttributes = new CreateIndividualDebitCardAttributes();
        createIndividualDebitCardAttributes.setShippingAddress(CreateAddress());
        createIndividualDebitCardAttributes.setLimits(CreateCardLevelLimits(1000, 100000, 10000));
        createIndividualDebitCard.setAttributes(createIndividualDebitCardAttributes);
        relationshipsForCard = new CreateCardRelationships();
        accountRelationship = CreateRelationship("depositAccount", account.getId());
        relationshipsForCard.setAccount(accountRelationship);
        createIndividualDebitCard.setRelationships(relationshipsForCard);
        createCard = new CreateCard();
        createCardData = new CreateCardData(createIndividualDebitCard);
        createCard.setData(createCardData);

        Card card = createACardApi.execute(createCard).getData();
        assert card.getType().equals(createIndividualDebitCard.getType().getValue());
        HttpResponse<String> activateCard = PostRequest("cards/" + card.getId() + "/activate", "");
        assert activateCard.statusCode() == 200;
    }

    @Test
    public void SimulateIncomingAchPayment() {

    }
}
