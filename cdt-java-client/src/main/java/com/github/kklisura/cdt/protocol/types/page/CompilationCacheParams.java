package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Per-script compilation cache parameters for `Page.produceCompilationCache` */
@Experimental
public class CompilationCacheParams {

  private String url;

  @Optional private Boolean eager;

  /** The URL of the script to produce a compilation cache entry for. */
  public String getUrl() {
    return url;
  }

  /** The URL of the script to produce a compilation cache entry for. */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * A hint to the backend whether eager compilation is recommended. (the actual compilation mode
   * used is upon backend discretion).
   */
  public Boolean getEager() {
    return eager;
  }

  /**
   * A hint to the backend whether eager compilation is recommended. (the actual compilation mode
   * used is upon backend discretion).
   */
  public void setEager(Boolean eager) {
    this.eager = eager;
  }
}
