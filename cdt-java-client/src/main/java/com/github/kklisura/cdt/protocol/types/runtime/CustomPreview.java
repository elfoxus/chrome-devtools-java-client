package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class CustomPreview {

  private String header;

  @Optional private String bodyGetterId;

  /**
   * The JSON-stringified result of formatter.header(object, config) call. It contains json ML array
   * that represents RemoteObject.
   */
  public String getHeader() {
    return header;
  }

  /**
   * The JSON-stringified result of formatter.header(object, config) call. It contains json ML array
   * that represents RemoteObject.
   */
  public void setHeader(String header) {
    this.header = header;
  }

  /**
   * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will contain
   * RemoteObjectId for the function that returns result of formatter.body(object, config) call. The
   * result value is json ML array.
   */
  public String getBodyGetterId() {
    return bodyGetterId;
  }

  /**
   * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will contain
   * RemoteObjectId for the function that returns result of formatter.body(object, config) call. The
   * result value is json ML array.
   */
  public void setBodyGetterId(String bodyGetterId) {
    this.bodyGetterId = bodyGetterId;
  }
}
