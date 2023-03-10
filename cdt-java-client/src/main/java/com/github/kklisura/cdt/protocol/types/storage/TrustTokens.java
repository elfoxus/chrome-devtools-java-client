package com.github.kklisura.cdt.protocol.types.storage;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/**
 * Pair of issuer origin and number of available (signed, but not used) Trust Tokens from that
 * issuer.
 */
@Experimental
public class TrustTokens {

  private String issuerOrigin;

  private Double count;

  public String getIssuerOrigin() {
    return issuerOrigin;
  }

  public void setIssuerOrigin(String issuerOrigin) {
    this.issuerOrigin = issuerOrigin;
  }

  public Double getCount() {
    return count;
  }

  public void setCount(Double count) {
    this.count = count;
  }
}
