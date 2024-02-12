package unit.java.sdk;

import unit.java.sdk.model.*;

import java.time.LocalDate;

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
    public static unit.java.sdk.model.CreateApplication CreateApplicationRequest() {
        unit.java.sdk.model.CreateIndividualApplication createIndividualApplication = new unit.java.sdk.model.CreateIndividualApplication();
        unit.java.sdk.model.CreateIndividualApplicationAttributes attr = new unit.java.sdk.model.CreateIndividualApplicationAttributes();

        unit.java.sdk.model.FullName fn = new unit.java.sdk.model.FullName();
        fn.setFirst("Peter");
        fn.setLast("Parker");
        attr.setFullName(fn);

        unit.java.sdk.model.Address address = new unit.java.sdk.model.Address();
        address.setStreet("20 Ingram St");
        address.setCity("Forest Hills");
        address.setPostalCode("11375");
        address.setCountry("US");
        address.setState("NY");
        attr.setAddress(address);

        attr.setSsn("721074426");
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));
        attr.setEmail("peter@oscorp.com");
        unit.java.sdk.model.Phone p = new unit.java.sdk.model.Phone();
        p.setNumber("5555555555");
        p.setCountryCode("1");
        attr.setPhone(p);
        attr.setIdempotencyKey("3a1a33be-4e12-4603-9ed0-820922389fb8");
        attr.setOccupation(unit.java.sdk.model.Occupation.ARCHITECTORENGINEER);

        createIndividualApplication.setAttributes(attr);

        unit.java.sdk.model.CreateApplication ca = new unit.java.sdk.model.CreateApplication();
        ca.data(new unit.java.sdk.model.CreateApplicationData(createIndividualApplication));

        return ca;
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

    public static WireCounterparty CreateWireCounterparty() {
        WireCounterparty counterparty = new WireCounterparty();
        counterparty.setName("April Oniel");
        counterparty.setAccountNumber("1000000001");
        counterparty.setRoutingNumber("812345678");
        counterparty.setAddress(CreateAddress());

        return counterparty;
    }
}
