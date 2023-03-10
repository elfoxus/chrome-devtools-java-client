package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.log.EntryAdded;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;
import com.github.kklisura.cdt.protocol.types.log.ViolationSetting;
import java.util.List;

/** Provides access to log entries. */
public interface Log {

  /** Clears the log. */
  void clear();

  /** Disables log domain, prevents further log entries from being reported to the client. */
  void disable();

  /**
   * Enables log domain, sends the entries collected so far to the client by means of the
   * `entryAdded` notification.
   */
  void enable();

  /**
   * start violation reporting.
   *
   * @param config Configuration for violations.
   */
  void startViolationsReport(@ParamName("config") List<ViolationSetting> config);

  /** Stop violation reporting. */
  void stopViolationsReport();

  /** Issued when new message was logged. */
  @EventName("entryAdded")
  EventListener onEntryAdded(EventHandler<EntryAdded> eventListener);
}
