package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.TrustTokenOperationType;

/**
 * Fired exactly once for each Trust Token operation. Depending on the type of the operation and
 * whether the operation succeeded or failed, the event is fired before the corresponding request
 * was sent or after the response was received.
 */
@Experimental
public class TrustTokenOperationDone {

  private TrustTokenOperationDoneStatus status;

  private TrustTokenOperationType type;

  private String requestId;

  @Optional private String topLevelOrigin;

  @Optional private String issuerOrigin;

  @Optional private Integer issuedTokenCount;

  /**
   * Detailed success or error status of the operation. 'AlreadyExists' also signifies a successful
   * operation, as the result of the operation already exists und thus, the operation was abort
   * preemptively (e.g. a cache hit).
   */
  public TrustTokenOperationDoneStatus getStatus() {
    return status;
  }

  /**
   * Detailed success or error status of the operation. 'AlreadyExists' also signifies a successful
   * operation, as the result of the operation already exists und thus, the operation was abort
   * preemptively (e.g. a cache hit).
   */
  public void setStatus(TrustTokenOperationDoneStatus status) {
    this.status = status;
  }

  public TrustTokenOperationType getType() {
    return type;
  }

  public void setType(TrustTokenOperationType type) {
    this.type = type;
  }

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /** Top level origin. The context in which the operation was attempted. */
  public String getTopLevelOrigin() {
    return topLevelOrigin;
  }

  /** Top level origin. The context in which the operation was attempted. */
  public void setTopLevelOrigin(String topLevelOrigin) {
    this.topLevelOrigin = topLevelOrigin;
  }

  /** Origin of the issuer in case of a "Issuance" or "Redemption" operation. */
  public String getIssuerOrigin() {
    return issuerOrigin;
  }

  /** Origin of the issuer in case of a "Issuance" or "Redemption" operation. */
  public void setIssuerOrigin(String issuerOrigin) {
    this.issuerOrigin = issuerOrigin;
  }

  /** The number of obtained Trust Tokens on a successful "Issuance" operation. */
  public Integer getIssuedTokenCount() {
    return issuedTokenCount;
  }

  /** The number of obtained Trust Tokens on a successful "Issuance" operation. */
  public void setIssuedTokenCount(Integer issuedTokenCount) {
    this.issuedTokenCount = issuedTokenCount;
  }
}
