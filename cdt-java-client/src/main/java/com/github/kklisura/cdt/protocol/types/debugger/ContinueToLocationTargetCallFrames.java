package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContinueToLocationTargetCallFrames {
  @JsonProperty("any")
  ANY,
  @JsonProperty("current")
  CURRENT
}
