package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Format (defaults to mhtml). */
public enum CaptureSnapshotFormat {
  @JsonProperty("mhtml")
  MHTML
}
