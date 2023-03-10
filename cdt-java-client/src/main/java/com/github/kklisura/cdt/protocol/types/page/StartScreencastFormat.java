package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Image compression format. */
public enum StartScreencastFormat {
  @JsonProperty("jpeg")
  JPEG,
  @JsonProperty("png")
  PNG
}
