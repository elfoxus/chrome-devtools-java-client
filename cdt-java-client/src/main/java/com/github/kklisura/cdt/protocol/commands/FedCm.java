package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.events.fedcm.DialogShown;
import com.github.kklisura.cdt.protocol.support.annotations.EventName;
import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.types.EventHandler;
import com.github.kklisura.cdt.protocol.support.types.EventListener;

/** This domain allows interacting with the FedCM dialog. */
@Experimental
public interface FedCm {

  void enable();

  void disable();

  @EventName("dialogShown")
  EventListener onDialogShown(EventHandler<DialogShown> eventListener);
}
