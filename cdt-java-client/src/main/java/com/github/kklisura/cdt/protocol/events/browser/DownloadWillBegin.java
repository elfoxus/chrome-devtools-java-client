package com.github.kklisura.cdt.protocol.events.browser;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Fired when page is about to start a download. */
@Experimental
public class DownloadWillBegin {

  private String frameId;

  private String guid;

  private String url;

  private String suggestedFilename;

  /** Id of the frame that caused the download to begin. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame that caused the download to begin. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Global unique identifier of the download. */
  public String getGuid() {
    return guid;
  }

  /** Global unique identifier of the download. */
  public void setGuid(String guid) {
    this.guid = guid;
  }

  /** URL of the resource being downloaded. */
  public String getUrl() {
    return url;
  }

  /** URL of the resource being downloaded. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Suggested file name of the resource (the actual name of the file saved on disk may differ). */
  public String getSuggestedFilename() {
    return suggestedFilename;
  }

  /** Suggested file name of the resource (the actual name of the file saved on disk may differ). */
  public void setSuggestedFilename(String suggestedFilename) {
    this.suggestedFilename = suggestedFilename;
  }
}
