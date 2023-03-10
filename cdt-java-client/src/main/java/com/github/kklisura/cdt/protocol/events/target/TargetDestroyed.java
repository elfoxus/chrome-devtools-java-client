package com.github.kklisura.cdt.protocol.events.target;

/** Issued when a target is destroyed. */
public class TargetDestroyed {

  private String targetId;

  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }
}
