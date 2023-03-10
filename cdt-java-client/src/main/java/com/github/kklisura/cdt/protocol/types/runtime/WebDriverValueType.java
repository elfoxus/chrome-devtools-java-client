package com.github.kklisura.cdt.protocol.types.runtime;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum WebDriverValueType {
  @JsonProperty("undefined")
  UNDEFINED,
  @JsonProperty("null")
  NULL,
  @JsonProperty("string")
  STRING,
  @JsonProperty("number")
  NUMBER,
  @JsonProperty("boolean")
  BOOLEAN,
  @JsonProperty("bigint")
  BIGINT,
  @JsonProperty("regexp")
  REGEXP,
  @JsonProperty("date")
  DATE,
  @JsonProperty("symbol")
  SYMBOL,
  @JsonProperty("array")
  ARRAY,
  @JsonProperty("object")
  OBJECT,
  @JsonProperty("function")
  FUNCTION,
  @JsonProperty("map")
  MAP,
  @JsonProperty("set")
  SET,
  @JsonProperty("weakmap")
  WEAKMAP,
  @JsonProperty("weakset")
  WEAKSET,
  @JsonProperty("error")
  ERROR,
  @JsonProperty("proxy")
  PROXY,
  @JsonProperty("promise")
  PROMISE,
  @JsonProperty("typedarray")
  TYPEDARRAY,
  @JsonProperty("arraybuffer")
  ARRAYBUFFER,
  @JsonProperty("node")
  NODE,
  @JsonProperty("window")
  WINDOW
}
