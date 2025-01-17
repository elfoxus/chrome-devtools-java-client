package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The decision on what to do in response to the authorization challenge. Default means deferring to
 * the default behavior of the net stack, which will likely either the Cancel authentication or
 * display a popup dialog box.
 */
public enum AuthChallengeResponseResponse {
  @JsonProperty("Default")
  DEFAULT,
  @JsonProperty("CancelAuth")
  CANCEL_AUTH,
  @JsonProperty("ProvideCredentials")
  PROVIDE_CREDENTIALS
}
