package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Origin Trial(https://www.chromium.org/blink/origin-trials) support. Status for an Origin Trial
 * token.
 */
public enum OriginTrialTokenStatus {
  @JsonProperty("Success")
  SUCCESS,
  @JsonProperty("NotSupported")
  NOT_SUPPORTED,
  @JsonProperty("Insecure")
  INSECURE,
  @JsonProperty("Expired")
  EXPIRED,
  @JsonProperty("WrongOrigin")
  WRONG_ORIGIN,
  @JsonProperty("InvalidSignature")
  INVALID_SIGNATURE,
  @JsonProperty("Malformed")
  MALFORMED,
  @JsonProperty("WrongVersion")
  WRONG_VERSION,
  @JsonProperty("FeatureDisabled")
  FEATURE_DISABLED,
  @JsonProperty("TokenDisabled")
  TOKEN_DISABLED,
  @JsonProperty("FeatureDisabledForUser")
  FEATURE_DISABLED_FOR_USER,
  @JsonProperty("UnknownTrial")
  UNKNOWN_TRIAL
}
