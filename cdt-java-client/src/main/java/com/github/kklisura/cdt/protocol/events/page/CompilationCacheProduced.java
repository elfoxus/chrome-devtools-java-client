package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/**
 * Issued for every compilation cache generated. Is only available if
 * Page.setGenerateCompilationCache is enabled.
 */
@Experimental
public class CompilationCacheProduced {

  private String url;

  private String data;

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Base64-encoded data (Encoded as a base64 string when passed over JSON) */
  public String getData() {
    return data;
  }

  /** Base64-encoded data (Encoded as a base64 string when passed over JSON) */
  public void setData(String data) {
    this.data = data;
  }
}
