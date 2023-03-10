package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Information about a request that is affected by an inspector issue. */
public class AffectedRequest {

  private String requestId;

  @Optional private String url;

  /** The unique request id. */
  public String getRequestId() {
    return requestId;
  }

  /** The unique request id. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
