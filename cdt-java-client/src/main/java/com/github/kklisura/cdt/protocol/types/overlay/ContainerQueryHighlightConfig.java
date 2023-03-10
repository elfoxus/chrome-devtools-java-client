package com.github.kklisura.cdt.protocol.types.overlay;

public class ContainerQueryHighlightConfig {

  private ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig;

  private Integer nodeId;

  /** A descriptor for the highlight appearance of container query containers. */
  public ContainerQueryContainerHighlightConfig getContainerQueryContainerHighlightConfig() {
    return containerQueryContainerHighlightConfig;
  }

  /** A descriptor for the highlight appearance of container query containers. */
  public void setContainerQueryContainerHighlightConfig(
      ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig) {
    this.containerQueryContainerHighlightConfig = containerQueryContainerHighlightConfig;
  }

  /** Identifier of the container node to highlight. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Identifier of the container node to highlight. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }
}
