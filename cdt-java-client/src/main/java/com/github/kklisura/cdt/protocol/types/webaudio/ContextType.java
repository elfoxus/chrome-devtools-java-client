package com.github.kklisura.cdt.protocol.types.webaudio;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of BaseAudioContext types */
public enum ContextType {
  @JsonProperty("realtime")
  REALTIME,
  @JsonProperty("offline")
  OFFLINE
}
