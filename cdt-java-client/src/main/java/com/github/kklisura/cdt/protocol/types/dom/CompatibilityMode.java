package com.github.kklisura.cdt.protocol.types.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Document compatibility mode. */
public enum CompatibilityMode {
  @JsonProperty("QuirksMode")
  QUIRKS_MODE,
  @JsonProperty("LimitedQuirksMode")
  LIMITED_QUIRKS_MODE,
  @JsonProperty("NoQuirksMode")
  NO_QUIRKS_MODE
}
