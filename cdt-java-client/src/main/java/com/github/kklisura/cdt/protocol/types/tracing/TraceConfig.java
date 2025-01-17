package com.github.kklisura.cdt.protocol.types.tracing;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;
import java.util.Map;

public class TraceConfig {

  @Optional private TraceConfigRecordMode recordMode;

  @Optional private Double traceBufferSizeInKb;

  @Optional private Boolean enableSampling;

  @Optional private Boolean enableSystrace;

  @Optional private Boolean enableArgumentFilter;

  @Optional private List<String> includedCategories;

  @Optional private List<String> excludedCategories;

  @Optional private List<String> syntheticDelays;

  @Optional private Map<String, Object> memoryDumpConfig;

  /** Controls how the trace buffer stores data. */
  public TraceConfigRecordMode getRecordMode() {
    return recordMode;
  }

  /** Controls how the trace buffer stores data. */
  public void setRecordMode(TraceConfigRecordMode recordMode) {
    this.recordMode = recordMode;
  }

  /**
   * Size of the trace buffer in kilobytes. If not specified or zero is passed, a default value of
   * 200 MB would be used.
   */
  public Double getTraceBufferSizeInKb() {
    return traceBufferSizeInKb;
  }

  /**
   * Size of the trace buffer in kilobytes. If not specified or zero is passed, a default value of
   * 200 MB would be used.
   */
  public void setTraceBufferSizeInKb(Double traceBufferSizeInKb) {
    this.traceBufferSizeInKb = traceBufferSizeInKb;
  }

  /** Turns on JavaScript stack sampling. */
  public Boolean getEnableSampling() {
    return enableSampling;
  }

  /** Turns on JavaScript stack sampling. */
  public void setEnableSampling(Boolean enableSampling) {
    this.enableSampling = enableSampling;
  }

  /** Turns on system tracing. */
  public Boolean getEnableSystrace() {
    return enableSystrace;
  }

  /** Turns on system tracing. */
  public void setEnableSystrace(Boolean enableSystrace) {
    this.enableSystrace = enableSystrace;
  }

  /** Turns on argument filter. */
  public Boolean getEnableArgumentFilter() {
    return enableArgumentFilter;
  }

  /** Turns on argument filter. */
  public void setEnableArgumentFilter(Boolean enableArgumentFilter) {
    this.enableArgumentFilter = enableArgumentFilter;
  }

  /** Included category filters. */
  public List<String> getIncludedCategories() {
    return includedCategories;
  }

  /** Included category filters. */
  public void setIncludedCategories(List<String> includedCategories) {
    this.includedCategories = includedCategories;
  }

  /** Excluded category filters. */
  public List<String> getExcludedCategories() {
    return excludedCategories;
  }

  /** Excluded category filters. */
  public void setExcludedCategories(List<String> excludedCategories) {
    this.excludedCategories = excludedCategories;
  }

  /** Configuration to synthesize the delays in tracing. */
  public List<String> getSyntheticDelays() {
    return syntheticDelays;
  }

  /** Configuration to synthesize the delays in tracing. */
  public void setSyntheticDelays(List<String> syntheticDelays) {
    this.syntheticDelays = syntheticDelays;
  }

  /** Configuration for memory dump triggers. Used only when "memory-infra" category is enabled. */
  public Map<String, Object> getMemoryDumpConfig() {
    return memoryDumpConfig;
  }

  /** Configuration for memory dump triggers. Used only when "memory-infra" category is enabled. */
  public void setMemoryDumpConfig(Map<String, Object> memoryDumpConfig) {
    this.memoryDumpConfig = memoryDumpConfig;
  }
}
