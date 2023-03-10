package com.github.kklisura.cdt.protocol.events.deviceaccess;

import com.github.kklisura.cdt.protocol.types.deviceaccess.PromptDevice;
import java.util.List;

/**
 * A device request opened a user prompt to select a device. Respond with the selectPrompt or
 * cancelPrompt command.
 */
public class DeviceRequestPrompted {

  private String id;

  private List<PromptDevice> devices;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<PromptDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<PromptDevice> devices) {
    this.devices = devices;
  }
}
