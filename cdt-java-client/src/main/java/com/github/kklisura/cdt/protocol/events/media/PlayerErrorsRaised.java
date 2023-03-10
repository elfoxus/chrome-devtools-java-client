package com.github.kklisura.cdt.protocol.events.media;

import com.github.kklisura.cdt.protocol.types.media.PlayerError;
import java.util.List;

/** Send a list of any errors that need to be delivered. */
public class PlayerErrorsRaised {

  private String playerId;

  private List<PlayerError> errors;

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public List<PlayerError> getErrors() {
    return errors;
  }

  public void setErrors(List<PlayerError> errors) {
    this.errors = errors;
  }
}
