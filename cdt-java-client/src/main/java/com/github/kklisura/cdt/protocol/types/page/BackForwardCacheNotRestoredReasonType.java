package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Types of not restored reasons for back-forward cache. */
public enum BackForwardCacheNotRestoredReasonType {
  @JsonProperty("SupportPending")
  SUPPORT_PENDING,
  @JsonProperty("PageSupportNeeded")
  PAGE_SUPPORT_NEEDED,
  @JsonProperty("Circumstantial")
  CIRCUMSTANTIAL
}
