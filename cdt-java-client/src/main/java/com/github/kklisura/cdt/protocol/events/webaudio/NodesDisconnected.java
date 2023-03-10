package com.github.kklisura.cdt.protocol.events.webaudio;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the
 * outgoing connections from the source are disconnected.
 */
public class NodesDisconnected {

  private String contextId;

  private String sourceId;

  private String destinationId;

  @Optional private Double sourceOutputIndex;

  @Optional private Double destinationInputIndex;

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public Double getSourceOutputIndex() {
    return sourceOutputIndex;
  }

  public void setSourceOutputIndex(Double sourceOutputIndex) {
    this.sourceOutputIndex = sourceOutputIndex;
  }

  public Double getDestinationInputIndex() {
    return destinationInputIndex;
  }

  public void setDestinationInputIndex(Double destinationInputIndex) {
    this.destinationInputIndex = destinationInputIndex;
  }
}
