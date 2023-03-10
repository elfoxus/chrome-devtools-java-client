package com.github.kklisura.cdt.protocol.events.security;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.security.InsecureContentStatus;
import com.github.kklisura.cdt.protocol.types.security.SecurityState;
import com.github.kklisura.cdt.protocol.types.security.SecurityStateExplanation;
import java.util.List;

/** The security state of the page changed. No longer being sent. */
@Deprecated
public class SecurityStateChanged {

  private SecurityState securityState;

  @Deprecated private Boolean schemeIsCryptographic;

  @Deprecated private List<SecurityStateExplanation> explanations;

  @Deprecated private InsecureContentStatus insecureContentStatus;

  @Deprecated @Optional private String summary;

  /** Security state. */
  public SecurityState getSecurityState() {
    return securityState;
  }

  /** Security state. */
  public void setSecurityState(SecurityState securityState) {
    this.securityState = securityState;
  }

  /** True if the page was loaded over cryptographic transport such as HTTPS. */
  public Boolean getSchemeIsCryptographic() {
    return schemeIsCryptographic;
  }

  /** True if the page was loaded over cryptographic transport such as HTTPS. */
  public void setSchemeIsCryptographic(Boolean schemeIsCryptographic) {
    this.schemeIsCryptographic = schemeIsCryptographic;
  }

  /** Previously a list of explanations for the security state. Now always empty. */
  public List<SecurityStateExplanation> getExplanations() {
    return explanations;
  }

  /** Previously a list of explanations for the security state. Now always empty. */
  public void setExplanations(List<SecurityStateExplanation> explanations) {
    this.explanations = explanations;
  }

  /** Information about insecure content on the page. */
  public InsecureContentStatus getInsecureContentStatus() {
    return insecureContentStatus;
  }

  /** Information about insecure content on the page. */
  public void setInsecureContentStatus(InsecureContentStatus insecureContentStatus) {
    this.insecureContentStatus = insecureContentStatus;
  }

  /** Overrides user-visible description of the state. Always omitted. */
  public String getSummary() {
    return summary;
  }

  /** Overrides user-visible description of the state. Always omitted. */
  public void setSummary(String summary) {
    this.summary = summary;
  }
}
