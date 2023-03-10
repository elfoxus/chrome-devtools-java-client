package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.page.ClientNavigationDisposition;
import com.github.kklisura.cdt.protocol.types.page.ClientNavigationReason;

/**
 * Fired when a renderer-initiated navigation is requested. Navigation may still be cancelled after
 * the event is issued.
 */
@Experimental
public class FrameRequestedNavigation {

  private String frameId;

  private ClientNavigationReason reason;

  private String url;

  private ClientNavigationDisposition disposition;

  /** Id of the frame that is being navigated. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that is being navigated. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** The reason for the navigation. */
  public ClientNavigationReason getReason() {
    return reason;
  }

  /** The reason for the navigation. */
  public void setReason(ClientNavigationReason reason) {
    this.reason = reason;
  }

  /** The destination URL for the requested navigation. */
  public String getUrl() {
    return url;
  }

  /** The destination URL for the requested navigation. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** The disposition for the navigation. */
  public ClientNavigationDisposition getDisposition() {
    return disposition;
  }

  /** The disposition for the navigation. */
  public void setDisposition(ClientNavigationDisposition disposition) {
    this.disposition = disposition;
  }
}
