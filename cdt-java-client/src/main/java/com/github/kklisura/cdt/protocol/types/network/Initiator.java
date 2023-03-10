package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.runtime.StackTrace;

/** Information about the request initiator. */
public class Initiator {

  private InitiatorType type;

  @Optional private StackTrace stack;

  @Optional private String url;

  @Optional private Double lineNumber;

  @Optional private Double columnNumber;

  @Optional private String requestId;

  /** Type of this initiator. */
  public InitiatorType getType() {
    return type;
  }

  /** Type of this initiator. */
  public void setType(InitiatorType type) {
    this.type = type;
  }

  /** Initiator JavaScript stack trace, set for Script only. */
  public StackTrace getStack() {
    return stack;
  }

  /** Initiator JavaScript stack trace, set for Script only. */
  public void setStack(StackTrace stack) {
    this.stack = stack;
  }

  /**
   * Initiator URL, set for Parser type or for Script type (when script is importing module) or for
   * SignedExchange type.
   */
  public String getUrl() {
    return url;
  }

  /**
   * Initiator URL, set for Parser type or for Script type (when script is importing module) or for
   * SignedExchange type.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Initiator line number, set for Parser type or for Script type (when script is importing module)
   * (0-based).
   */
  public Double getLineNumber() {
    return lineNumber;
  }

  /**
   * Initiator line number, set for Parser type or for Script type (when script is importing module)
   * (0-based).
   */
  public void setLineNumber(Double lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Initiator column number, set for Parser type or for Script type (when script is importing
   * module) (0-based).
   */
  public Double getColumnNumber() {
    return columnNumber;
  }

  /**
   * Initiator column number, set for Parser type or for Script type (when script is importing
   * module) (0-based).
   */
  public void setColumnNumber(Double columnNumber) {
    this.columnNumber = columnNumber;
  }

  /** Set if another request triggered this request (e.g. preflight). */
  public String getRequestId() {
    return requestId;
  }

  /** Set if another request triggered this request (e.g. preflight). */
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
}
