package com.github.kklisura.cdt.protocol.types.css;

import java.util.List;

public class TakeCoverageDelta {

  private List<RuleUsage> coverage;

  private Double timestamp;

  public List<RuleUsage> getCoverage() {
    return coverage;
  }

  public void setCoverage(List<RuleUsage> coverage) {
    this.coverage = coverage;
  }

  /** Monotonically increasing time, in seconds. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Monotonically increasing time, in seconds. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
