package com.github.kklisura.cdt.protocol.types.serviceworker;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ServiceWorkerVersionStatus {
  @JsonProperty("new")
  NEW,
  @JsonProperty("installing")
  INSTALLING,
  @JsonProperty("installed")
  INSTALLED,
  @JsonProperty("activating")
  ACTIVATING,
  @JsonProperty("activated")
  ACTIVATED,
  @JsonProperty("redundant")
  REDUNDANT
}
