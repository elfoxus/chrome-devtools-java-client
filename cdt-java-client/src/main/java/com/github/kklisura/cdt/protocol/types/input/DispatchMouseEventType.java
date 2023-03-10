package com.github.kklisura.cdt.protocol.types.input;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of the mouse event. */
public enum DispatchMouseEventType {
  @JsonProperty("mousePressed")
  MOUSE_PRESSED,
  @JsonProperty("mouseReleased")
  MOUSE_RELEASED,
  @JsonProperty("mouseMoved")
  MOUSE_MOVED,
  @JsonProperty("mouseWheel")
  MOUSE_WHEEL
}
