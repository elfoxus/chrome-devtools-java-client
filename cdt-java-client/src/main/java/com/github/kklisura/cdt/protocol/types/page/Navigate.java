package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class Navigate {

  private String frameId;

  @Optional private String loaderId;

  @Optional private String errorText;

  /** Frame id that has navigated (or failed to navigate) */
  public String getFrameId() {
    return frameId;
  }

  /** Frame id that has navigated (or failed to navigate) */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /**
   * Loader identifier. This is omitted in case of same-document navigation, as the previously
   * committed loaderId would not change.
   */
  public String getLoaderId() {
    return loaderId;
  }

  /**
   * Loader identifier. This is omitted in case of same-document navigation, as the previously
   * committed loaderId would not change.
   */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /** User friendly error message, present if and only if navigation has failed. */
  public String getErrorText() {
    return errorText;
  }

  /** User friendly error message, present if and only if navigation has failed. */
  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }
}
