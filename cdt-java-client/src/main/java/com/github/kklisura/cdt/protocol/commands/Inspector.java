package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.inspector.Detached;
import com.github.kklisura.cdt.protocol.events.inspector.TargetCrashed;
import com.github.kklisura.cdt.protocol.events.inspector.TargetReloadedAfterCrash;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

@Experimental
public interface Inspector {

  /** Disables inspector domain notifications. */
  void disable();

  /** Enables inspector domain notifications. */
  void enable();

  /** Fired when remote debugging connection is about to be terminated. Contains detach reason. */
  @EventName("detached")
  EventListener onDetached(EventHandler<Detached> eventListener);

  /** Fired when debugging target has crashed */
  @EventName("targetCrashed")
  EventListener onTargetCrashed(EventHandler<TargetCrashed> eventListener);

  /** Fired when debugging target has reloaded after crash */
  @EventName("targetReloadedAfterCrash")
  EventListener onTargetReloadedAfterCrash(EventHandler<TargetReloadedAfterCrash> eventListener);
}
