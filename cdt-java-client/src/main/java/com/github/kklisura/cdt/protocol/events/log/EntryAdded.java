package com.github.kklisura.cdt.protocol.events.log;

import com.github.kklisura.cdt.protocol.types.log.LogEntry;

/** Issued when new message was logged. */
public class EntryAdded {

  private LogEntry entry;

  /** The entry. */
  public LogEntry getEntry() {
    return entry;
  }

  /** The entry. */
  public void setEntry(LogEntry entry) {
    this.entry = entry;
  }
}
