package com.github.kklisura.cdt.protocol.types.overlay;

public class IsolatedElementHighlightConfig {

  private IsolationModeHighlightConfig isolationModeHighlightConfig;

  private Integer nodeId;

  /** A descriptor for the highlight appearance of an element in isolation mode. */
  public IsolationModeHighlightConfig getIsolationModeHighlightConfig() {
    return isolationModeHighlightConfig;
  }

  /** A descriptor for the highlight appearance of an element in isolation mode. */
  public void setIsolationModeHighlightConfig(
      IsolationModeHighlightConfig isolationModeHighlightConfig) {
    this.isolationModeHighlightConfig = isolationModeHighlightConfig;
  }

  /** Identifier of the isolated element to highlight. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Identifier of the isolated element to highlight. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
