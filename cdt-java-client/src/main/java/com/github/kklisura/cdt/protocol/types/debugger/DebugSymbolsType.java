package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of the debug symbols. */
public enum DebugSymbolsType {
  @JsonProperty("None")
  NONE,
  @JsonProperty("SourceMap")
  SOURCE_MAP,
  @JsonProperty("EmbeddedDWARF")
  EMBEDDED_DWARF,
  @JsonProperty("ExternalDWARF")
  EXTERNAL_DWARF
}
