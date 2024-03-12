package unit.java.sdk;

import unit.java.sdk.model.*;
import java.time.LocalDate;
import java.util.Arrays;

public class TestHelpers {
    private static ApiClient apiClient;
    static ApiClient getApiClient() {
        if(apiClient == null){
            String access_token = System.getenv("access_token");
            apiClient = new ApiClient();
            apiClient.setRequestInterceptor(r -> r.header("Authorization", "Bearer " + access_token));
        }

        return apiClient;
    }
    public static CreateApplication CreateApplicationRequest() {
        CreateIndividualApplication createIndividualApplication = CreateIndividualApplicationRequest();
        CreateApplication ca = new CreateApplication();
        ca.data(new CreateApplicationData(createIndividualApplication));

        return ca;
    }
    public static CreateIndividualApplication CreateIndividualApplicationRequest() {
        CreateIndividualApplication createIndividualApplication = new CreateIndividualApplication();
        CreateIndividualApplicationAttributes attr = new CreateIndividualApplicationAttributes();

        attr.setFullName(CreateFullName());
        attr.setAddress(CreateAddress());

        attr.setSsn("721074426");
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));
        attr.setEmail("peter@oscorp.com");
        attr.setPhone(CreatePhone());
        attr.setIdempotencyKey("3a1a33be-4e12-4603-9ed0-820922389fb8");
        attr.setOccupation(Occupation.ARCHITECTORENGINEER);

        createIndividualApplication.setAttributes(attr);

        return createIndividualApplication;
    }
    public static CreateBusinessApplication CreateBusinessApplicationRequest() {
        CreateBusinessApplication createBusinessApplication = new CreateBusinessApplication();
        CreateBusinessApplicationAttributes attr = new CreateBusinessApplicationAttributes();
        Address address = CreateAddress();

        attr.setName("Pied Piper");
        attr.setAddress(address);

        Phone p = new Phone();
        p.setNumber("9294723497");
        p.setCountryCode("1");
        attr.setPhone(p);

        attr.setStateOfIncorporation("DE");
        attr.setEin("123456789");
        attr.setEntityType(EntityType.CORPORATION);
        attr.setIp("127.0.0.2");
        attr.setAnnualRevenue(BusinessAnnualRevenue.BETWEEN500KAND1M);
        attr.setNumberOfEmployees(BusinessNumberOfEmployees.BETWEEN50AND100);
        attr.setCashFlow(CashFlow.PREDICTABLE);
        attr.setYearOfIncorporation("2014");
        attr.setCountriesOfOperation(Arrays.asList("US", "CA"));
        attr.setStockSymbol("PPI");
        attr.businessVertical(BusinessVertical.TECHNOLOGYMEDIAORTELECOM);
        attr.setWebsite("https://www.piedpiper.com");

        Contact contact = new Contact();
        contact.setFullName(CreateFullNameRichardHendricks());
        contact.setEmail("richard@piedpiper.com");
        contact.setPhone(p);
        attr.setContact(contact);

        CreateOfficer officer = new CreateOfficer();
        officer.setFullName(CreateFullNameRichardHendricks());
        officer.setDateOfBirth(LocalDate.parse("2001-08-10"));
        officer.setTitle(CreateOfficer.TitleEnum.CEO);
        officer.setSsn("721074426");
        officer.setEmail("richard@piedpiper.com");
        officer.setPhone(p);
        officer.setAddress(CreateAddress());
        officer.setOccupation(Occupation.ARCHITECTORENGINEER);
        officer.setAnnualIncome(AnnualIncome.BETWEEN50KAND100K);
        officer.setSourceOfIncome(SourceOfIncome.EMPLOYMENTORPAYROLLINCOME);
        attr.setOfficer(officer);

        CreateBeneficialOwner bo = new CreateBeneficialOwner();
        bo.setFullName(CreateFullNameRichardHendricks());
        bo.setAddress(CreateAddress());
        bo.setDateOfBirth(LocalDate.parse("2001-08-10"));
        bo.setSsn("123456789");
        bo.setEmail("richard@piedpiper.com");
        bo.setPercentage(75);
        bo.setPhone(p);
        bo.setOccupation(Occupation.ARCHITECTORENGINEER);
        bo.setAnnualIncome(AnnualIncome.BETWEEN50KAND100K);
        bo.setSourceOfIncome(SourceOfIncome.EMPLOYMENTORPAYROLLINCOME);
        attr.setBeneficialOwners(Arrays.asList(bo));
//        attr.setTags(new HashMap<>(){"userId": "2ab1f266-04b9-41fb-b728-cd1962bca52c"});

        createBusinessApplication.setAttributes(attr);

        CreateBusinessApplication cba = new CreateBusinessApplication();
        cba.setAttributes(attr);

        return cba;
    }
    public static Counterparty CreateCounterparty() {
        Counterparty counterparty = new Counterparty();
        counterparty.setName("Jane Doe");
        counterparty.setRoutingNumber("812345673");
        counterparty.setAccountNumber("12345569");
        counterparty.setAccountType(Counterparty.AccountTypeEnum.CHECKING);

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

    /**
     * Peter Parker
     * @return
     */
    public static FullName CreateFullName() {
        FullName fn = new FullName();
        fn.setFirst("Peter");
        fn.setLast("Parker");

        return fn;
    }

    public static FullName CreateFullNameRichardHendricks() {
        FullName fn = new FullName();
        fn.setFirst("Richard");
        fn.setLast("Hendricks");

        return fn;
    }

    public static Phone CreatePhone() {
        Phone p = new Phone();
        p.setNumber("5555555555");
        p.setCountryCode("1");

        return p;
    }

    public static WireCounterparty CreateWireCounterparty() {
        WireCounterparty counterparty = new WireCounterparty();
        counterparty.setName("April Oniel");
        counterparty.setAccountNumber("1000000001");
        counterparty.setRoutingNumber("812345678");
        counterparty.setAddress(CreateAddress());

        return counterparty;
    }

    public static Relationship CreateRelationship(String type, String id) {
        RelationshipData relationshipData = new RelationshipData();
        relationshipData.setType(type);
        relationshipData.setId(id);

        Relationship relationship = new Relationship();
        relationship.setData(relationshipData);

        return relationship;
    }

    public static CardLevelLimits CreateCardLevelLimits(int dailyWithdrawal, int dailyPurchase, int monthlyWithdrawal) {
        CardLevelLimits limits = new CardLevelLimits();
        limits.setDailyWithdrawal(dailyWithdrawal);
        limits.setDailyPurchase(dailyPurchase);
        limits.setMonthlyWithdrawal(monthlyWithdrawal);
        return limits;
    }

//    public static Tags CreateTags() {
//
//    }
}
