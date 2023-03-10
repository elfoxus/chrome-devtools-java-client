package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class MixedContentIssueDetails {

  @Optional private MixedContentResourceType resourceType;

  private MixedContentResolutionStatus resolutionStatus;

  private String insecureURL;

  private String mainResourceURL;

  @Optional private AffectedRequest request;

  @Optional private AffectedFrame frame;

  /**
   * The type of resource causing the mixed content issue (css, js, iframe, form,...). Marked as
   * optional because it is mapped to from blink::mojom::RequestContextType, which will be replaced
   * by network::mojom::RequestDestination
   */
  public MixedContentResourceType getResourceType() {
    return resourceType;
  }

  /**
   * The type of resource causing the mixed content issue (css, js, iframe, form,...). Marked as
   * optional because it is mapped to from blink::mojom::RequestContextType, which will be replaced
   * by network::mojom::RequestDestination
   */
  public void setResourceType(MixedContentResourceType resourceType) {
    this.resourceType = resourceType;
  }

  /** The way the mixed content issue is being resolved. */
  public MixedContentResolutionStatus getResolutionStatus() {
    return resolutionStatus;
  }

  /** The way the mixed content issue is being resolved. */
  public void setResolutionStatus(MixedContentResolutionStatus resolutionStatus) {
    this.resolutionStatus = resolutionStatus;
  }

  /** The unsafe http url causing the mixed content issue. */
  public String getInsecureURL() {
    return insecureURL;
  }

  /** The unsafe http url causing the mixed content issue. */
  public void setInsecureURL(String insecureURL) {
    this.insecureURL = insecureURL;
  }

  /** The url responsible for the call to an unsafe url. */
  public String getMainResourceURL() {
    return mainResourceURL;
  }

  /** The url responsible for the call to an unsafe url. */
  public void setMainResourceURL(String mainResourceURL) {
    this.mainResourceURL = mainResourceURL;
  }

  /** The mixed content request. Does not always exist (e.g. for unsafe form submission urls). */
  public AffectedRequest getRequest() {
    return request;
  }

  /** The mixed content request. Does not always exist (e.g. for unsafe form submission urls). */
  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  /** Optional because not every mixed content issue is necessarily linked to a frame. */
  public AffectedFrame getFrame() {
    return frame;
  }

  /** Optional because not every mixed content issue is necessarily linked to a frame. */
  public void setFrame(AffectedFrame frame) {
    this.frame = frame;
  }
}
