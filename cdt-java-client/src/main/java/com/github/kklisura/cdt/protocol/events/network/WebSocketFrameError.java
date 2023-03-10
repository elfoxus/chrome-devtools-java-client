package com.github.kklisura.cdt.protocol.events.network;

/** Fired when WebSocket message error occurs. */
public class WebSocketFrameError {

  private String requestId;

  private Double timestamp;

  private String errorMessage;

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

  /** WebSocket error message. */
  public String getErrorMessage() {
    return errorMessage;
  }

  /** WebSocket error message. */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
