package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class ContentSecurityPolicyIssueDetails {

  @Optional private String blockedURL;

  private String violatedDirective;

  private Boolean isReportOnly;

  private ContentSecurityPolicyViolationType contentSecurityPolicyViolationType;

  @Optional private AffectedFrame frameAncestor;

  @Optional private SourceCodeLocation sourceCodeLocation;

  @Optional private Integer violatingNodeId;

  /** The url not included in allowed sources. */
  public String getBlockedURL() {
    return blockedURL;
  }

  /** The url not included in allowed sources. */
  public void setBlockedURL(String blockedURL) {
    this.blockedURL = blockedURL;
  }

  /** Specific directive that is violated, causing the CSP issue. */
  public String getViolatedDirective() {
    return violatedDirective;
  }

  /** Specific directive that is violated, causing the CSP issue. */
  public void setViolatedDirective(String violatedDirective) {
    this.violatedDirective = violatedDirective;
  }

  public Boolean getIsReportOnly() {
    return isReportOnly;
  }

  public void setIsReportOnly(Boolean isReportOnly) {
    this.isReportOnly = isReportOnly;
  }

  public ContentSecurityPolicyViolationType getContentSecurityPolicyViolationType() {
    return contentSecurityPolicyViolationType;
  }

  public void setContentSecurityPolicyViolationType(
      ContentSecurityPolicyViolationType contentSecurityPolicyViolationType) {
    this.contentSecurityPolicyViolationType = contentSecurityPolicyViolationType;
  }

  public AffectedFrame getFrameAncestor() {
    return frameAncestor;
  }

  public void setFrameAncestor(AffectedFrame frameAncestor) {
    this.frameAncestor = frameAncestor;
  }

  public SourceCodeLocation getSourceCodeLocation() {
    return sourceCodeLocation;
  }

  public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
    this.sourceCodeLocation = sourceCodeLocation;
  }

  public Integer getViolatingNodeId() {
    return violatingNodeId;
  }

  public void setViolatingNodeId(Integer violatingNodeId) {
    this.violatingNodeId = violatingNodeId;
  }
}
