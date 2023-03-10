package com.github.kklisura.cdt.protocol.types.overlay;

public class FlexNodeHighlightConfig {

  private FlexContainerHighlightConfig flexContainerHighlightConfig;

  private Integer nodeId;

  /** A descriptor for the highlight appearance of flex containers. */
  public FlexContainerHighlightConfig getFlexContainerHighlightConfig() {
    return flexContainerHighlightConfig;
  }

  /** A descriptor for the highlight appearance of flex containers. */
  public void setFlexContainerHighlightConfig(
      FlexContainerHighlightConfig flexContainerHighlightConfig) {
    this.flexContainerHighlightConfig = flexContainerHighlightConfig;
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
