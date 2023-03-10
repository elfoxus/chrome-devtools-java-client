package com.github.kklisura.cdt.protocol.events.webaudio;

import com.github.kklisura.cdt.protocol.types.webaudio.AudioNode;

/** Notifies that a new AudioNode has been created. */
public class AudioNodeCreated {

  private AudioNode node;

  public AudioNode getNode() {
    return node;
  }

  public void setNode(AudioNode node) {
    this.node = node;
  }
}
