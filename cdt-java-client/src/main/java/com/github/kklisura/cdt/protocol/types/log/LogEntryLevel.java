package com.github.kklisura.cdt.protocol.types.log;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Log entry severity. */
public enum LogEntryLevel {
  @JsonProperty("verbose")
  VERBOSE,
  @JsonProperty("info")
  INFO,
  @JsonProperty("warning")
  WARNING,
  @JsonProperty("error")
  ERROR
}
