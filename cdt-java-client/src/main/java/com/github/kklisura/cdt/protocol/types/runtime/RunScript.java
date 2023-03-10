package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class RunScript {

  private RemoteObject result;

  @Optional private ExceptionDetails exceptionDetails;

  /** Run result. */
  public RemoteObject getResult() {
    return result;
  }

  /** Run result. */
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
