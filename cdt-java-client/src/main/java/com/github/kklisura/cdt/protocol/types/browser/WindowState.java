package com.github.kklisura.cdt.protocol.types.browser;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The state of the browser window. */
public enum WindowState {
  @JsonProperty("normal")
  NORMAL,
  @JsonProperty("minimized")
  MINIMIZED,
  @JsonProperty("maximized")
  MAXIMIZED,
  @JsonProperty("fullscreen")
  FULLSCREEN
}
