package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.types.network.WebSocketResponse;

/** Fired when WebSocket handshake response becomes available. */
public class WebSocketHandshakeResponseReceived {

  private String requestId;

  private Double timestamp;

  private WebSocketResponse response;

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

  /** WebSocket response data. */
  public WebSocketResponse getResponse() {
    return response;
  }

  /** WebSocket response data. */
  public void setResponse(WebSocketResponse response) {
    this.response = response;
  }
}
