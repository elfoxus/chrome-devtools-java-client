package com.github.kklisura.cdt.protocol.events.performancetimeline;

import com.github.kklisura.cdt.protocol.types.performancetimeline.TimelineEvent;

/** Sent when a performance timeline event is added. See reportPerformanceTimeline method. */
public class TimelineEventAdded {

  private TimelineEvent event;

  public TimelineEvent getEvent() {
    return event;
  }

  public void setEvent(TimelineEvent event) {
    this.event = event;
  }
}
