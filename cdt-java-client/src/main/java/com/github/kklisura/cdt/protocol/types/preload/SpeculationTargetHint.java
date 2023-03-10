package com.github.kklisura.cdt.protocol.types.preload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Corresponds to mojom::SpeculationTargetHint. See
 * https://github.com/WICG/nav-speculation/blob/main/triggers.md#window-name-targeting-hints
 */
public enum SpeculationTargetHint {
  @JsonProperty("Blank")
  BLANK,
  @JsonProperty("Self")
  SELF
}
