package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Post data entry for HTTP request */
public class PostDataEntry {

  @Optional private String bytes;

  public String getBytes() {
    return bytes;
  }

  public void setBytes(String bytes) {
    this.bytes = bytes;
  }
}
