package com.github.kklisura.cdt.protocol.types.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of shared storage access types. */
public enum SharedStorageAccessType {
  @JsonProperty("documentAddModule")
  DOCUMENT_ADD_MODULE,
  @JsonProperty("documentSelectURL")
  DOCUMENT_SELECT_URL,
  @JsonProperty("documentRun")
  DOCUMENT_RUN,
  @JsonProperty("documentSet")
  DOCUMENT_SET,
  @JsonProperty("documentAppend")
  DOCUMENT_APPEND,
  @JsonProperty("documentDelete")
  DOCUMENT_DELETE,
  @JsonProperty("documentClear")
  DOCUMENT_CLEAR,
  @JsonProperty("workletSet")
  WORKLET_SET,
  @JsonProperty("workletAppend")
  WORKLET_APPEND,
  @JsonProperty("workletDelete")
  WORKLET_DELETE,
  @JsonProperty("workletClear")
  WORKLET_CLEAR,
  @JsonProperty("workletGet")
  WORKLET_GET,
  @JsonProperty("workletKeys")
  WORKLET_KEYS,
  @JsonProperty("workletEntries")
  WORKLET_ENTRIES,
  @JsonProperty("workletLength")
  WORKLET_LENGTH,
  @JsonProperty("workletRemainingBudget")
  WORKLET_REMAINING_BUDGET
}
