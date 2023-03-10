package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CrossOriginEmbedderPolicyValue {
  @JsonProperty("None")
  NONE,
  @JsonProperty("Credentialless")
  CREDENTIALLESS,
  @JsonProperty("RequireCorp")
  REQUIRE_CORP
}
