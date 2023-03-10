package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether the operation was successful or not. Only `Ok` denotes a successful live edit while the
 * other enum variants denote why the live edit failed.
 */
public enum SetScriptSourceStatus {
  @JsonProperty("Ok")
  OK,
  @JsonProperty("CompileError")
  COMPILE_ERROR,
  @JsonProperty("BlockedByActiveGenerator")
  BLOCKED_BY_ACTIVE_GENERATOR,
  @JsonProperty("BlockedByActiveFunction")
  BLOCKED_BY_ACTIVE_FUNCTION,
  @JsonProperty("BlockedByTopLevelEsModuleChange")
  BLOCKED_BY_TOP_LEVEL_ES_MODULE_CHANGE
}
