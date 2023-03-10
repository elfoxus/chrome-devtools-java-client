package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/**
 * Fired when download makes progress. Last call has |done| == true. Deprecated. Use
 * Browser.downloadProgress instead.
 */
@Experimental
@Deprecated
public class DownloadProgress {

  private String guid;

  private Double totalBytes;

  private Double receivedBytes;

  private DownloadProgressState state;

  /** Global unique identifier of the download. */
  public String getGuid() {
    return guid;
  }

  /** Global unique identifier of the download. */
  public void setGuid(String guid) {
    this.guid = guid;
  }

  /** Total expected bytes to download. */
  public Double getTotalBytes() {
    return totalBytes;
  }

  /** Total expected bytes to download. */
  public void setTotalBytes(Double totalBytes) {
    this.totalBytes = totalBytes;
  }

  /** Total bytes received. */
  public Double getReceivedBytes() {
    return receivedBytes;
  }

  /** Total bytes received. */
  public void setReceivedBytes(Double receivedBytes) {
    this.receivedBytes = receivedBytes;
  }

  /** Download status. */
  public DownloadProgressState getState() {
    return state;
  }

  /** Download status. */
  public void setState(DownloadProgressState state) {
    this.state = state;
  }
}
