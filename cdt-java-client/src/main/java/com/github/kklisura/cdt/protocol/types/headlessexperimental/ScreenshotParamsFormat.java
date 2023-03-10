package com.github.kklisura.cdt.protocol.types.headlessexperimental;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Image compression format (defaults to png). */
public enum ScreenshotParamsFormat {
  @JsonProperty("jpeg")
  JPEG,
  @JsonProperty("png")
  PNG,
  @JsonProperty("webp")
  WEBP
}
