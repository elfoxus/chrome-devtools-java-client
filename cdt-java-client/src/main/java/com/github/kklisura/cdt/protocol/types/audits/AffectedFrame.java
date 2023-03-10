package com.github.kklisura.cdt.protocol.types.audits;

/** Information about the frame affected by an inspector issue. */
public class AffectedFrame {

  private String frameId;

  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }
}
