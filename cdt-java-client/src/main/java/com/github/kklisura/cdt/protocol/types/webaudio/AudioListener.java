package com.github.kklisura.cdt.protocol.types.webaudio;

/** Protocol object for AudioListener */
public class AudioListener {

  private String listenerId;

  private String contextId;

  public String getListenerId() {
    return listenerId;
  }

  public void setListenerId(String listenerId) {
    this.listenerId = listenerId;
  }

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }
}
