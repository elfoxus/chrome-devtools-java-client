package com.github.kklisura.cdt.protocol.events.profiler;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.profiler.ScriptCoverage;
import java.util.List;

/**
 * Reports coverage delta since the last poll (either from an event like this, or from
 * `takePreciseCoverage` for the current isolate. May only be sent if precise code coverage has been
 * started. This event can be trigged by the embedder to, for example, trigger collection of
 * coverage data immediately at a certain point in time.
 */
@Experimental
public class PreciseCoverageDeltaUpdate {

  private Double timestamp;

  private String occasion;

  private List<ScriptCoverage> result;

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

  /** Identifier for distinguishing coverage events. */
  public String getOccasion() {
    return occasion;
  }

  /** Identifier for distinguishing coverage events. */
  public void setOccasion(String occasion) {
    this.occasion = occasion;
  }

  /** Coverage data for the current isolate. */
  public List<ScriptCoverage> getResult() {
    return result;
  }

  /** Coverage data for the current isolate. */
  public void setResult(List<ScriptCoverage> result) {
    this.result = result;
  }
}
