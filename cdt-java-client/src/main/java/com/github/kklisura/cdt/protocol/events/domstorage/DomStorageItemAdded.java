package com.github.kklisura.cdt.protocol.events.domstorage;

import com.github.kklisura.cdt.protocol.types.domstorage.StorageId;

public class DomStorageItemAdded {

  private StorageId storageId;

  private String key;

  private String newValue;

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

  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }
}
