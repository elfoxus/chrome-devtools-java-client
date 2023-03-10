package com.github.kklisura.cdt.protocol.types.webauthn;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AuthenticatorProtocol {
  @JsonProperty("u2f")
  U_2F,
  @JsonProperty("ctap2")
  CTAP_2
}
