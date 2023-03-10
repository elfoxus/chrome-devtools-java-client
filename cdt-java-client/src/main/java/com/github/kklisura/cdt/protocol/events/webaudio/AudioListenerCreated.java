package com.github.kklisura.cdt.protocol.events.webaudio;

import com.github.kklisura.cdt.protocol.types.webaudio.AudioListener;

/** Notifies that the construction of an AudioListener has finished. */
public class AudioListenerCreated {

  private AudioListener listener;

  public AudioListener getListener() {
    return listener;
  }

  public void setListener(AudioListener listener) {
    this.listener = listener;
  }
}
