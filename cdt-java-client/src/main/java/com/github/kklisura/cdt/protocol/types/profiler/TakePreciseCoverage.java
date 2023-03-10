package com.github.kklisura.cdt.protocol.types.profiler;

import java.util.List;

public class TakePreciseCoverage {

  private List<ScriptCoverage> result;

  private Double timestamp;

  /** Coverage data for the current isolate. */
  public List<ScriptCoverage> getResult() {
    return result;
  }

  /** Coverage data for the current isolate. */
  public void setResult(List<ScriptCoverage> result) {
    this.result = result;
  }

  /**
   * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }
}
