package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Represents the value serialiazed by the WebDriver BiDi specification
 * https://w3c.github.io/webdriver-bidi.
 */
public class WebDriverValue {

  private WebDriverValueType type;

  @Optional private Object value;

  @Optional private String objectId;

  public WebDriverValueType getType() {
    return type;
  }

  public void setType(WebDriverValueType type) {
    this.type = type;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }
}
