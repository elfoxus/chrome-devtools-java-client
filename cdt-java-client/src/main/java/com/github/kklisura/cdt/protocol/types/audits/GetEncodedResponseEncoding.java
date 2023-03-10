package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The encoding to use. */
public enum GetEncodedResponseEncoding {
  @JsonProperty("webp")
  WEBP,
  @JsonProperty("jpeg")
  JPEG,
  @JsonProperty("png")
  PNG
}
