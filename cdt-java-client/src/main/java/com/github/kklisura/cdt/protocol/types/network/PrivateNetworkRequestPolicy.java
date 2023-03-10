package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PrivateNetworkRequestPolicy {
  @JsonProperty("Allow")
  ALLOW,
  @JsonProperty("BlockFromInsecureToMorePrivate")
  BLOCK_FROM_INSECURE_TO_MORE_PRIVATE,
  @JsonProperty("WarnFromInsecureToMorePrivate")
  WARN_FROM_INSECURE_TO_MORE_PRIVATE,
  @JsonProperty("PreflightBlock")
  PREFLIGHT_BLOCK,
  @JsonProperty("PreflightWarn")
  PREFLIGHT_WARN
}
