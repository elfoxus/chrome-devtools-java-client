package com.github.kklisura.cdt.protocol.types.security;

/** Information about insecure content on the page. */
@Deprecated
public class InsecureContentStatus {

  private Boolean ranMixedContent;

  private Boolean displayedMixedContent;

  private Boolean containedMixedForm;

  private Boolean ranContentWithCertErrors;

  private Boolean displayedContentWithCertErrors;

  private SecurityState ranInsecureContentStyle;

  private SecurityState displayedInsecureContentStyle;

  /** Always false. */
  public Boolean getRanMixedContent() {
    return ranMixedContent;
  }

  /** Always false. */
  public void setRanMixedContent(Boolean ranMixedContent) {
    this.ranMixedContent = ranMixedContent;
  }

  /** Always false. */
  public Boolean getDisplayedMixedContent() {
    return displayedMixedContent;
  }

  /** Always false. */
  public void setDisplayedMixedContent(Boolean displayedMixedContent) {
    this.displayedMixedContent = displayedMixedContent;
  }

  /** Always false. */
  public Boolean getContainedMixedForm() {
    return containedMixedForm;
  }

  /** Always false. */
  public void setContainedMixedForm(Boolean containedMixedForm) {
    this.containedMixedForm = containedMixedForm;
  }

  /** Always false. */
  public Boolean getRanContentWithCertErrors() {
    return ranContentWithCertErrors;
  }

  /** Always false. */
  public void setRanContentWithCertErrors(Boolean ranContentWithCertErrors) {
    this.ranContentWithCertErrors = ranContentWithCertErrors;
  }

  /** Always false. */
  public Boolean getDisplayedContentWithCertErrors() {
    return displayedContentWithCertErrors;
  }

  /** Always false. */
  public void setDisplayedContentWithCertErrors(Boolean displayedContentWithCertErrors) {
    this.displayedContentWithCertErrors = displayedContentWithCertErrors;
  }

  /** Always set to unknown. */
  public SecurityState getRanInsecureContentStyle() {
    return ranInsecureContentStyle;
  }

  /** Always set to unknown. */
  public void setRanInsecureContentStyle(SecurityState ranInsecureContentStyle) {
    this.ranInsecureContentStyle = ranInsecureContentStyle;
  }

  /** Always set to unknown. */
  public SecurityState getDisplayedInsecureContentStyle() {
    return displayedInsecureContentStyle;
  }

  /** Always set to unknown. */
  public void setDisplayedInsecureContentStyle(SecurityState displayedInsecureContentStyle) {
    this.displayedInsecureContentStyle = displayedInsecureContentStyle;
  }
}
