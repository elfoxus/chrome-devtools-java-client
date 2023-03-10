package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum HeavyAdReason {
  @JsonProperty("NetworkTotalLimit")
  NETWORK_TOTAL_LIMIT,
  @JsonProperty("CpuTotalLimit")
  CPU_TOTAL_LIMIT,
  @JsonProperty("CpuPeakLimit")
  CPU_PEAK_LIMIT
}
