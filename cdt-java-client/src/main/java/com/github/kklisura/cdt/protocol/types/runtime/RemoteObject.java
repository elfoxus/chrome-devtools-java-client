package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Mirror object referencing original JavaScript object. */
public class RemoteObject {

  private RemoteObjectType type;

  @Optional private RemoteObjectSubtype subtype;

  @Optional private String className;

  @Optional private Object value;

  @Optional private String unserializableValue;

  @Optional private String description;

  @Experimental @Optional private WebDriverValue webDriverValue;

  @Optional private String objectId;

  @Experimental @Optional private ObjectPreview preview;

  @Experimental @Optional private CustomPreview customPreview;

  /** Object type. */
  public RemoteObjectType getType() {
    return type;
  }

  /** Object type. */
  public void setType(RemoteObjectType type) {
    this.type = type;
  }

  /**
   * Object subtype hint. Specified for `object` type values only. NOTE: If you change anything
   * here, make sure to also update `subtype` in `ObjectPreview` and `PropertyPreview` below.
   */
  public RemoteObjectSubtype getSubtype() {
    return subtype;
  }

  /**
   * Object subtype hint. Specified for `object` type values only. NOTE: If you change anything
   * here, make sure to also update `subtype` in `ObjectPreview` and `PropertyPreview` below.
   */
  public void setSubtype(RemoteObjectSubtype subtype) {
    this.subtype = subtype;
  }

  /** Object class (constructor) name. Specified for `object` type values only. */
  public String getClassName() {
    return className;
  }

  /** Object class (constructor) name. Specified for `object` type values only. */
  public void setClassName(String className) {
    this.className = className;
  }

  /** Remote object value in case of primitive values or JSON values (if it was requested). */
  public Object getValue() {
    return value;
  }

  /** Remote object value in case of primitive values or JSON values (if it was requested). */
  public void setValue(Object value) {
    this.value = value;
  }

  /**
   * Primitive value which can not be JSON-stringified does not have `value`, but gets this
   * property.
   */
  public String getUnserializableValue() {
    return unserializableValue;
  }

  /**
   * Primitive value which can not be JSON-stringified does not have `value`, but gets this
   * property.
   */
  public void setUnserializableValue(String unserializableValue) {
    this.unserializableValue = unserializableValue;
  }

  /** String representation of the object. */
  public String getDescription() {
    return description;
  }

  /** String representation of the object. */
  public void setDescription(String description) {
    this.description = description;
  }

  /** WebDriver BiDi representation of the value. */
  public WebDriverValue getWebDriverValue() {
    return webDriverValue;
  }

  /** WebDriver BiDi representation of the value. */
  public void setWebDriverValue(WebDriverValue webDriverValue) {
    this.webDriverValue = webDriverValue;
  }

  /** Unique object identifier (for non-primitive values). */
  public String getObjectId() {
    return objectId;
  }

  /** Unique object identifier (for non-primitive values). */
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  /** Preview containing abbreviated property values. Specified for `object` type values only. */
  public ObjectPreview getPreview() {
    return preview;
  }

  /** Preview containing abbreviated property values. Specified for `object` type values only. */
  public void setPreview(ObjectPreview preview) {
    this.preview = preview;
  }

  public CustomPreview getCustomPreview() {
    return customPreview;
  }

  public void setCustomPreview(CustomPreview customPreview) {
    this.customPreview = customPreview;
  }
}
