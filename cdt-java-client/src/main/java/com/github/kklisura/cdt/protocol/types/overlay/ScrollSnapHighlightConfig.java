package com.github.kklisura.cdt.protocol.types.overlay;

public class ScrollSnapHighlightConfig {

  private ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig;

  private Integer nodeId;

  /** A descriptor for the highlight appearance of scroll snap containers. */
  public ScrollSnapContainerHighlightConfig getScrollSnapContainerHighlightConfig() {
    return scrollSnapContainerHighlightConfig;
  }

  /** A descriptor for the highlight appearance of scroll snap containers. */
  public void setScrollSnapContainerHighlightConfig(
      ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig) {
    this.scrollSnapContainerHighlightConfig = scrollSnapContainerHighlightConfig;
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
