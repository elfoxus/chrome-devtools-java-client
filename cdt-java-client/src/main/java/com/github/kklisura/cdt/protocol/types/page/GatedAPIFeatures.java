package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GatedAPIFeatures {
  @JsonProperty("SharedArrayBuffers")
  SHARED_ARRAY_BUFFERS,
  @JsonProperty("SharedArrayBuffersTransferAllowed")
  SHARED_ARRAY_BUFFERS_TRANSFER_ALLOWED,
  @JsonProperty("PerformanceMeasureMemory")
  PERFORMANCE_MEASURE_MEMORY,
  @JsonProperty("PerformanceProfile")
  PERFORMANCE_PROFILE
}
