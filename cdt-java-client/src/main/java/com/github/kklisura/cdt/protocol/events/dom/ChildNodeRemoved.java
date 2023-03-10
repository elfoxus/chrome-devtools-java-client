package com.github.kklisura.cdt.protocol.events.dom;

/** Mirrors `DOMNodeRemoved` event. */
public class ChildNodeRemoved {

  private Integer parentNodeId;

  private Integer nodeId;

  /** Parent id. */
  public Integer getParentNodeId() {
    return parentNodeId;
  }

  /** Parent id. */
  public void setParentNodeId(Integer parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  /** Id of the node that has been removed. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Id of the node that has been removed. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
