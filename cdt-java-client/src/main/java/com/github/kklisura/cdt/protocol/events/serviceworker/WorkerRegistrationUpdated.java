package com.github.kklisura.cdt.protocol.events.serviceworker;

import com.github.kklisura.cdt.protocol.types.serviceworker.ServiceWorkerRegistration;
import java.util.List;

public class WorkerRegistrationUpdated {

  private List<ServiceWorkerRegistration> registrations;

  public List<ServiceWorkerRegistration> getRegistrations() {
    return registrations;
  }

  public void setRegistrations(List<ServiceWorkerRegistration> registrations) {
    this.registrations = registrations;
  }
}
