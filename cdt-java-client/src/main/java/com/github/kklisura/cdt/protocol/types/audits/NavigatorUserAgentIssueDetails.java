package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class NavigatorUserAgentIssueDetails {

  private String url;

  @Optional private SourceCodeLocation location;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SourceCodeLocation getLocation() {
    return location;
  }

  public void setLocation(SourceCodeLocation location) {
    this.location = location;
  }
}
