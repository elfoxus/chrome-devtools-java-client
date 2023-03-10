package com.github.kklisura.cdt.protocol.types.input;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Pointer type (default: "mouse"). */
public enum DispatchMouseEventPointerType {
  @JsonProperty("mouse")
  MOUSE,
  @JsonProperty("pen")
  PEN
}
