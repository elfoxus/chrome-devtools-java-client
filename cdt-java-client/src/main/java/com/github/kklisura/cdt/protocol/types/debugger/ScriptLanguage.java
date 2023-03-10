package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of possible script languages. */
public enum ScriptLanguage {
  @JsonProperty("JavaScript")
  JAVA_SCRIPT,
  @JsonProperty("WebAssembly")
  WEB_ASSEMBLY
}
