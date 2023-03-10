package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum IPAddressSpace {
  @JsonProperty("Local")
  LOCAL,
  @JsonProperty("Private")
  PRIVATE,
  @JsonProperty("Public")
  PUBLIC,
  @JsonProperty("Unknown")
  UNKNOWN
}
