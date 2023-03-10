package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Identifies the bottom-most script which caused the frame to be labelled as an ad. */
@Experimental
public class AdScriptId {

  private String scriptId;

  private String debuggerId;

  /** Script Id of the bottom-most script which caused the frame to be labelled as an ad. */
  public String getScriptId() {
    return scriptId;
  }

  /** Script Id of the bottom-most script which caused the frame to be labelled as an ad. */
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  /** Id of adScriptId's debugger. */
  public String getDebuggerId() {
    return debuggerId;
  }

  /** Id of adScriptId's debugger. */
  public void setDebuggerId(String debuggerId) {
    this.debuggerId = debuggerId;
  }
}
