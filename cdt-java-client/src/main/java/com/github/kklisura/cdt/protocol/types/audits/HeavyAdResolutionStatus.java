package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HeavyAdResolutionStatus {
  @JsonProperty("HeavyAdBlocked")
  HEAVY_AD_BLOCKED,
  @JsonProperty("HeavyAdWarning")
  HEAVY_AD_WARNING
}
