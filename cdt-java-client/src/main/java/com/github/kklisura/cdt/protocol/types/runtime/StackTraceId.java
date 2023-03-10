package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * If `debuggerId` is set stack trace comes from another debugger and can be resolved there. This
 * allows to track cross-debugger calls. See `Runtime.StackTrace` and `Debugger.paused` for usages.
 */
@Experimental
public class StackTraceId {

  private String id;

  @Optional private String debuggerId;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDebuggerId() {
    return debuggerId;
  }

  public void setDebuggerId(String debuggerId) {
    this.debuggerId = debuggerId;
  }
}
