package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdFrameExplanation {
  @JsonProperty("ParentIsAd")
  PARENT_IS_AD,
  @JsonProperty("CreatedByAdScript")
  CREATED_BY_AD_SCRIPT,
  @JsonProperty("MatchedBlockingRule")
  MATCHED_BLOCKING_RULE
}
