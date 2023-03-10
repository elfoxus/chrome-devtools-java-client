package com.github.kklisura.cdt.protocol.events.network;

/** Fired when WebSocket is closed. */
public class WebSocketClosed {

  private String requestId;

  private Double timestamp;

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
}
