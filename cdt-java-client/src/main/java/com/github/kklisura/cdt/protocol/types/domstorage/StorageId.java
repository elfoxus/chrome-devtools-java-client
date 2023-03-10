package com.github.kklisura.cdt.protocol.types.domstorage;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** DOM Storage identifier. */
public class StorageId {

  @Optional private String securityOrigin;

  @Optional private String storageKey;

  private Boolean isLocalStorage;

  /** Security origin for the storage. */
  public String getSecurityOrigin() {
    return securityOrigin;
  }

  /** Security origin for the storage. */
  public void setSecurityOrigin(String securityOrigin) {
    this.securityOrigin = securityOrigin;
  }

  /** Represents a key by which DOM Storage keys its CachedStorageAreas */
  public String getStorageKey() {
    return storageKey;
  }

  /** Represents a key by which DOM Storage keys its CachedStorageAreas */
  public void setStorageKey(String storageKey) {
    this.storageKey = storageKey;
  }

  /** Whether the storage is local storage (not session storage). */
  public Boolean getIsLocalStorage() {
    return isLocalStorage;
  }

  /** Whether the storage is local storage (not session storage). */
  public void setIsLocalStorage(Boolean isLocalStorage) {
    this.isLocalStorage = isLocalStorage;
  }
}
