package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Fired when HTTP request has finished loading. */
public class LoadingFinished {

  private String requestId;

  private Double timestamp;

  private Double encodedDataLength;

  @Optional private Boolean shouldReportCorbBlocking;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Timestamp. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /** Total number of bytes received for this request. */
  public Double getEncodedDataLength() {
    return encodedDataLength;
  }

  /** Total number of bytes received for this request. */
  public void setEncodedDataLength(Double encodedDataLength) {
    this.encodedDataLength = encodedDataLength;
  }

  /**
   * Set when 1) response was blocked by Cross-Origin Read Blocking and also 2) this needs to be
   * reported to the DevTools console.
   */
  public Boolean getShouldReportCorbBlocking() {
    return shouldReportCorbBlocking;
  }

  /**
   * Set when 1) response was blocked by Cross-Origin Read Blocking and also 2) this needs to be
   * reported to the DevTools console.
   */
  public void setShouldReportCorbBlocking(Boolean shouldReportCorbBlocking) {
    this.shouldReportCorbBlocking = shouldReportCorbBlocking;
  }
}
