package com.github.kklisura.cdt.protocol.events.backgroundservice;

import com.github.kklisura.cdt.protocol.types.backgroundservice.ServiceName;

/** Called when the recording state for the service has been updated. */
public class RecordingStateChanged {

  private Boolean isRecording;

  private ServiceName service;

  public Boolean getIsRecording() {
    return isRecording;
  }

  public void setIsRecording(Boolean isRecording) {
    this.isRecording = isRecording;
  }

  public ServiceName getService() {
    return service;
  }

  public void setService(ServiceName service) {
    this.service = service;
  }
}
