package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class BreakLocation {

  private String scriptId;

  private Integer lineNumber;

  @Optional private Integer columnNumber;

  @Optional private BreakLocationType type;

  /** Script identifier as reported in the `Debugger.scriptParsed`. */
  public String getScriptId() {
    return scriptId;
  }

  /** Script identifier as reported in the `Debugger.scriptParsed`. */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /** Line number in the script (0-based). */
  public Integer getLineNumber() {
    return lineNumber;
  }

  /** Line number in the script (0-based). */
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /** Column number in the script (0-based). */
  public Integer getColumnNumber() {
    return columnNumber;
  }

  /** Column number in the script (0-based). */
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  public BreakLocationType getType() {
    return type;
  }

  public void setType(BreakLocationType type) {
    this.type = type;
  }
}
