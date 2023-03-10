package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OriginTrialUsageRestriction {
  @JsonProperty("None")
  NONE,
  @JsonProperty("Subset")
  SUBSET
}
