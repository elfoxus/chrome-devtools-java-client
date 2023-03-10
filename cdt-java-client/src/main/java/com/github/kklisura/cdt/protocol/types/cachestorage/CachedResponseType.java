package com.github.kklisura.cdt.protocol.types.cachestorage;

import com.fasterxml.jackson.annotation.JsonProperty;

/** type of HTTP response cached */
public enum CachedResponseType {
  @JsonProperty("basic")
  BASIC,
  @JsonProperty("cors")
  CORS,
  @JsonProperty("default")
  DEFAULT,
  @JsonProperty("error")
  ERROR,
  @JsonProperty("opaqueResponse")
  OPAQUE_RESPONSE,
  @JsonProperty("opaqueRedirect")
  OPAQUE_REDIRECT
}
