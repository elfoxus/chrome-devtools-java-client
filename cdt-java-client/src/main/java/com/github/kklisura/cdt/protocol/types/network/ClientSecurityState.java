package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class ClientSecurityState {

  private Boolean initiatorIsSecureContext;

  private IPAddressSpace initiatorIPAddressSpace;

  private PrivateNetworkRequestPolicy privateNetworkRequestPolicy;

  public Boolean getInitiatorIsSecureContext() {
    return initiatorIsSecureContext;
  }

  public void setInitiatorIsSecureContext(Boolean initiatorIsSecureContext) {
    this.initiatorIsSecureContext = initiatorIsSecureContext;
  }

  public IPAddressSpace getInitiatorIPAddressSpace() {
    return initiatorIPAddressSpace;
  }

  public void setInitiatorIPAddressSpace(IPAddressSpace initiatorIPAddressSpace) {
    this.initiatorIPAddressSpace = initiatorIPAddressSpace;
  }

  public PrivateNetworkRequestPolicy getPrivateNetworkRequestPolicy() {
    return privateNetworkRequestPolicy;
  }

  public void setPrivateNetworkRequestPolicy(
      PrivateNetworkRequestPolicy privateNetworkRequestPolicy) {
    this.privateNetworkRequestPolicy = privateNetworkRequestPolicy;
  }
}
