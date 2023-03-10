package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class ScriptSource {

  private String scriptSource;

  @Optional private String bytecode;

  /** Script source (empty in case of Wasm bytecode). */
  public String getScriptSource() {
    return scriptSource;
  }

  /** Script source (empty in case of Wasm bytecode). */
  public void setScriptSource(String scriptSource) {
    this.scriptSource = scriptSource;
  }

  /** Wasm bytecode. (Encoded as a base64 string when passed over JSON) */
  public String getBytecode() {
    return bytecode;
  }

  /** Wasm bytecode. (Encoded as a base64 string when passed over JSON) */
  public void setBytecode(String bytecode) {
    this.bytecode = bytecode;
  }
}
