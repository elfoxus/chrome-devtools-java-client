package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of possible auto-reponse for permisison / prompt dialogs. */
public enum AutoResponseMode {
  @JsonProperty("none")
  NONE,
  @JsonProperty("autoAccept")
  AUTO_ACCEPT,
  @JsonProperty("autoReject")
  AUTO_REJECT,
  @JsonProperty("autoOptOut")
  AUTO_OPT_OUT
}
