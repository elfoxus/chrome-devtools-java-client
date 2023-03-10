package com.github.kklisura.cdt.protocol.types.audits;

public class HeavyAdIssueDetails {

  private HeavyAdResolutionStatus resolution;

  private HeavyAdReason reason;

  private AffectedFrame frame;

  /** The resolution status, either blocking the content or warning. */
  public HeavyAdResolutionStatus getResolution() {
    return resolution;
  }

  /** The resolution status, either blocking the content or warning. */
  public void setResolution(HeavyAdResolutionStatus resolution) {
    this.resolution = resolution;
  }

  /** The reason the ad was blocked, total network or cpu or peak cpu. */
  public HeavyAdReason getReason() {
    return reason;
  }

  /** The reason the ad was blocked, total network or cpu or peak cpu. */
  public void setReason(HeavyAdReason reason) {
    this.reason = reason;
  }

  /** The frame that was blocked. */
  public AffectedFrame getFrame() {
    return frame;
  }

  /** The frame that was blocked. */
  public void setFrame(AffectedFrame frame) {
    this.frame = frame;
  }
}
