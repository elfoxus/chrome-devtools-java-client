package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.deviceaccess.DeviceRequestPrompted;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

@Experimental
public interface DeviceAccess {

  /** Enable events in this domain. */
  void enable();

  /** Disable events in this domain. */
  void disable();

  /**
   * Select a device in response to a DeviceAccess.deviceRequestPrompted event.
   *
   * @param id
   * @param deviceId
   */
  void selectPrompt(@ParamName("id") String id, @ParamName("deviceId") String deviceId);

  /**
   * Cancel a prompt in response to a DeviceAccess.deviceRequestPrompted event.
   *
   * @param id
   */
  void cancelPrompt(@ParamName("id") String id);

  /**
   * A device request opened a user prompt to select a device. Respond with the selectPrompt or
   * cancelPrompt command.
   */
  @EventName("deviceRequestPrompted")
  EventListener onDeviceRequestPrompted(EventHandler<DeviceRequestPrompted> eventListener);
}
