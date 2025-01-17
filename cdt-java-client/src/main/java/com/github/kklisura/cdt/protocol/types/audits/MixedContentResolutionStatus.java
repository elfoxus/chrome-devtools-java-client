package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MixedContentResolutionStatus {
  @JsonProperty("MixedContentBlocked")
  MIXED_CONTENT_BLOCKED,
  @JsonProperty("MixedContentAutomaticallyUpgraded")
  MIXED_CONTENT_AUTOMATICALLY_UPGRADED,
  @JsonProperty("MixedContentWarning")
  MIXED_CONTENT_WARNING
}
