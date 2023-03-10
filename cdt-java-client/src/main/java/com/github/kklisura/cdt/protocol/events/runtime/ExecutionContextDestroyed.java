package com.github.kklisura.cdt.protocol.events.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Issued when execution context is destroyed. */
public class ExecutionContextDestroyed {

  @Deprecated private Integer executionContextId;

  @Experimental private String executionContextUniqueId;

  /** Id of the destroyed context */
  public Integer getExecutionContextId() {
    return executionContextId;
  }

  /** Id of the destroyed context */
  public void setExecutionContextId(Integer executionContextId) {
    this.executionContextId = executionContextId;
  }

  /** Unique Id of the destroyed context */
  public String getExecutionContextUniqueId() {
    return executionContextUniqueId;
  }

  /** Unique Id of the destroyed context */
  public void setExecutionContextUniqueId(String executionContextUniqueId) {
    this.executionContextUniqueId = executionContextUniqueId;
  }
}
