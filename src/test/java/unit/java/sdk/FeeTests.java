package unit.java.sdk;

import static unit.java.sdk.AccountTests.CreateDepositAccount;
import static unit.java.sdk.TestHelpers.getApiClient;

import org.junit.Test;

import unit.java.sdk.api.CreateFeeApi;
import unit.java.sdk.api.ReverseFeeApi;
import unit.java.sdk.model.Account;
import unit.java.sdk.model.CreateFeeRelationships;
import unit.java.sdk.model.CreateFeeRequest;
import unit.java.sdk.model.CreateFeeRequestData;
import unit.java.sdk.model.CreateFeeRequestDataAttributes;
import unit.java.sdk.model.Fee;
import unit.java.sdk.model.Relationship;
import unit.java.sdk.model.RelationshipData;
import unit.java.sdk.model.ReverseFeeRelationships;
import unit.java.sdk.model.ReverseFeeRequest;
import unit.java.sdk.model.ReverseFeeRequestData;
import unit.java.sdk.model.ReverseFeeRequestDataAttributes;

public class FeeTests {
    public static Fee CreateFee() throws ApiException {
        Account depositAccount = CreateDepositAccount(null);
        assert depositAccount.getType().equals("depositAccount");

        CreateFeeRequest createFeeRequest = new CreateFeeRequest();
        CreateFeeRequestData createFeeRequestData = new CreateFeeRequestData();

        CreateFeeRequestDataAttributes createFeeRequestDataAttributes = new CreateFeeRequestDataAttributes();
        createFeeRequestDataAttributes.setAmount(1000);
        createFeeRequestDataAttributes.setDescription("test");
        
        CreateFeeRelationships relationships = new CreateFeeRelationships();
        Relationship accountRelationship = new Relationship();
        RelationshipData accountRelationshipData = new RelationshipData();
        accountRelationshipData.setType("depositAccount");
        accountRelationshipData.setId(depositAccount.getId());
        accountRelationship.setData(accountRelationshipData);
        relationships.setAccount(accountRelationship);
        
        
        createFeeRequestData.setAttributes(createFeeRequestDataAttributes);
        createFeeRequestData.setRelationships(relationships);
        createFeeRequest.setData(createFeeRequestData);

        CreateFeeApi createFeeApi = new CreateFeeApi(getApiClient());
        return createFeeApi.execute(createFeeRequest).getData();   
    }

    @Test 
    public void CreateFeeTest() throws ApiException {
        assert CreateFee().getType().equals("fee");
    }


    @Test 
    public void ReverseFeeTest() throws ApiException {
        Fee fee = CreateFee();
        assert fee.getType().equals("fee");
        

        ReverseFeeApi api = new ReverseFeeApi(getApiClient());
        ReverseFeeRequest request = new ReverseFeeRequest();
        ReverseFeeRequestData data = new ReverseFeeRequestData();
        ReverseFeeRequestDataAttributes attributes = new ReverseFeeRequestDataAttributes();
        attributes.setDescription("test");

        String accountId = fee.getRelationships().getAccount().getData().getId();
        String transactionid = fee.getId();

        ReverseFeeRelationships reverseFeeRelationships = new ReverseFeeRelationships();
        Relationship accountRelationship = new Relationship();
        RelationshipData accountRelationshipData = new RelationshipData();
        accountRelationshipData.setType("depositAccount");
        accountRelationshipData.setId(accountId);
        accountRelationship.setData(accountRelationshipData);

        Relationship transactionRelationship = new Relationship();
        RelationshipData transactionRelationshipData = new RelationshipData();
        transactionRelationshipData.setType("transaction");
        transactionRelationshipData.setId(transactionid);
        transactionRelationship.setData(transactionRelationshipData);

        reverseFeeRelationships.setAccount(accountRelationship);
        reverseFeeRelationships.setTransaction(transactionRelationship);

        data.setAttributes(attributes);
        data.setRelationships(reverseFeeRelationships);


        request.setData(data);
        assert api.execute(request).getData().getType().equals("feeReversal");
    }
}
