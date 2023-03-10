package com.github.kklisura.cdt.protocol.types.input;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of the key event. */
public enum DispatchKeyEventType {
  @JsonProperty("keyDown")
  KEY_DOWN,
  @JsonProperty("keyUp")
  KEY_UP,
  @JsonProperty("rawKeyDown")
  RAW_KEY_DOWN,
  @JsonProperty("char")
  CHAR
}
