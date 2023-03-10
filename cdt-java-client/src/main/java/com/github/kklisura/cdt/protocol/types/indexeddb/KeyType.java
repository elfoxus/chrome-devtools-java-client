package com.github.kklisura.cdt.protocol.types.indexeddb;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Key type. */
public enum KeyType {
  @JsonProperty("number")
  NUMBER,
  @JsonProperty("string")
  STRING,
  @JsonProperty("date")
  DATE,
  @JsonProperty("array")
  ARRAY
}
