package com.github.kklisura.cdt.protocol.events.target;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
 * issued multiple times per target if multiple sessions have been attached to it.
 */
@Experimental
public class DetachedFromTarget {

  private String sessionId;

  @Deprecated @Optional private String targetId;

  /** Detached session identifier. */
  public String getSessionId() {
    return sessionId;
  }

  /** Detached session identifier. */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  /** Deprecated. */
  public String getTargetId() {
    return targetId;
  }

  /** Deprecated. */
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }
}
