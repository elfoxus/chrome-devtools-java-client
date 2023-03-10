package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.runtime.ExceptionDetails;
import com.github.kklisura.cdt.protocol.types.runtime.RemoteObject;

public class EvaluateOnCallFrame {

  private RemoteObject result;

  @Optional private ExceptionDetails exceptionDetails;

  /** Object wrapper for the evaluation result. */
  public RemoteObject getResult() {
    return result;
  }

  /** Object wrapper for the evaluation result. */
  public void setResult(RemoteObject result) {
    this.result = result;
  }

  /** Exception details. */
  public ExceptionDetails getExceptionDetails() {
    return exceptionDetails;
  }

  /** Exception details. */
  public void setExceptionDetails(ExceptionDetails exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }
}
