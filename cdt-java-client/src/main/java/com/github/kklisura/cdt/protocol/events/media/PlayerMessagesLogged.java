package com.github.kklisura.cdt.protocol.events.media;

import com.github.kklisura.cdt.protocol.types.media.PlayerMessage;
import java.util.List;

/** Send a list of any messages that need to be delivered. */
public class PlayerMessagesLogged {

  private String playerId;

  private List<PlayerMessage> messages;

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public List<PlayerMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<PlayerMessage> messages) {
    this.messages = messages;
  }
}
