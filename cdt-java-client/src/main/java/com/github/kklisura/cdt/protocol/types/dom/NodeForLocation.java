package com.github.kklisura.cdt.protocol.types.dom;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class NodeForLocation {

  private Integer backendNodeId;

  private String frameId;

  @Optional private Integer nodeId;

  /** Resulting node. */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /** Resulting node. */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }

  /** Frame this node belongs to. */
  public String getFrameId() {
    return frameId;
  }

  /** Frame this node belongs to. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Id of the node at given coordinates, only when enabled and requested document. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Id of the node at given coordinates, only when enabled and requested document. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
