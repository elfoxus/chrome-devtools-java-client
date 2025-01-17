package com.github.kklisura.cdt.protocol.events.storage;

import com.github.kklisura.cdt.protocol.types.storage.SharedStorageAccessParams;
import com.github.kklisura.cdt.protocol.types.storage.SharedStorageAccessType;

/**
 * Shared storage was accessed by the associated page. The following parameters are included in all
 * events.
 */
public class SharedStorageAccessed {

  private Double accessTime;

  private SharedStorageAccessType type;

  private String mainFrameId;

  private String ownerOrigin;

  private SharedStorageAccessParams params;

  /** Time of the access. */
  public Double getAccessTime() {
    return accessTime;
  }

  /** Time of the access. */
  public void setAccessTime(Double accessTime) {
    this.accessTime = accessTime;
  }

  /** Enum value indicating the Shared Storage API method invoked. */
  public SharedStorageAccessType getType() {
    return type;
  }

  /** Enum value indicating the Shared Storage API method invoked. */
  public void setType(SharedStorageAccessType type) {
    this.type = type;
  }

  /** DevTools Frame Token for the primary frame tree's root. */
  public String getMainFrameId() {
    return mainFrameId;
  }

  /** DevTools Frame Token for the primary frame tree's root. */
  public void setMainFrameId(String mainFrameId) {
    this.mainFrameId = mainFrameId;
  }

  /** Serialized origin for the context that invoked the Shared Storage API. */
  public String getOwnerOrigin() {
    return ownerOrigin;
  }

  /** Serialized origin for the context that invoked the Shared Storage API. */
  public void setOwnerOrigin(String ownerOrigin) {
    this.ownerOrigin = ownerOrigin;
  }

  /**
   * The sub-parameters warapped by `params` are all optional and their presence/absence depends on
   * `type`.
   */
  public SharedStorageAccessParams getParams() {
    return params;
  }

  /**
   * The sub-parameters warapped by `params` are all optional and their presence/absence depends on
   * `type`.
   */
  public void setParams(SharedStorageAccessParams params) {
    this.params = params;
  }
}
