package com.github.kklisura.cdt.protocol.types.indexeddb;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Key path type. */
public enum KeyPathType {
  @JsonProperty("null")
  NULL,
  @JsonProperty("string")
  STRING,
  @JsonProperty("array")
  ARRAY
}
