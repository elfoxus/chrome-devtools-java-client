package com.github.kklisura.cdt.protocol.events.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Pause reason. */
public enum PausedReason {
  @JsonProperty("ambiguous")
  AMBIGUOUS,
  @JsonProperty("assert")
  ASSERT,
  @JsonProperty("CSPViolation")
  CSP_VIOLATION,
  @JsonProperty("debugCommand")
  DEBUG_COMMAND,
  @JsonProperty("DOM")
  DOM,
  @JsonProperty("EventListener")
  EVENT_LISTENER,
  @JsonProperty("exception")
  EXCEPTION,
  @JsonProperty("instrumentation")
  INSTRUMENTATION,
  @JsonProperty("OOM")
  OOM,
  @JsonProperty("other")
  OTHER,
  @JsonProperty("promiseRejection")
  PROMISE_REJECTION,
  @JsonProperty("XHR")
  XHR
}
