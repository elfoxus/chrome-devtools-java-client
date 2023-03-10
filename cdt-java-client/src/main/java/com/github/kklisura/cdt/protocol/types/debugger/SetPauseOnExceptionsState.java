package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Pause on exceptions mode. */
public enum SetPauseOnExceptionsState {
  @JsonProperty("none")
  NONE,
  @JsonProperty("caught")
  CAUGHT,
  @JsonProperty("uncaught")
  UNCAUGHT,
  @JsonProperty("all")
  ALL
}
