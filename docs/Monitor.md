
# Monitor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**metricName** | **String** | Unique name identifying the metric | 
**componentId** | **String** | ID of the component monitored by this sensor. | 
**monitorContext** | **Map&lt;String, String&gt;** | Context of the monitor. Multiple key - value pairs depicting the environment of the monitor. |  [optional]
**dataSinks** | [**List&lt;DataSink&gt;**](DataSink.md) |  |  [optional]
**uuid** | **String** | UUID set by Visor |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PUSHMONITOR | &quot;PushMonitor&quot;
SENSORMONITOR | &quot;SensorMonitor&quot;



