package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Fired once when parsing the .wbn file has failed. */
@Experimental
public class SubresourceWebBundleMetadataError {

  private String requestId;

  private String errorMessage;

  /** Request identifier. Used to match this information to another event. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. Used to match this information to another event. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Error message */
  public String getErrorMessage() {
    return errorMessage;
  }

  /** Error message */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
