package com.github.kklisura.cdt.protocol.events.fetch;

import com.github.kklisura.cdt.protocol.types.fetch.AuthChallenge;
import com.github.kklisura.cdt.protocol.types.network.Request;
import com.github.kklisura.cdt.protocol.types.network.ResourceType;

/**
 * Issued when the domain is enabled with handleAuthRequests set to true. The request is paused
 * until client responds with continueWithAuth.
 */
public class AuthRequired {

  private String requestId;

  private Request request;

  private String frameId;

  private ResourceType resourceType;

  private AuthChallenge authChallenge;

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

  /**
   * Details of the Authorization Challenge encountered. If this is set, client should respond with
   * continueRequest that contains AuthChallengeResponse.
   */
  public AuthChallenge getAuthChallenge() {
    return authChallenge;
  }

  /**
   * Details of the Authorization Challenge encountered. If this is set, client should respond with
   * continueRequest that contains AuthChallengeResponse.
   */
  public void setAuthChallenge(AuthChallenge authChallenge) {
    this.authChallenge = authChallenge;
  }
}
