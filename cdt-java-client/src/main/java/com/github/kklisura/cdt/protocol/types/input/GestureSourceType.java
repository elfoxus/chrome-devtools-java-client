package com.github.kklisura.cdt.protocol.types.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GestureSourceType {
  @JsonProperty("default")
  DEFAULT,
  @JsonProperty("touch")
  TOUCH,
  @JsonProperty("mouse")
  MOUSE
}
