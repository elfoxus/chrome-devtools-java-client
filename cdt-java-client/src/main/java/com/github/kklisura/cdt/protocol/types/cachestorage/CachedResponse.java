package com.github.kklisura.cdt.protocol.types.cachestorage;

/** Cached response */
public class CachedResponse {

  private String body;

  /** Entry content, base64-encoded. (Encoded as a base64 string when passed over JSON) */
  public String getBody() {
    return body;
  }

  /** Entry content, base64-encoded. (Encoded as a base64 string when passed over JSON) */
  public void setBody(String body) {
    this.body = body;
  }
}
