package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.Initiator;
import com.github.kklisura.cdt.protocol.types.network.Request;
import com.github.kklisura.cdt.protocol.types.network.ResourceType;
import com.github.kklisura.cdt.protocol.types.network.Response;

/** Fired when page is about to send HTTP request. */
public class RequestWillBeSent {

  private String requestId;

  private String loaderId;

  private String documentURL;

  private Request request;

  private Double timestamp;

  private Double wallTime;

  private Initiator initiator;

  @Experimental private Boolean redirectHasExtraInfo;

  @Optional private Response redirectResponse;

  @Optional private ResourceType type;

  @Optional private String frameId;

  @Optional private Boolean hasUserGesture;

  /** Request identifier. */
  public String getRequestId() {
    return requestId;
  }

  /** Request identifier. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Loader identifier. Empty string if the request is fetched from worker. */
  public String getLoaderId() {
    return loaderId;
  }

  /** Loader identifier. Empty string if the request is fetched from worker. */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /** URL of the document this request is loaded for. */
  public String getDocumentURL() {
    return documentURL;
  }

  /** URL of the document this request is loaded for. */
  public void setDocumentURL(String documentURL) {
    this.documentURL = documentURL;
  }

  /** Request data. */
  public Request getRequest() {
    return request;
  }

  /** Request data. */
  public void setRequest(Request request) {
    this.request = request;
  }

  /** Timestamp. */
  public Double getTimestamp() {
    return timestamp;
  }

  /** Timestamp. */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  /** Timestamp. */
  public Double getWallTime() {
    return wallTime;
  }

  /** Timestamp. */
  public void setWallTime(Double wallTime) {
    this.wallTime = wallTime;
  }

  /** Request initiator. */
  public Initiator getInitiator() {
    return initiator;
  }

  /** Request initiator. */
  public void setInitiator(Initiator initiator) {
    this.initiator = initiator;
  }

  /**
   * In the case that redirectResponse is populated, this flag indicates whether
   * requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or were emitted for the
   * request which was just redirected.
   */
  public Boolean getRedirectHasExtraInfo() {
    return redirectHasExtraInfo;
  }

  /**
   * In the case that redirectResponse is populated, this flag indicates whether
   * requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or were emitted for the
   * request which was just redirected.
   */
  public void setRedirectHasExtraInfo(Boolean redirectHasExtraInfo) {
    this.redirectHasExtraInfo = redirectHasExtraInfo;
  }

  /** Redirect response data. */
  public Response getRedirectResponse() {
    return redirectResponse;
  }

  /** Redirect response data. */
  public void setRedirectResponse(Response redirectResponse) {
    this.redirectResponse = redirectResponse;
  }

  /** Type of this resource. */
  public ResourceType getType() {
    return type;
  }

  /** Type of this resource. */
  public void setType(ResourceType type) {
    this.type = type;
  }

  /** Frame identifier. */
  public String getFrameId() {
    return frameId;
  }

  /** Frame identifier. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Whether the request is initiated by a user gesture. Defaults to false. */
  public Boolean getHasUserGesture() {
    return hasUserGesture;
  }

  /** Whether the request is initiated by a user gesture. Defaults to false. */
  public void setHasUserGesture(Boolean hasUserGesture) {
    this.hasUserGesture = hasUserGesture;
  }
}
