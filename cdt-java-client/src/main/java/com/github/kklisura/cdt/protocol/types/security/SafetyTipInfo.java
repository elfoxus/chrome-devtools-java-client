package com.github.kklisura.cdt.protocol.types.security;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class SafetyTipInfo {

  private SafetyTipStatus safetyTipStatus;

  @Optional private String safeUrl;

  /**
   * Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.
   */
  public SafetyTipStatus getSafetyTipStatus() {
    return safetyTipStatus;
  }

  /**
   * Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.
   */
  public void setSafetyTipStatus(SafetyTipStatus safetyTipStatus) {
    this.safetyTipStatus = safetyTipStatus;
  }

  /** The URL the safety tip suggested ("Did you mean?"). Only filled in for lookalike matches. */
  public String getSafeUrl() {
    return safeUrl;
  }

  /** The URL the safety tip suggested ("Did you mean?"). Only filled in for lookalike matches. */
  public void setSafeUrl(String safeUrl) {
    this.safeUrl = safeUrl;
  }
}
