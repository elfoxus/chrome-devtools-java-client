package com.github.kklisura.cdt.protocol.types.performancetimeline;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.Rect;

public class LayoutShiftAttribution {

  private Rect previousRect;

  private Rect currentRect;

  @Optional private Integer nodeId;

  public Rect getPreviousRect() {
    return previousRect;
  }

  public void setPreviousRect(Rect previousRect) {
    this.previousRect = previousRect;
  }

  public Rect getCurrentRect() {
    return currentRect;
  }

  public void setCurrentRect(Rect currentRect) {
    this.currentRect = currentRect;
  }

  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
