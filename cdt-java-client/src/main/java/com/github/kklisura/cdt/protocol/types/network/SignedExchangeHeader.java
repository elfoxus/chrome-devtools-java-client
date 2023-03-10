package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;
import java.util.Map;

/**
 * Information about a signed exchange header.
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#cbor-representation
 */
@Experimental
public class SignedExchangeHeader {

  private String requestUrl;

  private Integer responseCode;

  private Map<String, Object> responseHeaders;

  private List<SignedExchangeSignature> signatures;

  private String headerIntegrity;

  /** Signed exchange request URL. */
  public String getRequestUrl() {
    return requestUrl;
  }

  /** Signed exchange request URL. */
  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }

  /** Signed exchange response code. */
  public Integer getResponseCode() {
    return responseCode;
  }

  /** Signed exchange response code. */
  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  /** Signed exchange response headers. */
  public Map<String, Object> getResponseHeaders() {
    return responseHeaders;
  }

  /** Signed exchange response headers. */
  public void setResponseHeaders(Map<String, Object> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  /** Signed exchange response signature. */
  public List<SignedExchangeSignature> getSignatures() {
    return signatures;
  }

  /** Signed exchange response signature. */
  public void setSignatures(List<SignedExchangeSignature> signatures) {
    this.signatures = signatures;
  }

  /** Signed exchange header integrity hash in the form of "sha256-<base64-hash-value>". */
  public String getHeaderIntegrity() {
    return headerIntegrity;
  }

  /** Signed exchange header integrity hash in the form of "sha256-<base64-hash-value>". */
  public void setHeaderIntegrity(String headerIntegrity) {
    this.headerIntegrity = headerIntegrity;
  }
}
