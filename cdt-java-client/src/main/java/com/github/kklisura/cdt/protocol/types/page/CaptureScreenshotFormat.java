package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Image compression format (defaults to png). */
public enum CaptureScreenshotFormat {
  @JsonProperty("jpeg")
  JPEG,
  @JsonProperty("png")
  PNG,
  @JsonProperty("webp")
  WEBP
}
