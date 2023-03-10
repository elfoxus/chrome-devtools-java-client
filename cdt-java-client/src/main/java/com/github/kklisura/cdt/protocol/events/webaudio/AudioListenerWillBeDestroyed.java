package com.github.kklisura.cdt.protocol.events.webaudio;

/** Notifies that a new AudioListener has been created. */
public class AudioListenerWillBeDestroyed {

  private String contextId;

  private String listenerId;

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }
}
