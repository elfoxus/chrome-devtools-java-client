package com.github.kklisura.cdt.protocol.events.dom;

/** Fired when `Element`'s attribute is removed. */
public class AttributeRemoved {

  private Integer nodeId;

  private String name;

  /** Id of the node that has changed. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Id of the node that has changed. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  /** A ttribute name. */
  public String getName() {
    return name;
  }

  /** A ttribute name. */
  public void setName(String name) {
    this.name = name;
  }
}
