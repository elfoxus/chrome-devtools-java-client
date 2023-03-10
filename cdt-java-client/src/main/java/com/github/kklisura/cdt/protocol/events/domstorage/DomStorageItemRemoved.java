package com.github.kklisura.cdt.protocol.events.domstorage;

import com.github.kklisura.cdt.protocol.types.domstorage.StorageId;

public class DomStorageItemRemoved {

  private StorageId storageId;

  private String key;

  public StorageId getStorageId() {
    return storageId;
  }

  public void setStorageId(StorageId storageId) {
    this.storageId = storageId;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
