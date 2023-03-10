package com.github.kklisura.cdt.protocol.events.target;

/** Issued when a target has crashed. */
public class TargetCrashed {

  private String targetId;

  private String status;

  private Integer errorCode;

  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  /** Termination status type. */
  public String getStatus() {
    return status;
  }

  /** Termination status type. */
  public void setStatus(String status) {
    this.status = status;
  }

  /** Termination error code. */
  public Integer getErrorCode() {
    return errorCode;
  }

  /** Termination error code. */
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }
}
