package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.backgroundservice.BackgroundServiceEventReceived;
import com.github.kklisura.cdt.protocol.events.backgroundservice.RecordingStateChanged;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import com.github.kklisura.cdt.protocol.types.backgroundservice.ServiceName;

/** Defines events for background web platform features. */
@Experimental
public interface BackgroundService {

  /**
   * Enables event updates for the service.
   *
   * @param service
   */
  void startObserving(@ParamName("service") ServiceName service);

  /**
   * Disables event updates for the service.
   *
   * @param service
   */
  void stopObserving(@ParamName("service") ServiceName service);

  /**
   * Set the recording state for the service.
   *
   * @param shouldRecord
   * @param service
   */
  void setRecording(
      @ParamName("shouldRecord") Boolean shouldRecord, @ParamName("service") ServiceName service);

  /**
   * Clears all stored data for the service.
   *
   * @param service
   */
  void clearEvents(@ParamName("service") ServiceName service);

  /** Called when the recording state for the service has been updated. */
  @EventName("recordingStateChanged")
  EventListener onRecordingStateChanged(EventHandler<RecordingStateChanged> eventListener);

  /**
   * Called with all existing backgroundServiceEvents when enabled, and all new events afterwards if
   * enabled and recording.
   */
  @EventName("backgroundServiceEventReceived")
  EventListener onBackgroundServiceEventReceived(
      EventHandler<BackgroundServiceEventReceived> eventListener);
}
