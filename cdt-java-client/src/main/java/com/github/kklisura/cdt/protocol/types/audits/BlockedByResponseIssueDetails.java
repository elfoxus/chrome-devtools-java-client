package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Details for a request that has been blocked with the BLOCKED_BY_RESPONSE code. Currently only
 * used for COEP/COOP, but may be extended to include some CSP errors in the future.
 */
public class BlockedByResponseIssueDetails {

  private AffectedRequest request;

  @Optional private AffectedFrame parentFrame;

  @Optional private AffectedFrame blockedFrame;

  private BlockedByResponseReason reason;

  public AffectedRequest getRequest() {
    return request;
  }

  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  public AffectedFrame getParentFrame() {
    return parentFrame;
  }

  public void setParentFrame(AffectedFrame parentFrame) {
    this.parentFrame = parentFrame;
  }

  public AffectedFrame getBlockedFrame() {
    return blockedFrame;
  }

  public void setBlockedFrame(AffectedFrame blockedFrame) {
    this.blockedFrame = blockedFrame;
  }

  public BlockedByResponseReason getReason() {
    return reason;
  }

  public void setReason(BlockedByResponseReason reason) {
    this.reason = reason;
  }
}
