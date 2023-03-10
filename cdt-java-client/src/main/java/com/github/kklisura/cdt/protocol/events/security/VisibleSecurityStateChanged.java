package com.github.kklisura.cdt.protocol.events.security;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.security.VisibleSecurityState;

/** The security state of the page changed. */
@Experimental
public class VisibleSecurityStateChanged {

  private VisibleSecurityState visibleSecurityState;

  /** Security state information about the page. */
  public VisibleSecurityState getVisibleSecurityState() {
    return visibleSecurityState;
  }

  /** Security state information about the page. */
  public void setVisibleSecurityState(VisibleSecurityState visibleSecurityState) {
    this.visibleSecurityState = visibleSecurityState;
  }
}
