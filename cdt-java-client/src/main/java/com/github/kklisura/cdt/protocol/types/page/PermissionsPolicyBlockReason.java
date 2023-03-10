package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Reason for a permissions policy feature to be disabled. */
public enum PermissionsPolicyBlockReason {
  @JsonProperty("Header")
  HEADER,
  @JsonProperty("IframeAttribute")
  IFRAME_ATTRIBUTE,
  @JsonProperty("InFencedFrameTree")
  IN_FENCED_FRAME_TREE,
  @JsonProperty("InIsolatedApp")
  IN_ISOLATED_APP
}
