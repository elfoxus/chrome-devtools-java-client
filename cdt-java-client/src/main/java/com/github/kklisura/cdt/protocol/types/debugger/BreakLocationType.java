package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BreakLocationType {
  @JsonProperty("debuggerStatement")
  DEBUGGER_STATEMENT,
  @JsonProperty("call")
  CALL,
  @JsonProperty("return")
  RETURN
}
