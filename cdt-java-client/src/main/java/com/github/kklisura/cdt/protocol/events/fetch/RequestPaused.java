package com.github.kklisura.cdt.protocol.events.fetch;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.fetch.HeaderEntry;
import com.github.kklisura.cdt.protocol.types.network.ErrorReason;
import com.github.kklisura.cdt.protocol.types.network.Request;
import com.github.kklisura.cdt.protocol.types.network.ResourceType;
import java.util.List;

/**
 * Issued when the domain is enabled and the request URL matches the specified filter. The request
 * is paused until the client responds with one of continueRequest, failRequest or fulfillRequest.
 * The stage of the request can be determined by presence of responseErrorReason and
 * responseStatusCode -- the request is at the response stage if either of these fields is present
 * and in the request stage otherwise.
 */
public class RequestPaused {

  private String requestId;

  private Request request;

  private String frameId;

  private ResourceType resourceType;

  @Optional private ErrorReason responseErrorReason;

  @Optional private Integer responseStatusCode;

  @Optional private String responseStatusText;

  @Optional private List<HeaderEntry> responseHeaders;

  @Optional private String networkId;

  @Experimental @Optional private String redirectedRequestId;

  /** Each request the page makes will have a unique id. */
  public String getRequestId() {
    return requestId;
  }

  /** Each request the page makes will have a unique id. */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** The details of the request. */
  public Request getRequest() {
    return request;
  }

  /** The details of the request. */
  public void setRequest(Request request) {
    this.request = request;
  }

  /** The id of the frame that initiated the request. */
  public String getFrameId() {
    return frameId;
  }

  /** The id of the frame that initiated the request. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** How the requested resource will be used. */
  public ResourceType getResourceType() {
    return resourceType;
  }

  /** How the requested resource will be used. */
  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /** Response error if intercepted at response stage. */
  public ErrorReason getResponseErrorReason() {
    return responseErrorReason;
  }

  /** Response error if intercepted at response stage. */
  public void setResponseErrorReason(ErrorReason responseErrorReason) {
    this.responseErrorReason = responseErrorReason;
  }

  /** Response code if intercepted at response stage. */
  public Integer getResponseStatusCode() {
    return responseStatusCode;
  }

  /** Response code if intercepted at response stage. */
  public void setResponseStatusCode(Integer responseStatusCode) {
    this.responseStatusCode = responseStatusCode;
  }

  /** Response status text if intercepted at response stage. */
  public String getResponseStatusText() {
    return responseStatusText;
  }

  /** Response status text if intercepted at response stage. */
  public void setResponseStatusText(String responseStatusText) {
    this.responseStatusText = responseStatusText;
  }

  /** Response headers if intercepted at the response stage. */
  public List<HeaderEntry> getResponseHeaders() {
    return responseHeaders;
  }

  /** Response headers if intercepted at the response stage. */
  public void setResponseHeaders(List<HeaderEntry> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /**
   * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
   * then this networkId will be the same as the requestId present in the requestWillBeSent event.
   */
  public String getNetworkId() {
    return networkId;
  }

  /**
   * If the intercepted request had a corresponding Network.requestWillBeSent event fired for it,
   * then this networkId will be the same as the requestId present in the requestWillBeSent event.
   */
  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }

  /**
   * If the request is due to a redirect response from the server, the id of the request that has
   * caused the redirect.
   */
  public String getRedirectedRequestId() {
    return redirectedRequestId;
  }

  /**
   * If the request is due to a redirect response from the server, the id of the request that has
   * caused the redirect.
   */
  public void setRedirectedRequestId(String redirectedRequestId) {
    this.redirectedRequestId = redirectedRequestId;
  }
}
