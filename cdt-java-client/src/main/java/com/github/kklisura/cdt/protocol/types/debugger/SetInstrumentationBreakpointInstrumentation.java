package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Instrumentation name. */
public enum SetInstrumentationBreakpointInstrumentation {
  @JsonProperty("beforeScriptExecution")
  BEFORE_SCRIPT_EXECUTION,
  @JsonProperty("beforeScriptWithSourceMapExecution")
  BEFORE_SCRIPT_WITH_SOURCE_MAP_EXECUTION
}
