package com.github.kklisura.cdt.protocol.events.media;

import com.github.kklisura.cdt.protocol.types.media.PlayerProperty;
import java.util.List;

/**
 * This can be called multiple times, and can be used to set / override / remove player properties.
 * A null propValue indicates removal.
 */
public class PlayerPropertiesChanged {

  private String playerId;

  private List<PlayerProperty> properties;

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public List<PlayerProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<PlayerProperty> properties) {
    this.properties = properties;
  }
}
