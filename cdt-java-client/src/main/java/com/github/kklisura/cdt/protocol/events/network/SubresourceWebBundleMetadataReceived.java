package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

/**
 * Fired once when parsing the .wbn file has succeeded. The event contains the information about the
 * web bundle contents.
 */
@Experimental
public class SubresourceWebBundleMetadataReceived {

  private String requestId;

  private List<String> urls;

  /** Request identifier. Used to match this information to another event. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. Used to match this information to another event. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** A list of URLs of resources in the subresource Web Bundle. */
  public List<String> getUrls() {
    return urls;
  }

  /** A list of URLs of resources in the subresource Web Bundle. */
  public void setUrls(List<String> urls) {
    this.urls = urls;
  }
}
