package com.github.kklisura.cdt.protocol.events.target;

import com.github.kklisura.cdt.protocol.types.target.TargetInfo;

/** Issued when a possible inspection target is created. */
public class TargetCreated {

  private TargetInfo targetInfo;

  public TargetInfo getTargetInfo() {
    return targetInfo;
  }

  public void setTargetInfo(TargetInfo targetInfo) {
    this.targetInfo = targetInfo;
  }
}
