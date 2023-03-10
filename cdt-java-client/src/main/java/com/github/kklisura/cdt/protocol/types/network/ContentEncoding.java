package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** List of content encodings supported by the backend. */
public enum ContentEncoding {
  @JsonProperty("deflate")
  DEFLATE,
  @JsonProperty("gzip")
  GZIP,
  @JsonProperty("br")
  BR
}
