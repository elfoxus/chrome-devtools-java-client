package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.Initiator;

/** Fired upon WebTransport creation. */
public class WebTransportCreated {

  private String transportId;

  private String url;

  private Double timestamp;

  @Optional private Initiator initiator;

  /** WebTransport identifier. */
  public String getTransportId() {
    return transportId;
  }

  /** WebTransport identifier. */
  public void setTransportId(String transportId) {
    this.transportId = transportId;
  }

  /** WebTransport request URL. */
  public String getUrl() {
    return url;
  }

  /** WebTransport request URL. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Timestamp. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
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
