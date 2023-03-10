package com.github.kklisura.cdt.protocol.types.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MouseButton {
  @JsonProperty("none")
  NONE,
  @JsonProperty("left")
  LEFT,
  @JsonProperty("middle")
  MIDDLE,
  @JsonProperty("right")
  RIGHT,
  @JsonProperty("back")
  BACK,
  @JsonProperty("forward")
  FORWARD
}
