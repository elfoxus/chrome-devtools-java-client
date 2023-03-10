package com.github.kklisura.cdt.protocol.types.indexeddb;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Key path. */
public class KeyPath {

  private KeyPathType type;

  @Optional private String string;

  @Optional private List<String> array;

  /** Key path type. */
  public KeyPathType getType() {
    return type;
  }

  /** Key path type. */
  public void setType(KeyPathType type) {
    this.type = type;
  }

  /** String value. */
  public String getString() {
    return string;
  }

  /** String value. */
  public void setString(String string) {
    this.string = string;
  }

  /** Array value. */
  public List<String> getArray() {
    return array;
  }

  /** Array value. */
  public void setArray(List<String> array) {
    this.array = array;
  }
}
