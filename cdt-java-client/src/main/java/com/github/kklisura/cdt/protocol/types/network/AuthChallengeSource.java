package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Source of the authentication challenge. */
public enum AuthChallengeSource {
  @JsonProperty("Server")
  SERVER,
  @JsonProperty("Proxy")
  PROXY
}
