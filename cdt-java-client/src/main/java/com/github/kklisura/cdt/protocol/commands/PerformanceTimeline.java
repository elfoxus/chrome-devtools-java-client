package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.performancetimeline.TimelineEventAdded;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import java.util.List;

/**
 * Reporting of performance timeline events, as specified in
 * https://w3c.github.io/performance-timeline/#dom-performanceobserver.
 */
@Experimental
public interface PerformanceTimeline {

  /**
   * Previously buffered events would be reported before method returns. See also:
   * timelineEventAdded
   *
   * @param eventTypes The types of event to report, as specified in
   *     https://w3c.github.io/performance-timeline/#dom-performanceentry-entrytype The specified
   *     filter overrides any previous filters, passing empty filter disables recording. Note that
   *     not all types exposed to the web platform are currently supported.
   */
  void enable(@ParamName("eventTypes") List<String> eventTypes);

  /** Sent when a performance timeline event is added. See reportPerformanceTimeline method. */
  @EventName("timelineEventAdded")
  EventListener onTimelineEventAdded(EventHandler<TimelineEventAdded> eventListener);
}
