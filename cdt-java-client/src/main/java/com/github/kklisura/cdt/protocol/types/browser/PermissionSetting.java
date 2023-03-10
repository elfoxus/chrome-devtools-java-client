package com.github.kklisura.cdt.protocol.types.browser;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PermissionSetting {
  @JsonProperty("granted")
  GRANTED,
  @JsonProperty("denied")
  DENIED,
  @JsonProperty("prompt")
  PROMPT
}
