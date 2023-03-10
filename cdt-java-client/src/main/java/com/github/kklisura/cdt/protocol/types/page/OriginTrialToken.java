package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class OriginTrialToken {

  private String origin;

  private Boolean matchSubDomains;

  private String trialName;

  private Double expiryTime;

  private Boolean isThirdParty;

  private OriginTrialUsageRestriction usageRestriction;

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Boolean getMatchSubDomains() {
    return matchSubDomains;
  }

  public void setMatchSubDomains(Boolean matchSubDomains) {
    this.matchSubDomains = matchSubDomains;
  }

  public String getTrialName() {
    return trialName;
  }

  public void setTrialName(String trialName) {
    this.trialName = trialName;
  }

  public Double getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(Double expiryTime) {
    this.expiryTime = expiryTime;
  }

  public Boolean getIsThirdParty() {
    return isThirdParty;
  }

  public void setIsThirdParty(Boolean isThirdParty) {
    this.isThirdParty = isThirdParty;
  }

  public OriginTrialUsageRestriction getUsageRestriction() {
    return usageRestriction;
  }

  public void setUsageRestriction(OriginTrialUsageRestriction usageRestriction) {
    this.usageRestriction = usageRestriction;
  }
}
