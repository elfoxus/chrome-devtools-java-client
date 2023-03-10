package com.github.kklisura.cdt.protocol.types.audits;

/**
 * This issue tracks client hints related issues. It's used to deprecate old features, encourage the
 * use of new ones, and provide general guidance.
 */
public class ClientHintIssueDetails {

  private SourceCodeLocation sourceCodeLocation;

  private ClientHintIssueReason clientHintIssueReason;

  public SourceCodeLocation getSourceCodeLocation() {
    return sourceCodeLocation;
  }

  public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
    this.sourceCodeLocation = sourceCodeLocation;
  }

  public ClientHintIssueReason getClientHintIssueReason() {
    return clientHintIssueReason;
  }

  public void setClientHintIssueReason(ClientHintIssueReason clientHintIssueReason) {
    this.clientHintIssueReason = clientHintIssueReason;
  }
}
