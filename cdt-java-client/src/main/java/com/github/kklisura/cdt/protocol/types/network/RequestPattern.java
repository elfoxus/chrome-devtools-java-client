package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Request pattern for interception. */
@Experimental
public class RequestPattern {

  @Optional private String urlPattern;

  @Optional private ResourceType resourceType;

  @Optional private InterceptionStage interceptionStage;

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
  public InterceptionStage getInterceptionStage() {
    return interceptionStage;
  }

  /** Stage at which to begin intercepting requests. Default is Request. */
  public void setInterceptionStage(InterceptionStage interceptionStage) {
    this.interceptionStage = interceptionStage;
  }
}
