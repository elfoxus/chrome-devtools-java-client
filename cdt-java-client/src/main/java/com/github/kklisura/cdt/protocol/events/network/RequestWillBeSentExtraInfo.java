package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.BlockedCookieWithReason;
import com.github.kklisura.cdt.protocol.types.network.ClientSecurityState;
import com.github.kklisura.cdt.protocol.types.network.ConnectTiming;
import java.util.List;
import java.util.Map;

/**
 * Fired when additional information about a requestWillBeSent event is available from the network
 * stack. Not every requestWillBeSent event will have an additional requestWillBeSentExtraInfo fired
 * for it, and there is no guarantee whether requestWillBeSent or requestWillBeSentExtraInfo will be
 * fired first for the same request.
 */
@Experimental
public class RequestWillBeSentExtraInfo {

  private String requestId;

  private List<BlockedCookieWithReason> associatedCookies;

  private Map<String, Object> headers;

  @Experimental private ConnectTiming connectTiming;

  @Optional private ClientSecurityState clientSecurityState;

  @Optional private Boolean siteHasCookieInOtherPartition;

  /** Request identifier. Used to match this information to an existing requestWillBeSent event. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. Used to match this information to an existing requestWillBeSent event. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * A list of cookies potentially associated to the requested URL. This includes both cookies sent
   * with the request and the ones not sent; the latter are distinguished by having blockedReason
   * field set.
   */
  public List<BlockedCookieWithReason> getAssociatedCookies() {
    return associatedCookies;
  }

  /**
   * A list of cookies potentially associated to the requested URL. This includes both cookies sent
   * with the request and the ones not sent; the latter are distinguished by having blockedReason
   * field set.
   */
  public void setAssociatedCookies(List<BlockedCookieWithReason> associatedCookies) {
    this.associatedCookies = associatedCookies;
  }

  /** Raw request headers as they will be sent over the wire. */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /** Raw request headers as they will be sent over the wire. */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /** Connection timing information for the request. */
  public ConnectTiming getConnectTiming() {
    return connectTiming;
  }

  /** Connection timing information for the request. */
  public void setConnectTiming(ConnectTiming connectTiming) {
    this.connectTiming = connectTiming;
  }

  /** The client security state set for the request. */
  public ClientSecurityState getClientSecurityState() {
    return clientSecurityState;
  }

  /** The client security state set for the request. */
  public void setClientSecurityState(ClientSecurityState clientSecurityState) {
    this.clientSecurityState = clientSecurityState;
  }

  /**
   * Whether the site has partitioned cookies stored in a partition different than the current one.
   */
  public Boolean getSiteHasCookieInOtherPartition() {
    return siteHasCookieInOtherPartition;
  }

  /**
   * Whether the site has partitioned cookies stored in a partition different than the current one.
   */
  public void setSiteHasCookieInOtherPartition(Boolean siteHasCookieInOtherPartition) {
    this.siteHasCookieInOtherPartition = siteHasCookieInOtherPartition;
  }
}
