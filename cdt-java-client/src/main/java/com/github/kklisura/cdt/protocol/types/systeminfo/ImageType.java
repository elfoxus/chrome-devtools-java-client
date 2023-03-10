package com.github.kklisura.cdt.protocol.types.systeminfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Image format of a given image. */
public enum ImageType {
  @JsonProperty("jpeg")
  JPEG,
  @JsonProperty("webp")
  WEBP,
  @JsonProperty("unknown")
  UNKNOWN
}
