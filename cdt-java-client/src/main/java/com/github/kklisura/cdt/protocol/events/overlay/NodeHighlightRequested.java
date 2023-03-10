package com.github.kklisura.cdt.protocol.events.overlay;

/** Fired when the node should be highlighted. This happens after call to `setInspectMode`. */
public class NodeHighlightRequested {

  private Integer nodeId;

  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
