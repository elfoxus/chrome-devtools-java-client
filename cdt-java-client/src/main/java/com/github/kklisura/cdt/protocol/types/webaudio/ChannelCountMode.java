package com.github.kklisura.cdt.protocol.types.webaudio;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of AudioNode::ChannelCountMode from the spec */
public enum ChannelCountMode {
  @JsonProperty("clamped-max")
  CLAMPED_MAX,
  @JsonProperty("explicit")
  EXPLICIT,
  @JsonProperty("max")
  MAX
}
