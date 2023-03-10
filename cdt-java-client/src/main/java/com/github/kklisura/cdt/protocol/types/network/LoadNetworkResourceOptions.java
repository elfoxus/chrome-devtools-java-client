package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** An options object that may be extended later to better support CORS, CORB and streaming. */
@Experimental
public class LoadNetworkResourceOptions {

  private Boolean disableCache;

  private Boolean includeCredentials;

  public Boolean getDisableCache() {
    return disableCache;
  }

  public void setDisableCache(Boolean disableCache) {
    this.disableCache = disableCache;
  }

  public Boolean getIncludeCredentials() {
    return includeCredentials;
  }

  public void setIncludeCredentials(Boolean includeCredentials) {
    this.includeCredentials = includeCredentials;
  }
}
