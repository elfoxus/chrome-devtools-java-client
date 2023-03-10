package com.github.kklisura.cdt.protocol.types.overlay;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The line pattern (default: solid) */
public enum LineStylePattern {
  @JsonProperty("dashed")
  DASHED,
  @JsonProperty("dotted")
  DOTTED
}
