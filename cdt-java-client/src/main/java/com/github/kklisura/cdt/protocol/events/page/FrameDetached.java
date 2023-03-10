package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Fired when frame has been detached from its parent. */
public class FrameDetached {

  private String frameId;

  @Experimental private FrameDetachedReason reason;

  /** Id of the frame that has been detached. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that has been detached. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public FrameDetachedReason getReason() {
    return reason;
  }

  public void setReason(FrameDetachedReason reason) {
    this.reason = reason;
  }
}
