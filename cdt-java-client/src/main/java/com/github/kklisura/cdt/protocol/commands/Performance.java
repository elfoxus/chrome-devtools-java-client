package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.performance.Metrics;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import com.github.kklisura.cdt.protocol.types.performance.EnableTimeDomain;
import com.github.kklisura.cdt.protocol.types.performance.Metric;
import com.github.kklisura.cdt.protocol.types.performance.SetTimeDomainTimeDomain;
import java.util.List;

public interface Performance {

  /** Disable collecting and reporting metrics. */
  void disable();

  /** Enable collecting and reporting metrics. */
  void enable();

  /**
   * Enable collecting and reporting metrics.
   *
   * @param timeDomain Time domain to use for collecting and reporting duration metrics.
   */
  void enable(@Optional @ParamName("timeDomain") EnableTimeDomain timeDomain);

  /**
   * Sets time domain to use for collecting and reporting duration metrics. Note that this must be
   * called before enabling metrics collection. Calling this method while metrics collection is
   * enabled returns an error.
   *
   * @param timeDomain Time domain
   */
  @Deprecated
  @Experimental
  void setTimeDomain(@ParamName("timeDomain") SetTimeDomainTimeDomain timeDomain);

  /** Retrieve current values of run-time metrics. */
  @Returns("metrics")
  @ReturnTypeParameter(Metric.class)
  List<Metric> getMetrics();

  /** Current values of the metrics. */
  @EventName("metrics")
  EventListener onMetrics(EventHandler<Metrics> eventListener);
}
