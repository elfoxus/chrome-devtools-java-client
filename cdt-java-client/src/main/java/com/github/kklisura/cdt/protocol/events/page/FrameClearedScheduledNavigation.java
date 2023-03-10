package com.github.kklisura.cdt.protocol.events.page;

/** Fired when frame no longer has a scheduled navigation. */
@Deprecated
public class FrameClearedScheduledNavigation {

  private String frameId;

  /** Id of the frame that has cleared its scheduled navigation. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that has cleared its scheduled navigation. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}
