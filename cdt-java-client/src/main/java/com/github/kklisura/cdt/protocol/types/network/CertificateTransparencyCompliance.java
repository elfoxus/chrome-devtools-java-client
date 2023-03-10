package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Whether the request complied with Certificate Transparency policy. */
public enum CertificateTransparencyCompliance {
  @JsonProperty("unknown")
  UNKNOWN,
  @JsonProperty("not-compliant")
  NOT_COMPLIANT,
  @JsonProperty("compliant")
  COMPLIANT
}
