package com.github.kklisura.cdt.protocol.events.storage;

/** A cache's contents have been modified. */
public class CacheStorageContentUpdated {

  private String origin;

  private String storageKey;

  private String cacheName;

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

  /** Name of cache in origin. */
  public String getCacheName() {
    return cacheName;
  }

  /** Name of cache in origin. */
  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }
}
