package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CrossOriginOpenerPolicyValue {
  @JsonProperty("SameOrigin")
  SAME_ORIGIN,
  @JsonProperty("SameOriginAllowPopups")
  SAME_ORIGIN_ALLOW_POPUPS,
  @JsonProperty("RestrictProperties")
  RESTRICT_PROPERTIES,
  @JsonProperty("UnsafeNone")
  UNSAFE_NONE,
  @JsonProperty("SameOriginPlusCoep")
  SAME_ORIGIN_PLUS_COEP,
  @JsonProperty("RestrictPropertiesPlusCoep")
  RESTRICT_PROPERTIES_PLUS_COEP
}
