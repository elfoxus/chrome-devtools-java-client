package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.page.ScreencastFrameMetadata;

/** Compressed image data requested by the `startScreencast`. */
@Experimental
public class ScreencastFrame {

  private String data;

  private ScreencastFrameMetadata metadata;

  private Integer sessionId;

  /** Base64-encoded compressed image. (Encoded as a base64 string when passed over JSON) */
  public String getData() {
    return data;
  }

  /** Base64-encoded compressed image. (Encoded as a base64 string when passed over JSON) */
  public void setData(String data) {
    this.data = data;
  }

  /** Screencast frame metadata. */
  public ScreencastFrameMetadata getMetadata() {
    return metadata;
  }

  /** Screencast frame metadata. */
  public void setMetadata(ScreencastFrameMetadata metadata) {
    this.metadata = metadata;
  }

  /** Frame number. */
  public Integer getSessionId() {
    return sessionId;
  }

  /** Frame number. */
  public void setSessionId(Integer sessionId) {
    this.sessionId = sessionId;
  }
}
