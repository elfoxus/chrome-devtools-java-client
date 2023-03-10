package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.Initiator;

/** Fired upon WebSocket creation. */
public class WebSocketCreated {

  private String requestId;

  private String url;

  @Optional private Initiator initiator;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** WebSocket request URL. */
  public String getUrl() {
    return url;
  }

  /** WebSocket request URL. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Request initiator. */
  public Initiator getInitiator() {
    return initiator;
  }

  /** Request initiator. */
  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }
}
