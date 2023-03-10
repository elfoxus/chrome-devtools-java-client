package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Information about the Frame hierarchy. */
public class FrameTree {

  private Frame frame;

  @Optional private List<FrameTree> childFrames;

  /** Frame information for this tree item. */
  public Frame getFrame() {
    return frame;
  }

  /** Frame information for this tree item. */
  public void setFrame(Frame frame) {
    this.frame = frame;
  }

  /** Child frames. */
  public List<FrameTree> getChildFrames() {
    return childFrames;
  }

  /** Child frames. */
  public void setChildFrames(List<FrameTree> childFrames) {
    this.childFrames = childFrames;
  }
}
