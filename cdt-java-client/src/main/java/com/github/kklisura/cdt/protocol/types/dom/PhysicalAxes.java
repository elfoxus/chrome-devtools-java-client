package com.github.kklisura.cdt.protocol.types.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

/** ContainerSelector physical axes */
public enum PhysicalAxes {
  @JsonProperty("Horizontal")
  HORIZONTAL,
  @JsonProperty("Vertical")
  VERTICAL,
  @JsonProperty("Both")
  BOTH
}
