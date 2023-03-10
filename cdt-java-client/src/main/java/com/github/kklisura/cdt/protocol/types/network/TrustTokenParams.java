package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Determines what type of Trust Token operation is executed and depending on the type, some
 * additional parameters. The values are specified in
 * third_party/blink/renderer/core/fetch/trust_token.idl.
 */
@Experimental
public class TrustTokenParams {

  private TrustTokenOperationType operation;

  private TrustTokenParamsRefreshPolicy refreshPolicy;

  @Optional private List<String> issuers;

  public TrustTokenOperationType getOperation() {
    return operation;
  }

  public void setOperation(TrustTokenOperationType operation) {
    this.operation = operation;
  }

  /**
   * Only set for "token-redemption" operation and determine whether to request a fresh SRR or use a
   * still valid cached SRR.
   */
  public TrustTokenParamsRefreshPolicy getRefreshPolicy() {
    return refreshPolicy;
  }

  /**
   * Only set for "token-redemption" operation and determine whether to request a fresh SRR or use a
   * still valid cached SRR.
   */
  public void setRefreshPolicy(TrustTokenParamsRefreshPolicy refreshPolicy) {
    this.refreshPolicy = refreshPolicy;
  }

  /** Origins of issuers from whom to request tokens or redemption records. */
  public List<String> getIssuers() {
    return issuers;
  }

  /** Origins of issuers from whom to request tokens or redemption records. */
  public void setIssuers(List<String> issuers) {
    this.issuers = issuers;
  }
}
