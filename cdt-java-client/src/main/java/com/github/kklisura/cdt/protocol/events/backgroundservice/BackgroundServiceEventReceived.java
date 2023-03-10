package com.github.kklisura.cdt.protocol.events.backgroundservice;

import com.github.kklisura.cdt.protocol.types.backgroundservice.BackgroundServiceEvent;

/**
 * Called with all existing backgroundServiceEvents when enabled, and all new events afterwards if
 * enabled and recording.
 */
public class BackgroundServiceEventReceived {

  private BackgroundServiceEvent backgroundServiceEvent;

  public BackgroundServiceEvent getBackgroundServiceEvent() {
    return backgroundServiceEvent;
  }

  public void setBackgroundServiceEvent(BackgroundServiceEvent backgroundServiceEvent) {
    this.backgroundServiceEvent = backgroundServiceEvent;
  }
}
