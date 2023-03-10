package com.github.kklisura.cdt.protocol.events.webaudio;

import com.github.kklisura.cdt.protocol.types.webaudio.BaseAudioContext;

/** Notifies that existing BaseAudioContext has changed some properties (id stays the same).. */
public class ContextChanged {

  private BaseAudioContext context;

  public BaseAudioContext getContext() {
    return context;
  }

  public void setContext(BaseAudioContext context) {
    this.context = context;
  }
}
