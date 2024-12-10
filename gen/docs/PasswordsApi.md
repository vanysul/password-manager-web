# PasswordsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPassword**](PasswordsApi.md#createPassword) | **POST** /api/passwords | Создать новый пароль |
| [**deletePassword**](PasswordsApi.md#deletePassword) | **DELETE** /api/passwords/{id} | Удалить пароль по ID |
| [**getPassword**](PasswordsApi.md#getPassword) | **GET** /api/passwords/{id} | Получить один пароль по ID |
| [**listPasswords**](PasswordsApi.md#listPasswords) | **GET** /api/passwords | Получить список всех паролей |
| [**updatePassword**](PasswordsApi.md#updatePassword) | **PUT** /api/passwords/{id} | Обновить пароль по ID |


<a name="createPassword"></a>
# **createPassword**
> PasswordResponse createPassword(passwordRequest)

Создать новый пароль

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordRequest** | [**PasswordRequest**](PasswordRequest.md)|  | |

### Return type

[**PasswordResponse**](PasswordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Пароль успешно создан |  -  |

<a name="deletePassword"></a>
# **deletePassword**
> deletePassword(id)

Удалить пароль по ID

### Example
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
    Integer id = 56; // Integer | 
    try {
      apiInstance.deletePassword(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#deletePassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Пароль успешно удален |  -  |

<a name="getPassword"></a>
# **getPassword**
> PasswordResponse getPassword(id)

Получить один пароль по ID

### Example
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
    Integer id = 56; // Integer | 
    try {
      PasswordResponse result = apiInstance.getPassword(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#getPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

### Return type

[**PasswordResponse**](PasswordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Информация о пароле |  -  |

<a name="listPasswords"></a>
# **listPasswords**
> List&lt;PasswordResponse&gt; listPasswords()

Получить список всех паролей

### Example
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
    try {
      List<PasswordResponse> result = apiInstance.listPasswords();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#listPasswords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PasswordResponse&gt;**](PasswordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список паролей |  -  |

<a name="updatePassword"></a>
# **updatePassword**
> PasswordResponse updatePassword(id, passwordRequest)

Обновить пароль по ID

### Example
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
    Integer id = 56; // Integer | 
    PasswordRequest passwordRequest = new PasswordRequest(); // PasswordRequest | 
    try {
      PasswordResponse result = apiInstance.updatePassword(id, passwordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PasswordsApi#updatePassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |
| **passwordRequest** | [**PasswordRequest**](PasswordRequest.md)|  | |

### Return type

[**PasswordResponse**](PasswordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Пароль успешно обновлен |  -  |

