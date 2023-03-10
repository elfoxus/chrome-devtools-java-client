package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.console.MessageAdded;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

/** This domain is deprecated - use Runtime or Log instead. */
@Deprecated
public interface Console {

  /** Does nothing. */
  void clearMessages();

  /**
   * Disables console domain, prevents further console messages from being reported to the client.
   */
  void disable();

  /**
   * Enables console domain, sends the messages collected so far to the client by means of the
   * `messageAdded` notification.
   */
  void enable();

  /** Issued when new console message is added. */
  @EventName("messageAdded")
  EventListener onMessageAdded(EventHandler<MessageAdded> eventListener);
}
