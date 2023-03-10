package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.network.ResourcePriority;

/** Fired when resource loading priority is changed */
@Experimental
public class ResourceChangedPriority {

  private String requestId;

  private ResourcePriority newPriority;

  private Double timestamp;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** New priority */
  public ResourcePriority getNewPriority() {
    return newPriority;
  }

  /** New priority */
  public void setNewPriority(ResourcePriority newPriority) {
    this.newPriority = newPriority;
  }

  /** Timestamp. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
