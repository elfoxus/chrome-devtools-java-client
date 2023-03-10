package com.github.kklisura.cdt.protocol.types.audits;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class EncodedResponse {

  @Optional private String body;

  private Integer originalSize;

  private Integer encodedSize;

  /**
   * The encoded body as a base64 string. Omitted if sizeOnly is true. (Encoded as a base64 string
   * when passed over JSON)
   */
  public String getBody() {
    return body;
  }

  /**
   * The encoded body as a base64 string. Omitted if sizeOnly is true. (Encoded as a base64 string
   * when passed over JSON)
   */
  public void setBody(String body) {
    this.body = body;
  }

  /** Size before re-encoding. */
  public Integer getOriginalSize() {
    return originalSize;
  }

  /** Size before re-encoding. */
  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }

  /** Size after re-encoding. */
  public Integer getEncodedSize() {
    return encodedSize;
  }

  /** Size after re-encoding. */
  public void setEncodedSize(Integer encodedSize) {
    this.encodedSize = encodedSize;
  }
}
