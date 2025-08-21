package unit.java.sdk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import unit.java.sdk.api.UnitApi;
import unit.java.sdk.model.Address;
import unit.java.sdk.model.AnnualIncome;
import unit.java.sdk.model.BusinessAnnualRevenue;
import unit.java.sdk.model.BusinessNumberOfEmployees;
import unit.java.sdk.model.BusinessVertical;
import unit.java.sdk.model.CashFlow;
import unit.java.sdk.model.Contact;
import unit.java.sdk.model.CreateApplicationRequest;
import unit.java.sdk.model.CreateApplicationRequestData;
import unit.java.sdk.model.CreateBeneficialOwner;
import unit.java.sdk.model.CreateBusinessApplication;
import unit.java.sdk.model.CreateBusinessApplicationAttributes;
import unit.java.sdk.model.CreateIndividualApplication;
import unit.java.sdk.model.CreateIndividualApplicationAttributes;
import unit.java.sdk.model.CreateOfficer;
import unit.java.sdk.model.CreateSoleProprietorApplication;
import unit.java.sdk.model.CreateSoleProprietorApplicationAttributes;
import unit.java.sdk.model.EntityType;
import unit.java.sdk.model.FullName;
import unit.java.sdk.model.Occupation;
import unit.java.sdk.model.PaymentCounterparty;
import unit.java.sdk.model.Phone;
import unit.java.sdk.model.SoleProprietorshipAnnualRevenue;
import unit.java.sdk.model.SoleProprietorshipNumberOfEmployees;
import unit.java.sdk.model.SourceOfIncome;
import unit.java.sdk.model.WirePaymentCounterparty;

public class TestHelpers {
    private static UnitApi unitApi;
    static UnitApi GenerateUnitApiClient() {
        if(unitApi == null){
            String access_token = "v2.public.eyJyb2xlIjoiYWRtaW4iLCJyb2xlcyI6WyJhZG1pbiJdLCJ1c2VySWQiOiIxMjA4NCIsInN1YiI6InllaG9yLnpodWtvdnNreWkrc2RrQHVuaXQuY28iLCJleHAiOiIyMDI2LTA4LTIxVDE0OjM3OjIxLjEzN1oiLCJqdGkiOiI1MDk4NjUiLCJvcmdJZCI6IjEyNiIsInNjb3BlIjoiYXBwbGljYXRpb25zIGFwcGxpY2F0aW9ucy13cml0ZSBjdXN0b21lcnMgY3VzdG9tZXJzLXdyaXRlIGN1c3RvbWVyLXRhZ3Mtd3JpdGUgY3VzdG9tZXItdG9rZW4td3JpdGUgYWNjb3VudHMgYWNjb3VudHMtd3JpdGUgYWNjb3VudC1ob2xkcyBhY2NvdW50LWhvbGRzLXdyaXRlIGNhcmRzIGNhcmRzLXdyaXRlIGNhcmRzLXNlbnNpdGl2ZSBjYXJkcy1zZW5zaXRpdmUtd3JpdGUgdHJhbnNhY3Rpb25zIHRyYW5zYWN0aW9ucy13cml0ZSBhdXRob3JpemF0aW9ucyBzdGF0ZW1lbnRzIHBheW1lbnRzIHBheW1lbnRzLXdyaXRlIHBheW1lbnRzLXdyaXRlLWNvdW50ZXJwYXJ0eSBwYXltZW50cy13cml0ZS1saW5rZWQtYWNjb3VudCBhY2gtcGF5bWVudHMtd3JpdGUgd2lyZS1wYXltZW50cy13cml0ZSByZXBheW1lbnRzIHJlcGF5bWVudHMtd3JpdGUgcGF5bWVudHMtd3JpdGUtYWNoLWRlYml0IGNvdW50ZXJwYXJ0aWVzIGNvdW50ZXJwYXJ0aWVzLXdyaXRlIGJhdGNoLXJlbGVhc2VzIGJhdGNoLXJlbGVhc2VzLXdyaXRlIGxpbmtlZC1hY2NvdW50cyBsaW5rZWQtYWNjb3VudHMtd3JpdGUgd2ViaG9va3Mgd2ViaG9va3Mtd3JpdGUgZXZlbnRzIGV2ZW50cy13cml0ZSBhdXRob3JpemF0aW9uLXJlcXVlc3RzIGF1dGhvcml6YXRpb24tcmVxdWVzdHMtd3JpdGUgY2FzaC1kZXBvc2l0cyBjYXNoLWRlcG9zaXRzLXdyaXRlIGNoZWNrLWRlcG9zaXRzIGNoZWNrLWRlcG9zaXRzLXdyaXRlIHJlY2VpdmVkLXBheW1lbnRzIHJlY2VpdmVkLXBheW1lbnRzLXdyaXRlIGRpc3B1dGVzIGNoYXJnZWJhY2tzIGNoYXJnZWJhY2tzLXdyaXRlIHJld2FyZHMgcmV3YXJkcy13cml0ZSBjaGVjay1wYXltZW50cyBjaGVjay1wYXltZW50cy13cml0ZSBjcmVkaXQtZGVjaXNpb25zIGNyZWRpdC1kZWNpc2lvbnMtd3JpdGUgbGVuZGluZy1wcm9ncmFtcyBsZW5kaW5nLXByb2dyYW1zLXdyaXRlIGNhcmQtZnJhdWQtY2FzZXMgY2FyZC1mcmF1ZC1jYXNlcy13cml0ZSBjcmVkaXQtYXBwbGljYXRpb25zIGNyZWRpdC1hcHBsaWNhdGlvbnMtd3JpdGUgbWlncmF0aW9ucyBtaWdyYXRpb25zLXdyaXRlIHRheCB0YXgtd3JpdGUgZm9ybXMgZm9ybXMtd3JpdGUgZm9ybXMtc2Vuc2l0aXZlIHdpcmUtZHJhd2Rvd25zIHdpcmUtZHJhd2Rvd25zLXdyaXRlIiwib3JnIjoiU0RLIiwic291cmNlSXAiOiIiLCJ1c2VyVHlwZSI6Im9yZyIsImlzVW5pdFBpbG90IjpmYWxzZSwiaXNQYXJlbnRPcmciOmZhbHNlfQQf2-ekwd-2a-96TvISNvSQIySQdvfjMep2v38ORg3lzeOA2i7a43f2k42-AL7R1rGvl5xkLpNdjTFJmBQNdgQ";
        ApiClient cl = new ApiClient();
        ObjectMapper mapper = cl.getObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        cl.setObjectMapper(mapper);
        cl.setRequestInterceptor(r -> {
            r.header("Authorization", "Bearer " + access_token);
        });
        unitApi = new UnitApi(cl);
        }

        return unitApi;
    }

    public static CreateApplicationRequest GenerateCreateIndividualApplicationRequest(String ssn) {
        if (ssn == null) ssn = "721074426";
        CreateIndividualApplication createIndividualApplication = new CreateIndividualApplication();
        CreateIndividualApplicationAttributes attr = new CreateIndividualApplicationAttributes();

        FullName fn = new FullName();
        fn.setFirst("Peter");
        fn.setLast("Parker");
        attr.setFullName(fn);

        Address address = new Address();
        address.setStreet("20 Ingram St");
        address.setCity("Forest Hills");
        address.setPostalCode("11375");
        address.setCountry("US");
        address.setState("NY");
        attr.setAddress(address);

        attr.setSsn(ssn);
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));
        attr.setEmail("peter@oscorp.com");
        Phone p = new Phone();
        p.setNumber("5555555555");
        p.setCountryCode("1");
        attr.setPhone(p);
        attr.setOccupation(Occupation.ARCHITECT_OR_ENGINEER);

        createIndividualApplication.setAttributes(attr);

        CreateApplicationRequest ca = new CreateApplicationRequest();
        ca.data(new CreateApplicationRequestData(createIndividualApplication));

        return ca;
    }

    public static CreateApplicationRequest GenerateCreateSoleProprietorApplicationRequest() {
        CreateSoleProprietorApplication createSoleProprietorApplication = new CreateSoleProprietorApplication();
        CreateSoleProprietorApplicationAttributes attr = new CreateSoleProprietorApplicationAttributes();

        FullName fn = new FullName();
        fn.setFirst("Peter");
        fn.setLast("Parker");
        attr.setFullName(fn);

        Address address = new Address();
        address.setStreet("20 Ingram St");
        address.setCity("Forest Hills");
        address.setPostalCode("11375");
        address.setCountry("US");
        address.setState("NY");
        attr.setAddress(address);

        attr.setSsn("721074426");
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));
        attr.setEmail("peter@oscorp.com");
        Phone p = new Phone();
        p.setNumber("5555555555");
        p.setCountryCode("1");
        attr.setPhone(p);
        attr.setSoleProprietorship(true);
        attr.setBusinessVertical(BusinessVertical.BUSINESS_SUPPORT_OR_BUILDING_SERVICES);
        attr.setAnnualRevenue(SoleProprietorshipAnnualRevenue.BETWEEN100K_AND200K);
        attr.setNumberOfEmployees(SoleProprietorshipNumberOfEmployees.BETWEEN5_AND10);

        createSoleProprietorApplication.setAttributes(attr);

        CreateApplicationRequest ca = new CreateApplicationRequest();
        ca.data(new CreateApplicationRequestData(createSoleProprietorApplication));

        return ca;
    }

    public static CreateApplicationRequest GenerateCreateBusinessApplicationRequest() {
        CreateBusinessApplication createBusinessApplication = new CreateBusinessApplication();
        CreateBusinessApplicationAttributes attr = new CreateBusinessApplicationAttributes();

        attr.setName("Peter Parker");

        Address address = new Address();
        address.setStreet("20 Ingram St");
        address.setCity("Forest Hills");
        address.setPostalCode("11375");
        address.setCountry("US");
        address.setState("NY");
        attr.setAddress(address);

        
        Phone p = new Phone();
        p.setNumber("5555555555");
        p.setCountryCode("1");
        attr.setPhone(p);

        attr.setStateOfIncorporation("DE");
        attr.setEin("123456789");
        attr.setEntityType(EntityType.CORPORATION);
        attr.setIp("127.0.0.1");
        attr.setAnnualRevenue(BusinessAnnualRevenue.BETWEEN250K_AND500K);
        attr.setNumberOfEmployees(BusinessNumberOfEmployees.BETWEEN100_AND500);
        attr.setCashFlow(CashFlow.PREDICTABLE);
        attr.setYearOfIncorporation("1999");
        List<String> countriesOfOperation = new ArrayList<String>();
        countriesOfOperation.add("US");
        countriesOfOperation.add("CA");

        attr.setCountriesOfOperation(countriesOfOperation);

        attr.setWebsite(null);
        
        String email = "richard@piedpiper.com";
        Contact contact = new Contact();
        contact.setEmail(email);
        contact.setPhone(p);
        FullName fn = new FullName();
        fn.setFirst("Peter");
        fn.setLast("Parker");
        contact.setFullName(fn);
        attr.setContact(contact);


        CreateOfficer officer = new CreateOfficer();
        officer.setAnnualIncome(AnnualIncome.BETWEEN50K_AND100K);
        officer.setFullName(fn);
        officer.setAddress(address);
        officer.setEmail(email);
        officer.setPhone(p);
        LocalDate dateOfBirh = LocalDate.of(1997, 11, 1);
        officer.setDateOfBirth(dateOfBirh);
        officer.setTitle(CreateOfficer.TitleEnum.CEO);
        officer.setOccupation(Occupation.ARCHITECT_OR_ENGINEER);
        officer.setSourceOfIncome(SourceOfIncome.BUSINESS_OWNERSHIP_INTERESTS);
        officer.setSsn("123456789");

        attr.setOfficer(officer);
        attr.setBusinessVertical(BusinessVertical.ARTS_ENTERTAINMENT_AND_RECREATION);

        List<CreateBeneficialOwner> beneficialOwners = new ArrayList<CreateBeneficialOwner>();
        CreateBeneficialOwner beneficialOwner = new CreateBeneficialOwner();
        beneficialOwner.setAddress(address);
        beneficialOwner.setFullName(fn);
        beneficialOwner.setDateOfBirth(dateOfBirh);
        beneficialOwner.setSsn("721074426");
        beneficialOwner.setEmail(email);
        beneficialOwner.setPhone(p);
        beneficialOwner.setOccupation(Occupation.ARCHITECT_OR_ENGINEER);
        beneficialOwner.setAnnualIncome(AnnualIncome.BETWEEN100K_AND250K);
        beneficialOwner.setSourceOfIncome(SourceOfIncome.BUSINESS_OWNERSHIP_INTERESTS);
        beneficialOwner.setPercentage(100);
        beneficialOwners.add(beneficialOwner);
        attr.setBeneficialOwners(beneficialOwners);

        createBusinessApplication.setAttributes(attr);

        CreateApplicationRequest ca = new CreateApplicationRequest();
        ca.data(new CreateApplicationRequestData(createBusinessApplication));

        return ca;
    }

    public static PaymentCounterparty CreatePaymentCounterparty() {
        PaymentCounterparty counterparty = new PaymentCounterparty();
        counterparty.setName("Jane Doe");
        counterparty.setRoutingNumber("812345673");
        counterparty.setAccountNumber("12345569");
        counterparty.setAccountType(PaymentCounterparty.AccountTypeEnum.CHECKING);

        return counterparty;
    }

    public static Address CreateAddress() {
        Address address = new Address();
        address.setStreet("20 Ingram St");
        address.setCity("Forest Hills");
        address.setState("CA");
        address.setPostalCode("11375");
        address.setCountry("US");

        return address;
    }

    public static WirePaymentCounterparty CreateWirePaymentCounterparty() {
        WirePaymentCounterparty counterparty = new WirePaymentCounterparty();
        counterparty.setName("April Oniel");
        counterparty.setAccountNumber("1000000001");
        counterparty.setRoutingNumber("812345678");
        counterparty.setAddress(CreateAddress());

        return counterparty;
    }
}
