package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class CrossOriginOpenerPolicyStatus {

  private CrossOriginOpenerPolicyValue value;

  private CrossOriginOpenerPolicyValue reportOnlyValue;

  @Optional private String reportingEndpoint;

  @Optional private String reportOnlyReportingEndpoint;

  public CrossOriginOpenerPolicyValue getValue() {
    return value;
  }

  public void setValue(CrossOriginOpenerPolicyValue value) {
    this.value = value;
  }

  public CrossOriginOpenerPolicyValue getReportOnlyValue() {
    return reportOnlyValue;
  }

  public void setReportOnlyValue(CrossOriginOpenerPolicyValue reportOnlyValue) {
    this.reportOnlyValue = reportOnlyValue;
  }

  public String getReportingEndpoint() {
    return reportingEndpoint;
  }

  public void setReportingEndpoint(String reportingEndpoint) {
    this.reportingEndpoint = reportingEndpoint;
  }

  public String getReportOnlyReportingEndpoint() {
    return reportOnlyReportingEndpoint;
  }

  public void setReportOnlyReportingEndpoint(String reportOnlyReportingEndpoint) {
    this.reportOnlyReportingEndpoint = reportOnlyReportingEndpoint;
  }
}
