package com.github.kklisura.cdt.protocol.events.preload;

import com.github.kklisura.cdt.protocol.types.preload.PreloadingStatus;

/** Fired when a prefetch attempt is updated. */
public class PrefetchStatusUpdated {

  private String initiatingFrameId;

  private String prefetchUrl;

  private PreloadingStatus status;

  /** The frame id of the frame initiating prefetch. */
  public String getInitiatingFrameId() {
    return initiatingFrameId;
  }

  /** The frame id of the frame initiating prefetch. */
  public void setInitiatingFrameId(String initiatingFrameId) {
    this.initiatingFrameId = initiatingFrameId;
  }

  public String getPrefetchUrl() {
    return prefetchUrl;
  }

  public void setPrefetchUrl(String prefetchUrl) {
    this.prefetchUrl = prefetchUrl;
  }

  public PreloadingStatus getStatus() {
    return status;
  }

  public void setStatus(PreloadingStatus status) {
    this.status = status;
  }
}
