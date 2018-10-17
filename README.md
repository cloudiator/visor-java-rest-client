# java-rest

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.github.cloudiator.visor.client</groupId>
    <artifactId>java-rest</artifactId>
    <version>0.3.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.github.cloudiator.visor.client:java-rest:0.3.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-rest-0.3.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.github.cloudiator.visor.rest.*;
import io.github.cloudiator.visor.rest.auth.*;
import io.github.cloudiator.visor.rest.model.*;
import io.github.cloudiator.visor.rest.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String uuid = "uuid_example"; // String | A globally unique identifier of a monitor.
        try {
            apiInstance.deleteMonitor(uuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteMonitor");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:31415*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteMonitor**](docs/DefaultApi.md#deleteMonitor) | **DELETE** /monitors/{uuid} | 
*DefaultApi* | [**deleteMonitors**](docs/DefaultApi.md#deleteMonitors) | **DELETE** /monitors | 
*DefaultApi* | [**getMonitor**](docs/DefaultApi.md#getMonitor) | **GET** /monitors/{uuid} | 
*DefaultApi* | [**getMonitors**](docs/DefaultApi.md#getMonitors) | **GET** /monitors | 
*DefaultApi* | [**postMonitors**](docs/DefaultApi.md#postMonitors) | **POST** /monitors | 
*DefaultApi* | [**putMonitor**](docs/DefaultApi.md#putMonitor) | **PUT** /monitors/{uuid} | 


## Documentation for Models

 - [DataSink](docs/DataSink.md)
 - [DataSinkConfiguration](docs/DataSinkConfiguration.md)
 - [Interval](docs/Interval.md)
 - [Monitor](docs/Monitor.md)
 - [PushMonitor](docs/PushMonitor.md)
 - [SensorMonitor](docs/SensorMonitor.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

daniel.baur@uni-ulm.de

