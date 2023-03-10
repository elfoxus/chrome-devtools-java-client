package com.github.kklisura.cdt.protocol.types.dom;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Whether to include whitespaces in the children array of returned Nodes. */
public enum EnableIncludeWhitespace {
  @JsonProperty("none")
  NONE,
  @JsonProperty("all")
  ALL
}
