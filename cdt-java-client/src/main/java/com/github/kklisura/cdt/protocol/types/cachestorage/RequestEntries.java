package com.github.kklisura.cdt.protocol.types.cachestorage;

import java.util.List;

public class RequestEntries {

  private List<DataEntry> cacheDataEntries;

  private Double returnCount;

  /** Array of object store data entries. */
  public List<DataEntry> getCacheDataEntries() {
    return cacheDataEntries;
  }

  /** Array of object store data entries. */
  public void setCacheDataEntries(List<DataEntry> cacheDataEntries) {
    this.cacheDataEntries = cacheDataEntries;
  }

  /**
   * Count of returned entries from this storage. If pathFilter is empty, it is the count of all
   * entries from this storage.
   */
  public Double getReturnCount() {
    return returnCount;
  }

  /**
   * Count of returned entries from this storage. If pathFilter is empty, it is the count of all
   * entries from this storage.
   */
  public void setReturnCount(Double returnCount) {
    this.returnCount = returnCount;
  }
}
