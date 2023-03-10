package com.github.kklisura.cdt.protocol.types.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

/** ContainerSelector logical axes */
public enum LogicalAxes {
  @JsonProperty("Inline")
  INLINE,
  @JsonProperty("Block")
  BLOCK,
  @JsonProperty("Both")
  BOTH
}
