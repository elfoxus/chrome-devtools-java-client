package com.github.kklisura.cdt.protocol.events.audits;

import com.github.kklisura.cdt.protocol.types.audits.InspectorIssue;

public class IssueAdded {

  private InspectorIssue issue;

  public InspectorIssue getIssue() {
    return issue;
  }

  public void setIssue(InspectorIssue issue) {
    this.issue = issue;
  }
}
