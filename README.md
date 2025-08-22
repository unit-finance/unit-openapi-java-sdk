### unit-openapi-java-sdk

The official Java client library for the [Unit API](https://unit.co/docs/api/). This library is the first Unit SDK to be generated from the [Unit OpenAPI schema](https://github.com/unit-finance/openapi-unit-sdk) and is currently available in beta. We encourage you to share any comments, suggestions or issues you encounter while implementing this SDK with us and contribute to the development of this Java client.

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

Installation options for Maven and Gradle using Maven Central:

```xml
<!-- Maven (no repository block needed; Maven Central is default) -->
<dependency>
  <groupId>co.unit</groupId>
  <artifactId>java-sdk</artifactId>
  <version>YOUR_VERSION</version>
  <!-- replace YOUR_VERSION with the latest released version -->
  <!-- https://central.sonatype.com/artifact/co.unit/java-sdk -->
  
</dependency>
```

```groovy
// Gradle
repositories {
  mavenCentral()
}

dependencies {
  implementation 'co.unit:java-sdk:YOUR_VERSION'
}
```

See the [Maven Central artifact page](https://central.sonatype.com/artifact/co.unit/java-sdk) for the latest version.

## Basic Usage Examples

For more examples of basic usage, see the [Test suites](https://github.com/unit-finance/unit-openapi-java-sdk/tree/main/src/test/java/unit/java/sdk) or [API Reference documentation](https://docs.unit.co/).

```java
String access_token = "access_token";
ApiClient cl = new ApiClient();
ObjectMapper mapper = cl.getObjectMapper();
mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); // To allow certain requests with empty bodies
cl.setObjectMapper(mapper);
cl.setRequestInterceptor(r -> {
    r.header("Authorization", "Bearer " + access_token);
});
UnitApi unitApi = new UnitApi(cl);

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
beneficialOwners.add(beneficialOwner);
attr.setBeneficialOwners(beneficialOwners);

createBusinessApplication.setAttributes(attr);

CreateApplicationRequest ca = new CreateApplicationRequest();
ca.data(new CreateApplicationRequestData(createBusinessApplication));

UnitCreateApplicationResponse res = unitApi.createApplication(ca)
```

## About

To generate a customized version of the unit-java-sdk using our [OpenAPI project](https://github.com/unit-finance/openapi-unit-sdk)
we suggest modifying `npm run generate-java` command in our [openapi-unit-sdk repo](https://github.com/unit-finance/openapi-unit-sdk/tree/main) [package.json](https://github.com/unit-finance/openapi-unit-sdk/blob/main/package.json), which uses open-generator-cli as it's base
