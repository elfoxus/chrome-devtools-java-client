package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Parsed app manifest properties. */
@Experimental
public class AppManifestParsedProperties {

  private String scope;

  /** Computed scope value */
  public String getScope() {
    return scope;
  }

  /** Computed scope value */
  public void setScope(String scope) {
    this.scope = scope;
  }
}
