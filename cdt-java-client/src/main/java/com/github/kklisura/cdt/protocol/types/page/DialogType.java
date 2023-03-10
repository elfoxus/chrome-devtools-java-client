package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Javascript dialog type. */
public enum DialogType {
  @JsonProperty("alert")
  ALERT,
  @JsonProperty("confirm")
  CONFIRM,
  @JsonProperty("prompt")
  PROMPT,
  @JsonProperty("beforeunload")
  BEFOREUNLOAD
}
