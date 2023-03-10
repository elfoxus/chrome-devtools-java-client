package com.github.kklisura.cdt.protocol.events.serviceworker;

import com.github.kklisura.cdt.protocol.types.serviceworker.ServiceWorkerVersion;
import java.util.List;

public class WorkerVersionUpdated {

  private List<ServiceWorkerVersion> versions;

  public List<ServiceWorkerVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<ServiceWorkerVersion> versions) {
    this.versions = versions;
  }
}
