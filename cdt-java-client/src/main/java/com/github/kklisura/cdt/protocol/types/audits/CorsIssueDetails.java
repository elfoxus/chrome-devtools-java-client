package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.network.ClientSecurityState;
import com.github.kklisura.cdt.protocol.types.network.CorsErrorStatus;
import com.github.kklisura.cdt.protocol.types.network.IPAddressSpace;

/**
 * Details for a CORS related issue, e.g. a warning or error related to CORS RFC1918 enforcement.
 */
public class CorsIssueDetails {

  private CorsErrorStatus corsErrorStatus;

  private Boolean isWarning;

  private AffectedRequest request;

  @Optional private SourceCodeLocation location;

  @Optional private String initiatorOrigin;

  @Optional private IPAddressSpace resourceIPAddressSpace;

  @Optional private ClientSecurityState clientSecurityState;

  public CorsErrorStatus getCorsErrorStatus() {
    return corsErrorStatus;
  }

  public void setCorsErrorStatus(CorsErrorStatus corsErrorStatus) {
    this.corsErrorStatus = corsErrorStatus;
  }

  public Boolean getIsWarning() {
    return isWarning;
  }

  public void setIsWarning(Boolean isWarning) {
    this.isWarning = isWarning;
  }

  public AffectedRequest getRequest() {
    return request;
  }

  public void setRequest(AffectedRequest request) {
    this.request = request;
  }

  public SourceCodeLocation getLocation() {
    return location;
  }

  public void setLocation(SourceCodeLocation location) {
    this.location = location;
  }

  public String getInitiatorOrigin() {
    return initiatorOrigin;
  }

  public void setInitiatorOrigin(String initiatorOrigin) {
    this.initiatorOrigin = initiatorOrigin;
  }

  public IPAddressSpace getResourceIPAddressSpace() {
    return resourceIPAddressSpace;
  }

  public void setResourceIPAddressSpace(IPAddressSpace resourceIPAddressSpace) {
    this.resourceIPAddressSpace = resourceIPAddressSpace;
  }

  public ClientSecurityState getClientSecurityState() {
    return clientSecurityState;
  }

  public void setClientSecurityState(ClientSecurityState clientSecurityState) {
    this.clientSecurityState = clientSecurityState;
  }
}
