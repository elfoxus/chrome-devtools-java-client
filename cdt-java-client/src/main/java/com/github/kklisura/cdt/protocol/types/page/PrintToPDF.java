package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class PrintToPDF {

  private String data;

  @Experimental @Optional private String stream;

  /**
   * Base64-encoded pdf data. Empty if |returnAsStream| is specified. (Encoded as a base64 string
   * when passed over JSON)
   */
  public String getData() {
    return data;
  }

  /**
   * Base64-encoded pdf data. Empty if |returnAsStream| is specified. (Encoded as a base64 string
   * when passed over JSON)
   */
  public void setData(String data) {
    this.data = data;
  }

  /** A handle of the stream that holds resulting PDF data. */
  public String getStream() {
    return stream;
  }

  /** A handle of the stream that holds resulting PDF data. */
  public void setStream(String stream) {
    this.stream = stream;
  }
}
