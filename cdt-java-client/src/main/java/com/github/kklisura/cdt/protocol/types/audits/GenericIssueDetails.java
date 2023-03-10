package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Depending on the concrete errorType, different properties are set. */
public class GenericIssueDetails {

  private GenericIssueErrorType errorType;

  @Optional private String frameId;

  @Optional private Integer violatingNodeId;

  /** Issues with the same errorType are aggregated in the frontend. */
  public GenericIssueErrorType getErrorType() {
    return errorType;
  }

  /** Issues with the same errorType are aggregated in the frontend. */
  public void setErrorType(GenericIssueErrorType errorType) {
    this.errorType = errorType;
  }

  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public Integer getViolatingNodeId() {
    return violatingNodeId;
  }

  public void setViolatingNodeId(Integer violatingNodeId) {
    this.violatingNodeId = violatingNodeId;
  }
}
