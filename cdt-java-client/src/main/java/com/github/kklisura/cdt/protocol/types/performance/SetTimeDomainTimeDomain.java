package com.github.kklisura.cdt.protocol.types.performance;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Time domain */
public enum SetTimeDomainTimeDomain {
  @JsonProperty("timeTicks")
  TIME_TICKS,
  @JsonProperty("threadTicks")
  THREAD_TICKS
}
