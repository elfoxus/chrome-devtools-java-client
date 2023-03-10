package com.github.kklisura.cdt.protocol.events.overlay;

import com.github.kklisura.cdt.protocol.types.page.Viewport;

/** Fired when user asks to capture screenshot of some area on the page. */
public class ScreenshotRequested {

  private Viewport viewport;

  /** Viewport to capture, in device independent pixels (dip). */
  public Viewport getViewport() {
    return viewport;
  }

  /** Viewport to capture, in device independent pixels (dip). */
  public void setViewport(Viewport viewport) {
    this.viewport = viewport;
  }
}
