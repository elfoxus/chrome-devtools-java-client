package com.github.kklisura.cdt.protocol.types.webauthn;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Ctap2Version {
  @JsonProperty("ctap2_0")
  CTAP_2_0,
  @JsonProperty("ctap2_1")
  CTAP_2_1
}
