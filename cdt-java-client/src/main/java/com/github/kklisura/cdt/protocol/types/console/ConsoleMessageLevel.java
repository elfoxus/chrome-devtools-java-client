package com.github.kklisura.cdt.protocol.types.console;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Message severity. */
public enum ConsoleMessageLevel {
  @JsonProperty("log")
  LOG,
  @JsonProperty("warning")
  WARNING,
  @JsonProperty("error")
  ERROR,
  @JsonProperty("debug")
  DEBUG,
  @JsonProperty("info")
  INFO
}
