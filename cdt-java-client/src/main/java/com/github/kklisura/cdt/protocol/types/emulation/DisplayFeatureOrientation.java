package com.github.kklisura.cdt.protocol.types.emulation;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Orientation of a display feature in relation to screen */
public enum DisplayFeatureOrientation {
  @JsonProperty("vertical")
  VERTICAL,
  @JsonProperty("horizontal")
  HORIZONTAL
}
