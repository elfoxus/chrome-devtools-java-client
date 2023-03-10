package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Target lifecycle state */
public enum SetWebLifecycleStateState {
  @JsonProperty("frozen")
  FROZEN,
  @JsonProperty("active")
  ACTIVE
}
