package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class CrossOriginEmbedderPolicyStatus {

  private CrossOriginEmbedderPolicyValue value;

  private CrossOriginEmbedderPolicyValue reportOnlyValue;

  @Optional private String reportingEndpoint;

  @Optional private String reportOnlyReportingEndpoint;

  public CrossOriginEmbedderPolicyValue getValue() {
    return value;
  }

  public void setValue(CrossOriginEmbedderPolicyValue value) {
    this.value = value;
  }

  public CrossOriginEmbedderPolicyValue getReportOnlyValue() {
    return reportOnlyValue;
  }

  public void setReportOnlyValue(CrossOriginEmbedderPolicyValue reportOnlyValue) {
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
