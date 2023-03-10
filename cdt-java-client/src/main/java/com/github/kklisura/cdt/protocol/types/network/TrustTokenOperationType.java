package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrustTokenOperationType {
  @JsonProperty("Issuance")
  ISSUANCE,
  @JsonProperty("Redemption")
  REDEMPTION,
  @JsonProperty("Signing")
  SIGNING
}
