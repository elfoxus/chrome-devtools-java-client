package com.github.kklisura.cdt.protocol.types.webaudio;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of AudioNode::ChannelInterpretation from the spec */
public enum ChannelInterpretation {
  @JsonProperty("discrete")
  DISCRETE,
  @JsonProperty("speakers")
  SPEAKERS
}
