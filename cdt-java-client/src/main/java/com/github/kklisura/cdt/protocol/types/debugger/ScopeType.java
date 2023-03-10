package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Scope type. */
public enum ScopeType {
  @JsonProperty("global")
  GLOBAL,
  @JsonProperty("local")
  LOCAL,
  @JsonProperty("with")
  WITH,
  @JsonProperty("closure")
  CLOSURE,
  @JsonProperty("catch")
  CATCH,
  @JsonProperty("block")
  BLOCK,
  @JsonProperty("script")
  SCRIPT,
  @JsonProperty("eval")
  EVAL,
  @JsonProperty("module")
  MODULE,
  @JsonProperty("wasm-expression-stack")
  WASM_EXPRESSION_STACK
}
