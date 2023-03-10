package com.github.kklisura.cdt.protocol.events.webaudio;

/** Notifies that an existing BaseAudioContext will be destroyed. */
public class ContextWillBeDestroyed {

  private String contextId;

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }
}
