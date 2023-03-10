package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Information about a signed exchange response. */
@Experimental
public class SignedExchangeError {

  private String message;

  @Optional private Integer signatureIndex;

  @Optional private SignedExchangeErrorField errorField;

  /** Error message. */
  public String getMessage() {
    return message;
  }

  /** Error message. */
  public void setMessage(String message) {
    this.message = message;
  }

  /** The index of the signature which caused the error. */
  public Integer getSignatureIndex() {
    return signatureIndex;
  }

  /** The index of the signature which caused the error. */
  public void setSignatureIndex(Integer signatureIndex) {
    this.signatureIndex = signatureIndex;
  }

  /** The field which caused the error. */
  public SignedExchangeErrorField getErrorField() {
    return errorField;
  }

  /** The field which caused the error. */
  public void setErrorField(SignedExchangeErrorField errorField) {
    this.errorField = errorField;
  }
}
