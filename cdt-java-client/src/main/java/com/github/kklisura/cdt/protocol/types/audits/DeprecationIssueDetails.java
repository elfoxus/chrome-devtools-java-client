package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * This issue tracks information needed to print a deprecation message.
 * https://source.chromium.org/chromium/chromium/src/+/main:third_party/blink/renderer/core/frame/third_party/blink/renderer/core/frame/deprecation/README.md
 */
public class DeprecationIssueDetails {

  @Optional private AffectedFrame affectedFrame;

  private SourceCodeLocation sourceCodeLocation;

  private String type;

  public AffectedFrame getAffectedFrame() {
    return affectedFrame;
  }

  public void setAffectedFrame(AffectedFrame affectedFrame) {
    this.affectedFrame = affectedFrame;
  }

  public SourceCodeLocation getSourceCodeLocation() {
    return sourceCodeLocation;
  }

  public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
    this.sourceCodeLocation = sourceCodeLocation;
  }

  /**
   * One of the deprecation names from
   * third_party/blink/renderer/core/frame/deprecation/deprecation.json5
   */
  public String getType() {
    return type;
  }

  /**
   * One of the deprecation names from
   * third_party/blink/renderer/core/frame/deprecation/deprecation.json5
   */
  public void setType(String type) {
    this.type = type;
  }
}
