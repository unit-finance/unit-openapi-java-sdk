package org.openapitools.client;

import org.openapitools.client.model.*;

import java.time.LocalDate;

public class TestHelpers {
    public static CreateApplication CreateApplicationRequest() {
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

        attr.setSsn("721074426");
        attr.setDateOfBirth(LocalDate.parse("2001-08-10"));
        attr.setEmail("peter@oscorp.com");
        Phone p = new Phone();
        p.setNumber("5555555555");
        p.setCountryCode("1");
        attr.setPhone(p);
        attr.setIdempotencyKey("3a1a33be-4e12-4603-9ed0-820922389fb8");
        attr.setOccupation(Occupation.ARCHITECTORENGINEER);

        createIndividualApplication.setAttributes(attr);

        CreateApplication ca = new CreateApplication();
        ca.data(new CreateApplicationData(createIndividualApplication));

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
