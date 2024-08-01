package unit.java.sdk;

import org.junit.Test;

import unit.java.sdk.api.UnitApi;
import unit.java.sdk.model.Application;
import unit.java.sdk.model.ArchiveCustomerRequest;
import unit.java.sdk.model.ArchiveCustomerRequestData;
import unit.java.sdk.model.ArchiveCustomerRequestDataAttributes;
import unit.java.sdk.model.BusinessApplication;
import unit.java.sdk.model.BusinessCustomer;
import unit.java.sdk.model.Contact;
import unit.java.sdk.model.Customer;
import unit.java.sdk.model.IndividualApplication;
import unit.java.sdk.model.IndividualCustomer;
import unit.java.sdk.model.ResponseContact;
import unit.java.sdk.model.UnitCreateApplicationResponse;
import unit.java.sdk.model.UnitCustomerResponse;
import unit.java.sdk.model.UnitCustomersListResponse;
import unit.java.sdk.model.UpdateBusinessCustomer;
import unit.java.sdk.model.UpdateBusinessCustomerAttributes;
import unit.java.sdk.model.UpdateCustomerRequest;
import unit.java.sdk.model.UpdateCustomerRequestData;
import unit.java.sdk.model.UpdateIndividualCustomer;
import unit.java.sdk.model.UpdateIndividualCustomerAttributes;

import static unit.java.sdk.TestHelpers.GenerateCreateApplicationRequest;
import static unit.java.sdk.TestHelpers.GenerateCreateBusinessApplicationRequest;
import static unit.java.sdk.TestHelpers.GenerateUnitApiClient;


public class CustomerTests {
    UnitApi unitApi = GenerateUnitApiClient();

    public static IndividualCustomer CreateIndividualCustomer(UnitApi unitApi) throws ApiException {
        UnitCreateApplicationResponse res = unitApi.createApplication(GenerateCreateApplicationRequest());
        assert res.getData().getType().equals(Application.TypeEnum.INDIVIDUALAPPLICATION);

        IndividualApplication app = (IndividualApplication) res.getData();
        String customerId = app.getRelationships().getCustomer().getData().getId();

        return (IndividualCustomer) unitApi.getCustomer(customerId).getData();
    }

    public static BusinessCustomer CreateBusinessCustomer(UnitApi unitApi) throws ApiException {
        UnitCreateApplicationResponse res = unitApi.createApplication(GenerateCreateBusinessApplicationRequest());
        assert res.getData().getType().equals(Application.TypeEnum.BUSINESSAPPLICATION);

        BusinessApplication app = (BusinessApplication) res.getData();
        String customerId = app.getRelationships().getCustomer().getData().getId();

        return (BusinessCustomer) unitApi.getCustomer(customerId).getData();
    }

    @Test
    public void GetCustomersListApiTest() throws ApiException {
        UnitCustomersListResponse response = unitApi.getCustomersList(null, null, null);
        assert !response.getData().isEmpty();
    }

    @Test
    public void CreateIndividualCustomerTest() throws ApiException {
        IndividualCustomer customer = CreateIndividualCustomer(unitApi);
        assert customer.getType().equals(IndividualCustomer.TypeEnum.INDIVIDUALCUSTOMER);
    }

    @Test
    public void UpdateIndividualCustomerTest() throws ApiException {
        IndividualCustomer customer = CreateIndividualCustomer(unitApi);
        assert customer.getType().equals(IndividualCustomer.TypeEnum.INDIVIDUALCUSTOMER);

        String email = "test@mail.test";
        UpdateIndividualCustomer updateIndividualCustomer = new UpdateIndividualCustomer();
        UpdateIndividualCustomerAttributes updateIndividualCustomerAttributes = new UpdateIndividualCustomerAttributes();
        updateIndividualCustomerAttributes.email(email);
        updateIndividualCustomer.setAttributes(updateIndividualCustomerAttributes);
        updateIndividualCustomer.setType(UpdateIndividualCustomer.TypeEnum.INDIVIDUALCUSTOMER);
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest();
        UpdateCustomerRequestData updateCustomerRequestData = new UpdateCustomerRequestData(updateIndividualCustomer);
        updateCustomerRequest.setData(updateCustomerRequestData);

        UnitCustomerResponse updateCutomerResponse = unitApi.updateCustomer(customer.getId(), updateCustomerRequest);
        IndividualCustomer individualCustomer =  (IndividualCustomer) updateCutomerResponse.getData();
        assert individualCustomer.getType().equals(IndividualCustomer.TypeEnum.INDIVIDUALCUSTOMER);
        assert individualCustomer.getAttributes().getEmail().equals(email);
    }

    @Test 
    public void UpdateBusinessCustomerTest() throws ApiException {
        BusinessCustomer customer = CreateBusinessCustomer(unitApi);
        assert customer.getType().equals(IndividualCustomer.TypeEnum.BUSINESSCUSTOMER);

        String email = "test@mail.test";
        UpdateBusinessCustomer updateBusinessCustomer = new UpdateBusinessCustomer();
        UpdateBusinessCustomerAttributes updateBusinessCustomerAttributes = new UpdateBusinessCustomerAttributes();
        Contact contact = customer.getAttributes().getContact();
        ResponseContact responseContact = new ResponseContact();
        responseContact.setEmail(email);
        responseContact.setFullName(contact.getFullName());
        responseContact.setPhone(contact.getPhone());
        responseContact.setJwtSubject(contact.getJwtSubject());
        updateBusinessCustomerAttributes.contact(responseContact);
        updateBusinessCustomer.setAttributes(updateBusinessCustomerAttributes);
        updateBusinessCustomer.setType(UpdateBusinessCustomer.TypeEnum.BUSINESSCUSTOMER);
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest();
        UpdateCustomerRequestData updateCustomerRequestData = new UpdateCustomerRequestData(updateBusinessCustomer);
        updateCustomerRequest.setData(updateCustomerRequestData);

        UnitCustomerResponse updateCutomerResponse = unitApi.updateCustomer(customer.getId(), updateCustomerRequest);
        BusinessCustomer individualCustomer =  (BusinessCustomer) updateCutomerResponse.getData();
        assert individualCustomer.getType().equals(BusinessCustomer.TypeEnum.BUSINESSCUSTOMER);
        assert individualCustomer.getAttributes().getContact().getEmail().equals(email);
    }

    @Test 
    public void ArchiveCustomerTest() throws ApiException {
        Customer customer = CreateBusinessCustomer(unitApi);
        assert customer.getType().equals(IndividualCustomer.TypeEnum.BUSINESSCUSTOMER);

        ArchiveCustomerRequest request = new ArchiveCustomerRequest();
        ArchiveCustomerRequestData requestData = new ArchiveCustomerRequestData();
        ArchiveCustomerRequestDataAttributes requestDataAttributes = new ArchiveCustomerRequestDataAttributes();
        requestDataAttributes.setReason(unit.java.sdk.model.ArchiveCustomerRequestDataAttributes.ReasonEnum.INACTIVE);
        requestData.setAttributes(requestDataAttributes);
        requestData.setType(ArchiveCustomerRequestData.TypeEnum.ARCHIVECUSTOMER);
        request.setData(requestData);
        UnitCustomerResponse res = unitApi.archiveCustomer(customer.getId(), request);
        assert res.getData().getType().equals(Customer.TypeEnum.BUSINESSCUSTOMER);
    }
 }
