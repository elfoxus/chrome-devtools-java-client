package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** An inspector issue reported from the back-end. */
public class InspectorIssue {

  private InspectorIssueCode code;

  private InspectorIssueDetails details;

  @Optional private String issueId;

  public InspectorIssueCode getCode() {
    return code;
  }

  public void setCode(InspectorIssueCode code) {
    this.code = code;
  }

  public InspectorIssueDetails getDetails() {
    return details;
  }

  public void setDetails(InspectorIssueDetails details) {
    this.details = details;
  }

  /**
   * A unique id for this issue. May be omitted if no other entity (e.g. exception, CDP message,
   * etc.) is referencing this issue.
   */
  public String getIssueId() {
    return issueId;
  }

  /**
   * A unique id for this issue. May be omitted if no other entity (e.g. exception, CDP message,
   * etc.) is referencing this issue.
   */
  public void setIssueId(String issueId) {
    this.issueId = issueId;
  }
}
