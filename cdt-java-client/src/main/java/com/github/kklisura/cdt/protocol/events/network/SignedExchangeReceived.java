package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.network.SignedExchangeInfo;

/** Fired when a signed exchange was received over the network */
@Experimental
public class SignedExchangeReceived {

  private String requestId;

  private SignedExchangeInfo info;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Information about the signed exchange response. */
  public SignedExchangeInfo getInfo() {
    return info;
  }

  /** Information about the signed exchange response. */
  public void setInfo(SignedExchangeInfo info) {
    this.info = info;
  }
}
