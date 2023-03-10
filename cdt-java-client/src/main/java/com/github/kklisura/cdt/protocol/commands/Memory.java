package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.types.memory.DOMCounters;
import com.github.kklisura.cdt.protocol.types.memory.PressureLevel;
import com.github.kklisura.cdt.protocol.types.memory.SamplingProfile;

@Experimental
public interface Memory {

  DOMCounters getDOMCounters();

  void prepareForLeakDetection();

  /** Simulate OomIntervention by purging V8 memory. */
  void forciblyPurgeJavaScriptMemory();

  /**
   * Enable/disable suppressing memory pressure notifications in all processes.
   *
   * @param suppressed If true, memory pressure notifications will be suppressed.
   */
  void setPressureNotificationsSuppressed(@ParamName("suppressed") Boolean suppressed);

  /**
   * Simulate a memory pressure notification in all processes.
   *
   * @param level Memory pressure level of the notification.
   */
  void simulatePressureNotification(@ParamName("level") PressureLevel level);

  /** Start collecting native memory profile. */
  void startSampling();

  /**
   * Start collecting native memory profile.
   *
   * @param samplingInterval Average number of bytes between samples.
   * @param suppressRandomness Do not randomize intervals between samples.
   */
  void startSampling(
      @Optional @ParamName("samplingInterval") Integer samplingInterval,
      @Optional @ParamName("suppressRandomness") Boolean suppressRandomness);

  /** Stop collecting native memory profile. */
  void stopSampling();

  /** Retrieve native memory allocations profile collected since renderer process startup. */
  @Returns("profile")
  SamplingProfile getAllTimeSamplingProfile();

  /** Retrieve native memory allocations profile collected since browser process startup. */
  @Returns("profile")
  SamplingProfile getBrowserSamplingProfile();

  /** Retrieve native memory allocations profile collected since last `startSampling` call. */
  @Returns("profile")
  SamplingProfile getSamplingProfile();
}
