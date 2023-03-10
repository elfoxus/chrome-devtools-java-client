package com.github.kklisura.cdt.protocol.events.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Notification is issued every time when binding is called. */
@Experimental
public class BindingCalled {

  private String name;

  private String payload;

  private Integer executionContextId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  /** Identifier of the context where the call was made. */
  public Integer getExecutionContextId() {
    return executionContextId;
  }

  /** Identifier of the context where the call was made. */
  public void setExecutionContextId(Integer executionContextId) {
    this.executionContextId = executionContextId;
  }
}
