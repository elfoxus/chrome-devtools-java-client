package com.github.kklisura.cdt.protocol.events.media;

import com.github.kklisura.cdt.protocol.types.media.PlayerEvent;
import java.util.List;

/**
 * Send events as a list, allowing them to be batched on the browser for less congestion. If
 * batched, events must ALWAYS be in chronological order.
 */
public class PlayerEventsAdded {

  private String playerId;

  private List<PlayerEvent> events;

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public List<PlayerEvent> getEvents() {
    return events;
  }

  public void setEvents(List<PlayerEvent> events) {
    this.events = events;
  }
}
