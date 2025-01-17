package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The underlying connection technology that the browser is supposedly using. */
public enum ConnectionType {
  @JsonProperty("none")
  NONE,
  @JsonProperty("cellular2g")
  CELLULAR_2G,
  @JsonProperty("cellular3g")
  CELLULAR_3G,
  @JsonProperty("cellular4g")
  CELLULAR_4G,
  @JsonProperty("bluetooth")
  BLUETOOTH,
  @JsonProperty("ethernet")
  ETHERNET,
  @JsonProperty("wifi")
  WIFI,
  @JsonProperty("wimax")
  WIMAX,
  @JsonProperty("other")
  OTHER
}
