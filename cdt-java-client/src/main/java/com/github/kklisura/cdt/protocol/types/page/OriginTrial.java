package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

@Experimental
public class OriginTrial {

  private String trialName;

  private OriginTrialStatus status;

  private List<OriginTrialTokenWithStatus> tokensWithStatus;

  public String getTrialName() {
    return trialName;
  }

  public void setTrialName(String trialName) {
    this.trialName = trialName;
  }

  public OriginTrialStatus getStatus() {
    return status;
  }

  public void setStatus(OriginTrialStatus status) {
    this.status = status;
  }

  public List<OriginTrialTokenWithStatus> getTokensWithStatus() {
    return tokensWithStatus;
  }

  public void setTokensWithStatus(List<OriginTrialTokenWithStatus> tokensWithStatus) {
    this.tokensWithStatus = tokensWithStatus;
  }
}
