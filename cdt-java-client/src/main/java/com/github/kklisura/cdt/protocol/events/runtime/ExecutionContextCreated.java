package com.github.kklisura.cdt.protocol.events.runtime;

import com.github.kklisura.cdt.protocol.types.runtime.ExecutionContextDescription;

/** Issued when new execution context is created. */
public class ExecutionContextCreated {

  private ExecutionContextDescription context;

  /** A newly created execution context. */
  public ExecutionContextDescription getContext() {
    return context;
  }

  /** A newly created execution context. */
  public void setContext(ExecutionContextDescription context) {
    this.context = context;
  }
}
