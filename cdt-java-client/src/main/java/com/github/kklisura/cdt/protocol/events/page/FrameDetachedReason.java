package com.github.kklisura.cdt.protocol.events.page;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FrameDetachedReason {
  @JsonProperty("remove")
  REMOVE,
  @JsonProperty("swap")
  SWAP
}
