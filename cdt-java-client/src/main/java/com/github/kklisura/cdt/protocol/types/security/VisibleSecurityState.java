package com.github.kklisura.cdt.protocol.types.security;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Security state information about the page. */
@Experimental
public class VisibleSecurityState {

  private SecurityState securityState;

  @Optional private CertificateSecurityState certificateSecurityState;

  @Optional private SafetyTipInfo safetyTipInfo;

  private List<String> securityStateIssueIds;

  /** The security level of the page. */
  public SecurityState getSecurityState() {
    return securityState;
  }

  /** The security level of the page. */
  public void setSecurityState(SecurityState securityState) {
    this.securityState = securityState;
  }

  /** Security state details about the page certificate. */
  public CertificateSecurityState getCertificateSecurityState() {
    return certificateSecurityState;
  }

  /** Security state details about the page certificate. */
  public void setCertificateSecurityState(CertificateSecurityState certificateSecurityState) {
    this.certificateSecurityState = certificateSecurityState;
  }

  /**
   * The type of Safety Tip triggered on the page. Note that this field will be set even if the
   * Safety Tip UI was not actually shown.
   */
  public SafetyTipInfo getSafetyTipInfo() {
    return safetyTipInfo;
  }

  /**
   * The type of Safety Tip triggered on the page. Note that this field will be set even if the
   * Safety Tip UI was not actually shown.
   */
  public void setSafetyTipInfo(SafetyTipInfo safetyTipInfo) {
    this.safetyTipInfo = safetyTipInfo;
  }

  /** Array of security state issues ids. */
  public List<String> getSecurityStateIssueIds() {
    return securityStateIssueIds;
  }

  /** Array of security state issues ids. */
  public void setSecurityStateIssueIds(List<String> securityStateIssueIds) {
    this.securityStateIssueIds = securityStateIssueIds;
  }
}
