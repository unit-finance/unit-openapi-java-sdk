### unit-openapi-java-sdk

The official Java client library for the [Unit API](https://unit.co/docs/api/). This library is the first Unit SDK to be generated from the [Unit OpenAPI schema](https://github.com/unit-finance/openapi-unit-sdk) and is currently available in beta. We encourage you to share any comments, suggestions or issues you encounter while implementing this SDK with us and contribute to the development of this Java client.


## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation
Add this dependency to your project's POM:
```xml
<repositories>
    <repository>
        <id>sonatype-release</id>
        <url>https://s01.oss.sonatype.org/content/repositories/releases/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>co.unit</groupId>
        <artifactId>java-sdk</artifactId>
        <version>0.0.4</version>
    </dependency>
</dependencies>
```
## Basic Usage Examples

For more examples of basic usage, see the [Test suites](https://github.com/unit-finance/unit-openapi-java-sdk/tree/main/src/test/java/org/openapitools/client) or [API Reference documentation](https://docs.unit.co/).

```java
String access_token = System.getenv("access_token");
ApiClient apiClient = new ApiClient();
apiClient.setRequestInterceptor(r -> r.header("Authorization", "Bearer " + access_token));

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

CreateApplicationApi createApiClient = new CreateApplicationApi(apiClient);
UnitCreateApplicationResponse res = apiClient.execute(request);
```

## About
To generate a customized version of the unit-java-sdk using our [OpenAPI project](https://github.com/unit-finance/openapi-unit-sdk)
we suggest using the open-generator-cli to generate the Java client using the following command:
```commandline
openapi-generator-cli generate -g java -i openapi.json -o unit 
-p hideGenerationTimestamp=true -p packageName=unit.java.sdk 
-p modelPackage=unit.java.sdk.model -p apiPackage=unit.java.sdk.api 
--library native -p useJakartaEe=true
```
