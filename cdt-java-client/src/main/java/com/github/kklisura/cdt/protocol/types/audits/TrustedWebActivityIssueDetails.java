package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class TrustedWebActivityIssueDetails {

  private String url;

  private TwaQualityEnforcementViolationType violationType;

  @Optional private Integer httpStatusCode;

  @Optional private String packageName;

  @Optional private String signature;

  /** The url that triggers the violation. */
  public String getUrl() {
    return url;
  }

  /** The url that triggers the violation. */
  public void setUrl(String url) {
    this.url = url;
  }

  public TwaQualityEnforcementViolationType getViolationType() {
    return violationType;
  }

  public void setViolationType(TwaQualityEnforcementViolationType violationType) {
    this.violationType = violationType;
  }

  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /**
   * The package name of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   */
  public String getPackageName() {
    return packageName;
  }

  /**
   * The package name of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   */
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  /**
   * The signature of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   */
  public String getSignature() {
    return signature;
  }

  /**
   * The signature of the Trusted Web Activity client app. This field is only used when violation
   * type is kDigitalAssetLinks.
   */
  public void setSignature(String signature) {
    this.signature = signature;
  }
}
