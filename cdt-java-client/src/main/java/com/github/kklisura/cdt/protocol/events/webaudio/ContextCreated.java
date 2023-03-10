package com.github.kklisura.cdt.protocol.events.webaudio;

import com.github.kklisura.cdt.protocol.types.webaudio.BaseAudioContext;

/** Notifies that a new BaseAudioContext has been created. */
public class ContextCreated {

  private BaseAudioContext context;

  public BaseAudioContext getContext() {
    return context;
  }

  public void setContext(BaseAudioContext context) {
    this.context = context;
  }
}
