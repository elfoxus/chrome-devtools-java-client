package com.github.kklisura.cdt.protocol.types.audits;

public class FederatedAuthRequestIssueDetails {

  private FederatedAuthRequestIssueReason federatedAuthRequestIssueReason;

  public FederatedAuthRequestIssueReason getFederatedAuthRequestIssueReason() {
    return federatedAuthRequestIssueReason;
  }

  public void setFederatedAuthRequestIssueReason(
      FederatedAuthRequestIssueReason federatedAuthRequestIssueReason) {
    this.federatedAuthRequestIssueReason = federatedAuthRequestIssueReason;
  }
}
