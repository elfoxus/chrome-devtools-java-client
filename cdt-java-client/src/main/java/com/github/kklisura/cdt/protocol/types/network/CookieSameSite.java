package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the cookie's 'SameSite' status:
 * https://tools.ietf.org/html/draft-west-first-party-cookies
 */
public enum CookieSameSite {
  @JsonProperty("Strict")
  STRICT,
  @JsonProperty("Lax")
  LAX,
  @JsonProperty("None")
  NONE
}
