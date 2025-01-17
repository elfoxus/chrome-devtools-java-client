package com.github.kklisura.cdt.protocol.types.tracing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether to report trace events as series of dataCollected events or to save trace to a stream
 * (defaults to `ReportEvents`).
 */
public enum StartTransferMode {
  @JsonProperty("ReportEvents")
  REPORT_EVENTS,
  @JsonProperty("ReturnAsStream")
  RETURN_AS_STREAM
}
