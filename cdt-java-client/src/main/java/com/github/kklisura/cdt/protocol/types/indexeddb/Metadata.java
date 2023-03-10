package com.github.kklisura.cdt.protocol.types.indexeddb;

public class Metadata {

  private Double entriesCount;

  private Double keyGeneratorValue;

  /** the entries count */
  public Double getEntriesCount() {
    return entriesCount;
  }

  /** the entries count */
  public void setEntriesCount(Double entriesCount) {
    this.entriesCount = entriesCount;
  }

  /**
   * the current value of key generator, to become the next inserted key into the object store.
   * Valid if objectStore.autoIncrement is true.
   */
  public Double getKeyGeneratorValue() {
    return keyGeneratorValue;
  }

  /**
   * the current value of key generator, to become the next inserted key into the object store.
   * Valid if objectStore.autoIncrement is true.
   */
  public void setKeyGeneratorValue(Double keyGeneratorValue) {
    this.keyGeneratorValue = keyGeneratorValue;
  }
}
