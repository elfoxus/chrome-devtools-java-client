package com.github.kklisura.cdt.protocol.events.domstorage;

import com.github.kklisura.cdt.protocol.types.domstorage.StorageId;

public class DomStorageItemsCleared {

  private StorageId storageId;

  public StorageId getStorageId() {
    return storageId;
  }

  public void setStorageId(StorageId storageId) {
    this.storageId = storageId;
  }
}
