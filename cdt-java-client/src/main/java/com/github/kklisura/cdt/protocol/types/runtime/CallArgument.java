package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * Represents function call argument. Either remote object id `objectId`, primitive `value`,
 * unserializable primitive value or neither of (for undefined) them should be specified.
 */
public class CallArgument {

  @Optional private Object value;

  @Optional private String unserializableValue;

  @Optional private String objectId;

  /** Primitive value or serializable javascript object. */
  public Object getValue() {
    return value;
  }

  /** Primitive value or serializable javascript object. */
  public void setValue(Object value) {
    this.value = value;
  }

  /** Primitive value which can not be JSON-stringified. */
  public String getUnserializableValue() {
    return unserializableValue;
  }

  /** Primitive value which can not be JSON-stringified. */
  public void setUnserializableValue(String unserializableValue) {
    this.unserializableValue = unserializableValue;
  }

  /** Remote object handle. */
  public String getObjectId() {
    return objectId;
  }

  /** Remote object handle. */
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }
}
