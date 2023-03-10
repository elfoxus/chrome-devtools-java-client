package com.github.kklisura.cdt.protocol.events.target;

import com.github.kklisura.cdt.protocol.types.target.TargetInfo;

/**
 * Issued when some information about a target has changed. This only happens between
 * `targetCreated` and `targetDestroyed`.
 */
public class TargetInfoChanged {

  private TargetInfo targetInfo;

  public TargetInfo getTargetInfo() {
    return targetInfo;
  }

  public void setTargetInfo(TargetInfo targetInfo) {
    this.targetInfo = targetInfo;
  }
}
