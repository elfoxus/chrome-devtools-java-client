package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Status for an Origin Trial. */
public enum OriginTrialStatus {
  @JsonProperty("Enabled")
  ENABLED,
  @JsonProperty("ValidTokenNotProvided")
  VALID_TOKEN_NOT_PROVIDED,
  @JsonProperty("OSNotSupported")
  OS_NOT_SUPPORTED,
  @JsonProperty("TrialNotAllowed")
  TRIAL_NOT_ALLOWED
}
