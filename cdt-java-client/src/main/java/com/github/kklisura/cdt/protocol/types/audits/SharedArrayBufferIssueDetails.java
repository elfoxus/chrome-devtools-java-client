package com.github.kklisura.cdt.protocol.types.audits;

/**
 * Details for a issue arising from an SAB being instantiated in, or transferred to a context that
 * is not cross-origin isolated.
 */
public class SharedArrayBufferIssueDetails {

  private SourceCodeLocation sourceCodeLocation;

  private Boolean isWarning;

  private SharedArrayBufferIssueType type;

  public SourceCodeLocation getSourceCodeLocation() {
    return sourceCodeLocation;
  }

  public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
    this.sourceCodeLocation = sourceCodeLocation;
  }

  public Boolean getIsWarning() {
    return isWarning;
  }

  public void setIsWarning(Boolean isWarning) {
    this.isWarning = isWarning;
  }

  public SharedArrayBufferIssueType getType() {
    return type;
  }

  public void setType(SharedArrayBufferIssueType type) {
    this.type = type;
  }
}
