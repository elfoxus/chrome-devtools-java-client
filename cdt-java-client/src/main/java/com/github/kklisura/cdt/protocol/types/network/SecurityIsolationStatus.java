package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class SecurityIsolationStatus {

  @Optional private CrossOriginOpenerPolicyStatus coop;

  @Optional private CrossOriginEmbedderPolicyStatus coep;

  public CrossOriginOpenerPolicyStatus getCoop() {
    return coop;
  }

  public void setCoop(CrossOriginOpenerPolicyStatus coop) {
    this.coop = coop;
  }

  public CrossOriginEmbedderPolicyStatus getCoep() {
    return coep;
  }

  public void setCoep(CrossOriginEmbedderPolicyStatus coep) {
    this.coep = coep;
  }
}
