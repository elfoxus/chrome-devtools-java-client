package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the cookie's 'Priority' status:
 * https://tools.ietf.org/html/draft-west-cookie-priority-00
 */
public enum CookiePriority {
  @JsonProperty("Low")
  LOW,
  @JsonProperty("Medium")
  MEDIUM,
  @JsonProperty("High")
  HIGH
}
