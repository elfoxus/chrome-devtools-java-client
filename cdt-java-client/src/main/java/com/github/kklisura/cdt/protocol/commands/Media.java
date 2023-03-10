package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.media.PlayerErrorsRaised;
import com.github.kklisura.cdt.protocol.events.media.PlayerEventsAdded;
import com.github.kklisura.cdt.protocol.events.media.PlayerMessagesLogged;
import com.github.kklisura.cdt.protocol.events.media.PlayerPropertiesChanged;
import com.github.kklisura.cdt.protocol.events.media.PlayersCreated;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

/** This domain allows detailed inspection of media elements */
@Experimental
public interface Media {

  /** Enables the Media domain */
  void enable();

  /** Disables the Media domain. */
  void disable();

  /**
   * This can be called multiple times, and can be used to set / override / remove player
   * properties. A null propValue indicates removal.
   */
  @EventName("playerPropertiesChanged")
  EventListener onPlayerPropertiesChanged(EventHandler<PlayerPropertiesChanged> eventListener);

  /**
   * Send events as a list, allowing them to be batched on the browser for less congestion. If
   * batched, events must ALWAYS be in chronological order.
   */
  @EventName("playerEventsAdded")
  EventListener onPlayerEventsAdded(EventHandler<PlayerEventsAdded> eventListener);

  /** Send a list of any messages that need to be delivered. */
  @EventName("playerMessagesLogged")
  EventListener onPlayerMessagesLogged(EventHandler<PlayerMessagesLogged> eventListener);

  /** Send a list of any errors that need to be delivered. */
  @EventName("playerErrorsRaised")
  EventListener onPlayerErrorsRaised(EventHandler<PlayerErrorsRaised> eventListener);

  /**
   * Called whenever a player is created, or when a new agent joins and receives a list of active
   * players. If an agent is restored, it will receive the full list of player ids and all events
   * again.
   */
  @EventName("playersCreated")
  EventListener onPlayersCreated(EventHandler<PlayersCreated> eventListener);
}
