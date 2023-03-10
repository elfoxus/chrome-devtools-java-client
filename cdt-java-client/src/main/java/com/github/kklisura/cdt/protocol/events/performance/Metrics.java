package com.github.kklisura.cdt.protocol.events.performance;

import com.github.kklisura.cdt.protocol.types.performance.Metric;
import java.util.List;

/** Current values of the metrics. */
public class Metrics {

  private List<Metric> metrics;

  private String title;

  /** Current values of the metrics. */
  public List<Metric> getMetrics() {
    return metrics;
  }

  /** Current values of the metrics. */
  public void setMetrics(List<Metric> metrics) {
    this.metrics = metrics;
  }

  /** Timestamp title. */
  public String getTitle() {
    return title;
  }

  /** Timestamp title. */
  public void setTitle(String title) {
    this.title = title;
  }
}
