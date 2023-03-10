package com.github.kklisura.cdt.protocol.types.emulation;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Touch/gesture events configuration. Default: current platform. */
public enum SetEmitTouchEventsForMouseConfiguration {
  @JsonProperty("mobile")
  MOBILE,
  @JsonProperty("desktop")
  DESKTOP
}
