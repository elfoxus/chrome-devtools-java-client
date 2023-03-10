package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ClientHintIssueReason {
  @JsonProperty("MetaTagAllowListInvalidOrigin")
  META_TAG_ALLOW_LIST_INVALID_ORIGIN,
  @JsonProperty("MetaTagModifiedHTML")
  META_TAG_MODIFIED_HTML
}
