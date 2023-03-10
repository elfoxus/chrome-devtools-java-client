package com.github.kklisura.cdt.protocol.types.storage;

/** Pair of reporting metadata details for a candidate URL for `selectURL()`. */
public class SharedStorageReportingMetadata {

  private String eventType;

  private String reportingUrl;

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getReportingUrl() {
    return reportingUrl;
  }

  public void setReportingUrl(String reportingUrl) {
    this.reportingUrl = reportingUrl;
  }
}
