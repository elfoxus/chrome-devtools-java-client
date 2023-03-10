package com.github.kklisura.cdt.protocol.types.backgroundservice;

/** A key-value pair for additional event information to pass along. */
public class EventMetadata {

  private String key;

  private String value;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
