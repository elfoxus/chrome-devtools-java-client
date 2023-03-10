package com.github.kklisura.cdt.protocol.types.tracing;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Compression type to use for traces returned via streams. */
public enum StreamCompression {
  @JsonProperty("none")
  NONE,
  @JsonProperty("gzip")
  GZIP
}
