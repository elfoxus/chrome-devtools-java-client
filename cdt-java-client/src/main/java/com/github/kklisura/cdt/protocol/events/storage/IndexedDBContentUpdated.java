package com.github.kklisura.cdt.protocol.events.storage;

/** The origin's IndexedDB object store has been modified. */
public class IndexedDBContentUpdated {

  private String origin;

  private String storageKey;

  private String databaseName;

  private String objectStoreName;

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

  /** Database to update. */
  public String getDatabaseName() {
    return databaseName;
  }

  /** Database to update. */
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }

  /** ObjectStore to update. */
  public String getObjectStoreName() {
    return objectStoreName;
  }

  /** ObjectStore to update. */
  public void setObjectStoreName(String objectStoreName) {
    this.objectStoreName = objectStoreName;
  }
}
