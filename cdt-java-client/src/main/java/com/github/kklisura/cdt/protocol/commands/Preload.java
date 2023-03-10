package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.preload.PrefetchStatusUpdated;
import com.github.kklisura.cdt.protocol.events.preload.PreloadingAttemptSourcesUpdated;
import com.github.kklisura.cdt.protocol.events.preload.PrerenderAttemptCompleted;
import com.github.kklisura.cdt.protocol.events.preload.PrerenderStatusUpdated;
import com.github.kklisura.cdt.protocol.events.preload.RuleSetRemoved;
import com.github.kklisura.cdt.protocol.events.preload.RuleSetUpdated;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

@Experimental
public interface Preload {

  void enable();

  void disable();

  /** Upsert. Currently, it is only emitted when a rule set added. */
  @EventName("ruleSetUpdated")
  EventListener onRuleSetUpdated(EventHandler<RuleSetUpdated> eventListener);

  @EventName("ruleSetRemoved")
  EventListener onRuleSetRemoved(EventHandler<RuleSetRemoved> eventListener);

  /** Fired when a prerender attempt is completed. */
  @EventName("prerenderAttemptCompleted")
  EventListener onPrerenderAttemptCompleted(EventHandler<PrerenderAttemptCompleted> eventListener);

  /** Fired when a prefetch attempt is updated. */
  @EventName("prefetchStatusUpdated")
  EventListener onPrefetchStatusUpdated(EventHandler<PrefetchStatusUpdated> eventListener);

  /** Fired when a prerender attempt is updated. */
  @EventName("prerenderStatusUpdated")
  EventListener onPrerenderStatusUpdated(EventHandler<PrerenderStatusUpdated> eventListener);

  /** Send a list of sources for all preloading attempts. */
  @EventName("preloadingAttemptSourcesUpdated")
  EventListener onPreloadingAttemptSourcesUpdated(
      EventHandler<PreloadingAttemptSourcesUpdated> eventListener);
}
