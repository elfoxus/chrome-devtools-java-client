package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The type of a frameNavigated event. */
public enum NavigationType {
  @JsonProperty("Navigation")
  NAVIGATION,
  @JsonProperty("BackForwardCacheRestore")
  BACK_FORWARD_CACHE_RESTORE
}
