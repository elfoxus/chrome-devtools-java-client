package com.github.kklisura.cdt.protocol.types.io;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class Read {

  @Optional private Boolean base64Encoded;

  private String data;

  private Boolean eof;

  /** Set if the data is base64-encoded */
  public Boolean getBase64Encoded() {
    return base64Encoded;
  }

  /** Set if the data is base64-encoded */
  public void setBase64Encoded(Boolean base64Encoded) {
    this.base64Encoded = base64Encoded;
  }

  /** Data that were read. */
  public String getData() {
    return data;
  }

  /** Data that were read. */
  public void setData(String data) {
    this.data = data;
  }

  /** Set if the end-of-file condition occurred while reading. */
  public Boolean getEof() {
    return eof;
  }

  /** Set if the end-of-file condition occurred while reading. */
  public void setEof(Boolean eof) {
    this.eof = eof;
  }
}
