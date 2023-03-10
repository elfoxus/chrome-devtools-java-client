package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Fired when request for resources within a .wbn file failed. */
@Experimental
public class SubresourceWebBundleInnerResponseError {

  private String innerRequestId;

  private String innerRequestURL;

  private String errorMessage;

  @Optional private String bundleRequestId;

  /** Request identifier of the subresource request */
  public String getInnerRequestId() {
    return innerRequestId;
  }

  /** Request identifier of the subresource request */
  public void setInnerRequestId(String innerRequestId) {
    this.innerRequestId = innerRequestId;
  }

  /** URL of the subresource resource. */
  public String getInnerRequestURL() {
    return innerRequestURL;
  }

  /** URL of the subresource resource. */
  public void setInnerRequestURL(String innerRequestURL) {
    this.innerRequestURL = innerRequestURL;
  }

  /** Error message */
  public String getErrorMessage() {
    return errorMessage;
  }

  /** Error message */
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Bundle request identifier. Used to match this information to another event. This made be absent
   * in case when the instrumentation was enabled only after webbundle was parsed.
   */
  public String getBundleRequestId() {
    return bundleRequestId;
  }

  /**
   * Bundle request identifier. Used to match this information to another event. This made be absent
   * in case when the instrumentation was enabled only after webbundle was parsed.
   */
  public void setBundleRequestId(String bundleRequestId) {
    this.bundleRequestId = bundleRequestId;
  }
}
