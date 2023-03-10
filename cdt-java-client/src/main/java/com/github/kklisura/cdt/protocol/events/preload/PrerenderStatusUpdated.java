package com.github.kklisura.cdt.protocol.events.preload;

import com.github.kklisura.cdt.protocol.types.preload.PreloadingStatus;

/** Fired when a prerender attempt is updated. */
public class PrerenderStatusUpdated {

  private String initiatingFrameId;

  private String prerenderingUrl;

  private PreloadingStatus status;

  /** The frame id of the frame initiating prerender. */
  public String getInitiatingFrameId() {
    return initiatingFrameId;
  }

  /** The frame id of the frame initiating prerender. */
  public void setInitiatingFrameId(String initiatingFrameId) {
    this.initiatingFrameId = initiatingFrameId;
  }

  public String getPrerenderingUrl() {
    return prerenderingUrl;
  }

  public void setPrerenderingUrl(String prerenderingUrl) {
    this.prerenderingUrl = prerenderingUrl;
  }

  public PreloadingStatus getStatus() {
    return status;
  }

  public void setStatus(PreloadingStatus status) {
    this.status = status;
  }
}
