package com.github.kklisura.cdt.protocol.types.overlay;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ColorFormat {
  @JsonProperty("rgb")
  RGB,
  @JsonProperty("hsl")
  HSL,
  @JsonProperty("hwb")
  HWB,
  @JsonProperty("hex")
  HEX
}
