# DefaultApi

All URIs are relative to *http://localhost:31415*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMonitor**](DefaultApi.md#deleteMonitor) | **DELETE** /monitors/{uuid} | 
[**deleteMonitors**](DefaultApi.md#deleteMonitors) | **DELETE** /monitors | 
[**getMonitor**](DefaultApi.md#getMonitor) | **GET** /monitors/{uuid} | 
[**getMonitors**](DefaultApi.md#getMonitors) | **GET** /monitors | 
[**postMonitors**](DefaultApi.md#postMonitors) | **POST** /monitors | 
[**putMonitor**](DefaultApi.md#putMonitor) | **PUT** /monitors/{uuid} | 


<a name="deleteMonitor"></a>
# **deleteMonitor**
> deleteMonitor(uuid)



### Example
```java
// Import classes:
//import io.github.cloudiator.visor.rest.ApiException;
//import io.github.cloudiator.visor.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String uuid = "uuid_example"; // String | A globally unique identifier of a monitor.
try {
    apiInstance.deleteMonitor(uuid);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| A globally unique identifier of a monitor. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMonitors"></a>
# **deleteMonitors**
> deleteMonitors()



### Example
```java
// Import classes:
//import io.github.cloudiator.visor.rest.ApiException;
//import io.github.cloudiator.visor.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.deleteMonitors();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteMonitors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMonitor"></a>
# **getMonitor**
> Monitor getMonitor(uuid)



### Example
```java
// Import classes:
//import io.github.cloudiator.visor.rest.ApiException;
//import io.github.cloudiator.visor.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String uuid = "uuid_example"; // String | A globally unique identifier of a monitor.
try {
    Monitor result = apiInstance.getMonitor(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| A globally unique identifier of a monitor. |

### Return type

[**Monitor**](Monitor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMonitors"></a>
# **getMonitors**
> List&lt;Monitor&gt; getMonitors()



### Example
```java
// Import classes:
//import io.github.cloudiator.visor.rest.ApiException;
//import io.github.cloudiator.visor.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Monitor> result = apiInstance.getMonitors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMonitors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Monitor&gt;**](Monitor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMonitors"></a>
# **postMonitors**
> Monitor postMonitors(monitor)



### Example
```java
// Import classes:
//import io.github.cloudiator.visor.rest.ApiException;
//import io.github.cloudiator.visor.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Monitor monitor = new Monitor(); // Monitor | 
try {
    Monitor result = apiInstance.postMonitors(monitor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postMonitors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitor** | [**Monitor**](Monitor.md)|  |

### Return type

[**Monitor**](Monitor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMonitor"></a>
# **putMonitor**
> Monitor putMonitor(uuid)



### Example
```java
// Import classes:
//import io.github.cloudiator.visor.rest.ApiException;
//import io.github.cloudiator.visor.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String uuid = "uuid_example"; // String | A globally unique identifier of a monitor.
try {
    Monitor result = apiInstance.putMonitor(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#putMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| A globally unique identifier of a monitor. |

### Return type

[**Monitor**](Monitor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

