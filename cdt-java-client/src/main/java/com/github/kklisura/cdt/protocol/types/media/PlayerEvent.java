package com.github.kklisura.cdt.protocol.types.media;

/** Corresponds to kMediaEventTriggered */
public class PlayerEvent {

  private Double timestamp;

  private String value;

  public Double getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
