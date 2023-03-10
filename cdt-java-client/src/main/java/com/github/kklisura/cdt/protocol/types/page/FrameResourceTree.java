package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Information about the Frame hierarchy along with their cached resources. */
@Experimental
public class FrameResourceTree {

  private Frame frame;

  @Optional private List<FrameResourceTree> childFrames;

  private List<FrameResource> resources;

  /** Frame information for this tree item. */
  public Frame getFrame() {
    return frame;
  }

  /** Frame information for this tree item. */
  public void setFrame(Frame frame) {
    this.frame = frame;
  }

  /** Child frames. */
  public List<FrameResourceTree> getChildFrames() {
    return childFrames;
  }

  /** Child frames. */
  public void setChildFrames(List<FrameResourceTree> childFrames) {
    this.childFrames = childFrames;
  }

  /** Information about frame resources. */
  public List<FrameResource> getResources() {
    return resources;
  }

  /** Information about frame resources. */
  public void setResources(List<FrameResource> resources) {
    this.resources = resources;
  }
}
