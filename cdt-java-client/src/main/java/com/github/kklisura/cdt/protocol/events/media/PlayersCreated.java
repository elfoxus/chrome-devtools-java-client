package com.github.kklisura.cdt.protocol.events.media;

import java.util.List;

/**
 * Called whenever a player is created, or when a new agent joins and receives a list of active
 * players. If an agent is restored, it will receive the full list of player ids and all events
 * again.
 */
public class PlayersCreated {

  private List<String> players;

  public List<String> getPlayers() {
    return players;
  }

  public void setPlayers(List<String> players) {
    this.players = players;
  }
}
