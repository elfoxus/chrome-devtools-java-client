package com.github.kklisura.cdt.protocol.events.webaudio;

import com.github.kklisura.cdt.protocol.types.webaudio.AudioParam;

/** Notifies that a new AudioParam has been created. */
public class AudioParamCreated {

  private AudioParam param;

  public AudioParam getParam() {
    return param;
  }

  public void setParam(AudioParam param) {
    this.param = param;
  }
}
