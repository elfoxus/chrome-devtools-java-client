package com.github.kklisura.cdt.protocol.types.overlay;

/** Configurations for Persistent Grid Highlight */
public class GridNodeHighlightConfig {

  private GridHighlightConfig gridHighlightConfig;

  private Integer nodeId;

  /** A descriptor for the highlight appearance. */
  public GridHighlightConfig getGridHighlightConfig() {
    return gridHighlightConfig;
  }

  /** A descriptor for the highlight appearance. */
  public void setGridHighlightConfig(GridHighlightConfig gridHighlightConfig) {
    this.gridHighlightConfig = gridHighlightConfig;
  }

  /** Identifier of the node to highlight. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Identifier of the node to highlight. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
