package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.tethering.Accepted;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

/** The Tethering domain defines methods and events for browser port binding. */
@Experimental
public interface Tethering {

  /**
   * Request browser port binding.
   *
   * @param port Port number to bind.
   */
  void bind(@ParamName("port") Integer port);

  /**
   * Request browser port unbinding.
   *
   * @param port Port number to unbind.
   */
  void unbind(@ParamName("port") Integer port);

  /** Informs that port was successfully bound and got a specified connection id. */
  @EventName("accepted")
  EventListener onAccepted(EventHandler<Accepted> eventListener);
}
