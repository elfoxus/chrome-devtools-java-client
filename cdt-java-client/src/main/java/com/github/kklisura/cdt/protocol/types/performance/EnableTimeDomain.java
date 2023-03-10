package com.github.kklisura.cdt.protocol.types.performance;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Time domain to use for collecting and reporting duration metrics. */
public enum EnableTimeDomain {
  @JsonProperty("timeTicks")
  TIME_TICKS,
  @JsonProperty("threadTicks")
  THREAD_TICKS
}
