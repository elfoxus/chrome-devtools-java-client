package com.github.kklisura.cdt.protocol.types.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Shadow root type. */
public enum ShadowRootType {
  @JsonProperty("user-agent")
  USER_AGENT,
  @JsonProperty("open")
  OPEN,
  @JsonProperty("closed")
  CLOSED
}
