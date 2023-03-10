package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Details for issues around "Attribution Reporting API" usage. Explainer:
 * https://github.com/WICG/attribution-reporting-api
 */
public class AttributionReportingIssueDetails {

  private AttributionReportingIssueType violationType;

  @Optional private AffectedRequest request;

  @Optional private Integer violatingNodeId;

  @Optional private String invalidParameter;

  public AttributionReportingIssueType getViolationType() {
    return violationType;
  }

  public void setViolationType(AttributionReportingIssueType violationType) {
    this.violationType = violationType;
  }

  public AffectedRequest getRequest() {
    return request;
  }

  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  public Integer getViolatingNodeId() {
    return violatingNodeId;
  }

  public void setViolatingNodeId(Integer violatingNodeId) {
    this.violatingNodeId = violatingNodeId;
  }

  public String getInvalidParameter() {
    return invalidParameter;
  }

  public void setInvalidParameter(String invalidParameter) {
    this.invalidParameter = invalidParameter;
  }
}
