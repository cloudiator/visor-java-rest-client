/*
 * Visor REST Api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.cloudiator.visor.rest.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.visor.rest.model.DataSink;
import io.github.cloudiator.visor.rest.model.Monitor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

/**
 * A monitoring providing a telnet endpoint where applications can advertise metrics.
 */
@ApiModel(description = "A monitoring providing a telnet endpoint where applications can advertise metrics.")

public class PushMonitor extends Monitor implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("port")
  private BigDecimal port = null;

  public PushMonitor port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushMonitor pushMonitor = (PushMonitor) o;
    return Objects.equals(this.port, pushMonitor.port) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushMonitor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

