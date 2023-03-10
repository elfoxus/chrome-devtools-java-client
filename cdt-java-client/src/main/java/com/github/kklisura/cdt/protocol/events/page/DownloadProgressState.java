package com.github.kklisura.cdt.protocol.events.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Download status. */
public enum DownloadProgressState {
  @JsonProperty("inProgress")
  IN_PROGRESS,
  @JsonProperty("completed")
  COMPLETED,
  @JsonProperty("canceled")
  CANCELED
}
