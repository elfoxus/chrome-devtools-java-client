package com.github.kklisura.cdt.protocol.types.runtime;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Object type. */
public enum ObjectPreviewType {
  @JsonProperty("object")
  OBJECT,
  @JsonProperty("function")
  FUNCTION,
  @JsonProperty("undefined")
  UNDEFINED,
  @JsonProperty("string")
  STRING,
  @JsonProperty("number")
  NUMBER,
  @JsonProperty("boolean")
  BOOLEAN,
  @JsonProperty("symbol")
  SYMBOL,
  @JsonProperty("bigint")
  BIGINT
}
