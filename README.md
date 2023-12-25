### unit-openapi-java-sdk

The official java client library for the [Unit API](https://docs.unit.co/). This library is generated from the [Unit OpenAPI spec](https://github.com/unit-finance/openapi-unit-sdk).

## Installation

Unit-java is available at [Maven Central]().

```xml
<dependency>
  <groupId>com.unit</groupId>
  <artifactId>unit-java</artifactId>
  <!--Replace this version number with the latest verison, which can be found at https://github.com/unit/unit-java/tags-->
  <version>0.0.1</version>
</dependency>
```
https://github.com//
### Basic Usage Examples

For more examples of basic usage, see the [Tests suites](https://unit-finance/unit-openapi-java-sdk.com) or [API Reference documentation](https://docs.unit.co/).

```java
String access_token = System.getenv("access_token");
ApiClient cl = new ApiClient();
cl.setBearerToken(access_token);
Configuration.setDefaultApiClient(cl);

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

CreateApplication request = new CreateApplication();
request.data(new CreateApplicationData(createIndividualApplication));


CreateApplicationApi apiClient = new CreateApplicationApi();
UnitCreateApplicationResponse res = apiClient.execute(request);
```
