package com.github.kklisura.cdt.protocol.types.indexeddb;

import java.util.List;

/** Database with an array of object stores. */
public class DatabaseWithObjectStores {

  private String name;

  private Double version;

  private List<ObjectStore> objectStores;

  /** Database name. */
  public String getName() {
    return name;
  }

  /** Database name. */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Database version (type is not 'integer', as the standard requires the version number to be
   * 'unsigned long long')
   */
  public Double getVersion() {
    return version;
  }

  /**
   * Database version (type is not 'integer', as the standard requires the version number to be
   * 'unsigned long long')
   */
  public void setVersion(Double version) {
    this.version = version;
  }

  /** Object stores in this database. */
  public List<ObjectStore> getObjectStores() {
    return objectStores;
  }

  /** Object stores in this database. */
  public void setObjectStores(List<ObjectStore> objectStores) {
    this.objectStores = objectStores;
  }
}
