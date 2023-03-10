package com.github.kklisura.cdt.protocol.types.emulation;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Orientation type. */
public enum ScreenOrientationType {
  @JsonProperty("portraitPrimary")
  PORTRAIT_PRIMARY,
  @JsonProperty("portraitSecondary")
  PORTRAIT_SECONDARY,
  @JsonProperty("landscapePrimary")
  LANDSCAPE_PRIMARY,
  @JsonProperty("landscapeSecondary")
  LANDSCAPE_SECONDARY
}
