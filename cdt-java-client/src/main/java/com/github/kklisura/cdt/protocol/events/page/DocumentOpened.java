package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.page.Frame;

/** Fired when opening document to write to. */
@Experimental
public class DocumentOpened {

  private Frame frame;

  /** Frame object. */
  public Frame getFrame() {
    return frame;
  }

  /** Frame object. */
  public void setFrame(Frame frame) {
    this.frame = frame;
  }
}
