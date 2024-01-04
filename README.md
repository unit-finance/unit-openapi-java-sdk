### unit-openapi-java-sdk

The official java client library for the [Unit API](https://unit.co/docs/api/). This library is the first Unit SDK to be generated from the [Unit OpenAPI spec](https://github.com/unit-finance/openapi-unit-sdk) and is currently available in beta version. We encourage you to share any issues you encounter while implementing this SDK with us or possible improvement suggestions to help us identify and improve the Java client.


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

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
        <version>0.0.1</version>
    </dependency>
</dependencies>
```
## Basic Usage Examples

For more examples of basic usage, see the [Test suites](https://github.com/unit-finance/unit-openapi-java-sdk/tree/main/src/test/java/org/openapitools/client) or [API Reference documentation](https://docs.unit.co/).

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

## About
To generate a customized version of the unit-java-sdk using our [OpenAPI project](https://github.com/unit-finance/openapi-unit-sdk)
we suggest using the open-generator-cli to generate the Java client using the following command:
```commandline
openapi-generator-cli generate -g java -i openapi.json -o unit-java-sdk
--additional-properties hideGenerationTimestamp=true
```
Please note that the current generator version lacks support for deepObjects. After generating the Java client, if you wish to enable functionality for list parameters, you'll need to implement a serialization function. A sample of this function, named `toParams()`, can be found in `client/model/ExecuteFilterParameter.java`.

Additionally, modifications need to be made to the executeCall function in each GetList file that utilizes parameters:
```java
if (page != null) {
    localVarQueryParams.addAll(page.toParams());
}

if (filter != null) {
    localVarQueryParams.addAll(filter.toParams());
}

if (include != null) {
    localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
}
```
For parameters defined as deepObjects (beyond primitive types), these should be appended to localVarQueryParams after serialization using the `toParams()` function, rather than using `localVarApiClient.parameterToPair()` which is designed for primitive types exclusively.
