package com.github.kklisura.cdt.protocol.events.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.network.ReportingApiEndpoint;
import java.util.List;

@Experimental
public class ReportingApiEndpointsChangedForOrigin {

  private String origin;

  private List<ReportingApiEndpoint> endpoints;

  /** Origin of the document(s) which configured the endpoints. */
  public String getOrigin() {
    return origin;
  }

  /** Origin of the document(s) which configured the endpoints. */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public List<ReportingApiEndpoint> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<ReportingApiEndpoint> endpoints) {
    this.endpoints = endpoints;
  }
}
