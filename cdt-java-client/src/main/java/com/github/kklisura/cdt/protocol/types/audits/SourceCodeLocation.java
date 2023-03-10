package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class SourceCodeLocation {

  @Optional private String scriptId;

  private String url;

  private Integer lineNumber;

  private Integer columnNumber;

  public String getScriptId() {
    return scriptId;
  }

  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public Integer getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }
}
