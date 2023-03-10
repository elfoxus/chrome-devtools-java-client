package com.github.kklisura.cdt.protocol.types.audits;

/**
 * Details for issues about documents in Quirks Mode or Limited Quirks Mode that affects page
 * layouting.
 */
public class QuirksModeIssueDetails {

  private Boolean isLimitedQuirksMode;

  private Integer documentNodeId;

  private String url;

  private String frameId;

  private String loaderId;

  /** If false, it means the document's mode is "quirks" instead of "limited-quirks". */
  public Boolean getIsLimitedQuirksMode() {
    return isLimitedQuirksMode;
  }

  /** If false, it means the document's mode is "quirks" instead of "limited-quirks". */
  public void setIsLimitedQuirksMode(Boolean isLimitedQuirksMode) {
    this.isLimitedQuirksMode = isLimitedQuirksMode;
  }

  public Integer getDocumentNodeId() {
    return documentNodeId;
  }

  public void setDocumentNodeId(Integer documentNodeId) {
    this.documentNodeId = documentNodeId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getFrameId() {
    return frameId;
  }

  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  public String getLoaderId() {
    return loaderId;
  }

  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }
}
