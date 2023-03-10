package com.github.kklisura.cdt.protocol.events.serviceworker;

import com.github.kklisura.cdt.protocol.types.serviceworker.ServiceWorkerErrorMessage;

public class WorkerErrorReported {

  private ServiceWorkerErrorMessage errorMessage;

  public ServiceWorkerErrorMessage getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(ServiceWorkerErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }
}
