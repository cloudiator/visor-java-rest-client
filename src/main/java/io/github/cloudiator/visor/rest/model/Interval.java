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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * Interval
 */

public class Interval implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("period")
  private BigDecimal period = null;

  /**
   * Gets or Sets timeUnit
   */
  @JsonAdapter(TimeUnitEnum.Adapter.class)
  public enum TimeUnitEnum {
    NANOSECONDS("NANOSECONDS"),
    
    MICROSECONDS("MICROSECONDS"),
    
    MILLISECONDS("MILLISECONDS"),
    
    SECONDS("SECONDS"),
    
    MINUTES("MINUTES"),
    
    HOURS("HOURS"),
    
    DAYS("DAYS");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TimeUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("timeUnit")
  private TimeUnitEnum timeUnit = null;

  public Interval period(BigDecimal period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPeriod() {
    return period;
  }

  public void setPeriod(BigDecimal period) {
    this.period = period;
  }

  public Interval timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @ApiModelProperty(required = true, value = "")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interval interval = (Interval) o;
    return Objects.equals(this.period, interval.period) &&
        Objects.equals(this.timeUnit, interval.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, timeUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interval {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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

