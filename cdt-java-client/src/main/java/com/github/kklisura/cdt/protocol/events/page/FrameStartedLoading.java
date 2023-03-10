package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Fired when frame has started loading. */
@Experimental
public class FrameStartedLoading {

  private String frameId;

  /** Id of the frame that has started loading. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that has started loading. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}
