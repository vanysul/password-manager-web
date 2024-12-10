# openapi-java-client

Password Management API
- API version: 1.0.0
  - Build date: 2024-12-10T19:35:14.914+01:00[Europe/Belgrade]

API для управления паролями, включает операции CRUD


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasswordsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PasswordsApi apiInstance = new PasswordsApi(defaultClient);
    PasswordRequest passwordRequest = new PasswordRequest(); // PasswordRequest | 
    try {
      PasswordResponse result = apiInstance.createPassword(passwordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#createPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PasswordsApi* | [**createPassword**](docs/PasswordsApi.md#createPassword) | **POST** /api/passwords | Создать новый пароль
*PasswordsApi* | [**deletePassword**](docs/PasswordsApi.md#deletePassword) | **DELETE** /api/passwords/{id} | Удалить пароль по ID
*PasswordsApi* | [**getPassword**](docs/PasswordsApi.md#getPassword) | **GET** /api/passwords/{id} | Получить один пароль по ID
*PasswordsApi* | [**listPasswords**](docs/PasswordsApi.md#listPasswords) | **GET** /api/passwords | Получить список всех паролей
*PasswordsApi* | [**updatePassword**](docs/PasswordsApi.md#updatePassword) | **PUT** /api/passwords/{id} | Обновить пароль по ID


## Documentation for Models

 - [PasswordRequest](docs/PasswordRequest.md)
 - [PasswordResponse](docs/PasswordResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


