package com.github.kklisura.cdt.protocol.types.fetch;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.ResourceType;

public class RequestPattern {

  @Optional private String urlPattern;

  @Optional private ResourceType resourceType;

  @Optional private RequestStage requestStage;

  /**
   * Wildcards (`'*'` -> zero or more, `'?'` -> exactly one) are allowed. Escape character is
   * backslash. Omitting is equivalent to `"*"`.
   */
  public String getUrlPattern() {
    return urlPattern;
  }

  /**
   * Wildcards (`'*'` -> zero or more, `'?'` -> exactly one) are allowed. Escape character is
   * backslash. Omitting is equivalent to `"*"`.
   */
  public void setUrlPattern(String urlPattern) {
    this.urlPattern = urlPattern;
  }

  /** If set, only requests for matching resource types will be intercepted. */
  public ResourceType getResourceType() {
    return resourceType;
  }

  /** If set, only requests for matching resource types will be intercepted. */
  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /** Stage at which to begin intercepting requests. Default is Request. */
  public RequestStage getRequestStage() {
    return requestStage;
  }

  /** Stage at which to begin intercepting requests. Default is Request. */
  public void setRequestStage(RequestStage requestStage) {
    this.requestStage = requestStage;
  }
}
