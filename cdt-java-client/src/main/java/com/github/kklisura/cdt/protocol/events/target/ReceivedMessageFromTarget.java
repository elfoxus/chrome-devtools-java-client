package com.github.kklisura.cdt.protocol.events.target;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Notifies about a new protocol message received from the session (as reported in
 * `attachedToTarget` event).
 */
public class ReceivedMessageFromTarget {

  private String sessionId;

  private String message;

  @Deprecated @Optional private String targetId;

  /** Identifier of a session which sends a message. */
  public String getSessionId() {
    return sessionId;
  }

  /** Identifier of a session which sends a message. */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
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
