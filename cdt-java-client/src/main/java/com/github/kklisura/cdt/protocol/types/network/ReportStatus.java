package com.github.kklisura.cdt.protocol.types.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of a Reporting API report. */
public enum ReportStatus {
  @JsonProperty("Queued")
  QUEUED,
  @JsonProperty("Pending")
  PENDING,
  @JsonProperty("MarkedForRemoval")
  MARKED_FOR_REMOVAL,
  @JsonProperty("Success")
  SUCCESS
}
