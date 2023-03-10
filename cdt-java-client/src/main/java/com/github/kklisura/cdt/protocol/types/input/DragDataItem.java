package com.github.kklisura.cdt.protocol.types.input;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class DragDataItem {

  private String mimeType;

  private String data;

  @Optional private String title;

  @Optional private String baseURL;

  /** Mime type of the dragged data. */
  public String getMimeType() {
    return mimeType;
  }

  /** Mime type of the dragged data. */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Depending of the value of `mimeType`, it contains the dragged link, text, HTML markup or any
   * other data.
   */
  public String getData() {
    return data;
  }

  /**
   * Depending of the value of `mimeType`, it contains the dragged link, text, HTML markup or any
   * other data.
   */
  public void setData(String data) {
    this.data = data;
  }

  /** Title associated with a link. Only valid when `mimeType` == "text/uri-list". */
  public String getTitle() {
    return title;
  }

  /** Title associated with a link. Only valid when `mimeType` == "text/uri-list". */
  public void setTitle(String title) {
    this.title = title;
  }

  /** Stores the base URL for the contained markup. Only valid when `mimeType` == "text/html". */
  public String getBaseURL() {
    return baseURL;
  }

  /** Stores the base URL for the contained markup. Only valid when `mimeType` == "text/html". */
  public void setBaseURL(String baseURL) {
    this.baseURL = baseURL;
  }
}
