package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SharedArrayBufferIssueType {
  @JsonProperty("TransferIssue")
  TRANSFER_ISSUE,
  @JsonProperty("CreationIssue")
  CREATION_ISSUE
}
