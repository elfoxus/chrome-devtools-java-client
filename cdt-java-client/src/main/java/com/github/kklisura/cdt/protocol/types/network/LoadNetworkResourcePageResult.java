package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.Map;

/** An object providing the result of a network resource load. */
@Experimental
public class LoadNetworkResourcePageResult {

  private Boolean success;

  @Optional private Double netError;

  @Optional private String netErrorName;

  @Optional private Double httpStatusCode;

  @Optional private String stream;

  @Optional private Map<String, Object> headers;

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /** Optional values used for error reporting. */
  public Double getNetError() {
    return netError;
  }

  /** Optional values used for error reporting. */
  public void setNetError(Double netError) {
    this.netError = netError;
  }

  public String getNetErrorName() {
    return netErrorName;
  }

  public void setNetErrorName(String netErrorName) {
    this.netErrorName = netErrorName;
  }

  public Double getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Double httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  /** If successful, one of the following two fields holds the result. */
  public String getStream() {
    return stream;
  }

  /** If successful, one of the following two fields holds the result. */
  public void setStream(String stream) {
    this.stream = stream;
  }

  /** Response headers. */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /** Response headers. */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }
}
