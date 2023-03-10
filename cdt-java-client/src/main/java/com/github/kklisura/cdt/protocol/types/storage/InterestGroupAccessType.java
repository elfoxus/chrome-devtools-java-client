package com.github.kklisura.cdt.protocol.types.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of interest group access types. */
public enum InterestGroupAccessType {
  @JsonProperty("join")
  JOIN,
  @JsonProperty("leave")
  LEAVE,
  @JsonProperty("update")
  UPDATE,
  @JsonProperty("loaded")
  LOADED,
  @JsonProperty("bid")
  BID,
  @JsonProperty("win")
  WIN
}
