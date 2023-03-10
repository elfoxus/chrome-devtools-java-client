package com.github.kklisura.cdt.protocol.types.webaudio;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of AudioContextState from the spec */
public enum ContextState {
  @JsonProperty("suspended")
  SUSPENDED,
  @JsonProperty("running")
  RUNNING,
  @JsonProperty("closed")
  CLOSED
}
