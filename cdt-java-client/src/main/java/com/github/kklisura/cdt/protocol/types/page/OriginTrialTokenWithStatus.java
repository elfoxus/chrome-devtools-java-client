package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class OriginTrialTokenWithStatus {

  private String rawTokenText;

  @Optional private OriginTrialToken parsedToken;

  private OriginTrialTokenStatus status;

  public String getRawTokenText() {
    return rawTokenText;
  }

  public void setRawTokenText(String rawTokenText) {
    this.rawTokenText = rawTokenText;
  }

  /** `parsedToken` is present only when the token is extractable and parsable. */
  public OriginTrialToken getParsedToken() {
    return parsedToken;
  }

  /** `parsedToken` is present only when the token is extractable and parsable. */
  public void setParsedToken(OriginTrialToken parsedToken) {
    this.parsedToken = parsedToken;
  }

  public OriginTrialTokenStatus getStatus() {
    return status;
  }

  public void setStatus(OriginTrialTokenStatus status) {
    this.status = status;
  }
}
