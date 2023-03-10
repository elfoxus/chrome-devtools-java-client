package com.github.kklisura.cdt.protocol.types.emulation;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of image types that can be disabled. */
public enum DisabledImageType {
  @JsonProperty("avif")
  AVIF,
  @JsonProperty("webp")
  WEBP
}
