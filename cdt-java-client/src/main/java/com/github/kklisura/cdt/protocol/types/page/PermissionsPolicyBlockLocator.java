package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class PermissionsPolicyBlockLocator {

  private String frameId;

  private PermissionsPolicyBlockReason blockReason;

  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public PermissionsPolicyBlockReason getBlockReason() {
    return blockReason;
  }

  public void setBlockReason(PermissionsPolicyBlockReason blockReason) {
    this.blockReason = blockReason;
  }
}
