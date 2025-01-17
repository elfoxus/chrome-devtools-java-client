package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Source of serviceworker response. */
public enum ServiceWorkerResponseSource {
  @JsonProperty("cache-storage")
  CACHE_STORAGE,
  @JsonProperty("http-cache")
  HTTP_CACHE,
  @JsonProperty("fallback-code")
  FALLBACK_CODE,
  @JsonProperty("network")
  NETWORK
}
