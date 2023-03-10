package com.github.kklisura.cdt.protocol.types.storage;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Ad advertising element inside an interest group. */
public class InterestGroupAd {

  private String renderUrl;

  @Optional private String metadata;

  public String getRenderUrl() {
    return renderUrl;
  }

  public void setRenderUrl(String renderUrl) {
    this.renderUrl = renderUrl;
  }

  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }
}
