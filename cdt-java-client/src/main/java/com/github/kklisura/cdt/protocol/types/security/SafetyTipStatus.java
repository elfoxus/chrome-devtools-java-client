package com.github.kklisura.cdt.protocol.types.security;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SafetyTipStatus {
  @JsonProperty("badReputation")
  BAD_REPUTATION,
  @JsonProperty("lookalike")
  LOOKALIKE
}
