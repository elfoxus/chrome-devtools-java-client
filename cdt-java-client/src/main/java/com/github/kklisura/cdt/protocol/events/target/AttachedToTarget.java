package com.github.kklisura.cdt.protocol.events.target;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.target.TargetInfo;

/** Issued when attached to target because of auto-attach or `attachToTarget` command. */
@Experimental
public class AttachedToTarget {

  private String sessionId;

  private TargetInfo targetInfo;

  private Boolean waitingForDebugger;

  /** Identifier assigned to the session used to send/receive messages. */
  public String getSessionId() {
    return sessionId;
  }

  /** Identifier assigned to the session used to send/receive messages. */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public TargetInfo getTargetInfo() {
    return targetInfo;
  }

  public void setTargetInfo(TargetInfo targetInfo) {
    this.targetInfo = targetInfo;
  }

  public Boolean getWaitingForDebugger() {
    return waitingForDebugger;
  }

  public void setWaitingForDebugger(Boolean waitingForDebugger) {
    this.waitingForDebugger = waitingForDebugger;
  }
}
