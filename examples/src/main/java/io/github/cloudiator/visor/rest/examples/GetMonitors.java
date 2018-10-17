package io.github.cloudiator.visor.rest.examples;

import io.github.cloudiator.visor.rest.ApiClient;
import io.github.cloudiator.visor.rest.ApiException;
import io.github.cloudiator.visor.rest.api.DefaultApi;
import io.github.cloudiator.visor.rest.model.DataSink;
import io.github.cloudiator.visor.rest.model.Interval;
import io.github.cloudiator.visor.rest.model.Interval.TimeUnitEnum;
import io.github.cloudiator.visor.rest.model.Monitor.TypeEnum;
import io.github.cloudiator.visor.rest.model.SensorMonitor;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.UUID;

public class GetMonitors {

  private static final ApiClient API_CLIENT = new ApiClient().setDebugging(true);
  private static final DefaultApi VISOR_API = new DefaultApi();

  static {
    VISOR_API.setApiClient(API_CLIENT);
  }

  public static void main(String[] args) throws ApiException {

    VISOR_API.getMonitors().forEach(System.out::println);

  }

}
