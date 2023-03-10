package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of this initiator. */
public enum InitiatorType {
  @JsonProperty("parser")
  PARSER,
  @JsonProperty("script")
  SCRIPT,
  @JsonProperty("preload")
  PRELOAD,
  @JsonProperty("SignedExchange")
  SIGNED_EXCHANGE,
  @JsonProperty("preflight")
  PREFLIGHT,
  @JsonProperty("other")
  OTHER
}
