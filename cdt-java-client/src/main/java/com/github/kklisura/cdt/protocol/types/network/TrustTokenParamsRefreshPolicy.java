package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Only set for "token-redemption" operation and determine whether to request a fresh SRR or use a
 * still valid cached SRR.
 */
public enum TrustTokenParamsRefreshPolicy {
  @JsonProperty("UseCached")
  USE_CACHED,
  @JsonProperty("Refresh")
  REFRESH
}
