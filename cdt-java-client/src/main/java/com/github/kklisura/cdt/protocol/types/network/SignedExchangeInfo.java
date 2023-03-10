package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Information about a signed exchange response. */
@Experimental
public class SignedExchangeInfo {

  private Response outerResponse;

  @Optional private SignedExchangeHeader header;

  @Optional private SecurityDetails securityDetails;

  @Optional private List<SignedExchangeError> errors;

  /** The outer response of signed HTTP exchange which was received from network. */
  public Response getOuterResponse() {
    return outerResponse;
  }

  /** The outer response of signed HTTP exchange which was received from network. */
  public void setOuterResponse(Response outerResponse) {
    this.outerResponse = outerResponse;
  }

  /** Information about the signed exchange header. */
  public SignedExchangeHeader getHeader() {
    return header;
  }

  /** Information about the signed exchange header. */
  public void setHeader(SignedExchangeHeader header) {
    this.header = header;
  }

  /** Security details for the signed exchange header. */
  public SecurityDetails getSecurityDetails() {
    return securityDetails;
  }

  /** Security details for the signed exchange header. */
  public void setSecurityDetails(SecurityDetails securityDetails) {
    this.securityDetails = securityDetails;
  }

  /** Errors occurred while handling the signed exchagne. */
  public List<SignedExchangeError> getErrors() {
    return errors;
  }

  /** Errors occurred while handling the signed exchagne. */
  public void setErrors(List<SignedExchangeError> errors) {
    this.errors = errors;
  }
}
