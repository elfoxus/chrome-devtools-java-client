package com.github.kklisura.cdt.protocol.events.webaudio;

/** Notifies that an existing AudioParam has been destroyed. */
public class AudioParamWillBeDestroyed {

  private String contextId;

  private String nodeId;

  private String paramId;

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

  public String getParamId() {
    return paramId;
  }

  public void setParamId(String paramId) {
    this.paramId = paramId;
  }
}
