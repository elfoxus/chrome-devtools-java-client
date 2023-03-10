package com.github.kklisura.cdt.protocol.types.preload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type of preloading attempted. It corresponds to mojom::SpeculationAction (although
 * PrefetchWithSubresources is omitted as it isn't being used by clients).
 */
public enum SpeculationAction {
  @JsonProperty("Prefetch")
  PREFETCH,
  @JsonProperty("Prerender")
  PRERENDER
}
