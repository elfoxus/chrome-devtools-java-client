package com.github.kklisura.cdt.protocol.events.storage;

/** The origin's IndexedDB database list has been modified. */
public class IndexedDBListUpdated {

  private String origin;

  private String storageKey;

  /** Origin to update. */
  public String getOrigin() {
    return origin;
  }

  /** Origin to update. */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /** Storage key to update. */
  public String getStorageKey() {
    return storageKey;
  }

  /** Storage key to update. */
  public void setStorageKey(String storageKey) {
    this.storageKey = storageKey;
  }
}
