package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class ReportingApiEndpoint {

  private String url;

  private String groupName;

  /** The URL of the endpoint to which reports may be delivered. */
  public String getUrl() {
    return url;
  }

  /** The URL of the endpoint to which reports may be delivered. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Name of the endpoint group. */
  public String getGroupName() {
    return groupName;
  }

  /** Name of the endpoint group. */
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }
}
