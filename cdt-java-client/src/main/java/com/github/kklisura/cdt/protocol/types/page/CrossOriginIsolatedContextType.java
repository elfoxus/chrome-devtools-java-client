package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Indicates whether the frame is cross-origin isolated and why it is the case. */
public enum CrossOriginIsolatedContextType {
  @JsonProperty("Isolated")
  ISOLATED,
  @JsonProperty("NotIsolated")
  NOT_ISOLATED,
  @JsonProperty("NotIsolatedFeatureDisabled")
  NOT_ISOLATED_FEATURE_DISABLED
}
