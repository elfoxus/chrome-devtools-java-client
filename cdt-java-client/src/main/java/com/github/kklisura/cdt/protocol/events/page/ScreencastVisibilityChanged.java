package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Fired when the page with currently enabled screencast was shown or hidden `. */
@Experimental
public class ScreencastVisibilityChanged {

  private Boolean visible;

  /** True if the page is visible. */
  public Boolean getVisible() {
    return visible;
  }

  /** True if the page is visible. */
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }
}
