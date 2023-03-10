package com.github.kklisura.cdt.protocol.events.dom;

import com.github.kklisura.cdt.protocol.types.dom.Node;

/** Mirrors `DOMNodeInserted` event. */
public class ChildNodeInserted {

  private Integer parentNodeId;

  private Integer previousNodeId;

  private Node node;

  /** Id of the node that has changed. */
  public Integer getParentNodeId() {
    return parentNodeId;
  }

  /** Id of the node that has changed. */
  public void setParentNodeId(Integer parentNodeId) {
    this.parentNodeId = parentNodeId;
  }

  /** Id of the previous sibling. */
  public Integer getPreviousNodeId() {
    return previousNodeId;
  }

  /** Id of the previous sibling. */
  public void setPreviousNodeId(Integer previousNodeId) {
    this.previousNodeId = previousNodeId;
  }

  /** Inserted node data. */
  public Node getNode() {
    return node;
  }

  /** Inserted node data. */
  public void setNode(Node node) {
    this.node = node;
  }
}
