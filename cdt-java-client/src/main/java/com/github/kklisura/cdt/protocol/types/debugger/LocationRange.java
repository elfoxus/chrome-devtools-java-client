package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Location range within one script. */
@Experimental
public class LocationRange {

  private String scriptId;

  private ScriptPosition start;

  private ScriptPosition end;

  public String getScriptId() {
    return scriptId;
  }

  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  public ScriptPosition getStart() {
    return start;
  }

  public void setStart(ScriptPosition start) {
    this.start = start;
  }

  public ScriptPosition getEnd() {
    return end;
  }

  public void setEnd(ScriptPosition end) {
    this.end = end;
  }
}
