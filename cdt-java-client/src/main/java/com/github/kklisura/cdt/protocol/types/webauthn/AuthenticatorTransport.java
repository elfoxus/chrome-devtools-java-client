package com.github.kklisura.cdt.protocol.types.webauthn;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AuthenticatorTransport {
  @JsonProperty("usb")
  USB,
  @JsonProperty("nfc")
  NFC,
  @JsonProperty("ble")
  BLE,
  @JsonProperty("cable")
  CABLE,
  @JsonProperty("internal")
  INTERNAL
}
