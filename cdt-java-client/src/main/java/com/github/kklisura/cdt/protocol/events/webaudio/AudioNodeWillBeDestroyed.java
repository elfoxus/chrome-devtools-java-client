package com.github.kklisura.cdt.protocol.events.webaudio;

/** Notifies that an existing AudioNode has been destroyed. */
public class AudioNodeWillBeDestroyed {

  private String contextId;

  private String nodeId;

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }
}
