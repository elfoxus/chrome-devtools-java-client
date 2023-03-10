package com.github.kklisura.cdt.protocol.events.cast;

/**
 * This is fired whenever the outstanding issue/error message changes. |issueMessage| is empty if
 * there is no issue.
 */
public class IssueUpdated {

  private String issueMessage;

  public String getIssueMessage() {
    return issueMessage;
  }

  public void setIssueMessage(String issueMessage) {
    this.issueMessage = issueMessage;
  }
}
