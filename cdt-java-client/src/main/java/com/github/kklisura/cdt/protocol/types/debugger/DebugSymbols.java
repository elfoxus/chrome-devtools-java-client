package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Debug symbols available for a wasm script. */
public class DebugSymbols {

  private DebugSymbolsType type;

  @Optional private String externalURL;

  /** Type of the debug symbols. */
  public DebugSymbolsType getType() {
    return type;
  }

  /** Type of the debug symbols. */
  public void setType(DebugSymbolsType type) {
    this.type = type;
  }

  /** URL of the external symbol source. */
  public String getExternalURL() {
    return externalURL;
  }

  /** URL of the external symbol source. */
  public void setExternalURL(String externalURL) {
    this.externalURL = externalURL;
  }
}
