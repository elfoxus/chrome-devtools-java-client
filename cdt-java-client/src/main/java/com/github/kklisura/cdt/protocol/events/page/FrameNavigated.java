package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.page.Frame;
import com.github.kklisura.cdt.protocol.types.page.NavigationType;

/**
 * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
public class FrameNavigated {

  private Frame frame;

  @Experimental private NavigationType type;

  /** Frame object. */
  public Frame getFrame() {
    return frame;
  }

  /** Frame object. */
  public void setFrame(Frame frame) {
    this.frame = frame;
  }

  public NavigationType getType() {
    return type;
  }

  public void setType(NavigationType type) {
    this.type = type;
  }
}
