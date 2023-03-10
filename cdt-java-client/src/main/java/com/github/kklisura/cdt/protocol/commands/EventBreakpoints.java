package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;

/**
 * EventBreakpoints permits setting breakpoints on particular operations and events in targets that
 * run JavaScript but do not have a DOM. JavaScript execution will stop on these operations as if
 * there was a regular breakpoint set.
 */
@Experimental
public interface EventBreakpoints {

  /**
   * Sets breakpoint on particular native event.
   *
   * @param eventName Instrumentation name to stop on.
   */
  void setInstrumentationBreakpoint(@ParamName("eventName") String eventName);

  /**
   * Removes breakpoint on particular native event.
   *
   * @param eventName Instrumentation name to stop on.
   */
  void removeInstrumentationBreakpoint(@ParamName("eventName") String eventName);
}
