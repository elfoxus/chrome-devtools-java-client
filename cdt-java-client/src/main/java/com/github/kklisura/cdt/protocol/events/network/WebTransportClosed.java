package com.github.kklisura.cdt.protocol.events.network;

/** Fired when WebTransport is disposed. */
public class WebTransportClosed {

  private String transportId;

  private Double timestamp;

  /** WebTransport identifier. */
  public String getTransportId() {
    return transportId;
  }

  /** WebTransport identifier. */
  public void setTransportId(String transportId) {
    this.transportId = transportId;
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
