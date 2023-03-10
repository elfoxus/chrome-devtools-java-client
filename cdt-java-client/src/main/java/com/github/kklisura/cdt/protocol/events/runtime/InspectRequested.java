package com.github.kklisura.cdt.protocol.events.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.runtime.RemoteObject;
import java.util.Map;

/**
 * Issued when object should be inspected (for example, as a result of inspect() command line API
 * call).
 */
public class InspectRequested {

  private RemoteObject object;

  private Map<String, Object> hints;

  @Experimental @Optional private Integer executionContextId;

  public RemoteObject getObject() {
    return object;
  }

  public void setObject(RemoteObject object) {
    this.object = object;
  }

  public Map<String, Object> getHints() {
    return hints;
  }

  public void setHints(Map<String, Object> hints) {
    this.hints = hints;
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
