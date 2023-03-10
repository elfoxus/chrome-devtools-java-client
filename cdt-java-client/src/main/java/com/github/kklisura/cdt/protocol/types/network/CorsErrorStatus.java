package com.github.kklisura.cdt.protocol.types.network;

public class CorsErrorStatus {

  private CorsError corsError;

  private String failedParameter;

  public CorsError getCorsError() {
    return corsError;
  }

  public void setCorsError(CorsError corsError) {
    this.corsError = corsError;
  }

  public String getFailedParameter() {
    return failedParameter;
  }

  public void setFailedParameter(String failedParameter) {
    this.failedParameter = failedParameter;
  }
}
