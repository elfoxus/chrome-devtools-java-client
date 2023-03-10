package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/**
 * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
 */
@Experimental
public class NavigatedWithinDocument {

  private String frameId;

  private String url;

  /** Id of the frame. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Frame's new url. */
  public String getUrl() {
    return url;
  }

  /** Frame's new url. */
  public void setUrl(String url) {
    this.url = url;
  }
}
