package com.github.kklisura.cdt.protocol.types.storage;

/** Struct for a single key-value pair in an origin's shared storage. */
public class SharedStorageEntry {

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
