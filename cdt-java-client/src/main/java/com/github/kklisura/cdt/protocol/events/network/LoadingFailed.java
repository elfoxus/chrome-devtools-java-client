package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.BlockedReason;
import com.github.kklisura.cdt.protocol.types.network.CorsErrorStatus;
import com.github.kklisura.cdt.protocol.types.network.ResourceType;

/** Fired when HTTP request has failed to load. */
public class LoadingFailed {

  private String requestId;

  private Double timestamp;

  private ResourceType type;

  private String errorText;

  @Optional private Boolean canceled;

  @Optional private BlockedReason blockedReason;

  @Optional private CorsErrorStatus corsErrorStatus;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Timestamp. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /** Resource type. */
  public ResourceType getType() {
    return type;
  }

  /** Resource type. */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /** User friendly error message. */
  public String getErrorText() {
    return errorText;
  }

  /** User friendly error message. */
  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }

  /** True if loading was canceled. */
  public Boolean getCanceled() {
    return canceled;
  }

  /** True if loading was canceled. */
  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  /** The reason why loading was blocked, if any. */
  public BlockedReason getBlockedReason() {
    return blockedReason;
  }

  /** The reason why loading was blocked, if any. */
  public void setBlockedReason(BlockedReason blockedReason) {
    this.blockedReason = blockedReason;
  }

  /** The reason why loading was blocked by CORS, if any. */
  public CorsErrorStatus getCorsErrorStatus() {
    return corsErrorStatus;
  }

  /** The reason why loading was blocked by CORS, if any. */
  public void setCorsErrorStatus(CorsErrorStatus corsErrorStatus) {
    this.corsErrorStatus = corsErrorStatus;
  }
}
