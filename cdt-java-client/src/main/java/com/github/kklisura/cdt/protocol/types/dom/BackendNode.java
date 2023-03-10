package com.github.kklisura.cdt.protocol.types.dom;

/** Backend node with a friendly name. */
public class BackendNode {

  private Integer nodeType;

  private String nodeName;

  private Integer backendNodeId;

  /** `Node`'s nodeType. */
  public Integer getNodeType() {
    return nodeType;
  }

  /** `Node`'s nodeType. */
  public void setNodeType(Integer nodeType) {
    this.nodeType = nodeType;
  }

  /** `Node`'s nodeName. */
  public String getNodeName() {
    return nodeName;
  }

  /** `Node`'s nodeName. */
  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }
}
