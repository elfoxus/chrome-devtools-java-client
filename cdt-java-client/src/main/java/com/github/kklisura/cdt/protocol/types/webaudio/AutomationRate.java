package com.github.kklisura.cdt.protocol.types.webaudio;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of AudioParam::AutomationRate from the spec */
public enum AutomationRate {
  @JsonProperty("a-rate")
  A_RATE,
  @JsonProperty("k-rate")
  K_RATE
}
